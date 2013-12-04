package io.github.programmingclub;

import java.util.Iterator;
import java.util.LinkedList;

public class SudokuBoard {
	
    LinkedList<Node> grid = new LinkedList<Node>();
			
	  /**
	 * Print  the grid in a formatted way
	 */
	public void printGrid() {
	    Iterator<Node> iterator = grid.iterator();
	    int index = 0;
	    while (iterator.hasNext()) {
	        for (int i = 0; i < 3; i++) {
	            System.out.print(" " + iterator.next().getValue() + " ");
	            index++;
	        }
	        if ((index % 9) == 0) {
	            System.out.print("\n");
	
	            if (index == 27 || index == 54) {
	                System.out.println(" --------+---------+--------");
	            }
	        } else {
	            System.out.print("|");
	        }
	    }
	}
}
