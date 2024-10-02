package dinamicaRobo;

public class Builder {

	public static void main (String[] args) {
		
		Model Luiza = new Model("Luiza",2, 2, 3, "Na sola da bota", "Onda-Onda", "Prepara");
		Model Maju = new Model("Maju",2, 2, 3, "Na sola da bota", "Onda-Onda", "Prepara");
		Model Kaique = new Model("Kaique",2, 2, 3, " ", " ", "Prepara");

		System.out.println("Robot - Luiza");
		System.out.println(Luiza.getnome());
		System.out.println(Luiza.getnivelPalma());
		System.out.println(Luiza.getnivelPulo());
		System.out.println(Luiza.getestiloDanca1());
		System.out.println(Luiza.getestiloDanca2());
		System.out.println(Luiza.getcomplexidadeMovi());
		System.out.println(Luiza.getdancajuntas());
		System.out.println(" ");
		System.out.println("Robot - Maju");
		System.out.println(Maju.getnome());
		System.out.println(Maju.getnivelPalma());
		System.out.println(Maju.getnivelPulo());
		System.out.println(Maju.getestiloDanca1());
		System.out.println(Maju.getestiloDanca2());
		System.out.println(Maju.getcomplexidadeMovi());
		System.out.println(Maju.getdancajuntas());
		System.out.println(" ");
		System.out.println("Robot - Kikinho");
		System.out.println(Kaique.getnome());
		System.out.println(Kaique.getnivelPalma());
		System.out.println(Kaique.getnivelPulo());
		System.out.println(Kaique.getestiloDanca1());
		System.out.println(Kaique.getestiloDanca2());
		System.out.println(Kaique.getcomplexidadeMovi());
		System.out.println(Kaique.getdancajuntas());
		
		
		
	}
	
}
