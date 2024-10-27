package SpringCore;

public class DAV implements School{
	private double fees;

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "DAV [fees=" + fees + "]";
	}
	
	@Override
	public void name() {
		System.out.println("name is DAV");
	}
}
