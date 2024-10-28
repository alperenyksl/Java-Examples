//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product=new Product();
        product.setName("Laptop");
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setId(2325);
        product.setKod("#3434");
        product.setRenk("Siyah");
        product.setStockamount(4);
        System.out.println(product);
        ProductManager productManager=new ProductManager();
        productManager.AddProduct(product);
        productManager.AddProduct2(1,"","",2,200);
        productManager.PrintProduct(product);
    }
}