import java.awt.Color;

import org.jointheleague.graphical.robot.*;

public class RobotSquare {
	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.penDown();
		robot.setPenColor(Color.BLUE);
		robot.setSpeed(10);
		for (int i = 0; i < 6; i = i + 1) {
			robot.move(200);
			robot.turn(60);
		}

	}

}
