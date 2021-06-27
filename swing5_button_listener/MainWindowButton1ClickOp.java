package swing5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JLabel;

public class MainWindowButton1ClickOp implements ActionListener {

	protected JLabel m_message;
	
	public MainWindowButton1ClickOp(JLabel m_message) {
		super();
		this.m_message = m_message;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {

		System.out.println(arg0);
		System.out.println("button clicked!!!!");
		
		this.m_message.setText("".format("button clicked %s", new Date()));
	}

}
