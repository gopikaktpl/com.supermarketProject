package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class RobotClass {
	public static Robot rb;
	public static StringSelection filepath;
	public void fileUploadWithRobortclass(String path) throws InterruptedException, AWTException {
		
	rb= new Robot();
	filepath= new StringSelection("C:\\Users\\DELL NOTEBOOK 3442\\git\\com.supermarketProject\\com.supermarketProject\\src\\main\\resources\\WF Model.jpg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
	rb.keyPress(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	rb.keyPress(KeyEvent.VK_V);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	rb.keyRelease(KeyEvent.VK_V);
	rb.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	rb.keyRelease(KeyEvent.VK_ENTER);
	}
}
