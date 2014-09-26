/**
 * @(#)SnortGame.java
 *
 *
 * @author
 * @version 1.00 2014/9/26
 */

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class SnortGame extends JFrame {

    public SnortGame() {
    }
    public void processMove(){
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter your move player, comma seperated");
    	String inputString = input.nextLine();
    	String[] strArray = inputString.split(",");
    	int xInt = Integer.parseInt(strArray[0]);
    	int yInt = Integer.parseInt(strArray[1]);

    }
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		SnortBoard board = new SnortBoard();
		frame.add(board);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}