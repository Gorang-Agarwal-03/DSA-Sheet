package Matrix;

public class Search_in_sorted_Array {
    public static boolean searchMatrix(int[][] mat ,int x){
        //  for(int i=0;i<mat.length;i++){
          //    for(int j=0;j<mat.length;j++){
            //      if(mat[i][j] == x){
              //        return true;
  //
    //              }
      //        }
        //  }
          //return false;
          int n = mat.length;
          int m  = mat[0].length;
          int low = 0;
          int high = n*m-1;
          while(low <= high){
              int mid = (low+high)/2;
              int row = mid /m;
              int col = mid % m;
              if(mat[row][col] == x){
                  return true;
              }
              else if(mat[row][col] < x){
                  low = mid+1;
              }
              else{
                  high = mid-1;
              }
          }  
          return false;
  
  
      }
      public static void main(String[] args) {
          int mat[][] = {
                      {3,30,38},
                      {40,43,60},
                      {69,72,78}
          };
          int x=60;
          System.out.println(searchMatrix(mat, x));
      }
}
