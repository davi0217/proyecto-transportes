package transportes;
public class Avion extends Vehiculo implements ConMotor {
    public Avion(int velocidadMaxima){
        super(velocidadMaxima);
    }

    public void describir(){
        System.out.println("Soy un avión que vuela a "+velocidadMaxima+" km/h");
    }
}
