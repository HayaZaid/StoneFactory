/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newproject;

/**
 *
 * @author pc corner
 */
public class Newproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Loading l = new Loading();
        Loggin m =new Loggin();
        l.setVisible(true);
        try {
        
            for (int i =0; i <=100; i++) {  
                Thread.sleep(35);
              l.jLabel2.setText(Integer.toString(i)+"%"); 
              l.jProgressBar1.setValue(i);  
              if(i==100){
                l.setVisible(false);
                 m.setVisible(true);
              }
            }
        } catch (Exception e) {
        }
    }
    
}
