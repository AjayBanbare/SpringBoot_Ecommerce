package com.ecom.ecom;

public class Clothes implements Product{
        private String pName;
        private String pType;

            public void setpName(String name){
                this.pName = name;
            }
            public void setpType(String type){
                this.pType = type;
            }


         public void productDetails(){
            System.out.println("Name of Clothes is " +this.pName);
        }
        public void productType(){
            System.out.println("Type of Clothes is " +this.pType);
            System.out.println(" ----------------- ");
    }
}
