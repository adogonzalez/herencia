
package dominio;

//Aqui hemos creado la primera clase hija que puede heredar los atributos o tener los propios
public class Cliente extends Motocicleta{
    private int idMotocicleta;
    private double valor;
    private static int ContadorMotocicleta;

    public Cliente(String marca, double valor) {
        super(marca);
        this.idMotocicleta = ++ Cliente.ContadorMotocicleta;
        this.valor = valor;
    }

    public int getIdMotocicleta() {
        return idMotocicleta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idMotocicleta=").append(this.idMotocicleta);
        sb.append(", valor=").append(this.valor);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

 }
