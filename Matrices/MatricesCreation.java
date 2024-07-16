package Matrices;
import java.util.*;
public class MatricesCreation {
    public static boolean search(int matrix[][],int element){
        int m=matrix[0].length;
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==element){
                    System.out.println(" The element is found at cell("+i+","+j+")");
                    return true;
                }
            }
            }
            System.out.println("The element is not found ");
            return false;
        }
    
    public static void GreatestSmallest(int matrix[][]){
        int m=matrix[0].length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                max=Math.max(max,matrix[i][j]);
                min=Math.min(min,matrix[i][j]);
                
                
            }
        }
            System.out.println("The largest and smallest  element in the array is : "+max+","+min);
        }
    
    public static void printmatrix(int matrix[][]){
        int n =matrix.length;
        int m=matrix[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            
                System.out.print(+ matrix[i][j]+ "  ");    
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        int n =matrix.length;
        int m=matrix[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                Scanner sc=new Scanner(System.in);
                matrix[i][j]=sc.nextInt();

            }
        }
        
        printmatrix(matrix);
        search(matrix,8);
        GreatestSmallest(matrix);

        

 
    }
    
}
