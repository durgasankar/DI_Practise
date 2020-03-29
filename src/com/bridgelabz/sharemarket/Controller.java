package com.bridgelabz.sharemarket;

import com.bridgeLabz.utility.Util;
import com.bridgelabz.sharemarket.service.Broker;

public class Controller {

    private static  Broker broker = new Broker();

    private static void printMainInstructions() {
        System.out.println("Available actions :\npress :");
        System.out.println("\t1 -> Add a stock to the broker.\n" + "\t2 -> Remove the stock from broker\n"
                + "\t3 -> Print all the stock available at broker.\n" + "\t4 -> Purchase a stock from broker.\n"
                + "\t5 -> Sell a portfolio stock..\n" + "\t6 -> Print customer's portfolio.\n"
                + "\t7 -> Quit application\n" + "\t8 -> print instructions.");
        System.out.println("choose your action :");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to NSE Stock Market.\n---------------------------");
        printMainInstructions();
        boolean isQuit = false;
        while (!isQuit) {
            System.out.println("\nEnter action : (press : 8 -> show available actions)");
            int action = Util.scanner.nextInt();
            switch (action) {
                case 1:
                    broker.addStockToBroker();
                    break;

                case 2:
                    broker.removeStockFromBrokerList();
                    break;

                case 3:
                    broker.displayAllStocksAvailableAtBroker();
                    break;

                case 4:
                    broker.purchaseStockCustomer();
                    break;

                case 5:
                    broker.sellPortfolioStockCustomer();
                    break;

                case 6:
                    broker.printCustomerPortfolio();
                    break;

                case 7:
                    isQuit = true;
                    System.out.println("Application successfully closed");
                    break;

                case 8:
                    printMainInstructions();
                    break;

                default:
                    System.out.println("Please read instructions!");
            }
        }

    }

}
