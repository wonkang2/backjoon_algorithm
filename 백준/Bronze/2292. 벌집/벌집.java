import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int start = 1; 
        int x = 6;
        int end = sc.nextInt();
        int cnt = 1;
        
        while (start < end){
            start += 6 * cnt;
            cnt ++;
        }

        System.out.println(cnt);

    }
}
