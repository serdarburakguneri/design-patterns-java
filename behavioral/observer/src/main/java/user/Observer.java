package user;

import feed.ReportFeed;

// This is the abstract Observer class
public abstract class Observer {

  protected ReportFeed reportFeed;

  public Observer(ReportFeed reportFeed) {
    this.reportFeed = reportFeed;
    reportFeed.addObserver(this);
  }

  public void unFollow() {
    this.reportFeed.removeObserver(this);
  }

  public abstract void update();
}
