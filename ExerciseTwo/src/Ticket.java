public abstract class Ticket {

    protected double price;
    protected String title;
    protected String language;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    abstract String realPrice();

    public String dubbedOrSubtittled(){
        if(this.language.equals("PT")){
            return "O filme é dublado";
        } else{
            return "O filme é legendado, pois seu idioma original é " + language;
        }
    }
}
