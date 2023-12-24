import java.time.LocalDate;
import java.util.List;

public class Crocodile extends Animal implements Goable, Swimble{
    
    public Crocodile(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner){

        super(name, birthDate, vaccinations, illness, owner);
        
    }
    @Override
    public double run(){
        System.out.printf("%s going", type);
        return 5.0;
    }
    
    @Override
    public double swim(){
        System.out.printf("%s swimming", type);
        return 10.0;
    
    }
}
    
