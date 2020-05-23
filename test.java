import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class test extends JFrame implements ActionListener
{
	private Tank tank= new Tank(100,100);
	private JPanel panel= new JPanel();
	public test()
	{
		setLayout(null);
		setBounds(100,100,875,600);
		setResizable(false);
		
		panel.setBackground(Color.white);
		add(tank);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args)
	{
		new test();
	}
}
