package report;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class reportdbutil {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
    
	public static boolean validate(String reportid ) {
		
		try {
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from report where reportid='"+reportid+"'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static List<report> getreport(String reportid) {
		
		ArrayList<report> report = new ArrayList<>();
		
		try {
			
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from report where reportid='"+reportid+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int rid = rs.getInt(1);
				String reportid1 = rs.getString(2);
				String title = rs.getString(3);
				String content = rs.getString(4);
				
				report r = new report(rid,reportid1,title,content);
				report.add(r);
			}
			
		} catch (Exception e) {
			
		}
		
		return report;	
	}
    
    public static boolean insertreport(String reportid, String title, String content) {
    	
    	boolean isSuccess = false;
    	
    	try {
    		con = DBconnect.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into report values (0,'"+reportid+"','"+title+"','"+content+"')";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return isSuccess;
    }
    
    public static boolean updatereport(String rid,String reportid, String title, String content) {
    	
    	try {
    		
    		con = DBconnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "update report set reportid='"+reportid+"',title='"+title+"',content='"+content+"'"
    				+ "where rid='"+rid+"'";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
 
    public static List<report> getreportDetails(String rid) {
    	
    	int convertedID = Integer.parseInt(rid);
    	
    	ArrayList<report> report = new ArrayList<>();
    	
    	try {
    		
    		con = DBconnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "select * from report where rid='"+convertedID+"'";
    		rs = stmt.executeQuery(sql);
    		
    		while(rs.next()) {
    			int rid1 = rs.getInt(1);
				String reportid1 = rs.getString(2);
				String title = rs.getString(3);
				String content = rs.getString(4);
    			
				report r = new report(rid1,reportid1,title,content);
    			report.add(r);
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}	
    	return report;	
    }
    
    
    public static boolean deletereport(String rid) {
    	
    	int convId = Integer.parseInt(rid);
    	
    	try {
    		
    		con = DBconnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "delete from report where rid='"+convId+"'";
    		int r = stmt.executeUpdate(sql);
    		
    		if (r > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
    
    
    
    }
