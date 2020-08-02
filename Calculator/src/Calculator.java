import java.awt.EventQueue;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.Color;
//import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JLabel;
public class Calculator implements ActionListener {

	public JFrame frmInterestingCalculator;
	public JTextField input;
	public JTextField result;
	public JButton button_0,button_1,button_2,button_3,button_4,button_5,button_6,button_7,button_8,button_9,button_del,button_clear,
	button_plus,button_minus,button_multiply,button_division,button_decimalp,button_sqrt,button_pow,button_result;
	
	
	 public void initialize() {
		frmInterestingCalculator = new JFrame();
		frmInterestingCalculator.setTitle("Interesting Calculator");
		frmInterestingCalculator.getContentPane().setForeground(new Color(102, 255, 51));
		frmInterestingCalculator.getContentPane().setBackground(SystemColor.textHighlight);
		frmInterestingCalculator.setBounds(100, 100, 457, 488);
		frmInterestingCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInterestingCalculator.getContentPane().setLayout(null);
		
		button_del = new JButton("D");
		button_del.setForeground(SystemColor.textHighlight);
		button_del.setBackground(new Color(255, 255, 255));
		button_del.setFont(new Font("Tahoma", Font.PLAIN, 23));
		button_del.setBounds(30, 356, 50, 75);
		button_del.addActionListener(this);
		frmInterestingCalculator.getContentPane().add(button_del);
		
		button_0 = new JButton("");
		button_0.setIcon(new ImageIcon(Calculator.class.getResource("/Images/0.jpg")));
		button_0.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_0.setBackground(Color.WHITE);
		button_0.setBounds(110, 356, 50, 75);
		button_0.addActionListener(this);
		frmInterestingCalculator.getContentPane().add(button_0);
		
		button_clear = new JButton("C");
		button_clear.setForeground(SystemColor.textHighlight);
		button_clear.setFont(new Font("Tahoma", Font.PLAIN, 27));
		button_clear.setBackground(Color.WHITE);
		button_clear.setBounds(187, 356, 50, 75);
		button_clear.addActionListener(this);
		frmInterestingCalculator.getContentPane().add(button_clear);
		
		button_9 = new JButton("");
		button_9.setIcon(new ImageIcon(Calculator.class.getResource("/Images/9.jpg")));
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_9.setBackground(Color.WHITE);
		button_9.setBounds(187, 270, 50, 75);
		button_9.addActionListener(this);
		frmInterestingCalculator.getContentPane().add(button_9);
		
		button_8 = new JButton("");
		button_8.setIcon(new ImageIcon(Calculator.class.getResource("/Images/8.jpg")));
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_8.setBackground(Color.WHITE);
		button_8.setBounds(110, 270, 50, 75);
		button_8.addActionListener(this);
		frmInterestingCalculator.getContentPane().add(button_8);
		
		button_7 = new JButton("");
		button_7.setIcon(new ImageIcon(Calculator.class.getResource("/Images/7.jpg")));
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_7.setBackground(Color.WHITE);
		button_7.setBounds(30, 270, 50, 75);
		button_7.addActionListener(this);
		frmInterestingCalculator.getContentPane().add(button_7);
		
		button_6 = new JButton("");
		button_6.setIcon(new ImageIcon(Calculator.class.getResource("/Images/6.jpg")));
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_6.setBackground(Color.WHITE);
		button_6.setBounds(187, 184, 50, 75);
		button_6.addActionListener(this);
		frmInterestingCalculator.getContentPane().add(button_6);
		
		button_5 = new JButton("");
		button_5.setIcon(new ImageIcon(Calculator.class.getResource("/Images/5.jpg")));
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(110, 184, 50, 75);
		button_5.addActionListener(this);
		frmInterestingCalculator.getContentPane().add(button_5);
		
		button_4 = new JButton("");
		button_4.setIcon(new ImageIcon(Calculator.class.getResource("/Images/4.jpg")));
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(30, 184, 50, 75);
		button_4.addActionListener(this);
		frmInterestingCalculator.getContentPane().add(button_4);
		
		button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(Calculator.class.getResource("/Images/2.jpg")));
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(110, 98, 50, 75);
		button_2.addActionListener(this);
		frmInterestingCalculator.getContentPane().add(button_2);
		
