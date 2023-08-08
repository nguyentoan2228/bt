import Entities.Flower;
import Entities.Idol;
import Entities.Song;
import Service.FlowerService;
import Service.IdolService;
import Service.SongService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số idol");
        int n = Integer.parseInt(scanner.nextLine());
        IdolService idolService = new IdolService();
        ArrayList<Idol> idols = new ArrayList<>();
        for (int i = 0; i < n ; i++){
            System.out.println("mời bạn nhập idol thứ "+(i+1));
            FlowerService flowerService = new FlowerService();
            ArrayList<Flower> flowers = new ArrayList<>();
            Idol idol = idolService.inputIdol(scanner,flowerService,flowers);
            idols.add(idol);
            System.out.println("-------------------------------------------");
        }

        System.out.println("nhập số bài hát: ");
        int m = Integer.parseInt(scanner.nextLine());
        SongService songService = new SongService();
        ArrayList<Song> songs =new ArrayList<>();
        for (int i =0; i < m ; i++){
            System.out.println("mời bạn nhập bài hát thứ "+(i+1));
            Song song =songService.song(scanner);
            songs.add(song);
        }

        System.out.println(idols);
        System.out.println(songs);

    }
}
