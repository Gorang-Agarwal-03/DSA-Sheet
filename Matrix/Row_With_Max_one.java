package Matrix;

public class Row_With_Max_one {
    public static  int rowWithMax(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int col = m-1;
        int row = -1;
        for(int i=0;i<n;i++){
            for(int j =col;j>=0;j--){
                if(arr[i][j] == 1){
                    row=i;
                    col--;
                }else{
                    break;
                }
            }
        }
        return row;

    } 
    public static void main(String[] args) {
        int arr[][] = {
                      {0,1,1,1},
                      {0,0,1,1},
                      {1,1,1,1},
                      {0,0,0,0}
        };
        System.out.println("Row Number : "+rowWithMax(arr));
        
    }
}
