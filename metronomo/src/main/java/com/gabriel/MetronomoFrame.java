package com.gabriel;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MetronomoFrame extends JFrame {
	
	JLabel lb_bpm;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MetronomoFrame(String title) throws HeadlessException {
		super(title);
		setTitle("Metrônomo");
		System.out.print("create Frame");
		lb_bpm = new JLabel("BPM:"); 
		getContentPane().add(lb_bpm);
		lb_bpm.setBounds(20, 20, 100, 15);
		
	}
	

}
