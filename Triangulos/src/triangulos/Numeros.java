/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulos;

/**
 *
 * @author root
 */
public class Numeros {

     int ladoA=0;
     int ladoB=0;
     int ladoC=0;
    
    /**
     *
     * @param ladoA
     * @param ladoB
     * @param ladoC
     */
    public Numeros(int ladoA,int ladoB,int ladoC){
        this.ladoA=ladoA;
        this.ladoB=ladoB;
        this.ladoC=ladoC;
    }
    public String conocerTriangulo(){
        String resultado="";
        
            if(ladoA==ladoB && ladoB==ladoC && ladoC==ladoA){
                resultado="El triangulo es Equilatero";
            }else if(ladoB==ladoC || ladoC==ladoA || ladoA==ladoB){
                resultado="El triangulo es isoceles";
            }else if(ladoA!=ladoB && ladoC!=ladoA){            
                resultado="El triangulo es escaleno";
            }
        
        
        return resultado;
    }
    
}
