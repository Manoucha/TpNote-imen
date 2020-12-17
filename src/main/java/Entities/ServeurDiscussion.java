package Entities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServeurDiscussion {
	private Map<Role, List<Utilisateur>> mapping_role_utilisateurs;
	private List<Canal> canaux;
	private String nom;
	private Map<Role, List<Habilitation>> mapping_role_habilitations;
	
	
	public ServeurDiscussion() {
		super();
		this.mapping_role_utilisateurs = new HashMap<Role,List<Utilisateur>>();
		this.mapping_role_habilitations = new HashMap<Role,List<Habilitation>>();

	}


	public List<Canal> getCanaux() {
		return canaux;
	}


	public void setCanaux(List<Canal> canaux) {
		this.canaux = canaux;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

	
	
	

}
