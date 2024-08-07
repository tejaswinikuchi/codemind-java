import java.util.Scanner;
public class Choco{
    public static void main(String args[]){
        int x,y,z;
        Scanner sc  = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        int res = ((x*5)+(y*10))/z;
        System.out.println(res);
        
    }
}