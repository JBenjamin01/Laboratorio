// LABORATORIO N° 1 - EJERCICIO 4
// AUTOR: JHONATAN BENJAMIN MAMANI CÉSPEDES
// TIEMPO: 9 MINUTOS
import java.util.*;
class Act4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] soldados = new String[5];
        int [] hp = new int[5];
        System.out.println("Ingrese el nombre y los puntos de vida (de 1 a 5) de los 5 soldados:");
        for (int i = 0; i < 5; i++){
            System.out.print("Nombre: ");
            soldados[i] = sc.next();
            System.out.print("Nivel de vida: ");
            hp[i] = sc.nextInt();
            while (hp[i] < 1 || hp[i] > 5){
                System.out.print("Ingrese un nivel de vida valido: ");
                hp[i] = sc.nextInt();
            }
        }
        System.out.println("Datos de los soldados:\n" + "Nombres  |   Vida");
        for (int j = 0; j < 5; j++)
            System.out.println(soldados[j] + "    \t" + hp[j]);
    }
}