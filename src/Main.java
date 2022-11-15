public class Main {
    public static void main(String[] args) {
        Cliente ederson = new Cliente();
        ederson.setNome("Ederson");
        Conta cc = new ContaCorrente(ederson);
        cc.depositar(250);
        Conta poupanca = new ContaPoupanca(ederson);
        cc.transferir(150,poupanca);
        cc.imprimirInfosComuns();
        poupanca.imprimirInfosComuns();
    }
}