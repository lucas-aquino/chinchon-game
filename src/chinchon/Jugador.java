package chinchon;

import java.util.Set;
import java.util.TreeSet;

public class Jugador {
	private Set<Carta> mano;
	
	public  Jugador() {
		this.mano = new TreeSet<Carta>();
	}
	
	public void juntarCarta(Mazo mazo) {
		if(this.mano.size() < 7)
			this.agregarCarta(mazo.darCarta());
	}
	
	public void agregarCarta(Carta carta) {
		this.mano.add(carta);
	}
}
