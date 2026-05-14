package ec.edu.utpl.compoutacion.proava;

public class matriz implements Runnable {
    private String[] fila;
    private String palabraBuscada;
    private int conteo;
    private int numeroFila;

    public matriz(String[] fila, String palabraBuscada, int numerofila) {
        setFila(fila);
        setPalabraBuscada(palabraBuscada);
        setNumeroFila(numeroFila);
        setConteo(0);
    }

    public String[] getFila() {
        return fila;
    }

    public void setFila(String[] fila) {
        this.fila = fila;
    }

    public String getPalabraBuscada() {
        return palabraBuscada;
    }

    public void setPalabraBuscada(String palabraBuscada) {
        this.palabraBuscada = palabraBuscada;
    }

    public int getConteo() {
        return conteo;
    }

    public void setConteo(int conteo) {
        this.conteo = conteo;
    }

    public int getNumeroFila() {
        return numeroFila;
    }

    public void setNumeroFila(int numeroFila) {
        this.numeroFila = numeroFila;
    }
}
