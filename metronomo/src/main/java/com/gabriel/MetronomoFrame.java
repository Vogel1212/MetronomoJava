package com.gabriel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class MetronomoFrame extends JFrame {
	
	private JLabel lbBpm;
	private JButton btIniciar, btParar;
	
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
	
	FlowLayout experimentLayout = new FlowLayout();
		
	@Override
	protected void frameInit() {
		super.frameInit();
		
		lbBpm = new JLabel("BPM:"); 
		getContentPane().add(lbBpm);
		setLayout( new BorderLayout() );
		
		btIniciar = new JButton("Iniciar");
		getContentPane().add(btIniciar);
		setLayout( new BorderLayout() );
		
		btParar = new JButton("Parar");
		getContentPane().add(btParar);
		btParar.setBounds(20,240,80, 30);
		setLayout( new BorderLayout() );
		

		 add(btIniciar, BorderLayout.PAGE_START);

		 add(lbBpm, BorderLayout.CENTER);
		 
		 add(btParar, BorderLayout.PAGE_END);
		 
		 setSize(800, 800);
		
	}
	
	

}
