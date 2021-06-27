package swing4;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PersonWindow {

	protected JLabel m_id_label;
	protected JLabel m_name_label;
	protected JLabel m_address_label;
	protected JLabel m_height_label;
	protected JFrame m_frame;
	
	public PersonWindow(Person p) {
		super();
		m_frame = new JFrame();
		m_frame.setLayout(null);
		m_frame.setSize(300, 400);
		m_frame.setTitle(p.m_name);
		m_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		m_frame.setResizable(false);
		m_frame.setVisible(true);
		
		m_id_label = createLabel("".format("id: %d", p.getM_id()), 50);
		m_name_label = createLabel("".format("name: %s", p.getM_name()), 100);
		m_address_label = createLabel("".format("address: %s", p.getM_address()), 150);
		m_height_label = createLabel("".format("height: %f", p.getM_height()), 200);
		m_frame.add(m_id_label);
		m_frame.add(m_name_label);
		m_frame.add(m_address_label);
		m_frame.add(m_height_label);
	}
	
	private JLabel createLabel(String text, int yAxis) {
		JLabel temp_label = new JLabel(text, JLabel.PROPERTIES);
		temp_label.setBounds(50, yAxis, 150, 100);
		return temp_label;	
	}	
	
	
	
}
