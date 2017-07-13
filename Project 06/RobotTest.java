package org.Mont;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class RobotTest {

	public static void main(String[] args) throws AWTException, InterruptedException {
	
		Robot r = new Robot();	

		r.mouseMove(1250, 10);
		r.mousePress(InputEvent.BUTTON1_MASK);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		} 
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		r.mouseMove(65,700);
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		try {
		Thread.sleep(50);
		}
		catch(Exception e) {
		}
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		


	}

	

}
