package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        //task1();
        //task2();
        //task3();


    }

    private static void task3()
    {
        int n =3, exe = 18;
        Random random = new Random();
        int[] array = new int[exe];
        int[] sum = new int[n];
        sum[0] = 0;
        sum[1] = 0;
        sum[2] = 0;
        for (int i = 0; i < array.length ; i++)
        {
            array[i] = random.nextInt(100);
        }
        for (int j = 0; j < 5; j++)
        {
            sum[0] = array[j] + sum[0];
        }
        for (int k = 5; k < 13; k++)
        {
            sum[1] = array[k] + sum[1];
        }
        for (int l = 13; l < array.length; l++)
        {
            sum[2] = array[l] + sum[2];
        }

        if (sum[0] > sum[1] && sum[0] > sum[2])
        {
            System.out.println("The best - main exe.");
        } else
            if (sum[1] > sum[0] && sum[1] > sum[2])
            {
                System.out.println("The best - short exe.");
            } else
                if (sum[2] > sum[0] && sum[2] >sum[1] )
                {
                    System.out.println("The best - free exe.");
                }

    }

    private static void task2()
    {
        int sum = 0, amm = 600 ;
        int exe = 10;
        int[] array = new int[exe];
        Random random = new Random();
        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextInt(100);
            sum = sum + array[i];
        }
        if (sum < amm)
        {
            System.out.println("dismiss");
        } else
        {
            System.out.println("complete");
        }
    }

    private static void task1()
    {
        int sum = 0, num;
        int p = 35;
        int[] array = new int[p];
        Random random = new Random();
        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextInt(10000);
            sum = sum + array[i];
        }
        if (sum < 100000)
        {
            System.out.println("summa menshe");
        } else
        {
            System.out.println("summa bolshe");
        }
    }
}
