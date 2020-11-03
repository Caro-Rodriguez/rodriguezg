package tareajuego;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.util.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Ref;
public class codigojuego extends JFrame {

	private JPanel contentPane;
	private JButton btnIniciar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					codigojuego frame = new codigojuego();
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
	
	
	
	
	public codigojuego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 542, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

			
			
			JButton btnButton1 = new JButton("1");
			btnButton1.setBounds(5, 11, 74, 52);
			contentPane.add(btnButton1);
			
			JButton btnButton2 = new JButton("2");
			btnButton2.setBounds(83, 12, 74, 52);
			contentPane.add(btnButton2);
			
			JButton btnButton3 = new JButton("3");
			btnButton3.setBounds(161, 12, 74, 52);
			contentPane.add(btnButton3);
			
			JButton btnButton4 = new JButton("4");
			btnButton4.setBounds(239, 12, 74, 52);
			contentPane.add(btnButton4);
			
			JButton btnButton5 = new JButton("5");
			btnButton5.setBounds(317, 12, 74, 51);
			contentPane.add(btnButton5);
			
			JButton btnButton6 = new JButton("6");
			btnButton6.setBounds(5, 90, 74, 52);
			contentPane.add(btnButton6);
			
			JButton btnButton7 = new JButton("7");
			btnButton7.setBounds(83, 90, 74, 52);
			contentPane.add(btnButton7);
			
			JButton btnButton8 = new JButton("8");
			btnButton8.setBounds(161, 90, 74, 52);
			contentPane.add(btnButton8);
			
			JButton btnButton9 = new JButton("9");
			btnButton9.setBounds(239, 90, 74, 52);
			contentPane.add(btnButton9);
			
			JButton btnButton10 = new JButton("10");
			btnButton10.setBounds(317, 90, 74, 52);
			contentPane.add(btnButton10);
			
			JButton btnButton11 = new JButton("11");
			btnButton11.setBounds(5, 168, 74, 52);
			contentPane.add(btnButton11);
			
			JButton btnButton12 = new JButton("12");
			btnButton12.setBounds(83, 168, 74, 52);
			contentPane.add(btnButton12);
			
			JButton btnButton13 = new JButton("13");
			btnButton13.setBounds(161, 168, 74, 52);
			contentPane.add(btnButton13);
			
			JButton btnButton14 = new JButton("14");
			btnButton14.setBounds(239, 168, 74, 52);
			contentPane.add(btnButton14);
			
			JButton btnButton15 = new JButton("15");
			btnButton15.setBounds(317, 168, 74, 52);
			contentPane.add(btnButton15);
			
			JButton btnButton16 = new JButton("16");
			btnButton16.setBounds(5, 246, 74, 52);
			contentPane.add(btnButton16);
			
			JButton btnButton17 = new JButton("17");
			btnButton17.setBounds(83, 246, 74, 52);
			contentPane.add(btnButton17);
			
			JButton btnButton18 = new JButton("18");
			btnButton18.setBounds(161, 246, 74, 52);
			contentPane.add(btnButton18);
			
			JButton btnButton19 = new JButton("19");
			btnButton19.setBounds(239, 246, 74, 52);
			contentPane.add(btnButton19);
			
			JButton btnButton20 = new JButton("20");
			btnButton20.setBounds(317, 246, 74, 52);
			contentPane.add(btnButton20);
			
			JButton btnButton21 = new JButton("21");
			btnButton21.setBounds(5, 324, 74, 52);
			contentPane.add(btnButton21);
			
			JButton btnButton22 = new JButton("22");
			btnButton22.setBounds(83, 324, 74, 52);
			contentPane.add(btnButton22);
			
			JButton btnButton23 = new JButton("23");
			btnButton23.setBounds(161, 324, 74, 52);
			contentPane.add(btnButton23);
			
			JButton btnButton24 = new JButton("24");
			btnButton24.setBounds(239, 324, 74, 52);
			contentPane.add(btnButton24);
			
