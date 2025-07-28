public non-sealed class Manager extends Users {

    public Manager(String name, String email, int password) {
        super(name, email, password, true);
    }

    public void getSoldQuantity(Salesman salesman) {
        System.out.println("Consultando vendas do vendedor: " + salesman.getName());
        System.out.println("Total de vendas: " + salesman.getSoldQuantity());
    }

    public void generateReport(){
        System.out.println("Relatório financeiro gerado com sucesso!");
    }
}
