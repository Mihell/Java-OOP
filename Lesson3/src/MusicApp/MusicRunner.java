/*
На основании UML диаграммы написать классы SongContent, Song, Playlist, User, реализовать методы.
Создать тестовый класс MusicRunner, демонстрирующий работу предыдущих классов.
*/

package MusicApp;

public class MusicRunner {
    public static void main(String[] args) {
        AudioContent firstContent = new AudioContent(new byte[100]);
        AudioContent secondContent = new AudioContent(new byte[150]);
        Song one = new Song("Du hast", "Ramstain","Metal", 3.1, firstContent);
        Song two = new Song("Ammerican attraction", "Anti-Flag","Punk", 3.5, secondContent);
        User user = new User("Mihel");
        user.createPlaylist("my playlist");
        user.addSongToPlaylist("my playlist", one);
        user.addSongToPlaylist("my playlist", two);
        System.out.println(user);
        System.out.println(user.findByTitle("my playlist").findByTitlePart("hast"));
    }
}

/*
output:
        User{name='Mihel', playlists=[Playlist{title='my playlist', songs=[
        Song{title='Du hast', author='Ramstain', genre='Metal', length=3.1},
        Song{title='Ammerican attraction', author='Anti-Flag', genre='Punk', length=3.5}]}]}
        [
        Song{title='Du hast', author='Ramstain', genre='Metal', length=3.1}]

        Process finished with exit code 0
*/
