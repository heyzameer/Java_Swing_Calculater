package calculater;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculater {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	int flag = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculater window = new Calculater();
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
	public Calculater() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 417,458);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 383, 71);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String backspace = textField.getText();
		        if (backspace.length() > 0) {
		            StringBuilder str = new StringBuilder(backspace);
		            char removedChar = str.charAt(backspace.length() - 1);
		            str.deleteCharAt(backspace.length() - 1);
		            textField.setText(str.toString());
		            
		            // Reset flag if dot is removed
		            if (removedChar == '.') {
		                flag = 0;
		            }
		        }
		    }
		});

		btnBackspace.setForeground(new Color(255, 0, 0));
		btnBackspace.setBackground(new Color(214, 214, 241));
		btnBackspace.setFont(new Font("wingdings", Font.BOLD, 18));
		btnBackspace.setBounds(10, 93, 89, 53);
		frame.getContentPane().add(btnBackspace);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				flag = 0;
			}
		});
		btnClear.setForeground(new Color(255, 0, 0));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBackground(new Color(214, 214, 241));
		btnClear.setBounds(109, 93, 89, 53);
		frame.getContentPane().add(btnClear);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn00.setForeground(new Color(0, 0, 0));
		btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn00.setBackground(new Color(214, 214, 241));
		btn00.setBounds(208, 93, 89, 53);
		frame.getContentPane().add(btn00);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="+";
				flag = 0;
			}
		});
		btnPlus.setForeground(new Color(0, 0, 0));
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBackground(new Color(123, 123, 123));
		btnPlus.setBounds(304, 93, 89, 53);
		frame.getContentPane().add(btnPlus);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setForeground(new Color(0, 0, 0));
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBackground(new Color(214, 214, 241));
		btn7.setBounds(10, 157, 89, 53);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setForeground(new Color(0, 0, 0));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBackground(new Color(214, 214, 241));
		btn4.setBounds(10, 221, 89, 53);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setForeground(new Color(0, 0, 0));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBackground(new Color(214, 214, 241));
		btn1.setBounds(10, 285, 89, 53);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setForeground(new Color(0, 0, 0));
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBackground(new Color(214, 214, 241));
		btn0.setBounds(10, 349, 89, 53);
		frame.getContentPane().add(btn0);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setForeground(new Color(0, 0, 0));
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBackground(new Color(214, 214, 241));
		btn8.setBounds(109, 157, 89, 53);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setForeground(new Color(0, 0, 0));
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBackground(new Color(214, 214, 241));
		btn5.setBounds(109, 221, 89, 53);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setForeground(new Color(0, 0, 0));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBackground(new Color(214, 214, 241));
		btn2.setBounds(109, 285, 89, 53);
		frame.getContentPane().add(btn2);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag == 0) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
				flag = 1;
				}
			}
		});
		btnDot.setForeground(new Color(0, 0, 0));
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBackground(new Color(214, 214, 241));
		btnDot.setBounds(109, 349, 89, 53);
		frame.getContentPane().add(btnDot);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setForeground(new Color(0, 0, 0));
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBackground(new Color(214, 214, 241));
		btn9.setBounds(208, 157, 89, 53);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setForeground(new Color(0, 0, 0));
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBackground(new Color(214, 214, 241));
		btn6.setBounds(208, 221, 89, 53);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setForeground(new Color(0, 0, 0));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBackground(new Color(214, 214, 241));
		btn3.setBounds(208, 285, 89, 53);
		frame.getContentPane().add(btn3);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation == "+") {
					result = first + second;
					answer =String.format("%.2f", result);
					textField.setText(answer);
				}else if(operation == "-") {
					result = first - second;
					answer =String.format("%.2f", result);
					textField.setText(answer);
				}else if(operation == "*") {
					result = first * second;
					answer =String.format("%.2f", result);
					textField.setText(answer);
				}else if(operation == "/") {
					result = first / second;
					answer =String.format("%.2f", result);
					textField.setText(answer);
				}else if(operation == "%") {
					result = first % second;
					answer =String.format("%.2f", result);
					textField.setText(answer);
				}
				
			}
		});
		btnEqual.setForeground(new Color(255, 0, 0));
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBackground(new Color(214, 214, 241));
		btnEqual.setBounds(208, 349, 89, 53);
		frame.getContentPane().add(btnEqual);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="-";
				flag =0;
			}
		});
		btnSub.setForeground(new Color(0, 0, 0));
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub.setBackground(new Color(123, 123, 123));
		btnSub.setBounds(304, 157, 89, 53);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="*";
				flag = 0;
			}
		});
		btnMul.setForeground(new Color(0, 0, 0));
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMul.setBackground(new Color(123, 123, 123));
		btnMul.setBounds(304, 221, 89, 53);
		frame.getContentPane().add(btnMul);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="%";
				flag = 0;
			}
		});
		btnPercent.setForeground(new Color(0, 0, 0));
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPercent.setBackground(new Color(123, 123, 123));
		btnPercent.setBounds(304, 349, 89, 53);
		frame.getContentPane().add(btnPercent);
		
		JButton btnDevide = new JButton("/");
		btnDevide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="/";
				flag =0;
			}
		});
		btnDevide.setForeground(new Color(0, 0, 0));
		btnDevide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDevide.setBackground(new Color(123, 123, 123));
		btnDevide.setBounds(304, 285, 89, 53);
		frame.getContentPane().add(btnDevide);
	}

}
