import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int r=a%3;
        if(r==0){
            System.out.println("NORMAL");
        }
        else if(r==1){
            System.out.println("HUGE");
        }
        else{
            System.out.println("SMALL");
        }
        
    }
}