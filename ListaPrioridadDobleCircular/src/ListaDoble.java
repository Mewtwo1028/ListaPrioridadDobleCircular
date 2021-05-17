/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Osmar
 */
public class ListaDoble {
    
    protected Nodo ini, fin;
    
    public ListaDoble(){
        ini = fin=null;
    }
     
    public boolean insertar(char dato, int prioridad){
        if(ini == null){
            ini = fin = new Nodo (dato, prioridad);
            return true;
        }
        if(ini == fin){
            fin= new Nodo (dato, prioridad);
            ini.setSig(fin);
            fin.setAnt(ini);
            return true;
        }
        fin.setSig (new Nodo (dato, prioridad));
        fin.getSig().setAnt(fin);
        fin = fin.getSig();
        return true;
    }
    
    public boolean eliminar(){
        if (fin == null){
            return false;
        }
        if (ini == fin){
            ini = fin = null;
            return true;
        }
        ini = ini.getSig();
        ini.getAnt().setSig(null);
        ini.setAnt(fin);
        return true;
    }
    
    @Override
    public String toString(){
        return mostrar(fin);
    }

    private String mostrar(Nodo most) {
        if(most == ini){
             
            return most.getSig().toString()+"\n";        
        }
        
        return mostrar(most.getAnt()) + String.format("%s\n", most.getAnt(), most, most.getSig());
    }
    
}
