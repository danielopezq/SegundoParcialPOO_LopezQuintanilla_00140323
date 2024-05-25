public class Director extends mensajeBuilder {

    @Override
    public Mensaje build() {
        return new mensaje(this);       
    }
}

    

    
