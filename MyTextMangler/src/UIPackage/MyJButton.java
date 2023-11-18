package UIPackage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;

public class MyJButton implements ActionListener {
    JFrame frame;
    JButton button;
	JTextField txtname, txtcity;
	JLabel lblname, lblcity;
     
    public  MyJButton() {
        frame = new JFrame();
        frame.setTitle("Text Mangler");
        frame.setSize(1000, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        button = new JButton("Process the File!");
        button.addActionListener(this);
        txtname=new JTextField(); 
         
        frame.setLayout(new FlowLayout());
        lblname=new JLabel("Enter The File Name: ");
        txtname=new JTextField(); 
		txtname.setText("Enter The File Name"); 
		txtname.setColumns(20); //Setting Size
		txtname.setToolTipText("Name of File to Run"); 
		txtname.selectAll(); //Selecting All 
        frame.add(lblname);
		frame.add(txtname);
        frame.add(button);
        frame.setVisible(true);
    } 
     
    @Override
    public void actionPerformed(ActionEvent e) {
    	String txt1;
		txt1=txtname.getText();
        System.out.println("This was the filename: "+txt1);
    }
     
    public static void main(String args[]){
      MyJButton MyJButton = new MyJButton();
    }
}
