package KlavyedenTusaBasma;
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class TusaBas {

	public static void main(String[] args) {

		try {
			boolean isPressed = false;
			Robot robot = new Robot();
			if (!isPressed)
				robot.keyPress(KeyEvent.VK_PRINTSCREEN);
			robot.keyRelease(KeyEvent.VK_PRINTSCREEN);
			isPressed = true;
		} catch (HeadlessException | AWTException e) {
		
			e.printStackTrace();
		}
	}
}
