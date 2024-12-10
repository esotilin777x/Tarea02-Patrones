public class SalaVIPFactory extends SalaFactory {
    @Override
    public Sala crearSala() {
        return new Sala(2, "Sala VIP");
    }
}
