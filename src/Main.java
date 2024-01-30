import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
int a,b,c;
int cevre;


        Scanner input=new Scanner(System.in);
        a= input.nextInt();
        b= input.nextInt();
        c= input.nextInt();
        cevre=a+b+c;
        int u=cevre/2;
        double alan=u*(u-a)*(u-b)*(u-c);
        alan=Math.sqrt(alan);
        System.out.println(alan);
        }

}