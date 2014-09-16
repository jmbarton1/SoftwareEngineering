/**
 *Chomp.java is an attempt at the game Chomp. We're using traditional 3x5 with the cookie in the top left.
 *
 *@author Joshua Barton, Robbie Greenleaf, CJ Morrison
 *@version 1.0
 */
 import java.io.*;
 import java.lang.*;
 import java.util.*;
 import javax.swing.*;
 import java.awt.*;
 public class Chomp{

 	//constant variables
 	public static final int COL = 6;
 	public static final int ROW = 4;

 	//instance variables
 	/**
 	 * the size of the board in tiles
 	 */
 	public int[][] boardsize = new int [ROW][COL];

 	/**
 	 *Constructor with 15 blocks, all regular blocks with one poison in the top left.
 	 */
 	public Chomp(){
 		//makes 2d array
 		//makes the board
 	  	makeBoard(boardsize);

 	 }
 	 public int getRow(){
 	 	return this.ROW;
 	 }
 	 public int getCol(){
 	 	return this.COL;
 	 }
 	  /**
 	   * Determines if the move a player makes is allowed
 	   *
 	   */
 	 public boolean isValidMove( int xCoordinate, int yCoordinate){
 	  			if(this.boardsize[xCoordinate][yCoordinate]== 1){
 	  				return true;
 	  			}else{
 	  				return false;
 	  			}
 	  	}
 	public boolean onlyPoisonCookieLeft(){
 		int count=0;
 		for(int z = 0;z<COL;z++){
 			for(int w = 0; w<ROW; w++){
 				if(this.boardsize[w][z]!=0){
 					count++;
 				}
 			}
 		}
 		if(count>1){
 			return false;
 		}
 		else{
 			return true;
 		}
 	}

 	 public void makeBoard(int[][] boardsize){
 	 	//1 is cookie, 0 is blank, -1 is poison
 	 	for(int i = 0; i < ROW; i++){
 	  		for(int j = 0; j < COL; j++){
 	  			boardsize[i][j] = 1;
 	  		}
 	  	}
 	  	boardsize[0][0] = -1;
 	  }


 }
