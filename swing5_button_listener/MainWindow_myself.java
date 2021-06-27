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

public class MainWindow_myself extends JFrame implements ActionListener {

	protected JButton m_button;
	protected JButton m_button2;
	protected JLabel m_message;
	
	private JLabel createLabel(String text, int yAxis) {
		JLabel temp_label = new JLabel(text, JLabel.PROPERTIES);
		temp_label.setBounds(50, yAxis, 500, 100);
		temp_label.setFont(new Font("Arial", 24, 24));
		return temp_label;	
	}	

	public MainWindow_myself() throws HeadlessException {
		super();
		
		this.setLayout(null);
		
		m_button = new JButton();
		m_button.setText("Click me!");
		m_button.setBounds(200,  200,  100,  50);
		m_button.setFocusable(true);
		
		m_button2 = new JButton();
		m_button2.setText("Click me 2!");
		m_button2.setBounds(200,  100,  100,  50);
		m_button2.setFocusable(true);

		m_message = createLabel("when will you click ?", 250);
		this.add(m_message);
		
		JLabel this_message = m_message;
		
		// Collections.sort(list, Comparable);
		//MainWindowButton1ClickOp op = new MainWindowButton1ClickOp(m_message);
		m_button.addActionListener(this);
		m_button2.addActionListener(this);
		
		this.setSize(700, 700);
		this.setTitle("swing button demo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
		this.setVisible(true);
		this.add(m_button);
		this.add(m_button2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e);
		System.out.println("button clicked!!!!");
		if (e.getSource() == m_button) {
			System.out.println("button1");
		}
		m_message.setText("".format("button clicked %s", new Date()));		
	}
	
}
