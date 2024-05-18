package structural.composite;

//Leaf node in composite pattern
public class BinaryFile extends File {

    private long size;

    public BinaryFile(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public void ls() {
        System.out.println(getName() + " is reading from " + size + " bytes");
    }

    @Override
    public void addFile(File file) {
        throw new UnsupportedOperationException("Add operation not supported by Leaf node.");
    }

    @Override
    public File[] getFiles() {
        throw new UnsupportedOperationException("Get operation not supported by Leaf node.");
    }

    @Override
    public boolean removeFile(File file) {
        throw new UnsupportedOperationException("Remove operation not supported by Leaf node.");
    }
}
