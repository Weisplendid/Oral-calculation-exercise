
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
import java.math.BigDecimal;

/**
 *创建日期 : 2021-10-18
 *创建时间 : 15:45:55
 *创建者   : WYX
 */


public class Weisplendid_float {
    
    public static void main(String args[]){
        System.out.println(float_cal_div());
    }
    
    
    static bool float_calculate() {
        bool res;
        Random r = new Random();
        int num = r.nextInt(4);
        switch(num) {
            case 0:
                res = float_cal_plus()
                break;
            case 1:
                res = float_cal_sub()
                break;
            case 2:
                res = float_cal_mtu()
                break;
            case 3:
                res = float_cal_div()
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
        
        System.out.println(BDnumA.toString()+"+"+BDnumB.toString()+"=?");
        String resBD= BDnumA.add(BDnumB).toString();
        Scanner sc = new Scanner(System.in);
        String res = sc.nextLine();
        if(res.endsWith(resBD)){
            return true;
        }else{
            return false;
        }
    }
    
    static boolean float_cal_sub(){
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
        //System.out.println(num1-num2);
        
        System.out.println(BDnumA.toString()+"-"+BDnumB.toString()+"=?");
        String resBD= BDnumA.subtract(BDnumB).toString();
        Scanner sc = new Scanner(System.in);
        String res = sc.nextLine();
        if(res.endsWith(resBD)){
            return true;
        }else{
            return false;
        }
    }

    static boolean float_cal_mtu(){
        Random r = new Random();
        int num1 = r.nextInt(10000);
        int num2 = r.nextInt(10000);
        if(num1 < num2){
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
        //System.out.println(num1*num2);
        
        System.out.println(BDnumA.toString()+"*"+BDnumB.toString()+"=?");
        String resBD= BDnumA.multiply(BDnumB).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        Scanner sc = new Scanner(System.in);
        String res = sc.nextLine();
        if(res.endsWith(resBD)){
            return true;
        }else{
            return false;
        }
    }

    static boolean float_cal_div(){
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
//        System.out.println(BDnumA.divide(BDnumB));
        System.out.println(1.0*num1/num2);
        
        System.out.println(BDnumA.toString()+"/"+BDnumB.toString()+"=?");
        String resBD= BDnumA.divide(BDnumB,2).toString();
        Scanner sc = new Scanner(System.in);
        String res = sc.nextLine();
        if(res.endsWith(resBD)){
            return true;
        }else{
            return false;
        }
    }
}
