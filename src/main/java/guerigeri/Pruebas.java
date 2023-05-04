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
        
        Vehiculo t1 = new Turismo(4, true, Long.MAX_VALUE, "2343jakl", "Ford", "G1", "Negro", 60000, true);
        Vehiculo t2 = new Turismo(4, true, Long.MAX_VALUE, "2342sdfa", "Nissan", "J2", "Blanco", 80000, true);
        Vehiculo t3 = new Turismo(5, true, Long.MAX_VALUE, "0893SDFA", "Opel", "astra", "Rojo", 89232, false);
        Vehiculo t4 = new Turismo(4, true, Long.MAX_VALUE, "2342DFGG", "Abarth", "JK", "Naranja", 12303, true);
        Vehiculo t5 = new Turismo(0, true, Long.MAX_VALUE, "0923UITT", "Alfa romeo" , "IO", "Verder", 123423, false);
        Vehiculo t6 = new Turismo(0, true, Long.MAX_VALUE, "2390IIKT", "Aiways", "JK", "Marron", 234290, false);
        Vehiculo t7 = new Turismo(0, true, Long.MAX_VALUE, "0932JÑLT", "BYD", "O3", "Azul", 12300, false);
        Vehiculo t8 = new Turismo(0, true, Long.MAX_VALUE, "0923ÑLJK", "Citroen", "I2", "Negro", 90233, true);
        Vehiculo t9 = new Turismo(0, true, Long.MAX_VALUE, "0343JLKS", "bENTLEY", "I0", "Rojo", 234033, false);
        Vehiculo t10 = new Turismo(0, true, Long.MAX_VALUE, "2343OPWE", "Audi", "kñl", "Amarillo", 123434, true);
        
        Vehiculo d1 = new Deportivo(2390, Long.MAX_VALUE, "2342DFGG", "Abarth", "JK", "Naranja", 12303, false);
        Vehiculo d2 = new Deportivo(1092, Long.MAX_VALUE, "0343JLKS", "bENTLEY", "I0", "Rojo", 234033, true);
        Vehiculo d3 = new Deportivo(1209, Long.MAX_VALUE, "2342sdfa", "Nissan", "J2", "Blanco", 80000, true);
        Vehiculo d4 = new Deportivo(1200, Long.MAX_VALUE, "0893SDFA", "Opel", "astra", "Rojo", 89232, true);
        Vehiculo d5 = new Deportivo(1299, Long.MAX_VALUE, "2343OPWE", "Audi", "kñl", "Amarillo", 123434, false);  
        Vehiculo d6 = new Deportivo(4003, Long.MAX_VALUE, "2343jakl", "Ford", "G1", "Negro", 60000, true);
        Vehiculo d7 = new Deportivo(2239, Long.MAX_VALUE, "0932JÑLT", "BYD", "O3", "Azul", 12300, true);
        Vehiculo d8 = new Deportivo(2339, Long.MAX_VALUE, "0932JÑLT", "BYD", "O3", "Azul", 12300, false);
        Vehiculo d9 = new Deportivo(2323, Long.MAX_VALUE, "2342sdfa", "Nissan", "J2", "Blanco", 80000, false);
        Vehiculo d10 = new Deportivo(2323, Long.MAX_VALUE, "0923UITT", "Alfa romeo" , "IO", "Verder", 123423, true);
        
        
        Vehiculo f1 = new Furgoneta(760, 230, Long.MAX_VALUE, "0923UITT", "Alfa romeo" , "IO", "Verder", 123423, true);
        Vehiculo f2 = new Furgoneta(456, 234, Long.MAX_VALUE, "2342sdfa", "Nissan", "J2", "Blanco", 80000, true);
        Vehiculo f3 = new Furgoneta(567, 123, Long.MAX_VALUE, "0932JÑLT", "BYD", "O3", "Azul", 12300, true);
        Vehiculo f4 = new Furgoneta(565, 122, Long.MAX_VALUE, "0932JÑLT", "BYD", "O3", "Azul", 12300, false);
        Vehiculo f5 = new Furgoneta(673, 230, Long.MAX_VALUE,"2343OPWE", "Audi", "kñl", "Amarillo", 123434, true);
        Vehiculo f6 = new Furgoneta(343, 543, Long.MAX_VALUE,"2342DFGG", "Abarth", "JK", "Naranja", 12303, false);
        Vehiculo f7 = new Furgoneta(555, 234, Long.MAX_VALUE, "0343JLKS", "bENTLEY", "I0", "Rojo", 234033, true);
        Vehiculo f8 = new Furgoneta(340, 233, Long.MAX_VALUE, "2342sdfa", "Nissan", "J2", "Blanco", 80000, false);
        Vehiculo f9 = new Furgoneta(234, 230, Long.MAX_VALUE, "0893SDFA", "Opel", "astra", "Rojo", 89232, true);
        Vehiculo f10 = new Furgoneta(345, 2340, Long.MAX_VALUE, "2343jakl", "Ford", "G1", "Negro", 60000, false);
        
        
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
        
        // Escribir en el fichero 
        MetodosFicheroCoches.escribir(vehiculoList, "vehiculos.txt");
        
        // Leer el fichero 
        List<Vehiculo> turismos = LeerFicheroCoches.lectura("Vehiculos.txt");
        
        for (int i = 0; i < turismos.size(); i++) {
            System.out.println(turismos.get(i));
        }
        
        
        
        
        
    }
}
