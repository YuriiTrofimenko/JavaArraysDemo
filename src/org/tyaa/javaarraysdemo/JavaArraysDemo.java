/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javaarraysdemo;

/**
 *
 * @author student
 */
public class JavaArraysDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] intArray = new int[4];
        /*for (int i : intArray) {
            System.out.println(i);
        }*/
        intArray[0] = 10;
        intArray[1] = 11;
        intArray[2] = -1;
        System.out.println();
        /*for (int i : intArray) {
            System.out.println(i);
        }*/
        
        //System.out.println();
        //System.out.println(intArray[1]);
        
        /*for (int i = 0; i < 3; i++) {
            //System.out.println(i);
            intArray[i]=i++;
        }*/
        
        /*for (int i = 0; i < 3; i++) {
            int data = i + 1;
            intArray[i] = data;
        }*/
        
        /*for (int i = 0; i < 3;) {
            
            intArray[i] = ++i;
        }*/
        
        for (int i = 0; i < intArray.length;) {
            
            intArray[i] = ++i;
        }
        
        /*for (int item : intArray) {
            System.out.println(item);
        }*/
        
        /*for (int i = 0; i < intArray.length; i++) {
            //if (i != 2) {
                //System.out.println(intArray[i]);
            //}
            if (i % 2 != 0) {
                System.out.println(intArray[i]);
            }
        }*/
        
        /*int[][] array2 = new int[3][];
        array2[0] = intArray;
        array2[1] = new int[]{22, -7, 0, 16, 100};
        array2[2] = new int[]{3,14,-8,1,32};
        
        for (int[] subarray : array2) {
            if (subarray != null) {
                for (int item : subarray) {
                    //System.out.printf("%d ", item);
                    System.out.printf("%4d", item);
                }
            }
            System.out.println();
        }*/
        
        table();
    }
    
    private static void table(){
    
        int[][] tab = new int[11][11];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (j == 0) {
                    tab[i][j] = i;
                } else if (i == 0) {
                    tab[i][j] = j;
                } else {
                    tab[i][j] = i * j;
                }
                
            }
        }
        
        for (int[] row : tab) {
            for (int cell : row) {
                System.out.printf("%4d", cell);
            }
            System.out.println();
        }
    }
}
