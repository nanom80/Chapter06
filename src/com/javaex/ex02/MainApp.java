package com.javaex.ex02;

public class MainApp {
	
	public static void main(String[] args) {
		
		//멀티스레드
		
		//숫자출력
		DigitThread dt = new DigitThread();
		dt.start(); //run 메소드를 작성하고 start()를 실행해야 한다
		
		//문자출력
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			//1초대기
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
