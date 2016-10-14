package level0;

import org.jointheleague.graphical.robot.*;

public class house {
	public static void main(String[] args) {
		Robot harry = new Robot();
		harry.penDown();
		harry.setSpeed(10);
		for (int i = 0; i < 5; i = i + 1) {
			harry.move(300);
			harry.turn(90);
			harry.move(300);
			harry.turn(90);
			harry.move(300);
			harry.turn(90);
			harry.move(300);
			harry.turn(90);

		}
	}
}
