package Service;

import Entities.Song;

import java.util.Scanner;

public class SongService {
    public Song song(Scanner scanner){
        System.out.println("mời bạn nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("mời bạn nhập ca sĩ: ");
        String singer = scanner.nextLine();
        return new Song(name,singer);
    }
}
