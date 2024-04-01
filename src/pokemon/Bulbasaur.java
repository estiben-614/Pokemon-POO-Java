package pokemon;

/**
 *
 * @author estiben
 */
public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur() {
    }

    public Bulbasaur(int num_pokedex, String nombre, double pesoPokemon, String sexo, String temportadaQueAparece, String tipo) {
        super(num_pokedex, nombre, pesoPokemon, sexo, temportadaQueAparece, tipo);
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Bulbasaur ha atacado con placaje");
    }

    @Override
    public void atacarArañazo() {
            System.out.println("Bulbasaur ha atacado con placaje arañazo");

    }

    @Override
    public void atacarMordisco() {
               System.out.println("Bulbasaur ha atacado con mordisco");

    }

    @Override
    public void atacarParalizar() {
                System.out.println("Bulbasaur ha atacado con paralizar");

    }

    @Override
    public void atacarDrenaje() {
                System.out.println("Bulbasaur ha atacado con drenaje");

    }

    @Override
    public void atacarHojaAfilada() {
                System.out.println("Bulbasaur ha atacado con Hoja afilada");

    }

    @Override
    public void atacarLatigoCepa() {
                System.out.println("Bulbasaur ha atacado con Latigo Cepa");
    }
    
}
