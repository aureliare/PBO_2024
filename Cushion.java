package tugasInheritance;

public class Cushion {
	
	protected String merk;
	protected String shade;
	
	public Cushion(String merk, String shade) {
		this.merk = merk;
		this.shade = shade;
	}
	
	public String getMerk() {
		return merk;
	}
	
	public void setShade(String shade) {
		this.shade = shade;
	}
	
	public String getShade() {
		return shade;
	}
	
}
