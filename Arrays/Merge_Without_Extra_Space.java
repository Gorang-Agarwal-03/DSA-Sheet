package Arrays;

import java.util.Arrays;

public class Merge_Without_Extra_Space {
    public static  void mergeArrays(int a[], int b[]) {
        // code here
        int n = a.length;
        int m = b.length;
        for(int i=n-1,j=0;i>=0 && j<m;i--,j++){
            if(a[i]>b[j]){
                int t =a[i];
                a[i] = b[j];
                b[j] = t;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int x=0;x<n;x++){
            System.out.println(a[x]);
        }
        for(int y=0;y<n;y++){
            System.out.println(b[y]);
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7};
        int b[] = {0, 2, 6, 8, 9};
        mergeArrays(a, b);

    }
    
}
