package com.mycompany.CSC_Week2_Lec2;

import java.util.Scanner;

public class Hw1 {

    public static void main(String[] args) {

//Variable for getting array size from user
        int s;
        int i;
        int lowerNum = 0, upperNum = 50;

//Gets index of array from user    
        System.out.println("Input the size of the array");
        Scanner scnrSize = new Scanner(System.in);
        s = scnrSize.nextInt();

        int[] array = new int[20];

        System.out.println("Enter the elements in the array");

//Gets the values for each number in the array from user
        Scanner scnrList = new Scanner(System.in);

        for (i = 0; i < s; ++i) {
            array[i] = scnrList.nextInt();
        }

        for (i = 0; i < s; ++i) {
            System.out.print(array[i] + ", ");
        }

        System.out.println();

//Loop for finding numbers in range
        System.out.println("The numbers within " + lowerNum + " and " + upperNum + ": ");
        for (i = 0; i < s; ++i) {
            if (array[i] <= upperNum && array[i] >= lowerNum) {
                System.out.print(array[i] + ",");

            }
        }

    }

}
















































/*
    package com.mycompany.csc_week2_lec2;


public class CSC_Week2_Lec2 {
    
    int id;
   
    CSC_Week2_Lec2 nxt;
    CSC_Week2_Lec2(int id){this.id=id;}
    public String toString() {return "Class id is "+ this.id; }
    
    public static void main(String[] args){
        
        //Simple Linked List
        
        CSC_Week2_Lec2 c1 = new CSC_Week2_Lec2(1);
        CSC_Week2_Lec2 c2 = new CSC_Week2_Lec2(2);
        c1.nxt =c2;
        CSC_Week2_Lec2 c3 = new CSC_Week2_Lec2(3);
        c2.nxt = c3;
        CSC_Week2_Lec2 c4 = new CSC_Week2_Lec2(4);
        CSC_Week2_Lec2 c5 = new CSC_Week2_Lec2(5);
    
        System.out.println(c1);
    }
  /*




