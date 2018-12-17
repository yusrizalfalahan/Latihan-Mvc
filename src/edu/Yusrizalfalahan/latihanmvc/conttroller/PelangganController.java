/*Nim : 10117043
  Nama : aaaaayusrizal Falahan 
  Kelas : IF2
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.Yusrizalfalahan.latihanmvc.conttroller;

import edu.Yusrizalfalahan.latihanmvc.model.PelangganModel;
import edu.Yusrizalfalahan.latihanmvc.view.pelangganview;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class PelangganController {
    
    private PelangganModel Model;

    public void setModel(PelangganModel Model) {
        this.Model = Model;
    }
    
    
    public void resetForm(pelangganview view){
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String notelp = view.getTxtTelp().getText();
        
        if (nama.equals("") && email.equals("") && notelp.equals("")) {
            
        }else {
            Model.resetForm();
            
        }
    }
    public void simpanForm(pelangganview view){
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String notelp = view.getTxtTelp().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong" );
             }else if(email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email Masih Kosong" );
                     
            
        }else if(notelp.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "No Telp Masih Kosong" );
        }else {
          Model.simpanForm();
        }
    }
}
