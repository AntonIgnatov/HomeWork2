package net.bigmir.venzor;

public class Board {
	private Shape[] board = new Shape[4];

	public Board(Shape[] board) {
		super();
		this.board = board;
	}

	public Board() {
		super();
	}

	public Shape[] getBoard() {
		return board;
	}

	public void addShape(Shape a, int i) {
		if (i < 1 && i > 4 && this.board[i-1].ifExist()) {
			System.out.println("wrong nomber");
		} else {
			if (this.board[i - 1] == null ) {
				this.board[i - 1] = a;
			} else {
				this.removShape(i);
				this.board[i - 1] = a;
				System.out.println("Shape replaced");
			}
		}
	}

	public void removShape(int i) {
		if (i >= 1 && i <= 4 ) {
			if (this.board[i - 1] != null) {
				this.board[i - 1] = null;
				System.out.println("Shape delited");
			} else {
				System.out.println("this part of board is empty");
			}
		}

	}

	public void print() {
		double sumArea = 0;
		for (int i = 0; i < this.board.length; i++) {
			if (this.board[i] != null) {
				if (this.board[i].ifExist()) {
					sumArea += this.board[i].getArea();
					System.out.println("In part " + (i + 1) + " is " + board[i].getName() + " p= "	+ String.format("%.3f.", this.board[i].getPerimetr()) + " s= " + String.format("%.3f.", this.board[i].getArea()));
				} 
			}else {
				System.out.println("Part " + (i + 1) + " is empty");
			}
		}
		System.out.println("Total area = "+String.format("%.3f.", sumArea));
		
	}

}
