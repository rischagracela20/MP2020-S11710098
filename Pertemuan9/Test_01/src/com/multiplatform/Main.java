package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        //
        System.out.println("Barking_Dog :");
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        //
        System.out.println("Playing_Cat :");
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));

    }
    //1.Barking Dog
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            if ((hourOfDay < 8 && hourOfDay >= 0) || (hourOfDay > 22 && hourOfDay < 24)) {
                System.out.println("Time to Wake up, dog is barking");
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    //2.Playing cat
        public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer){
            if (temperature >= 25 && temperature <= 45){
                return true;
            }
            else{
                return false;
            }
        }
        else
        if(temperature >= 25 && temperature <= 35){
            return true;
        }
        else {
            return false;
        }
    }

}

