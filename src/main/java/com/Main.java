package com;

public class Main {
	public static void main(String[] args) {
		
		HelloWorldPrinter hwp = new HelloWorldPrinter();
		Thread t = new Thread(hwp);
		t.start();
		System.out.println("main thread : "+ Thread.currentThread().getName());
	}

}
