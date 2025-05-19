package com.javaex.ex06;

public class UpperThreadImpl implements Runnable {
	//필드
	//생성자
	//메소드 gs
	
	//메소드 일반
	//대문자출력
	public void run() {
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
