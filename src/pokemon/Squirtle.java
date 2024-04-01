package pokemon;

/**
 *
 * @author estiben
 */
public class Squirtle extends Pokemon implements IAgua {

    public Squirtle() {
    }

    public Squirtle(int num_pokedex, String nombre, double pesoPokemon, String sexo, String temportadaQueAparece, String tipo) {
        super(num_pokedex, nombre, pesoPokemon, sexo, temportadaQueAparece, tipo);
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Squirtle ha atacado con placaje");
    }

    @Override
    public void atacarArañazo() {
            System.out.println("Squirtle ha atacado con arañazo");

    }

    @Override
    public void atacarMordisco() {
                System.out.println("Squirtle ha atacado con mordisco");

    }

    @Override
    public void atacarHidrobomba() {
                System.out.println("Squirtle ha atacado con hidrobomba");

    }

    @Override
    public void atacarPistolaAgua() {
                System.out.println("Squirtle ha atacado con pistola agua");

    }

    @Override
    public void atacarBurbuja() {
                System.out.println("Squirtle ha atacado con burbuja");

    }

    @Override
    public void atacarHidropulso() {
                System.out.println("Squirtle ha atacado con hidropulso");

    }
    
}
