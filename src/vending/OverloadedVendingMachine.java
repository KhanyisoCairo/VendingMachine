package vending;

public class OverloadedVendingMachine {
    public int chocolateQyt;
    public int softDrinksQyt;
    public int saltySnacksQyt;

    public void buy(Products products) {
        if (products instanceof SoftDrinks) {
            --softDrinksQyt;
            if (softDrinksQyt == 0) {
                return ;
            }
        } else if (products instanceof Chocolate) {
            --chocolateQyt;
            if (chocolateQyt == 0) {
                return;
            }
        } else if (products instanceof SaltySnacks) {
            --saltySnacksQyt;
            if (saltySnacksQyt == 0) {
                return;
            }
        }
    }
    public void buy(Chocolate chocolate){
        if (chocolate != null){
            --chocolateQyt;
            if (chocolateQyt == 0){
                return;
            }
        }

    }
    public void buy(SoftDrinks softDrinks){
        if (softDrinks != null){
            --softDrinksQyt;
            if (softDrinksQyt == 0){
                return;
            }
        }
    }
    public void buy(SaltySnacks saltySnacks){
        if (saltySnacks != null){
            --saltySnacksQyt;
            if (saltySnacksQyt == 0){
                return;
            }
        }
    }
      public   OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){

        this.chocolateQyt = chocolatesQty;
        this.saltySnacksQyt = saltySnacksQty;
        this.softDrinksQyt = softDrinkQty;
    }
    public void addStock(Chocolate chocolate){
        if(chocolate != null){
            chocolateQyt++;
        }
    }
    public void addStock(SoftDrinks softDrinks){
        if(softDrinks != null){
            softDrinksQyt++;
        }
    }
    public void addStock(SaltySnacks saltySnacks){
        if(saltySnacks != null){
            saltySnacksQyt++;
        }
    }

    public void addStock(Products products){
        if(products instanceof Chocolate){
            chocolateQyt++;
        }else if(products instanceof SoftDrinks){
            softDrinksQyt++;
        }else if(products instanceof SaltySnacks){
            saltySnacksQyt++;
        }
    }
    public int getStock(Chocolate chocolate){
        if (chocolate != null){
            return  chocolateQyt;
        }
        return  0;
    }
    public int getStock(SoftDrinks softDrinks){
        if (softDrinks != null){
            return  softDrinksQyt;
        }
        return  0;
    }
    public int getStock(SaltySnacks saltySnacks){
        if (saltySnacks != null){
            return  saltySnacksQyt;
        }
        return  0;
    }
    public int getStock(Products products){
        if (products != null){
            return chocolateQyt+saltySnacksQyt+softDrinksQyt;
        }
        return 0;
    }
}
