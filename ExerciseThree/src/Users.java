public sealed class Users permits Manager, Attendant, Salesman{

    protected String name;
    protected String email;
    protected int password;
    protected boolean admin;

    public Users(String name, String email, int password, boolean admin) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.admin = admin;
    }

    public String getName() {
        return "O seu nome é " + name;
    }

    public void setName(String nome) {
        this.name = nome;
    }

    public String getEmail() {
        return "Seu e-mail é: " + email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return "Senha: " + password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void login (String email, int password){
        if (this.email.equals(email) && this.password == password){
            System.out.println(this.name + ", você está logado(a)");
        } else {
            System.out.println(this.name + ", você não pode logar, email ou senha incorretos.");
        }
    }

    public void logoff(){
        System.out.println("Você está deslogando da sua conta agora.");
    }

    public void changeData(String newName, String newEmail) {
        if (!this.name.equals(newName) && !this.email.equals(newEmail)) {
            this.name = newName;
            this.email = newEmail;
            System.out.println("Dados alterados com sucesso.");
        } else if (!this.name.equals(newName)) {
            this.name = newName;
            System.out.println("Nome alterado com sucesso.");
        } else if (!this.email.equals(newEmail)) {
            this.email = newEmail;
            System.out.println("E-mail alterado com sucesso.");
        } else {
            System.out.println("Os dados não foram alterados porque são os mesmos de antes.");
        }
    }

    public void changePassword(int newPassword){
        if (this.password != newPassword){
            this.password = newPassword;
        }
    }

    public void isAdmin(){
        if(this.admin){
            System.out.println(this.name + ", você tem licença de administrador");
        } else{
            System.out.println(this.name + ", você não tem acesso de administrador");
        }
    }

}
