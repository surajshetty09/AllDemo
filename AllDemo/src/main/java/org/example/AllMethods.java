package org.example;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class AllMethods {
    public void mathod1(){
        System.out.println("Hello");
    }

    public void Duplicates(){
        //input find out dublicates
        //input 2,3,4,2,6,4
        //output 2,4

        int[] all={2,3,4,2,6,4};
        HashSet<Integer> arr= new HashSet<>();
        HashSet<Integer> dup = new HashSet<>();

        for(int num:all){
            if(!arr.add(num)){
                dup.add(num);
            }
        }
        System.out.println("Array: "+arr);
        System.out.println("Duplicate: "+dup);

    }

    public static void countingValleys() {
        String str = "UDDDUDUUUDDDUDUU";
        char curChar;
        int pos=0;
        int peak=0;

        for(int i=0;i<str.length();i++){
            curChar=str.charAt(i);
            if(curChar == 'U'){
                pos = pos + 1;
            }
            else if(curChar == 'D'){
                pos=pos -1;
            }
            if(pos==0 && curChar=='U'){
                peak=peak+1;
            }
        }
        System.out.println("No of Valleys: "+peak);
        ////////////////////
        /*int steps = 8;
        String path = "UDDU";
        int elevation = 0; // Start at sea level
        int valleys = 0;
        boolean inValley = false;

        for (char step : path.toCharArray()) {
            if (step == 'U') {
                elevation++;
            } else {
                elevation--;
            }

            if (step == 'U' && elevation == 0) {
                inValley = false; // Exiting a valley
            } else if (step == 'D' && elevation == -1 && !inValley) {
                inValley = true;
                valleys++; // Entering a new valley
            }
        }
        System.out.println("No of Valleys: "+valleys);*/
    }
    public void matrixMinSum(){

        int rows=0, col=0;
        Scanner scan = new Scanner(System.in);

        int[] min = new int[2];
        int sum =0;
        System.out.println("Enter Number of rows: ");
        rows = scan.nextInt();
        System.out.println("Enter Number of Columns: ");
        col = scan.nextInt();
        System.out.println("Enter Matrix values: ");

        int[][] matrix = new int[rows][col];

        for(int i=0;i<rows;i++){
            for(int j=0; j<col;j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println("Printing Matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0; j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<rows;i++){
            min[i]= matrix[i][0];
            for(int j=1;j<col;j++){
                if(min[i] > matrix[i][j]){
                    min[i] = matrix[i][j];
                }
            }
        }
        System.out.println("Result: "+Arrays.stream(min).sum());

    }
    public void printStar(){
        int N =4;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value: "+N);

    }
}
