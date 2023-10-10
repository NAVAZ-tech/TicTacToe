package Game;
import java.util.*;
public class AIPlayer extends Player {
	    AIPlayer(String name,char mark){
	    	this.name=name;
	    	this.mark=mark;
	    }
	    @Override
	    public void makeMove() {
	    	int row=0,col=0;
	    	while(true) {
	    	Random r=new Random();
	    	 row= r.nextInt(3);
	    	  col=r.nextInt(3);
	    	if(isValidmove(row,col)) {
	    		break;
	    	}
	    	}
	    	TicTacToe.placeMark(row, col, mark); 
	    }
	    
}

