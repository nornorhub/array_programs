/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arr2;

import java.util.*;

/**
 *
 * @author noureldinelhelw23
 */
public class Arr2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("First number: ");
        int a = scan.nextInt();
        System.out.println("Second number: ");
        int b = scan.nextInt();
        System.out.println("Third number: ");
        int c = scan.nextInt();
        System.out.println("Fourth number: ");
        int d = scan.nextInt();
        System.out.println("Fifth number: ");
        int e = scan.nextInt();
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;
        arr[4] = e;
        System.out.println("" + a + " " + b +" " +c + " " + d + " " + e);
        
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
        
        
    }
    
}
