// public class stringcompression {
//     public static void main(String[] args) {
//         String str="aaabbcccdd";
//         String ans=str.charAt(0)+"";
//         int cnt=1;
//         for(int i=1;i<str.length()-1;i++){
//             String curr=str.charAt(i)+"";
//             String prev=str.charAt(i-1)+"";
//             if(curr==prev){
//                 cnt++;
               
//             }
//             else{
//                 if(cnt>1){
//                     ans+=cnt;
//                     cnt=1;
//                     ans=curr;
//                 }
//             }


//         }
//         if(cnt>1){
//             ans+=cnt;
//             System.out.println(ans);
//         }
//     }
//}

public class stringcompression {
    static String compress(String str){
        String newstr="";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
                count++;
                i++;
            }
            newstr+=str.charAt(i);
            if(count>1){
                newstr+=count.toString();
            }
        }
        return newstr;
    }
    public static void main(String[] args) {
        String str="aaabbcccdd";
        System.out.println(compress(str));
    }
}
