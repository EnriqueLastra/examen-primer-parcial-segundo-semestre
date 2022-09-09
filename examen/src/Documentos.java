import java.util.Date;
import java.util.List;

public class Documentos {
    int Iddocumentos;
    List titulo;
    List enlace;
    String palabras;
    int Numregistro;
    Date registro;
    double Tamañodedocumento;
    List Temas;
    List Subtemas;
    Date Fechadeactualizaciondedocmento;
    int Frecuenciadepalabra;
    int Tamañodelapalabra;
    Terminos terminos;

    public Documentos(int iddocumentos, List titulo, List enlace, String palabras, int numregistro, Date registro, double tamañodedocumento, List temas, List subtemas, Date fechadeactualizaciondedocmento, int frecuenciadepalabra, int tamañodelapalabra, Terminos terminos) {
        Iddocumentos = iddocumentos;
        this.titulo = titulo;
        this.enlace = enlace;
        this.palabras = palabras;
        Numregistro = numregistro;
        this.registro = registro;
        Tamañodedocumento = tamañodedocumento;
        Temas = temas;
        Subtemas = subtemas;
        Fechadeactualizaciondedocmento = fechadeactualizaciondedocmento;
        Frecuenciadepalabra = frecuenciadepalabra;
        Tamañodelapalabra = tamañodelapalabra;
        this.terminos = terminos;
    }
}
