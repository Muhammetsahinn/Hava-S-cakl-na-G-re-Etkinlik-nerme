import java.util.Scanner;

public class main4 {

    public static void main(String[] args){

        int sicaklik;

        Scanner grs = new Scanner(System.in);

        System.out.println("hava sicakligini yazınız");

        sicaklik = grs.nextInt();

        if(sicaklik<5){
            System.out.println("kayak yapmak icin uygun gün");
        }
        else if(sicaklik==5||sicaklik<=15){
            System.out.println("sinemaya gitmek icin uygun gun");
        }
        else if(sicaklik==15||sicaklik<=25){
            System.out.println("piknik yapmak icin uygun gun");
        }
        else if(sicaklik>25){
            System.out.println("yuzmek icin uygun gun");
        }






    }
}
