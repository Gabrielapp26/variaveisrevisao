public class BalancoTrimestral{
    public static void main (String args[]){
        double gastosJaneiro = 15000.00;
        double gastosFevereiro=23000.00;
        double gastosMarco = 17000.00;
        double gastoTrimestral = gastosJaneiro + gastosFevereiro + gastosMarco;
        double mediaTrimestral = gastoTrimestral/3;

        System.out.println("O gasto Trimestral é de R$ "+gastoTrimestral);
        System.out.println("A média Trimestral foi de R$ "+mediaTrimestral);
    }
}