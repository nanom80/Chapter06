package com.javaex.ex04;

public class MainApp {
	
	public static void main(String[] args) {
		
		//멀티스레드
		
		//숫자
		Runnable dt = new DigitThread();
		dt.run();
		
		//대문자출력
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
