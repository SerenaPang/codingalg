package alg.string;

public class Pair<K, V> {
    private K index;
    private V line;

    public Pair(K index, V line) {
        this.index = index;
        this.line = line;
    }

    public K getIndex() {
        return index;
    }

    public V getLine() {
        return line;
    }
}
