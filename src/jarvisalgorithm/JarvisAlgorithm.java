package jarvisalgorithm;

import java.util.Scanner;


public class JarvisAlgorithm {

    public static boolean method(double a, double b, double c, double d, double e, double f){
      return ((d-b)*(e-c) - (c-a)*(f-d)) >=0;  
    }
    
    public static void JarvisAlgorithm(double[]x, double[]y){
        int l = 0;
        int[]array = new int[8];
        for (int i = 0; i < 8; i++) {
            array[i] = -1;
            if(x[i] < x[l]){
                l = i;
            }
        }
        int a = l, b = (a+1)%8;
        a = b;
        while(a != l){
            
            for (int i = 0; i < 8; i++) {
                if(method(x[a],y[a],x[i],y[i],x[b],y[b])){
                    b = i;
                }
            }
            array[a] = b;
            b = (a+1)%8;
            a = b;
        }
        print(x, y, array);
    }
    
    public static void print(double[]x, double[]y, int[]array){
        for (int i = 0; i < 8; i++) {
            if(array[i] != -1){
                System.out.println("(" + x[i] + " , " + y[i] + ")");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[]x = new double[8];
        double[]y = new double[8];
        for (int i = 0; i < 8; i++) {
            System.out.println("Unesite x, pa y koordinatu " + (i+1) + ". tačke");
            x[i] = sc.nextDouble();
            y[i] = sc.nextDouble();
        }
        System.out.println("");
        JarvisAlgorithm(x, y);
                
    }
    
}
