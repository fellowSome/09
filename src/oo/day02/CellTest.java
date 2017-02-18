package oo.day02;

public class CellTest {

	public static void main(String[] args) {
	   
		Cell c=new Cell();
		Cell c1=new Cell(2);
		Cell c2=new Cell(4,5);
	
		
		c.drop();
		c.drop(3);
		c.moveLeft();
		c.moveLeft(2);
		printWall(c);
		
		c1.drop();
		c1.drop(1);
		c1.moveLeft();
		c1.moveLeft(3);
		printWall(c1);
		
		c2.drop();
		c2.drop(4);
		c2.moveLeft();
		c2.moveLeft(1);
		printWall(c2);
		
	}
	static void printWall(Cell c){
		for(int i=0;i<20;i++){
			for (int j=0;j<10;j++){
				if(i==c.row	&& j==c.col){
					System.out.print("*");
				}else{
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}
    
}
