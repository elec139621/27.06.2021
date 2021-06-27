package swing5;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainWindow_myself2 extends JFrame implements ActionListener {

	protected JButton m_button1;
	protected JButton m_button2;
	protected JButton m_button3;	
	protected JLabel m_message1;
	protected JLabel m_message2;
	protected JLabel m_message3;
	
	private JLabel createLabel(String text, int yAxis) {
		JLabel temp_label = new JLabel(text, JLabel.PROPERTIES);
		temp_label.setBounds(150, yAxis, 500, 100);
		temp_label.setFont(new Font("Arial", 24, 24));
		return temp_label;	
	}	

	public MainWindow_myself2() throws HeadlessException {
		super();
		
		this.setLayout(null);
		
		m_button1 = new JButton();
		m_button1.setText("Click me 1!");
		m_button1.setBounds(200,  100,  100,  50);
		m_button1.setFocusable(true);
		
		m_button2 = new JButton();
		m_button2.setText("Click me 2!");
		m_button2.setBounds(200,  200,  100,  50);
		m_button2.setFocusable(true);
		
		m_button3 = new JButton();
		m_button3.setText("Click me 3!");
		m_button3.setBounds(200,  300,  100,  50);
		m_button3.setFocusable(true);		

		m_message1 = createLabel("when will you click ?", 75);
		this.add(m_message1);
		m_message2 = createLabel("when will you click ?", 175);
		this.add(m_message2);
		m_message3 = createLabel("when will you click ?", 275);
		this.add(m_message3);		
		
		// Collections.sort(list, Comparable);
		//MainWindowButton1ClickOp op = new MainWindowButton1ClickOp(m_message);
		m_button1.addActionListener(this);
		m_button2.addActionListener(this);
		m_button3.addActionListener(this);
		
		this.setSize(1000, 700);
		this.setTitle("swing button demo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
		this.setVisible(true);
		this.add(m_button1);
		this.add(m_button2);
		this.add(m_button3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e);
		System.out.println("button clicked!!!!");
		if (e.getSource() == m_button1) {
			m_message1.setText("".format("%s", new Date()));
		}
		else if (e.getSource() == m_button2) {
			m_message2.setText("".format("%s", new Date()));
		}
		else if (e.getSource() == m_button3) {
			m_message3.setText("".format("%s", new Date()));
		} 		
				
	}
	
}
