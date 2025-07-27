public class FamilyTicket extends Ticket{

    private int numberOfPeople;
    private final double discount = 0.05;

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public String realPrice() {
        double priceForFamily = this.price * this.numberOfPeople;
        double priceOfDiscount = priceForFamily * discount;
        double priceWithDiscount = priceForFamily - priceOfDiscount;
        if(this.numberOfPeople > 3){
            return "O valor total é de R$" + priceForFamily + ", porém por serem um grupo de mais de 3 pessoas, demos um desconto de R$" +
                    priceOfDiscount + " então o valor a ser pago é de R$" + priceWithDiscount + ".";
        } else{
            return "O valor total é de R$" + priceForFamily + ".";
        }
    }
}
