/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ratio;

/**
 *
 * @author HP
 */
public class Ratio {

public static double findRatio(int[] arr) {
    int smallest1 = Integer.MAX_VALUE;
    int smallest2 = Integer.MAX_VALUE;
    int largest1 = Integer.MIN_VALUE;
    int largest2 = Integer.MIN_VALUE;

    for (int num : arr) {
        if (num < smallest1) {
            smallest2 = smallest1;
            smallest1 = num;
        } else if (num < smallest2) {
            smallest2 = num;
        }

        if (num > largest1) {
            largest2 = largest1;
            largest1 = num;
        } else if (num > largest2) {
            largest2 = num;
        }
    }

    return (double) (largest1 + largest2) / (smallest1 + smallest2);
}
public static void main(String[] args) {
    int[] a={3,5,12,450,1,1,5,6,23,6,8,9,321,2,3};
    double ratio = findRatio(a);
    System.out.println("Ratio of array : " + ratio);
}
}
