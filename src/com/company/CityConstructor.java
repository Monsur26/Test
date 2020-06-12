package com.company;

public class CityConstructor {

    String cityname;
    int    citysize;
    double citypopulation;
    String myCityArea;

    public CityConstructor(){

        System.out.println("Sylhet city is Beautiful");
    }

    public CityConstructor(String cityname,int citysize,double citypopulation){
        this.cityname=cityname;
        this.citysize=citysize;
        this.citypopulation=citypopulation;

        System.out.println("My city is "+this.cityname +". It is approximately "+this.citysize+" kilometer"+" The population of the city is: "+this.citypopulation );



    }
    public CityConstructor(String cityname, String myCityArea, int citysize,double citypopulation){
        this.cityname=cityname;
        this.myCityArea=myCityArea;
        this.citysize=citysize;
        this.citypopulation=citypopulation;
        System.out.println("City name is:"+this.cityname+"My area is: "+this.myCityArea+"City size is "+this.citysize+"City population: "+this.citypopulation);


    }





    public static void main(String[] args) {
    CityConstructor input=new CityConstructor();
    CityConstructor newinput=new CityConstructor("Sylhet",10000,50000.00);
    CityConstructor newestInput=new CityConstructor("Sylhet",  "Shahi Eidgah",10000, 50000.00  );


    }



}
