package chinchon;

import java.util.Collections;
import java.util.Stack;

public class Mazo {
	private Stack<Carta> cartas;
	
	public Mazo() {
		this.cartas = new Stack<Carta>();
		
		for(int i = 1; i <= 12; i++) {
			cartas.add(new Carta(i, Palo.ORO));
			cartas.add(new Carta(i, Palo.ESPADA));
			cartas.add(new Carta(i, Palo.COPA));
			cartas.add(new Carta(i, Palo.BASTO));
		}
		cartas.add(new Carta(1, Palo.COMODIN));
		cartas.add(new Carta(2, Palo.COMODIN));
	}
	
	public Boolean hayCartas() {
		return !this.cartas.empty();
	}
	
	public void mezclar() {
		Collections.shuffle(this.cartas);
	}

	public Carta darCarta() {
		return this.cartas.pop();
	}
	
	public void cargarCartasDePila(Stack<Carta> pila) {
		if(!this.hayCartas()) {
			Carta ultimaCarta = pila.pop();
			this.cartas.addAll(pila);
			pila.clear();
			pila.add(ultimaCarta);
			this.mezclar();
		}
	}

	@Override
	public String toString() {
		return "Mazo [" + cartas + "]";
	}
}
