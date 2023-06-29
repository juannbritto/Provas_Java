package Prova2;

public enum Genero {
    
    MASCULINO("Masculino", 'M'),
    FEMININO("Feminino", 'F');
    
    protected String texto;
    protected char caracter;

    private Genero(String texto, char caracter) {
        this.texto = texto;
        this.caracter = caracter;
    }

    public String getTexto() {
        return texto;
    }

    public char getCaracter() {
        return caracter;
    }
    
    
}
