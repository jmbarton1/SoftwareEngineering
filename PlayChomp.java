import javax.swing.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class PlayChomp{

	public Chomp game;
//	public final int COL = game.getRow();
 //	public final int ROW = game.getCol();

	public int activePlayer;

	public final int PLAYER_NUMS = 2;
/*
	public PlayChomp(){
		this.game = new PlayChomp();
		this.activePlayer = 0;

	}
	*/
	public PlayChomp(Chomp game){
		this.game = game;
		this.activePlayer = 0;
	}
	/*
	public void displayBoard(){
		this.frame.setContentPane(new Chomp(this.game));
		this.frame.pack();
		this.frame.repaint();
	}
	*/
	public void playGame(){
		DisplayGame frame = new DisplayGame(game);
		frame.setVisible(true);
		frame.setSize(400,250);
		frame.setLocationRelativeTo(null);
		frame.displayGame();
		//get user input
			//scanner to capture x and y
		Scanner getMove = new Scanner(System.in);
		System.out.println("Enter your move");
		String coordinates = getMove.nextLine();
		String[] coordinateArray = coordinates.split(",");
		int xCoordinate = Integer.parseInt(coordinateArray[0]);
		int yCoordinate = Integer.parseInt(coordinateArray[1]);
		//check if cookie exists
		System.out.println(game.isValidMove(xCoordinate, yCoordinate));
		//check if poison cookie is only one left
		if(game.onlyPoisonCookieLeft()){
			//game over
		}
		//removes cookies
		//update array
		//call to update the board


	}

	public static void main(String[] args){
		Chomp game = new Chomp();
		PlayChomp PlayGame = new PlayChomp(game);
		PlayGame.playGame();

	}
}
class DisplayGame extends JFrame{
	Chomp game;
	JButton buttons[][] = new JButton[3][5];

	public void killJButtons(int row, int col){
		 buttons[row][col].setVisible(false);
	}

	public DisplayGame(Chomp game){
		this.game=game;
	}
	public void displayGame(){

		JPanel p1 = new JPanel();

		p1.setLayout(new GridLayout(3,0,5,5));
		p1.setOpaque(true);
		for(int i = 0; i < 3; i++){
			for(int j = 0; j<5; j++){
				if(i == 0&&j==0){//poison cookie
					buttons[i][j] = new JButton(" "+i+", "+j);
					buttons[i][j].addMouseListener(new MouseClick());
					buttons[i][j].putClientProperty("row", i);
					buttons[i][j].putClientProperty("column", j);
					buttons[i][j].putClientProperty("poison", true);
					p1.add(buttons[i][j]);

				}
				else{
					buttons[i][j] = new JButton(" "+i+", "+j);
					buttons[i][j].addMouseListener(new MouseClick());
					buttons[i][j].putClientProperty("row", i);
					buttons[i][j].putClientProperty("column", j);
					p1.add(buttons[i][j]);


				}
			}

		}
		this.setContentPane(p1);
		this.pack();
		this.repaint();

	}
}


class MouseClick implements MouseListener {

	public void mouseClicked(MouseEvent e){
		JButton test = (JButton)e.getSource();
		System.out.println(e.getSource());
		int rowTest = (int)test.getClientProperty("row");
		int columnTest = (int)test.getClientProperty("column");
		//buttons[rowTest][columnTest].setVisible(false);
		//.killJButtons(rowTest, columnTest);
	}

		public void mousePressed(MouseEvent e){
	}
		public void mouseReleased(MouseEvent e){
	}
		public void mouseEntered(MouseEvent e){
	}
		public void mouseExited(MouseEvent e){
	}


}