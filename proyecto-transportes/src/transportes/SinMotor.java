package transportes;

public interface SinMotor {

    default void usarFuerzaHumana(){
        String nombre=this.getClass().toGenericString().split("\\.")[1].toLowerCase();
        System.out.println("Usando fuerza humana para mover tu "+nombre);
    }
    
} 
