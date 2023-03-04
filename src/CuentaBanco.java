public class CuentaBanco {
    //Datos privados
    //Atributos de una cuenta bancaria de una tarjeta de debito
    private String propietario;
    private double saldo;

    //Para crear una cuenta de Banco ocupamos un Constructor
    //El constructor va a requerir:
    // - Datos del propietario de la cuenta
    // - Y un saldo inicial
    public CuentaBanco(String propietario, double saldoInicial){
        this.propietario = propietario;
        this.saldo = Math.max(saldoInicial, 0);
        System.out.println("Bienvenido  " + propietario);
    }

    //Metodo para retirar dinero
    public double retiro(double cantidad){
        System.out.println("----------MOVIMIENTO RETIRO----------");
        System.out.println("Saldo actual " + saldo);
        System.out.println("Cantidad a retirar: " + cantidad);
           if (cantidad<= this.saldo){
            this.saldo = this.saldo - cantidad;
               System.out.println("Saldo actual: " + saldo);
            return cantidad;
           }
        System.out.println("Saldo insuficiente");
        return 0;
    }


//Metodo - Representar un deposito
public double deposito(double cantidad){
        System.out.println("----------MOVIMIENTO DEPOSITO----------");
        System.out.println("Saldo actual " + saldo);
        System.out.println("Cantidad a depositar : " + cantidad);
        this.saldo = this.saldo + cantidad;
        System.out.println("Saldo actual: " + saldo);
        return cantidad;
    }

}
