/**
 * @(#)SnortBoard.java
 *
 *
 * @author
 * @version 1.00 2014/9/26
 */
import java.awt.*;
import javax.swing.*;

public class SnortBoard extends JPanel{
    public SnortBoard() {
    	drawVertices();
    	repaint();
    }
	public void drawVertices(){
		SnortVertex[][] VerticeArray = new SnortVertex[5][5];
		for(int a=0;a<5;a++){
			for(int b=0;b<5;b++){
				SnortVertex vertex = new SnortVertex();
				VerticeArray[a][b]=vertex;
			}
		}
	}
	public void fillVertex(String color,int x, int y){
		g.setColor(color);
		g.fillOval((x*100),(y*100),50,50);
	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		int xCoordinate;
		int yCoordinate;
		for(int c=0;c<500;c+=100){
			for(int d=0;d<500;d+=100){
				xCoordinate=d;
				yCoordinate=c;
				g.drawOval(xCoordinate,yCoordinate,50,50);
				if(d<400){
					g.drawLine((xCoordinate+50),(yCoordinate+25),(xCoordinate+100),(yCoordinate+25));
				}
			}
		}
	}
}