/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author fataelislami
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JajarGenjang obj=new JajarGenjang(50,60,70,80,100,120);
        obj.hitungKeliling();
        obj.hitungLuas();
        
        Segitiga obj1=new Segitiga(50,60,70,100,120);
        obj1.hitungKeliling();
        obj1.hitungLuas();
    }
    
}
