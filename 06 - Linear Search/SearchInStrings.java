import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class SearchInStrings
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = "mohit";
        char target = 'o';
        System.out.print(strcmp(str, target));
    }


    static boolean strcmp(String str, char target){
        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static boolean strcmp2(String str, char target){
        for(char ch: str.toCharArray()){
            if(target == ch){
                return true;
            }
        }
        return false;
    }
}