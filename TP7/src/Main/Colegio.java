package Main;


import tp7.Alumno;
import tp7.Materia;


public class Colegio {
    
    public static void main(String[] args) {
        // Crear las materias
        Materia inglesI = new Materia(1, "Ingles I", 1);
        Materia matematicas = new Materia(2, "Matemáticas", 1);
        Materia laboratorio1 = new Materia(3, "Laboratorio 1", 1);
        System.out.println("Materias creadas");
        
        // Crear los alumnos
        Alumno lopez = new Alumno(1001, "López", "Martín");
        Alumno martinez = new Alumno(1002, "Martínez", "Brenda");
        System.out.println("Alumnos creados");

        // Inscribir a López en las 3 materias
        lopez.agregarMateria(inglesI);
        lopez.agregarMateria(matematicas);
        lopez.agregarMateria(laboratorio1);
        System.out.println("Alumno Lopez inscripto en las 3 materias creadas.");

        // Inscribir a Martínez en las 3 materias y en Laboratorio 1 de nuevo
        martinez.agregarMateria(inglesI);
        martinez.agregarMateria(matematicas);
        martinez.agregarMateria(laboratorio1);
        System.out.println("Alumno Martinez inscripto en las 3 materias creadas.");
        System.out.println("Alumno Martinez intenta inscribirse 2 veces en Laboratorio I.");
        martinez.agregarMateria(laboratorio1); // intenta inscribirse de nuevo en Laboratorio 1, pero no lo logra debido a la implementación del método agregarMateria
        
        // Visualizar la cantidad de materias a las que está inscripto cada alumno
        System.out.println("López está inscripto en " + lopez.cantidadMaterias() + " materias.");
        System.out.println("Martínez está inscripto en " + martinez.cantidadMaterias() + " materias.");
    }
}
