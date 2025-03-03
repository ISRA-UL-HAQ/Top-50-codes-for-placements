
import java.util.Scanner;
public class Fibonacci{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
            "enter the number" );
            int n = sc.nextInt();

int first=0;
int second=1;
System.out.println("Fibonacci series:"+first+""+second);
for (int i=2;i<n;i++){
    int next = first+second;
    System.out.println(""+next);
    first =second;
    second=next;
}
sc.close();






    }
}