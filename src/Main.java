import java.util.Random;

import static java.lang.Math.exp;
import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
//        boolean result=varargMethod(91,34,3,54);
//        System.out.println(result);
//    }
//    public static boolean varargMethod(int num, int ... number) {
//        int w = 0;
//        for (int i = 0; i < number.length; i++) {
//            w+= number[i];
//        }
//        if (w==num) return true;
//        else return false;


        String[] array={"Krok","Less","More","Digger"};

        for(String name: array){
            System.out.println(name+" is Java developer");
        }
    }
}