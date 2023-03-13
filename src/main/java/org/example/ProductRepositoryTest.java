package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions;

public class ProductRepositoryTest {

    Product item1 = new Product(01, "Куклы", 150);
    Product item2 = new Product(02, "Машинка", 100);
    Product item3 = new Product(03, "Телефон", 2000);
    Book item4 = new Book(23, "Теремок", 300, "Иванов");

    @Test
    public void test() {
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.removeById(item2.getId());

        Product[] expected = {item1, item3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
