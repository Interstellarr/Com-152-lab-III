package com.school;

public class Main {

    public static void main(String[] args) {
	//Declare array with grades
        int[] arr =  new int[]{72, 88, 93, 100, 62, 75, 86, 98, 93, 84, 94, 77};

        // Value of array [3]
        System.out.println("(B) The value of slot [3] in the array is " + arr[3] + "\n");

        //Value of array [2] +4
        int totalArr2 = 0;
        totalArr2 = arr[2] + 4;
        System.out.println("(C) The value of slot [2] in the array, plus 4, is " + totalArr2 + "\n" );

        //Value of arr [0] / 10
        double totalArr0 = 0;
        totalArr0 = arr[0] / 10.0;
        System.out.println("(D) The value of slot [0] in the array, divided by 10, is " + totalArr0 + "\n");

        // Value of arr [0] % 10
        double totalArr00 = 0;
        totalArr00 = arr[0] % 10.0;
        System.out.println("(E) The value of slot [0] in the array, Mod 10, is " + totalArr00 + "\n");

        //Declare variable and create loop to print one grade per line (f)
        System.out.println("(F)");

        for (int f = 0; f < 12; f++)
            System.out.println(arr[f]);



        //Declare variable and create loop to print all grades on one line, separated by spaces
        System.out.print("\n(G) ");

        for (int g = 0; g < 12; g ++)
            System.out.print(arr[g] + " ");



        //Declare variable and create loop to print all grades on one line, separated by tabs
        System.out.print("\n\n(H) ");
        for (int h = 0; h < 12 ; h++)
            System.out.print(arr[h] + "     ");


        //Declare variable and create loop to print all grades greater than 79
        System.out.print("\n\n(I) ");
        for (int i = 0 ; i < arr.length; i++ ){
            if (arr[i] > 79)
            System.out.print(arr[i] + ", ");

        }

        //Declare variable and create loop to print all grades equal to or greater than 85
        System.out.print("\n\n(J) ");
        for (int j = 0; j < arr.length; j++){
            if (arr[j] >= 85)
                System.out.print(arr[j] + ", ");
        }
    }
}
