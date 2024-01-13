package com;

public class HelloWorldPrinter implements Runnable{
	
	public void doSomething() {
		System.out.println("Inside doSomethind of helloworldprinter is : " + Thread.currentThread().getName());
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside run method of HelloWorldPrinter is : " + Thread.currentThread().getName());
		doSomething();
	}
	
	

}
