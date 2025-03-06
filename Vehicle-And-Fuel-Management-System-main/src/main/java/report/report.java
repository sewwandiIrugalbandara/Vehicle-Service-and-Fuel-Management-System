package report;

public class report {
	
	
	private int rid;
	private String reportid;
    private String title;
    private String content;
    
    
    
	public report(int rid, String reportid, String title, String content) {
		super();
		this.rid = rid;
		this.reportid = reportid;
		this.title = title;
		this.content = content;
	}
	public int getRid() {
		return rid;
	}
	public String getReportid() {
		return reportid;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	

}
