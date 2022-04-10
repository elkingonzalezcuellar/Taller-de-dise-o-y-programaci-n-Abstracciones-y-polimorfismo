package spacevehicle;

import java.util.ArrayList;

/**
 * Representación de un satelite con los atributos y metodos que hereda de la
 * clase SpaceVehicle , se implementa la interface UnmmanedSpacecraft ya que
 * satelite es un tipo de nave no tripulada, se añaden metodos y atributos
 * propios de un Satelite.
 *
 * @author Elkin Estiven González Cuellar
 */
public class Satelite extends SpaceVehicle implements UnmannedSpacecraft {

    /**
     * Encargado de almacenar los datos que obtiene el Satelite.
     */
    private ArrayList<String> data = new ArrayList<>();

    public Satelite() {
    }

    /**
     * Instancia un Satelite con todos sus atributos.
     */
    public Satelite(String name, int id, double weight, double thrust, double size, double height, boolean status, double power, String ownerCountry, String destination, String energySource, double speed) {
        super(name, id, weight, thrust, size, height, status, power, ownerCountry, destination, energySource, speed);
    }

    /**
     * Metodo que representa el objetivo especifico de un Satelite.
     */
    @Override
    public void fuction() {
        System.out.println("Estudio cuerpos celestes");
    }

    /**
     * Agrega todos los datos individuales en un solo String.
     */
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

    /**
     * @return los datos recogidos por el satelite
     */
    @Override
    public ArrayList<String> getData() {
        return data;
    }

    /**
     * @param imagen Imagenes tomadas por el satelite
     */
    @Override
    public void setData(String imagen) {
        this.data.add(imagen);

    }

    /**
     *
     * @param celestialObject Cuerpo celeste que orbita el Satelite.
     */
    public void toOrbit(String celestialObject) {

        System.out.println("Soy" + getName() + "y orbito alrededor de :" + celestialObject
                + "a una velocidad de :" + getSpeed());
    }

}
