
public class toggleofastring {
    public static void main(String[] args) {
        String str="himaNSHU";
        StringBuilder sb = new StringBuilder(str);

        for(int i=0;i<str.length();i++){
            boolean flag=true;//capital letter
            char ch=sb.charAt(i);
            if(ch==' '){
                continue;
            }
            int asci=(int)ch;
            if(asci>=97){
                flag=false;
            }
            if(flag==true){
                asci+=32;
                char dh=(char)asci;
                sb.setCharAt(i,dh);
            }
            else{
                asci-=32;
                char dh=(char)asci;
                sb.setCharAt(i,dh);
            }


        }
        System.out.println(sb);
    }
    
}
