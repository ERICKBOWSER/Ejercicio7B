/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerigeri;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ERICK
 */
public class FicheroCoches {
    public static void escribir(List<Vehiculo> vehiculo, String nombre){
        
        String tmp = "";
        
        try(BufferedWriter flujo = new BufferedWriter(new FileWriter(nombre))){
                
                for(Vehiculo v : vehiculo){
                    
                    if(v instanceof Turismo){
                        tmp = "0 - " + v.toString();
                    }
                    if(v instanceof Deportivo){
                        tmp ="1 - " + v.toString();
                    }
                    if(v instanceof Furgoneta){
                        tmp = "2 - " + v.toString();
                    }
                    flujo.write(tmp);
                    flujo.newLine();
                    
                }
                // Guardar cambios en el disco
                flujo.flush();
                
            } catch(IOException e){
                System.out.println(e.getMessage());
            }   
        
    }
    
    
    
}
