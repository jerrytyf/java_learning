public class Product{
    private String code;
    private String description;
    private double price;
    private String productiondate;
    private String shelfLive;
    private static int ProductNumber;
    public Product(String code,String description,double price,String productiondate,String shelfLive)
    {
        this.code = code;
        this.description = description;
        this.price = price;
        this.productiondate = productiondate;
        this.shelfLive = shelfLive; 
        this.ProductNumber ++;
    }
    public static int getProductNumber(){
        return ProductNumber;
    }
    public String getCode(){
        return this.code;
    }
    public String getDescription(){
        return this.description;
    }
    public double getPrice()
    {
        return this.price;
    }
    public String getProductiondate()
    {
        return this.productiondate;
    }
    public String getShelfLive()
    {
        return this.shelfLive;
    }
    public static void main(String[] args) {
        System.out.println("now has " + Product.getProductNumber() + "product");
        Product milk = new Product("1","this is a mike product",5.00,"20250917","2 years");
        //Product milk = new Product();
        System.out.println("now has " + Product.getProductNumber() + "product");
        System.out.println(milk.getProductiondate());
    }

}