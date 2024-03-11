package es.babel.primitiva.model;

import java.util.ArrayList;
import java.util.List;

public class JuegoPrimitiva {

    private List<Jugador> jugadores;

    public JuegoPrimitiva() {
        this.jugadores = new ArrayList<Jugador>();
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }
}
