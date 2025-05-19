package com.javaex.ex03;

public class MainApp {
	
	public static void main(String[] args) {
		
		//멀티스레드
		
		//숫자
		//Thread thread1 = new Thread(new DigitThread());
		Thread thread1 = new DigitThread();
		
		//소문자
		//Thread thread2 = new Thread(new LowerThread());
		Thread thread2 = new LowerThread();
		
		//대문자
		//Thread thread3 = new Thread(new UpperThread());
		Thread thread3 = new UpperThread();
		
		//Thread 실행을 위해서는 Thread를 확장(extends)하여
		//run 메소드를 작성하고 start()를 실행해야 한다
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
