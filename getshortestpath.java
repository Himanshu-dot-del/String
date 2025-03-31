 public class getshortestpath {
    static float shortestpath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='n'){
                 y++;
            }
            else if(path.charAt(i)=='s'){
                 y--;
            }
            else if(path.charAt(i)=='w'){
                 x--;
            }
            else{
                 x++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
        
       
    }
    public static void main(String[] args) {
        String path="wneenesennn";
        System.out.println(shortestpath(path));
    }
}

