package spacevehicle;

import java.util.ArrayList;

/**
 * Representación de una nave no tripulada con metodos propios de este tipo de
 * nave.
 *
 * @author Elkin Estiven González Cuellar
 */
public interface UnmannedSpacecraft {

    /**
     * Observar, examinar, pensar o considerar algo con detenimiento para
     * conocerlo, comprenderlo o buscar una solución.
     */
    void study();

    /**
     * Reunir y medir información de diversas fuentes a fin de obtener un
     * panorama completo y preciso de una zona de interés.
     */
    void setData(String data);
    public ArrayList<String> getData();

}
