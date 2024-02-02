package org.example;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    Map<String,Medication> map;
    int count=0;

    public Pharmacy(Map<String, Medication> map, int count) {
        this.map = map;
        this.count = count;
    }

    int getSize(){
        System.out.println(map.size());
        return map.size();
    }
    void save(Medication medication){
        map.put(medication.name, medication);
    }
    Medication find(String medicationName){
        for(Medication s: map.values()){
            if(medicationName.equals(s.name))
                System.out.println(s.name+"medikamente find");
        }
        return null;
    }
    void delete(String medicationName){
        for(Medication s: map.values()) {
            if (medicationName.equals(s.name)) {
                map.remove(s.name);
                System.out.println(s.name + "delete");
            }
        }
    }
   void printAll(){
      for(String m :map.keySet()){
          System.out.println(map.get(m).name+" "+map.get(m).availability);
      }
   }
}
