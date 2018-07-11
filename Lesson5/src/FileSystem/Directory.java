package FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory extends NamedFSItem {
    private List<FSItem> items = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public List<Directory> getDirectories(){
        List<Directory> dirs = new ArrayList<>();
        for (FSItem item : items
             ) {
            if(item instanceof Directory){
                dirs.add((Directory)item);
            }
        }
        return dirs;
    }

      private boolean check(Directory directory){
         if (directory == this) {
             return false;
         }
         for (Directory dir : directory.getDirectories()
                ) {
             if (dir == this) {
                 return false;
             }
             if(dir.getDirectories().size() > 0){
                 check(dir);
             }
        }
        return true;
    }

    public Directory add (FSItem fsItem){
        if(fsItem instanceof Directory && !(check((Directory)fsItem))){
            throw new IllegalArgumentException("Looping error!");
        }else {
            items.add(fsItem);
            return this;
        }
    }

    public int getSize(){
        int totalSize = 0;
        for(FSItem item : items){
            totalSize += item.getSize();
        }
        return  totalSize;
    }

    @Override
    public String toString() {
        return "Directory{name=" + getName()
                + ", items=" + items +
                "} ";
    }
}
