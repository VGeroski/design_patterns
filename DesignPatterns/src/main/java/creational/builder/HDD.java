package creational.builder;

public enum HDD {
    DEFAULT(512), UPGRADED(1024), MAX(2048);

    private int size;

    HDD (int size) {
        this.size = size;
    }
}
