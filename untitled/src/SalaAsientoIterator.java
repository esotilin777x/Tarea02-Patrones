import java.util.LinkedList;

public class SalaAsientoIterator implements Iterator {
    private Sala sala;
    private int posicion;
    private LinkedList<Asiento> asientos;

    public SalaAsientoIterator(Sala sala) {
        this.sala = sala;
        this.asientos = sala.getAsientos();
        this.posicion = 0;
    }

    @Override
    public boolean hasNext() {
        return posicion < asientos.size();
    }

    @Override
    public Asiento next() {
        if (!hasNext()) {
            throw new IllegalStateException("No hay más asientos disponibles.");
        }
        return asientos.get(posicion++);
    }
}


