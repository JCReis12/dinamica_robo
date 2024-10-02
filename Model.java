package dinamicaRobo;

public class Model {
	private String nome;
	private int nivelPulo;
	private int nivelPalma;
	private int complexidadeMovi;
	private String estiloDanca1;
	private String estiloDanca2;
	private String dancajuntas;
	
	Model(String nome, int veloMovi, int nivelPulo, int nivelPalma,String estiloDanca1, String estiloDanca2, String dancajuntas) {
		this.nome = nome;
		this.nivelPulo = nivelPulo;
		this.nivelPalma = nivelPalma;
		this.estiloDanca1 = estiloDanca1;
		this.estiloDanca2 = estiloDanca2;
		this.dancajuntas = dancajuntas;
	}
	
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	
	public int getnivelPulo() {
		return nivelPulo;
	}
	public void setnivelPulo(int nivelPulo) {
		this.nivelPulo = nivelPulo;
	}
	
	public int getnivelPalma() {
		return nivelPalma;
	}
	public void setnivelPalma(int nivelPalma) {
		this.nivelPalma = nivelPalma;
	}
	
	public int getcomplexidadeMovi() {
		return complexidadeMovi;
	}
	public void setcomplexidadeMovi(int complexidadeMovi) {
		this.complexidadeMovi = complexidadeMovi;
	}
	
	public String getestiloDanca1() {
		return estiloDanca1;
	}
	public void setestiloDanca1(String estiloDanca1) {
		this.estiloDanca1 = estiloDanca1;
	}
	
	public String getestiloDanca2() {
		return estiloDanca2;
	}
	public void setestiloDanca2(String estiloDanca2) {
		this.estiloDanca2 = estiloDanca2;
	}
	
	
	public String getdancajuntas() {
		return dancajuntas;
	}
	public void setdancajuntas(String dancajuntas) {
		this.dancajuntas = dancajuntas;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}