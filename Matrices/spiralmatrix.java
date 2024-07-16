package Matrices;

import java.util.Scanner;

public class spiralmatrix {
    public static void printmatrix(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            
                System.out.print(+ matrix[i][j]+ "  ");    
            }
            System.out.println();
        }
    }
    public static void spiralprint(int matrice[][]){
        int startRow=0;
        int endRow=matrice.length-1;
        int startCol=0;
        int endCol=matrice[0].length-1;
        // for printing top boundary
        while(startRow<=endRow && startCol<=endCol){
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrice[startRow][j]+"  ");
            }
            // for printing right boundary
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrice[i][endCol]+"  ");
            }
            // for printing bottom boundary
            for(int j=endCol-1;j>=startCol;j--){
                System.out.print(matrice[endRow][j]+"  ");

            }
            // for printing left boundary
            for(int i=endRow-1;i>=startRow+1;i--){
                System.out.print(matrice[i][startCol]+"  ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;

            
        }
    }
    public static  void main(String args[]){
        int matrix[][]={{1, 2 , 3, 4, 5},
                        {6, 7,  8, 9,10},          
                        {11,12,13,14,15},   
                        {16,17,18,19,20},
                        {21,22,23,24,25}
                    };
        spiralprint(matrix);
        System.out.println();
    ;
        printmatrix(matrix);


    }


}