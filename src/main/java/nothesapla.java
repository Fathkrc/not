import java.util.Scanner;

public class nothesapla {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Fizik notunuzu giriniz");
        int fiz=input.nextInt();

        System.out.println("Matematik notunuzu giriniz");
        int mat=input.nextInt();

        System.out.println("Kimya notunuzu giriniz");
        int kim=input.nextInt();

        System.out.println("Biyoloji notunuzu giriniz");
        int biy=input.nextInt();

        double ortalama =(fiz+mat+kim+biy)/2;
        System.out.print("Not ortalamanız : "+ ortalama);
    }
}
