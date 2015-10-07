package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Square {


public static void main(String[] args) {
	Robot ironman=new Robot(); 
	ironman.setSpeed(90001);
	ironman.setPenWidth(5000);
	for (int i = 0; i < 100; i++) {  
		ironman.penDown();
		ironman.setRandomPenColor(); 
		for (int j = 0; j < 4; j++) { 
			ironman.move(100);
			ironman.turn(90); 
			ironman.unSparkle();
		} 
		
		
	}
}
}
