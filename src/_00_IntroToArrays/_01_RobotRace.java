package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
import org.junit.jupiter.params.shadow.com.univocity.parsers.fixed.FixedWidthFormat;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		//2. create an array of 5 robots.
		Robot[] r = new Robot[5];
		//3. use a for loop to initialize the robots.
		int xPos = 40;
		for(int i = 0; i < r.length; i++) {
			r[i] = new Robot();
			//4. make each robot start at the bottom of the screen, side by side, facing up
			r[i].setY(500);
			r[i].setX(xPos);
			r[i].setSpeed(10);
			xPos+=200;
		}
		//5. use another for loop to iterate through the array and make each robot move 
		Random randy = new Random();
		boolean finished = false;
		while (!finished) {
			for(int i = 0; i < r.length; i++) {
				//   a random amount less than 50.
				r[i].move(randy.nextInt(50));
				if(r[i].getY()<=0) {
					finished = true;
					System.out.println("Robot " + i + " is the winner!");
				}
			}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.	
		}
		//7. declare that robot the winner and throw it a party!
		
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

			
	}
}
