import java.util.*;

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
			select(grade);
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
	public static void select(int gradenum) {

		if(gradenum==1)
			countgrade(1);
		if(gradenum==2)
			if(getRandomNumberInRange(0,9)<3)
				countgrade(1);
			else
				countgrade(2);
		if(gradenum==3)
			{
			int temp=getRandomNumberInRange(0,9);
				if(temp==0)
					countgrade(1);
				else if(temp<4)
					countgrade(2);
				else 
					countgrade(3);


			}
	}
	public static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	public static void countgrade(int gradenum) {
		switch (gradenum)
			{
			case 1:
				if(Cal_AS())
					correctNumber++;
				break;
			case 2:
				if(Cal_MD())
					correctNumber++;
				break;
			case 3:
				if(float_cal())
					correctNumber++;
				break;
			}
	}
	public static boolean Cal_MD(){//输入1是乘法，0是除法
		int i = new java.util.Random().nextBoolean() ? 1 : 0;
		boolean output = false;
		boolean test = true;
		Scanner sc=new Scanner(System.in);
		
		if(i == 1){
			int num1 = (int)(Math.random()*100);//乘数1
			int num2 = (int)(Math.random()*100);//乘数2
			System.out.println(num1 +" * "+ num2 +" = ?");
			int num3 = num1*num2;//乘积
			int c=sc.nextInt();
			if(c == num3){
				output = true;
			} else {
				output = false;
			}
		}
		
		if(i == 0){
			while(test == true){
				int num5 = (int)(Math.random()*99 + 1);//被除数
				int num6 = (int)(Math.random()*99 + 1);//商				
				int num4 = num5*num6;//除数				
				if(num4 < 100){
					System.out.println(num4 +" / "+ num5 +" = ?");
					int c=sc.nextInt();
					if(c == num6){
						output = true;
					} else {
						output = false;
					}
					test = false;
				}
			}
		}
		
		return output;
	}
	public static boolean Cal_AS(){
		int i = new java.util.Random().nextBoolean() ? 1 : 0;
		boolean output = false;
		boolean test = true;
		Scanner sc=new Scanner(System.in);
		
		if(i == 1){
			int num1 = (int)(Math.random()*100);
			int num2 = (int)(Math.random()*100);
			System.out.println(num1 +" + "+ num2 +" = ?");
			int num3 = num1+num2;
			int c=sc.nextInt();
			if(c == num3){
				output = true;
			} else {
				output = false;
			}
		}
		
		if(i == 0)  {
			int num4 = (int)(Math.random()*100);
			int num5 = (int)(Math.random()*100);
			if (num4 < num5){
				int t =num4;
				num4 =num5;
				num5 = t;
			} 
                                  				
            int num6 = num4-num5;			
            System.out.println(num4 +" -"+ num5 +" = ?");
			int c=sc.nextInt();
			if(c == num6){
				output = true;
			} else {
				output = false;
			}

		}
		return output;
	}
}
