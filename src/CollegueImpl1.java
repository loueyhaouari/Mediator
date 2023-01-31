
public class CollegueImpl1 extends Collegue{

	public CollegueImpl1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CollegueImpl1(String nom, Mediateur mediateur) {
		super(nom, mediateur);
		// TODO Auto-generated constructor stub
	}

	public CollegueImpl1(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void envoyer(Message m) {
		// TODO Auto-generated method stub
		System.out.println("CollegueImpl1 Nom"+nom);
		System.out.println("Envoi du message par ");
		m.setExpediteur(this.nom);
		mediateur.transmettreMessage(m);
	}

	@Override
	public void recevoir(Message m) {
		// TODO Auto-generated method stub
		System.out.println("CollegueImpl1 Nom="+nom);
		System.out.println("réception du message");
		System.out.println("contenu"+m.getContenu());
		System.out.println("Exp:"+m.getExpediteur());
	}

}
