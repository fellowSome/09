package oo.day03_1;

public class Cell {
   int row;
   int col;
   Cell(int row,int col){
	   this.row=row;
	   this.col=col;
   }
   void drop(){
	   row++;
   }
   void moveLeft(){
	   col--;
   }
   void moveRight(){
	   col++;
   }
   String getCellInfo(){
	return row+"+"+col;
	   
   }
}
