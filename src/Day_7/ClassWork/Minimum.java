package Day_7.ClassWork;

public class Minimum {
    public static void main(String[] args){
        int [] arr = {2,3,4,5};
        int min = 10000;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum:"+min);
    }
}
