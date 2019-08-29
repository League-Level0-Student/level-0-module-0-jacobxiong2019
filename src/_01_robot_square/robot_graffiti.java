package _01_robot_square;

import org.jointheleague.graphical.robot.Robot;

public class robot_graffiti {
	public static void main(String[] args) {
		Robot r2d2 = new Robot();
		r2d2.penDown();
		r2d2.setSpeed(20);
		r2d2.turn(90);
		r2d2.move(150);
		r2d2.turn(180);
		r2d2.move(300);
		r2d2.turn(180);
		r2d2.move(150);
		r2d2.turn(90);
		r2d2.move(300);
		r2d2.turn(90);
		r2d2.move(150);
		r2d2.turn(90);
		r2d2.move(100);
		r2d2.hide();
		
	}
}
