import java.awt.*;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class flowLayout extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	public flowLayout()
	{
		super("FlowLayout Demo");
		
		setSize(550, 80);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JFrame frame = new JFrame();
		
		JButton b = new JButton("Button 1");
		JButton c = new JButton("Button 2");
		JButton d = new JButton("Button 3");
		JButton e = new JButton("Button 4");
		JButton f = new JButton("Button 5");
		JButton g = new JButton("Button 6");
		
		frame.setLayout(new FlowLayout());
		
		panel1.add(b);
		panel1.add(c);
		panel1.add(d);
		panel2.add(e);
		panel2.add(f);
		panel2.add(g);
		
		frame.add(panel1);
		frame.add(panel2);
		frame.setLocation(600,200);
		
		
		add(panel1, BorderLayout.WEST);
		add(panel2, BorderLayout.EAST);
	}
}