package com.multiplatform;

public class Person {
    // Instance variabels
    private String first_Name;
    private String last_Name;
    private int age;

    public String getFirst_Name(){
        return  first_Name;
    }
    public  String getLast_Name(){
        return  last_Name;
    }
    public int  getAge(){
        return age;
    }
    public void setFirst_Name(String fname){
        this.first_Name = fname;
    }
    public void  setLast_Name(String lname){
        this.last_Name = lname;
    }
    public  void setAge(int newAge){
        if (newAge < 0 || newAge > 100){
            this.age = 0;
        } else  {
            this.age = newAge;
        }
    }
    public  boolean isTeen(){
        if (age > 12 && age < 20){
            return  true;
        }
        return  false;
    }
    public String getFullName(){
        if (first_Name.isEmpty() && last_Name.isEmpty()){
            return  "";
        }
        if (last_Name.isEmpty()){
            this.last_Name = first_Name;
            return  this.last_Name;
        }
        if (first_Name.isEmpty()){
            this.first_Name = last_Name;
            return  this.first_Name;
        }
        return  first_Name + " " + last_Name;
    }
}
