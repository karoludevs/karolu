package com.company;

/**
 * Created by sam on 23/04/16.
 */
public class Room {


    private boolean doorOpen = false;
    private int table;
    private int chair;
    private int bed;
    private int carpet;
    private int light;
    private Closet drawer;

    public boolean isDoorOpen() {
        if (doorOpen){
            System.out.println("esta abierta");
        }else{
            System.out.println("esta cerrada");
        }
        return doorOpen;
    }

    public void setDoorOpen(boolean doorOpen) {
        this.doorOpen = doorOpen;
    }

    public boolean openDoor(boolean doorOpen){

        if (doorOpen){

            System.out.println("La puerta esta abierta ahora");
        }else{
            doorOpen = true;
        }
        return doorOpen;
    }
}
