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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class dialog3 extends JDialog implements ActionListener{
	
	JTextField input1;
    JButton button1; 
    JButton button2; 
    static String title;
  
    JFrame MainMenu;
    int id;
  
    
    dialog3(JFrame f,String s,String t1){  
        super(f,s);  
        input1=new JTextField(10);  
        input1.addActionListener(this);

        setLayout(new FlowLayout());  
        add(new JLabel("请输入"+t1));  
        add(input1); 
  
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
    		id=Integer.parseInt(input1.getText());
    		QueryGoods q= new QueryGoods();
    		setVisible(false);
    	    new dialog3t1(id,q.querygoodsbyid(id).getName(), q.querygoodsbyid(id).getCount());
    	     
//    		int n = JOptionPane.showConfirmDialog(null, "你确定修改"+"id:"+id+"name:"+q.querygoodsbyid(id).getName()+"总量为:"+q.querygoodsbyid(id).getCount()+"?", "提示",JOptionPane.YES_NO_OPTION);
//    		if(n==0) {
//    			
//    		
//    		}
           	
    	}else {
    		
    		 setVisible(false);	
    	}
          
    }  
    public String getTitle(){  
        return title;  
    }  
	
}
