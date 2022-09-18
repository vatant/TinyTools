package com.shopee.tinytools.model;

public enum Customenum {

    //ranksystem
    Labs("Labs"),
    Garena("Garena"),
    Shopee("Shopee"),
    Finance("Finance"),
    //rank
    SeniorEngineer("Senior Engineer"),
    SeniorProductManagementAssociateIII("Senior Product Management Associate III"),
    SeniorDirector("Senior Director"),
    Manager("Manager"),
    //status
    Inactive("Inactive"),
    Active("Active"),
    //function
    functionGA("G&A"),
    functionCOR("COR"),
    functionBL("Banco Laguna"),
    //department
    department1("D07 - Regional Team / Business Development"),
    department2("D02 - Marketing and PRD02 - Marketing and PR"),
    //BusinessUnit
    businessUnit1("E-Commerce - Edit"),
    businessUnit2("Mobile Game"),
    businessUnit3("NewBULN1"),
    //product
    product1("Others - Shared Common Expenses (OT_COM)"),
    product2("PC Game - League of Legends (PC_LOL)"),
    product3("Foody - Foody (FD_FDY)"),
    //Legal Entity
    legalentity1("Shopee Mobile Malaysia Sdn Bhd"),
    legalentity2("Garena Online Private Limited"),
    legalentity3("Garena Online (Thailand) Co., Ltd.");


    private String name;
    private Customenum(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
