// LABORATORIO N° 1 - EJERCICIO 3
// AUTOR: JHONATAN BENJAMIN MAMANI CÉSPEDES
// TIEMPO: 7 MINUTOS
import java.util.*;
class Act3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] soldados = new String[5];
        System.out.println("Ingrese el nombre de los 5 soldados:");
        for (int i = 0; i < 5; i++)
            soldados[i] = sc.next();
        System.out.println("Los valientes guerreros son:");
        for (int j = 0; j < 5; j++)
            System.out.println(soldados[j]);
    }
}