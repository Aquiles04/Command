/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexandre.chaves
 */
public class Trecho {
    
    private final int inicio;
    private final int termino;
    
    public Trecho(int inicio, int termino){
        
        this.inicio = inicio;
        this.termino = termino;
        
    }
    
    public int getInicio(){
        return inicio;
    }
    
    public int getTermino(){
        return termino;
    }
    
    
    
}
