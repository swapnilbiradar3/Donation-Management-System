/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Donation.Network;

import Donation.Enterprise.EnterpriseDirectory;

/**
 *
 * @author Raushan
 */
public class Network {
    
    private String netName;
    private EnterpriseDirectory entDirectory;
    
    public Network(){
        entDirectory = new EnterpriseDirectory(); 
    }
    

    public String getName() {
        return netName;
    }

    public void setName(String name) {
        this.netName = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return entDirectory;
    }
    
    
    @Override
    public String toString(){
        return netName;
    }

    
    
    
}
