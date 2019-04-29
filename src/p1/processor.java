package p1;

public class processor extends Thread {
	public void run() {
		for (int i=0 ; i<10; i++) {
			System.out.println("Hello cavisson" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}

class App {
	public static void main(String args[]) {
		
		processor obj = new processor();
		obj.start();
		
//		processor obj1 = new processor();
//         obj1.start();
	}
}
