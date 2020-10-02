package report;

import java.util.Date;

public class Report {
  private Date date;
  private String content;

  public Report(String content) {
    this.content = content;
    this.date = new Date();
  }

  public Date getDate() {
    return date;
  }

  public String getContent() {
    return content;
  }
}
