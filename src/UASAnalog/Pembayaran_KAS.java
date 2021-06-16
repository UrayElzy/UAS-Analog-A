package UASAnalog;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JScrollPane;

public class Pembayaran_KAS {

	private JFrame frame;
	private JTextField nominal1;
	private JTextField nama1;
	private JTextField berapabulan1;

	ArrayList<Pembayaran> bayar = new ArrayList<Pembayaran>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pembayaran_KAS window = new Pembayaran_KAS();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pembayaran_KAS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 640, 384);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(25, 20, 581, 311);
		frame.getContentPane().add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);
		
		nama1 = new JTextField();
		nama1.setBounds(140, 67, 96, 19);
		panel.add(nama1);
		nama1.setColumns(10);
		
		JLabel nominal = new JLabel("Nominal");
		nominal.setBounds(30, 124, 100, 16);
		panel.add(nominal);
		nominal.setFont(new Font("Segoe UI Semilight", Font.BOLD, 14));
		
		nominal1 = new JTextField();
		nominal1.setBounds(140, 121, 96, 19);
		panel.add(nominal1);
		nominal1.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(291, 68, 279, 222);
		panel.add(scrollPane);
		
		JTextArea tampilan = new JTextArea();
		scrollPane.setViewportView(tampilan);
		
		JButton submit = new JButton("Submit");
		submit.setBounds(140, 250, 96, 29);
		panel.add(submit);
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nm = nama1.getText();
				String nl = nominal1.getText();
				String bb = berapabulan1.getText();
				Pembayaran tambah = (new Pembayaran(nm, nl, bb));
				bayar.add(tambah);
				String ai = "";
				for(int i = 0; i < bayar.size();i++) {
					 ai = ("\n> Nama : " + bayar.get(i).nama + "\n> Nominal : " + bayar.get(i).nominal
							+ "\n> Berapa Bulan : " + bayar.get(i).berapabulan + "\n" );
						
				
				}
				tampilan.append(ai);
				nama1.setText("");
				nominal1.setText("");
				berapabulan1.setText("");
			}
		});
		submit.setFont(new Font("Segoe UI Semilight", Font.BOLD, 14));
		
	
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(201, -12, 171, 57);
		panel_2.setBackground(new Color(85, 107, 47));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel pembayaran = new JLabel("Pembayaran Kas");
		pembayaran.setBounds(10, 22, 155, 25);
		panel_2.add(pembayaran);
		pembayaran.setFont(new Font("Poor Richard", Font.BOLD, 22));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(UIManager.getColor("Button.light"));
		panel_3.setBounds(22, 55, 222, 41);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel nama = new JLabel("Nama");
		nama.setBounds(10, 15, 70, 16);
		panel_3.add(nama);
		nama.setFont(new Font("Segoe UI Semilight", Font.BOLD, 14));
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(SystemColor.controlHighlight);
		panel_3_1.setBounds(22, 110, 222, 41);
		panel.add(panel_3_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(SystemColor.controlHighlight);
		panel_3_2.setBounds(22, 161, 222, 41);
		panel.add(panel_3_2);
		panel_3_2.setLayout(null);
		
		JLabel berapabulan = new JLabel("Berapa Bulan");
		berapabulan.setBounds(6, 10, 100, 22);
		panel_3_2.add(berapabulan);
		berapabulan.setFont(new Font("Segoe UI Semilight", Font.BOLD, 14));
		
		berapabulan1 = new JTextField();
		berapabulan1.setBounds(116, 10, 96, 19);
		panel_3_2.add(berapabulan1);
		berapabulan1.setColumns(10);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setBackground(SystemColor.controlHighlight);
		panel_3_3.setBounds(281, 55, 300, 246);
		panel.add(panel_3_3);
		
		JButton delete = new JButton("Delete");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tampilan.setText("");
			}
		});
		delete.setFont(new Font("Segoe UI Semilight", Font.BOLD, 14));
		delete.setBounds(30, 250, 90, 29);
		panel.add(delete);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 633, 354);
		frame.getContentPane().add(panel_1);
		panel_1.setBackground(new Color(85, 107, 47));
		
		
	}
}
