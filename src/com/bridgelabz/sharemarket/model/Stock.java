package com.bridgelabz.sharemarket.model;

public class Stock {
	private String stockId;
	private long numberOfShares;
	private String purchasingDate;
	private String sellingDate;
	private String updationDate;
	private String companyName;
	private String companySymbol;
	private double price;

	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public long getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(long numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	public String getPurchasingDate() {
		return purchasingDate;
	}

	public void setPurchasingDate(String purchasingDate) {
		this.purchasingDate = purchasingDate;
	}

	public String getSellingDate() {
		return sellingDate;
	}

	public void setSellingDate(String sellingDate) {
		this.sellingDate = sellingDate;
	}

	public String getUpdationDate() {
		return updationDate;
	}

	public void setUpdationDate(String updationDate) {
		this.updationDate = updationDate;
	}

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
		return "Stock [stockId=" + stockId + ", numberOfShares=" + numberOfShares + ", purchasingDate=" + purchasingDate
				+ ", sellingDate=" + sellingDate + ", updatingDate=" + updationDate + ", companyName=" + companyName
				+ ", companySymbol=" + companySymbol + ", price=" + price + "]";
	}

}
