package innerclass;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class quiz1 {

	public static void main(String[] args) {
	
		Frame frame= new Frame(); // 프레임 선언
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);
		frame.setVisible(true);
		
//		일반클래스
//		frame.addKeyListener(new EventHandler2());
		
		
//		익명클래스
		frame.addKeyListener( new EventHandler2() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("키를 눌렀습니다");
				
			}

		});
		
	}

}

class EventHandler2 implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("키를 눌렀습니다");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	
}
