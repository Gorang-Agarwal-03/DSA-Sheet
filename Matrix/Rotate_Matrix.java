package Matrix;

public class Rotate_Matrix {
    static void rotate(int mat[][]) {
        int n = mat.length;
        //Transpose of matrix
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp; 
            }
        }
        for(int i=0;i<n;i++){
            int j=0;
            int k = n-1;
            
            while(j<=k){
                int temp = mat[i][j];
                mat[i][j] = mat[i][k];
                mat[i][k] = temp;
                j++;
                k--;
                
            }
        }
    }
    public static void main(String[] args) {
        int mat[][] =  {
                        {1 ,2, 3},
                        {4 ,5 ,6},
                        {7 ,8, 9}
                    };
        
    }
}
