package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ManagerTest {

    @Test
    public void sholdSearchSame() {

        Repository repo = new Repository();
        ProductManager manager = new ProductManager(repo);

        Book item1 = new Book(01, "Теремок", 150, "Иванов");
        Book item2 = new Book(02, "Колобок", 100, "Петров");
        Book item3 = new Book(03, "Теремок и зайка", 200, "Петров");
        Smartphone item4 = new Smartphone(23, "Moby", 30000, "MobyLab");

        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);

        Product[] expected = {item1, item3};
        Product[] actual = manager.searchBy("Теремок");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sholdSearchNothing() {

        Repository repo = new Repository();
        ProductManager manager = new ProductManager(repo);

        Book item1 = new Book(01, "Теремок", 150, "Иванов");
        Book item2 = new Book(02, "Колобок", 100, "Петров");
        Book item3 = new Book(03, "Теремок и зайка", 200, "Петров");
        Smartphone item4 = new Smartphone(04, "Moby", 30000, "MobyLab");

        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);

        Product[] expected = {};
        Product[] actual = manager.searchBy("Курочка");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sholdSearchPart() {

        Repository repo = new Repository();
        ProductManager manager = new ProductManager(repo);

        Book item1 = new Book(01, "Теремок", 150, "Иванов");
        Book item2 = new Book(02, "Колобок", 100, "Петров");
        Book item3 = new Book(03, "Теремок и зайка", 200, "Петров");
        Smartphone item4 = new Smartphone(04, "Moby", 30000, "MobyLab");

        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);

        Product[] expected = {item1, item2, item3};
        Product[] actual = manager.searchBy("ок");

        Assertions.assertArrayEquals(expected, actual);
    }
}