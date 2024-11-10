package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Intervel {
    public static int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals,(i1,i2)-> i1[0]-i2[0]);
        int[]in = intervals[0];
        int i=1;
        while(i<intervals.length){
            if(in[1]<intervals[i][0]){
                result.add(in);
                in = intervals[i];
            }else{
                in[1] = Math.max(in[1], intervals[i][1]);
            }
            i++;
        }
        result.add(in);
        return result.toArray(new int[result.size()][]);
        
    }
    public static void main(String[] args) {

        int[][]arr =  {
                       {1,3},
                       {2,6},
                       {8,10},
                       {15,18}
                       };
       int ans[][]= merge(arr);
       for(int i=0;i<ans.length;i++){
        for(int j=0;j<ans.length;j++){
            System.out.println(ans[i][j]);
        }
       }
    }
    
    
}
