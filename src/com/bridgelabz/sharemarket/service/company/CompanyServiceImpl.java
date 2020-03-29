package com.bridgelabz.sharemarket.service.company;

import com.bridgeLabz.utility.Util;
import com.bridgelabz.sharemarket.model.Stock;
import com.bridgelabz.sharemarket.service.Broker;

public class CompanyServiceImpl implements CompanyService {

	@Override
	public Stock addStock(Stock newStock) {
		newStock.setStockId(Util.idGnerator());
		newStock.setUpdationDate(Broker.currentFormattedDateTime());
		Broker.getStockBrokerList().add(newStock);
		return newStock;
	}

	@Override
	public Stock removeStock(String stockSymbol) {
		Stock fetchedStock = Broker.findStock(stockSymbol, Broker.getStockBrokerList());
		if (fetchedStock != null) {
			Broker.getStockBrokerList().remove(fetchedStock);
				return fetchedStock;
		}
		return null;
	}

	@Override
	public void displayAllStocks() {
		Broker.getStockBrokerList().forEach(System.out::println);
	}

}
