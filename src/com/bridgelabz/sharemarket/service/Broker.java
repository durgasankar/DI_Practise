package com.bridgelabz.sharemarket.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

import com.bridgeLabz.utility.Util;
import com.bridgelabz.sharemarket.model.Stock;
import com.bridgelabz.sharemarket.service.company.CompanyService;
import com.bridgelabz.sharemarket.service.company.CompanyServiceImpl;
import com.bridgelabz.sharemarket.service.customer.CustomerService;
import com.bridgelabz.sharemarket.service.customer.CustomerServiceImpl;

public class Broker {

	private static List<Stock> stockBrokerList;
	private static CompanyService companyService;
	private static CustomerService customerService;

	public Broker() {
		stockBrokerList = new LinkedList<>();
		customerService = new CustomerServiceImpl();
		companyService = new CompanyServiceImpl();
	}

	public static List<Stock> getStockBrokerList() {
		return stockBrokerList;
	}

	public static String currentFormattedDateTime() {
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	}

	public static Stock findStock(String stockSymbol, List<Stock> list) {
		return list.stream().filter(fetchedStock -> fetchedStock.getCompanySymbol().equals(stockSymbol)).findFirst()
				.orElse(null);
	}

	public static int findShare(Stock searchedStock, List<Stock> list) {
		return list.indexOf(searchedStock);
	}

	public void addStockToBroker() {
		Stock newStock = new Stock();
		// number of share
		// company name
		// symbol
		// price
		System.out.println("Enter number of shares of company : ");
		newStock.setNumberOfShares(Util.scanner.nextLong());
		System.out.println("Enter company name : ");
		newStock.setCompanyName(Util.scanner.next());
		Util.scanner.nextLine();
		System.out.println("Enter company symbol : ");
		newStock.setCompanySymbol(Util.scanner.next());
		Util.scanner.nextLine();
		System.out.println("Enter the price of the stock : ");
		newStock.setPrice(Util.scanner.nextDouble());

		if (companyService.addStock(newStock).getStockId() != null) {
			Stock fetchedStock = findStock(newStock.getCompanySymbol(), stockBrokerList);
			System.out.println("Stock with id : " + fetchedStock.getStockId() + " registered sucessfully...");
			return;
		}
		System.out.println("Oops...Error adding stock to the list!");
	}

	public void removeStockFromBrokerList() {
		// stock symbol
		System.out.println("Enter deletion stock symbol : ");
		String stockSymbol = Util.scanner.next();
		Stock removedStock = companyService.removeStock(stockSymbol);
		if (removedStock == null) {
			System.out.println("Opps...Stock with symbol " + stockSymbol + " not registered with company!");
			return;
		}
		System.out.println("Stock with id : " + removedStock.getStockId() + " removed sucessfully!");
	}

	public void displayAllStocksAvailableAtBroker(){
		System.out.println("All the stocks available with the broker are :\n");
		companyService.displayAllStocks();
	}

	public void purchaseStockCustomer(){
		System.out.println("Please enter stock symbol : ");
		String stockSymbol = Util.scanner.next();
		Stock fetchedStock = findStock(stockSymbol, stockBrokerList);
		if (fetchedStock == null){
			System.out.println("Oops...Stock not found!");
			return;
		}
		System.out.println("Please enter the quantity : ");
		int quantity = Util.scanner.nextInt();
		if (customerService.buyStock(fetchedStock,stockSymbol,quantity)){
			System.out.println("Thank you for purchasing " + fetchedStock.getCompanySymbol());
		}
		System.out.println("Oops...Error purchasing stock!");
	}

	public void sellPortfolioStockCustomer(){
		System.out.println("Please enter stock symbol : ");
		String stockSymbol = Util.scanner.next();
		System.out.println("Please enter the quantity : ");
		int quantity = Util.scanner.nextInt();

		if (!customerService.sellStock(stockSymbol,quantity)){
			System.out.println("Oops...Unsuccessful selling!");
			return;
		}
		System.out.println("Successfully sold the stock...");
	}

	public void printCustomerPortfolio(){
		System.out.println("All the stocks available in the customer's portfolio :\n");
		customerService.displayAllStock();
	}

}
