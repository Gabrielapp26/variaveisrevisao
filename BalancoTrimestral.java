public class BalnacoTrimestral{
    public static void main (String args[]){
        int gastosJaneiro = 15000.00;
        int gastosFevereiro=23000.00;
        int gastosMarco = 17000.00;
        int gastoTrimestral = gastosJaneiro + gastosFevereiro + gastosMarco;
        int mediaTrimestral = gastoTrimestral/3;

        System.out.println("O gasto Trimestral é de R$ "+gastoTrimestral);
        System.out.println("A média Trimestral foi de R$ "+mediaTrimestral);
    }
}