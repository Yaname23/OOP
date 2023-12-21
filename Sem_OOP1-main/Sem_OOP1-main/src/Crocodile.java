import java.time.LocalDate;
import java.util.List;

public class Crocodile extends Animal{
    
    public int legsCount;

    public Crocodile(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, int legsCount, int go, int fly, int swim){

        super(name, birthDate, vaccinations, illness, owner, go, fly, swim);
        this.legsCount = legsCount;
    }

    public int getLegsCount(){
        return legsCount;
    }
}
    
