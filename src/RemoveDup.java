import java.util.Arrays;

public class RemoveDup {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,2,3,3};
        System.out.println(remDuplicats(arr));
        System.out.println(Arrays.toString(arr));

    }
    public static int remDuplicats(int[] arr){
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }

}
