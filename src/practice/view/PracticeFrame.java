package practice.view;

import javax.swing.JFrame;

import practice.controller.PracticeController;

public class PracticeFrame extends JFrame
{
	private PracticeController baseController;
	/**
	 * Creates a new Practice panel
	 */
	private PracticePanel basePanel;

	public PracticeFrame(PracticeController baseController)
	{
		this.baseController = baseController;
		basePanel = new PracticePanel(baseController);

		setupFrame();
	}

	/**
	 * Sets all the properties of the frame.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500, 500);
		this.setVisible(true);

	}

}
