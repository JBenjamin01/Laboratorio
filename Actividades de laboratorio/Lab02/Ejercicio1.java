// LABORATORIO N° 2 - EJERCICIO 1
// AUTOR: JHONATAN BENJAMIN MAMANI CÉSPEDES
// TIEMPO: 43 MINUTOS (EN PROCESO)

import java.util.*;
public class Ejercicio1 {
    public static void main(String []args){
        String ahor1 = "  +---+ \n"+
                       "  |   | \n" +
                       "      | \n" +
                       "      | \n" +
                       "      | \n" +
                       "      | \n" +
                       "========= ";
        String ahor2 = "  +---+ \n"+
                       "  |   | \n" +
                       "  O   | \n" +
                       "      | \n" +
                       "      | \n" +
                       "      | \n" +
                       "========= ";
        String ahor3 = "  +---+ \n"+
                       "  |   | \n" +
                       "  O   | \n" +
                       "  |   | \n" +
                       "      | \n" +
                       "      | \n" +
                       "========= ";
        String ahor4 = "  +---+ \n"+
                       "  |   | \n" +
                       "  O   | \n" +
                       " /|   | \n" +
                       "      | \n" +
                       "      | \n" +
                       "========= ";
        String ahor5 = "  +---+ \n"+
                       "  |   | \n" +
                       "  O   | \n" +
                       " /|\\  | \n" +
                       "      | \n" +
                       "      | \n" +
                       "========= ";
        String ahor6 = "  +---+ \n"+
                       "  |   | \n" +
                       "  O   | \n" +
                       " /|\\  | \n" +
                       " /    | \n" +
                       "      | \n" +
                       "========= ";
        String ahor7 = "  +---+ \n"+
                       "  |   | \n" +
                       "  O   | \n" +
                       " /|\\  | \n" +
                       " / \\  | \n" +
                       "      | \n" +
                       "========= ";
        String [] figuras = {ahor1, ahor2, ahor3, ahor4, ahor5, ahor6, ahor7};
        int contador = 1;
        String letra;
        String [] palabras = {"programacion", "java", "indentacion", "clases",
                                        "objetos", "desarrollador", "pruebas"};
        String palSecreta = getPalabraSecreta(palabras);
        String palabraSecretisima = palSecreta;
        System.out.println(figuras[0]);
        mostrarBlancos(palSecreta);
        System.out.println("\n");
        int contadorTamaño = 0;
        int turnos = 0;
        while (contador <= 6){
            letra = ingreseLetra();
            if (letraEnPalabraSecreta(letra, palabraSecretisima)){
                System.out.println(figuras[contador - 1]);
                mostrarBlancosActualizados(letra, palSecreta);
                System.out.print("\n");
                palabraSecretisima = actualizacion(letra, palabraSecretisima);
                contadorTamaño++;
            } else if (letraEnPalabraSecreta(letra, palabraSecretisima) == false){
                System.out.println(figuras[contador]);
                contador++;
            }
            turnos++;
            if (contadorTamaño == palSecreta.length()) break;
        }
        if (contador > 6)
            System.out.println("Has perdido. La palabra era: " + palSecreta);
        else
            System.out.println("¡Has ganado! Te tomó " + turnos + " turnos adivinar la palabra.");
    }
    public static String getPalabraSecreta(String [] lasPalabras){
        int ind;
        int indiceMayor = lasPalabras.length -1;
        int indiceMenor = 0;
        ind = (int) ((Math.random() * (indiceMayor - indiceMenor + 1) + indiceMenor));
        return lasPalabras[ind];
    }
    public static void mostrarBlancos(String palabra){
        for(int i = 0; i < palabra.length(); i++)
            System.out.print("_ ");
    }
    public static String ingreseLetra(){
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String laLetra;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese letra: ");
        laLetra = sc.next();
        char letra = laLetra.charAt(0);
        while (laLetra.length() != 1 || abc.indexOf(letra) == -1){
            System.out.println("Ingrese letra: ");
            laLetra = sc.next();
            letra = laLetra.charAt(0);
        }
        return laLetra;
    }
    public static boolean letraEnPalabraSecreta(String letra, String palSecreta ){
        return (palSecreta.indexOf(letra) != -1);
    }
    public static String actualizacion(String letra, String palabraSecretisima){
        int idx = palabraSecretisima.indexOf(letra);
        String palabraActualizada = palabraSecretisima.substring(0, idx) + palabraSecretisima.substring(idx + 1);
        return palabraActualizada;
    }
    public static void mostrarBlancosActualizados(String letra, String palSecreta){
        int idx = palSecreta.indexOf(letra);
        String inicio = "";
        for(int i = 0; i < idx; i++)
            inicio += "_ ";
        String fin = "";
        for(int i = 0; i < palSecreta.length() - (idx + 1); i++)
            fin += "_ ";
        System.out.println(inicio + letra + " " + fin);
    }
}