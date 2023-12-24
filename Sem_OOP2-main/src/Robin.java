import java.time.LocalDate;
import java.util.List;

public class Robin extends Animal implements Flyble, Goable{
    
    public Robin(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner){

        super(name, birthDate, vaccinations, illness, owner);
        
    }

    @Override
    public double fly(){
        System.out.printf("%s flying", type);
        return 10.0;
    
    }

    @Override
    public double run(){
        System.out.printf("%s going", type);
        return 5.0;
    }
}
    


