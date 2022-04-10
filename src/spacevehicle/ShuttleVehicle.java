
package spacevehicle;

/**
 * Representación de una nave lanzadera con los atributos y metodos que hereda
 * de la clase SpaceVehicle , se añaden metodos y atributos de la clase.
 *
 * @author Elkin Estiven González Cuellar
 */
public class ShuttleVehicle extends SpaceVehicle {

    /**
     * Peso que se puede transportar
     */
    private double transportCapacity;
    /**
     * Nave asignada a llevar al espacio
     */
    private SpaceVehicle load;

    public ShuttleVehicle() {
    }

    /**
     * Instancia un Satelite con todos sus atributos.
     *
     * @param load
     * @param transportCapacity
     */
    public ShuttleVehicle(String name, int id, double weight, double thrust,
            double size, double height, boolean status, double power, String ownerCountry,
            String destination, String energySource, double speed, double transportCapacity, SpaceVehicle load) {
        super(name, id, weight, thrust, size, height, status, power, ownerCountry, destination,
                energySource, speed);
        this.transportCapacity = transportCapacity;
        this.load = load;
    }

    @Override
    /**
     * Metodo que representa el objetivo especifico de una nave lanzadera.
     */
    public void fuction() {
        System.out.println("Mi objetivo es transportar una carga ");
    }

    /**
     * Lanza la nave cuando es el momento de ponerla en su destino.
     */
    public void PlacingCargoInOrbit() {
        System.out.println("La carga se ha lanzado con exito!");

    }

    /**
     * @return El peso que carga la nave.
     */
    public double getTransportCapacity() {
        return transportCapacity;
    }

    /**
     * @param name Peso que se añade para cargar.
     */
    public void setTransportCapacity(int transportCapacity) {
        this.transportCapacity = transportCapacity;
    }
}
