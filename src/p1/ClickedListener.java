package p1;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

interface ClickedListener extends MouseListener
{
    @Override
    public default void mouseEntered(MouseEvent e) {
    	
    }

    @Override
    public default void mouseExited(MouseEvent e) {
    	
    }

    @Override
    public default void mousePressed(MouseEvent e) {
    	
    }

    @Override
    public default void mouseReleased(MouseEvent e) {
    	
    }
    
   // c.addMouseListener((ClickedListener)(e)->System.out.println("Clicked !"));
}


class Test {

  public static void main(String args []) {
	
	//	 c.addMouseListener((ClickedListener)(e)->System.out.println("Clicked !"));
	
	
}

}
