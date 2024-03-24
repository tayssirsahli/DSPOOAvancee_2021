package DSPOO2021;

import java.util.HashSet;

public class Ouvrier {

	private String numéro_employé;
	private String nom;
	private double taux_horaire;
	Chantier chantier;
	HashSet<Outil> coffre_outils = new HashSet<Outil>();

	public Ouvrier(String numéro_employé, String nom, Double taux_horaire, Chantier chantier) {

		this.numéro_employé = numéro_employé;
		this.nom = nom;
		this.taux_horaire = taux_horaire;
		this.chantier = chantier;
	}

	public String getNuméro_employé() {
		return this.numéro_employé;
	}

	public void setNuméro_employé(String numéro_employé) {
		this.numéro_employé = numéro_employé;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getTaux_horaire() {
		return this.taux_horaire;
	}

	public void setTaux_horaire(Double taux_horaire) {
		this.taux_horaire = taux_horaire;
	}

	public void ajouterOutils(Outil outil) {
		coffre_outils.add(outil);
	}

	public void retirerOutils(Outil outil) {
		coffre_outils.remove(outil);
	}

	
	public void affiche()
	{
		System.out.println("Ouvrier numéro_employé=" + numéro_employé + ", nom=" + nom + ", taux_horaire=" + taux_horaire
				+ ", chantier=" + chantier.getNom() +" coffre_outils=");
		
		for(Outil c:coffre_outils)
		{
			System.out.println(  c.toString() );
		}
	}
	public boolean verifier(Outil o)
	{
		 return coffre_outils.contains(o);
	}
	
	public void afficheOutilSup() {
		
		Outil MaxOutil =null;
		int max=0;
		for(Outil l :coffre_outils) {

			if(l.getCoût()>max) {
				MaxOutil = l;
			}
		}
		if (MaxOutil != null)
		{
			System.out.println("Outil avec le coût le plus élevé : " + MaxOutil.toString());
		}
			
	}

	

	
	

}
