package DSPOO2021;

public class test {

	public static void main(String[] args) {
		Chantier c = new Chantier("ch1");
		Ouvrier o = new Ouvrier("123","yassmine",345.2,c);
		Ouvrier o2 = new Ouvrier("4432","Ahmed",111.2,c);

		Outil ou = new Outil("aa",12);
		o.ajouterOutils(ou);
		Outil M = new Outil("bb",40);
		o.ajouterOutils(M);
		o.affiche();
		//Vérifier si un outil existe dans son coffre
		System.out.println(o.verifier(ou));
		//d’afficher l’outil qui a le cout le plus élevé
		o.afficheOutilSup();
		
		 
		c.AddOuvrier(o);
		c.AddOuvrier(o2);
		

		c.afficher();
		System.out.println("vérifier si ouvrier existe dans un chantier : "+c.verifier(o));

		System.out.println("le taux horairer le plus élevé des ouvriers de chantier : "+c. calcultauxHoraire());

	c.addOutil(o2,M);
	
	c.afficher();
	}

}
