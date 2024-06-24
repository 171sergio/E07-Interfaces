public class Main {

    public static void main(String[] args) {
        Client pessoa1 = new ClientIndividual("Rua Santa Quitéria 388", "Sergio", 16, 'm', "12345678910");
        Client empresa1 = new ClientJP("Rua Santa Quitéria 388", "Serralheria Marinheiro", "Serralheria", 1, "12345678910");
        Client pessoa2 = new ClientIndividual("Rua Santa Quitéria 388", "Sergio", 16, 'm', "12345678910");
        Client empresa2 = new ClientJP("Rua Santa Quitéria 388", "Serralheria Marinheiro", "Serralheria", 1, "12345678910");
        Account contapj = new AccountCurrent(empresa1, 1000, 1, 10000, "Banco do Brasil");
        Account contapf = new AccountCurrent(pessoa1, 1000, 1, 10000, "Banco do Brasil");
        Account contapoup = new AccountSavings(pessoa1, 1000, 1, 10000, "Banco do Brasil");
        Account contauni = new AccountUniversity(pessoa1, 1000, 1, 10000, "Banco do Brasil");

        System.out.println("ContaPJ");
        contapj.deposit(10000);
        contapj.withdraw(10);
        contapj.withdraw(1);
        contapj.withdraw(900);
        contapj.printFeeStatement();

        System.out.println("ContaPF");
        contapf.deposit(10000);
        contapf.withdraw(10);
        contapf.withdraw(1);
        contapf.withdraw(900);
        contapf.printFeeStatement();

        System.out.println("Conta Poupança");
        contapoup.deposit(10000);
        contapoup.withdraw(10);
        contapoup.withdraw(1);
        contapoup.withdraw(900);
        contapoup.printFeeStatement();

        System.out.println("Conta Universitária");
        contauni.deposit(10000);
        contauni.withdraw(10);
        contauni.withdraw(1);
        contauni.withdraw(900);
        contauni.printFeeStatement();

    }
}
