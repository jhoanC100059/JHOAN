
public class Trabajador {
    
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private int sueldo;
    private String region;
    
    public Trabajador(){//ctrl + espacio -> creamos el constructor vacio
        
    }
    public Trabajador(int id, String nombre, String direccion, String telefono, int sueldo, String region){
        this.id=id;
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
        this.sueldo=sueldo;
        this.region=region;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    
}
