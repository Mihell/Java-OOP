package FileSystem;

public class FileSystemRunner {
    public static void main(String[] args) {
        Directory dir = new Directory("music")
                .add(new Directory("classic")
                        .add(new File("beethoven-symphony9.mp3", 4000))
                )
                .add(new Directory("rock")
                        .add(new File("wind-of-change.mp3", 2000))
                        .add(new File("riders-on-the-storm.mp3", 2500))
                )
                .add(new File("unknown-music.mp3", 500));
        Symlink link = new Symlink("dirLink", dir);
        System.out.println(dir);
        System.out.println(link.getName());

        Directory d1 = new Directory("d1");
        Directory d2 = new Directory("d2");
        d1.add(d2);
        d2.add(d1);
    }
}
