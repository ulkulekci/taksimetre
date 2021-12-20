
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner kilometre=new Scanner(System.in);
        System.out.println("gidilen uzaklığı girin:");
       double km=kilometre.nextInt();
       double odenecektutar=(km*2.20+10); //taksimetre açılış ücreti 10 lira
        System.out.println(odenecektutar>=20?"ödenecek tutar:"+odenecektutar+"TL": "ödenecek tutar:"+20+"TL");
    }
}
