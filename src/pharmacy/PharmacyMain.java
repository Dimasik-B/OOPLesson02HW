package pharmacy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PharmacyMain {
    public static void main(String[] args) {
        Component penicilin = new Component("Penicilin", "10mg", 100);
        Component salt = new Component("Salt", "5mg", 20);
        Component sugar = new Component("Sugar", "30mg", 60);
        Pharmacy pharmacy1 = new Pharmacy();
        IterablePharmacy pharmacy2 = new IterablePharmacy();

        pharmacy1.addComponents(penicilin, salt);
        pharmacy2.addComponents(penicilin, sugar);

        for (Component c:pharmacy2){
            System.out.println(c);
        }

        List<Component> list = new ArrayList<>();
        list.add(penicilin);
        list.add(salt);
        list.add(sugar);
        Collections.sort(list);
        System.out.println(list);
    }
}
