package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {
		
		//서버 소켓 생성
		ServerSocket serverSocket = new ServerSocket();
		
		//bind
		/*
		InetSocketAddress ipport = new InetSocketAddress("192.168.0.99",10001);
		serverSocket.bind(ipport);
		*/
		serverSocket.bind(new InetSocketAddress("192.168.0.99",10001));
		
		//서버 시작
		System.out.println("<서버 시작>");
		System.out.println("=====================================");
		System.out.println("[연결을 기다리고 있습니다]");
		
		//클라이언트가 연결되면 accept()가 실행된다
		Socket socket = serverSocket.accept();
		System.out.println("클라이언트가 연결 되었습니다");
		
		//읽기 스트림
		//InputStream in = new FileInputStream("C:\\javaStudy\\MS949.txt");
		InputStream in = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		//쓰기 스트림
		OutputStream out = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		//스캐너 준비
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//메세지 받기
			String msg = br.readLine();
			
			System.out.println("클라이언트로부터 받은 메시지: "+msg);
			
			if("/q".equals(msg)) {
				break;
			}
			
			//메시지 키보드로 입력받기
			String msg2 = sc.nextLine();
			
			//메시지 보내기
			bw.write(msg2);
			bw.newLine();
			bw.flush();
			System.out.println("클라이언트로 보낸 메시지: "+msg2);
			
			if(msg2 == null) {
				break;
			}
			
			if("/q".equals(msg2)) {
				break;
			}
		}
		
		System.out.println("=====================================");
		System.out.println("<서버 종료>");
		
		//자원정리
		sc.close();
		br.close();
		bw.close();
		socket.close();
		serverSocket.close();

	}

}
