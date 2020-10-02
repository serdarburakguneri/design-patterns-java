/*

Observer pattern is similar to mediator pattern.
We use observer for broadcasting which means an observer
object communicates with all registered objects.

*/

import feed.FinanceReportFeed;
import report.Report;
import user.Reporter;
import user.User;

public class DemoApplication {
  public static void main(String[] args) {

    FinanceReportFeed financeReportFeed = new FinanceReportFeed();

    User user1 = new User("user1", financeReportFeed);
    User user2 = new User("user2", financeReportFeed);
    User user3 = new User("user3", financeReportFeed);
    User user4 = new User("user4", financeReportFeed);

    Reporter reporter = new Reporter("reporter", financeReportFeed);
    reporter.addNewReport(
        new Report("Growth assumption will be reconsidered because of the devaluation."));

    user4.unFollow();
    user2.unFollow();

    reporter.addNewReport(new Report("Income of the company increased at the end of Q2"));
  }
}
