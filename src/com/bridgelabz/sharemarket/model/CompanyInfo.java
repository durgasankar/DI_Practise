package com.bridgelabz.sharemarket.model;

public class CompanyInfo {
	private String companyName;
	private String companySymbol;
	private double price;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanySymbol() {
		return companySymbol;
	}

	public void setCompanySymbol(String companySymbol) {
		this.companySymbol = companySymbol;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CompanyInfo [companyName=" + companyName + ", companySymbol=" + companySymbol + ", price=" + price
				+ "]";
	}

}
