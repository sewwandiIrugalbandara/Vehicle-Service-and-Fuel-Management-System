package vehicle;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class vehicledbutil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
    
	public static boolean validate(String vnumber ) {
		
		try {
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from vehilce where vnumber='"+vnumber+"'";
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
	
	public static List<vehicle> getvehicle(String vnumber) {
		
		ArrayList<vehicle> vehicle = new ArrayList<>();
		
		try {
			
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from vehicle where vnumber='"+vnumber+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int vid = rs.getInt(1);
				String vtype = rs.getString(2);
				String voname = rs.getString(3);
				String vophone = rs.getString(4);
				String servicetype = rs.getString(5);
				String vnumber1 = rs.getString(6);
				
				vehicle cus = new vehicle(vid,vtype,voname,vophone,servicetype,vnumber1);
				vehicle.add(cus);
			}
			
		} catch (Exception e) {
			
		}
		
		return vehicle;	
	}
    
    public static boolean insertvehicle(String vtype, String voname, String vophone, String servicetype, String vnumber) {
    	
    	boolean isSuccess = false;
    	
    	try {
    		con = DBconnect.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into vehicle values (0,'"+vtype+"','"+voname+"','"+vophone+"','"+servicetype+"','"+vnumber+"')";
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
    
    public static boolean updatevehicle(String vid,String vtype, String voname, String vophone, String servicetype, String vnumber) {
    	
    	try {
    		
    		con = DBconnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "update vehicle set vtype='"+vtype+"',voname='"+voname+"',vophone='"+vophone+"',servicetype='"+servicetype+"',vnumber='"+vnumber+"'"
    				+ "where vid='"+vid+"'";
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
 
    public static List<vehicle> getvehicleDetails(String vid) {
    	
    	int convertedID = Integer.parseInt(vid);
    	
    	ArrayList<vehicle> vehicle = new ArrayList<>();
    	
    	try {
    		
    		con = DBconnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "select * from vehicle where vid='"+convertedID+"'";
    		rs = stmt.executeQuery(sql);
    		
    		while(rs.next()) {
    			int vid1 = rs.getInt(1);
    			String vtype = rs.getString(2);
    			String voname = rs.getString(3);
    			String vophone = rs.getString(4);
    			String servicetype = rs.getString(5);
    			String vnumber = rs.getString(6);
    			
    			vehicle c = new vehicle(vid1,vtype,voname,vophone,servicetype,vnumber);
    			vehicle.add(c);
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}	
    	return vehicle;	
    }
    
    
    public static boolean deletevehicle(String vid) {
    	
    	int convId = Integer.parseInt(vid);
    	
    	try {
    		
    		con = DBconnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "delete from vehicle where vid='"+convId+"'";
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



