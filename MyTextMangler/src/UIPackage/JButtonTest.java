package UIPackage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;

public class JButtonTest implements ActionListener {
    JFrame frame;
    JButton button;
     
    public JButtonTest() {
        frame = new JFrame();
        frame.setTitle("Text Mangler");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        button = new JButton("Process the File!");
        button.addActionListener(this);
         
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.setVisible(true);
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("The file is being processed");
    }
     
    public static void main(String args[]){
        JButtonTest test = new JButtonTest();
    }
}
