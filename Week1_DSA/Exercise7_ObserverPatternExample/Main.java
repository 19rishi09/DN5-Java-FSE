public class Main {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        MobileApp mobileUser = new MobileApp("Rishi");
        WebApp webUser = new WebApp("Krishna");

        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        stockMarket.setStockPrice("TCS", 4200.50);

        System.out.println("\nRemoving Web User...\n");

        stockMarket.removeObserver(webUser);

        stockMarket.setStockPrice("Infosys", 1680.75);
    }
}