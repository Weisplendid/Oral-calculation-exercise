import java.util.*;
public class Selectlogic {
	/**
	　　* @author lzt
	　　* @date 2021/10/18 
	　　* @param manage the problem need to output based on the grade(random)
	　　* @return call the correspond function
	　　*/
public static void select(int gradenum) {
	
	if(gradenum==1)
		grade(1);
	if(gradenum==2)
		if(getRandomNumberInRange(0,9)<3)
			grade(1);
		else
			grade(2);
	if(gradenum==3)
		{
		int temp=getRandomNumberInRange(0,9);
			if(temp==0)
				grade(1);
			else if(temp<4)
				grade(2);
			else 
				grade(3);
	
	
		}
}
public static int getRandomNumberInRange(int min, int max) {
	 
	if (min >= max) {
		throw new IllegalArgumentException("max must be greater than min");
	}

	Random r = new Random();
	return r.nextInt((max - min) + 1) + min;
}
public static void grade(int gradenum) {
	switch (gradenum)
		{
		case 1:
			if(Grade12Method())
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
}
