public class HalfPrice extends Ticket{

    private int age;

    @Override
    public String realPrice() {
        double priceUpdated = this.age < 18 ? this.price * 0.5 : this.price;
        return "O valor do bilhete é de R$" + priceUpdated;
    }

    public String getAge() {
        return "Sua idade é de " + age + " anos";
    }

    public void setAge(int age) {
        this.age = age;
    }
}
