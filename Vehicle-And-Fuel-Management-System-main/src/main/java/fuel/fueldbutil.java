package fuel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import report.DBconnect;



public class fueldbutil {

		private static boolean isSuccess;
		private static Connection con = null;
		private static Statement stmt = null;
		private static ResultSet rs = null;
	    
		public static boolean validate(String fuelid ) {
			
			try {
				con = DBconnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from fuel where fuelid='"+fuelid+"'";
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
		
		public static List<fuel> getfuel(String fuelid) {
			
			ArrayList<fuel> fuel = new ArrayList<>();
			
			try {
				
				con = DBconnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from fuel where fuelid='"+fuelid+"'";
				rs = stmt.executeQuery(sql);
				
				while (rs.next()) {
					int fid = rs.getInt(1);
					String fuelid1 = rs.getString(2);
					String fquantity = rs.getString(3);
					String fprice = rs.getString(4);
					String date1 = rs.getString(5);
					String requantity = rs.getString(6);
					
					fuel f = new fuel(fid,fuelid1,fquantity,fprice,date1,requantity);
					fuel.add(f);
				}
				
			} catch (Exception e) {
				
			}
			
			return fuel;	
		}
	    
	    public static boolean insertfuel(String fuelid, String fquantity, String fprice, String date1, String requantity) {
	    	
	    	boolean isSuccess = false;
	    	
	    	try {
	    		con = DBconnect.getConnection();
	    		stmt = con.createStatement();
	    	    String sql = "insert into fuel values (0,'"+fuelid+"','"+fquantity+"','"+fprice+"','"+date1+"','"+requantity+"')";
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
	    
	    public static boolean updatefuel(String fid,String fuelid, String fquantity, String fprice, String date1, String requantity) {
	    	
	    	try {
	    		
	    		con = DBconnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "update fuel set fuelid='"+fuelid+"',fquantity='"+fquantity+"',fprice='"+fprice+"',date1='"+date1+"',requantity='"+requantity+"'"
	    				+ "where fid='"+fid+"'";
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
	 
	    public static List<fuel> getfuelDetails(String fid) {
	    	
	    	int convertedID = Integer.parseInt(fid);
	    	
	    	ArrayList<fuel> fuel = new ArrayList<>();
	    	
	    	try {
	    		
	    		con = DBconnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "select * from fuel where fid='"+convertedID+"'";
	    		rs = stmt.executeQuery(sql);
	    		
	    		while(rs.next()) {
	    			int fid1 = rs.getInt(1);
					String fuelid1 = rs.getString(2);
					String fquantity = rs.getString(3);
					String fprice = rs.getString(4);
					String date1 = rs.getString(5);
					String requantity = rs.getString(6);
					
					fuel f = new fuel(fid1,fuelid1,fquantity,fprice,date1,requantity);
	    			fuel.add(f);
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}	
	    	return fuel;	
	    }
	    
	    

	    public static boolean deletefuel(String fid) {
	    	
	    	int convId = Integer.parseInt(fid);
	    	
	    	try {
	    		
	    		con = DBconnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "delete from fuel where fid='"+convId+"'";
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
	