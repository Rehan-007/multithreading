package com.ustglobal.thread.pausing;

public class Slider {

	public static void main(String[] args) {
		
		System.out.println("Main Start");
		
		for(int i=0;i<10;i++) {
			System.out.println("Sliding");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Main Ended");
	}
	
}
