package transportes;

public interface ConMotor {

    default void encenderMotor() {
        String nombre = this.getClass().toString().split("\\.")[1].toLowerCase();
        System.out.println("El motor del " + nombre + " está encendido");
    }

}