package com.utils;

import java.util.Arrays;
import java.util.Scanner;

        public class ArrayRotation {
            private static Scanner scan = new Scanner(System.in);

            public static void shift(int shiftElements, int arr[]) {
                for (int j = 0; j < shiftElements; j++) {
                    int k = arr[0];
                    for (int i = 0; i < arr.length - 1; i++) {
                        arr[i] = arr[i + 1];
                    }
                    arr[arr.length - 1] = k;
                }
            }

            public static void main(String arg[]) {
                System.out.print("Print array length: ");
                int arrayLength;
                arrayLength = scan.nextInt();
                int [] arr = new int [arrayLength];
                for (int f = 0; f < arrayLength; f++){
                    System.out.print("Print the " + f + " array element: ");
                    int arrayElemet;
                    arrayElemet = scan.nextInt();
                    arr[f] = arrayElemet;
                }
                System.out.print("Print, how many of elements should be moved to the array end: ");
                int shiftElements;
                shiftElements = scan.nextInt();
                shift(shiftElements, arr);
                System.out.print(Arrays.toString(arr));
            }
        }

