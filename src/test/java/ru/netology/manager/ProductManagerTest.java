package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.manager.ProductManager;
import ru.netology.repository.CartRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductManagerTest {

    private CartRepository repository = new CartRepository();
    private ProductManager man = new ProductManager(repository);

    Product first = new Product(1, "11", 111);
    Product second = new Product(2, "22", 222);
    Product third = new Product(3, "33", 333);
    Product sixth = new Book(6, "Table mendeleev", 666, "Table mendeleev", "Mendeleev");
    Product seventh = new Book(7, "WoW", 777, "WoW", "Blizzard");
    Product eighth = new Smartphone(8, "Nokia 3310", 888, "Nokia 3310", "Russia");
    Product ninth = new Smartphone(9, "Nokia 3320", 999, "Nokia 3320", "USA");

    @Test
    public void emptyRepository() {

        man.add(first);
        man.add(second);
        man.add(third);
        man.removeById(2);

        Product[] expected = {third, first};
        Product[] actual = man.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void oneProductInRepository() {

        man.add(first);

        man.add(second);
        man.add(third);
        man.removeById(1);

        Product[] expected = {third, second};
        Product[] actual = man.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void twoProductInRepository() {

        man.add(first);
        man.add(second);

        man.add(third);
        man.removeById(3);

        Product[] expected = {second, first};
        Product[] actual = man.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void threeProductInRepository() {

        man.add(first);
        man.add(second);
        man.add(third);

        man.add(eighth);
        man.removeById(8);

        Product[] expected = {third, second, first};
        Product[] actual = man.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void bookAndSmartphoneInRepository() {

        man.add(ninth);
        man.add(eighth);
        man.add(seventh);
        man.add(sixth);
        man.removeById(9);

        Product[] expected = {sixth, seventh, eighth};
        Product[] actual = man.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void searchBy() {
        man.add(second);
        man.add(ninth);
        man.add(eighth);
        man.add(seventh);
        man.add(sixth);

        man.searchBy("22");

        Product[] expected = {sixth, seventh, eighth, ninth, second};
        Product[] actual = man.getAll();
        assertArrayEquals(expected, actual);
    }
}