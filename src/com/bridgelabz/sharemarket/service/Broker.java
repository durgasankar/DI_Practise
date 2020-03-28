package com.bridgelabz.sharemarket.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

import com.bridgelabz.sharemarket.model.Stock;

public class Broker {

	private static List<Stock> stockBrokerList;

	public Broker() {
		stockBrokerList = new LinkedList<Stock>();
	}

	public static List<Stock> getStockBrokerList() {
		return stockBrokerList;
	}

	public static String currentFormattedDateTime() {
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	}

	public static Stock findStock(String stockSymbol, List<Stock> list) {
		return list.stream()
				.filter(fetchedStock -> fetchedStock.getCompanyInfo().getCompanySymbol().equals(stockSymbol))
				.findFirst().orElse(null);
	}

	public static int findShare(Stock searchedStock, List<Stock> list) {
		return list.indexOf(searchedStock);
	}

}
