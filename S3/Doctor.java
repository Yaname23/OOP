import java.time.LocalDate;

public class Doctor extends Worker {
     
    private String surname;

    public Doctor(String name, String surname, LocalDate birthDate, Integer number){

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
        come(2);
        left(9);
        dayoff();
        
    }

//     @Override
//     public double come(){
//         System.out.printf("%s coming", name);
//         return come();
//     }
//     @Override
//     public double left(){
//         System.out.printf("%s leaving", name);
//         return left();
//     }

//     @Override
//     public double dayoff(){
//         System.out.printf("%s DayOff", name);
//         return dayoff();
    
}


