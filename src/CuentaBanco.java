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
    }

    //Metodo para retirar dinero
    public double retiro(double cantidad){
        if (cantidad<= this.saldo){
            this.saldo = this.saldo - cantidad;
            return cantidad;
        }
        return 0;
    }


    //Metodo - Representar un deposito

}
