package swing7;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainWindowColor extends JFrame implements ActionListener {

	private JButton m_btn;
	private JLabel m_label;
	
	public MainWindowColor() throws HeadlessException {
		m_btn = new JButton("choose color");
		m_btn.addActionListener(this);
		m_label = new JLabel("Sample text");
		
		this.add(m_btn);
		this.add(m_label);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == m_btn) {
			Color color = JColorChooser.showDialog(this, "Pick some color", Color.BLACK);
			m_label.setForeground(color);
		}
	}
	
	

}
