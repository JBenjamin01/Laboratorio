// LABORATORIO N° 1 - EJERCICIO 2
// AUTOR: JHONATAN BENJAMIN MAMANI CÉSPEDES
// TIEMPO: 15 MINUTOS
import java.util.*;
class Act2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name1, name2, name3, name4, name5;
        int hp1, hp2, hp3, hp4, hp5;
        System.out.println("Ingrese el nombre y los puntos de vida (entre 1 y 5) de los 5 soldados:");
        System.out.print("Nombre: ");
        name1 = sc.next();
        System.out.print("Nivel de vida: ");
        hp1 = sc.nextInt();
        while (hp1 < 1 || hp1 > 5){
            System.out.print("Ingrese un nivel de vida valido: ");
            hp1 = sc.nextInt();
        }
        System.out.print("Nombre: ");
        name2 = sc.next();
        System.out.print("Nivel de vida: ");
        hp2 = sc.nextInt();
        while (hp2 < 1 || hp2 > 5){
            System.out.print("Ingrese un nivel de vida valido: ");
            hp2 = sc.nextInt();
        }
        System.out.print("Nombre: ");
        name3 = sc.next();
        System.out.print("Nivel de vida: ");
        hp3 = sc.nextInt();
        while (hp3 < 1 || hp3 > 5){
            System.out.print("Ingrese un nivel de vida valido: ");
            hp3 = sc.nextInt();
        }
        System.out.print("Nombre: ");
        name4 = sc.next();
        System.out.print("Nivel de vida: ");
        hp4 = sc.nextInt();
        while (hp4 < 1 || hp4 > 5){
            System.out.print("Ingrese un nivel de vida valido: ");
            hp4 = sc.nextInt();
        }
        System.out.print("Nombre: ");
        name5 = sc.next();
        System.out.print("Nivel de vida: ");
        hp5 = sc.nextInt();
        while (hp5 < 1 || hp5 > 5){
            System.out.print("Ingrese un nivel de vida valido: ");
            hp5 = sc.nextInt();
        }
        System.out.println("Datos de los soldados:\n" + "Nombres  |   Vida");
        System.out.println(name1 + "    \t" + hp1);
        System.out.println(name2 + "    \t" + hp2);
        System.out.println(name3 + "    \t" + hp3);
        System.out.println(name4 + "    \t" + hp4);
        System.out.println(name5 + "    \t" + hp5);
    }
}