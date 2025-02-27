package transportes;

public abstract class Vehiculo {
    private int velocidadMaxima;

    public Vehiculo(int velocidadMaxima){
        this.velocidadMaxima=velocidadMaxima;
    }

    public int getVelocidadMaxima(){
        return this.velocidadMaxima;
    }
    public void arrancar(){
        System.out.println("El vehículo está en marcha");
    }

    public abstract void describir();

}


