package pharmacy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



public class PharmacyMain{
    public static void main(String[] args) {
        
        Component pinicelin = new Component("Pinicelin", "10mg", 100);
        Component salt = new Component("Salt","5mg", 50);
        Component analgin = new Component("Analgin", "3mg", 80);
        Component magnii = new Component("Magnii", "2mg", 70);
        Component chrom = new Component("Chrom", "7mg", 10);

        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1.addComponents(salt, pinicelin);

        IterablePharmacy pharmacy2 = new IterablePharmacy();
        pharmacy2.addComponents(analgin, pinicelin);
        
        Pharmacy pharmacy3 = new Pharmacy();
        pharmacy3.addComponents(chrom, magnii);

        Pharmacy pharmacy4 = new Pharmacy();
        pharmacy4.addComponents(chrom, magnii);
        
        
        for (Component c : pharmacy2){
            System.out.println(c);
        }
        List<Component> list = new ArrayList<>();
        list.add(salt);
        list.add(pinicelin);
        list.add(analgin);
        Collections.sort(list);
        System.out.println(list);

        Set<Pharmacy> result = new HashSet<>();
        result.add(pharmacy1);
        result.add(pharmacy3);
        result.add(pharmacy4);

        System.out.println(result.size());
            
        }

    }

        
