import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class MultiDimArrList
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // System.out.print(`Namaste World`);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);

    }
}