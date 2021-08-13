package modelos;

public class Notas {

    private double nexamen;
    private double nlecciones;
    private double ntalleres;
    private double neberes;
    private double notaInicial;
    private double notaFinal;
    private double notaTotal;

    public double getNexamen() {
        return nexamen;
    }

    public void setNexamen(double nexamen) {
        this.nexamen = nexamen;
    }

    public double getNlecciones() {
        return nlecciones;
    }

    public void setNlecciones(double nlecciones) {
        this.nlecciones = nlecciones;
    }

    public double getNtalleres() {
        return ntalleres;
    }

    public void setNtalleres(double ntalleres) {
        this.ntalleres = ntalleres;
    }

    public double getNdeberes() {
        return ndeberes;
    }

    public void setNdeberes(double ndeberes) {
        this.ndeberes = ndeberes;
    }
    
    public double calcularNota(Estudiante e){
        double nota=0;
        for(Paralelo par:e.getParalelos()){
            double notaTeorico=(nexamen()+ndeberes()+nlecciones())*0.80;
            double notaPractico=(nota.ntalleres())*0.20;
            notaInicial=notaTeorico+notaPractico;
            }
        }
        return nota;
    }

    public double calcularNotaTotal(Estudiante e){
        double notaTotal=0;
        for(Paralelo par:e.getParalelos()){
            if(p.equals(par)){
                notaTotal=( calcularNota(e)+ calcularNota(e))/2;
            }
        }
        return notaTotal;  
    }
       
}
