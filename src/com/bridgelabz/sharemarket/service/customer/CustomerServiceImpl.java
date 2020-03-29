package com.bridgelabz.sharemarket.service.customer;

import java.util.LinkedList;
import java.util.List;

import com.bridgelabz.sharemarket.model.Stock;
import com.bridgelabz.sharemarket.service.Broker;

public class CustomerServiceImpl implements CustomerService {

    private List<Stock> customerPortfolioList;

    public CustomerServiceImpl() {
        this.customerPortfolioList = new LinkedList<>();
    }

    @Override
    public boolean buyStock(Stock fetchedStock, String stockSymbol, int quantity) {
        // updating broker list
        fetchedStock.setNumberOfShares(fetchedStock.getNumberOfShares() - quantity);
        fetchedStock.setUpdationDate(Broker.currentFormattedDateTime());
        Broker.getStockBrokerList().add(Broker.findShare(fetchedStock, Broker.getStockBrokerList()), fetchedStock);
        // updating portFolio customer
        fetchedStock.setPurchasingDate(Broker.currentFormattedDateTime());
        customerPortfolioList.add(fetchedStock);
        return true;
    }

    @Override
    public boolean sellStock(String stockSymbol, long quantity) {
        // stock fetched from broker
        Stock fetchedBrokerStock = Broker.findStock(stockSymbol, Broker.getStockBrokerList());
        if (fetchedBrokerStock != null) {
            Stock fetchedCustomerPortfolioStock = Broker.findStock(stockSymbol, customerPortfolioList);
            if (fetchedCustomerPortfolioStock != null) {
                // updating customer portFolio after selling.
                // sold all quantity
                if (fetchedCustomerPortfolioStock.getNumberOfShares() == quantity) {
                    customerPortfolioList.remove(fetchedCustomerPortfolioStock);
                } else if (fetchedCustomerPortfolioStock.getNumberOfShares() > quantity) {
                    System.out.println("Oops...Selling quantity is more than availability . So selling quantity is : "
                            + fetchedCustomerPortfolioStock.getNumberOfShares());
                    customerPortfolioList.remove(fetchedCustomerPortfolioStock);
                    return false;
                } else if (fetchedCustomerPortfolioStock.getNumberOfShares() <= 0) {
                    System.out.println("Oops...Can not sell negative quantity.");
                    return false;
                } else {
                    // sold partial quantity
                    fetchedCustomerPortfolioStock
                            .setNumberOfShares(fetchedCustomerPortfolioStock.getNumberOfShares() - quantity);
                    fetchedCustomerPortfolioStock.setSellingDate(Broker.currentFormattedDateTime());
                    customerPortfolioList.add(Broker.findShare(fetchedCustomerPortfolioStock, customerPortfolioList),
                            fetchedCustomerPortfolioStock);
                }
                Broker.getStockBrokerList().add(Broker.findShare(fetchedBrokerStock, Broker.getStockBrokerList()),
                        fetchedBrokerStock);
                // updating broker list after selling.
                return true;

            }
            System.out.println("No stock of symbol " + stockSymbol + " found in the portfolio.");
            return false;
        }
        System.out.println("No stock of symbol " + stockSymbol + " registered with the broker.");
        return false;
    }

    @Override
    public void displayAllStock() {
        customerPortfolioList.forEach(stock ->
                System.out.println("id : " + stock.getStockId() + ", quantity : " + stock.getNumberOfShares()
                        + ", stock symbol : " + stock.getCompanySymbol() + ", purchased on : "
                        + stock.getPurchasingDate())
        );

    }


}
