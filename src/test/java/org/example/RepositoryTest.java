package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepositoryTest {
    @Test
    public void removeItem() {
        Repository repo = new Repository();

        Book item1 = new Book(01, "Теремок", 150, "Иванов");
        Book item2 = new Book(02, "Колобок", 100, "Петров");
        Book item3 = new Book(03, "Теремок и зайка", 200, "Петров");
        Smartphone item4 = new Smartphone(04, "Moby", 30000, "MobyLab");

        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);
        repo.removeById(04);

        Product[] expected = {item1, item2, item3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}