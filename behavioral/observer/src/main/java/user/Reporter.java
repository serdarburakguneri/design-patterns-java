package user;

import feed.ReportFeed;
import report.Report;

public class Reporter extends User {

  public Reporter(String name, ReportFeed reportFeed) {
    super(name, reportFeed);
  }

  public void addNewReport(Report report) {
    reportFeed.addReport(report);
  }
}
