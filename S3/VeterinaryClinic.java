import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VeterinaryClinic {
    private List<Animal> patients = new ArrayList<>();

    public void addPatient(Animal animal){
        patients.add(animal);
    }
    public void addPatients(Animal ... animals){
        Collections.addAll(patients, animals);
    }
    private List<Worker> staff = new ArrayList<>();

    public void addStaf(Worker worker){
        staff.add(worker);
    }
    public void addStaff(Worker ... workers){
        Collections.addAll(staff, workers);
    }

    public List<Worker> getStaff() {
        return staff;
    }
    public List<Goable> getGoables(){
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if(animal instanceof Goable)
                result.add((Goable) animal);
        }
        return result;
    }
    public List<Swimble> getSwimbles(){
        List<Swimble> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if(animal instanceof Swimble)
                result.add((Swimble) animal);
        }
        return result;
    }
    public List<Flyble> getFlybles(){
        List<Flyble> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if(animal instanceof Flyble)
                result.add((Flyble) animal);
        }
        return result;
    }

    public List<Animal> getPatients() {
        return patients;
    }
}