package Game;

import java.util.*;

public class HumanPlayer extends Player{
		    HumanPlayer(String name,char mark){
		    	this.name=name;
		    	this.mark=mark;
		    }
		    
		    
		    @Override
		   public void makeMove() {
		    	Scanner in=new Scanner(System.in);
		    	System.out.println("Enter the row and column ");
		    	int row=0,col=0;
		    	while(true) {
		    		 row=in.nextInt();
		        	 col=in.nextInt();
		    	if(isValidmove(row,col)) {
		    		break;
		    	}else {
		    		System.err.println("Invalid move ^~~^ please Enter the Valid move! ");
		    	}
		    	}
		    	TicTacToe.placeMark(row, col, mark); 
		    }
		}
