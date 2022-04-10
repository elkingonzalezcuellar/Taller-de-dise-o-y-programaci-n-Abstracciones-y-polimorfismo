package spacevehicle;

import java.util.ArrayList;

/**
 * Representación de una sonda de exploración con los atributos y metodos que
 * hereda de la clase SpaceVehicle , se implementa la interface
 * UnmmanedSpacecraft ya que es un tipo de nave no tripulada, se añaden metodos
 * y atributos propios.
 *
 * @author Elkin Estiven González Cuellar
 */
public class spaceProbeExploration extends SpaceVehicle implements UnmannedSpacecraft {

    private ArrayList<String> data = new ArrayList<>();

    public spaceProbeExploration() {
    }

    /**
     * Instancia una nave de exploración con todos sus atributos.
     */
    public spaceProbeExploration(String name, int id, double weight, double thrust, double size, double height, boolean status, double power, String ownerCountry, String destination, String energySource, double speed) {
        super(name, id, weight, thrust, size, height, status, power, ownerCountry, destination, energySource, speed);
    }

    /**
     * Estudia los cuerpos celestes del universo, incluidos las estrellas, los
     * planetas, sus satélites naturales, los asteroides, cometas y meteoroides,
     */
    @Override
    public void fuction() {

        System.out.println("Mi función principal es el estudio de cuerpos celestes");

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

    @Override
    public ArrayList<String> getData() {
        return data;
    }

    @Override
    public void setData(String imagen) {
        this.data.add(imagen);
    }

    /**
     * Examinar atentamente un lugar
     */
    public void ScanAround() {
        System.out.println("Inspeccionando el area....");
    }

}
