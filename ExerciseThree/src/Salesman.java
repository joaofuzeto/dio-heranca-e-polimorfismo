public non-sealed class Salesman extends Users{

    private int soldQuantity = 0;

    public Salesman(String name, String email, int password) {
        super(name, email, password, false);
    }

    public String getSoldQuantity() {
        return "A quantidade de vendas total é de " + soldQuantity + " vendas";
    }

    public void setSoldQuantity(int soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public void makeSales(int quantitySoldNow){
        if(quantitySoldNow >= 0){
            this.soldQuantity = this.soldQuantity + quantitySoldNow;
        }
    }
}
