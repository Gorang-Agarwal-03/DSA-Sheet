package Array;

import java.util.ArrayList;

public class Alternate_Pos_Neg {
    static void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int n = arr.size();
        for(int i=0;i<n;i++){
            if(arr.get(i)>=0){
                pos.add(arr.get(i));
            }
            else{
                neg.add(arr.get(i));
            }
        }
            int pi=0 , ni=0;
            int i=0;
            while(pi<pos.size() && ni <neg.size()){
                if(i %2==0){
                    arr.set(i, pos.get(pi++));
                }
                else{
                    arr.set(i,neg.get(ni++));
                }
                i++;
            }
            while(pi<pos.size()){
                arr.set(i++,pos.get(pi++));
            }
            while(ni < neg.size()){
                arr.set(i++, neg.get(ni++));
            }
        }

    
    public static void main(String[] args) {

        
    }

    
}
