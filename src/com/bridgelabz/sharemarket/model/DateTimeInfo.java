package com.bridgelabz.sharemarket.model;

public class DateTimeInfo {
	private String purchasingDate;
	private String sellingDate;
	private String updationDate;

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

	@Override
	public String toString() {
		return "DateTimeInfo [purchasingDate=" + purchasingDate + ", sellingDate=" + sellingDate + ", updationDate="
				+ updationDate + "]";
	}

}
