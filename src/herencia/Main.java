package herencia;

public class Main {

	public static void main(String[] args) {

		Mazda2 mz =new Mazda2();
		mz.setColor("negro");
		mz.setCilindraje("2000cc");
		mz.setMaletero("si");
		mz.setPuertas(2);
		mz.setTransmision("automatico");
		
		System.out.println("Mazda2");
		System.out.println(mz.getColor());
		System.out.println(mz.getCilindraje());
		System.out.println(mz.getMaletero());
		System.out.println(mz.getPuertas());
		System.out.println(mz.getTransmision());
		
		Bronko bk = new Bronko();
		bk.setCilindraje("3000cc");
		bk.setColor("Gris");
		bk.setLlantaRepuesto(false);
		bk.setTransmision("mecanica");
		
		System.out.println("");
		System.out.println("Bronko");
		System.out.println(bk.getCilindraje());
		System.out.println(bk.getColor());
		System.out.println(bk.getTransmision());
		System.out.println(bk.getClass());
		
		//cualquier cosa
		
		
				
		
	}

}
