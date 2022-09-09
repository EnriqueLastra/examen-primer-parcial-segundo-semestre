import java.util.Date;
import java.util.List;

public class Base_de_Datos {
    int IdBasededatos;
    Terminos terminos;
    Date registro;
    Date Fechadeactualizaciondedocumento;
    Double Tamañodedocumento;
    List Temas;
    String Busqueda;
    Date getFechadeactualizacionbasededatos;
    int tamañodelapalabra;
    int frecuenciadelapalabra;
    Estadistica Estadistica;
    List Subtemas;

    public Base_de_Datos(int idBasededatos, Terminos terminos, Date registro, Date fechadeactualizaciondedocumento, Double tamañodedocumento, List temas, String busqueda, Date getFechadeactualizacionbasededatos, int tamañodelapalabra, int frecuenciadelapalabra, Estadistica estadistica, List subtemas) {
        IdBasededatos = idBasededatos;
        this.terminos = terminos;
        this.registro = registro;
        Fechadeactualizaciondedocumento = fechadeactualizaciondedocumento;
        Tamañodedocumento = tamañodedocumento;
        Temas = temas;
        Busqueda = busqueda;
        this.getFechadeactualizacionbasededatos = getFechadeactualizacionbasededatos;
        this.tamañodelapalabra = tamañodelapalabra;
        this.frecuenciadelapalabra = frecuenciadelapalabra;
        Estadistica = estadistica;
        Subtemas = subtemas;
    }
}
