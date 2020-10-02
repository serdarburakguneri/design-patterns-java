package user;

import feed.ReportFeed;
import report.Report;

import java.text.MessageFormat;

public class User extends Observer {
  private String name;

  public User(String name, ReportFeed reportFeed) {
    super(reportFeed);
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public void update() {
    Report lastReport = reportFeed.getLatestReport();
    System.out.println(
        MessageFormat.format(
            "Dear {0}. Here is the latest report: {1} {2}",
            getName(), lastReport.getContent(), lastReport.getDate()));
  }
}
