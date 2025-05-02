package src;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
?
 */

/**
 *
 * @author rodri
 */
public class Main{
    public static void main (String[] args){    
    Clock brlclock = new BRLClock();
    brlclock.setSecond(0);
    brlclock.setMinute(0);
    brlclock.setHour(25);
   
    System.out.println(brlclock.getTime());
    
    System.out.println(new USClock().convert(brlclock).getTime());
}
}