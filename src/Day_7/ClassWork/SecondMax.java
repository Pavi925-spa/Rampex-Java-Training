package Day_7.ClassWork;

public class SecondMax {
    public static void main(String[] args){
        int secondmax = 0;
        int max = 0;
        int [] arr = {3,5,7,8,9};
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                secondmax = max;
                max = arr[i];
            }
        }
        System.out.println("Second maximum value:" + secondmax);
        System.out.println("Maximum value: " + max);
    }
}
