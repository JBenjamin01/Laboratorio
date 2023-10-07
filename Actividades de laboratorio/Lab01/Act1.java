// LABORATORIO N° 1 - EJERCICIO 1
// AUTOR: JHONATAN BENJAMIN MAMANI CÉSPEDES
// TIEMPO: 5 MINUTOS
import java.util.*;
class Act1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name1, name2, name3, name4, name5;
        System.out.println("Ingrese el nombre de los 5 soldados:");
        name1 = sc.nextLine();
        name2 = sc.nextLine();
        name3 = sc.nextLine();
        name4 = sc.nextLine();
        name5 = sc.nextLine();
        System.out.println("Los valientes guerreros son:");
        System.out.print(name1 + "\n" + name2 + "\n" + name3 + "\n"
                        + name4 + "\n" + name5);
    }
}