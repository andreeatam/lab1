import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner intrare=new Scanner(System.in);
        float sum=0;
        int count=0;
        int nr;
        nr=intrare.nextInt();
        while(nr!=0)
        {
            count++;
            sum=sum+nr;
            nr=intrare.nextInt();
        }

        System.out.println("Media aritmetica este: "+ sum/count);



    }
}