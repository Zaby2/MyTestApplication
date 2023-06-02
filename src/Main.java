import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductsImpl prImpl = new ProductsImpl();
        int menuRes = 0;
        do {
            System.out.println("1) Добавить продукт\n");
            System.out.println("2) Удалить продукт\n");
            System.out.println("3) Найти имя продукта по id\n");
            System.out.println("4) Найти id продуктов по имени\n");
            menuRes = sc.nextInt();
            // realize;
            if(menuRes == 1) {
                Product curProduct = new Product();

                System.out.println("Введите id продукта\n");
                String res = sc.next();
                curProduct.setId(res);
                System.out.println("Введите название продукта\n");
                res = sc.next();
                curProduct.setName(res);
                if(prImpl.addProduct(curProduct)) {
                    System.out.println("Продукт успешно добавлен\n");
                } else {
                    System.out.println("Такой продукт уже существует\n");
                }
            } else if (menuRes == 2) {
                Product curProduct = new Product();
                System.out.println("Введите id продукта\n");
                String res = sc.next();
                curProduct.setId(res);
                if(prImpl.deleteProduct(curProduct)) {
                    System.out.println("Продукт успешно удален\n");
                } else {
                    System.out.println("Такой продукт не существует\n");
                }
            } else if(menuRes == 3) {
                Product curProduct = new Product();
                System.out.println("Введите id продукта\n");
                String res = sc.next();
                curProduct.setId(res);
                res = prImpl.getName(curProduct);
                System.out.println(res);
            } else if(menuRes == 4) {
                Product curProduct = new Product();
                System.out.println("Введите название продукта\n");
                String res = sc.next();
                curProduct.setName(res);
                List<String> _res = new ArrayList<>();
                _res = prImpl.findByName(curProduct);
                System.out.println(_res);
            }

        } while(menuRes != 0);


    }


}