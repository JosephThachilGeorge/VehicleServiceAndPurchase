package com.company.Database;

import Model.Customerinformation;
import Model.Purchasecustomerinformation;

import java.util.HashMap;
import java.util.Map;

public class Mydatabase {

    private Map<String, Customerinformation> customerMap = new HashMap<>();
    private Map<String, Purchasecustomerinformation>purchasecustomerinformationMap=new HashMap<>();

    public void addCustomer(Customerinformation customerinformation) {
        if (customerMap.containsKey(customerinformation.getCusid())) {
            //System.out.println("Customer is already present:");
        } else {
            customerMap.put(customerinformation.getCusid(), customerinformation);
        }
    }

    public void updateCustomer(Customerinformation customerinformation) {
        if (customerMap.containsKey(customerinformation.getCusid())) {
            customerMap.put(customerinformation.getCusid(), customerinformation);
        } else {
            System.out.println("Customer is not present");
        }
    }

    public void deleteCustomer(Customerinformation customerinformation) {
        this.deleteCustomerById(customerinformation.getCusid());
    }

    public void deleteCustomerById(String customerId) {
        if (customerMap.containsKey(customerId)) {
            customerMap.remove(customerId);
        } else {
            System.out.println("Customer is not present");
        }

        return;
    }

    public Customerinformation getCustomerById(String customerId) {
        if(customerMap.containsKey(customerId)){
            return customerMap.get(customerId);
        } else{
            System.out.println("Customer is not present");
        }
        return null;
    }

    public Map<String, Customerinformation> getCustomerMap() {
        return customerMap;
    }


    public void addPurchaseCustomer(Purchasecustomerinformation purchasecustomerinformation){
        if(purchasecustomerinformationMap.containsKey(purchasecustomerinformation.getPcusId())){
            System.out.println("Customer is already present:");}
        else {

            purchasecustomerinformationMap.put(purchasecustomerinformation.getPcusId(),purchasecustomerinformation);
        }
    }

    public void updatePurchaseCustomer(Purchasecustomerinformation purchasecustomerinformation){
        if(purchasecustomerinformationMap.containsKey(purchasecustomerinformation.getPcusId())) {
            purchasecustomerinformationMap.put(purchasecustomerinformation.getPcusId(), purchasecustomerinformation);}
        else{
            System.out.println("Customer is not present");
        }
    }

    public void deletePurchaseCustomer(Purchasecustomerinformation purchasecustomerinformation) {
        this.deletePurchaseCustomerById(purchasecustomerinformation.getPcusId());
    }

    public void deletePurchaseCustomerById(String purchasecustomerId) {
        if(purchasecustomerinformationMap.containsKey(purchasecustomerId)){
            purchasecustomerinformationMap.remove(purchasecustomerId);

        } else{
            System.out.println("Customer is not present");
        }
    }

    public Purchasecustomerinformation getPurchaseCustomerById(String customerpurchaseId) {
        if(purchasecustomerinformationMap.containsKey(customerpurchaseId)){
            return purchasecustomerinformationMap.get(customerpurchaseId);
        } else{
            System.out.println("Customer is not present");
        }
        return null;
    }
    public Map<String, Purchasecustomerinformation> getPurchasecustomerinformationMap() {
        return purchasecustomerinformationMap;
    }

}


