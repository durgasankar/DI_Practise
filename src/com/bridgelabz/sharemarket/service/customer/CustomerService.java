package com.bridgelabz.sharemarket.service.customer;

public interface CustomerService {

	public boolean buyStock(String stockName, int quantity);

	public boolean sellStock(String stockSymbol, long quantity);

	public void displayAllStock();

}
