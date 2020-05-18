package observer.HW;

public interface SubjectInterface {
    void  refisterObserver(Observers o);
    void  notifyObserver();
    void  removeObserver(Observers o);
}
