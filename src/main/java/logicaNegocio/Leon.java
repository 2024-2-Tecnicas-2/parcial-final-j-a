package logicaNegocio;

public class Leon extends Animal {
    private TipoHabitat habitat;

    
    public Leon() {
        this.habitat = TipoHabitat.TERRESTRE;
    }

    
    @Override
    public String emitirSonido() {
        return "Rugido";
    }

    
    @Override
    public String obtenerDieta() {
        return "Carnívoro";
    }

   
    public TipoHabitat obtenerHabitat() {
        return habitat;
    }
}
