import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Performance
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String series = ""; 
        for(int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            series += ch;
        }
        System.out.print(series);
        // The abov way is not good as far as space utilization and its complexity is concerned. So, the solution for this is StringBuilder
    }
}