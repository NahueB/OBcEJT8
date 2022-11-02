
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan Ignacio");
        persona.setEdad(19);
        persona.setTelefono(1131062045);
        System.out.println("NOMBRE: "+persona.getNombre());
        System.out.println("EDAD: "+persona.getEdad());
        System.out.println("TELEFONO: "+persona.getTelefono());
    }
}
class Persona{
    private int edad;
    private int telefono;
    private String nombre;

    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }


}