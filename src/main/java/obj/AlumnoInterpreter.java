/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obj;

/**
 *
 * @author gabri
 */
public class AlumnoInterpreter {
    
    public static String toString(Alumno a) {
        return a.getIdAlumno() + ", " + a.getName() + ", " + a.getSemestre();
    }
    
    public static Alumno fromString(String s){
        String[] div = s.split(",");
        return new Alumno(div[0],div[1]);
    }
    
}
