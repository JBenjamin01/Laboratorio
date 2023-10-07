// LABORATORIO N° 7 - EJERCICIO 1
// AUTOR: JHONATAN BENJAMIN MAMANI CÉSPEDES
// TIEMPO: 58 MINUTOS
import java.util.*;
public class VideoJuego4 {
    private List<List<Soldado>> tablero;
    private List<Soldado> ejercito1;
    private List<Soldado> ejercito2;

    public VideoJuego4() {
        tablero = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tablero.add(new ArrayList<>());
            for (int j = 0; j < 10; j++) {
                tablero.get(i).add(null);
            }
        }
        ejercito1 = new ArrayList<>();
        ejercito2 = new ArrayList<>();
    }

    public void inicializarSoldados() {
        for (int i = 0; i < 10; i++) {
            Soldado soldadoEjercito1 = new Soldado("Soldado1X" + (i + 1), (int) (Math.random() * 5) + 1, 
                                                    (int) (Math.random() * 10), (int) (Math.random() * 10));
            Soldado soldadoEjercito2 = new Soldado("Soldado2X" + (i + 1), (int) (Math.random() * 5) + 1, 
                                                    (int) (Math.random() * 10), (int) (Math.random() * 10));
    
            while (tablero.get(soldadoEjercito1.getFila()).get(soldadoEjercito1.getColumna()) != null ||
                    tablero.get(soldadoEjercito2.getFila()).get(soldadoEjercito2.getColumna()) != null) {
                soldadoEjercito1.setFila((int) (Math.random() * 10));
                soldadoEjercito1.setColumna((int) (Math.random() * 10));
    
                soldadoEjercito2.setFila((int) (Math.random() * 10));
                soldadoEjercito2.setColumna((int) (Math.random() * 10));
            }
    
            ejercito1.add(soldadoEjercito1);
            ejercito2.add(soldadoEjercito2);
    
            tablero.get(soldadoEjercito1.getFila()).set(soldadoEjercito1.getColumna(), soldadoEjercito1);
            tablero.get(soldadoEjercito2.getFila()).set(soldadoEjercito2.getColumna(), soldadoEjercito2);
        }
    }

    public void mostrarTablero() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Soldado soldado = tablero.get(i).get(j);
                if (soldado != null) {
                    System.out.print(soldado.getNombre() + "(" + soldado.getPuntosVida() + ") | ");
                } else {
                    System.out.print("_____________ | ");
                }
            }
            System.out.println();
        }
    }

    public void calcularRankingPoderIS(List<Soldado> ejercito) {
        insertionSort(ejercito);
        System.out.println("Ranking de poder (Insertion Sort):");
        for (int i = 0; i < ejercito.size(); i++) {
            System.out.println((i + 1) + ". " + ejercito.get(i).getNombre() + " - Puntos de vida: " + ejercito.get(i).getPuntosVida());
        }
    }
    public void calcularRankingPoderBS(List<Soldado> ejercito) {
        bubbleSort(ejercito);
    }

    public void insertionSort(List<Soldado> ejercito) {
        int n = ejercito.size();
        for (int i = 1; i < n; ++i) {
            Soldado key = ejercito.get(i);
            int j = i - 1;
            while (j >= 0 && ejercito.get(j).getPuntosVida() < key.getPuntosVida()) {
                ejercito.set(j + 1, ejercito.get(j));
                j = j - 1;
            }
            ejercito.set(j + 1, key);
        }
    }
    public void bubbleSort(List<Soldado> ejercito) {
    }

    public void determinarGanadorBatalla() {
        int totalPuntosE1 = ejercito1.stream().mapToInt(Soldado::getPuntosVida).sum();
        int totalPuntosE2 = ejercito2.stream().mapToInt(Soldado::getPuntosVida).sum();

        if (totalPuntosE1 > totalPuntosE2) {
            System.out.println("El ejército 1 gana la batalla.");
        } else if (totalPuntosE2 > totalPuntosE1) {
            System.out.println("El ejército 2 gana la batalla.");
        } else {
            System.out.println("Empate. Ambos ejércitos tienen la misma cantidad total de puntos de vida.");
        }
    }
    public static void main(String[] args) {
        VideoJuego4 juego = new VideoJuego4();
        juego.inicializarSoldados();
        juego.mostrarTablero();

        juego.calcularRankingPoderIS(juego.ejercito1);
        juego.calcularRankingPoderBS(juego.ejercito2);

        juego.determinarGanadorBatalla();
    }
}