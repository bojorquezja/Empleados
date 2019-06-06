import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Empleado {
    
    private String nombres;
    private String dni;
    private Double sueldo;
    private String direccion;
    private List<Equipo> equipos;

    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public List<Equipo> getEquipos() {
        return equipos;
    }
    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public Empleado(String nombres, String dni, double sueldo, String direccion, List<Equipo> equipos) {
        this.nombres = nombres;
        this.dni = dni;
        this.sueldo = sueldo;
        this.direccion = direccion;
        this.equipos = equipos;
    }

    public Empleado(String nombres, String dni, double sueldo, String direccion) {
        this.nombres = nombres;
        this.dni = dni;
        this.sueldo = sueldo;
        this.direccion = direccion;
        this.equipos = new ArrayList<>();
    }

    public Empleado() {      
        this.equipos = new ArrayList<>();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nombres);
        hash = 29 * hash + Objects.hashCode(this.dni);
        hash = 29 * hash + Objects.hashCode(this.sueldo);
        hash = 29 * hash + Objects.hashCode(this.direccion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (!Objects.equals(this.nombres, other.nombres)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.sueldo, other.sueldo)) {
            return false;
        }
        return true;
    }
    
    
}
