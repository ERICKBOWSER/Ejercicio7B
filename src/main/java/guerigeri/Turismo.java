/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerigeri;

/**
 *
 * @author ERICK
 */
public class Turismo extends Vehiculo {
    private int puertas;
    private boolean marchaAutomatica;
    
    // No implementa métodos pero hereda los de Vehiculo.

    // Si no tiene constructor da error 

    public Turismo(int puertas, boolean marchaAutomatica, Long bastidor, String matricula, String marca, String modelo, String color, double tarifa) {
        super(bastidor, matricula, marca, modelo, color, tarifa);
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
    }

    
    public int getPuertas() {
        return puertas;
    }

    public boolean isMarchaAutomatica() {
        return marchaAutomatica;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Turismo{");
        sb.append(":").append(puertas);
        sb.append(":").append(marchaAutomatica);
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
