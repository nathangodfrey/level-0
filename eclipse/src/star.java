import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class star {
public static void main(String[] args) {
	Robot robot= new Robot();
robot.penDown();
robot.setPenColor( Color.RED);
robot.setSpeed(10);
for(int i=0;i < 5; i=i+1){
robot.move(180);
robot.turn(140);
}



}
}