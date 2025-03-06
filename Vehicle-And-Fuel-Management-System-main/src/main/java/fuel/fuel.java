package fuel;

public class fuel {
	
	private int fid;
	private String fuelid;
    private String fquantity;
    private String fprice;
    private String date1;
    private String requantity;
    
	public fuel(int fid, String fuelid, String fquantity, String fprice, String date1, String requantity) {
		super();
		this.fid = fid;
		this.fuelid = fuelid;
		this.fquantity = fquantity;
		this.fprice = fprice;
		this.date1 = date1;
		this.requantity = requantity;
	}
	public int getFid() {
		return fid;
	}
	public String getFuelid() {
		return fuelid;
	}
	public String getFquantity() {
		return fquantity;
	}
	public String getFprice() {
		return fprice;
	}
	public String getDate1() {
		return date1;
	}
	public String getRequantity() {
		return requantity;
	}
	
}
