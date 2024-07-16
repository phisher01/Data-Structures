public class grid {

//     public static int countGrid(int i,int j,int n,int m){
// if(i==n-1 && j==m-1){
//     return 1;

// }else if(i==n|| j==m){
//     return 0;

// }


//         return countGrid(i+1, j,n,m)+ countGrid(i, j+1,n,m);
//     }
public static int fact(int n){
    if(n==1){
        return n;
    }
    return n*fact(n-1);
}

public static int countGrid(int rows,int columns){                  // works in O(n) complexitysudoku
    int rMoves=columns-1;
    int dMoves=rows-1;


    int permutations=fact(rMoves+dMoves)/(fact(rMoves)*fact(dMoves));
    return permutations;
}
    public static void main(String[] args) {
        int n=15;
        int m=20;
        System.out.println(countGrid(3,3));
        // System.out.println(fact(2));
        
    }
}