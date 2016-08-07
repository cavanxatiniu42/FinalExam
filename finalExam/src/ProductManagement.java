import java.util.*;

public class ProductManagement {
    public List<Product> listProducts;
    public ProductManagement (List<Product> listProducts){
        this.listProducts = listProducts;
    }
    public boolean addProduct(Product prd){
        return listProducts.add(prd);
    }
    public boolean removeProduct (String productId){
        for (int i = 0; i < listProducts.size(); i++) {
            if (productId == listProducts.get(i).getId()){
                listProducts.remove(listProducts.get(i));
                return true;
            }
        }
        return false;
    }
    public Product findProductByName (String productName){
        for (int i = 0; i <listProducts.size() ; i++) {
            if (productName.equals(listProducts.get(i).getName())) {
                return listProducts.get(i);
            }
        }
        return null;
    }
    public void sortProductByName(){
        Collections.sort(listProducts,CompareByName);
        for (int i = 0; i <listProducts.size() ; i++) {
            System.out.println(listProducts.get(i).toString());
        }
    }
    public void sortProductByPrice(){
        Collections.sort(listProducts, CompareByPrice);
        for (int i = 0; i <listProducts.size() ; i++) {
            System.out.println(listProducts.get(i).toString());
        }
    }
    public void showAllProduct(){
        for (int i = 0; i <listProducts.size() ; i++) {
            System.out.println(listProducts.get(i).toString());
        }
    }
    private Comparator<Product> CompareByName = new Comparator<Product>() {
        @Override
        public int compare(Product product1, Product product2) {
            String pro1 = product1.getName();
            String pro2 = product2.getName();
            return pro1.compareTo(pro2);
        }
    };
    private Comparator<Product> CompareByPrice = new Comparator<Product>() {
        @Override
        public int compare(Product product1, Product product2) {
            int pro1 = product1.getPrice();
            int pro2 = product2.getPrice();
            return pro1 - pro2;
        }
    };

}
