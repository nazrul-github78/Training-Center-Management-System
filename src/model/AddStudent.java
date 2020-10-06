/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.ByteArrayOutputStream;

/**
 *
 * @author User
 */
public class AddStudent {
    private int id;
    private String name;
    private byte[] pic;
    private ByteArrayOutputStream img;
    
    public AddStudent() {
        
        
    }

    public AddStudent(int id, String name, byte[] pic) {
        this.id = id;
        this.name = name;
        this.pic = pic;
    } 
    
    public AddStudent( String name, byte[] pic) {
       // this.name = name;
        this.pic = pic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getPic() {
        if(img != null)
             return img.toByteArray();
        else 
            return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }
    
    
}
