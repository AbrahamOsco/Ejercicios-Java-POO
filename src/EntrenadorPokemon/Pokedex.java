package EntrenadorPokemon;

import java.util.ArrayList;

public class Pokedex {

    ArrayList<String> nombresPkms;

    public Pokedex(){
        nombresPkms = new ArrayList<String>();
    }
    public void visualizarPokemon(Pokemon unPokemon) {
        String nombrePokemonAct = unPokemon.getNombre();
        for(String unNombrePkm : nombresPkms ){
            if (unNombrePkm.equals(nombrePokemonAct)){
                return;
            }
        }
        nombresPkms.add(nombrePokemonAct);
    }

    public int getCantPokemonsVistos() {
        return nombresPkms.size();
    }

}
