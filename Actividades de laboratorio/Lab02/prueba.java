import java.util.Scanner;

public class prueba {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String letra = "b";
        int idx = str.indexOf(letra);
        System.out.print(idx);
    }
}
