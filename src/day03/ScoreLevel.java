package day03;

import java.util.Scanner;

public class ScoreLevel {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if (score > 100 || score < 0) {
            System.out.println("-----       -----      | |");
            System.out.println("       ---             0 0");
		} else if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 60) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	}

}
