import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int r=a%(b*c);
        if(r==0){
            System.out.println(a/(b*c));
        }
        else {
            System.out.println(a/(b*c)+1);
        }
      
    }
}