		button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(Calculator.class.getResource("/Images/1.jpg")));
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(30, 98, 50, 75);
		button_1.addActionListener(this);
		frmInterestingCalculator.getContentPane().add(button_1);
		
		button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(Calculator.class.getResource("/Images/3.jpg")));
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(187, 98, 50, 75);
		button_3.addActionListener(this);
		frmInterestingCalculator.getContentPane().add(button_3);
		
		input = new JTextField();
		input.setFont(new Font("Tahoma", Font.PLAIN, 15));
		input.setForeground(SystemColor.textHighlight);
		input.setBounds(89, 11, 279, 28);
		frmInterestingCalculator.getContentPane().add(input);
		input.setColumns(10);
		
		result = new JTextField();
		result.setFont(new Font("Tahoma", Font.PLAIN, 20));
		result.setForeground(new Color(153, 204, 51));
		result.setBounds(89, 38, 279, 53);
		frmInterestingCalculator.getContentPane().add(result);
		result.setColumns(10);
		
	    button_plus = new JButton("+");
		button_plus.setForeground(new Color(153, 204, 51));
		button_plus.setFont(new Font("Tahoma", Font.PLAIN, 22));
		button_plus.setBackground(Color.WHITE);
		button_plus.setBounds(261, 98, 50, 75);
		button_plus.addActionListener(this);
		frmInterestingCalculator.getContentPane().add(button_plus);
		
		button_minus = new JButton("-");
		button_minus.setForeground(new Color(153, 204, 51));
		button_minus.setFont(new Font("Tahoma", Font.PLAIN, 35));
		button_minus.setBackground(Color.WHITE);
		button_minus.setBounds(261, 184, 50, 75);
		button_minus.addActionListener(this);
		frmInterestingCalculator.getContentPane().add(button_minus);
		
		button_division = new JButton("/");
		button_division.setForeground(new Color(153, 204, 51));
		button_division.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_division.setBackground(Color.WHITE);
		button_division.setBounds(261, 270, 50, 75);
		button_division.addActionListener(this);
		frmInterestingCalculator.getContentPane().add(button_division);
		
		button_multiply = new JButton("*");
		button_multiply.setForeground(new Color(153, 204, 51));
		button_multiply.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_multiply.setBackground(Color.WHITE);
		button_multiply.setBounds(261, 356, 50, 75);
		button_multiply.addActionListener(this);
		frmInterestingCalculator.getContentPane().add(button_multiply);
		
		button_decimalp = new JButton(".");
		button_decimalp.setForeground(new Color(153, 204, 51));
		button_decimalp.setFont(new Font("Tahoma", Font.PLAIN, 50));
		button_decimalp.setBackground(Color.WHITE);
		button_decimalp.setBounds(336, 98, 50, 75);
		button_decimalp.addActionListener(this);
		frmInterestingCalculator.getContentPane().add(button_decimalp);
		
		button_sqrt = new JButton("\u221A");
		button_sqrt.setForeground(new Color(153, 204, 51));
		button_sqrt.setFont(new Font("Tahoma", Font.PLAIN, 22));
		button_sqrt.setBackground(Color.WHITE);
		button_sqrt.setBounds(336, 184, 50, 75);
		button_sqrt.addActionListener(this);
		frmInterestingCalculator.getContentPane().add(button_sqrt);
		
		button_pow = new JButton("^");
		button_pow.setForeground(new Color(153, 204, 51));
		button_pow.setFont(new Font("Tahoma", Font.PLAIN, 22));
		button_pow.setBackground(Color.WHITE);
		button_pow.setBounds(336, 270, 50, 75);
		button_pow.addActionListener(this);
		frmInterestingCalculator.getContentPane().add(button_pow);
		
		button_result = new JButton("=");
		button_result.setForeground(SystemColor.textHighlight);
		button_result.setFont(new Font("Tahoma", Font.PLAIN, 22));
		button_result.setBackground(Color.WHITE);
		button_result.setBounds(336, 356, 50, 75);
		button_result.addActionListener(this);
		frmInterestingCalculator.getContentPane().add(button_result);
		
		JLabel lblInput = new JLabel("Input:");
		lblInput.setForeground(new Color(153, 204, 51));
		lblInput.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblInput.setBounds(10, 5, 70, 28);
		frmInterestingCalculator.getContentPane().add(lblInput);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setForeground(new Color(153, 204, 51));
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblResult.setBounds(10, 48, 80, 28);
		frmInterestingCalculator.getContentPane().add(lblResult);
		
		JButton btnNewButton = new JButton("Info");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnNewButton.setBounds(378, 27, 53, 49);
		frmInterestingCalculator.getContentPane().add(btnNewButton);}
	 
		public void actionPerformed(ActionEvent buttonpress) {
			if(buttonpress.getSource()==button_0) {
				input.setText(input.getText().concat("0"));}
			if(buttonpress.getSource()==button_1) {
				input.setText(input.getText().concat("1"));}
			if(buttonpress.getSource()==button_2) {
				input.setText(input.getText().concat("2"));}
			if(buttonpress.getSource()==button_3) {
				input.setText(input.getText().concat("3"));}
			if(buttonpress.getSource()==button_4) {
				input.setText(input.getText().concat("4"));}
			if(buttonpress.getSource()==button_5) {
				input.setText(input.getText().concat("5"));}
			if(buttonpress.getSource()==button_6) {
				input.setText(input.getText().concat("6"));}
			if(buttonpress.getSource()==button_7) {
				input.setText(input.getText().concat("7"));}
			if(buttonpress.getSource()==button_8) {
				input.setText(input.getText().concat("8"));}
			if(buttonpress.getSource()==button_9) {
				input.setText(input.getText().concat("9"));}
			if(buttonpress.getSource()==button_del) {
				input.setText(input.getText().substring(0, input.getText ().length() - 1));}
			if(buttonpress.getSource()==button_clear) {
				input.setText(input.getText().substring(0,0));}
			if(buttonpress.getSource()==button_plus) {
				input.setText(input.getText()+"+");}
			if(buttonpress.getSource()==button_minus) {
				input.setText(input.getText()+"-");}
			if(buttonpress.getSource()==button_multiply) {
				input.setText(input.getText()+"*");}
			if(buttonpress.getSource()==button_division) {
				input.setText(input.getText().concat("/"));}
			if(buttonpress.getSource()==button_decimalp) {
				input.setText(input.getText().concat("."));}
			if(buttonpress.getSource()==button_sqrt) {
				input.setText(input.getText().concat("\u221A"));}
			if(buttonpress.getSource()==button_pow) {
				input.setText(input.getText().concat("^"));}
			if(buttonpress.getSource()==button_result) 
			{   finalRes=0;
				String inputtemp;
			    inputtemp=(input.getText());
			    char tempchar[]=inputtemp.toCharArray();
			    signCheck(tempchar);
				}
			}
				
				int indexToDeleteL;
				int indexToDeleteR;
			    char charArr[];
			    double finalRes=0;
			    double tempRes=0;
			    char tempExpr[];
			    
					public void calculate() {         };
		
						public void signCheck(char array[]) {
							int i=0;
							for(i=0;i<array.length;i++) {
								if(array[i]=='*') {
									String s1=switchNumFinder_right(array,i);
									String s2=switchNumFinder_left(array,i);
									double num1=Double.valueOf(s1);
									double num2=Double.valueOf(s2);
									tempRes=tempRes*(num1*num2);
									
									result.setText(Double.toString(tempRes));
									}
								}
								
						}
								
							
						public String switchNumFinder_right(char arr[],int startingIndex) {
							String number="";
							indexToDeleteR=startingIndex;
							do {startingIndex++;
							
								if(startingIndex<arr.length) {
								switch(arr[startingIndex]) {
								case '0': number=number+"0";
								break;
								case '1': number=number+"1";
								break;
								case '2': number=number+"2";
								break;
								case '3': number=number+"3";
								break;
								case '4': number=number+"4";
								break;
								case '5': number=number+"5";
								break;
								case '6': number=number+"6";
								break;
								case '7': number=number+"7";
								break;
								case '8': number=number+"8";
								break;
								case '9': number=number+"9";
								break;
								};}else break;
							}
							while( arr[startingIndex]=='1'||arr[startingIndex]=='2'||arr[startingIndex]=='3'||arr[startingIndex]=='4'||arr[startingIndex]=='5'
									||arr[startingIndex]=='6'||arr[startingIndex]=='7'||arr[startingIndex]=='8'||arr[startingIndex]=='9'||arr[startingIndex]=='0');
							System.arraycopy(arr, 0, charArr, 0, indexToDeleteR-1);
							System.arraycopy(arr, charArr.length-1, charArr, startingIndex, arr.length-startingIndex-1);
							System.out.println(charArr);
						return number;
						}
								
							
						
						public String switchNumFinder_left(char arr[],int startingIndex) {
							String number="";
							
							do {startingIndex--;
								if(startingIndex>=0) {
								switch(arr[startingIndex]) {
								case '0': number=number+"0";
								break;
								case '1': number=number+"1";
								break;
								case '2': number=number+"2";
								break;
								case '3': number=number+"3";
								break;
								case '4': number=number+"4";
								break;
								case '5': number=number+"5";
								break;
								case '6': number=number+"6";
								break;
								case '7': number=number+"7";
								break;
								case '8': number=number+"8";
								break;
								case '9': number=number+"9";
								break;}}else 
									break;
							}
							while(arr[startingIndex]=='1'||arr[startingIndex]=='2'||arr[startingIndex]=='3'||arr[startingIndex]=='4'||arr[startingIndex]=='5'
									||arr[startingIndex]=='6'||arr[startingIndex]=='7'||arr[startingIndex]=='8'||arr[startingIndex]=='9'||arr[startingIndex]=='0');
							indexToDeleteL=++startingIndex;
							StringBuilder number_ =new StringBuilder();
							number_.append(number);
							number_.reverse();
							number=number_.toString();
						return number;
						}
								
		
		
			
	 
	 public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			
				Calculator calc = new Calculator();
				calc.initialize();
				calc.frmInterestingCalculator.setVisible(true);
				StringBuilder s=new StringBuilder();
				String s1="3.43";
				s.append(s1);
				//double d=Double.parseDouble(s);
				System.out.println(s);
			}
		});
	}	
}

