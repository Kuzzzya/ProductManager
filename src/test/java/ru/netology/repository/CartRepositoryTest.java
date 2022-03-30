package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.*;

class CartRepositoryTest {

    private CartRepository repository = new CartRepository();

    Product first = new Product(1, "11", 111);
    Product second = new Product(2, "22", 222);
    Product third = new Product(3, "33", 333);
    Product sixth = new Book(6, "Table mendeleev", 666, "Table mendeleev", "Mendeleev");
    Product seventh = new Book(7, "WoW", 777, "WoW", "Blizzard");
    Product eighth = new Smartphone(8, "Nokia 3310", 888, "Nokia 3310", "Russia");
    Product ninth = new Smartphone(9, "Nokia 3320", 999, "Nokia 3320", "USA");

    @Test
    public void emptyRepository() {

        repository.add(first);
        repository.add(second);
        repository.add(third);
        repository.removeById(2);

        Product[] expected = {first, third};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void oneProductInRepository() {

        repository.add(first);

        repository.add(second);
        repository.add(third);
        repository.removeById(1);

        Product[] expected = {second, third};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void twoProductInRepository() {

        repository.add(first);
        repository.add(second);

        repository.add(third);
        repository.removeById(3);

        Product[] expected = {first, second};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void threeProductInRepository() {

        repository.add(first);
        repository.add(second);
        repository.add(third);

        repository.add(eighth);
        repository.removeById(8);

        Product[] expected = {first, second, third,};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void bookAndSmartphoneInRepository() {
        repository.add(ninth);
        repository.add(eighth);
        repository.add(seventh);
        repository.add(sixth);

        repository.removeById(9);

        Product[] expected = {eighth, seventh, sixth};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);


    }
}