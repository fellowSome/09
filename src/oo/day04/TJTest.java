package oo.day04;

public class TJTest {
	public static void main(String[] args) {
		T t=new T(2,5);
		t.print();
		J j=new J(0,3);
		j.print();
     
	}

	public static void printWall(Tetromino t) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				boolean f = true;
				for (int k = 0; k < t.cells.length; k++) {
					if (t.cells[k].row == i && t.cells[k].col == j) {
						f = false;
						System.out.print("*");
						break;
					}
				}
				if (f) {
					System.out.print("-");
				}

			}
			System.out.println();
		}
	}
}
