import java.util.ArrayList;
import java.util.List;

public class MediateurImpl1 extends Mediateur {

	private List<Message> conversation=new ArrayList<>();
	@Override
	public void transmettreMessage(Message m) {
		// TODO Auto-generated method stub
		System.out.println("-----------------");
		System.out.println("MediateurImpl1.........");
		System.out.println("Transmission de message ");
		System.out.println("De"+m.getExpediteur());
		System.out.println("Vers"+m.getDestinataire());
		System.out.println("Contenu"+m.getContenu());
		Collegue dest=collegues.get(m.getDestinataire());
		dest.recevoir(m);
	conversation.add(m);
	}

}
