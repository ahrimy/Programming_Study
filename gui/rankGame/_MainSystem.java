package gui_rankGame;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class _MainSystem {
	static JFrame frame =new JFrame();
	
	public static void main(String[] args) {
		int WIDTH = 400;
		int HEIGHT = 400;
		frame.setTitle("ȸ������");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		//===============================
		 // ----���� ��ġ�� ����ȭ���� �߾����� �ٲٴ� �ڵ�
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize(); // ����� ����� �����´�.
		frame.setLocation(screenSize.width/2 - WIDTH/2 , screenSize.height/2 - HEIGHT/2 );
	// ----���� ��ġ�� ����ȭ���� �߾����� �ٲٴ� �ڵ�	
		
		FileManager.instance.loadData();
		
		Login_Panel login_panel = new Login_Panel();
		frame.setContentPane(login_panel);	
		frame.revalidate();

	}

}