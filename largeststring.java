class largeststring{
    public static void main(String[] args) {
        String fruits[]={"appple","mango","banana"};
        String largest=fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareToIgnoreCase(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println("largest string is"+ " "+largest);
    }
}