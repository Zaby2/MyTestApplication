import java.util.*;

public class ProductsImpl {
    HashMap<String, String> products = new HashMap<>();


    boolean addProduct(Product product) {

        if(products.containsKey(product.getId())) {
            return false;
        } else {
            products.put(product.getId(), product.getName());
            return true;
        }

    }
    boolean deleteProduct(Product product) {
        if(!products.containsKey(product.getId())) {
            return false;
        } else{
            products.remove(product.getId());
            return true;
        }
    }


    String getName(Product product) {
        if(!products.containsKey(product.getId())) {
            return  "";
        } else{
            //products.remove(product.getId());
            return products.get(product.getId());
        }
    }

    List<String> findByName(Product product) {
        List<String> res = new ArrayList<>();
        Set<Map.Entry<String, String>> entrySet=products.entrySet();
        String desireObject = product.getName();
        for (Map.Entry<String,String> pair : entrySet) {
            if (desireObject.equals(pair.getValue())) {
                res.add(pair.getKey());
            }
        }
        return res;
    }
}
