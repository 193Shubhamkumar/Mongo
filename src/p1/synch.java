package p1;

import org.omg.CORBA.PUBLIC_MEMBER;

public class synch {
	
	private volatile int count = 0;
	
	//use synchronized keyword it will help execution of thread one by one
	
	public synchronized void increment() {
		count = count +1;
	}
	
	
	public static void main(String arg[]) {
		synch obj = new synch();
	    obj.dowork();
		
	}
//	
	public void dowork() {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i =0; i<100; i++) {
					increment();
			
				}
				
				

				
//				public static void main(String args []) {
//					synch obj = new synch();
//					obj.dowork();
//				}
			
			}
//			public void main(String args []) {
//				synch obj = new synch();
//				obj.dowork();
				
	//		}
			
		});

	Thread t2 = new Thread(new  Runnable() {
		
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i=0; i<1000; i++) {
				increment();
			}
 			
		}
	});
	
	Thread t3 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			for (int i=0; i<1000; i++) {
				increment();
			}
			
		}
	});
	
	Thread t4 = new Thread(new Runnable() {
		

		@Override
		public void run() {
			for (int i=0; i<500; i++) {
				increment();
			}
			// TODO Auto-generated method stub
			
		}
		
	});
	
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	
	try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		t3.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		t4.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	System.out.print("count is" + count);
	}
	

	
}
