package transportes;
public class Bicicleta extends Vehiculo implements SinMotor {
    public Bicicleta(int velocidadMaxima){
        super(velocidadMaxima);
    }

    public void describir(){
        System.out.println("Soy una bicicleta con una velocidad máxima de "+getVelocidadMaxima()+" km/h");
    }
}
