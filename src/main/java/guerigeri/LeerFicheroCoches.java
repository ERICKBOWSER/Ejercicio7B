/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerigeri;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ERICK
 */
public class LeerFicheroCoches {
    
    public static List<Vehiculo> lectura(String nombre){
    // Fichero a leer con datos de ejemplo
        String idFichero = nombre;

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        
        List<Vehiculo> listaVehiculo = new ArrayList();

//        System.out.println(idFichero);
        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(":");
                
                System.out.println(tokens[0]);
                System.out.println(tokens[1]);
                System.out.println(tokens[2]);
                System.out.println(tokens[3]);
                System.out.println(tokens[4]);
                System.out.println(tokens[5]);
                System.out.println(tokens[6]);
                System.out.println(tokens[7]);
                
                if(tokens[0].contains("0 - ")){
                    String regex = "[0-2]\\s-\\s"; // "\\s" para los espacios en blanco
                    tokens[0] = tokens[0].replaceAll(regex, ""); // Reemplazamos la expresion 
                                        
                    Vehiculo vTurismo = new Turismo(
                            Integer.parseInt(tokens[7]), 
                            Boolean.parseBoolean(tokens[8]), 
                            Long.parseLong(tokens[0]), 
                            tokens[1], 
                            tokens[2], 
                            tokens[3], 
                            tokens[4],
                            Double.parseDouble(tokens[5]), 
                            Boolean.parseBoolean(tokens[6]));
                    
                    listaVehiculo.add(vTurismo);
                    
                } else if(tokens[0].contains("1 - ")){
                    String regex = "[0-2]\\s-\\s"; // "\\s" para los espacios en blanco
                    tokens[0] = tokens[0].replaceAll(regex, ""); // Reemplazamos la expresion 
                    
                    Vehiculo vDeportivo = new Deportivo(Integer.parseInt(tokens[7]), 
                            Long.parseLong(tokens[0]), 
                            tokens[1], 
                            tokens[2], 
                            tokens[3], 
                            tokens[4],
                            Double.parseDouble(tokens[5]), 
                            Boolean.parseBoolean(tokens[6])
                            );
                    listaVehiculo.add(vDeportivo);
                }else{
                    String regex = "[0-2]\\s-\\s"; // "\\s" para los espacios en blanco
                    tokens[0] = tokens[0].replaceAll(regex, ""); // Reemplazamos la expresion 
                    
                    Vehiculo vFurgoneta = new Furgoneta(Integer.parseInt(tokens[8]), 
                            Integer.parseInt(tokens[7]),
                            Long.parseLong(tokens[0]), 
                            tokens[1], 
                            tokens[2], 
                            tokens[3], 
                            tokens[4],
                            Double.parseDouble(tokens[5]), 
                            Boolean.parseBoolean(tokens[6])
                            );
                    listaVehiculo.add(vFurgoneta);
                }
                
                for (String string : tokens) {
                    System.out.print(string + "\t");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        return listaVehiculo;
    }
}
