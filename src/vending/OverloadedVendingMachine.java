package vending;

public class OverloadedVendingMachine {
    public int ChocolateQyt;
    public int SoftDrinksQyt;
    public int SaltySnacksQyt;

    public void buy(Products products) {
        if (products instanceof SoftDrinks) {
            --SoftDrinksQyt;
            if (SoftDrinksQyt == 0) {
                return ;
            }
        } else if (products instanceof Chocolate) {
            --ChocolateQyt;
            if (ChocolateQyt == 0) {
                return;
            }
        } else if (products instanceof SaltySnacks) {
            --SaltySnacksQyt;
            if (SaltySnacksQyt == 0) {
                return;
            }
        }
    }
    public void buy(Chocolate chocolate){
        if (chocolate != null){
            --ChocolateQyt;
            if (ChocolateQyt == 0){
                return;
            }
        }

    }
    public void buy(SoftDrinks softDrinks){
        if (softDrinks != null){
            --SoftDrinksQyt;
            if (SoftDrinksQyt == 0){
                return;
            }
        }
    }
    public void buy(SaltySnacks saltySnacks){
        if (saltySnacks != null){
            --SaltySnacksQyt;
            if (SaltySnacksQyt == 0){
                return;
            }
        }
    }

      public   OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){

        this.ChocolateQyt = chocolatesQty;
        this.SaltySnacksQyt = saltySnacksQty;
        this.SoftDrinksQyt = softDrinkQty;
    }
    public void addStock(Chocolate chocolate){
        if(chocolate != null){
            ChocolateQyt++;
        }
    }
    public void addStock(SoftDrinks softDrinks){
        if(softDrinks != null){
            SoftDrinksQyt++;
        }
    }
    public void addStock(SaltySnacks saltySnacks){
        if(saltySnacks != null){
            SaltySnacksQyt++;
        }
    }

    public void addStock(Products products){
        if(products instanceof Chocolate){
            ChocolateQyt++;
        }else if(products instanceof SoftDrinks){
            SoftDrinksQyt++;
        }else if(products instanceof SaltySnacks){
            SaltySnacksQyt++;
        }
    }
    public int getStock(Chocolate chocolate){
        if (chocolate != null){
            return  ChocolateQyt;
        }
        return  0;
    }
    public int getStock(SoftDrinks softDrinks){
        if (softDrinks != null){
            return  SoftDrinksQyt;
        }
        return  0;
    }
    public int getStock(SaltySnacks saltySnacks){
        if (saltySnacks != null){
            return  SaltySnacksQyt;
        }
        return  0;
    }
    public int getStock(Products products){
        if(products instanceof Chocolate){
            return ChocolateQyt;
        }
        else if (products instanceof SoftDrinks){
            return SoftDrinksQyt;
        }
        else if (products instanceof SaltySnacks){
            return SaltySnacksQyt;
        }
        else {
            return SaltySnacksQyt+SaltySnacksQyt+ChocolateQyt;
        }
    }
}
