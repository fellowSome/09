package oo.day03;

public class TJTest {
	public static void main(String[] args) {
		/*
		 * T t=new T(2,5); t.print();
		 * 
		 * System.out.println("�����"); t.drop(); t.print();
		 * 
		 * System.out.println("���ƺ�"); t.moveLeft(); t.print();
		 * 
		 * System.out.println("���ƺ�"); t.moveRight(); t.print();
		 * 
		 * t=new T();
		 */

		T t = new T(2, 5);
		printWall(t);     //��������
		
		Tetromino j=new J(1,4);   //�������� 
		printWall(j);
		
        Z z=new Z(2,5);
        printWall(z);
        
        O o=new O(2,4);
        printWall(o);
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
