package tp7;

import java.util.HashSet;
import javax.swing.JOptionPane;

public class Alumno {
     private int legajo;
     private String apellido;
     private String nombre;
     private HashSet<Materia> materias = new HashSet<>();
     
     public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
     }
     
     public Alumno() {
     }

     public void agregarMateria(Materia m){
        if(materias.add(m)){
            JOptionPane.showMessageDialog(null,"El alumno se inscribio");
        }else {
            JOptionPane.showMessageDialog(null, "Alumno ya inscripto");
        }
     }
     
     public int cantidadMaterias(){
        return materias.size();
     }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.legajo;
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
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return apellido + " " + nombre ;
    }
     
     
     

}

