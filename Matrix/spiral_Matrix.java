package Matrix;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class spiral_Matrix {
    public static ArrayList<Integer>spirallyTraverse(int mat[][]){
        ArrayList<Integer>ans = new ArrayList<>();
        int r = mat.length;
        int c = mat[0].length;
        int topRow = 0;
        int rightCol = c-1;
        int bottomRow = r-1;
        int leftCol = 0;
        while(topRow<=bottomRow && leftCol<=rightCol){
            for(int i=leftCol;i<=rightCol;i++){
                ans.add(mat[topRow][i]);
            }
            topRow++;
            for(int i=topRow;i<=bottomRow;i++){
                ans.add(mat[i][rightCol]);
            }
            rightCol--;
            if(topRow<=bottomRow){
                for(int i=rightCol;i>=leftCol;i--){
                    ans.add(mat[bottomRow][i]);
                }
                bottomRow--;
            }
            if(leftCol<=rightCol){
                for(int i=bottomRow;i>=topRow;i--){
                    ans.add(mat[i][leftCol]);
                }
                leftCol++;
            }
        }
        return ans;
        

    }

    public static void main(String[] args) {
        int mat[][] = {
                      {1,2,3,4,5,6},
                      {7,8,9,10,11,12},
                      {13,14,15,16,17,18}
                    };
    ArrayList<Integer>ans = spirallyTraverse(mat);
    for(int i=0;i<ans.size();i++){
        System.out.print(ans.get(i)+" ");
    }
    System.out.println();
        
    }
}
