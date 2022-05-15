
package pkg1179.preenchimentodevetoriv;
import java.util.Scanner;
/**
 *
 * @author Vitor
 */
public class PreenchimentodeVetorIV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int y =0;
       int contP=0, contI=0;
       int N=0;
       int[] par = new int[5];
       int[] impar = new int[5];
       
       for(int i = 0; i<15;i++){
           N = in.nextInt();
           
           if(N%2==0){
               par[contP]=N;
               contP++;
           }else{
               impar[contI]=N;
               contI++;
           }
           if(contP >=5){
               contP=0;
               mostrarPares(par,y, contP);
           }else if(contI>=5){
               contI=0;
               mostrarImpar(impar,y, contI);
           }
           
       }
       mostrarImpar(impar,y, contI);
       mostrarPares(par,y, contP);
       
    }
    public static void mostrarPares(int[] par, int y, int contP){
        if(y==0){
           for(int i=0; i<5;i++){
            System.out.println("par["+i+"] = "+par[i]);
            y++;
           } 
           for(int i=0; i<contP;i++){
            System.out.println("par["+i+"] = "+par[i]);
            
           }
        }
        
        
    }
    public static void mostrarImpar(int[] impar, int y, int contI){
        if(y==0){
            for(int i=0; i<5;i++){
            System.out.println("impar["+i+"] = "+impar[i]);
            }
            y++;
        }
        for(int i=0; i<contI;i++){
            System.out.println("impar["+i+"] = "+impar[i]);
            
           }
        
    }
}
