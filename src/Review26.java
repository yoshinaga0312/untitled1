public class Review26 {
    public static void main(String[] args) {
        int[] numArray = new int[]{11,11,10,11,10};
        int target = 11;
        int count = 0;
        for(int i = 0 ; i < numArray.length ; i++){
            if(numArray[i] == target){
                count++;
            }
        }
        System.out.println("探索した値:" + target);
        System.out.println("一致した値:" + count);
    }
}
