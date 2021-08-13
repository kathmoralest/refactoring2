package modelos;

public class Materia {
    private String codigo;
    private String nombre;
    private String facultad;
    private double notaInicial;
    private double notaFinal;
    private double notaTotal;
    
    public String getCodigo() {
    	return this.codigo;
    }
    
    public void setCodigo(String codigo) {
    	this.codigo = codigo;
    }
    
    public String getNombre() {
    	return this.nombre;
    }
    
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    
    public String getFacultad() {
    	return facultad;
    }
    
    public void setFacultad(String facultad) {
    	this.facultad = facultad;
    }
    
    public double getNotaInicial() {
    	return this.notaInicial;
    }
    
    public void setNotaInicial(double notaInicial) {
    	this.notaInicial = notaInicial;
    }
    
    public double getNotaFinal() {
    	return this.notaFinal;
    }
    
    public void setNotaFinal(double notaFinal) {
    	this.notaFinal = notaFinal;
    }
    
    public double getNotaTotal() {
    	return this.notaTotal;
    	}
    
    public void setNotaTotal(double notaTotal) {
    	this.notaTotal = notaTotal;
    }
}






