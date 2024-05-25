public abstract class mensajeBuilder implements Builder {
    protected String titulo;
    protected String descripcion;

    @Override
    public Builder Titulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public Builder Descripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public Builder limpiar() {
        this.titulo = "";
        this.descripcion = "";
        return this;
    }

}
