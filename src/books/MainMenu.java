package books;
import java.awt.*;

import javax.swing.*;

import java.io.*;
import java.awt.event.*;
import java.awt.datatransfer.*;

//主窗口
public class MainMenu extends JFrame implements ActionListener {

	JMenuBar menuBar = new JMenuBar();
	JMenu acc_manage = new JMenu("帐户管理");
	JMenu goods_manage = new JMenu("图书管理");
	JMenu goods_query = new JMenu("图书查询");
	dialog dialog;
	dialog2 dialog2;
	dialog3 dialog3;
	void  init(){
		
		dialog =new dialog(this,"","图书名","总量");  
	    dialog.setModal(true);
	    
	    
	    dialog2 =new dialog2(this,"","图书ID");  
	    dialog2.setModal(true);
	    
	    dialog3 =new dialog3(this,"","图书ID");  
	    dialog3.setModal(true);
	}
	
	JMenuItem[] menuItem = { new JMenuItem("重新登录"), new JMenuItem("退出"),
			new JMenuItem("图书添加"), new JMenuItem("图书删除"),
			new JMenuItem("图书修改"), new JMenuItem("全部图书查询"),
			new JMenuItem("按图书编号查询"), new JMenuItem("按图书名称查询"),

	};
	JLabel welcome = new JLabel("简易图书管理系统");
	String fileName = "NoName";
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Clipboard clipboard = toolkit.getSystemClipboard();

	
    
	MainMenu() {
		init();
		setTitle("简易图书管理系统");
		setFont(new Font("Times New Roman", Font.PLAIN, 30));
		setBackground(Color.white);
		setSize(500, 500);
		setLocationRelativeTo(null);

		setJMenuBar(menuBar);
		menuBar.add(acc_manage);
		menuBar.add(goods_manage);
		menuBar.add(goods_query);

		for (int i = 0; i < 2; i++) {
			acc_manage.add(menuItem[i]);
		}
		for (int i = 2; i < 5; i++) {
			goods_manage.add(menuItem[i]);
		}
		for (int i = 5; i < 8; i++) {
			goods_query.add(menuItem[i]);

		}

		this.getContentPane().add(welcome);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (int i = 0; i < 8; i++) {
			menuItem[i].addActionListener(this);
		}
		welcome.setFont(new Font("幼圆", Font.PLAIN, 48));
		welcome.setHorizontalAlignment(SwingConstants.CENTER);
		welcome.setForeground(Color.black);
		this.getContentPane().add(welcome);
		
		this.setVisible(true);
	}

	
	
	

	

	
	
	public void openFile(String fileName) {
		try {
			File file = new File(fileName);
			FileReader readIn = new FileReader(file);
			int size = (int) file.length();
			int charsRead = 0;
			char[] content = new char[size];
			while (readIn.ready())
				charsRead += readIn.read(content, charsRead, size - charsRead);
			readIn.close();
		} catch (Exception e) {
			System.out.println("Error opening file!");
		}
	}

	public void writeFile(String fileName) {
		try {
			File file = new File(fileName);
			FileWriter write = new FileWriter(file);
			write.close();
		} catch (Exception e) {
			System.out.println("Error closing file!");
		}
	}
	public void actionPerformed(ActionEvent e) {
		Object eventSource = e.getSource();
		if (eventSource == menuItem[0]) {
			new UserLogin();
		} else if (eventSource == menuItem[1]) {
			System.exit(0);
		} else if (eventSource == menuItem[2]) {
			
			 dialog.setVisible(true);  
		     String str=dialog.getTitle();  
		     setTitle(str); 
			
			
			System.out.println("添加图书");
			
		} else if (eventSource == menuItem[3]) {
			
			dialog2.setVisible(true);
		} else if (eventSource == menuItem[4]) {
			dialog3.setVisible(true);
		} else if (eventSource == menuItem[5]) {
			new QueryGoods();
		} else if (eventSource == menuItem[6]) {
			new QueryGoodsById();
		} else if (eventSource == menuItem[7]) {
			new QueryGoodsByName();
		} else if (eventSource == menuItem[8]) {
			// new 我要借阅();
		} else if (eventSource == menuItem[9]) {
			// new 借阅记录();
		}
		;
	}
	/**
	 * @param args
	 */
}
