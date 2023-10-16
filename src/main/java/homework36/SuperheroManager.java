package homework36;


import java.util.ArrayList;
import java.util.List;

public class SuperheroManager {
    Superhero superhero = new Superhero("Halk", 5, 45);
    private List<Superhero> superheroes = new ArrayList();

    public void addSuperhero(Superhero superhero) {
        if (getSuperhero(superhero.getName()) == null || superhero != null) superheroes.add(superhero);

    }

    public void removeSuperhero(String name) {
        superheroes.removeIf(superhero -> superhero.getName().equals(name));

    }

    public Superhero getSuperhero(String name) {
        for (Superhero superhero : superheroes) {
            if (superhero.getName().equalsIgnoreCase(name)) {
                return superhero;
            }
        }
        return null;
    }

    List<Superhero> getAllSuperheroes() {
        return new ArrayList<>(superheroes);

    }

    public void updateSuperhero(String name, Superhero newSuperhero) {
        for (int i = 0; i < superheroes.size(); i++) {
            Superhero superhero = superheroes.get(i);
            if (superhero.getName().equalsIgnoreCase(name)) {
                superheroes.set(i, newSuperhero);
                return;
            }
        }
    }

}

