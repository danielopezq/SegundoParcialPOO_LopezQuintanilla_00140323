public class Main {
    public static void main(String[] args) {
        Mensaje mensaje = Mensaje.getInstance();
        Mensaje mensaje = mensaje.getBuilder().getTitulo().getDescripcion().build();
        mensaje.Limpiador();
        System.out.println(mensaje1);
    }
}
