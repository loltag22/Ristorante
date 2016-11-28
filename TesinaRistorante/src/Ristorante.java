import java.util.*;

public class Ristorante {

	String nome;
	String indirizzo;
	int telefono;
	String email;
	String direttore;
	ArrayList<Area> listaAree = new ArrayList<Area>();
	
	public String disponiArea(int numero){
		
		Area a = new Area(numero);
		listaAree.add(a);
		return "Ho creato l'area " + a.numero;
		
	}
	
	public String disponiStanza(){
		
		Stanza s = new Stanza();
		return "Ho creato la stanza " + s.numero;
		
	}

	public String associaArea(int a1, int a2){
		
		int i;
		
		for (i=0; i < listaAree.size(); i++){
			Area a = listaAree.get(i);
			if (a.numero == a1)
				break;
		};
		
		int j;
		
		for (j=0; j < listaAree.size(); j++){
			Area a = listaAree.get(j);
			if (a.numero == a2){
				a.aree.add(listaAree.get(i));
				break;
			}
		};
		
		return "Ho associato l'area " + listaAree.get(i).numero + " all'area " + listaAree.get(j).numero;
	}
	
	

}
