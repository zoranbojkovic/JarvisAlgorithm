package jarvisalgorithm;

import java.util.Scanner;


public class JarvisAlgorithm {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[]x = new double[8];
        double[]y = new double[8];
        for (int i = 0; i < 8; i++) {
            System.out.println("Unesite x, pa y koordinatu " + (i+1) + ". tačke");
            x[i] = sc.nextDouble();
            y[i] = sc.nextDouble();
        }
                
    }
    
}
