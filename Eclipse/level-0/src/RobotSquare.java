import org.jointheleague.graphical.robot.*;

public class RobotSquare {
	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.penDown();
		robot.setSpeed(10);
		robot.move(300);
		robot.turn(270);
		robot.move(300);
		robot.turn(270);
		robot.move(300);
		robot.turn(270);
		robot.move(300);
	}	
}
