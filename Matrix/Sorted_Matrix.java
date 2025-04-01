package Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sorted_Matrix {
 public static int[][] sortedMatrix(int n,int mat[][]){
        ArrayList<Integer>ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans.add(mat[i][j]);
            }
        }
        Collections.sort(ans);
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = ans.get(k++);
            }
        }
        return mat;

    }
    public static void main(String[] args) {
        int n = 4;
        int[][]mat = {
                     {10,20,30,40},
                     {15,25,35,45},
                     {27,29,37,48},
                     {32,33,39,50}
        };
        sortedMatrix(n, mat);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
