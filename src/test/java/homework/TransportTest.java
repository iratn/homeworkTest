package homework;


import org.junit.Test;

import static org.junit.Assert.*;

public class TransportTest {
    Vehicle Vehicle = new Vehicle(30, 500, 750);
    Offroad offroad = new Offroad(30, 500, 600);
    Truck truck = new Truck(20, 40, 500, 10);

    @Test
    public void canGetPassengers(){

        assertEquals("Can we get number of passengers", 30, Vehicle.getPassengers());
    }

    @Test
    public void canSetPassengers(){

        assertEquals("Can we set number of passengers", 30, Vehicle.getPassengers());
    }


    @Test
    public void canGetCargocap(){

        assertEquals("Can we get number of cargocap", 10, truck.getCargocap());
    }
    @Test
    public void canSetGroundClearance(){
        offroad.setGroundClearance(47);
        assertEquals("Can we set number of ground clearance", 47, offroad.getGroundClearance());
    }


}
