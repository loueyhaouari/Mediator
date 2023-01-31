
public abstract class Collegue {
	protected Mediateur mediateur;
	protected String nom;
	
	public Collegue(String nom,Mediateur mediateur) {
		this.mediateur = mediateur;
		this.nom=nom;
	mediateur.addCollegue(nom, this);
	}
	public Collegue(String nom) {
		this.nom=nom;
	}
	public abstract void envoyer(Message m);
	public abstract void recevoir(Message m);
	public Mediateur getMediateur() {
		return mediateur;
	}
	public void setMediateur(Mediateur mediateur) {
		this.mediateur = mediateur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Collegue() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
