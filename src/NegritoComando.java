/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexandre.chaves
 */
public class NegritoComando implements Comando{
    
    private final Documento documento;
    private Trecho trecho;
    
    public NegritoComando(Documento documento){
        this.documento = documento;
    }

    @Override
    public void fazer() {
        
        trecho = documento.selecionarTrecho();
        documento.aplicarNegrito(trecho);
    }

    @Override
    public void desfazer() {
        
        documento.desfazerNegrito(trecho);
    }
    
    
}
