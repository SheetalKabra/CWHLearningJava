package com.company;
interface MyCamera{
    void takeSnap();
    void takeVideo();
    private void greetSomeone(String name){
        System.out.println("hi, GM "+ name);
    }
    default void greet(){
        System.out.println("hii, GM");
        greetSomeone("Sheetal");
    }
}
interface MyWifi{
    String[] networkList();
    void connectToNetwork(String network);
}
class MyCellPhone{
    public void ringingCall(){
        System.out.println("ringing call");
    }
    public void takeCall(){
        System.out.println("Taking Call");
    }
}

class SmartPhone extends MyCellPhone implements MyCamera, MyWifi{
    public void takeSnap(){
        System.out.println("taking snap");
    }
    public void takeVideo(){
        System.out.println("taking video");
    }
    public String[] networkList(){
        String[] networks = {"Amita", "Amitaa"};
        System.out.println("taking snap");
        return networks;
    }
    public void connectToNetwork(String network){
        System.out.println("Connect to network : "+network);
    }
}
public class CWH_57_DefaultMethodInterface {

    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.takeCall();
        sp.takeSnap();
        sp.takeVideo();
        String [] networkList = sp.networkList();
        for(String network: networkList){
            sp.connectToNetwork(network);
        }
        sp.greet();
        //sp.greetSomeone("hadd"); // not allowed to call private methods


        //chw_59_polymorphism in interface
        MyCellPhone mc = new SmartPhone();
        mc.ringingCall(); // can only use MycellPhone methods, this is dynamic method dispatching. + polymorphism
        //polymorphism - one smartphone can react like camrea, gps, wifi etc
    }
}
