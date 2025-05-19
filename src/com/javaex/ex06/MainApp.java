package com.javaex.ex06;

public class MainApp {
	
	public static void main(String[] args) {
		
		//멀티스레드
		
		//Runnable dt = new DigitThreadImpl();
		//Thread t1 = new Thread(dt);
		Thread t1 = new Thread(new DigitThreadImpl());
		
		Thread t2 = new Thread(new LowerThreadImpl());
		Thread t3 = new Thread(new UpperThreadImpl());
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
