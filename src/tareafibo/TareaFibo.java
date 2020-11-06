package tareafibo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class TareaFibo extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeroA;
	private JTextField txtNumeroB;
	private JTextField txtIteraciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TareaFibo frame = new TareaFibo();
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
	public TareaFibo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNumeroA = new JTextField();
		txtNumeroA.setBounds(32, 44, 86, 20);
		contentPane.add(txtNumeroA);
		txtNumeroA.setColumns(10);
		
		txtNumeroB = new JTextField();
		txtNumeroB.setBounds(157, 44, 86, 20);
		contentPane.add(txtNumeroB);
		txtNumeroB.setColumns(10);
		
		txtIteraciones = new JTextField();
		txtIteraciones.setBounds(302, 44, 86, 20);
		contentPane.add(txtIteraciones);
		txtIteraciones.setColumns(10);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				int A,B, Iteraciones, Ciclo=1 , Resultado=0 ;
				String Cadena = "";
				A =  Integer.parseInt(txtNumeroA.getText());
				B = Integer.parseInt(txtNumeroB.getText());
				Iteraciones = Integer.parseInt(txtIteraciones.getText());
				
				while(Ciclo<=Iteraciones)
				{
					Resultado = A + B;
					Cadena = Cadena + " " + String.valueOf(Resultado);
					A = B;
					B = Resultado;
					Ciclo = Ciclo + 1;
				}
				JOptionPane.showMessageDialog(null, Cadena);
			}
		});
		btnImprimir.setBounds(32, 122, 89, 23);
		contentPane.add(btnImprimir);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				txtNumeroA.setText(null);
				txtNumeroB.setText(null);
				txtIteraciones.setText(null);
				JOptionPane.showMessageDialog(null, "Textos borrados");
			}
		});
		btnLimpiar.setBounds(275, 122, 89, 23);
		contentPane.add(btnLimpiar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				System.exit(WIDTH);
			}
		});
		btnSalir.setBounds(157, 177, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("NumeroA");
		lblNewLabel.setBounds(49, 22, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NumeroB");
		lblNewLabel_1.setBounds(175, 22, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Iteraciones");
		lblNewLabel_2.setBounds(318, 22, 62, 14);
		contentPane.add(lblNewLabel_2);
	}
}
