package com.gabriel;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MetronomoFrame extends JFrame {
	
	JLabel lb_bpm;
	JButton bt_iniciar, bt_parar;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MetronomoFrame(String title) throws HeadlessException {
		super(title);
		setTitle("Metrônomo");
		setResizable(false);
		setBounds(100, 100, 450, 300);
		System.out.print("create Frame");
		

	}

	@Override
	protected void frameInit() {
		super.frameInit();
		
		lb_bpm = new JLabel("BPM:"); 
		getContentPane().add(lb_bpm);
		lb_bpm.setBounds(20, 20, 100, 15);
		
		bt_iniciar = new JButton("Inicar");
		getContentPane().add(bt_iniciar);
		bt_iniciar.setBounds(20,340,80, 30);
		
		bt_parar = new JButton("Parar");
		getContentPane().add(bt_parar);
		bt_parar.setBounds(20,240,80, 30);
		
	}
	
	

}
