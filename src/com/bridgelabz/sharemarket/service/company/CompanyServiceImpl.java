package com.bridgelabz.sharemarket.service.company;

import com.bridgelabz.sharemarket.model.Stock;
import com.bridgelabz.sharemarket.service.Broker;

public class CompanyServiceImpl implements CompanyService {

	@Override
	public boolean addStock(Stock newStock) {
		if (newStock == null) {
			return false;
		}
		newStock.getDateTimeInfo().setUpdationDate(Broker.currentFormattedDateTime());
		Broker.getStockBrokerList().add(newStock);
		return true;
	}

	@Override
	public boolean removeStock(String stockSymbol) {
		Stock fetchedStock = Broker.findStock(stockSymbol, Broker.getStockBrokerList());
		if (fetchedStock == null) {
			return false;
		}
		Broker.getStockBrokerList().remove(fetchedStock);
		return true;
	}

	@Override
	public void displayAllStocks() {
		Broker.getStockBrokerList().forEach(fetchedStock -> System.out.println(fetchedStock));
	}

}
