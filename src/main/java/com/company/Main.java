package com.company;

import Model.*;
import com.company.Database.Mydatabase;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner commandLineScanner = new Scanner(System.in);
        System.out.println("WELCOME TO VEHICLE PURCHASE AND SERVICE CENTER!");
        System.out.println("This Service Center has Purchase of CAR and Services of CAR ,MOTORBIKE and VAN ! ");
        System.out.println("**************************************************************");

        int MAINCHOICE;

        do {
            System.out.println("MAIN MENU !");
            System.out.println("***********");
            System.out.println("ENTER YOUR CHOICE");
            System.out.println("1: VEHICLE SERVICE!");
            System.out.println("2: PURCHASE CAR!");

            MAINCHOICE = commandLineScanner.nextInt();


            switch (MAINCHOICE) {

                case 1:

                    System.out.println("WELCOME TO VEHICLE SERVICE!");

                    Mydatabase mydatabase = new Mydatabase();
                    Customerinformation customerinformation = new Customerinformation();

                    int CHOICE;
                    do {

                        System.out.println("ENTER YOUR CHOICE !");
                        System.out.println("1: INSERT NEW CUSTOMER !");
                        System.out.println("2: VIEW ALL CUSTOMER !");
                        System.out.println("3: DELETE CUSTOMER BY CUSTOMER ID !");
                        System.out.println("4: VIW CUSTOMER BY CUSTOMER ID !");
                        System.out.println("5: UPDATE CUSTOMER !");
                        System.out.println("6: DELETE VEHICLE BY VEHICLE MODEL NUMBER !");
                        System.out.println("7: EXIT ! GO TO MAIN MENU !");


                        CHOICE = commandLineScanner.nextInt();

                        switch (CHOICE) {

                            case 1:

                                System.out.println("Enter Customer First Name:");
                                commandLineScanner.nextLine();  //this will print each line
                                String fname = commandLineScanner.nextLine();
                                System.out.println("Enter Customer Last Name:");
                                String lname = commandLineScanner.nextLine();
                                System.out.println("Enter Customer ID:");
                                String cusid = commandLineScanner.nextLine();
                                System.out.println("Enter Customer Mobile Number:");
                                String cusmobilenumber = commandLineScanner.nextLine();

                                customerinformation.setFname(fname);
                                customerinformation.setLname(lname);
                                customerinformation.setCusid(cusid);
                                customerinformation.setCusmobilenumber(cusmobilenumber);

                                mydatabase.addCustomer(customerinformation);

                                System.out.println("Enter Your VEHICLE Type: 1: FOR CAR:  2: FOR VAN  3: FOR MOTORBIKE!");

                                int VEHICLECHOICE;

                                VEHICLECHOICE = commandLineScanner.nextInt();
                                Vehicle vehicle = new Vehicle();
                                switch (VEHICLECHOICE) {

                                    case 1:
                                        System.out.println("Enter CAR Name:");
                                        commandLineScanner.nextLine();
                                        String carvehiclename = commandLineScanner.nextLine();
                                        System.out.println("Enter CAR Model Number:");
                                        String carvehiclemodelnumber = commandLineScanner.nextLine();
                                        System.out.println("Enter CAR Problem Description:");
                                        String carproblemdescription = commandLineScanner.nextLine();


                                        vehicle.setType(Type.CAR);
                                        vehicle.setVehiclename(carvehiclename);
                                        vehicle.setVehiclemodelnumber(carvehiclemodelnumber);
                                        vehicle.setProblemdescription(carproblemdescription);
                                        customerinformation.addVehicle(vehicle);
                                        mydatabase.updateCustomer(customerinformation);

                                        System.out.println("Thank You!. Information Stored!");
                                        Type.CAR.cardisplay();
                                        Type.CAR.cardiscount();
                                        Type.CAR.carcalculatecost();
                                        Type.CAR.carexpecteddeliverydate();
                                        break;


                                    case 2:

                                        System.out.println("Enter VAN Name:");
                                        commandLineScanner.nextLine();
                                        String vanvehiclename = commandLineScanner.nextLine();
                                        System.out.println("Enter VAN Model Number:");
                                        String vanvehiclemodelnumber = commandLineScanner.nextLine();
                                        System.out.println("Enter VAN Problem Description:");
                                        String vanproblemdescription = commandLineScanner.nextLine();


                                        vehicle.setType(Type.VAN);
                                        vehicle.setVehiclename(vanvehiclename);
                                        vehicle.setVehiclemodelnumber(vanvehiclemodelnumber);
                                        vehicle.setProblemdescription(vanproblemdescription);
                                        customerinformation.addVehicle(vehicle);
                                        mydatabase.updateCustomer(customerinformation);

                                        Type.VAN.vandisplay();
                                        Type.VAN.vandiscount();
                                        Type.VAN.vancalculatecost();
                                        Type.VAN.vanexpecteddeliverydate();


                                        System.out.println("Thank You!. Information Stored!");

                                        Type.VAN.vandisplay();
                                        Type.VAN.vandiscount();
                                        Type.VAN.vancalculatecost();
                                        Type.VAN.vanexpecteddeliverydate();
                                        break;

                                    case 3:


                                        System.out.println("Enter MOTORBIKE Name:");
                                        commandLineScanner.nextLine();
                                        String motorbikevanvehiclename = commandLineScanner.nextLine();
                                        System.out.println("Enter MOTORBIKE Model Number:");
                                        String motorbikevanvehiclemodelnumber = commandLineScanner.nextLine();
                                        System.out.println("Enter MOTORBIKE Problem Description:");
                                        String motorbikeproblemdescription = commandLineScanner.nextLine();

                                        vehicle.setType(Type.MOTORBIKE);
                                        vehicle.setVehiclename(motorbikevanvehiclename);
                                        vehicle.setVehiclemodelnumber(motorbikevanvehiclemodelnumber);
                                        vehicle.setProblemdescription(motorbikeproblemdescription);
                                        customerinformation.addVehicle(vehicle);
                                        mydatabase.updateCustomer(customerinformation);

                                        System.out.println("Thank You!. Information Stored!");

                                        Type.MOTORBIKE.motorbikedisplay();
                                        Type.MOTORBIKE.motorbikediscount();
                                        Type.MOTORBIKE.motorbikecalculatecost();
                                        Type.MOTORBIKE.motorbikeexpecteddeliverydate();
                                        break;
                             }
                           break;

                            case 2:

                                System.out.println("WELCOME TO CUSTOMER DATA BASE!");
                                System.out.println("...............................");


                                Map<String, Customerinformation> customerData = mydatabase.getCustomerMap();

                                for (String key : customerData.keySet()) {
                                    Customerinformation d = customerData.get(key);
                                    System.out.println("CUSTOMER INFORMATION!");
                                    System.out.println(String.format("Customer First Name: %s, Customer Last Name: %s, Customer ID: %s, Customer Mobile Number: %s", d.getFname(), d.getLname(), d.getCusid(), d.getCusmobilenumber()));
                                    System.out.println("VEHICLE INFORMATION!");

                                    for (Vehicle c : d.getVehicles()) {
                                        System.out.println(String.format("Vehicle Type: %s, Vehicle Name: %s, Vehicle Model Number: %s, Vehicle Problem description: %s", c.getType(), c.getVehiclename(), c.getVehiclemodelnumber(), c.getProblemdescription()));


                                    }
                                }

                                break;

                            case 3:

                                System.out.println("Enter Customer ID:");
                                commandLineScanner.nextLine();
                                String CustomerIdToDelete = commandLineScanner.nextLine();

                                mydatabase.deleteCustomerById(CustomerIdToDelete);

                                System.out.println("Customer is deleted Successfully and Information is Updated!!!!!!!");


                                break;

                            case 4:

                                System.out.println("Enter Customer ID:");
                                commandLineScanner.nextLine();
                                String CustomerIdDisplay = commandLineScanner.nextLine();

                                Customerinformation d = mydatabase.getCustomerById(CustomerIdDisplay);

                                if (d != null) {

                                    System.out.println("CUSTOMER INFORMATION!");
                                    System.out.println(String.format("Customer First Name: %s, Customer Last Name: %s, Customer ID: %s, Customer Mobile Number: %s", d.getFname(), d.getLname(), d.getCusid(), d.getCusmobilenumber()));
                                    System.out.println("VEHICLE INFORMATION!");

                                    for (Vehicle c : d.getVehicles()) {
                                        System.out.println(String.format("Vehicle Type: %s, Vehicle Name: %s, Vehicle Model Number: %s, Vehicle Problem description: %s", c.getType(), c.getVehiclename(), c.getVehiclemodelnumber(), c.getProblemdescription()));

                                    }
                                }

                                break;

                            case 5:

                                System.out.println("Enter the Customer ID that you want to Update:");
                                commandLineScanner.nextLine();
                                String cusId = commandLineScanner.nextLine();
                                System.out.println("Enter the new First Name of Customer ");
                                String fName = commandLineScanner.nextLine();
                                System.out.println("Enter the new Last Name of Customer ");
                                String lName = commandLineScanner.nextLine();

                                Customerinformation nameInMap = mydatabase.getCustomerById(cusId);
                                if (nameInMap != null) {
                                    nameInMap.setFname(fName);
                                    nameInMap.setLname(lName);
                                    mydatabase.updateCustomer(nameInMap);
                                }

                                System.out.println("Updated Database:");

                                break;

                            case 6:


                                System.out.println("Enter VEHICLE MODEL NUMBER:");
                                commandLineScanner.nextLine();
                                String VehiclemodelnumberToDelete = commandLineScanner.nextLine();
                                customerinformation.removeVehicle(VehiclemodelnumberToDelete);

                                System.out.println("VEHICLE is deleted Successfully and Information is Updated!!!!!!!");


                            case 7:
                                System.out.println("Thank YOU!");
                                break;

                        }

                    }
                    while (CHOICE != 7);

                    break;


                case 2:

                    int PURCHASECHOICE;
                    Mydatabase mydatabase1 = new Mydatabase();
                    Purchasecustomerinformation purchasecustomerinformation = new Purchasecustomerinformation();
                    do {

                        PurchaseVehicle purchaseVehicle = new PurchaseVehicle();

                        System.out.println("WELCOME TO PURCHASE OF CAR !");
                        System.out.println("***************************!");
                        System.out.println("ENTER YOUR CHOICE !");
                        System.out.println("1: INSERT NEW CUSTOMER !");
                        System.out.println("2: VIEW ALL CUSTOMER !");
                        System.out.println("3: PAYMENT STATUS OF CUSTOMER !");
                        System.out.println("4: UPDATE PAYMENT STATUS !");
                        System.out.println("5: DELETE CUSTOMER !");
                        System.out.println("6: UPDATE VEHICLE BY MODEL NUMBER");
                        System.out.println("7: EXIT APPLICATION ! ");

                        PURCHASECHOICE = commandLineScanner.nextInt();

                        switch (PURCHASECHOICE) {

                            case 1:
                                //Purchasecustomerinformation purchasecustomerinformation = new Purchasecustomerinformation();

                                System.out.println("Enter Customer First Name:");
                                commandLineScanner.nextLine();  //this will print each line
                                String pfname = commandLineScanner.nextLine();
                                System.out.println("Enter Customer Last Name:");
                                String plname = commandLineScanner.nextLine();
                                System.out.println("Enter Customer ID:");
                                String pcusId = commandLineScanner.nextLine();
                                System.out.println("Enter Customer Mobile Number:");
                                String pmobilenumber = commandLineScanner.nextLine();

                                purchasecustomerinformation.setPfname(pfname);
                                purchasecustomerinformation.setPlname(plname);
                                purchasecustomerinformation.setPcusId(pcusId);
                                purchasecustomerinformation.setPmobilenumber(pmobilenumber);

                                mydatabase1.addPurchaseCustomer(purchasecustomerinformation);

                                System.out.println("Enter the TYPE of CAR that you want to PURCHASE: 1: FOR SWIFT  2: FOR SUV  !");

                                int PURCHASEVEHICLECHOICE;

                                PURCHASEVEHICLECHOICE = commandLineScanner.nextInt();
                                //  PurchaseVehicle purchaseVehicle = new PurchaseVehicle();
                                switch (PURCHASEVEHICLECHOICE) {

                                    case 1:
                                        System.out.println("Enter SWIFT Information !");
                                        System.out.println("Enter CAR Full Name:");
                                        commandLineScanner.nextLine();
                                        String pname = commandLineScanner.nextLine();
                                        System.out.println("Enter CAR Model Number:");
                                        String pmodelnumber = commandLineScanner.nextLine();
                                        System.out.println("Enter CAR Price:");
                                        double price = commandLineScanner.nextInt();
                                        System.out.println("Payment STATUS! 1: FOR PAID 2: FOR NOT-PAID 3: FOR ADVANCE-PAID !");

                                        int PAIDSTATUS;

                                        PAIDSTATUS = commandLineScanner.nextInt();

                                        purchaseVehicle.setPtype(PurchaseVehicleType.SWIFT2019);

                                        switch (PAIDSTATUS) {

                                            case 1:

                                                purchaseVehicle.setStype(PurchaseStatusType.PAID);
                                                purchaseVehicle.setPname(pname);
                                                purchaseVehicle.setPrice(price);
                                                purchaseVehicle.setPmodelnumber(pmodelnumber);
                                                purchasecustomerinformation.addPurchaseVehicle(purchaseVehicle);
                                                mydatabase1.updatePurchaseCustomer(purchasecustomerinformation);

                                                System.out.println("Thank You!. Information Stored!");

                                                break;

                                            case 2:

                                                purchaseVehicle.setStype(PurchaseStatusType.NOTPAID);
                                                purchaseVehicle.setPname(pname);
                                                purchaseVehicle.setPmodelnumber(pmodelnumber);
                                                purchaseVehicle.setPrice(price);
                                                purchasecustomerinformation.addPurchaseVehicle(purchaseVehicle);
                                                mydatabase1.updatePurchaseCustomer(purchasecustomerinformation);

                                                System.out.println("Thank You!. Information Stored!");

                                                break;

                                            case 3:

                                                purchaseVehicle.setStype(PurchaseStatusType.ADVANCEPAID);
                                                purchaseVehicle.setPname(pname);
                                                purchaseVehicle.setPmodelnumber(pmodelnumber);
                                                purchaseVehicle.setPrice(price);
                                                purchasecustomerinformation.addPurchaseVehicle(purchaseVehicle);
                                                mydatabase1.updatePurchaseCustomer(purchasecustomerinformation);

                                                System.out.println("Thank You!. Information Stored!");
                                                break;
                                        }

                                        break;

                                    case 2:

                                        System.out.println("Enter SUV Information !");
                                        System.out.println("Enter CAR Full Name:");
                                        commandLineScanner.nextLine();
                                        String pname1 = commandLineScanner.nextLine();
                                        System.out.println("Enter CAR Model Number:");
                                        String pmodelnumber1 = commandLineScanner.nextLine();
                                        System.out.println("Enter CAR Price:");
                                        double price1 = commandLineScanner.nextInt();
                                        System.out.println("Payment STATUS! 1: FOR PAID 2: FOR NOTPAID 3: ADVANCEPAID !");

                                        int PAIDSTATUS1;

                                        PAIDSTATUS1 = commandLineScanner.nextInt();

                                        purchaseVehicle.setPtype(PurchaseVehicleType.SUV2019);

                                        switch (PAIDSTATUS1) {

                                            case 1:

                                                purchaseVehicle.setStype(PurchaseStatusType.PAID);
                                                purchaseVehicle.setPname(pname1);
                                                purchaseVehicle.setPrice(price1);
                                                purchaseVehicle.setPmodelnumber(pmodelnumber1);
                                                purchasecustomerinformation.addPurchaseVehicle(purchaseVehicle);
                                                mydatabase1.updatePurchaseCustomer(purchasecustomerinformation);

                                                System.out.println("Thank You!. Information Stored!");

                                                break;

                                            case 2:

                                                purchaseVehicle.setStype(PurchaseStatusType.NOTPAID);
                                                purchaseVehicle.setPname(pname1);
                                                purchaseVehicle.setPmodelnumber(pmodelnumber1);
                                                purchaseVehicle.setPrice(price1);
                                                purchasecustomerinformation.addPurchaseVehicle(purchaseVehicle);
                                                mydatabase1.updatePurchaseCustomer(purchasecustomerinformation);

                                                System.out.println("Thank You!. Information Stored!");

                                                break;

                                            case 3:

                                                purchaseVehicle.setStype(PurchaseStatusType.ADVANCEPAID);
                                                purchaseVehicle.setPname(pname1);
                                                purchaseVehicle.setPmodelnumber(pmodelnumber1);
                                                purchaseVehicle.setPrice(price1);
                                                purchasecustomerinformation.addPurchaseVehicle(purchaseVehicle);
                                                mydatabase1.updatePurchaseCustomer(purchasecustomerinformation);

                                                System.out.println("Thank You!. Information Stored!");
                                                break;
                                        }

                                        break;
                                }

                                break;

                            case 2:

                                System.out.println("WELCOME TO PURCHASE CUSTOMER DATA BASE!");
                                System.out.println(".........................................");

                                Map<String, Purchasecustomerinformation> purchasecustomerinformationData = mydatabase1.getPurchasecustomerinformationMap();

                                for (String key : purchasecustomerinformationData.keySet()) {
                                    Purchasecustomerinformation k = purchasecustomerinformationData.get(key);
                                    System.out.println("PURCHASE CUSTOMER INFORMATION!");
                                    System.out.println(String.format("Customer First Name: %s, Customer Last Name: %s, Customer ID: %s, Customer Mobile Number: %s", k.getPfname(), k.getPlname(), k.getPcusId(), k.getPmobilenumber()));
                                    System.out.println("VEHICLE INFORMATION!");

                                    for (PurchaseVehicle r : k.getPvehicles()) {
                                        System.out.println(String.format("Vehicle Type: %s, Vehicle Name: %s, Vehicle Model Number: %s, Vehicle Price: %s , Vehicle Payment Status: %s", r.getStype(), r.getPname(), r.getPmodelnumber(), r.getPrice(), r.getStype()));

                                    }
                                }
                                break;

                            case 3:

                                System.out.println("PAYMENT STATUS OF CUSTOMER !");

                                System.out.println(".........................................");
                                Map<String, Purchasecustomerinformation> purchasecustomerinformationData1 = mydatabase1.getPurchasecustomerinformationMap();
                                for (String key : purchasecustomerinformationData1.keySet()) {
                                    Purchasecustomerinformation k = purchasecustomerinformationData1.get(key);
                                    System.out.println("PURCHASE CUSTOMER INFORMATION!");
                                    System.out.println(String.format("Customer First Name: %s, Customer Last Name: %s, Customer ID: %s", k.getPfname(), k.getPlname(), k.getPcusId()));
                                    System.out.println("VEHICLE INFORMATION!");
                                    for (PurchaseVehicle r : k.getPvehicles()) {
                                        System.out.println(String.format(" Payment Status: %s", r.getStype()));

                                    }
                                }
                                break;

                            case 4:

                                System.out.println("UPDATE PAYMENT STATUS !");
                                System.out.println("Enter the Customer ID that you want to Update Payment Status:");
                                commandLineScanner.nextLine();
                                String CustomerIdDisplay = commandLineScanner.nextLine();

                                Purchasecustomerinformation d = mydatabase1.getPurchaseCustomerById(CustomerIdDisplay);

                                if (d != null) {

                                    System.out.println("CURRENT PAYMENT STATUS OF CUSTOMER !");
                                    System.out.println(String.format("Customer First Name: %s, Customer Last Name: %s, Customer ID: %s", d.getPfname(), d.getPlname(), d.getPcusId()));
                                    System.out.println("VEHICLE INFORMATION!");

                                    for (PurchaseVehicle c : d.getPvehicles()) {
                                        System.out.println(String.format("Vehicle Type: %s, Current Payment Status: %s", c.getPtype(), c.getStype()));

                                    }
                                }


                                System.out.println("Enter Updated Payment Status! 1: For PAID, 2: For NOTPAID, 3: For ADVANCEPAID ");
                                int paymentstatus = commandLineScanner.nextInt();

                                switch (paymentstatus) {


                                    case 1:

                                        purchaseVehicle.setStype(PurchaseStatusType.PAID);
                                        purchasecustomerinformation.addPurchaseVehicle(purchaseVehicle);
                                        mydatabase1.updatePurchaseCustomer(purchasecustomerinformation);


                                        break;
                                    case 2:

                                        purchaseVehicle.setStype(PurchaseStatusType.NOTPAID);
                                        purchasecustomerinformation.addPurchaseVehicle(purchaseVehicle);
                                        mydatabase1.updatePurchaseCustomer(purchasecustomerinformation);

                                        break;


                                    case 3:

                                        purchaseVehicle.setStype(PurchaseStatusType.ADVANCEPAID);
                                        purchasecustomerinformation.addPurchaseVehicle(purchaseVehicle);
                                        mydatabase1.updatePurchaseCustomer(purchasecustomerinformation);

                                        break;

                                }
                                System.out.println("Payment Status of Customer Updated Successfully and Information is Updated!!!!!!:");


                                break;

                            case 5:

                                System.out.println("DELETE CUSTOMER FROM DATA BASE!");
                                System.out.println("Enter Customer Id:");
                                commandLineScanner.nextLine();
                                String deleteToPurchaseCustomer =commandLineScanner.nextLine();
                                mydatabase1.deletePurchaseCustomerById(deleteToPurchaseCustomer);
                                System.out.println("CUSTOMER is deleted Successfully and Information is Updated in DATA BASE!!!!!!!!");

                                break;

                            case 6:

                                System.out.println("UPDATE VEHICLE BY MODEL NUMBER!!");
                                System.out.println("Enter the Vehicle Model Number that you want to Update:");
                                commandLineScanner.nextLine();
                                String pmodelnumber = commandLineScanner.nextLine();
                                System.out.println("Enter the new Name of Vehicle ");
                                String pname = commandLineScanner.nextLine();
                                System.out.println("Enter the new Price of Vehicle ");
                                double price = commandLineScanner.nextInt();

                               List<PurchaseVehicle> purchaseVehicles = purchasecustomerinformation.getPvehicles();


                                for(PurchaseVehicle p: purchaseVehicles) {
                                    if( pmodelnumber.equalsIgnoreCase(p.getPmodelnumber())){

                                        p.setPname(pname);
                                        p.setPrice(price);
                                        purchasecustomerinformation.updateVehicleByModelNumber(p);//update list now
                                        mydatabase1.updatePurchaseCustomer(purchasecustomerinformation);// update database
                                      }

                                }

                                System.out.println("Vehicle data is Updated Successfully and Information is Updated!!!!!!:");

                                break;


                            case 7:

                                System.out.println(" THANK YOU FOR USING APPLICATION !");

                                break;
                        }

                    } while (PURCHASECHOICE != 7);

            }
        } while (MAINCHOICE != 2);

    }
}






