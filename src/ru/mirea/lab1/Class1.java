package ru.mirea.lab1;

public class Class1 {
    public static void main(String[] args) {
        int array[] = new int[10];
        int sum = 0;
        array[0] = 1;
        array[1] = 1;
        array[2] = 1;
        array[3] = 1;
        array[4] = 1;
        array[5] = 1;
        array[6] = 1;
        array[7] = 1;
        array[8] = 1;
        array[9] = 1;
        for (int i = 0; i < 10; i++) {
            sum = sum + array[i];
        }
        System.out.print(sum);
    }
}