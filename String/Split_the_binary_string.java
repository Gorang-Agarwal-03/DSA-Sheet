package String;

public class Split_the_binary_string {
    public static int maxSubStr(String str) {
        int n = str.length();
        int count0 = 0;
        int count1 =0;
        int count = 0;

        for(int i=0;i<n;i++){
            if(str.charAt(i)=='0'){
                count0++;
            }
            else{
                count1++;
            }

            if(count0==count1){
                count++;
            }
        }

        if(count0 !=count1){
            return -1;
        }
        return count;
     }
     public static void main(String[] args) {
        String s = "0100110101";
         int ans=maxSubStr(s);
         System.out.println(ans);
     }
    
}
