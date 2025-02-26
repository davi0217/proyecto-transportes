package transportes;
public class Coche extends Vehiculo implements ConMotor {
    
    public Coche(int velocidadMaxima){
        super(velocidadMaxima);
    }

    public void describir(){
        System.out.println("Soy un coche que puede alcanzar "+velocidadMaxima+" km/h");
    }

    
}
