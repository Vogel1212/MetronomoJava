package com.gabriel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class MetronomoFrame extends JFrame {
	
	JLabel lb_bpm;
	private JButton bt_iniciar, bt_parar;
	public JLabel lb_test;
	protected JLabel lb_test2;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MetronomoFrame(String title) throws HeadlessException {
		super(title);
		setTitle("Metrônomo");
		setBounds(100, 100, 450, 300);
		System.out.print("create Frame");
		

	}

	@Override
	protected void frameInit() {
		super.frameInit();
		
		lb_bpm = new JLabel("BPM:"); 
		getContentPane().add(lb_bpm);
		setLayout( new BorderLayout() );
		
		bt_iniciar = new JButton("Iniciar");
		getContentPane().add(bt_iniciar);
		setLayout( new BorderLayout() );
		
		bt_parar = new JButton("Parar");
		getContentPane().add(bt_parar);
		bt_parar.setBounds(20,240,80, 30);
		setLayout( new BorderLayout() );
		

		 add(bt_iniciar, BorderLayout.SOUTH);

		 add(bt_parar, BorderLayout.SOUTH);
		 
		 setSize(800, 800);
		
	}
	
	

}
