package oop1;

public class CorporateCustomer extends Customer {
	private String conpanyName;
	private String taxNumber;

	public String getConpanyName() {
		return conpanyName;
	}

	public void setConpanyName(String conpanyName) {
		this.conpanyName = conpanyName;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
}