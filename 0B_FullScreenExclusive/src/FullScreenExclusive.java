// I couldn't really get anything good out of this in a quick amount of time and
// it's near the end of innovation week, so I'm just leaving it.

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;

import javax.swing.JFrame;

public class FullScreenExclusive
{
	public void DoProgram() 
	{
		JFrame frame = new JFrame("FullScreenExclusive");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setResizable(false);			
		frame.setVisible(true);				
		
		GraphicsEnvironment myEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice myDevice = myEnvironment.getDefaultScreenDevice();
		Window myWindow = new Window(frame);
		
		try
		{
			myDevice.setFullScreenWindow(myWindow);
		}
		finally
		{
			myDevice.setFullScreenWindow(null);
		}
				
		System.out.println("Done");
	}
}