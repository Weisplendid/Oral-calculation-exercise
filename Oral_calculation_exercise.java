import java.util.*;
import java.math.BigDecimal;

public class Oral_calculation_exercise {
	
	static int correctNumber = 0;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String Grade;
		int grade = 0, questionNumber = 0, score;
		
		
		
		while(true) {
			System.out.println("Please enter your grade?");
			Grade = sc.nextLine();
			Grade.trim();
			Grade = Grade.replaceAll(" + ", " ");
			try {
				grade = Integer.valueOf(Grade.substring(6));
				Grade = Grade.substring(0,5).toLowerCase();
			} catch (Exception e) {
				System.out.println("Error, please input like: \"grade 5\",the number should between 1 to 6, try again");
				continue;
			}
			if(Grade.equals("grade")) {
				if(grade < 1 || grade > 6) {
					System.out.println("Error, the grade should between 1 to 6, try again");
					continue;
				}
				break;
			}else {
				System.out.println("Error, please input like: \"grade 5\", try again");
			}
		}
		
		while(true) {
			System.out.println("Please enter the number of questions?");
			String questionNumberString = sc.nextLine();
			try {
				questionNumber = Integer.valueOf(questionNumberString);
			} catch (Exception e) {
				System.out.println("Error, please input an integer, try again");
				continue;
			}
			if(questionNumber > 0) 
				break;
			else {
				System.out.println("Error, please input a positive number, try again");
				continue;
			}
		}
		
