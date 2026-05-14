package ec.edu.utpl.compoutacion.proava;

public class Main {

    public static void main(String[] args) {
        try {
            String[][] matrizDatos = {
                    {"Java", "Python", "Java"},
                    {"C++", "Java", "Go"},
                    {"Java", "Rust", "Java"}
            };

            String palabraBuscada = "Java";

            matriz[] tareas = new matriz[matrizDatos.length];
            Thread[] hilos = new Thread[matrizDatos.length];

            for (int i = 0; i < matrizDatos.length; i++) {
                tareas[i] = new matriz(matrizDatos[i], palabraBuscada, i + 1);
                hilos[i] = new Thread(tareas[i]);
                hilos[i].start();
            }

            for (int i = 0; i < hilos.length; i++) {
                hilos[i].join();
            }

            int total = 0;

            for (int i = 0; i < tareas.length; i++) {
                total = total + tareas[i].getConteo();
            }

            System.out.println("Total de apariciones de la palabra " + palabraBuscada + ": " + total);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}