public class ProductManager {
    public void AddProduct(Product product) {
        System.out.println("Ürün Eklendi "+product.getName());
    }
    public void AddProduct2(int id ,String name,String description, int stockamount,double price){
        //cok hatali kullanım
    }
    public void PrintProduct(Product product){
        System.out.println(product.getName());
        System.out.println(product.getDescription());
        System.out.println(product.getStockamount());
        System.out.println(product.getPrice());
        System.out.println(product.getId());
        System.out.println(product.getRenk());
        System.out.println(product.getKod());
    }
}
