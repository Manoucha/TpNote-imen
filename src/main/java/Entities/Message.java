package Entities;

public class Message implements Destinaire{

	private Utilisateur auteur;
	private Destinaire destinataire;
	private String texte;
	
	
	
	
	
	public Utilisateur getAuteur() {
		return auteur;
	}
	public void setAuteur(Utilisateur auteur) {
		this.auteur = auteur;
	}
	public Destinaire getDestinataire() {
		return destinataire;
	}
	public void setDestinataire(Destinaire destinataire) {
		this.destinataire = destinataire;
	}
	public String getTexte() {
		return texte;
	}
	public void setTexte(String texte) {
		this.texte = texte;
	}
	
	
}
