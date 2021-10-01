
package jktv20task5katerinagorobets;

import java.util.Random;
import java.util.Arrays;

public class JKTV20Task5KaterinaGorobets {


    public static void main(String[] args) {
        // SOZDANIE MASSIVA jaggedArray 
        System.out.println("Jagged Array:");
        int min = 50;
        int max = 100;
        
        int[][] jaggedArray = new int[5][];
        jaggedArray[0] = new int[3];
        jaggedArray[1] = new int[5];
        jaggedArray[2] = new int[7];
        jaggedArray[3] = new int[8];
        jaggedArray[4] = new int[9];
        
        //ZAPOLNENIE MASSIVA jaggedArray RANDOM
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                Random random = new Random();
                jaggedArray[i][j] = random.nextInt(max - min + 1) + min;
                System.out.printf("%4d", jaggedArray[i][j]);
            }
            System.out.println();
        }
        
        // SOZDANIE MASSIVA numbers 
        
        int[][] numbers = new int[5][];
        numbers[0] = new int[3];
        numbers[1] = new int[5];
        numbers[2] = new int[7];
        numbers[3] = new int[8];
        numbers[4] = new int[9];
        
        //KOPIROVANIE V MASSIV numbers ZNACHENIJ IZ jaggedArray
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = jaggedArray[i][j];
                
                //System.out.printf("%4d", numbers[i][j]);
            }
            //System.out.println();
        }
        
       //SORTIROVKA MASSIVA numbers:
        
        System.out.println("Bubble sort:");
       
        // BUBBLE SORT:
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                
                
                for (int k = 0; k < numbers[i].length - j - 1; k++) {
                    if (numbers[i][k] > numbers[i][k + 1]) {
                        int temp = numbers[i][k];
                        numbers[i][k] = numbers[i][k + 1];
                        numbers[i][k + 1] = temp;
                    }
                }
                System.out.printf("%4d", numbers[i][j]);
            }
            System.out.println();
        }
        
        // SOZDANIE MASSIVA sortArray METODOM KLONIROVANIA STROK: 
        
        System.out.println("Clone and Sort by methods of Class Arrays:");
        
        int[][] sortArray = new int[jaggedArray.length][];
        for (int i = 0; i < jaggedArray.length; i++) {
            sortArray[i] = jaggedArray[i].clone(); // klonirovanie stroki
        }

        // SORTIROVKA MASSIVA sortArray METODOM KLASSA Arrays

        for (int[] row : sortArray) {
            Arrays.sort(row); // sortirovka stroki
            System.out.println(Arrays.toString(row));
        }
        
    }
    
}
