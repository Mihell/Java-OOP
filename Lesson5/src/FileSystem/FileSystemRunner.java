package FileSystem;

/*task: 
Смоделировать файловую систему, работающую с файлами, директориями и символическими ссылками (ярлыками). 
Работать с реальной файловой системой (создавать файлы/директории, читать контент файлов) не нужно; необходимо реализовать только модель.
Реализовать fluent методы добавления новых элементов в директорию.
Предотвратить зацикливания: директория не должна содержать в себе саму себя.*/

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

/*out:
Directory{name=music, items=[Directory{name=classic, items=[File{size=4000} name=beethoven-symphony9.mp3]} , Directory{name=rock, items=[File{size=2000} name=wind-of-change.mp3, File{size=2500} name=riders-on-the-storm.mp3]} , File{size=500} name=unknown-music.mp3]} 
dirLink -> music
Exception in thread "main" java.lang.IllegalArgumentException: Looping error!
	at FileSystem.Directory.add(Directory.java:42)
	at FileSystem.FileSystemRunner.main(FileSystemRunner.java:21)

Process finished with exit code 1*/
