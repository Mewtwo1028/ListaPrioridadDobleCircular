/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Osmar
 */
public class ListaDobleCircularConPrioridad extends ListaDobleCircular{
    
    public ListaDobleCircularConPrioridad(){
        super();
    }
    
    @Override
    public boolean insertar(char dato, int prioridad){
        
        if(!super.insertar(dato, prioridad)){
            return false;
        }
        
        
        if(fin.getPrioridad() == fin.getPrioridad()){
            return true;
        }
        
        
        if(fin.getPrioridad() > ini.getPrioridad()){
            fin = fin.getAnt();
            ini = ini.getAnt();
            return true;
        }
        
        
        Nodo aux = fin.getAnt();
        while(fin.getPrioridad() > aux.getPrioridad()){
            aux = aux.getAnt();
        }
        
        
        fin.setSig(aux.getSig());
        ini.setAnt(fin.getAnt());
        fin.getAnt().setSig(ini);
        fin.setAnt(aux);
        
        aux.getSig().setAnt(fin);
        aux.setSig(fin);
        fin = ini.getAnt();
        
        return true;
    }
    
}
