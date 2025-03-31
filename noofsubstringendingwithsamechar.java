public class noofsubstringendingwithsamechar {
    static int countsubstring(String str){
        int n=str.length();
        int cnt=n;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(str.charAt(i)== str.charAt(j)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        String str="abac";
       System.out.println( countsubstring(str));
    }
}
