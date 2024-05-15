package com.pluralsight;

public class Reservation {
    private String roomType;
    //king (139.00) or double (129.00)
    private double price;
    private int numberOfNights;
    private boolean isWeekend;


    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        if(roomType.equals("king")){
            this.price = 139.00;
        }
        else if(roomType.equals("double")){
            this.price = 124.00;
        }
    }


    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getPrice() {
        return price;
    }

    public double getReservationTotal(){
        double totalPrice = price * numberOfNights;

        if(isWeekend){
            totalPrice = totalPrice * 1.1;
        }
        return totalPrice;
    }
}