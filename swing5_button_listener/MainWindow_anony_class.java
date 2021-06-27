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

public class MainWindow_anony_class extends JFrame {

	protected JButton m_button;
	protected JLabel m_message;
	
	private JLabel createLabel(String text, int yAxis) {
		JLabel temp_label = new JLabel(text, JLabel.PROPERTIES);
		temp_label.setBounds(50, yAxis, 500, 100);
		temp_label.setFont(new Font("Arial", 24, 24));
		return temp_label;	
	}	

	public MainWindow_anony_class() throws HeadlessException {
		super();
		
		this.setLayout(null);
		
		m_button = new JButton();
		m_button.setText("Click me!");
		m_button.setBounds(200,  200,  100,  50);
		m_button.setFocusable(true);

		m_message = createLabel("when will you click ?", 250);
		this.add(m_message);
		
		// Collections.sort(list, Comparable);
		
		JLabel this_message = m_message;
		
		//MainWindowButton1ClickOp op = new MainWindowButton1ClickOp(m_message);
		m_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e);
				System.out.println("button clicked!!!!");
				
				this_message.setText("".format("button clicked %s", new Date()));				
			}
			
		});
		
		this.setSize(700, 700);
		this.setTitle("swing button demo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
		this.setVisible(true);
		this.add(m_button);
		

		
	}
	
}
