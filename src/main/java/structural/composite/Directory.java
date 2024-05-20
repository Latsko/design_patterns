package structural.composite;

import java.util.ArrayList;
import java.util.List;

//Composite in the composite pattern
public class Directory extends File {

    private List<File> childern = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void ls() {
        System.out.println(getName());
        childern.forEach(File::ls);
    }

    @Override
    public void addFile(File file) {
        childern.add(file);
    }

    @Override
    public File[] getFiles() {
        return childern.toArray(new File[childern.size()]);
    }

    @Override
    public boolean removeFile(File file) {
        return childern.remove(file);
    }

}
