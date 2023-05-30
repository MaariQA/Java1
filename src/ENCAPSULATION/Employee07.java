package ENCAPSULATION;

public class Employee07 {
    private int productId;
    private String productName;
    private int productQuantity;
    private int productPrice;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public static void main(String[] args) {
        Employee07 employee = new Employee07();

        employee.setProductId(30);
        employee.setProductName("Maari");
        employee.setProductQuantity(10);
        employee.setProductPrice(100);

        System.out.println(employee.getProductId());
        System.out.println(employee.getProductName());
        System.out.println(employee.getProductQuantity());
        System.out.println(employee.getProductPrice());
    }
}

