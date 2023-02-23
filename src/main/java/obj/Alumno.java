/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obj;

/**
 *
 * @author gabri
 */
public class Alumno {
    private int idAlumno;
    private String name;
    private String semestre;

    public Alumno() {
    }

    public Alumno(int idAlumno, String name, String semestre) {
        this.idAlumno = idAlumno;
        this.name = name;
        this.semestre = semestre;
    }

    public Alumno(String name, String semestre) {
        this.semestre = semestre;
        this.name = name;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
}
