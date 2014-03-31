package practice.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import practice.controller.PracticeController;

public class PracticePanel extends JPanel
{
	private PracticeController baseController;
	private SpringLayout baseLayout;
	private JButton submitChatButton;
	
	public PracticePanel(PracticeController baseController)
	{
		this.baseController = baseController;
		submitChatButton = new JButton("Enter");
		baseLayout = new SpringLayout();
		

		setupPanel();
		setupLayout();
		 setupListeners();

	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GRAY);
		this.add(submitChatButton);

	}

	 private void setupListeners()
	 {
		 submitChatButton.addActionListener(new ActionListener()
		 {
			public void actionPerformed(ActionEvent click)
			{
				int temp = 0; 
				temp = (int)(Math.random() * baseController.getBasePractice().getSomeNumber()); 	
				baseController.getBasePractice().setSomeNumber(temp);
			}
		 });
		
	 }
	

	private void setupLayout()
	{

	}
}
