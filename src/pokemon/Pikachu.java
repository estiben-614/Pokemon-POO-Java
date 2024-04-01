
package pokemon;

/**
 *
 * @author estiben
 */
public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
    }

    public Pikachu(int num_pokedex, String nombre, double pesoPokemon, String sexo, String temportadaQueAparece, String tipo) {
        super(num_pokedex, nombre, pesoPokemon, sexo, temportadaQueAparece, tipo);
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Pikachu ha atacado con placaje");
    }

    @Override
    public void atacarArañazo() {
                System.out.println("Pikachu ha atacado con arañazo");

    }

    @Override
    public void atacarMordisco() {
                System.out.println("Pikachu ha atacado con mordisco");

    }

    @Override
    public void atacarImpactrueno() {
                System.out.println("Pikachu ha atacado con impactrueno");

    }

    @Override
    public void atacarPunioTrueno() {
                System.out.println("Pikachu ha atacado con Puño trueno");

    }

    @Override
    public void atacarRayo() {
                System.out.println("Pikachu ha atacado con atacar rayo");

    }

    @Override
    public void atacarRayoCarga() {
                System.out.println("Pikachu ha atacado con placaje");

    }
    
}
