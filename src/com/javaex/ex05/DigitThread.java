package com.javaex.ex05;

public class DigitThread implements Runnable {
	//필드
	//생성자
	//메소드 gs
	
	//메소드 일반
	//숫자출력
	public void run() {
		for(int i=1; i<=30; i++) {
			System.out.println(i);
			//1초대기
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	

}
