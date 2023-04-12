package models;

public class Curso {
    private String nombreCurso;
    private double cantidadHorasXDias;
    private double diaXSemana;
    private String turno;
    private double precioXHora;
    private String [] alumnos = new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, double cantidadHorasXDias, double diaXSemana, String turno, double precioXHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasXDias = cantidadHorasXDias;
        this.diaXSemana = diaXSemana;
        this.turno = turno;
        this.precioXHora = precioXHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public double getCantidadHorasXDias() {
        return cantidadHorasXDias;
    }

    public void setCantidadHorasXDias(double cantidadHorasXDias) {
        this.cantidadHorasXDias = cantidadHorasXDias;
    }

    public double getDiaXSemana() {
        return diaXSemana;
    }

    public void setDiaXSemana(double diaXSemana) {
        this.diaXSemana = diaXSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioXHora() {
        return precioXHora;
    }

    public void setPrecioXHora(double precioXHora) {
        this.precioXHora = precioXHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
}
