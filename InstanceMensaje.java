public class InstanceMensaje {
    private static InstanceMensaje instance = new Mensaje();
    private Director builder;

    private Mensaje() {
        builder = new Director();
    }

    public static Mensaje getInstance() {
        return instance;
    }

    public MensajeBuilder getBuilder() {
        return builder;
    }

    public void Limpiador(){
        builder.limpiar();
    }
}