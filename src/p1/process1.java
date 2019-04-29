package p1;

public class process1 implements Runnable {
	
	public void run() {
		
		for (int i=0 ; i< 5 ; i++) {
			System.out.println("Hello!! Shubham " + i);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	    }
	}
	
//	public void run() {
//		
//		for (int i=0 ; i< 5 ; i++) {
//			System.out.println("Hello!! Shubham " + i);
//			
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//	    }
	//}

}

class APP1 {
	public static void main(String args []) {
		
		Thread t1 = new Thread(new process1());
		t1.start();
		
		Thread t2 = new Thread(new process1());
	     t2.start();	
	}
}
