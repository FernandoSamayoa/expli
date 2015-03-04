/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expli;

/**
 *
 * @author Fernando Samayoa
 */
public class Scanner {
    int estado,indice,tam;
    String lexema;
    char []arreglo;
     
    public Scanner(char[]arr){
        estado=0;
        arreglo=arr;
        tam=arreglo.length;
        indice=0;
        lexema=""; 
    }
    private boolean validar(){
        int auxiliar = indice+1;
        boolean flag = false;
        if(auxiliar<=tam-1){
            flag=true;
            indice = auxiliar;
        }
        return flag;
    }
    
    public void estadocero(){
        switch(arreglo[indice]){
            case 'h':
                lexema+=""+arreglo[indice];
                ///asdfasdfSDFASDF
                if(validar())
                estadocero();
                else
                    System.out.println("error lexico en estado 0");
                break;
            case 'o':
                lexema+=""+arreglo[indice];
                if(validar())
                estadouno();
                else
                    System.out.println("error lexico en estado 0");
                break;
            default:
                System.out.println("error lexico en estado 0");
                break;
            
        }
            
    }
    public void estadouno(){
        switch(arreglo[indice]){
            case 'l':
                lexema+=""+arreglo[indice];
                if(validar())
                estadouno();
                else
                    System.out.println("error lexico en estado 1");
                break;
            case 'a':
                lexema+=""+arreglo[indice];
                
                aceptacion();
                break;
            default:
                System.out.println("error lexico en estado 1");
                break;
            
        }
    }
    
    public void aceptacion(){
        System.out.println("El lexema guardado es: "+lexema);//almacenarlo en alguna lista
        lexema="";
        if(validar()){
            estadocero();
        }
    }
    
}
