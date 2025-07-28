public non-sealed class Attendant extends Users{

    private double availableCash;

    public Attendant(String name, String email, int password, double availableCash) {
        super(name, email, password, false);
        this.availableCash = availableCash;
    }

    public String getAvailableCash() {
        return "Seu valor em caixa é de R$" + availableCash;
    }

    public void setAvailableCash(double availableCash) {
        this.availableCash = availableCash;
    }

    public void earnPayments(double payment){
        if(payment > 0){
            this.availableCash += payment;
            System.out.println("Pagamento de R$" + payment + " recebido. Total em caixa: R$" + this.availableCash);
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void closeCashRegister(){
        System.out.println("O valor total em caixa ao final desse dia é de R$" + this.availableCash + ".");
    }

}
