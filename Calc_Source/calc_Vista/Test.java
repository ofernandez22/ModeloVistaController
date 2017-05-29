package calc_Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import calc_Control.calc_Control;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Test extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Dato1;
	private JTextField Dato2;
	calc_Control con= new calc_Control();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
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
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 228, 249);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel label1 = new JLabel("Dato1");
		label1.setBounds(12, 5, 68, 36);
		label1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		Dato1 = new JTextField();
		Dato1.setBounds(98, 14, 28, 22);
		Dato1.setColumns(2);
		
		JLabel Label2 = new JLabel("Dato2");
		Label2.setBounds(12, 48, 68, 36);
		Label2.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		Dato2 = new JTextField();
		Dato2.setBounds(98, 57, 28, 22);
		Dato2.setColumns(2);
		
		JLabel Resultado = new JLabel("Resultado");
		Resultado.setBounds(12, 157, 176, 22);
		Resultado.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton button = new JButton("+");
		button.setBounds(21, 102, 41, 25);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int oper1;
				int oper2;
				int resp;
				oper1=Integer.parseInt(Dato1.getText());
				oper2=Integer.parseInt(Dato2.getText());
				resp=con.calcurladora_uso(oper1,oper2,"+");
				Resultado.setText("Respuesta:"+resp);		
				
			}
		});
		
		JButton button_1 = new JButton("-");
		button_1.setBounds(107, 102, 41, 25);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int oper1;
				int oper2;
				int resp;
				oper1=Integer.parseInt(Dato1.getText());
				oper2=Integer.parseInt(Dato2.getText());
				resp=con.calcurladora_uso(oper1,oper2,"-");
				Resultado.setText("Respuesta:"+resp);	
				
			}
		});
		panel.setLayout(null);
		panel.add(label1);
		panel.add(Dato1);
		panel.add(Label2);
		panel.add(Resultado);
		panel.add(button);
		panel.add(button_1);
		panel.add(Dato2);
	}
}
