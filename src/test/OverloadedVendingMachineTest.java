package test;

import org.junit.jupiter.api.Test;

import vending.*;

import static org.junit.Assert.assertEquals;


    class OverloadedVendingMachineTest {
    @Test
    void ShouldAddStock(){
    OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(6,5,2);
    Chocolate chocolate = new Chocolate();
    SoftDrinks softDrinks = new SoftDrinks();
    SaltySnacks saltySnacks = new SaltySnacks();

     overloadedVendingMachine.addStock(chocolate);
     overloadedVendingMachine.addStock(softDrinks);
     overloadedVendingMachine.addStock(saltySnacks);

    assertEquals(overloadedVendingMachine.getStock(chocolate),3);
    assertEquals(overloadedVendingMachine.getStock(softDrinks),7);
    assertEquals(overloadedVendingMachine.getStock(saltySnacks),6);
     }

        @Test
        void ShouldBuyStock(){
            OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(6,5,10);
            Chocolate chocolate = new Chocolate();
            SoftDrinks softDrinks = new SoftDrinks();
            SaltySnacks saltySnacks = new SaltySnacks();

            overloadedVendingMachine.buy(chocolate);
            overloadedVendingMachine.buy(chocolate);
            overloadedVendingMachine.buy(softDrinks);
            overloadedVendingMachine.buy(saltySnacks);
            assertEquals(overloadedVendingMachine.getStock(chocolate),8);
            assertEquals(overloadedVendingMachine.getStock(softDrinks),5);
            assertEquals(overloadedVendingMachine.getStock(saltySnacks),4);
        }
    }