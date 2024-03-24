package DSPOO2021;


public class Outil {

	private String nom;
	private int coût;

	Outil(String nom, int coût) {
		this.nom = nom;
		this.coût = coût;

	}

	String getNom() {
		return this.nom;
	}

	void setNom(String nom) {
		this.nom = nom;
	}

	int getCoût() {

		return this.coût;
	}

	void setCoût(int coût) {
		this.coût = coût;
	}

	@Override
	public String toString() {
		return "Outil [nom=" + nom + ", coût=" + coût + "] \n";
	}

	

	
	

}
