package swing4;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
	
	
	private static void createLabelAndAddToFrom(String text, JFrame frame, int yAxis) {
		JLabel label1 = new JLabel(text, JLabel.PROPERTIES);
		label1.setBounds(50, yAxis, 150, 100);
		frame.add(label1);	
	}

	private static void showPersonForm(Person p) {
		JFrame frame = new JFrame();
		frame.setLayout(null);
		frame.setSize(300, 400);
		frame.setTitle(p.m_name);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setResizable(false);
		frame.setVisible(true);
		
		createLabelAndAddToFrom("".format("id: %d", p.getM_id()), frame, 50);
		createLabelAndAddToFrom("".format("name: %s", p.getM_name()), frame, 100);
		createLabelAndAddToFrom("".format("address: %s", p.getM_address()), frame, 150);
		createLabelAndAddToFrom("".format("height: %f", p.getM_height()), frame, 200);	
	}

	public static void main(String[] args) throws InterruptedException {

		Person p = new Person(1, "Danny", "tel aviv", 1.80f);
		//showPersonForm(p);
		
		Person p2 = new Person(2, "Suzi", "Hertezlliya", 1.78f);
		//showPersonForm(p2);
		
		PersonWindow pwindow1 = new PersonWindow(p);
		PersonWindow pwindow2 = new PersonWindow(p2);
		
			// create a java project 
		// create Person class
		// m_id, m_name, m_address, m_height
		// ctor
		// getter/setter
		// create a person [yourself?]
		// create function called printPerson(Person p)		
		// create Jframe window
		// create 4 labels
		// create a new person
		// print person details in each label
		//    id     : ______ (hint: p.getId)
		//    name   : ______
		//    address: ______
		//    height : ______		
		
		
	}

}
