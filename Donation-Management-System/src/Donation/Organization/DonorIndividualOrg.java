/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Donation.Organization;

import Donation.Role.DonorRole;
import Donation.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Raushan
 */
public class DonorIndividualOrg extends Organization{
    
    private String donorInd;
    
    public DonorIndividualOrg(String name) {
        super(name);
        this.donorInd=name;
    }

    public String getDonorInd() {
        return donorInd;
    }

    public void setDonorInd(String donorInd) {
        this.donorInd = donorInd;
    }
    
    @Override
    public orgType getOrgType() {
        return Organization.orgType.DonorIndividualOrg;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> role = new ArrayList();
        role.add(new DonorRole());
        return role;
    }
    
}