			JButton btnButton25 = new JButton("");
			btnButton25.setBounds(317, 324, 74, 52);
			contentPane.add(btnButton25);
			JButton[] ArrayJButtons = {btnButton1,btnButton2,btnButton3,btnButton4,btnButton5,btnButton6,btnButton7,btnButton8,btnButton9,btnButton10,btnButton11,btnButton12,btnButton13,btnButton14,btnButton15,btnButton16,btnButton17,btnButton18,btnButton19,btnButton20,btnButton21,btnButton22,btnButton23,btnButton24,btnButton25};
			for (JButton b : ArrayJButtons) {
			    b.setEnabled(false);
			}
			btnIniciar = new JButton("Iniciar");
			btnIniciar.setBounds(83, 390, 74, 37);
			btnIniciar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(true);
					}
					for(int x = 0; x<=24; x++)
					{
						ArrayJButtons[x].setText("");
					}
					RandomNum();
					for(int y = 0; y<=23; y++)
					{
						ArrayJButtons[y].setText(Integer.toString(array[y]));
					}
					btnIniciar.setEnabled(false);
					JButton[] ArrayJButtons25 = {btnButton1,btnButton2,btnButton3,btnButton4,btnButton5,btnButton6,btnButton7,btnButton8,btnButton9,btnButton10,btnButton11,btnButton12,btnButton13,btnButton14,btnButton15,btnButton16,btnButton17,btnButton18,btnButton19,btnButton21,btnButton22,btnButton23,btnButton25};
					for (JButton b : ArrayJButtons25) {
					    b.setEnabled(false);}
				}
			});
			
			
			contentPane.add(btnIniciar);
			
			JButton btnSalir = new JButton("Salir");
			btnSalir.setBounds(211, 387, 79, 43);
			btnSalir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int O = JOptionPane.showInternalConfirmDialog(null, "¿Desea abandonar?","¿Seguro?", JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_NO_OPTION);
					if(O == JOptionPane.YES_OPTION) {
						System.exit(0);
					}
				}
			});
			contentPane.add(btnSalir);
			
			btnButton1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(false);}
					btnButton2.setEnabled(true);
					btnButton6.setEnabled(true);
					if(btnButton2.getText() == "") 
					{
						btnButton2.setText(btnButton1.getText());
						btnButton1.setText("");
					}
					if(btnButton6.getText() == "")
					{
						btnButton6.setText(btnButton1.getText());
						btnButton1.setText("");
					}
					if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
					{
						JOptionPane.showMessageDialog(null, "GANASTE!" + btnButton1.getText(),"FELICIDADES!!", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				});
			btnButton2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(false);}
					btnButton3.setEnabled(true);
					btnButton7.setEnabled(true);
					btnButton1.setEnabled(true);
					if(btnButton3.getText() == "") 
					{
						btnButton3.setText(btnButton2.getText());
						btnButton2.setText("");
					}
					if(btnButton7.getText() == "")
					{
						btnButton7.setText(btnButton2.getText());
						btnButton2.setText("");
					}
					if(btnButton1.getText() == "")
					{
						btnButton1.setText(btnButton2.getText());
						btnButton2.setText("");
					}
					if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
					{
						JOptionPane.showMessageDialog(null, "GANASTE!! " + btnButton1.getText(),"FELICIDADES!!", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				});
			btnButton3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(false);}
					btnButton4.setEnabled(true);
					btnButton8.setEnabled(true);
					btnButton2.setEnabled(true);
					if(btnButton4.getText() == "") 
					{
						btnButton4.setText(btnButton3.getText());
						btnButton3.setText("");
					}
					if(btnButton8.getText() == "")
					{
						btnButton8.setText(btnButton3.getText());
						btnButton3.setText("");
					}
					if(btnButton2.getText() == "")
					{
						btnButton2.setText(btnButton3.getText());
						btnButton3.setText("");
					}
					if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
					{
						JOptionPane.showMessageDialog(null, "GANASTE!" + btnButton1.getText(),"FELICIDADES!!", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				});
			btnButton4.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(false);}
					btnButton5.setEnabled(true);
					btnButton9.setEnabled(true);
					btnButton3.setEnabled(true);
					if(btnButton5.getText() == "") 
					{
						btnButton5.setText(btnButton4.getText());
						btnButton4.setText("");
					}
					if(btnButton9.getText() == "")
					{
						btnButton9.setText(btnButton4.getText());
						btnButton4.setText("");
					}
					if(btnButton3.getText() == "")
					{
						btnButton3.setText(btnButton4.getText());
						btnButton4.setText("");
					}
					if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
					{
						JOptionPane.showMessageDialog(null, "Haz ganado" + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				});
			btnButton5.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(false);}
					btnButton10.setEnabled(true);
					btnButton4.setEnabled(true);
					if(btnButton10.getText() == "") 
					{
						btnButton10.setText(btnButton5.getText());
						btnButton5.setText("");
					}
					if(btnButton4.getText() == "")
					{
						btnButton4.setText(btnButton5.getText());
						btnButton5.setText("");
					}
					if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
					{
						JOptionPane.showMessageDialog(null, "GANASTE" + btnButton1.getText(),"FELICIDADES", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				});
			btnButton6.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(false);}
					btnButton7.setEnabled(true);
					btnButton11.setEnabled(true);
					btnButton1.setEnabled(true);
					if(btnButton7.getText() == "") 
					{
						btnButton7.setText(btnButton6.getText());
						btnButton6.setText("");
					}
					if(btnButton11.getText() == "")
					{
						btnButton11.setText(btnButton6.getText());
						btnButton6.setText("");
					}
					if(btnButton1.getText() == "")
					{
						btnButton1.setText(btnButton6.getText());
						btnButton6.setText("");
					}
					if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
					{
						JOptionPane.showMessageDialog(null, "Haz ganado " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				});
			btnButton7.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(false);}
					btnButton8.setEnabled(true);
					btnButton12.setEnabled(true);
					btnButton6.setEnabled(true);
					btnButton2.setEnabled(true);
					if(btnButton8.getText() == "") 
					{
						btnButton8.setText(btnButton7.getText());
						btnButton7.setText("");
					}
					if(btnButton12.getText() == "")
					{
						btnButton12.setText(btnButton7.getText());
						btnButton7.setText("");
					}
					if(btnButton6.getText() == "")
					{
						btnButton6.setText(btnButton7.getText());
						btnButton7.setText("");
					}
					if(btnButton2.getText() == "")
					{
						btnButton2.setText(btnButton7.getText());
						btnButton7.setText("");
					}
					if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
					{
						JOptionPane.showMessageDialog(null, "GANASTE" + btnButton1.getText(),"FELICIDADES", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				});
			btnButton8.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(false);}
					btnButton9.setEnabled(true);
					btnButton13.setEnabled(true);
					btnButton7.setEnabled(true);
					btnButton3.setEnabled(true);
					if(btnButton9.getText() == "") 
					{
						btnButton9.setText(btnButton8.getText());
						btnButton8.setText("");
					}
					if(btnButton13.getText() == "")
					{
						btnButton13.setText(btnButton8.getText());
						btnButton8.setText("");
					}
					if(btnButton7.getText() == "")
					{
						btnButton7.setText(btnButton8.getText());
						btnButton8.setText("");
					}
					if(btnButton3.getText() == "")
					{
						btnButton3.setText(btnButton8.getText());
						btnButton8.setText("");
					}
					if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
					{
						JOptionPane.showMessageDialog(null, "GANASTE" + btnButton1.getText(),"FELICIDADES", JOptionPane.INFORMATION_MESSAGE);
					}
					
				}
				});
			btnButton9.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(false);}
					btnButton10.setEnabled(true);
					btnButton14.setEnabled(true);
					btnButton8.setEnabled(true);
					btnButton4.setEnabled(true);
					if(btnButton10.getText() == "") 
					{
						btnButton10.setText(btnButton9.getText());
						btnButton9.setText("");
					}
					if(btnButton14.getText() == "")
					{
						btnButton14.setText(btnButton9.getText());
						btnButton9.setText("");
					}
					if(btnButton8.getText() == "")
					{
						btnButton8.setText(btnButton9.getText());
						btnButton9.setText("");
					}
					if(btnButton4.getText() == "")
					{
						btnButton4.setText(btnButton9.getText());
						btnButton9.setText("");
					}
					if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
					{
						JOptionPane.showMessageDialog(null, "GANASTE! " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				});
			btnButton10.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(false);}
					btnButton15.setEnabled(true);
					btnButton9.setEnabled(true);
					btnButton5.setEnabled(true);
					if(btnButton15.getText() == "") 
					{
						btnButton15.setText(btnButton10.getText());
						btnButton10.setText("");
					}
					if(btnButton9.getText() == "")
					{
						btnButton9.setText(btnButton10.getText());
						btnButton10.setText("");
					}
					if(btnButton5.getText() == "")
					{
						btnButton5.setText(btnButton10.getText());
						btnButton10.setText("");
					}
					if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
					{
						JOptionPane.showMessageDialog(null, "GANASTE!" + btnButton1.getText(),"FELICIDADES!!", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				});
			btnButton11.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(false);}
					btnButton12.setEnabled(true);
					btnButton16.setEnabled(true);
					btnButton6.setEnabled(true);
					if(btnButton12.getText() == "") 
					{
						btnButton12.setText(btnButton11.getText());
						btnButton11.setText("");
					}
					if(btnButton6.getText() == "")
					{
						btnButton6.setText(btnButton11.getText());
						btnButton11.setText("");
					}
					if(btnButton16.getText() == "")
					{
						btnButton16.setText(btnButton11.getText());
						btnButton11.setText("");
					}
					if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
					{
						JOptionPane.showMessageDialog(null, "GANASTE!" + btnButton1.getText(),"FELICIDADES!!", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				});
			btnButton12.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(false);}
					btnButton13.setEnabled(true);
					btnButton17.setEnabled(true);
					btnButton11.setEnabled(true);
					btnButton7.setEnabled(true);
					if(btnButton13.getText() == "") 
					{
						btnButton13.setText(btnButton12.getText());
						btnButton12.setText("");
					}
					if(btnButton17.getText() == "")
					{
						btnButton17.setText(btnButton12.getText());
						btnButton12.setText("");
					}
					if(btnButton11.getText() == "")
					{
						btnButton11.setText(btnButton12.getText());
						btnButton12.setText("");
					}
					if(btnButton7.getText() == "")
					{
						btnButton7.setText(btnButton12.getText());
						btnButton12.setText("");
					}
					if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
					{
						JOptionPane.showMessageDialog(null, "GANASTE!" + btnButton1.getText(),"FELICIDADES!!", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				});
			btnButton13.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(false);}
					btnButton14.setEnabled(true);
					btnButton18.setEnabled(true);
					btnButton12.setEnabled(true);
					btnButton8.setEnabled(true);
					if(btnButton14.getText() == "") 
					{
						btnButton14.setText(btnButton13.getText());
						btnButton13.setText("");
					}
					if(btnButton18.getText() == "")
					{
						btnButton18.setText(btnButton13.getText());
						btnButton13.setText("");
					}
					if(btnButton12.getText() == "")
					{
						btnButton12.setText(btnButton13.getText());
						btnButton13.setText("");
					}
					if(btnButton8.getText() == "")
					{
						btnButton8.setText(btnButton13.getText());
						btnButton13.setText("");
					}
					if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
					{
						JOptionPane.showMessageDialog(null, "GANASTE!" + btnButton1.getText(),"FELICIDADES!!", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				});
			btnButton14.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(false);}
					btnButton15.setEnabled(true);
					btnButton19.setEnabled(true);
					btnButton13.setEnabled(true);
					btnButton9.setEnabled(true);
					if(btnButton15.getText() == "") 
					{
						btnButton15.setText(btnButton14.getText());
						btnButton14.setText("");
					}
					if(btnButton19.getText() == "")
					{
						btnButton19.setText(btnButton14.getText());
						btnButton14.setText("");
					}
					if(btnButton13.getText() == "")
					{
						btnButton13.setText(btnButton14.getText());
						btnButton14.setText("");
					}
					if(btnButton9.getText() == "")
					{
						btnButton9.setText(btnButton14.getText());
						btnButton14.setText("");
					}
					if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
					{
						JOptionPane.showMessageDialog(null, "GANASTE!" + btnButton1.getText(),"FELICIDADES!!",JOptionPane.INFORMATION_MESSAGE);
					}
				}
				});
			btnButton15.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(false);}
					btnButton20.setEnabled(true);
					btnButton14.setEnabled(true);
					btnButton10.setEnabled(true);
					if(btnButton20.getText() == "") 
					{
						btnButton20.setText(btnButton15.getText());
						btnButton15.setText("");
					}
					if(btnButton14.getText() == "")
					{
						btnButton14.setText(btnButton15.getText());
						btnButton15.setText("");
					}
					if(btnButton10.getText() == "")
					{
						btnButton10.setText(btnButton15.getText());
						btnButton15.setText("");
					}
					if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
					{
						JOptionPane.showMessageDialog(null, "GANASTE!" + btnButton1.getText(),"FELICIDADES!!", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				});
			btnButton16.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(false);}
					btnButton17.setEnabled(true);
					btnButton21.setEnabled(true);
					btnButton11.setEnabled(true);
					if(btnButton17.getText() == "") 
					{
						btnButton17.setText(btnButton16.getText());
						btnButton16.setText("");
					}
					if(btnButton21.getText() == "")
					{
						btnButton21.setText(btnButton16.getText());
						btnButton16.setText("");
					}
					if(btnButton11.getText() == "")
					{
						btnButton11.setText(btnButton16.getText());
						btnButton16.setText("");
					}
					if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
					{
						JOptionPane.showMessageDialog(null, "GANASTE!" + btnButton1.getText(),"FELICIDADES!!", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				});
			btnButton17.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(false);}
					btnButton18.setEnabled(true);
					btnButton22.setEnabled(true);
					btnButton16.setEnabled(true);
					btnButton12.setEnabled(true);
					if(btnButton18.getText() == "") 
					{
						btnButton18.setText(btnButton17.getText());
						btnButton17.setText("");
					}
					if(btnButton22.getText() == "")
					{
						btnButton22.setText(btnButton17.getText());
						btnButton17.setText("");
					}
					if(btnButton16.getText() == "")
					{
						btnButton16.setText(btnButton17.getText());
						btnButton17.setText("");
					}
					if(btnButton12.getText() == "")
					{
						btnButton12.setText(btnButton17.getText());
						btnButton17.setText("");
					}
					if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
					{
						JOptionPane.showMessageDialog(null, "GANASTE!" + btnButton1.getText(),"FELICIDADES!!", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				});
			btnButton18.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(false);}
					btnButton19.setEnabled(true);
					btnButton23.setEnabled(true);
					btnButton17.setEnabled(true);
					btnButton13.setEnabled(true);
					if(btnButton19.getText() == "") 
					{
						btnButton19.setText(btnButton18.getText());
						btnButton18.setText("");
					}
					if(btnButton23.getText() == "")
					{
						btnButton23.setText(btnButton18.getText());
						btnButton18.setText("");
					}
					if(btnButton17.getText() == "")
					{
						btnButton17.setText(btnButton18.getText());
						btnButton18.setText("");
					}
					if(btnButton13.getText() == "")
					{
						btnButton13.setText(btnButton18.getText());
						btnButton18.setText("");
					}
					if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
					{
						JOptionPane.showMessageDialog(null, "GANASTE!" + btnButton1.getText(),"FELICIDADES!!", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				});
			btnButton19.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(false);}
					btnButton24.setEnabled(true);
					btnButton20.setEnabled(true);
					btnButton14.setEnabled(true);
					btnButton18.setEnabled(true);
					if(btnButton24.getText() == "") 
					{
						btnButton24.setText(btnButton19.getText());
						btnButton19.setText("");
					}
					if(btnButton20.getText() == "")
					{
						btnButton20.setText(btnButton19.getText());
						btnButton19.setText("");
					}
					if(btnButton14.getText() == "")
					{
						btnButton14.setText(btnButton19.getText());
						btnButton19.setText("");
					}
					if(btnButton18.getText() == "")
					{
						btnButton18.setText(btnButton19.getText());
						btnButton19.setText("");
					}
					if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
					{
						JOptionPane.showMessageDialog(null, "GANASTE!" + btnButton1.getText(),"FELICIDADES!!",JOptionPane.INFORMATION_MESSAGE);
					}
				}
				});
			btnButton20.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(false);}
					btnButton25.setEnabled(true);
					btnButton19.setEnabled(true);
					btnButton15.setEnabled(true);
					if(btnButton25.getText() == "") 
					{
						btnButton25.setText(btnButton20.getText());
						btnButton20.setText("");
					}
					if(btnButton19.getText() == "")
					{
						btnButton19.setText(btnButton20.getText());
						btnButton20.setText("");
					}
					if(btnButton15.getText() == "")
					{
						btnButton15.setText(btnButton20.getText());
						btnButton20.setText("");
					}
					if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
					{
						JOptionPane.showMessageDialog(null, "GANASTE!" + btnButton1.getText(),"FELICIDADES!!", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				});
			btnButton21.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(false);}
					btnButton22.setEnabled(true);
					btnButton16.setEnabled(true);
					if(btnButton22.getText() == "") 
					{
						btnButton22.setText(btnButton21.getText());
						btnButton21.setText("");
					}
					if(btnButton16.getText() == "")
					{
						btnButton16.setText(btnButton21.getText());
						btnButton21.setText("");
					}
					if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
					{
						JOptionPane.showMessageDialog(null, "GANASTE!" + btnButton1.getText(),"FELICIDADES!!", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				});
			btnButton22.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(false);}
					btnButton23.setEnabled(true);
					btnButton17.setEnabled(true);
					btnButton21.setEnabled(true);
					if(btnButton23.getText() == "") 
					{
						btnButton23.setText(btnButton22.getText());
						btnButton22.setText("");
					}
					if(btnButton17.getText() == "")
					{
						btnButton17.setText(btnButton22.getText());
						btnButton22.setText("");
					}
					if(btnButton21.getText() == "")
					{
						btnButton21.setText(btnButton22.getText());
						btnButton22.setText("");
					}
					if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
					{
						JOptionPane.showMessageDialog(null, "GANASTE!" + btnButton1.getText(),"FELICIDADES!!",JOptionPane.INFORMATION_MESSAGE);
					}
				}
				});
			btnButton23.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(false);}
					btnButton24.setEnabled(true);
					btnButton18.setEnabled(true);
					btnButton22.setEnabled(true);
					if(btnButton24.getText() == "") 
					{
						btnButton24.setText(btnButton23.getText());
						btnButton23.setText("");
					}
					if(btnButton18.getText() == "")
					{
						btnButton18.setText(btnButton23.getText());
						btnButton23.setText("");
					}
					if(btnButton22.getText() == "")
					{
						btnButton22.setText(btnButton23.getText());
						btnButton23.setText("");
					}
					if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
					{
						JOptionPane.showMessageDialog(null, "GANASTE!" + btnButton1.getText(),"FELICIDADES!!", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				});
			btnButton24.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(false);}
					btnButton25.setEnabled(true);
					btnButton23.setEnabled(true);
					btnButton19.setEnabled(true);
					if(btnButton25.getText() == "") 
					{
						btnButton25.setText(btnButton24.getText());
						btnButton24.setText("");
					}
					if(btnButton23.getText() == "")
					{
						btnButton23.setText(btnButton24.getText());
						btnButton24.setText("");
					}
					if(btnButton19.getText() == "")
					{
						btnButton19.setText(btnButton24.getText());
						btnButton24.setText("");
					}
					if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
					{
						JOptionPane.showMessageDialog(null, "GANASTE!" + btnButton1.getText(),"FELICIDADES!!", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				});
			btnButton25.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JButton b : ArrayJButtons) {
					    b.setEnabled(false);}
					btnButton24.setEnabled(true);
					btnButton20.setEnabled(true);
					if(btnButton24.getText() == "") 
					{
						btnButton24.setText(btnButton25.getText());
						btnButton25.setText("");
					}
					if(btnButton20.getText() == "")
					{
						btnButton20.setText(btnButton25.getText());
						btnButton25.setText("");
					}
					if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
					{
						JOptionPane.showMessageDialog(null, "GANASTE!" + btnButton1.getText(),"FELICIDADES!!", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				});
		}
		
		
		int[] array = new int[24];
		
		public void RandomNum()
		{
			
			int[] random = new int[24];
			
			for(int x = 0; x < random.length; x++) 
			{
			random[x] = x;
			}
				int rand;
				for(int x = 0; x < random.length; x++) 
			{
			rand = (int)(Math.random()*24);
			
				while(random[rand] == -1) 
				{
					rand = (int)(Math.random()*24);
				}
					
				if(random[rand] != -1) 
				{
					array[x] = random[rand]; 
				}			
				random[rand] = -1; 
			}

			for(int x = 0; x < array.length; x++) 
			{
				array[x] = array[x] + 1;
			}
	}

}
