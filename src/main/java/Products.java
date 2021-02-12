public class Products implements ProductPricingService {

    protected String productId; //identifying string
    protected double currentPrice; //note you cant calculate price without knowing the product

    public Products(String productId){
        this.productId = productId;
        this.currentPrice = currentPrice;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    //implementation for ProductPricingInterface methods
    @Override
    public double price(String exchange, String ticker){

        Products stocks = new Products("st023");

        // if statement checks to see if the product exists
        if(!(stocks.productId == null)){
            stocks.currentPrice = getCurrentPrice();
        }

        return currentPrice;
    };

    @Override
    public double price(String exchange, String contractCode, int month, int year){

        Products stocks = new Products("st023");

        // if statement checks to see if the product exists
        if(!(stocks.productId == null)){
            stocks.currentPrice = getCurrentPrice();
        }

        return currentPrice;
    };
}
