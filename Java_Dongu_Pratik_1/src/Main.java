import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k;
        int toplam =0;
        int onikikatları =0;
        double ortalama;
        Scanner inp = new Scanner(System.in);

        k = inp.nextInt();
        for (int i=0; i<=k; i++) {
            if (i % 12 == 0 && i!=0) {
                toplam = toplam + i;
                onikikatları++;
            }
        } ortalama = toplam / onikikatları;
            System.out.println(ortalama);
        }
}