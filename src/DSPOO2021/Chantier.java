package DSPOO2021;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public class Chantier implements Comparator<Ouvrier> {

	private String nom;
	HashMap<String, Ouvrier> liste_ouvriers = new HashMap<String, Ouvrier>();

	Chantier(String nom) {
		this.nom = nom;
	}

	String getNom() {

		return this.nom;
	}

	void setNom(String nom) {
		this.nom = nom;
	}

	void afficher() {

		System.out.println("Liste des ouvriers du chantier " + nom + ":");
		for (Ouvrier ouvrier : liste_ouvriers.values()) {
			ouvrier.affiche();
		}
	}

	public boolean verifier(Ouvrier n) {
		return liste_ouvriers.containsValue(n);
	}

	void AddOuvrier(Ouvrier o) {
		liste_ouvriers.put(o.getNuméro_employé(), o);
	}

	@Override
	public int compare(Ouvrier o1, Ouvrier o2) {
		if (o1 == null && o2 == null) {
			return 0;
		}
		if (o1 == null) {
			return -1;
		}
		if (o2 == null) {
			return 1;
		}
		if (o1.getTaux_horaire() > o2.getTaux_horaire()) {
			return 1;
		}
		if (o1.getTaux_horaire() < o2.getTaux_horaire()) {
			return -1;
		}
		return 0;
	}

	double calcultauxHoraire() {
		double maxTauxHoraire = Double.MIN_VALUE;
		Ouvrier maxOuv = null;
		Iterator<Ouvrier> iterator = liste_ouvriers.values().iterator();
		while (iterator.hasNext()) {
			Ouvrier ouvrier = iterator.next();

			if (compare(ouvrier, maxOuv) > 0) {
				maxOuv = ouvrier;
			}
		}
		if (maxOuv != null) {
			maxTauxHoraire = maxOuv.getTaux_horaire();
		}
		return maxTauxHoraire;
	}

	void addOutil(Ouvrier n, Outil o) {
		if (this.verifier(n)) {
			n.ajouterOutils(o);
		} else {
			System.out.println("L'ouvrier n'est pas présent dans ce chantier.");
		}
	}

}
