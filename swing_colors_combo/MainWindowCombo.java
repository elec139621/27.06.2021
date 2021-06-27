package swing7;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainWindowCombo extends JFrame implements ActionListener {

	private JComboBox<String> m_combobox;
	
	public MainWindowCombo() throws HeadlessException {
		String[] vehicles = { "Bus", "Car", "Motorcycle" };
		m_combobox = new JComboBox<String>(vehicles);
		m_combobox.addActionListener(this);
		m_combobox.setEditable(true);
		System.out.println(m_combobox.getItemCount());
		System.out.println(m_combobox.getItemAt(1));
		m_combobox.insertItemAt("Truck",  1);
		
		this.add(m_combobox);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// e.getActionCommand() == "comboBoxChanged"
		System.out.println(e);
		if (e.getSource() == m_combobox) {
			System.out.println(m_combobox.getSelectedItem());
			System.out.println(m_combobox.getSelectedIndex());
		}
	}
	
	

}
