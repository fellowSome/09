package oo.day04;

public class J extends Tetromino{ 
    J(int row,int col){
    	cells[0]=new Cell(row,col);
    	cells[1]=new Cell(row+1,col);
    	cells[2]=new Cell(row+2,col);
    	cells[3]=new Cell(row+2,col-1);
    }
    void print(){
    	System.out.println("I am a J");
    	super.print();
    }
    
}
