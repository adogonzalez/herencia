//aqui iniciamos el proceso para crear herencia
package dominio;

//clase padre que heredara sus atributos
public class Motocicleta {
//    atributos de la clase padre a heredar
    protected String marca;
    protected String modelo;
    protected int codigo;
    protected char activo;
    
    public Motocicleta(){
        
    }
    public Motocicleta (String marca){
        this.marca = marca;
     }                             
//                       tres tipos de constructores para crear objetos de diferentes formas
    public Motocicleta(String marca, String modelo, int codigo, char activo) {
        this.marca = marca;
        this.modelo = modelo;
        this.codigo = codigo;
        this.activo = activo;
    }
//        Metodos set y get para recuperar datos y para modificar datos
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public char getActivo() {
        return this.activo;
    }

    public void setActivo(char activo) {
        this.activo = activo;
    }
//aqui llamamos el metodo toString para indicar que lo imprima  los metodos en pantalla
    @Override
    public String toString() {
        return "Motocicleta{" + "marca=" + marca + ", modelo=" + modelo + ", codigo=" + codigo + ", activo=" + activo + '}';
    }
    
    
    
}
