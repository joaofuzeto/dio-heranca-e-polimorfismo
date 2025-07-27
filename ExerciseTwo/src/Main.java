public class Main {
    public static void main(String[] args) {

        HalfPrice ticket = new HalfPrice();
        ticket.setTitle("Os mamonas Assassinas");
        ticket.setLanguage("EN");
        ticket.setPrice(20);
        ticket.setAge(17);

        System.out.println(ticket.getTitle());
        System.out.println(ticket.getAge());
        System.out.println(ticket.getPrice());
        System.out.println(ticket.realPrice());
        System.out.println(ticket.dubbedOrSubtittled());

        System.out.println("=====================================");

        FamilyTicket familyTicket = new FamilyTicket();
        familyTicket.setTitle("Os Carros");
        familyTicket.setLanguage("EN");
        familyTicket.setPrice(15);
        familyTicket.setNumberOfPeople(4);

        System.out.println(familyTicket.getTitle());
        System.out.println(familyTicket.getNumberOfPeople());
        System.out.println(familyTicket.getPrice());
        System.out.println(familyTicket.realPrice());
        System.out.println(familyTicket.dubbedOrSubtittled());
    }

}
