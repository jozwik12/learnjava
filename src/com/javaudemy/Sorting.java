package com.javaudemy;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;

public class Sorting {
    public static void main(String[] args){

        // generowanie tablic losowej i posortowanych

        Random rnd = new Random();
        int[] tab = new int[5000];
        for(int i = 0; i < 4999; ++i){
            tab[i] = rnd.nextInt(10000);
        }
        int[] rosnace = tab.clone();
        Arrays.sort(rosnace);
        int[] malejace = new int[5000];
        for(int i = 0; i < rosnace.length; ++i){
            malejace[i] = rosnace[rosnace.length - i - 1];
        }

        // koniec generowania tablic, poczatek sortowania

        System.out.println("Zaczynam sortowanie...\n");

        System.out.println("InsertSort");
        InsertSort(tab);
        InsertSort(rosnace);
        InsertSort(malejace);
        System.out.print("\n");

        System.out.println("BubbleSort");
        BubbleSort(tab);
        BubbleSort(rosnace);
        BubbleSort(malejace);
        System.out.print("\n");

        System.out.println("QuickSort");
        QuickSort(tab);
        QuickSort(rosnace);
        QuickSort(malejace);
        System.out.print("\n");

        System.out.println("HeapSort");
        HeapSort(tab);
        HeapSort(rosnace);
        HeapSort(malejace);
        System.out.print("\n");

        System.out.println("MergeSort");
        MergeSort(tab);
        MergeSort(rosnace);
        MergeSort(malejace);
    }

    public static long czas(){
        return Calendar.getInstance().getTimeInMillis();
    }
    public static void koniec(long poczatek) {
        long czas = Calendar.getInstance().getTimeInMillis() - poczatek;
        System.out.println("Czas trwania: " + czas + " milisekund");
    }

    public static int[] InsertSort(int[] tab){
        int[] sorted = new int[5000];
        long czas = czas();



        koniec(czas);
        return sorted;
    }

    public static int[] BubbleSort(int[] tab){
        int[] sorted = new int[5000];
        long czas = czas();



        koniec(czas);
        return sorted;
    }

    public static int[] QuickSort(int[] tab){
        int[] sorted = new int[5000];
        long czas = czas();



        koniec(czas);
        return sorted;
    }

    public static int[] HeapSort(int[] tab){
        int[] sorted = new int[5000];
        long czas = czas();



        koniec(czas);
        return sorted;
    }

    public static int[] MergeSort(int[] tab){
        int[] sorted = new int[5000];
        long czas = czas();



        koniec(czas);
        return sorted;
    }
}
