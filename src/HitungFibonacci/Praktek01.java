
package HitungFibonacci;

import java.math.BigInteger;
import java.util.Scanner;

public class Praktek01 {
    
    private static void tampilJudul(String identitas) {
        System.out.println("Identitas : " + identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
    }
    private static int tampilInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bilangan ke-: ");
        int n = scanner.nextInt();
        
        return n;
    }
    
}
