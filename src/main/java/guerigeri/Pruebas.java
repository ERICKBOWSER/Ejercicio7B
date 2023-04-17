/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerigeri;

import java.util.ArrayList; 
import java.util.List;

/**
 *
 * @author ERICK
 */
public class Pruebas {
    public static void main(String[] args) {
        
        List<Vehiculo> vehiculoList = new ArrayList();
        
        Vehiculo t1 = new Turismo(4, true, Long.MAX_VALUE, "2343jakl", "Ford", "G1", "Negro", 60000);
        Vehiculo t2 = new Turismo(4, true, Long.MAX_VALUE, "2342sdfa", "Nissan", "J2", "Blanco", 80000);
        Vehiculo t3 = new Turismo(5, true, Long.MAX_VALUE, "0893SDFA", "Opel", "astra", "Rojo", 89232);
        Vehiculo t4 = new Turismo(4, true, Long.MAX_VALUE, "2342DFGG", "Abarth", "JK", "Naranja", 12303);
        Vehiculo t5 = new Turismo(0, true, Long.MAX_VALUE, "0923UITT", "Alfa romeo" , "IO", "Verder", 123423);
        Vehiculo t6 = new Turismo(0, true, Long.MAX_VALUE, "2390IIKT", "Aiways", "JK", "Marron", 234290);
        Vehiculo t7 = new Turismo(0, true, Long.MAX_VALUE, "0932JÑLT", "BYD", "O3", "Azul", 12300);
        Vehiculo t8 = new Turismo(0, true, Long.MAX_VALUE, "0923ÑLJK", "Citroen", "I2", "Negro", 90233);
        Vehiculo t9 = new Turismo(0, true, Long.MAX_VALUE, "0343JLKS", "bENTLEY", "I0", "Rojo", 234033);
        Vehiculo t10 = new Turismo(0, true, Long.MAX_VALUE, "2343OPWE", "Audi", "kñl", "Amarillo", 123434);
        
        Vehiculo d1 = new Deportivo(2390, Long.MAX_VALUE, "2342DFGG", "Abarth", "JK", "Naranja", 12303);
        Vehiculo d2 = new Deportivo(1092, Long.MAX_VALUE, "0343JLKS", "bENTLEY", "I0", "Rojo", 234033);
        Vehiculo d3 = new Deportivo(1209, Long.MAX_VALUE, "2342sdfa", "Nissan", "J2", "Blanco", 80000);
        Vehiculo d4 = new Deportivo(1200, Long.MAX_VALUE, "0893SDFA", "Opel", "astra", "Rojo", 89232);
        Vehiculo d5 = new Deportivo(1299, Long.MAX_VALUE, "2343OPWE", "Audi", "kñl", "Amarillo", 123434);  
        Vehiculo d6 = new Deportivo(4003, Long.MAX_VALUE, "2343jakl", "Ford", "G1", "Negro", 60000);
        Vehiculo d7 = new Deportivo(2239, Long.MAX_VALUE, "0932JÑLT", "BYD", "O3", "Azul", 12300);
        Vehiculo d8 = new Deportivo(2339, Long.MAX_VALUE, "0932JÑLT", "BYD", "O3", "Azul", 12300);
        Vehiculo d9 = new Deportivo(2323, Long.MAX_VALUE, "2342sdfa", "Nissan", "J2", "Blanco", 80000);
        Vehiculo d10 = new Deportivo(2323, Long.MAX_VALUE, "0923UITT", "Alfa romeo" , "IO", "Verder", 123423);
        
        
        Vehiculo f1 = new Furgoneta(760, 230, Long.MAX_VALUE, "0923UITT", "Alfa romeo" , "IO", "Verder", 123423);
        Vehiculo f2 = new Furgoneta(456, 234, Long.MAX_VALUE, "2342sdfa", "Nissan", "J2", "Blanco", 80000);
        Vehiculo f3 = new Furgoneta(567, 123, Long.MAX_VALUE, "0932JÑLT", "BYD", "O3", "Azul", 12300);
        Vehiculo f4 = new Furgoneta(565, 122, Long.MAX_VALUE, "0932JÑLT", "BYD", "O3", "Azul", 12300);
        Vehiculo f5 = new Furgoneta(673, 230, Long.MAX_VALUE,"2343OPWE", "Audi", "kñl", "Amarillo", 123434);
        Vehiculo f6 = new Furgoneta(343, 543, Long.MAX_VALUE,"2342DFGG", "Abarth", "JK", "Naranja", 12303);
        Vehiculo f7 = new Furgoneta(555, 234, Long.MAX_VALUE, "0343JLKS", "bENTLEY", "I0", "Rojo", 234033);
        Vehiculo f8 = new Furgoneta(340, 233, Long.MAX_VALUE, "2342sdfa", "Nissan", "J2", "Blanco", 80000);
        Vehiculo f9 = new Furgoneta(234, 230, Long.MAX_VALUE, "0893SDFA", "Opel", "astra", "Rojo", 89232);
        Vehiculo f10 = new Furgoneta(345, 2340, Long.MAX_VALUE, "2343jakl", "Ford", "G1", "Negro", 60000);
        
        
        vehiculoList.add(t1);
        vehiculoList.add(t2);
        vehiculoList.add(t3);
        vehiculoList.add(t4);
        vehiculoList.add(t5);
        vehiculoList.add(t6);
        vehiculoList.add(t7);
        vehiculoList.add(t8);
        vehiculoList.add(t9);
        vehiculoList.add(t10);
        
        vehiculoList.add(d1);
        vehiculoList.add(d2);
        vehiculoList.add(d3);
        vehiculoList.add(d4);
        vehiculoList.add(d5);
        vehiculoList.add(d6);
        vehiculoList.add(d7);
        vehiculoList.add(d8);
        vehiculoList.add(d9);
        vehiculoList.add(d10);
        
        vehiculoList.add(f1);
        vehiculoList.add(f2);
        vehiculoList.add(f3);
        vehiculoList.add(f4);
        vehiculoList.add(f5);
        vehiculoList.add(f6);
        vehiculoList.add(f7);
        vehiculoList.add(f8);
        vehiculoList.add(f9);
        vehiculoList.add(f10);
        
        FicheroCoches.escribir(vehiculoList, "turismo.txt");
        
        
        
        
        
        
        
        
    }
}
