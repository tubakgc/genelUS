import java.util.Scanner;

public class usalma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,k;
        System.out.print("üssü alınacak sayı:");
        n= scan.nextInt();
        System.out.print("üs olacak sayı:");
        k=scan.nextInt();

        int total=1;

        for (int i=1; i<=k; i++){

            total *= n;



        }
        System.out.print("cevap:" + total);

    }
}
