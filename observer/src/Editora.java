import java.util.ArrayList;

public class Editora implements Publicacao {
    private ArrayList observers;
    private Leitor l;

    public Editora(){
        observers = new ArrayList();
    }

    public void addObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers(boolean novaPublicacao){
	    for (int i = 0; i < observers.size(); i++) {
		    Observer observer = (Observer)observers.get(i);
		    observer.update(novaPublicacao);
	    }
    }
}
