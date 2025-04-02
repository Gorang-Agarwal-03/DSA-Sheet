package String;

import java.util.HashMap;
import java.util.Map;

public class Dublicate_in_String {
    static void printDups(String str){
        int n= str.length();
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i),1);
            }
        }
        for(Map.Entry<Character,Integer>ans : map.entrySet()){
            if(ans.getValue()>1){
                System.out.println(ans.getKey()+", Count:"+ans.getValue());
            }
        }

    }
    public static void main(String args[]){
    String str = "test string";
    printDups(str);
  }
}
