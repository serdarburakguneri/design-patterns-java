package feed;

import report.Report;

import java.util.Stack;

public class FinanceReportFeed extends ReportFeed {

  private Stack<Report> reports = new Stack<>();

  @Override
  public Report getLatestReport() {
    return reports.lastElement();
  }

  @Override
  public void addReport(Report report) {
    reports.push(report);
    notifyObservers();
  }
}
