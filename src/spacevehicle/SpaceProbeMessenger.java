package spacevehicle;

import java.util.ArrayList;

/**
 * Representación de una sonda mensajera con los atributos y metodos que hereda
 * de la clase SpaceVehicle , se implementa la interface UnmmanedSpacecraft ya
 * que es un tipo de nave no tripulada, se añaden metodos y atributos propios de
 * la clase.
 *
 * @author Elkin Estiven González Cuellar
 */
public class SpaceProbeMessenger extends SpaceVehicle implements UnmannedSpacecraft {

    /**
     * Encargado de almacenar los datos que enviara la sonda.
     */
    private ArrayList<String> data = new ArrayList<>();

    public SpaceProbeMessenger() {
    }

    /**
     * Instancia SpaceProbeMessenger con todos sus atributos.
     */
    public SpaceProbeMessenger(String name, int id, double weight, double thrust, double size, double height, boolean status, double power, String ownerCountry, String destination, String energySource, double speed) {
        super(name, id, weight, thrust, size, height, status, power, ownerCountry, destination, energySource, speed);
    }
    /**
     * Metodo que representa el objetivo especifico de una Sonda Mensajera.
     */
    @Override
    public void fuction() {

        System.out.println("Mi función es tomar y enviar imagenes");

    }

    @Override
    public ArrayList<String> getData() {
        return data;
    }

    @Override
    public void setData(String imagen) {
        this.data.add(imagen);
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
