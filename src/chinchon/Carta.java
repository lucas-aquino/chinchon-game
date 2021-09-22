package chinchon;

public class Carta implements Comparable<Carta>{
	private Palo palo;
	private Integer numero;
	
	public Carta(Integer numero, Palo palo) {
		this.palo = palo;
		this.setNumero(numero);
	}
	
	private void setNumero(Integer numero) {
		if(numero > 12 ||  numero < 1)
			throw new Error("");
		
		this.numero = numero;
	}
	
	public Palo getPalo() {
		return this.palo;
	}
	
	public Integer getNumero() {
		return this.numero;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((palo == null) ? 0 : palo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (palo != other.palo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.numero + " " + this.palo.getInicial();
	}

	@Override
	public int compareTo(Carta o) {
		this.getPalo().compareTo(o.getPalo());
		return this.getNumero().compareTo(o.getNumero());
	}
}
