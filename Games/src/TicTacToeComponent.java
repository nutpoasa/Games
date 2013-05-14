/*
 * Program: Tic Tac Toe Game Component
 * Author: Sharon Davis
 * Date: 5/08/2013
 * Description: CS161 Lab 6
 * 		This class is the component used to run and update the GUI.
 * Inputs: @parameters userSymbol 
 * 		   @parameters userSquare
 * Outputs: none 
 */


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class TicTacToeComponent extends JComponent {
	
	//global variables for drawing and updating board
	private static final long serialVersionUID = 1L;
	private static String userSymbol1 = "1";
	private static String userSymbol2 = "2";
	private static String userSymbol3 = "3";
	private static String userSymbol4 = "4";
	private static String userSymbol5 = "5";
	private static String userSymbol6 = "6";
	private static String userSymbol7 = "7";
	private static String userSymbol8 = "8";
	private static String userSymbol9 = "9";


	public void paintComponent(Graphics g){
		
		
		Graphics2D g2 = (Graphics2D) g;
		
		//draws tic tac toe board lines
		Line2D.Double line1 = new Line2D.Double(45,180, 240,180);
		Line2D.Double line2 = new Line2D.Double(45,250, 240,250);
		Line2D.Double line3 = new Line2D.Double(105,120, 105,315);
		Line2D.Double line4 = new Line2D.Double(175,120, 175,315);
		g2.setColor(Color.red);
		g2.draw(line1);
		g2.draw(line2);
		g2.draw(line3);
		g2.draw(line4);
		
		//location of symbols 'X' and 'O'
		g2.setColor(Color.BLUE);
		g2.drawString(userSymbol1, 70, 155);
		g2.drawString(userSymbol2, 138, 155);
		g2.drawString(userSymbol3, 205, 155);
		g2.drawString(userSymbol4, 70, 220);
		g2.drawString(userSymbol5, 138, 220);
		g2.drawString(userSymbol6, 205, 220);
		g2.drawString(userSymbol7, 70, 290);
		g2.drawString(userSymbol8, 138, 290);
		g2.drawString(userSymbol9, 205, 290);
	}
	
	/*
	 * Method: setUserChoice()
	 * Description: used to put symbols in proper square locations on board
	 * Input: @parameters playerSymbol
	 * 		  @parameters playerSquare
	 * Outputs: none
	 */
	
	public static void setUserChoice(String playerSymbol, int playerSquare){
		
		//which symbol to put on board
		switch(playerSquare){
			case 1: userSymbol1 = playerSymbol; break;		
			case 2: userSymbol2 = playerSymbol; break;
			case 3: userSymbol3 = playerSymbol; break;
			case 4: userSymbol4 = playerSymbol; break;
			case 5: userSymbol5 = playerSymbol; break;
			case 6: userSymbol6 = playerSymbol; break;
			case 7: userSymbol7 = playerSymbol; break;
			case 8: userSymbol8 = playerSymbol; break;
			case 9: userSymbol9 = playerSymbol; break;
		}
		TicTacToeHelper.playerSymbolCount++;				//tells playSymbol() method which symbol to use
		
	}

}
