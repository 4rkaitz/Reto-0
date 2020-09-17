package clases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Index extends JFrame {

	private JPanel contentPane;
	private JLayeredPane panelInicio;
	private JLabel lblTitulo;
	private JButton btnAlarmas;
	private JButton btnCalefaccion;
	private JLayeredPane panelAlarmas;
	private JLayeredPane panelCalefaccion;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 229, 253);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		panelInicio = new JLayeredPane();
		contentPane.add(panelInicio, "name_2535686466900");
		panelInicio.setLayout(null);
		
		lblTitulo = new JLabel("CIFP Txurdinaga");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(43, 40, 113, 27);
		panelInicio.add(lblTitulo);
		
		btnAlarmas = new JButton("Alarmas");
		btnAlarmas.setBounds(56, 89, 85, 21);
		panelInicio.add(btnAlarmas);
		
		btnCalefaccion = new JButton("Calefacci\u00F3n");
		btnCalefaccion.setBounds(43, 120, 113, 21);
		panelInicio.add(btnCalefaccion);
		
		panelAlarmas = new JLayeredPane();
		contentPane.add(panelAlarmas, "name_2569023407100");
		
		panelCalefaccion = new JLayeredPane();
		contentPane.add(panelCalefaccion, "name_2633143938400");
		
		
		//ActionLIsteners
		btnAlarmas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBounds(200, 200, 700, 460);
				panelInicio.setVisible(false);
				panelAlarmas.setVisible(true);
			}
		});
		
		btnCalefaccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBounds(200, 200, 700, 460);
				panelInicio.setVisible(false);
				panelCalefaccion.setVisible(true);
			}
		});
	}
}
