package chinchon;

public enum Palo {
	ORO("Oro", "ORO", "O", "*"),
	ESPADA("Espada", "ESP", "E", "/"),
	COPA("Copa", "CPA", "C", "Y"),
	BASTO("Basto", "BST", "B", "!"),
	COMODIN("Comodin", "JKR", "J", "¿");
	
	private String nombre, abreviacion, inicial, simbolo;
	
	private Palo(String nombre, String abreviacion, String inicial, String simbolo) {
		this.nombre = nombre;
		this.abreviacion = abreviacion;
		this.inicial = inicial;
		this.simbolo = simbolo;
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}
	
	public String getAbreviacion() {
		return this.abreviacion;
	}
	
	public String getInicial() {
		return this.inicial;
	}
	
	public String getSimbolo() {
		return this.simbolo;
	}
}
