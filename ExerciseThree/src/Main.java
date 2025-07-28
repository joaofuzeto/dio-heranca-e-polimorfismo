public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("João Victor", "fuzeto@gmail.com", 12345);
        Salesman salesman = new Salesman("Regers Candido", "candido@gmail.com", 34567);
        Attendant attendant = new Attendant("Monique Candido", "monique@gmail.com", 56789, 500);

        manager.isAdmin();
        salesman.isAdmin();
        attendant.isAdmin();

        System.out.println("=====================================");

        System.out.println(attendant.getName());
        System.out.println(attendant.getEmail());
        System.out.println(attendant.getPassword());
        attendant.login("moniqeu@gmail.com", 56789);
        attendant.login("monique@gmail.com", 56785);
        attendant.login("monique@gmail.com", 56789);
        System.out.println(attendant.getAvailableCash());
        attendant.earnPayments(600);
        System.out.println(attendant.getAvailableCash());
        attendant.closeCashRegister();
        attendant.changeData("Monique Candido", "monique@gmail.com");
        attendant.changeData("Monique Candido", "monique@yahoo.com");
        attendant.changeData("Monique C", "monique@yahoo.com");
        attendant.changeData("Monique Wopereis", "monique@outlook.com");
        attendant.logoff();

        System.out.println("=====================================");

        System.out.println(salesman.getName());
        System.out.println(salesman.getEmail());
        System.out.println(salesman.getPassword());
        System.out.println(salesman.getSoldQuantity());
        salesman.makeSales(6);
        System.out.println(salesman.getSoldQuantity());

        System.out.println("=====================================");

        System.out.println(manager.getName());
        System.out.println(manager.getEmail());
        System.out.println(manager.getPassword());
        manager.generateReport();
        manager.getSoldQuantity(salesman);
    }
}
