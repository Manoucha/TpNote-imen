
import java.util.Arrays;
import java.util.List;

import Entities.Canal;
import Entities.Habilitation;
import Entities.Message;
import Entities.Role;
import Entities.Utilisateur;
import Exceptions.ActionNonAutoriseeException;

public class app {

	public static void main(String[] args) throws ActionNonAutoriseeException {
		// TODO Auto-generated method stub

		  Canal c = new Canal();

	        Message m = new Message();
	        m.setDestinataire(c);
	        m.setTexte("Bonne année 2021 !");

	        Utilisateur utilisateur = new Utilisateur();

	        // Etape 2 : appel de la méthode testée
	        try {
	            c.ecrireMessage(utilisateur, m);

	            // Etape 3 test du retour
	        } catch (ActionNonAutoriseeException e) {

	            // Etape 3 test du retour = si on arrive ici, le test est concluant
	        }	
	        }
	

}
