package com.bridgelabz.sharemarket.service.company;

import com.bridgelabz.sharemarket.model.Stock;

public interface CompanyService {

	public boolean addStock(Stock newStock);

	public boolean removeStock(String stockSymbol);

	public void displayAllStocks();


}
