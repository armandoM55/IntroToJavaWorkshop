package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		
		Robot Ryon=new Robot();
		
Ryon.penDown();
		
Ryon.setSpeed(1000);
		
for (int i = 0; i < 90001; i++) {
	
	
	Ryon.setRandomPenColor();
			
	Ryon.move(5*i);
			
	Ryon.turn(360/7);
			
	
			// 9. Set the pen width to i
	Ryon.setPenWidth(i);
}
	}
}
