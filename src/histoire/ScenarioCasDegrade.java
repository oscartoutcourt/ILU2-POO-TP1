package histoire;

import villagegaulois.Etal;
import personnages.Gaulois;

public class ScenarioCasDegrade {
	public static void main(String[] args) {
		Etal etal = new Etal();
		Gaulois a= new Gaulois("asterix", 10);
		try {
			etal.acheterProduit(2, a);
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}catch(IllegalStateException e) {
			e.printStackTrace();
		}
		System.out.println("Fin du test");
	}
}
