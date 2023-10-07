// LABORATORIO N° 1 - EJERCICIO 5
// AUTOR: JHONATAN BENJAMIN MAMANI CÉSPEDES
// TIEMPO: 21 MINUTOS
class Act5 {
    public static void main(String[] args){
        int n = (int)(Math.random() * 5 + 1);
        String[] armada1 = ejercito(n);
        int m = (int)(Math.random() * 5 + 1);
        String[] armada2 = ejercito(m);

        System.out.println("Ejercito 1:");
        for (int i = 0; i < n; i++)
            System.out.println(armada1[i]);
        System.out.println("\nEjercito 2:");
        for (int j = 0; j < m; j++)
            System.out.println(armada2[j]);
        if (n > m){
            System.out.print("\nEl ejército 1, con " + n + " soldados ha ganado la batalla!!");
        } else if (n < m){
            System.out.print("\nEl ejército 2, con " + m + " soldados ha ganado la batalla!!");
        } else {
            System.out.print("\nLa batalla ha concluido en un empate.");
        }
    }
    public static String[] ejercito(int x){
        String[] soldados = new String[x];
        for (int i = 0; i < x; i++)
            soldados[i] = "Soldado" + i;
        return soldados;
    }
}