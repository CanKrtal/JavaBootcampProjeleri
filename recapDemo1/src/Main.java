public class Main {
    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 3;

        if (sayi1>sayi2 && sayi1>sayi3){
            System.out.println("Sayı1 büyüktür");
        } else if (sayi2>sayi1 && sayi2>sayi3) {
            System.out.println("Sayı2 büyüktür");
        }else{
            System.out.println("Sayı3 büyüktür");
        }
    }
}