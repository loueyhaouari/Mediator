
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MediateurImpl1 mediateur1=new MediateurImpl1();
Collegue c1=new CollegueImpl1("A",mediateur1);
Collegue c2=new CollegueImpl1("B",mediateur1);
Collegue c3=new CollegueImpl1("C",mediateur1);
c1.envoyer(new Message("xxxxxxx","A"));
c2.envoyer(new Message("xxxxxxx","B"));
c2.envoyer(new Message("","C"));
	}

}
