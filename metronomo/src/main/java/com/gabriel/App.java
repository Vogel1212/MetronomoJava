package com.gabriel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("running");
		
		//JFrame frame = new JFrame ("FrameDemo");
		
		MetronomoFrame frame2 = new MetronomoFrame ("FrameMetronomo");
		
		frame2.pack ();


		// 5. Mostre.
		// frame.setVisible (true);
		frame2.setVisible (true);	
		frame2.setSize (500, 450);	 
		

	}

	private static void setSize(int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
