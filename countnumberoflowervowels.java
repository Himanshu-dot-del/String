public class countnumberoflowervowels {
    static int countlowecase(String str){
        int vowelcount=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLowerCase(ch)==true){
                if(ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u'){
                    vowelcount++;
                }
            }
        }
        return vowelcount;
    }
    public static void main(String[] args) {
        String str="Himanshu";
        System.out.println(countlowecase(str));
    }
    
}
