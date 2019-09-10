package designpattern.observer.improve;

// 抽象的Subject ====> Subject
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
