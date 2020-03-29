package com.bridgelabz.sharemarket.service.company;

import com.bridgelabz.sharemarket.model.Stock;

public interface CompanyService {

	Stock addStock(Stock newStock);

	Stock removeStock(String stockSymbol);

	void displayAllStocks();

}
