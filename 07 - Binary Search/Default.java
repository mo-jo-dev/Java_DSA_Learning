import java.util.Arrays;

public class Default{
    public static void main(String[] args){
        int[] A = {4, 6, 8, 10, 15};
        int key = 10;
        System.out.println(Arrays.binarySearch(A, key));
    }
}