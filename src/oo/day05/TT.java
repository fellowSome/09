package oo.day05;

class Outer {
    private int time;
    private Inner inner;
    Outer(int time) {
        this.time = time;
        inner = new Inner();
        inner.timeInc();
    }
    public void printTime() {
        System.out.println(time);
    }
    class Inner {
        public void timeInc() {
            time++;
        }
    }
}
public class TT{
	public static void main(String[] args){
		Outer ot=new Outer(0);
	}
}