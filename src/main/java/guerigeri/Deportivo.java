/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerigeri;

/**
 *
 * @author ERICK
 */
public class Deportivo extends Vehiculo {
    
    private int cilindrada;

    public Deportivo(int cilindrada, Long bastidor, String matricula, String marca, String modelo, String color, double tarifa) {
        super(bastidor, matricula, marca, modelo, color, tarifa);
        this.cilindrada = cilindrada;
    }



    public int getCilindrada() {
        return cilindrada;
    }   

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Deportivo{");
        sb.append(":").append(cilindrada);
        sb.append(":").append(super.getBastidor());
        sb.append(":").append(super.getMatricula());
        sb.append(":").append(super.getMarca());
        sb.append(":").append(super.getModelo());
        sb.append(":").append(super.getColor());
        sb.append(":").append(super.getTarifa());
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
