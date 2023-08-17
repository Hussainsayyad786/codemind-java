import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int r;
        if(a<b && a<c){
            r=a;
        }
        else if (b<a && b<c) {
            r=b;
        }
        else{
            r=c;
            
        }
        System.out.println(a+b+c-r);
      
    }
}