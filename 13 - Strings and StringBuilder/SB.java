import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class SB
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StringBuilder series = new StringBuilder(); 
        for(int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            series.append(ch);
        }
        System.out.print(series);
    }
}