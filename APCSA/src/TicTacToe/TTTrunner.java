package TicTacToe;

public class TTTrunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game(new Player(), new Player());
		game.getBoard().displayBoard();
		System.out.println(game.getBoard().checkWin());
	}

}
