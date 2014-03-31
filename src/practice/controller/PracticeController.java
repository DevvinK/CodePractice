package practice.controller;

import practice.model.Practice;
import practice.view.PracticeFrame;

public class PracticeController
{
//	Declaration section
	private PracticeFrame baseFrame;
	private Practice basePractice;
	
	
	public PracticeFrame getBaseFrame()
	{
		return baseFrame;
	}

	public void setBaseFrame(PracticeFrame baseFrame)
	{
		this.baseFrame = baseFrame;
	}

	public Practice getBasePractice()
	{
		return basePractice;
	}

	public void setBasePractice(Practice basePractice)
	{
		this.basePractice = basePractice;
	}

	public void start()
	{
		baseFrame = new PracticeFrame(this);
	}
	
	public PracticeController()
	{
		basePractice = new Practice();
	}
}
