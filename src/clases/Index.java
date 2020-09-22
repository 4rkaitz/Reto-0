package clases;

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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class Index extends JFrame implements ActionListener{

	
	private JPanel contentPane;
	private JLayeredPane panelInicio;
	private JButton btnAlarmas;
	private JButton btnCalefaccion;
	private JLayeredPane panelAlarmas;
	private JLayeredPane panelCalefaccion;
	private JLabel lblNewLabel;
	private JButton btnMenuAlarmas;
	private JLabel lblNewLabel_1;
	private JButton btnMenuCalefaccion;
	//Boton de la alarma
	private JLabel btnClaseAlarma1;
	private JLabel btnClaseAlarma2;
	private JLabel btnClaseAlarma3;
	private JLabel btnClaseAlarma4;
	private JLabel btnClaseAlarma5;
	private JLabel btnClaseAlarma6;
	private JLabel btnClaseAlarma7;
	private JLabel btnClaseAlarma8;
	private JLabel btnClaseAlarma9;
	private JLabel btnClaseAlarma10;
	private JLabel btnClaseAlarma11;
	private JLabel btnClaseAlarma12;
	private JLabel btnClaseAlarma13;
	private JLabel btnClaseAlarma14;
	private JLabel btnClaseAlarma15;
	private JLabel btnClaseAlarma16;
	private JLabel btnClaseAlarma17;
	private JLabel btnClaseAlarma18;
	private JLabel btnClaseAlarma19;
	private JLabel btnClaseAlarma20;
	private JLabel btnClaseAlarma21;
	private JLabel btnClaseAlarma22;
	private JLabel btnClaseAlarma23;
	private JLabel btnClaseAlarma24;
	private JLabel btnClaseAlarma25;
	private JLabel btnClaseAlarma26;
	private JLabel btnClaseAlarma27;
	private JLabel btnClaseAlarma28;
	private JLabel btnClaseAlarma29;
	private JLabel btnClaseAlarma30;
	private JLabel btnClaseAlarma31;
	private JLabel btnClaseAlarma32;
	private JLabel btnClaseAlarma33;
	private JLabel btnClaseAlarma34;
	private JLabel btnClaseAlarma35;
	private JLabel btnClaseAlarma36;
	private JLabel btnClaseAlarma37;
	private JLabel btnClaseAlarma38;
	private JLabel btnClaseAlarma39;
	private JLabel btnClaseAlarma40;
	private JLabel btnClaseAlarma41;
	private JLabel btnClaseAlarma42;
	private JLabel btnClaseAlarma43;
	private JLabel btnClaseAlarma44;
	private JLabel btnClaseAlarma45;
	private JLabel btnClaseAlarma46;
	private JLabel btnClaseAlarma47;
	private JLabel btnClaseAlarma48;
	//Botones de la calefaccion
	private JButton btnClase1;
	private JButton btnClase2;
	private JButton btnClase3;
	private JButton btnClase4;
	private JButton btnClase5;
	private JButton btnClase6;
	private JButton btnClase7;
	private JButton btnClase8;
	private JButton btnClase9;
	private JButton btnClase10;
	private JButton btnClase11;
	private JButton btnClase12;
	private JButton btnClase13;
	private JButton btnClase14;
	private JButton btnClase15;
	private JButton btnClase16;
	private JButton btnClase17;
	private JButton btnClase18;
	private JButton btnClase19;
	private JButton btnClase20;
	private JButton btnClase21;
	private JButton btnClase22;
	private JButton btnClase23;
	private JButton btnClase24;
	private JButton btnClase25;
	private JButton btnClase26;
	private JButton btnClase27;
	private JButton btnClase28;
	private JButton btnClase29;
	private JButton btnClase30;
	private JButton btnClase31;
	private JButton btnClase32;
	private JButton btnClase33;
	private JButton btnClase34;
	private JButton btnClase35;
	private JButton btnClase36;
	private JButton btnClase37;
	private JButton btnClase38;
	private JButton btnClase39;
	private JButton btnClase40;
	private JButton btnClase41;
	private JButton btnClase42;
	private JButton btnClase43;
	private JButton btnClase44;
	private JButton btnClase45;
	private JButton btnClase46;
	private JButton btnClase47;
	private JButton btnClase48;
	
	private ArrayList<JLabel> alarmas = new ArrayList<JLabel>();
	private ArrayList<JButton> calefactores = new ArrayList<JButton>();
	private static Aula aulas[];
		
	
	

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
		
		//Inicialización de array de alarmas (101 - 116, 201 - 216 ...)

				aulas = new Aula[48];
				
				for(int i = 0; i < aulas.length; i++)

				{
					
					aulas[i]= new Aula(i);
					

				}
	}

	/**
	 * Create the frame.
	 */
	public Index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 500, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		panelInicio = new JLayeredPane();
		contentPane.add(panelInicio, "name_2535686466900");
		panelInicio.setLayout(null);
		
		btnAlarmas = new JButton("Alarmas");
		btnAlarmas.setBounds(189, 244, 85, 21);
		panelInicio.add(btnAlarmas);
		
		btnCalefaccion = new JButton("Calefacci\u00F3n");
		btnCalefaccion.setBounds(176, 275, 113, 21);
		panelInicio.add(btnCalefaccion);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		lblNewLabel_2.setIcon(new ImageIcon("img/txurdinagaLogo.png"));
		lblNewLabel_2.setBounds(10, 10, 456, 186);
		panelInicio.add(lblNewLabel_2);
		
		panelAlarmas = new JLayeredPane();
		panelAlarmas.setBackground(Color.WHITE);
		contentPane.add(panelAlarmas, "name_2569023407100");
		
		btnMenuAlarmas = new JButton("Men\u00FA");
		btnMenuAlarmas.setBounds(10, 10, 85, 21);
		panelAlarmas.add(btnMenuAlarmas);
		
		btnClaseAlarma1 = new JLabel("");
		btnClaseAlarma1.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma1.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma1.setBackground(new Color(102, 255, 102));
		btnClaseAlarma1.setBounds(121, 109, 75, 14);
		panelAlarmas.add(btnClaseAlarma1);
		
		btnClaseAlarma2 = new JLabel("");
		btnClaseAlarma2.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma2.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma2.setBackground(new Color(102, 255, 102));
		btnClaseAlarma2.setBounds(198, 109, 75, 14);
		panelAlarmas.add(btnClaseAlarma2);
		
		btnClaseAlarma3 = new JLabel("");
		btnClaseAlarma3.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma3.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma3.setBackground(new Color(102, 255, 102));
		btnClaseAlarma3.setBounds(121, 131, 75, 14);
		panelAlarmas.add(btnClaseAlarma3);
		
		btnClaseAlarma4 = new JLabel("");
		btnClaseAlarma4.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma4.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma4.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma4.setBackground(new Color(102, 255, 102));
		btnClaseAlarma4.setBounds(198, 133, 75, 14);
		panelAlarmas.add(btnClaseAlarma4);
		
		btnClaseAlarma17 = new JLabel("");
		btnClaseAlarma17.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma17.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma17.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma17.setBackground(new Color(102, 255, 102));
		btnClaseAlarma17.setBounds(121, 263, 75, 14);
		panelAlarmas.add(btnClaseAlarma17);
		
		btnClaseAlarma18 = new JLabel("");
		btnClaseAlarma18.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma18.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma18.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma18.setBackground(new Color(102, 255, 102));
		btnClaseAlarma18.setBounds(198, 263, 75, 14);
		panelAlarmas.add(btnClaseAlarma18);
		
		btnClaseAlarma19 = new JLabel("");
		btnClaseAlarma19.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma19.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma19.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma19.setBackground(new Color(102, 255, 102));
		btnClaseAlarma19.setBounds(121, 287, 75, 14);
		panelAlarmas.add(btnClaseAlarma19);
		
		btnClaseAlarma20 = new JLabel("");
		btnClaseAlarma20.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma20.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma20.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma20.setBackground(new Color(102, 255, 102));
		btnClaseAlarma20.setBounds(198, 287, 75, 14);
		panelAlarmas.add(btnClaseAlarma20);
		
		btnClaseAlarma33 = new JLabel("");
		btnClaseAlarma33.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma33.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma33.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma33.setBackground(new Color(102, 255, 102));
		btnClaseAlarma33.setBounds(119, 414, 77, 14);
		panelAlarmas.add(btnClaseAlarma33);
		
		btnClaseAlarma34 = new JLabel("");
		btnClaseAlarma34.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma34.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma34.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma34.setBackground(new Color(102, 255, 102));
		btnClaseAlarma34.setBounds(198, 414, 75, 14);
		panelAlarmas.add(btnClaseAlarma34);
		
		btnClaseAlarma35 = new JLabel("");
		btnClaseAlarma35.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma35.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma35.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma35.setBackground(new Color(102, 255, 102));
		btnClaseAlarma35.setBounds(119, 438, 75, 14);
		panelAlarmas.add(btnClaseAlarma35);
		
		btnClaseAlarma36 = new JLabel("");
		btnClaseAlarma36.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma36.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma36.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma36.setBackground(new Color(102, 255, 102));
		btnClaseAlarma36.setBounds(198, 438, 75, 14);
		panelAlarmas.add(btnClaseAlarma36);
		
		btnClaseAlarma5 = new JLabel("");
		btnClaseAlarma5.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma5.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma5.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma5.setBackground(new Color(102, 255, 102));
		btnClaseAlarma5.setBounds(282, 63, 47, 14);
		panelAlarmas.add(btnClaseAlarma5);
		
		btnClaseAlarma6 = new JLabel("");
		btnClaseAlarma6.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma6.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma6.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma6.setBackground(new Color(102, 255, 102));
		btnClaseAlarma6.setBounds(332, 63, 47, 14);
		panelAlarmas.add(btnClaseAlarma6);
		
		btnClaseAlarma8 = new JLabel("");
		btnClaseAlarma8.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma8.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma8.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma8.setBackground(new Color(102, 255, 102));
		btnClaseAlarma8.setBounds(332, 77, 47, 17);
		panelAlarmas.add(btnClaseAlarma8);
		
		btnClaseAlarma10 = new JLabel("");
		btnClaseAlarma10.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma10.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma10.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma10.setBackground(new Color(102, 255, 102));
		btnClaseAlarma10.setBounds(332, 95, 47, 14);
		panelAlarmas.add(btnClaseAlarma10);
		
		btnClaseAlarma9 = new JLabel("");
		btnClaseAlarma9.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma9.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma9.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma9.setBackground(new Color(102, 255, 102));
		btnClaseAlarma9.setBounds(282, 92, 47, 17);
		panelAlarmas.add(btnClaseAlarma9);
		
		btnClaseAlarma7 = new JLabel("");
		btnClaseAlarma7.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma7.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma7.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma7.setBackground(new Color(102, 255, 102));
		btnClaseAlarma7.setBounds(282, 77, 47, 17);
		panelAlarmas.add(btnClaseAlarma7);
		
		btnClaseAlarma21 = new JLabel("");
		btnClaseAlarma21.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma21.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma21.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma21.setBackground(new Color(102, 255, 102));
		btnClaseAlarma21.setBounds(282, 219, 47, 14);
		panelAlarmas.add(btnClaseAlarma21);
		
		btnClaseAlarma22 = new JLabel("");
		btnClaseAlarma22.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma22.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma22.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma22.setBackground(new Color(102, 255, 102));
		btnClaseAlarma22.setBounds(332, 219, 47, 14);
		panelAlarmas.add(btnClaseAlarma22);
		
		btnClaseAlarma23 = new JLabel("");
		btnClaseAlarma23.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma23.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma23.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma23.setBackground(new Color(102, 255, 102));
		btnClaseAlarma23.setBounds(282, 234, 47, 14);
		panelAlarmas.add(btnClaseAlarma23);
		
		btnClaseAlarma26 = new JLabel("");
		btnClaseAlarma26.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma26.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma26.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma26.setBackground(new Color(102, 255, 102));
		btnClaseAlarma26.setBounds(332, 248, 47, 14);
		panelAlarmas.add(btnClaseAlarma26);
		
		btnClaseAlarma25 = new JLabel("");
		btnClaseAlarma25.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma25.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma25.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma25.setBackground(new Color(102, 255, 102));
		btnClaseAlarma25.setBounds(282, 248, 47, 14);
		panelAlarmas.add(btnClaseAlarma25);
		
		btnClaseAlarma24 = new JLabel("");
		btnClaseAlarma24.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma24.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma24.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma24.setBackground(new Color(102, 255, 102));
		btnClaseAlarma24.setBounds(332, 234, 47, 14);
		panelAlarmas.add(btnClaseAlarma24);
		
		btnClaseAlarma27 = new JLabel("");
		btnClaseAlarma27.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma27.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma27.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma27.setBackground(new Color(102, 255, 102));
		btnClaseAlarma27.setBounds(282, 301, 47, 16);
		panelAlarmas.add(btnClaseAlarma27);
		
		btnClaseAlarma28 = new JLabel("");
		btnClaseAlarma28.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma28.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma28.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma28.setBackground(new Color(102, 255, 102));
		btnClaseAlarma28.setBounds(332, 301, 47, 16);
		panelAlarmas.add(btnClaseAlarma28);
		
		btnClaseAlarma29 = new JLabel("");
		btnClaseAlarma29.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma29.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma29.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma29.setBackground(new Color(102, 255, 102));
		btnClaseAlarma29.setBounds(282, 317, 47, 16);
		panelAlarmas.add(btnClaseAlarma29);
		
		btnClaseAlarma30 = new JLabel("");
		btnClaseAlarma30.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma30.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma30.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma30.setBackground(new Color(102, 255, 102));
		btnClaseAlarma30.setBounds(332, 317, 47, 16);
		panelAlarmas.add(btnClaseAlarma30);
		
		btnClaseAlarma31 = new JLabel("");
		btnClaseAlarma31.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma31.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma31.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma31.setBackground(new Color(102, 255, 102));
		btnClaseAlarma31.setBounds(282, 333, 47, 16);
		panelAlarmas.add(btnClaseAlarma31);
		
		btnClaseAlarma32 = new JLabel("");
		btnClaseAlarma32.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma32.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma32.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma32.setBackground(new Color(102, 255, 102));
		btnClaseAlarma32.setBounds(332, 333, 47, 16);
		panelAlarmas.add(btnClaseAlarma32);
		
		btnClaseAlarma37 = new JLabel("");
		btnClaseAlarma37.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma37.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma37.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma37.setBackground(new Color(102, 255, 102));
		btnClaseAlarma37.setBounds(282, 370, 47, 16);
		panelAlarmas.add(btnClaseAlarma37);
		
		btnClaseAlarma38 = new JLabel("");
		btnClaseAlarma38.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma38.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma38.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma38.setBackground(new Color(102, 255, 102));
		btnClaseAlarma38.setBounds(332, 370, 47, 16);
		panelAlarmas.add(btnClaseAlarma38);
		
		btnClaseAlarma39 = new JLabel("");
		btnClaseAlarma39.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma39.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma39.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma39.setBackground(new Color(102, 255, 102));
		btnClaseAlarma39.setBounds(282, 386, 47, 14);
		panelAlarmas.add(btnClaseAlarma39);
		
		btnClaseAlarma40 = new JLabel("");
		btnClaseAlarma40.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma40.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma40.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma40.setBackground(new Color(102, 255, 102));
		btnClaseAlarma40.setBounds(332, 383, 47, 16);
		panelAlarmas.add(btnClaseAlarma40);
		
		btnClaseAlarma41 = new JLabel("");
		btnClaseAlarma41.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma41.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma41.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma41.setBackground(new Color(102, 255, 102));
		btnClaseAlarma41.setBounds(282, 400, 47, 14);
		panelAlarmas.add(btnClaseAlarma41);
		
		btnClaseAlarma42 = new JLabel("");
		btnClaseAlarma42.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma42.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma42.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma42.setBackground(new Color(102, 255, 102));
		btnClaseAlarma42.setBounds(332, 400, 47, 16);
		panelAlarmas.add(btnClaseAlarma42);
		
		btnClaseAlarma43 = new JLabel("");
		btnClaseAlarma43.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma43.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma43.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma43.setBackground(new Color(102, 255, 102));
		btnClaseAlarma43.setBounds(282, 453, 47, 16);
		panelAlarmas.add(btnClaseAlarma43);
		
		btnClaseAlarma45 = new JLabel("");
		btnClaseAlarma45.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma45.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma45.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma45.setBackground(new Color(102, 255, 102));
		btnClaseAlarma45.setBounds(282, 468, 47, 14);
		panelAlarmas.add(btnClaseAlarma45);
		
		btnClaseAlarma47 = new JLabel("");
		btnClaseAlarma47.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma47.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma47.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma47.setBackground(new Color(102, 255, 102));
		btnClaseAlarma47.setBounds(282, 482, 47, 16);
		panelAlarmas.add(btnClaseAlarma47);
		
		btnClaseAlarma44 = new JLabel("");
		btnClaseAlarma44.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma44.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma44.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma44.setBackground(new Color(102, 255, 102));
		btnClaseAlarma44.setBounds(332, 453, 47, 16);
		panelAlarmas.add(btnClaseAlarma44);
		
		btnClaseAlarma46 = new JLabel("");
		btnClaseAlarma46.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma46.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma46.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma46.setBackground(new Color(102, 255, 102));
		btnClaseAlarma46.setBounds(332, 468, 47, 16);
		panelAlarmas.add(btnClaseAlarma46);
		
		btnClaseAlarma48 = new JLabel("");
		btnClaseAlarma48.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma48.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma48.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma48.setBackground(new Color(102, 255, 102));
		btnClaseAlarma48.setBounds(332, 484, 47, 16);
		panelAlarmas.add(btnClaseAlarma48);
		
		btnClaseAlarma11 = new JLabel("");
		btnClaseAlarma11.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma11.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma11.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma11.setBackground(new Color(102, 255, 102));
		btnClaseAlarma11.setBounds(282, 144, 47, 17);
		panelAlarmas.add(btnClaseAlarma11);
		
		btnClaseAlarma13 = new JLabel("");
		btnClaseAlarma13.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma13.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma13.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma13.setBackground(new Color(102, 255, 102));
		btnClaseAlarma13.setBounds(282, 162, 47, 14);
		panelAlarmas.add(btnClaseAlarma13);
		
		btnClaseAlarma15 = new JLabel("");
		btnClaseAlarma15.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma15.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma15.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma15.setBackground(new Color(102, 255, 102));
		btnClaseAlarma15.setBounds(282, 179, 47, 14);
		panelAlarmas.add(btnClaseAlarma15);
		
		btnClaseAlarma16 = new JLabel("");
		btnClaseAlarma16.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma16.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma16.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma16.setBackground(new Color(102, 255, 102));
		btnClaseAlarma16.setBounds(332, 177, 47, 14);
		panelAlarmas.add(btnClaseAlarma16);
		
		btnClaseAlarma14 = new JLabel("");
		btnClaseAlarma14.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma14.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma14.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma14.setBackground(new Color(102, 255, 102));
		btnClaseAlarma14.setBounds(332, 161, 47, 15);
		panelAlarmas.add(btnClaseAlarma14);
		
		btnClaseAlarma12 = new JLabel("");
		btnClaseAlarma12.setHorizontalAlignment(SwingConstants.CENTER);
		btnClaseAlarma12.setIcon(new ImageIcon("img/greenCircle.png"));
		btnClaseAlarma12.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClaseAlarma12.setBackground(new Color(102, 255, 102));
		btnClaseAlarma12.setBounds(332, 144, 47, 16);
		panelAlarmas.add(btnClaseAlarma12);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("img/alarmas.png"));
		lblNewLabel.setBounds(10, 10, 456, 493);
		panelAlarmas.add(lblNewLabel);
		
		panelCalefaccion = new JLayeredPane();
		contentPane.add(panelCalefaccion, "name_2633143938400");
		
		btnMenuCalefaccion = new JButton("Men\u00FA");
		btnMenuCalefaccion.setBounds(0, 0, 85, 21);
		panelCalefaccion.add(btnMenuCalefaccion);
		
		btnClase1 = new JButton("");

		btnClase1.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase1.setBackground(Color.RED);

		btnClase1.setBounds(116, 113, 75, 14);

		btnClase1.addActionListener(this);

		panelCalefaccion.add(btnClase1);

		

		btnClase2 = new JButton("");

		btnClase2.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase2.setBackground(Color.RED);

		btnClase2.setBounds(192, 113, 75, 14);

		btnClase2.addActionListener(this);

		panelCalefaccion.add(btnClase2);

		

		btnClase3 = new JButton("");

		btnClase3.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase3.setBackground(Color.RED);

		btnClase3.setBounds(116, 135, 75, 14);

		btnClase3.addActionListener(this);

		panelCalefaccion.add(btnClase3);

		

		btnClase4 = new JButton("");

		btnClase4.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase4.setBackground(Color.RED);

		btnClase4.setBounds(192, 135, 75, 14);

		btnClase4.addActionListener(this);

		panelCalefaccion.add(btnClase4);

		

		btnClase17 = new JButton("");

		btnClase17.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase17.setBackground(Color.RED);

		btnClase17.setBounds(116, 264, 75, 14);

		btnClase17.addActionListener(this);

		panelCalefaccion.add(btnClase17);

		

		btnClase18 = new JButton("");

		btnClase18.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase18.setBackground(Color.RED);

		btnClase18.setBounds(192, 264, 75, 14);

		btnClase18.addActionListener(this);

		panelCalefaccion.add(btnClase18);

		

		btnClase48 = new JButton("");

		btnClase48.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase48.setBackground(Color.RED);

		btnClase48.setBounds(116, 288, 75, 14);

		btnClase48.addActionListener(this);

		panelCalefaccion.add(btnClase48);

		

		btnClase19 = new JButton("");

		btnClase19.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase19.setBackground(Color.RED);

		btnClase19.setBounds(192, 288, 75, 14);

		btnClase19.addActionListener(this);

		panelCalefaccion.add(btnClase19);

		

		btnClase32 = new JButton("");

		btnClase32.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase32.setBackground(Color.RED);

		btnClase32.setBounds(116, 412, 68, 14);

		btnClase32.addActionListener(this);

		panelCalefaccion.add(btnClase32);

		

		btnClase33 = new JButton("");

		btnClase33.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase33.setBackground(Color.RED);

		btnClase33.setBounds(192, 412, 68, 14);

		btnClase33.addActionListener(this);

		panelCalefaccion.add(btnClase33);

		

		btnClase34 = new JButton("");

		btnClase34.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase34.setBackground(Color.RED);

		btnClase34.setBounds(116, 432, 68, 14);

		btnClase34.addActionListener(this);

		panelCalefaccion.add(btnClase34);

		

		btnClase35 = new JButton("");

		btnClase35.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase35.setBackground(Color.RED);

		btnClase35.setBounds(192, 436, 68, 14);

		btnClase35.addActionListener(this);

		panelCalefaccion.add(btnClase35);

		

		btnClase5 = new JButton("");

		btnClase5.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase5.setBackground(Color.RED);

		btnClase5.setBounds(265, 66, 47, 14);

		btnClase5.addActionListener(this);

		panelCalefaccion.add(btnClase5);

		

		btnClase7 = new JButton("");

		btnClase7.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase7.setBackground(Color.RED);

		btnClase7.setBounds(265, 80, 47, 17);

		btnClase7.addActionListener(this);

		panelCalefaccion.add(btnClase7);

		

		btnClase9 = new JButton("");

		btnClase9.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase9.setBackground(Color.RED);

		btnClase9.setBounds(265, 95, 47, 17);

		btnClase9.addActionListener(this);

		panelCalefaccion.add(btnClase9);

		

		btnClase10 = new JButton("");

		btnClase10.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase10.setBackground(Color.RED);

		btnClase10.setBounds(315, 98, 47, 14);

		btnClase10.addActionListener(this);

		panelCalefaccion.add(btnClase10);

		

		btnClase8 = new JButton("");

		btnClase8.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase8.setBackground(Color.RED);

		btnClase8.setBounds(315, 80, 47, 17);

		btnClase8.addActionListener(this);

		panelCalefaccion.add(btnClase8);

		

		btnClase6 = new JButton("");

		btnClase6.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase6.setBackground(Color.RED);

		btnClase6.setBounds(315, 66, 47, 14);

		btnClase6.addActionListener(this);

		panelCalefaccion.add(btnClase6);

		

		btnClase11 = new JButton("");

		btnClase11.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase11.setBackground(Color.RED);

		btnClase11.setBounds(265, 147, 47, 17);

		btnClase11.addActionListener(this);

		panelCalefaccion.add(btnClase11);

		

		btnClase13 = new JButton("");

		btnClase13.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase13.setBackground(Color.RED);

		btnClase13.setBounds(265, 165, 47, 14);

		btnClase13.addActionListener(this);

		panelCalefaccion.add(btnClase13);

		

		btnClase15 = new JButton("");

		btnClase15.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase15.setBackground(Color.RED);

		btnClase15.setBounds(265, 182, 47, 14);

		btnClase15.addActionListener(this);

		panelCalefaccion.add(btnClase15);

		

		btnClase16 = new JButton("");

		btnClase16.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase16.setBackground(Color.RED);

		btnClase16.setBounds(315, 180, 47, 14);

		btnClase16.addActionListener(this);

		panelCalefaccion.add(btnClase16);

		

		btnClase14 = new JButton("");

		btnClase14.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase14.setBackground(Color.RED);

		btnClase14.setBounds(315, 164, 47, 15);

		btnClase14.addActionListener(this);

		panelCalefaccion.add(btnClase14);

		

		btnClase12 = new JButton("");

		btnClase12.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase12.setBackground(Color.RED);

		btnClase12.setBounds(315, 147, 47, 16);

		btnClase12.addActionListener(this);

		panelCalefaccion.add(btnClase12);

		

		btnClase47 = new JButton("");

		btnClase47.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase47.setBackground(Color.RED);

		btnClase47.setBounds(320, 475, 47, 16);

		btnClase47.addActionListener(this);

		panelCalefaccion.add(btnClase47);

		

		btnClase21 = new JButton("");

		btnClase21.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase21.setBackground(Color.RED);

		btnClase21.setBounds(315, 222, 47, 14);

		btnClase21.addActionListener(this);

		panelCalefaccion.add(btnClase21);

		

		btnClase20 = new JButton("");

		btnClase20.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase20.setBackground(Color.RED);

		btnClase20.setBounds(265, 222, 47, 14);

		btnClase20.addActionListener(this);

		panelCalefaccion.add(btnClase20);

		

		btnClase22 = new JButton("");

		btnClase22.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase22.setBackground(Color.RED);

		btnClase22.setBounds(265, 237, 47, 14);

		btnClase22.addActionListener(this);

		panelCalefaccion.add(btnClase22);

		

		btnClase24 = new JButton("");

		btnClase24.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase24.setBackground(Color.RED);

		btnClase24.setBounds(265, 251, 47, 14);

		btnClase24.addActionListener(this);

		panelCalefaccion.add(btnClase24);

		

		btnClase25 = new JButton("");

		btnClase25.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase25.setBackground(Color.RED);

		btnClase25.setBounds(315, 251, 47, 14);

		btnClase25.addActionListener(this);

		panelCalefaccion.add(btnClase25);

		

		btnClase23 = new JButton("");

		btnClase23.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase23.setBackground(Color.RED);

		btnClase23.setBounds(315, 237, 47, 14);

		btnClase23.addActionListener(this);

		panelCalefaccion.add(btnClase23);

		

		btnClase26 = new JButton("");

		btnClase26.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase26.setBackground(Color.RED);

		btnClase26.setBounds(265, 304, 47, 16);

		btnClase26.addActionListener(this);

		panelCalefaccion.add(btnClase26);

		

		btnClase28 = new JButton("");

		btnClase28.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase28.setBackground(Color.RED);

		btnClase28.setBounds(265, 320, 47, 16);

		btnClase28.addActionListener(this);

		panelCalefaccion.add(btnClase28);

		

		btnClase30 = new JButton("");

		btnClase30.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase30.setBackground(Color.RED);

		btnClase30.setBounds(265, 336, 47, 16);

		btnClase30.addActionListener(this);

		panelCalefaccion.add(btnClase30);

		

		btnClase36 = new JButton("");

		btnClase36.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase36.setBackground(Color.RED);

		btnClase36.setBounds(265, 365, 47, 16);

		btnClase36.addActionListener(this);

		panelCalefaccion.add(btnClase36);

		

		btnClase38 = new JButton("");

		btnClase38.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase38.setBackground(Color.RED);

		btnClase38.setBounds(265, 381, 47, 14);

		btnClase38.addActionListener(this);

		panelCalefaccion.add(btnClase38);

		

		btnClase40 = new JButton("");

		btnClase40.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase40.setBackground(Color.RED);

		btnClase40.setBounds(265, 395, 47, 14);

		btnClase40.addActionListener(this);

		panelCalefaccion.add(btnClase40);

		

		btnClase42 = new JButton("");

		btnClase42.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase42.setBackground(Color.RED);

		btnClase42.setBounds(270, 444, 47, 16);

		btnClase42.addActionListener(this);

		panelCalefaccion.add(btnClase42);

		

		btnClase44 = new JButton("");

		btnClase44.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase44.setBackground(Color.RED);

		btnClase44.setBounds(270, 459, 47, 14);

		btnClase44.addActionListener(this);

		panelCalefaccion.add(btnClase44);

		

		btnClase46 = new JButton("");

		btnClase46.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase46.setBackground(Color.RED);

		btnClase46.setBounds(270, 473, 47, 16);

		btnClase46.addActionListener(this);

		panelCalefaccion.add(btnClase46);

		

		btnClase45 = new JButton("");

		btnClase45.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase45.setBackground(Color.RED);

		btnClase45.setBounds(320, 459, 47, 16);

		btnClase45.addActionListener(this);

		panelCalefaccion.add(btnClase45);

		

		btnClase43 = new JButton("");

		btnClase43.setFont(new Font("Tahoma", Font.PLAIN, 9));

		btnClase43.setBackground(Color.RED);

		btnClase43.setBounds(320, 444, 47, 16);

		btnClase43.addActionListener(this);

		panelCalefaccion.add(btnClase43);

		

		btnClase41 = new JButton("");
		btnClase41.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClase41.setBackground(Color.RED);
		btnClase41.setBounds(315, 395, 47, 16);
		btnClase41.addActionListener(this);
		panelCalefaccion.add(btnClase41);

		btnClase39 = new JButton("");
		btnClase39.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClase39.setBackground(Color.RED);
		btnClase39.setBounds(315, 378, 47, 16);
		btnClase39.addActionListener(this);
		panelCalefaccion.add(btnClase39);

		btnClase37 = new JButton("");
		btnClase37.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClase37.setBackground(Color.RED);
		btnClase37.setBounds(315, 365, 47, 16);
		btnClase37.addActionListener(this);
		panelCalefaccion.add(btnClase37);

		btnClase27 = new JButton("");
		btnClase27.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClase27.setBackground(Color.RED);
		btnClase27.setBounds(315, 304, 47, 16);
		btnClase27.addActionListener(this);
		panelCalefaccion.add(btnClase27);

		btnClase29 = new JButton("");
		btnClase29.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClase29.setBackground(Color.RED);
		btnClase29.setBounds(315, 320, 47, 16);
		btnClase29.addActionListener(this);
		panelCalefaccion.add(btnClase29);

		btnClase31 = new JButton("");
		btnClase31.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnClase31.setBackground(Color.RED);
		btnClase31.setBounds(315, 336, 47, 16);
		btnClase31.addActionListener(this);
		panelCalefaccion.add(btnClase31);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("img/Calefacciones.png"));
		lblNewLabel_1.setBounds(10, 10, 456, 493);
		panelCalefaccion.add(lblNewLabel_1);
		
		
		//Llenado de ArrayList
				calefactores.add(btnClase1);
				calefactores.add(btnClase2);
				calefactores.add(btnClase3);
				calefactores.add(btnClase4);
				calefactores.add(btnClase5);
				calefactores.add(btnClase6);
				calefactores.add(btnClase7);
				calefactores.add(btnClase8);
				calefactores.add(btnClase9);
				calefactores.add(btnClase10);
				calefactores.add(btnClase11);
				calefactores.add(btnClase12);
				calefactores.add(btnClase13);
				calefactores.add(btnClase14);
				calefactores.add(btnClase15);
				calefactores.add(btnClase16);
				calefactores.add(btnClase17);
				calefactores.add(btnClase18);
				calefactores.add(btnClase19);
				calefactores.add(btnClase20);
				calefactores.add(btnClase21);
				calefactores.add(btnClase22);
				calefactores.add(btnClase23);
				calefactores.add(btnClase24);
				calefactores.add(btnClase25);
				calefactores.add(btnClase26);
				calefactores.add(btnClase27);
				calefactores.add(btnClase28);
				calefactores.add(btnClase29);
				calefactores.add(btnClase30);
				calefactores.add(btnClase31);
				calefactores.add(btnClase32);
				calefactores.add(btnClase33);
				calefactores.add(btnClase34);
				calefactores.add(btnClase35);
				calefactores.add(btnClase36);
				calefactores.add(btnClase37);
				calefactores.add(btnClase38);
				calefactores.add(btnClase39);
				calefactores.add(btnClase40);
				calefactores.add(btnClase41);
				calefactores.add(btnClase42);
				calefactores.add(btnClase43);
				calefactores.add(btnClase44);
				calefactores.add(btnClase45);
				calefactores.add(btnClase46);
				calefactores.add(btnClase47);
				calefactores.add(btnClase48);
		
				//Llenado arraylist Alarmas
				alarmas.add(btnClaseAlarma1);
				alarmas.add(btnClaseAlarma2);
				alarmas.add(btnClaseAlarma3);
				alarmas.add(btnClaseAlarma4);
				alarmas.add(btnClaseAlarma5);
				alarmas.add(btnClaseAlarma6);
				alarmas.add(btnClaseAlarma7);
				alarmas.add(btnClaseAlarma8);
				alarmas.add(btnClaseAlarma9);
				alarmas.add(btnClaseAlarma10);
				alarmas.add(btnClaseAlarma11);
				alarmas.add(btnClaseAlarma12);
				alarmas.add(btnClaseAlarma13);
				alarmas.add(btnClaseAlarma14);
				alarmas.add(btnClaseAlarma15);
				alarmas.add(btnClaseAlarma16);
				alarmas.add(btnClaseAlarma17);
				alarmas.add(btnClaseAlarma18);
				alarmas.add(btnClaseAlarma19);
				alarmas.add(btnClaseAlarma20);
				alarmas.add(btnClaseAlarma21);
				alarmas.add(btnClaseAlarma22);
				alarmas.add(btnClaseAlarma23);
				alarmas.add(btnClaseAlarma24);
				alarmas.add(btnClaseAlarma25);
				alarmas.add(btnClaseAlarma26);
				alarmas.add(btnClaseAlarma27);
				alarmas.add(btnClaseAlarma28);
				alarmas.add(btnClaseAlarma29);
				alarmas.add(btnClaseAlarma30);
				alarmas.add(btnClaseAlarma31);
				alarmas.add(btnClaseAlarma32);
				alarmas.add(btnClaseAlarma33);
				alarmas.add(btnClaseAlarma34);
				alarmas.add(btnClaseAlarma35);
				alarmas.add(btnClaseAlarma36);
				alarmas.add(btnClaseAlarma37);
				alarmas.add(btnClaseAlarma38);
				alarmas.add(btnClaseAlarma39);
				alarmas.add(btnClaseAlarma40);
				alarmas.add(btnClaseAlarma41);
				alarmas.add(btnClaseAlarma42);
				alarmas.add(btnClaseAlarma43);
				alarmas.add(btnClaseAlarma44);
				alarmas.add(btnClaseAlarma45);
				alarmas.add(btnClaseAlarma46);
				alarmas.add(btnClaseAlarma47);
				alarmas.add(btnClaseAlarma48);
				
		
		//ActionLIsteners
		btnAlarmas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//ALARMAS
				try 
				{
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost/reto_0","root", "");  
					Statement stmt=con.createStatement();  
					ResultSet rs=stmt.executeQuery("SELECT idAula, fechaHora FROM alarmas");  
					
					if(rs.first())
					{
						do
						{
							int activeA = rs.getInt("idAula");
							
							alarmas.get(activeA).setIcon(new ImageIcon("img/redCircle.png"));
							
						}while(rs.next());
					}
					else
					{
						int alarmasActivas = (int) (Math.random() * 10);
						
						for(int i = 0; i < alarmasActivas; i++)
						{
							int index = (int)(Math.random() * 49);
							
							stmt.executeUpdate("call spInsertAlarma(" + index + ")");
							
							alarmas.get(index).setIcon(new ImageIcon("img/redCircle.png"));
						}
						
					}

				} catch (Exception i) {
					// TODO Auto-generated catch block
					i.printStackTrace();
				}
				
				
				panelInicio.setVisible(false);
				panelAlarmas.setVisible(true);
				
			}
		});
		
		btnCalefaccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelInicio.setVisible(false);
				panelCalefaccion.setVisible(true);
			}
		});
		
		btnMenuAlarmas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelInicio.setVisible(true);
				panelAlarmas.setVisible(false);
			}
		});
		
		btnMenuCalefaccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelInicio.setVisible(true);
				panelCalefaccion.setVisible(false);
			}
		});	
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		actualizarCale(ae);

	}

	

	//Funciones
	public void actualizarCale(ActionEvent ae) {

		int indice = calefactores.indexOf(ae.getSource());
		
		int estado=0;

		if (aulas[indice].calefactor == 0) {

			aulas[indice].calefactor = 1;

			calefactores.get(indice).setBackground(Color.green);
			
			estado= 1;

		} else {

			aulas[indice].calefactor = 0;

			calefactores.get(indice).setBackground(Color.red);

			estado= 0;
		}
		
		actualizarBD(indice+1, estado);
	};

	

	public void actualizarBD(int idAula, int estado) {		

		try{

			Connection konexioa = DriverManager.getConnection("jdbc:mysql://localhost/reto_0", "root", "");

			// ondo burutu baldin bada

			System.out.println("Konexio egokia.");

			Statement st = konexioa.createStatement();

			st.executeUpdate("call spUpdateAula("+idAula+ ","+ estado+")");

			// Statement itxi kontsulta egin eta gero

			st.close();

			// konexioa itxi

			konexioa.close();

			} catch (SQLException sqle){

				// ez baldin bada konexioa era egokian egin

				sqle.printStackTrace();

				System.out.println("Konexio errorea");

			}
	}
	
}
