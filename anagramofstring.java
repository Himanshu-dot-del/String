import java.util.Arrays;

public class anagramofstring {
    public static void main(String[] args) {
        String str1="earth";
        String str2="heart";
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length()){
            char str1chararray[]=str1.toCharArray();
            char str2chararray[]=str2.toCharArray();
            Arrays.sort(str1chararray);
            Arrays.sort(str2chararray);
            boolean result=Arrays.equals(str1chararray,str2chararray);
            if(result==true){
                System.out.println("strings are anagrams");
            }
            else{
                System.out.println("not anagrams");
            }
        }
        else{
            System.out.println("this is not anagram bcz of length");
        }
    }
    
}
