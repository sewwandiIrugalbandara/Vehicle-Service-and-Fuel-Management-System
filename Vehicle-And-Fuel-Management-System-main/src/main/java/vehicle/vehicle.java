package vehicle;

public class vehicle {
	
	
	
		public vehicle(int vid, String vtype, String voname, String vophone, String servicetype, String vnumber) {
		super();
		this.vid = vid;
		this.vtype = vtype;
		this.voname = voname;
		this.vophone = vophone;
		this.servicetype = servicetype;
		this.vnumber = vnumber;
	}

		private int vid;
	    private String vtype;
	    private String voname;
	    private String vophone;
	    private String servicetype;
	    private String vnumber;
	    
		public int getVid() {
			return vid;
		}
		public String getVtype() {
			return vtype;
		}
		public String getVoname() {
			return voname;
		}
		public String getVophone() {
			return vophone;
		}
		public String getServicetype() {
			return servicetype;
		}
		
	    public String getVnumber() {
			return vnumber;
		}
	    


}
