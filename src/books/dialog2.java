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

public class dialog2 extends JDialog implements ActionListener{
	
	JTextField input1;
    JButton button1; 
    JButton button2; 
    static String title;


    int id;
    
    
    dialog2(JFrame f,String s,String t1){  
        super(f,s);  
        input1=new JTextField(10);  
        input1.addActionListener(this);

        setLayout(new FlowLayout());  
        add(new JLabel("������"+t1));  
        add(input1); 
  
        button1=new JButton("ȷ��");
        button2=new JButton("ȡ��"); 
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
    		int n = JOptionPane.showConfirmDialog(null, "��ȷ��ɾ��"+"id:"+id+"name:"+q.querygoodsbyid(id).getName()+"����Ϊ:"+q.querygoodsbyid(id).getCount()+"?", "��ʾ",JOptionPane.YES_NO_OPTION);
    		if(n==0) {
    		new DeleteGoods().Delte(id);
    		JOptionPane.showMessageDialog(null, "�ɹ�ɾ��һ����¼��", "��ʾ��Ϣ",JOptionPane.PLAIN_MESSAGE); 
    		}
            setVisible(false);	
    	}else {
    		
    		 setVisible(false);	
    	}
          
    }  
    public String getTitle(){  
        return title;  
    }  
	
}
