public class Product {
    //attribute | field
    //javada default public // c#da default private
    private int id;
    private String name;
    private double price;
    private String description;
    private int stockamount;
    private String renk;
    private String kod;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public int getStockamount(){
        return stockamount;
    }
    public void setStockamount(int stockamount){
        this.stockamount = stockamount;
    }
    public String getRenk(){
        return renk;
    }
    public void setRenk(String renk){
        this.renk = renk;
    }
    public String getKod(){
        return kod;
    }
    public void setKod(String kod){
        this.kod = kod;
    }

}
