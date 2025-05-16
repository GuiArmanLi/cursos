import java.util.HashMap;
import java.util.Map;

public class Pokedex {
    private Map<String, Pokemon> pokemons;

    public Pokedex() {
        this.pokemons = new HashMap<>();
    }

    public Pokedex(Map<String, Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public Map<String, Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(Map<String, Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public void adicionarPokemon(Pokemon pokemon) {
        this.pokemons.put(pokemon.getNome(), pokemon);
    }

    @Override
    public String toString() {
        return "Pokedex [pokemons=" + pokemons + "]";
    }
}
