package transportes;
public class Barco extends Vehiculo implements ConMotor {
    public Barco(int velocidadMaxima){
        super(velocidadMaxima);
    }

    public void describir(){
        System.out.println("Soy un barco que navega a "+getVelocidadMaxima()+" km/h");
    }
}
