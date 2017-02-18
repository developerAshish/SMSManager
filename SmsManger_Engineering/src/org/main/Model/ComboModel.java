/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.main.Model;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import org.main.pojo.Createcontact;

/**
 *
 * @author EEW-TECH
 */
public class ComboModel implements ComboBoxModel {

    private Createcontact selectedItem;
    private String selectedString;
    private ArrayList<Createcontact> orgs;

    public ComboModel(ArrayList<Createcontact> orgs) {
        this.orgs = orgs;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        for (Createcontact org : orgs) {
            selectedString = org.getName();
            selectedItem = org;
        }
    }

    @Override
    public Createcontact getSelectedItem() {
        return selectedItem;
    }

    @Override
    public int getSize() {
        return orgs.size();
    }

    @Override
    public String getElementAt(int index) {
        return orgs.get(index).getName();
    }

    @Override
    public void addListDataListener(ListDataListener l) {
    }

    public ComboModel() {
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
    }

    public String tostring() {
        return selectedString;
    }
}
