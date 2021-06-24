package com.gabriel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Hashtable;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class MetronomoFrame extends JFrame {

	private static final int FPS_MIN = 10;
	private static final int FPS_MAX = 200;
	private static final int FPS_INIT = 128;
	private JLabel lbBpm;
	private JButton btIniciar, btParar;

	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel southlPanel;
	private JPanel centerPanel;
	private JLabel msglabel;
	private JButton iniciar;
	private JButton parar;
	private JSlider sliderTempo;
	private JTextField txtTempo;

	public MetronomoFrame(String title) throws HeadlessException {
		super(title);
		System.out.print("create Frame");
		prepareGUI();
	}

	/**
	 * 
	 */

	/*
	 * JSlider framesPerSecond = new JSlider(JSlider.VERTICAL, FPS_MIN, FPS_MAX,
	 * FPS_INIT); framesPerSecond.addChangeListener(this);
	 * framesPerSecond.setMajorTickSpacing(10); framesPerSecond.setPaintTicks(true);
	 * 
	 * 
	 * Hashtable labelTable = new Hashtable(); labelTable.put( new Integer( 0 ), new
	 * JLabel("Stop") ); labelTable.put( new Integer( FPS_MAX/10 ) new
	 * JLabel("Slow") ) labelTable.put( new Integer( FPS_MAX ) new JLabel("Fast") )
	 * framesPerSecond.setLabelTable( labelTable )
	 */

	private void prepareGUI() {



		
		this.getContentPane().setLayout(new BorderLayout());
		
		setLayout(new BorderLayout());
		// north
		headerLabel = new JLabel("Metronomo");
		this.getContentPane().add(headerLabel,BorderLayout.NORTH);
		
		//center
		centerPanel = new JPanel();
		
		centerPanel.setLayout(new FlowLayout());
		
		sliderTempo = new JSlider(JSlider.HORIZONTAL );
		sliderTempo.setMaximum(180);
		sliderTempo.setMinimum(0);
		sliderTempo.setValue(100);
		centerPanel.add(sliderTempo);
		
		this.getContentPane().add(centerPanel,BorderLayout.CENTER);
		// south
		
		southlPanel = new JPanel();
		southlPanel.setLayout(new FlowLayout()); 
		
		statusLabel = new JLabel();
		iniciar = new JButton("start");
		parar = new JButton("stop");
		southlPanel.add(iniciar);
		southlPanel.add(parar);
		
		this.getContentPane().add(southlPanel,BorderLayout.SOUTH);
	}
	
	

//	private void showFlowLayoutDemo() {
//		headerLabel.setText("Metrônomo");
//
//		JPanel panel = new JPanel();
//		panel.setBackground(Color.darkGray);
//		panel.setSize(200, 200);
//		FlowLayout layout = new FlowLayout();
//		layout.setHgap(10);
//		layout.setVgap(10);
//
//		panel.setLayout(layout);
//		panel.add(new JButton("Iniciar"));
//		setLayout(new BorderLayout());
//		panel.add(new JButton("Parar"));
//		setLayout(new BorderLayout());
//		southlPanel.add(panel);
//		mainFrame.setVisible(true);
//	}
	/*
	 * } private static final long serialVersionUID = 1L;
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * @Override protected void frameInit() { super.frameInit();
	 */

	/*
	 * lbBpm = new JLabel("BPM:"); getContentPane().add(lbBpm);
	 * 
	 * 
	 * btIniciar = new JButton("Iniciar"); getContentPane().add(btIniciar);
	 * setLayout( new BorderLayout() );
	 * 
	 * btParar = new JButton("Parar"); getContentPane().add(btParar);
	 * btParar.setBounds(20,240,80, 30); setLayout( new BorderLayout() );
	 * 
	 * 
	 * add(btIniciar, BorderLayout.PAGE_START);
	 * 
	 * add(lbBpm, BorderLayout.CENTER);
	 * 
	 * add(btParar, BorderLayout.PAGE_END);
	 * 
	 * setSize(800, 800);
	 * 
	 */

}
