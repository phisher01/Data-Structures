package Matrices;

public class Diagonalsum {
    public static int diagonalsum(int m[][]){
        int sum=0;
        // for(int i=0;i<m.length;i++){        //O(n^2)
        //     for(int j=0;j<m[0].length;j++){
        //         if(i==j || i+j==(m.length-1)){
        //             sum+=m[i][j];
                    
        //         }
        //     }
        // }


        for(int i=0;i<m.length;i++){
            // for primary diagonal
            sum+=m[i][i];

            // for secondary digaonal 
            if(i!=m.length-1-i){

                sum+=m[i][m.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}
                         };

        int sum= diagonalsum(matrix);
        System.out.println(sum);
    }
    
}
