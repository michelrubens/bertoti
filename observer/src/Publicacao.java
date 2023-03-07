public interface Publicacao {
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers(boolean novaPublicacao);
}
