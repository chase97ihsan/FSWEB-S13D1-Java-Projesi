import java.util.Scanner;


public class Main {



    public static  boolean  shouldWakeUp(boolean isBarking,int clock){
        if(clock<0||clock>23){
            return false;
        }
        if(!isBarking){return false;}
       return clock<8||clock>=20;
    }
    public static  boolean  hasTeen(int first,int second,int third){
        if((first>=13&&first<=19)||(second>=13&&second<=19)||(third>=13&&third<=19)){
            return true;
        }else return false;

    }
    public static  boolean  hasTeenOptional(int ...ages){
        for(int age:ages){
         if(age>=13&&age<=19){return true;}

        }
        return false;

    }
    public static  boolean  isCatPlaying(boolean summer,int temparature){

            if(summer)
            {return temparature>25&&temparature<=45;}
            else{return temparature>25&&temparature<=35;}
    }
    public static  double  area(double first,double second){

        if(first<0||second<0){return -1;}
        return  first*second;
    }
    public static  double  area(double radius){

        if(radius<0){return -1;}
        return  radius*radius*Math.PI;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp (false, 2));
        System.out.println(shouldWakeUp(true,8));
        System.out.println(shouldWakeUp(true,-1));
        System.out.println("Hello world!");
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("Hello world!");
        System.out.println(hasTeenOptional(9,18,20,8,99));
        System.out.println(hasTeenOptional(9,35,20,8,99));
        System.out.println("Hello world!");
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));
        System.out.println("Rect. Area:");
        Scanner scanner = new Scanner(System.in);
        boolean isValid=false;
        while (isValid) {
            try {

                System.out.println("Enter ur first value of rect.");
                double first = scanner.nextDouble();
                System.out.println("Enter ur second value of rect.");
                double second = scanner.nextDouble();
                System.out.println("Area=" + area(first, second));
            } catch (Exception ex) {
                isValid=false;
                System.out.println("Invalid");
            }
        }
        System.out.println("Circle. Area:");
        System.out.println("Enter radius:");
        double radius = scanner.nextDouble();
        System.out.println("result"+area(radius));






    }
}