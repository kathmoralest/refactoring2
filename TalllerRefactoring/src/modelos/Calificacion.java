package modelos;
public class Calificacion {
    public double notaInicial;
    public double notaFinal;
    public double notaTotal;

        //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
        public double CalcularNotaInicial(Paralelo p, double nexamen,double ndeberes, double nlecciones, double ntalleres){
            double notaInicial=0;
            for(Paralelo par:paralelos){
                if(p.equals(par)){
                    double notaTeorico=(nexamen+ndeberes+nlecciones)*0.80;
                    double notaPractico=(ntalleres)*0.20;
                    notaInicial=notaTeorico+notaPractico;
                }
            }
            return notaInicial;
        }
        
        //Calcula y devuelve la nota final contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
        
        public double CalcularNotaFinal(Paralelo p, double nexamen,double ndeberes, double nlecciones, double ntalleres){
            double notaFinal=0;
            for(Paralelo par:paralelos){
                if(p.equals(par)){
                    double notaTeorico=(nexamen+ndeberes+nlecciones)*0.80;
                    double notaPractico=(ntalleres)*0.20;
                    notaFinal=notaTeorico+notaPractico;
                }
            }
            return notaFinal;
        }
        
        //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
        public double CalcularNotaTotal(Paralelo p){
            double notaTotal=0;
            for(Paralelo par:paralelos){
                if(p.equals(par)){
                    notaTotal=(p.getMateria().notaInicial+p.getMateria().notaFinal)/2;
                    
                }
            }
            return notaTotal;
            
        }
}