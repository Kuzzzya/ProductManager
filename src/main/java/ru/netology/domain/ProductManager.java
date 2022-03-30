package ru.netology.domain;

import ru.netology.repository.CartRepository;

public class ProductManager {
    private CartRepository repository;

    public ProductManager(CartRepository repository) {
        this.repository = repository;
    }

    public void add(Product item) {
        repository.add(item);
    }


    public Product[] getAll() {
        Product[] items = repository.findAll();
        Product[] result = new Product[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public void removeById(int id) {
        repository.removeById(id);
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0]; // тут будем хранить подошедшие запросу продукты
        for (Product purchaseItem : repository.findAll()) {
            if (matches(purchaseItem, text)) {
                int length = result.length + 1;
                Product[] tmp = new Product[length];
                System.arraycopy(result, 0, tmp, 0, result.length);
                int lastIndex = tmp.length - 1;
                tmp[lastIndex] = purchaseItem;
                result = tmp;
            }

        }
        return result;
    }


    public boolean matches(Product item, String search) {
        if (item.getName().contains(search)) {
            return true;
        } else {
            return false;
        }
    }
}
