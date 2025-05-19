package com.javaex.ex03;

public class LowerThread extends Thread {
	//필드
	//생성자
	//메소드 gs
	
	//메소드 일반
	//소문자출력
	public void run() {
		for(char ch='a'; ch<='z'; ch++) {
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
