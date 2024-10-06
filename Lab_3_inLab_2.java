package GUI;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Lab_3_inLab_2 
{
	public static void main(String [] Args)
	{
		MyFrame f = new MyFrame();
	}
}

class MyFrame extends JFrame implements ActionListener
{
	int id = 002;
	String name = "Kaushik Prakash";
	String gen = "Male";
	String dept = "AIIT";
	JLabel l1,l2,l3,l4,l5;
	JButton b1,b2;
	JTextField t1,t2;
	JRadioButton r1,r2;
	ButtonGroup bg = new ButtonGroup();
	String [] dep = {" ","AIIT","ABS","ASET","ASCO"};
	JComboBox<String> c = new JComboBox<String>(dep);
	String output = id+"\n"+name+"\n"+dept+"\n"+gen;
	MyFrame()
	{
		this.setLayout(new GridLayout(6, 3, 5, 5));
		//this.getContentPane().setBackground(Color.GRAY);
		this.setSize(400,300);
		this.setVisible(true);
		
		l1 = new JLabel("Id: ");
		l2 = new JLabel("Name: ");
		l3 = new JLabel("Dep: ");
		l4 = new JLabel("Gender: ");
		l5 = new JLabel("Select Below");
		
		b1 = new JButton("Submit");
		b2 = new JButton("Reset");
		
		t1 = new JTextField(20);
		t2 = new JTextField(40);

		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		bg.add(r1);
		bg.add(r2);
		
		this.add(l1);
		this.add(t1);
		
		this.add(l2);
		this.add(t2);
		
		this.add(l3);
		this.add(c);
		
		this.add(l4);
		this.add(l5);
		this.add(r1);
		this.add(r2);
		//Submit
		this.add(b1);
		//reset
		this.add(b2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(this);
        b2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Submit"))
		{
			if(t1.getText().isBlank())
			{
				JOptionPane.showMessageDialog(null,"Enter the id");
			}
			if(t2.getText().isBlank())
			{
				JOptionPane.showMessageDialog(null,"Enter the name");
			}
			int id = Integer.parseInt(t1.getText());
			String name = t2.getText();
	        String dep = (String) c.getSelectedItem();
			String gen = "";
			if(r1.isSelected())
			{
				gen = "Male";
			}
			else if(r2.isSelected())
			{
				gen = "Female";
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Select Gender");
			}
			String input = id+"\n"+name+"\n"+dep+"\n"+gen;
			if(output.equals(input))
			{
				JOptionPane.showMessageDialog(null, "Login Successfull"+output);
				this.getContentPane().setBackground(Color.green);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Login Failed");
				this.getContentPane().setBackground(Color.red);
			}
		}
		else if(e.getActionCommand().equals("Reset"))
		{
			this.getContentPane().setBackground(Color.GRAY);
			t1.setText("");
			t2.setText("");
			bg.clearSelection();
			c.setSelectedIndex(0);
			JOptionPane.showMessageDialog(null, "Form reset");
		}
	}

}