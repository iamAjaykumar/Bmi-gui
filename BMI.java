//imporitnig packages
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//class name
public class BMI {
	//main
	public static void main(String[] args) {
		//creating frame components labels and text fields and seeting their bounds
		JFrame f =new JFrame("BMI");
		JLabel head= new JLabel("BMI GUI Project");
		head.setBounds(150,10,100,30);
		head.setForeground(Color.green.darker());
		JLabel fl= new JLabel("First Name: ");
		fl.setBounds(10,40,80,30);
		JTextField ft = new JTextField();
		ft.setBounds(90,40,70,30);
		JLabel wtp= new JLabel("Weight in Pounds: ");
		wtp.setBounds(180,40,120,30);
		JTextField wtpt= new JTextField();
		wtpt.setBounds(300,40,70,30);
		JLabel ln = new JLabel("Last Name: ");
		ln.setBounds(10,70,80,30);
		JTextField lnt= new JTextField();
		lnt.setBounds(90,70,70,30);
		JLabel hin= new JLabel("Height in Inches: ");
		hin.setBounds(180,70,120,30);
		JTextField hei= new JTextField();
		hei.setBounds(300,70,70,30);
		JTextArea more = new JTextArea();
		more.setBounds(90,120,280,250);
		JButton cal = new JButton("BMI");
		cal.setBounds(10,160,80,30);
		JButton report= new JButton("Report");
		report.setBounds(10,200,80,30);
		JButton Reset= new JButton("Reset");
		Reset.setBounds(10,240,80,30);
		JButton Exit = new JButton("Exit");
		Exit.setBounds(10,280,80,30);
		//actionlisterner  to  display the bmi
		cal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//getting tesxt from component
				String w= wtpt.getText();
				//converting to double data type
				Double we = Double.parseDouble(w);
//				System.out.println(we);
				Double real_height= Double.parseDouble(hei.getText());
//				System.out.println(real_height);
				//calculating bmi
				Double Bmi= (we*703)/(real_height*real_height);
				more.setText("BMI = "+ Bmi);
				
			}
		});
		//action listener for report
		report.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String w= wtpt.getText();
				Double we = Double.parseDouble(w);
//				System.out.println(we);
				Double real_height= Double.parseDouble(hei.getText());
//				System.out.println(real_height);
				Double Bmi= (we*703)/(real_height*real_height);
				String fname= ft.getText();
				String lname= lnt.getText();
				
				more.setText("Report \nFirst name = "+fname+"\nLast name = "+lname+"\nBMI = "+ Bmi);
				
			}
		});
		//action listener to reset all thefields
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ft.setText("");
				lnt.setText("");
				wtpt.setText("");
				hei.setText("");
				more.setText("");
				
			}
		});
		//action listerner to close the frame
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				f.setVisible(false);
				f.dispose();
			}
		});
		
		//adding components to frame		
		f.add(head);f.add(fl);f.add(ft);
		f.add(wtp);f.add(wtpt);f.add(ln);
		f.add(lnt);f.add(hin);f.add(hei);
		f.add(more);f.add(cal);f.add(report);
		f.add(Reset);f.add(Exit);
		//frame visibility
		//null lauout
		f.setLayout(null);
		//size of frmae
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
