package pokemon;

/**
 *
 * @author estiben
 */
public class Charmander extends Pokemon implements IFuego {

    public Charmander() {
    }

    
    public Charmander(int num_pokedex, String nombre, double pesoPokemon, String sexo, String temportadaQueAparece, String tipo) {
        super(num_pokedex, nombre, pesoPokemon, sexo, temportadaQueAparece, tipo);
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Charmander ha atacado con placaje");
    }

    @Override
    public void atacarArañazo() {
        System.out.println("Charmander ha atacado con arañazo "); 
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Charmander ha atacado con mordisco"); 
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander ha atacado con puño de fuego"); 
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander ha atacado con ascuas"); 
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Charmander ha atacado con lanzallamas"); 
    }
    
}
