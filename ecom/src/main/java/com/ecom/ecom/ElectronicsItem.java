package com.ecom.ecom;

    public class ElectronicsItem implements Product{

        private String pName;
        private String pType;

        
        public ElectronicsItem(String pName, String pType){
            this.pName = pName;
            this.pType = pType;
        }


        public void productDetails(){
           
            System.out.println("Name of electronics item is " +this.pName);
        }
        public void productType(){
            System.out.println("Type of electronics item is " +this.pType);
            System.out.println(" ----------------- ");
        }
    }