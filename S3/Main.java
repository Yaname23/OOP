import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat( "Barsik", LocalDate.of(1993, 6, 6), new ArrayList<>(), "Chumka", "Boss", 4);
        // System.out.println(barsik);
        // System.out.println(barsik.getLegsCount());

        Dog bobik = new Dog("Bobik", LocalDate.of(1995, 5, 5), new ArrayList<>(), "no", "no", 4);
        Parrot kesha = new Parrot( "Kesha", LocalDate.of(2010, 1, 1), new ArrayList<>(), "no", "no");
        Robin chik = new Robin( "Chik", LocalDate.of(2011, 2, 2), new ArrayList<>(), "no", "no");
        Crocodile gena = new Crocodile( "Gena", LocalDate.of(1999, 3, 3), new ArrayList<>(), "no", "no");
        Fish dori = new Fish( "Dori", LocalDate.of(2016, 8, 8), new ArrayList<>(), "no", "no");
        
        //System.out.println(chik.type);
        //System.out.println(gena.type);

        Doctor richard = new Doctor("Richard", "Fox", LocalDate.of(1985, 11, 11), 9099776);
        Nurse stella = new Nurse("Stella", "Nice", LocalDate.of(1987, 12, 12), 9099788);

        List<Worker> workers = new ArrayList<>();
        workers.add(richard);
        workers.add(stella);


        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(bobik);
        animals.add(kesha);
        animals.add(chik);
        animals.add(gena);
        animals.add(dori);
        
        VeterinaryClinic clinic = new VeterinaryClinic(); 
        clinic.addPatients(barsik, chik, kesha, bobik, gena, dori);
        clinic.addStaff(richard, stella);
        System.out.println(clinic.getPatients());
        System.out.println("====================================");
        System.out.println(clinic.getStaff());
        System.out.println("====================================");
        System.out.println(clinic.getGoables());
        System.out.println("====================================");
        System.out.println(clinic.getSwimbles());
        System.out.println("====================================");
        System.out.println(clinic.getFlybles());
        System.out.println("====================================");
        richard.liveCircle();
        System.out.println("====================================");
        stella.liveCircle();
        
    }
}

   