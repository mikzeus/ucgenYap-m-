import java.util.Scanner;

public class ucgenYapma {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.println("lütfen satır sayısını giriniz:");
        int satırSayısı= inp.nextInt();

        for (int satırSırası=1; satırSırası<=satırSayısı; satırSırası++){
            for (int satırBosluk= 1; satırBosluk<=(satırSayısı-satırSırası); satırBosluk++){
                System.out.print(" ");
            }
            for (int yıldızSayısı=1; yıldızSayısı<=(2*satırSırası)-1; yıldızSayısı++){
                System.out.print("*");
            }
            System.out.println(" ");

        } for (int satırSırası = satırSayısı - 1; satırSırası > 0; satırSırası--) {
            for (int satırBosluk = 1; satırBosluk <= (satırSayısı - satırSırası); satırBosluk++) {
                System.out.print(" ");
            }
            for (int yıldızSayısı = 1; yıldızSayısı <= (2 * satırSırası) - 1; yıldızSayısı++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
