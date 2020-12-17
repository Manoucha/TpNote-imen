package Entities;

import java.util.Objects;

import model.Porte;

public class Role {
	
	private String nomRole;

	
	
	
	public Role(String string) {
		// TODO Auto-generated constructor stub
		this.nomRole=string;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomRole == null) ? 0 : nomRole.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		 if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Role role = (Role) obj;
	        return Objects.equals(nomRole, role.nomRole);
	}

	public String getNomRole() {
		return nomRole;
	}

	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	} 
	

}
