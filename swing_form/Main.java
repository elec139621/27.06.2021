package swing4;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame();
		frame.setLayout(null);
		frame.setSize(700, 700);
		frame.setTitle("my first demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setResizable(false);
		frame.setVisible(true);
		
		JLabel label1 = new JLabel("Hello world1!", JLabel.PROPERTIES);
		label1.setBounds(50, 350, 100, 100);
		frame.add(label1);
		
		JLabel label2 = new JLabel("Hello world2!", JLabel.PROPERTIES);
		label2.setBounds(50, 0, 100, 100);
		frame.add(label2);		
		
		// for animation
		/*
		for (int index = 50; index < 400; index++) {
			label1.setBounds(index, 350, 100, 100);
			Thread.sleep(50);
		}
		*/
		
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
