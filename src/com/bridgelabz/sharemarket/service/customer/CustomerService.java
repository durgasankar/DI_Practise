package com.bridgelabz.sharemarket.service.customer;

import com.bridgelabz.sharemarket.model.Stock;

public interface CustomerService {

	boolean buyStock(Stock fetchedStock , String stockName, int quantity);

	boolean sellStock(String stockSymbol, long quantity);

	void displayAllStock();

}
