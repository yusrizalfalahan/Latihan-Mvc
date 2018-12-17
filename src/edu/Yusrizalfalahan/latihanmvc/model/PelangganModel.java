/*Nim : 10117043
  Nama : aaaaayusrizal Falahan 
  Kelas : IF2
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.Yusrizalfalahan.latihanmvc.model;

import edu.Yusrizalfalahan.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class PelangganModel {
      
   private String Nama;
   private String email;
   private String noTelp;
   
   private PelangganListener pelangganlistener;

    public PelangganListener getPelangganlistener() {
        return pelangganlistener;
    }

    public void setPelangganlistener(PelangganListener pelangganlistener) {
        this.pelangganlistener = pelangganlistener;
    }
   

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        fireOnChange();
    }
   
    protected void fireOnChange(){
        if (pelangganlistener!=null) {
           pelangganlistener.onChange(this);
        }
        
    }
    public void resetForm(){
        setNama("");
        setEmail("");
        setNoTelp("");
        
    }
    
    public void simpanForm(){
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        resetForm();
    }
    
}
