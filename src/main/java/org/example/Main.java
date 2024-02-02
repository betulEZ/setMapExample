package org.example;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Medication medikamente1=new Medication("name1",1,true);
     Medication medikamente2=new Medication("name2",2,true);
     Map<String,Medication> map=new HashMap<>();

     Pharmacy pharmacy=new Pharmacy(map,1);
     pharmacy.save(medikamente1);
     pharmacy.save(medikamente2);

     pharmacy.find(medikamente1.name);
     pharmacy.getSize();

     pharmacy.delete(medikamente1.name);
     pharmacy.getSize();

     pharmacy.printAll();
    }
}