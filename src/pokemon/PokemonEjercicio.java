package pokemon;

/**
 *
 * @author estiben
 */
public class PokemonEjercicio {

    public static void main(String[] args) {
        
        Charmander charmander = new Charmander();
        Pikachu pikachu = new Pikachu();
        Squirtle squirtle = new Squirtle();
        Bulbasaur bulbasaur = new Bulbasaur();
        
        charmander.atacarArañazo();
        pikachu.atacarImpactrueno();
        squirtle.atacarHidropulso();
        bulbasaur.atacarHojaAfilada();
        pikachu.atacarPunioTrueno();
        bulbasaur.atacarDrenaje();
        charmander.atacarLanzallamas();
    }
    
}
