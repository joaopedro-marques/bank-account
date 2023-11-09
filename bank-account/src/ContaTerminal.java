import java.util.Scanner;

public class ContaTerminal {
    int number;
    String agency;
    String clientName;
    double balance;

    
    public ContaTerminal(int number, String agency, String clientName, double balance) {
        this.number = number;
        this.agency = agency;
        this.clientName = clientName;
        this.balance = balance;
    }


    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe scanner
        Scanner sc = new Scanner(System.in);
        //Exibir as mensagem
        System.out.println("Olá! Bem vindo ao JP Account "
        + "e agora vamos criar uma nova conta!");
        //Obter os valor digitados no terminal
        System.out.println("Digita o número da conta:");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Digita o número da agência:");
        String agency = sc.nextLine();
        System.out.println("Digita o seu nome:");
        String name = sc.nextLine();
        System.out.println("Digita o seu saldo:");
        double balance = sc.nextDouble();

        ContaTerminal account = new ContaTerminal(number, agency, name, balance);
        //Exibir a mensagem de conta criada
        System.out.println("Olá " + account.clientName + ", obrigado por criar uma conta  "
        + "em nosso banco, sua agência é " + account.agency + " conta " + account.number
        + " e seu saldo " +  account.balance + " já está disponível para saque.");
        sc.close();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
