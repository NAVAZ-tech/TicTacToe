package Game;

abstract public class Player {
    String name;
    char mark;
    abstract void makeMove();
    boolean isValidmove(int row,int col) {
    	if(row>=0 && row<=2 && col>=0 && col<=2) {
    		if(TicTacToe.board[row][col]==' ') {
    			return true;
    		}
    	}
    	return false;
    }
}
