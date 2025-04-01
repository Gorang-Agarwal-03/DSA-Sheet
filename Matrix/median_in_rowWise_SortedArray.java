package Matrix;

public class median_in_rowWise_SortedArray {
    public static int median(int m[][] , int r,int c){
        int n = r*c;
        int medianIndex = n/2;
        int start = 2;
        int end = 2000;
        
        while(start<end){
          int mid = start + (end-start)/2;
          int lesserele = findSmallerEle(m , mid);
          if(lesserele <=medianIndex){
              start = mid+1;
          }else{
              end = mid-1;
          }
        }
        return start;
      }
      static int findSmallerEle(int mat[][], int mid){
          //Traverse the matrix
          int numberofsmallerEle =0;
          for(int i=0;i<mat.length;i++){
              // matrix[i] -> 0,1,2....
              //apply binary search on matrix[i]
              int str =0;
              int lst = mat[i].length-1;
              while(str<=lst){
                  int mid2 = str+(lst-str)/2;
                  if(mat[i][mid2] <= mid){
                      str = mid2+1;
                  }else{
                      lst = mid2-1;
                  }
              }
              numberofsmallerEle+=str;
          }
          return numberofsmallerEle;
      }
      public static void main(String[] args) {
          int r=3;
          int c=3;
          int m[][] ={
                     {1,3,5},
                     {2,6,9},
                     {3,6,9}
          };
          System.out.println(median(m, r, c));
      }
}
