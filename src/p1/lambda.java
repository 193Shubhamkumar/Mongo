package p1;

import java.awt.event.MouseEvent;

public class lambda {
	public void mousePressed(MouseEvent e) {
		  saySomething("Mouse pressed; # of clicks: "
		               + e.getClickCount(), e);
		}

		private void saySomething(String string, MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

		public void mouseReleased(MouseEvent e) {
		  saySomething("Mouse released; # of clicks: "
		               + e.getClickCount(), e);
		}

}
