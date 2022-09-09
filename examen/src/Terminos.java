public class Terminos {
    String Palabras;
    int Numpalabras;
    String tipodedeletra;
    int tamañodelapalabra;
    Temas temas;

    public Terminos(String palabras, int numpalabras, String tipodedeletra, int tamañodelapalabra, Temas temas) {
        Palabras = palabras;
        Numpalabras = numpalabras;
        this.tipodedeletra = tipodedeletra;
        this.tamañodelapalabra = tamañodelapalabra;
        this.temas = temas;
    }
}
