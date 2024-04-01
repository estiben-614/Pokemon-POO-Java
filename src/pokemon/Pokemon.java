package pokemon;

/**
 *
 * @author estiben
 */
public abstract class Pokemon {
    
    protected int num_pokedex;
    protected String nombre;
    protected double pesoPokemon;
    protected String sexo;
    protected String temportadaQueAparece;
    protected String tipo;
    
    public abstract void atacarPlacaje();
    public abstract void atacarArañazo();
    public abstract void atacarMordisco();

    protected Pokemon(int num_pokedex, String nombre, double pesoPokemon, String sexo, String temportadaQueAparece, String tipo) {
        this.num_pokedex = num_pokedex;
        this.nombre = nombre;
        this.pesoPokemon = pesoPokemon;
        this.sexo = sexo;
        this.temportadaQueAparece = temportadaQueAparece;
        this.tipo = tipo;
    }
    
    protected Pokemon(){
        
    }
    
    
    
}
