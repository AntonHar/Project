package HomeWorkMassiv;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Задача 1
       /* int number = 2;
        int massiv [] = new int[10];
        for(int i = 0;i < massiv.length; i++){
            massiv[i] = number;
            number+=2;
        }

        StringBuilder builderLine = new StringBuilder();
        StringBuilder builderRow = new StringBuilder();
       for(int i = 0; i < massiv.length; i++){
            builderLine.append(massiv[i] + " ");
            builderRow.append(massiv[i] + "\n");
        }
        System.out.println(builderLine.toString());
        System.out.println(builderRow.toString());*/

        //Задача 2

       /* int number = 1;
        int massiv [] = new int[50];
        for(int i = 0; i < massiv.length; i++){
            massiv[i] = number;
            number+=2;
        }

        StringBuilder builderLine = new StringBuilder();
        StringBuilder builderOnTheContraryLine = new StringBuilder();

        for(int i = 0; i < massiv.length; i++){
            builderLine.append(massiv[i] + " ");
        }
        System.out.println(builderLine.toString());

        for(int i = 49; 0 <= i; i--){
            builderOnTheContraryLine.append(massiv[i] + " ");
        }
        System.out.println(builderOnTheContraryLine.toString());*/

        // Задача 3

       /* Random random = new Random();
        int massiv [] = new int[15];
        StringBuilder builderLine = new StringBuilder();

        for(int i = 0;i < massiv.length; i++){
            massiv[i] = random.nextInt(100);
            builderLine.append(massiv[i] + " ");
        }
        System.out.println(builderLine.toString());
        int evenNumber = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 2 == 0) {
                evenNumber++;
            }
        }
            System.out.println("Number of even numbers in the array: " + evenNumber);*/



        //Задача 4

        /*Random random = new Random();
        int massiv [] = new int[20];
        StringBuilder builderLine = new StringBuilder();
        StringBuilder builderLine2 = new StringBuilder();

        for(int i = 0;i < massiv.length; i++){
            massiv[i] = random.nextInt(21);
            builderLine.append(massiv[i] + " ");
        }
        System.out.println(builderLine.toString());
        for (int i = 0; i < massiv.length; i++) {
            if (i % 2 == 1) {
                massiv[i] = 0;
            }
            builderLine2.append(massiv[i] + " ");
        }
        System.out.println(builderLine2.toString());

         */

        //Задача 5

        /*Random random = new Random();
        int massivA [] = new int[5];
        int massivB [] = new int[5];
        StringBuilder builderLine = new StringBuilder();
        StringBuilder builderLine2 = new StringBuilder();
        for(int i = 0;i < massivA.length; i++){
            massivA[i] = random.nextInt(16);
            builderLine.append(massivA[i] + " ");
        }
        for(int i = 0;i < massivB.length; i++){
            massivB[i] = random.nextInt(16);
            builderLine2.append(massivB[i] + " ");
        }
        System.out.println(builderLine.toString());
        System.out.println(builderLine2.toString());
        int total1 =0;
        int total2 = 0;
        for (int i = 0; i < massivA.length; i++) {
            total1 += massivA[i];
        }
        for (int i = 0; i < massivA.length; i++) {
            total2 += massivB[i];
        }
        int arithmeticMeanOfTheMassivaA = total1/massivA.length;
        int arithmeticMeanOfTheMassivaB = total2/massivB.length;

        if(arithmeticMeanOfTheMassivaA > arithmeticMeanOfTheMassivaB){
            System.out.println("The larger the arithmetic mean has an array with the name: massivA");
        } else{
            if(arithmeticMeanOfTheMassivaA < arithmeticMeanOfTheMassivaB){
                System.out.println("The larger the arithmetic mean has an array with the name: massivB");
            } else{
                System.out.println("The arithmetic mean of both arrays is equal");
            }
        }

         */

        //Задача 6

       /* Random random = new Random();
        int massivA [] = new int[4];
        StringBuilder builderLine = new StringBuilder();
        for(int i = 0;i < massivA.length; i++){
            massivA[i] = random.nextInt(11);
            builderLine.append(massivA[i] + " ");
        }
        System.out.println(builderLine.toString());
        for(int i = 0; i < massivA.length; i++){
            if(i>0){
                if(massivA[i-1]>=massivA[i]){
                    System.out.println("The progression is increasing");
                    break;
                }
            }
            if(i==massivA.length-1)
                System.out.println("The sequence is strictly increasing");
        }

        */

        //Задача 7

        /*Random random = new Random();
        int massivA[]=new int[12];
        int maxElement = 0;
        int indexElement = 0;
        StringBuilder builderLine = new StringBuilder();

        for(int i = 0;i < massivA.length; i++){
            massivA[i] = random.nextInt(16);
            builderLine.append(massivA[i] + " ");
        }
        System.out.println(builderLine.toString());
        for (int i = 1; i < massivA.length; i++){
            if(massivA[i] > massivA[i-1] ){
                maxElement = massivA[i];
                indexElement = i;
            }
        }
        System.out.println("The largest number " + maxElement + " and the index of its last occurrence " + indexElement);*/

        //Задача 8

        /*Random random = new Random();
        int massivA[]=new int[10];
        int massivB[] = new int [10];
        double massivC[] = new double[10];
        StringBuilder builderLineA = new StringBuilder();
        StringBuilder builderLineB = new StringBuilder();
        StringBuilder builderLineC = new StringBuilder();

        for(int i = 0;i < massivA.length; i++){
            massivA[i] = random.nextInt(10);
            builderLineA.append(massivA[i] + " ");
        }
        System.out.println("Massiv A: " + builderLineA.toString());
        for(int i = 0;i < massivA.length; i++){
            massivB[i] = random.nextInt(10);
            builderLineB.append(massivB[i] + " ");
        }
        System.out.println("Massiv B: " + builderLineB.toString());
        for(int i = 0;i < massivC.length; i++){
            massivC[i] = (massivA[i] + massivB[i]);
            builderLineC.append(massivC[i] + " ");
        }
        System.out.println("Massiv C: " + builderLineC.toString());*/

        //Задача 9

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int lCount=0,rCount=0;
        int a = sc.nextInt();
        if(a > 0) {
            if(a <= 10){
            System.out.println("Output an array " + a + " of numbers");
        } else {
            System.out.println("Enter an integer between 0 and 10!!!");
                System.out.println("Enter an integer 0-10: ");
                a = sc.nextInt();
        }
        }

        Random random = new Random();
        StringBuilder builderLine = new StringBuilder();
        int massivA[]=new int[a];
        System.out.print("Array:  ");
        for(int i = 0;i < massivA.length; i++) {
            massivA[i] = random.nextInt(15);
            System.out.print(massivA[i]+" ");
            if (i <= massivA.length / 2 - 1) {
                lCount += Math.abs(massivA[i]);
            } else {
                rCount += Math.abs(massivA[i]);
            }
            if(i==massivA.length-1){
                System.out.println(" ");
                if(lCount>rCount)
                    System.out.println("The sum of the modules of the first half of the array is greater than and equal to "+lCount);
                if(rCount>lCount)
                    System.out.println("The sum of the modules of the second half of the array is greater than and equal to "+rCount);
                if(rCount==lCount)
                    System.out.println("The sums of the modules of the first and second half are equal.");
            }
        }*/





        //Задача 10

        /*Random random = new Random();
        StringBuilder builderLine = new StringBuilder();
        StringBuilder builderLine2 = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        if (n >= 3) {
            System.out.println("You entered " + n);
        } else {
            System.out.println("You entered a number less than 3 ");
        }
        int massivA[] = new int[n];
        int t = 0;

        for (int i = 0; i < massivA.length; i++) {
            massivA[i] = random.nextInt((n + 1));
            builderLine.append(massivA[i] + " ");
        }
        System.out.println(builderLine.toString());

        for (int i = 0; i < massivA.length; i++) {
            if (massivA[i] % 2 == 0 && massivA[i] > 0) {
                t++;
            }
        }
        System.out.println(t);

        int massivB[] = new int[t];
        int m = 0;

        for (int i = 0; i < massivA.length; i++) {
            if (massivA[i] % 2 == 0 & massivA[i] != 0) {
                massivB[m] = massivA[i];
                builderLine2.append(massivB[m] + " ");
                m++;
            }
        }
        System.out.println(builderLine2.toString());*/

       // 3. Многомерные массивы

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer a: ");
        int a = sc.nextInt();
        Random random = new Random();
        StringBuilder builderLine = new StringBuilder();
        int array[][]=new int[a][a];
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(50);
                if(array[i][j] < 10) {
                    System.out.print(array[i][j] + "  ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
       /* System.out.println(builderLine.toString());
        int total= 0;
        for(int i =0; i <array.length; i++){
            int j = i;
            if(array[i][j] % 2 == 0) {
                total += array[i][j];
            }
        }
        System.out.println("The sum of even elements standing on the main diagonal: " + total);

        System.out.print("Odd elements located under the main diagonal (inclusive): ");
        for(int i = 0; i < array.length;i++){
            for(int j = 0; j <= i; j++){
                if(array[i][j] % 2 == 1) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();

        long productOfTheMainDiagonal = 1;
        for(int i = 0; i < array.length;i++){
            for(int j = 0; j < array.length; j++){
                if(i == j){
                    productOfTheMainDiagonal *= array[i][j];
                }
            }
        }
        System.out.println(productOfTheMainDiagonal);

        long productOfAnAdditionalDiagonal = 1;
        for(int i = 0; i < array.length;i++){
            for(int j = 0; j < array.length; j++){
                if(j == ((array.length -1) -i)){
                    productOfAnAdditionalDiagonal *= array[i][j];
                }
            }
        }
        System.out.println(productOfAnAdditionalDiagonal);
        if (productOfAnAdditionalDiagonal > productOfTheMainDiagonal){
            System.out.println("The product of the additional diagonal is greater than the product of the main diagonal and is equal to " + productOfAnAdditionalDiagonal);
        } else {
            if (productOfAnAdditionalDiagonal < productOfTheMainDiagonal) {
                System.out.println("The product of the main diagonal is greater than the product of the additional diagonal and is equal to " + productOfTheMainDiagonal);
            }else {
                System.out.println("TThe product of the main diagonal b the product of the additional diagonal are " + productOfTheMainDiagonal);
            }
        }

        int sumOfEvenElementsOverAnAdditionalDiagonal = 0;
        for(int i = 0; i < array.length;i++){
            for(int j = 0; j < (array.length-1-i); j++){
                if(array[i][j] % 2 == 0){
                    sumOfEvenElementsOverAnAdditionalDiagonal += array[i][j];
                }
            }
        }
        System.out.println("The sum of even elements over the additional dia: " + sumOfEvenElementsOverAnAdditionalDiagonal);
        System.out.println();*/
        // часть 3 - транспонирование матрицы
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int temp = array[j][i];
                if (array[i][j] < 10) {
                    System.out.print(temp + "  ");
                } else {
                    System.out.print(temp + " ");
                }

            }
            System.out.println();
        }
    }
}



