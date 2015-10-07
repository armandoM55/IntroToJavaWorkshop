package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		
Robot Ryon_mk2=new Robot();
		
Ryon_mk2.penDown();
	
Ryon_mk2.setSpeed(10);
		
Ryon_mk2.setRandomPenColor(); 
		
int ness=5;
		
int ds=360/5;
		
for (int i = 0; i < 200; i++) {
	

	
	Ryon_mk2.move(i);
			
	
			
	Ryon_mk2.turn(ds);
			// 11. Turn the robot one more degree
	Ryon_mk2.turn(1);
}
	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}