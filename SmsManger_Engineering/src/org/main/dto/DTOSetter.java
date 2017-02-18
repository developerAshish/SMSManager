/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.main.dto;

import java.io.Serializable;

/**
 *
 * @author ashish
 */
public class DTOSetter implements Serializable{
    String name;
    String email_id;
    String Contact;

    public DTOSetter(String name, String email_id, String Contact) {
        this.name = name;
        this.email_id = email_id;
        this.Contact = Contact;
    }

    public DTOSetter() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }
    
}
