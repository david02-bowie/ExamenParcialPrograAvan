package ec.edu.utpl.compoutacion.proava;

public class matriz implements Runnable {

    private String[] fila;
    private String palabraBuscada;
    private int conteo;
    private int numeroFila;

    public matriz(String[] fila, String palabraBuscada, int numeroFila) {
        setFila(fila);
        setPalabraBuscada(palabraBuscada);
        setNumeroFila(numeroFila);
        setConteo(0);
    }

    @Override
    public void run() {
        for (int i = 0; i < getFila().length; i++) {
            if (getFila()[i].equalsIgnoreCase(getPalabraBuscada())) {
                setConteo(getConteo() + 1);
            }
        }

        System.out.println("Fila " + getNumeroFila() + ": " + getConteo() + " apariciones");
    }

    public String[] getFila() {
        return fila;
    }

    public void setFila(String[] filaNueva) {
        fila = filaNueva;
    }

    public String getPalabraBuscada() {
        return palabraBuscada;
    }

    public void setPalabraBuscada(String palabraNueva) {
        palabraBuscada = palabraNueva;
    }

    public int getConteo() {
        return conteo;
    }

    public void setConteo(int conteoNuevo) {
        conteo = conteoNuevo;
    }

    public int getNumeroFila() {
        return numeroFila;
    }

    public void setNumeroFila(int numeroFilaNueva) {
        numeroFila = numeroFilaNueva;
    }
}