package Entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Exceptions.ActionNonAutoriseeException;

public class Canal implements Destinaire, Comparable<Canal> {

	private Map<Role, List<Utilisateur>> mapping_role_utilisateurs;
	private int ordre;
	private List<Webhook> webhooks;
	private String nom;
	private Map<Role, List<Habilitation>> mapping_role_habilitations;
	private List<Message> historiques;
	
	
	

	public Canal() {
		this.mapping_role_utilisateurs = new HashMap<Role,List<Utilisateur>>();
		this.mapping_role_habilitations = new HashMap<Role,List<Habilitation>>();
		this.historiques = new ArrayList<Message>();

	}


public void ecrireMessage(Utilisateur u,Message m) throws ActionNonAutoriseeException
{
	//this.mapping_role_utilisateurs.put("Membre", arg1)
	this.historiques.add(m);
}

	public int compareTo(Canal canal) {
		return ordre - canal.ordre;
	}


	public Map<Role, List<Utilisateur>> getMapping_role_utilisateurs() {
		return mapping_role_utilisateurs;
	}


	public void setMapping_role_utilisateurs(Map<Role, List<Utilisateur>> mapping_role_utilisateurs) {
		this.mapping_role_utilisateurs = mapping_role_utilisateurs;
	}


	public int getOrdre() {
		return ordre;
	}


	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}


	public List<Webhook> getWebhooks() {
		return webhooks;
	}


	public void setWebhooks(List<Webhook> webhooks) {
		this.webhooks = webhooks;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Map<Role, List<Habilitation>> getMapping_role_habilitations() {
		return mapping_role_habilitations;
	}


	public void setMapping_role_habilitations(Map<Role, List<Habilitation>> mapping_role_habilitations) {
		this.mapping_role_habilitations = mapping_role_habilitations;
	}


	public List<Message> getHistoriques() {
		return historiques;
	}


	public void setHistoriques(List<Message> historiques) {
		this.historiques = historiques;
	}
	

}
