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

public class dialog3t1 extends JFrame implements ActionListener{
	JTextField input1;
	JTextField input2;
	JTextField input3;
    JButton button1; 
    JButton button2; 
    static String title;

    String name;
    int id;
	dialog3t1(int id,String t1,String t2){
	  this.setBounds(100,100,200,180);
	  this.setTitle("����һ���´���");
	  this.setAlwaysOnTop(true);
	  this.setVisible(true);
	  
	  input1=new JTextField(10);
	  input1.setText(t1);
      input1.addActionListener(this);
      input2=new JTextField(10);
      input2.setText(t2);
      input2.addActionListener(this);
      
      setLayout(new FlowLayout());  
      add(new JLabel("���޸�"+"ͼ����"));  
      add(input1); 
      add(new JLabel("���޸�"+"ͼ������"));  
      add(input2);
      button1=new JButton("ȷ��");
      button2=new JButton("ȡ��"); 
      add(button1);
      add(button2);
      button1.addActionListener(this);
      button2.addActionListener(this);
      setBounds(600,260,250,250);  
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	  
	  this.id=id;
	 }
	
	
	
	public void actionPerformed(ActionEvent e){  
    	Object eventSource = e.getSource();
    	if (eventSource==button1) {
    		name=input1.getText();
    		String count = input2.getText();
    		Book book=new Book(name, count);
    		UpdateGoods g=new UpdateGoods();
    		g.Update(book, id);
    		JOptionPane.showMessageDialog(null, "�ɹ��޸�һ����¼��", "��ʾ��Ϣ",JOptionPane.PLAIN_MESSAGE);
            setVisible(false);	
    	}else {
    		
    		 setVisible(false);
    	}
          
    }  
	
	
	
	

	
	
	}
