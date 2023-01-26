package KosulluIfadelerveKodBlokları;

import java.util.Scanner;

public class UcakBiletiFiyati {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int age = input.nextInt();

        System.out.println("Yolculuk tipini giriniz (1=> Tek Yön, 2=> Gidiş Dönüş): ");
        int type = input.nextInt();
        double perkm = 0.10;

        if (mesafe >= 0 && age>=0&&(type==1||type==2)) {
            double price = mesafe * perkm;
            if (age < 12) {
                price = price / 2;
                switch (type) {
                    case 1:
                        price = price;
                        break;
                    default:
                        price = price - (price / 5);
                }
            } else if (age >= 12 && age < 24) {
                price = price - (price / 10);
                switch (type) {
                    case 1:
                        price = price;
                        break;
                    default:
                        price = price - (price / 5);
                }
            } else if (age > 65) {
                price = price - (price * 30 / 100);
                switch (type) {
                    case 1:
                        price = price;
                        break;
                    default:
                        price = price - (price / 5);
                }
            } else {
                price = price;
                switch (type) {
                    case 1:
                        price = price;
                        break;
                    default:
                        price = price - (price / 5);
                }
            }
            System.out.println("Tutar: " + price);
        }else {
            System.out.println("Hatalı veri girdiniz.");
        }
    }
}
