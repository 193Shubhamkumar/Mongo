package p1;

import java.util.Scanner;

  class sk extends Thread {
	
	private volatile boolean running = true;
	
	public void run() {
		
		while(running) {
			System.out.println("Hello");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public void shutdown() {
		running = false;
	}

}

public class process2 {
	//private static Scanner scanner;

	public static void main(String args []) {
		sk obj = new sk();
		obj.start();
		
		System.out.println("returning the class");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		obj.shutdown();
		
	}
	
	
}