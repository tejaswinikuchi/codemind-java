import java.util.Scanner;
public class Hours{
    public static void main(String args[]){
        int m;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
       int hours = m/60;
       int min = m%60;
       System.out.println(hours + " Hour(s)" +" "+ min + " Minute(s)");
}
}