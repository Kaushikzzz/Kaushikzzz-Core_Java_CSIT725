package GUI;
import java.awt.*;
import java.awt.event.*;
public class Calculator
{
	public static void main(String args[])
	{
		MyFrame f = new MyFrame();
	}
}
class MyFrame extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4,b5;
	MyFrame()
	{
		l1 = new Label("Enter 1st value");
		l2 = new Label("Enter 2nd value");
		l3 = new Label("Result");
		
		t1 = new TextField(15);
		t2 = new TextField(15);
		t3 = new TextField(15);
		
		b1 = new Button("+");
		b2 = new Button("-");
		b3 = new Button("*");
		b4 = new Button("/");
		b5 = new Button("Clear");
		
		this.setVisible(true);
		this.setSize(200,400);
		this.setLayout(new FlowLayout());
		this.setTitle("Calculator pro Max");
		
		this.add(l1);
		this.add(t1);
		this.add(l2);
		this.add(t2);
		this.add(l3);
		this.add(t3);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		//for closing 
		this.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent e)
	{
		int a = Integer.parseInt(t1.getText());
		int b = Integer.parseInt(t2.getText());
		int r = 0;
		String src = e.getActionCommand();
		if(src.equals("+"))
			r = a+b;
		t3.setText(""+r);
		if(src.equals("-"))
			r = a-b;
		t3.setText(""+r);
		if(src.equals("*"))
			r = a*b;
		t3.setText(""+r);
		if(src.equals("/"))
			r = a/b;
		t3.setText(""+r);
		if(src.equals("Clear"))
			{
				t1.setText("");
				t2.setText("");
				t3.setText("");
			}
	}
	
}