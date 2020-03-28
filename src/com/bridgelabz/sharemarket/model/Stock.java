package com.bridgelabz.sharemarket.model;

public class Stock {
	private long stockId;
	private long numberOfShares;
	private CompanyInfo companyInfo;
	private DateTimeInfo dateTimeInfo;

	public long getStockId() {
		return stockId;
	}

	public void setStockId(long stockId) {
		this.stockId = stockId;
	}

	public CompanyInfo getCompanyInfo() {
		return companyInfo;
	}

	public void setCompanyInfo(CompanyInfo companyInfo) {
		this.companyInfo = companyInfo;
	}

	public DateTimeInfo getDateTimeInfo() {
		return dateTimeInfo;
	}

	public void setDateTimeInfo(DateTimeInfo dateTimeInfo) {
		this.dateTimeInfo = dateTimeInfo;
	}

	public long getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(long numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", numberOfShares=" + numberOfShares + ", companyInfo=" + companyInfo
				+ ", dateTimeInfo=" + dateTimeInfo + "]";
	}

}
