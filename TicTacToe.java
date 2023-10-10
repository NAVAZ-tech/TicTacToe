package Game;
import java.util.*;
 class TicTacToe{
	static char[][] board; 
	 TicTacToe(){
		 board=new char[3][3];
		 initBoard();
	 }
	static void initBoard() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				board[i][j]=' ';
			}
		}
	 }
	static void displayBoard() {
		 System.out.println("-------------");
		 for(int i=0;i<3;i++) {
			 System.out.print("| ");
				for(int j=0;j<3;j++) {
					System.out.print(board[i][j]+" | ");
				}
				System.out.println();
				 System.out.println("-------------");
			}
	 }
	 static void placeMark(int row,int col,char mark) {
		 board[row][col]=mark;
	 }
	 
	static boolean checkColumnwin() {
		 for(int j=0;j<3;j++) {
			 
			 if(board[0][j]!=' ' && board[0][j]==board[1][j] && board[1][j]==board[2][j]) {
				 return true;
			 }
		 }
		 return false;
	 }
	static boolean checkRowwin() {
		 for(int i=0;i<3;i++) {
			 if(board[i][0]!=' ' && board[i][0]==board[i][1] && board[i][1]==board[i][2]) {
				 return true;
			 }
		 }
		 return false;
	 }
    static boolean checkDiagonalwin() { 
    	 if(board[0][0]!=' ' && board[0][0]==board[1][1]&& board[1][1]==board[2][2] ||board[0][2]!=' ' &&  board[0][2]==board[1][1]&& board[1][1]==board[2][0]) {
    		 return true;
    	 }
    	 return false;
     }
    static boolean CheckDraw() {
    	for(int i=0;i<3;i++) {
    		for(int j=0;j<3;j++) {
    			if(board[i][j]==' ') {
    				return false;
    			}
    		}
    	}
    	return true;
    }

 }
 