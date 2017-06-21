package books;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class dialog extends JDialog implements ActionListener{
	
	JTextField input1;
	JTextField input2;
	JTextField input3;
    JButton button1; 
    JButton button2; 
    static String title;

    String name;
    String id;
    String count;
    dialog(JFrame f,String s,String t1,String t2){  
        super(f,s);  
        input1=new JTextField(10);  
        input1.addActionListener(this);
        input2=new JTextField(10);  
        input2.addActionListener(this);
      
        setLayout(new FlowLayout());  
        add(new JLabel("请输入"+t1));  
        add(input1); 
        add(new JLabel("请输入"+t2));  
        add(input2);
        button1=new JButton("确定");
        button2=new JButton("取消"); 
        add(button1);
        add(button2);
        button1.addActionListener(this);
        button2.addActionListener(this);
        setBounds(600,260,250,250);  
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
    }  
    public void actionPerformed(ActionEvent e){  
    	Object eventSource = e.getSource();
    	if (eventSource==button1) {
    		name=input1.getText();
    		count=input2.getText();
    		Book book=new Book(name, count);
    		new AddGoods().insert(book);
            setVisible(false);	
    	}else {
    		
    		 setVisible(false);
    	}
          
    }  
    public String getTitle(){  
        return title;  
    }  
	
}
