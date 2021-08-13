package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante{
    public ArrayList<Paralelo> paralelos;
    
    public Ayudante(){
        super();
        ArrayList<Paralelo> paralelos =this.paralelos
    }
    
    public void MostrarParalelos(){
        for(Paralelo par:paralelos){
            System.out.println(par);
        }
    }
}
