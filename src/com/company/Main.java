package com.company;
import java.util.Arrays;
import java.util.Scanner;
        public class Main {
            private static Scanner num = new Scanner(System.in);
            private static Scanner nub = new Scanner(System.in);
            private static Scanner nud = new Scanner(System.in);
            public static void sdvig (int r, int arr[]) {
                for (int q = 0; q < r; q++) {
                    int k = arr[0];
                    for (int i = 0; i < arr.length - 1; i++) {
                        arr[i] = arr[i + 1];
                    }arr[arr.length - 1] = k;
                }System.out.print(Arrays.toString(arr));
            }public static void main (String arg[]) {
                System.out.print("Print array length: ");
                int w;
                w = num.nextInt();
                int [] arr = new int [w];
                for (int f = 0; f < w; f++){
                    System.out.print("Print the " + f + " array element: ");
                    int e;
                    e = nub.nextInt();
                    arr[f] = e;
                }System.out.print("Print, how many of elements should be moved to the array end: ");
                int r;
                r = nud.nextInt();
                sdvig(r, arr);
            }
        }

