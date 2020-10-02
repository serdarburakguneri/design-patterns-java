package feed;

import report.Report;
import user.Observer;

import java.util.ArrayList;
import java.util.List;

// This is the abstract observable class
public abstract class ReportFeed {
  private List<Observer> observers = new ArrayList<>();

  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  public void notifyObservers() {
    observers.forEach(observer -> observer.update());
  }

  public abstract Report getLatestReport();

  public abstract void addReport(Report report);
}
