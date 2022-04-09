package spacevehicle;

import java.util.Date;
import java.util.Scanner;

/**
 * Representación general de una nave espacial en base a la lectura "Naves
 * espaciales que pasaron a la historia. Clasificación.", se identificaron los
 * atributos y metodos generales que cumplian todos los tipos de naves
 * espaciales.
 *
 * @author Elkin Estiven González Cuellar
 */
public abstract class SpaceVehicle {

    public String name;
    public double weight, thrust, size, height;
    public Date creationDate = new Date();
    public boolean status;
    protected String ownerCountry, destination;
    private int id;
    private double power, speed;
    private String energySource;
    Scanner in = new Scanner(System.in);

    public SpaceVehicle() {
    }

    public SpaceVehicle(String name, int id) {

    }

    /**
     * Contructor general de una nave espacial.
     *
     * @param name,id,weight,thrust,size,height,status,power,ownerCountry,destination,energySource,speed
     */
    public SpaceVehicle(String name, int id, double weight, double thrust,
            double size, double height, boolean status, double power,
            String ownerCountry, String destination, String energySource, double speed) {
        this.name = name;
        this.id = id;
        this.weight = weight;
        this.thrust = thrust;
        this.size = size;
        this.height = height;
        this.status = status;
        this.power = power;
        this.ownerCountry = ownerCountry;
        this.destination = destination;
        this.energySource = energySource;
        this.speed = speed;
    }

    /**
     * Da información acerca de los atributos que han sido asignado a la nave.
     */
    public String toString() {
        return "\n" + "Nombre: " + name
                + " | id: " + id
                + " | Peso: " + weight
                + " | Empuje: " + thrust
                + " | Volumen: " + size
                + " | Altura: " + height
                + " | Estado: " + status
                + " | Potencia: " + power
                + " | Pais Propietario: " + ownerCountry
                + " | Destino : " + destination
                + " | Fuente de Energia: " + energySource
                + " | Fecha de creación: " + creationDate
                + " | Velocidad: " + speed
                + "\n";
    }

    /**
     * @return Nombre de la nave.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name Asigna el nombre a la nave.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return numero de identificación
     */
    public int getId() {
        return id;
    }

    /**
     * @param id Asigna un numero de identificación.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return Peso que tiene la nave.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight Asigna el peso que tendra la nave.
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return fuerza de acción que realiza la nave para acelerar.
     */
    public double getThrust() {
        return thrust;
    }

    /**
     * @param thrust Asigna la capacidad de empuje que tendra la nave.
     */
    public void setThrust(double thrust) {
        this.thrust = thrust;
    }

    /**
     * @return Volumen de la nave.
     */
    public double getSize() {
        return size;
    }

    /**
     * @param size Asigna el tamaño que tendrá la nave.
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * @return Altura
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height Altura
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return Fecha en que la nave empezo su actividad
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * @param creationDate tipo Date
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * @return Si la nave sigue en actividad o ya fue retirada o destruida.
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status Asigna un Estado de actividad True activo False Inactivo.
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return Potencia
     */
    public double getPower() {
        return power;
    }

    /**
     * @param power cantidad de trabajo que se realiza por unidad de tiempo
     */
    public void setPower(double power) {
        this.power = power;
    }

    /**
     * @return cambio de posición de un objeto con respecto al tiempo.
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * @param speed La velocidad que debe tener la nave.
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * @return Pais creador.
     */
    public String getOwnerCountry() {
        return ownerCountry;
    }

    /**
     */
    public void setOwnerCountry(String ownerCountry) {
        this.ownerCountry = ownerCountry;
    }

    /**
     * @return Destino o ubicación que tendra la nave ejemplo : Marte.
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination Lugar a donde va dirigida.
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return materiales sólidos, líquidos o gaseosos que proporcionan la
     * energia para el funcionamiento.
     */
    public String getEnergySource() {
        return energySource;
    }

    /**
     * @param energySource
     */
    public void setEnergySource(String energySource) {
        this.energySource = energySource;
    }

    /**
     * Actividad particular que realiza la nave.
     */
    public abstract void fuction();

    /**
     * Pide todos los atributos por pantalla para instanciar una nave
     */
    public void RequestDataShip() {

        System.out.println("Escribe el nombre de tu nave: ");
        setName(in.nextLine());
        System.out.println("Escribe el país o propietario de la nave:  ");
        setOwnerCountry(in.nextLine());
        System.out.println("¿Cual será su destino? ");
        setDestination(in.nextLine());
        System.out.println("Escribe el peso(kg): ");
        setWeight(in.nextDouble());
        System.out.println("¿Cuanto empuje tendrá?: ");
        setThrust(in.nextDouble());
        System.out.println("Escribe el volumen(m3)");
        setSize(in.nextDouble());
        System.out.println("Escribe la altura de tu nave: ");
        setHeight(in.nextDouble());
        System.out.println("Escribe la potencia de tu nave: ");
        setPower(in.nextDouble());

    }

}
