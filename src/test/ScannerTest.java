package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		int noOfSnakes = scanner.nextInt();
        List<Snake> snakes = new ArrayList<Snake>();
        for (int i = 0; i < noOfSnakes; i++) {
            snakes.add(new Snake(scanner.nextInt(), scanner.nextInt()));
        }

        System.out.println(snakes.get(1).getStart() + snakes.get(1).getEnd());
	}

}

class Snake {
    // Each snake will have its head at some number and its tail at a smaller number.
    private int start;
    private int end;

    public Snake(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}
