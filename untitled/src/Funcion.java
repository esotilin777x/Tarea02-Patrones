import java.util.ArrayList;
import java.util.List;

public class Funcion {
    private int idFuncion;
    private String horario;
    private List<Observer> observers;

    public Funcion(int idFuncion, String horario) {
        this.idFuncion = idFuncion;
        this.horario = horario;
        this.observers = new ArrayList<>();
    }

    public int getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(int idFuncion) {
        this.idFuncion = idFuncion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void suscribir(Observer observer) {
        observers.add(observer);
    }

    public void notificar() {
        for (Observer observer : observers) {
            observer.recibirNotificacion("La función " + idFuncion + " cambió de horario a " + horario);
        }
    }

    public void cambiarHorario(String nuevoHorario) {
        this.horario = nuevoHorario;
        notificar();
    }
}
