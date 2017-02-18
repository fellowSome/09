package oo.day03_1;

public class T extends Tetromino{
	T(int row,int col){
		for(int i=0;i<cells.length;i++){
			cells[0]=new Cell(row,col);
			cells[1]=new Cell(row,col+1);
			cells[2]=new Cell(row,col+2);
			cells[3]=new Cell(row+1,col+1);
		}
	}
	

}
