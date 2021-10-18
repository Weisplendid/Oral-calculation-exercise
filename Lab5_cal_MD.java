package myfile;

import java.util.Scanner;

public class Lab5_cal_MD {
	
	public static boolean Cal_MD(int i){//输入1是乘法，0是除法		
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
		
	public static void main(String[] args) {		
		int i = new java.util.Random().nextBoolean() ? 1 : 0;
		System.out.println(Cal_MD(i));
		
	}	
}

