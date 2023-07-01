import java.util.Scanner;
public class Main {
    public static boolean PalindromeWord(String original){
        String ters = "";
        for(int j=original.length()-1;j>=0;j--){
            ters = ters + original.charAt(j);
        }
        if(original.equals(ters)){
            System.out.println("palindrom bir kelimedir");
            return true;
        }else
            System.out.println("palindrom bir kelime değildir");
            return false;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Palindrom olup olmadığının kontrol edilmesini istediğiniz kelimeyi giriniz: ");
        String str = input.nextLine();

        System.out.println(PalindromeWord(str));
    }
}