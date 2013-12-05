package io.github.programmingclub;

public class Main {

	private static class Info {
		private static String VERSION = "0.0.1";
	}

	public static void main(String[] args) {
		System.out.println("-------------Initiating Sudoku Solver v"
				+ Info.VERSION + "-------------\n");
		
		
		SudokuBoard test = new SudokuBoard();
	}
}
