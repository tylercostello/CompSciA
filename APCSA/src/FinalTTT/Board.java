package FinalTTT;

public class Board {
	private int[][] gameBoard = new int[3][3];

	public Board() {
		resetBoard();
	}

	public int[][] getBoard() {
		return gameBoard;
	}

	public void resetBoard() {
		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 3; c++) {
				gameBoard[r][c] = 0;
			}
		}
	}

	public void displayBoard() {
		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 3; c++) {
				System.out.print(gameBoard[r][c]);
			}
			System.out.println();
		}
	}

	public boolean makeMove(int player, int r, int c) {
		if (gameBoard[r][c] == 0) {
			gameBoard[r][c] = player;
			return true;
		}
		return false;
	}

	public int checkWin() {
		// check rows
		for (int r = 0; r < 3; r++) {
			if (gameBoard[r][0] != 0 && gameBoard[r][0] == gameBoard[r][1] && gameBoard[r][1] == gameBoard[r][2]) {
				return gameBoard[r][0];
			}
		}
		// check columns
		for (int c = 0; c < 3; c++) {
			if (gameBoard[0][c] != 0 && gameBoard[0][c] == gameBoard[1][c] && gameBoard[1][c] == gameBoard[2][c]) {
				return gameBoard[0][c];
			}
		}
		// check down right
		if (gameBoard[0][0] != 0 && gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2]) {
			return gameBoard[0][0];
		}
		// check up left
		if (gameBoard[2][0] != 0 && gameBoard[2][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[0][2]) {
			return gameBoard[2][0];
		}

		// check if unfinished
		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 3; c++) {
				if (gameBoard[r][c] == 0) {
					return 0;
				}
			}
		}
		// stalemate
		return 3;

	}
}
