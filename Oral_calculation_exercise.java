import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

import jdk.internal.dynalink.beans.StaticClass;


public class Oral_calculation_exercise {
	
	static int correctNumber = 0;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String Grade;
		int grade = 0, questionNumber, score;
		
		
		
		
		System.out.println("Please enter your grade?");
		Grade = sc.next();
		if(Grade.equals("grade")) {
			grade = sc.nextInt();
		}else {
//			exit(-1);
		}
		grade = Integer.valueOf(grade);
		System.out.println("Please enter the number of questions?");
		questionNumber = sc.nextInt();
		while(questionNumber-- > 0) {
//			select(grade);
			System.out.println("yes");
		}
		System.out.print("end!");
		score = correctNumber/questionNumber;
		if(score < 100 && score >= 0) {
			System.out.print("There are " + (questionNumber - correctNumber) + " wrong questions, your score is " + score + ".");
		}else if(score == 100) {
			System.out.print("All right, that's great! your score is " + score + ".");
		}
	}
}
