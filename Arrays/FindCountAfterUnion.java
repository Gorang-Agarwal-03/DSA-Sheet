package Arrays;

import java.util.HashSet;
import java.util.Set;

public class FindCountAfterUnion {
    public static int findUnion(int a[], int b[]) {
      // Your code here
        int count = 0;
        // Your code here
        Set<Integer> hs = new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(hs.add(a[i])){
            count++;
            }
        }
        for(int i=0;i<b.length;i++){
           if(hs.add(b[i])){
            count++;
           }
        }
        return count;
}
public static void main(String[] args) {
    int a[] = {1, 2, 3, 4, 5};
    int b[] = {1, 2, 3};
    System.out.println(findUnion(a, b));
}
}
