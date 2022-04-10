/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spacevehicle;

import java.util.ArrayList;

/**
 * Representación de la nave ATV enviada a la Estación espacial internacional
 * con los atributos y metodos que hereda de la clase SpaceVehicle , se
 * implementa la interface UnmmanedSpacecraft ya que es un tipo de nave no
 * tripulada, se añaden metodos y atributos propios de la clase.
 *
 * @author Elkin Estiven González Cuellar
 */
public class SpaceProbeshipATV extends SpaceVehicle implements UnmannedSpacecraft {
    /**
     * Encargado de almacenar los datos que enviara la sonda.
     */
    private ArrayList<String> data = new ArrayList<>();

    public SpaceProbeshipATV() {
    }
    /**
     * Instancia SpaceProbeMessenger con todos sus atributos.
     * @param temperature
     */
    public SpaceProbeshipATV(String name, int id, double weight, double thrust, double size, double height, boolean status, double power, String ownerCountry, String destination, String energySource, double speed, String temperature) {
        super(name, id, weight, thrust, size, height, status, power, ownerCountry, destination, energySource, speed);
        this.data.add(temperature);
    }
    /**
     * Metodo que representa el objetivo especifico de la ATV.
     */
    @Override
    public void fuction() {

        System.out.println("Mi función es abastecer, limpiar y regular periódicamente la elevación de la EEI.");

    }

    @Override
    public ArrayList<String> getData() {
        return data;
    }

    @Override
    public void setData(String imagen) {
        this.data.add(imagen);
    }
    /**
     * Abastece la EEI.
     */
    public void supply() {
        System.out.println("Mi función es llevar suministros ");
        System.out.println("Entregando alimentos...");
        System.out.println("Entregando combustible...");
    }
    /**
     * Limpia la EEI.
     */
    public void clean() {
        System.out.println("Mi función es limpiar la nave");
        System.out.println("Limpiando....");

    }

    @Override
    public void study() {
        String totalData = "";
        System.out.println("Analizando datos...");
        for (int i = 0; i <= data.size(); i++) {
            System.out.println(data.get(i));
            totalData += data.get(i);
        }

        System.out.println(totalData);
    }

}
