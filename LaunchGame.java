package Game;
import java.util.*;
public class LaunchGame {
   public static void Menu() {
	   System.out.println("______________Welcome to TicTacToe______________");
	   System.out.println("1 For Two players");
	   System.out.println("2 For Play with AI");
   }
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		TicTacToe t=new TicTacToe();
		Menu();
		 int option=in.nextInt();
		
		Player cp;
		if(option==1) {
			System.out.println("Enter the Player1 Name");
			String player1=in.next();
			System.out.println("Enter the Player2 Name");
			String player2=in.next();
		HumanPlayer p1=new HumanPlayer(player1,'X');
		HumanPlayer p2=new HumanPlayer(player2,'O');
		 cp=p1;
		 while(true) {
				System.out.println(cp.name+" your turn ^-^ ");
				cp.makeMove();
				TicTacToe.displayBoard();
				if(TicTacToe.checkColumnwin()||TicTacToe.checkDiagonalwin()||TicTacToe.checkRowwin()) {
					System.err.println(cp.name+" you won ^-^ ");
					break;
				}
				else if(TicTacToe.CheckDraw()) {
					System.err.println("Game is Draw ^___^ ");
					break;
				}
				else {
					if(cp==p1) {
						cp=p2;
					}else {
						cp=p1;
					}
				}
				
			}
		}else if(option==2) {
			System.out.println("Enter the Player Name");
			String name=in.next();
			HumanPlayer p1=new HumanPlayer(name,'X');
			AIPlayer p2=new AIPlayer("AI",'O');
			cp=p1;
		while(true) {
			System.out.println(cp.name+" your turn ^-^ ");
			cp.makeMove();
			TicTacToe.displayBoard();
			if(TicTacToe.checkColumnwin()||TicTacToe.checkDiagonalwin()||TicTacToe.checkRowwin()) {
				System.err.println(cp.name+" you won ^-^ ");
				break;
			}
			else if(TicTacToe.CheckDraw()) {
				System.err.println("Game is Draw ^___^ ");
				break;
			}
			else {
				if(cp==p1) {
					cp=p2;
				}else {
					cp=p1;
				}
			}
			
		}
		
		}
	}
}
