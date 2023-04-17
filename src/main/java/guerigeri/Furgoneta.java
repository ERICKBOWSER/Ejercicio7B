/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerigeri;

/**
 *
 * @author ERICK
 */
public class Furgoneta extends Vehiculo {
    private int carga;
    private int volumen;

    public Furgoneta(int carga, int volumen, Long bastidor, String matricula, String marca, String modelo, String color, double tarifa) {
        super(bastidor, matricula, marca, modelo, color, tarifa);
        this.carga = carga;
        this.volumen = volumen;
    }

    public int getCarga() {
        return carga;
    }

    public int getVolumen() {
        return volumen;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Furgoneta{");
        sb.append(":").append(carga);
        sb.append(":").append(volumen);
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
