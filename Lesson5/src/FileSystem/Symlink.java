package FileSystem;

public class Symlink implements FSItem {
    private String name;
    private FSItem item;
    private int size = 1;

    public Symlink(String name, FSItem item) {
        this.name = name;
        this.item = item;
    }

    @Override
    public String getName() {
        return name + " -> " + item.getName();
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Symlink{" +
                "name='" + name + '\'' +
                ", item=" + item +
                ", size=" + size +
                '}';
    }
}
