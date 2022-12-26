/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Donation.Organization;

import Donation.Role.DisasterReliefOrgAdminRole;
import Donation.Role.FundsAdminRole;
import Donation.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Raushan
 */
public class DisasterReliefOrg extends Organization{
    
    private String disasterReliefOrgName;
    private int totalSupplyKits;
    private double totalFunds;
    
    public DisasterReliefOrg(String name) {
        super(name);
        this.disasterReliefOrgName=name;
    }

    public String getDisasterReliefOrgName() {
        return disasterReliefOrgName;
    }

    public void setDisasterReliefOrgName(String disasterReliefOrgName) {
        this.disasterReliefOrgName = disasterReliefOrgName;
    }

    public int getTotalSupplyKits() {
        return totalSupplyKits;
    }

    public void setTotalSupplyKits(int totalSupplyKits) {
        this.totalSupplyKits = totalSupplyKits;
    }

    public double getTotalFunds() {
        return totalFunds;
    }

    public void setTotalFunds(double totalFunds) {
        this.totalFunds = totalFunds;
    }
    
    @Override
    public orgType getOrgType() {
        return Organization.orgType.DisasterReliefOrg;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> role = new ArrayList();
        role.add(new DisasterReliefOrgAdminRole());
        return role;
    }
    
    public double addTotalFunds(double funds){
        return totalFunds + funds;
    }
    
    public int addTotalSupplyKits(int kits){
        return totalSupplyKits + kits;
    }
    
}
