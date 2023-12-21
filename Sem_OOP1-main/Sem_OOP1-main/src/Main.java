import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat( "Barsik", LocalDate.of(1993, 6, 6), new ArrayList<>(), "Chumka", "Boss", 4, 1, 0, 0);
        System.out.println(barsik);
        System.out.println(barsik.getLegsCount());

        Dog bobik = new Dog("Bobik", LocalDate.of(1995, 5, 5), new ArrayList<>(), "no", "no", 4, 1, 0, 0);
        
        Parrot kesha = new Parrot( "Kesha", LocalDate.of(2010, 1, 1), new ArrayList<>(), "no", "no", 2, 1, 1, 0 );
        
        Robin chik = new Robin( "Chik", LocalDate.of(2011, 2, 2), new ArrayList<>(), "no", "no", 2 , 1, 1, 0);
        
        Crocodile gena = new Crocodile( "Gena", LocalDate.of(1999, 3, 3), new ArrayList<>(), "no", "no", 4, 1, 0, 1 );
        
        Fish dori = new Fish( "Dori", LocalDate.of(2016, 8, 8), new ArrayList<>(), "no", "no", 0, 0, 0, 1 );
        

        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(bobik);
        animals.add(kesha);
        animals.add(chik);
        animals.add(gena);
        animals.add(dori);
        

        System.out.println("===========================");

        barsik.liveCircle();
        bobik.liveCircle();
        kesha.liveCircle();
        chik.liveCircle();
        gena.liveCircle();
        dori.liveCircle();
    }
}

   