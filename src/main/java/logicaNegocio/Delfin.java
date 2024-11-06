package logicaNegocio;


public class Delfin extends Animal {
    private TipoHabitat habitat;

    
    public Delfin() {
        this.habitat = TipoHabitat.ACUATICO;
    }

    
    @Override
    public String emitirSonido() {
        return "Chirrido";
    }

    
    @Override
    public String obtenerDieta() {
        return "Pescado";
    }

    
    public TipoHabitat obtenerHabitat() {
        return habitat;
    }
}
