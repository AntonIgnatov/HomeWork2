package net.bigmir.venzor;

public class Main {

	public static void main(String[] args) {
		Point recA = new Point(0, 0);
		Point recB = new Point(2, 0);
		Point recC = new Point(2, 2);
		Point recD = new Point(1, 2);
		Point trA = new Point(1, 2);
		Point trB = new Point(4, 7);
		Point trC = new Point(5, 12);
		Point cirO = new Point(5, 12);
		Point cirA = new Point(4, 0);

		Rectangle rectOne = new Rectangle(recA, recB, recC, recD);
		Triangle trOne = new Triangle(trA, trB, trC);
		Circle cirOne = new Circle(cirO, cirA);
		Board board = new Board();
		if (cirOne.ifExist()) {
			board.addShape(cirOne, 1);
		}
		if (trOne.ifExist()) {
			board.addShape(trOne, 2);
		}
		if (cirOne.ifExist()) {
			board.addShape(cirOne, 3);
		}
		
		if (rectOne.ifExist()){
		board.addShape(rectOne, 4);
		}

		board.removShape(1);
		
		board.print();

	}

}
