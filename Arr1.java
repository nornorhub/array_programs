/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arr1;

/**
 *
 * @author noureldinelhelw23
 */
public class Arr1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = new int[20];
        for (int i = 0, j = 0; i < arr.length; i++, j +=2) {
            arr[i] = j;
        }
    }
    
}
