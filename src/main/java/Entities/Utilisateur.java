package Entities;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur implements Destinaire{
	
	private String prenom;
	private String nom;
	private String login;
	private String motDePasse;
	private String mail;
	
	List<ServeurDiscussion> serveurs;

	
	
	public Utilisateur() {
		super();
		this.serveurs=new ArrayList<ServeurDiscussion>();
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public List<ServeurDiscussion> getServeurs() {
		return serveurs;
	}

	public void setServeurs(List<ServeurDiscussion> serveurs) {
		this.serveurs = serveurs;
	}


	

}
