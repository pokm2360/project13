package innerclass;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class quiz2 {

	public static void main(String[] args) {
		
		Frame frame= new Frame(); // 프레임 선언
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);
		
		TextArea textArea = new TextArea("텍스트상자",10,50);
		frame.add(textArea);
		
		frame.setVisible(true);
		
//		일반 클래스
//		MyFocusListener listener = new MyFocusListener();
//		textArea.addFocusListener(listener);
//		textArea.addFocusListener(new EventHandler3());
//		익명클래스
		textArea.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("텍스트에 포커스 되었습니다");
			}

			@Override
			public void focusLost(FocusEvent e) {
				System.out.println("텍스트에 포커스가 벗어났습니다");
			}
		});
	}

}

class EventHandler3 implements FocusListener {

	@Override
	public void focusGained(FocusEvent e) {
		System.out.println("텍스트에 포커스 되었습니다");
	}

	@Override
	public void focusLost(FocusEvent e) {
		System.out.println("텍스트에 포커스가 벗어났습니다");
	}
	
}