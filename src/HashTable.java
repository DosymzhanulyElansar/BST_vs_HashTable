import java.util.LinkedList;

public class HashTable {
    private static class Entry {
        int key;

        Entry(int key) {
            this.key = key;
        }
    }

    private LinkedList<Entry>[] table;
    private int capacity;

    @SuppressWarnings("unchecked")
    public HashTable(int capacity) {
        this.capacity = capacity;
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return Math.abs(key) % capacity;
    }

    public void insert(int key) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) return; // Уникальные ключи
        }
        table[index].add(new Entry(key));
    }

    public boolean search(int key) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) return true;
        }
        return false;
    }

    public void delete(int key) {
        int index = hash(key);
        table[index].removeIf(entry -> entry.key == key);
    }
}
