public class Main {
    public static void main(String[] args) {

        //Instancia de cuenta de banco
        CuentaBanco cuentaBanco = new CuentaBanco("Luis Lopez", 1000);
        //ACTIVIDAD:
        //Retirar 500

        //Depositar 5,000

        //Retirar  2,000

        //Imprime el nombre del propietario de la cuenta


        //Imprime el saldo actual del propietario
        cuentaBanco.retiro(1000); // Saldo / Saldo insuficiente >1000
        cuentaBanco.deposito(5000);
        cuentaBanco.retiro(2000);
    }
}









