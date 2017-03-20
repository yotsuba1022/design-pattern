package idv.design.pattern.prototype.example5;

/**
 * @author Carl Lu
 */
public class Product implements ProductPrototype {

    private String productId;
    private String name;

    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public ProductPrototype cloneProduct() {
        Product product = new Product();
        product.setName(this.name);
        product.setProductId(this.productId);
        return product;
    }

}
