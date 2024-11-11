package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Find_Comman_In_Sorted_Array {
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2, List<Integer> arr3) {
        // Code Here
        List<Integer> result = new ArrayList<Integer>();
        int i=0;
        int j=0;
        int k=0;

        while(i<arr1.size() && j<arr2.size() && k<arr3.size()){
            if(arr1.get(i).equals(arr2.get(j)) && arr2.get(j).equals(arr3.get(k))){
                if(result.isEmpty()){
                    result.add(arr1.get(i));
                }
                i++;
                j++;
                k++;
            }
            else if(arr1.get(i) < arr2.get(j)){
                i++;
            }
            else if(arr3.get(k) < arr2.get(j)){
                k++;
            }
            else{
                j++;
            }

        }
        return result;
    }
}