		int count_i = questionNumber;
		while(count_i > 0) {
			select(grade);
			count_i--;
		}
		System.out.print("end! ");
		score = 100*correctNumber/questionNumber;
		if(score < 100 && score >= 0) {
			if(questionNumber - correctNumber == 1)
				System.out.println("There is 1 wrong question, your score is " + score + ".");
			else
				System.out.println("There are " + (questionNumber - correctNumber) + " wrong questions, your score is " + score + ".");
		}else if(score == 100) {
			System.out.println("All right, that's great! your score is " + score + ".");
		}else {
			System.out.println("Program error");
		}
	}
	public static void select(int gradenum) {

		if(gradenum==1 || gradenum==2)
			countgrade(1);
		if(gradenum==3 || gradenum==4)
			if(getRandomNumberInRange(0,9)<3)
				countgrade(1);
			else
				countgrade(2);
		if(gradenum==5 || gradenum==6)
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
				if(float_calculate())
					correctNumber++;
				break;
			}
	}
	public static boolean Cal_MD(){//输入1是乘法，0是除法
		int i = new java.util.Random().nextBoolean() ? 1 : 0;
		boolean output = false;
		boolean test = true;
		
		if(i == 1){
			int num1 = (int)(Math.random()*100);//乘数1
			int num2 = (int)(Math.random()*100);//乘数2
			System.out.println(num1 +" * "+ num2 +" =?");
			int num3 = num1*num2;//乘积
			String Res = sc.nextLine();
			int c;
			try {
				c = Integer.parseInt(Res);
			} catch (Exception e) {
				return false;
			}
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
				if(num4 < 500){
					System.out.println(num4 +" / "+ num5 +" =?");
					String Res = sc.nextLine();
					int c;
					try {
						c = Integer.parseInt(Res);
					} catch (Exception e) {
						return false;
					}
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
		
		if(i == 1){
			int num1 = (int)(Math.random()*100);
			int num2 = (int)(Math.random()*100);
			System.out.println(num1 +" + "+ num2 +" =?");
			int num3 = num1+num2;
			String Res = sc.nextLine();
			int c;
			try {
				c = Integer.parseInt(Res);
			} catch (Exception e) {
				return false;
			}
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
            System.out.println(num4 +" - "+ num5 +" =?");
            String Res = sc.nextLine();
			int c;
			try {
				c = Integer.parseInt(Res);
			} catch (Exception e) {
				return false;
			}
			if(c == num6){
				output = true;
			} else {
				output = false;
			}

		}
		return output;
	}
	static boolean float_calculate() {
        boolean res = true;
        Random r = new Random();
        int num = r.nextInt(4);
        switch(num) {
            case 0:
                res = float_cal_plus();
                break;
            case 1:
                res = float_cal_sub();
                break;
            case 2:
                res = float_cal_mtu();
                break;
            case 3:
                res = float_cal_div();
                break;
        }
        return res;
    }
    
    static boolean float_cal_plus(){
        Random r = new Random();
        int num1 = r.nextInt(10000);
        int num2 = r.nextInt(10000);
        String numA = String.valueOf(0.01*num1);
        String numB = String.valueOf(0.01*num2);
        BigDecimal BDnumA = new BigDecimal(numA);
        BDnumA = BDnumA.setScale(2,BigDecimal.ROUND_HALF_UP);
        BigDecimal BDnumB = new BigDecimal(numB);
        BDnumB = BDnumB.setScale(2,BigDecimal.ROUND_HALF_UP);
        
//        System.out.println(BDnumA);
//        System.out.println(BDnumB);
//        System.out.println(BDnumA.add(BDnumB));
//        System.out.println(num1+num2);
        
        System.out.println(BDnumA.stripTrailingZeros().toPlainString()+" + "+BDnumB.stripTrailingZeros().toPlainString()+" =?");
        double resBD= BDnumA.add(BDnumB).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
        String Res = sc.nextLine();
        double res;
        try {
        	res = Double.parseDouble(Res);
		} catch (Exception e) {
			return false;
		}
        if(res == resBD){
            return true;
        }else{
            return false;
        }
    }
    
    static boolean float_cal_sub(){
        Random r = new Random();
        int num1 = r.nextInt(10000);
        int num2 = r.nextInt(10000);
        if(num1 < num2) {
        	int t = num1;
        	num1 = num2;
        	num2 = t;
        }
        String numA = String.valueOf(0.01*num1);
        String numB = String.valueOf(0.01*num2);
        BigDecimal BDnumA = new BigDecimal(numA);
        BDnumA = BDnumA.setScale(2,BigDecimal.ROUND_HALF_UP);
        BigDecimal BDnumB = new BigDecimal(numB);
        BDnumB = BDnumB.setScale(2,BigDecimal.ROUND_HALF_UP);
        
//        System.out.println(BDnumA);
//        System.out.println(BDnumB);
//        System.out.println(BDnumA.add(BDnumB));
        //System.out.println(num1-num2);
        
        System.out.println(BDnumA.stripTrailingZeros().toPlainString()+" - "+BDnumB.stripTrailingZeros().toPlainString()+" =?");
        double resBD= BDnumA.subtract(BDnumB).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
        String Res = sc.nextLine();
        double res;
        try {
        	res = Double.parseDouble(Res);
		} catch (Exception e) {
			return false;
		}
        if(res == resBD){
            return true;
        }else{
            return false;
        }
    }

    static boolean float_cal_mtu(){
        Random r = new Random();
        int num1 = r.nextInt(500);
        int num2 = r.nextInt(500);
        if(num1 < num2){
            int t = num1;
            num1 = num2;
            num2 = t;
        }
        String numA = String.valueOf(0.1*num1);
        String numB = String.valueOf(0.1*num2);
        BigDecimal BDnumA = new BigDecimal(numA);
        BDnumA = BDnumA.setScale(1,BigDecimal.ROUND_HALF_UP);
        BigDecimal BDnumB = new BigDecimal(numB);
        BDnumB = BDnumB.setScale(1,BigDecimal.ROUND_HALF_UP);
        
//        System.out.println(BDnumA);
//        System.out.println(BDnumB);
//        System.out.println(BDnumA.add(BDnumB));
        //System.out.println(num1*num2);
        
        System.out.println(BDnumA.stripTrailingZeros().toPlainString()+" * "+BDnumB.stripTrailingZeros().toPlainString()+" =?");
        double resBD= BDnumA.multiply(BDnumB).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
        String Res = sc.nextLine();
        double res;
        try {
        	res = Double.parseDouble(Res);
		} catch (Exception e) {
			return false;
		}
        if(res == resBD){
            return true;
        }else{
            return false;
        }
    }

    static boolean float_cal_div(){
        Random r = new Random();
        int num1 = r.nextInt(5000);	//商
        int num2 = r.nextInt(499)+1;	//除数
        String numA = String.valueOf(0.01*num1);
        String numB = String.valueOf(0.1*num2);
        BigDecimal BDnumA = new BigDecimal(numA);
        BDnumA = BDnumA.setScale(2,BigDecimal.ROUND_HALF_UP);
        BigDecimal BDnumB = new BigDecimal(numB);
        BDnumB = BDnumB.setScale(1,BigDecimal.ROUND_HALF_UP);
        BigDecimal BDnumC = BDnumA.multiply(BDnumB);
        
        
        System.out.println(BDnumC.stripTrailingZeros().toPlainString()+" / "+BDnumB.stripTrailingZeros().toPlainString()+" =?");
        double resBD= BDnumA.doubleValue();
        String Res = sc.nextLine();
        double res;
        try {
        	res = Double.parseDouble(Res);
		} catch (Exception e) {
			return false;
		}
        if(res == resBD){
            return true;
        }else{
            return false;
        }
    }
}
