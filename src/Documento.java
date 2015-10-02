
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexandre.chaves
 */
public class Documento {
    
    private final Scanner scanner = new Scanner(System.in);
    
    public Trecho selecionarTrecho(){
        
        int inicio, termino;
        System.out.println("Informe o inicio do trecho a ser selecionado:");
        inicio = scanner.nextInt();
        
        System.out.println("Informe o termino do trecho a ser selecionado:");
        termino = scanner.nextInt();
        
        Trecho trecho;
        trecho = new Trecho(inicio, termino);
        return trecho;
    }
    
    
    public void aplicarNegrito(Trecho trecho){
        System.out.printf("Negrito aplicado ao trecho: (%d,%d) ao documento.\n",
        trecho.getInicio(),
        trecho.getTermino());
        
    }
    
    public void desfazerNegrito(Trecho trecho){
        System.out.printf("Negrito removido do trecho: (%d,%d) ao documento.\n",
        trecho.getInicio(),
        trecho.getTermino());
    }
}
