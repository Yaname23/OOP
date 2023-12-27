import java.time.LocalDate;

public class Nurse extends Worker{
     
    private String surname;

    public Nurse(String name, String surname, LocalDate birthDate, Integer number){

        super(name, birthDate, number);
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }
    private void come (int time){
        System.out.println(name + " came to work in: " + time);
    }
    
    private void left (int time){
        System.out.println(name + " left his job in: " + time);
    }
    
    private void dayoff(){
        System.out.println(name + " Today is not a day off ");
    }
    
    public void liveCircle(){
        come(1);
        left(8);
        dayoff();
        
    }
}


