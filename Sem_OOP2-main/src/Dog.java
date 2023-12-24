import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal implements Goable {
     
    public int legsCount;

    public Dog(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, int legsCount){

        super(name, birthDate, vaccinations, illness, owner);
        this.legsCount = legsCount;
    }

    public int getLegsCount(){
        return legsCount;
    }

    @Override
    public double run(){
        System.out.printf("%s going", type);
        return 5.0;
    }
}

