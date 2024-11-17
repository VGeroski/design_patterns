package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;

        try {
            item = (Item)(items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(24.99);
        movie.setRuntime("2 hours");
        items.put("movie", movie);

        Book book = new Book();
        book.setTitle("Basic Book");
        book.setPrice(10.99);
        book.setNumberOfPages(260);
        items.put("book", book);
    }
}
