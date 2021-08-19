public class BalancoTrimestral{
    //Crie uma classe chamada BalancoTrimestral com um bloco main
    public static void main (String args[]){
        /*Dentro do main (o miolo do programa), declare uma variável inteira chamada gastosJaneiro e inicialize-a com 15000
        Crie também as variáveis gastosFevereiro e gastosMarco , inicializando-as com 23000 e 17000, respectivamente, utilize uma linha para cada declaração
        */
        double gastosJaneiro = 15000.00;
        double gastosFevereiro=23000.00;
        double gastosMarco = 17000.00;
        //Crie uma variável chamada gastosTrimestre e inicialize-a com a soma das outras 3 variáveis
        double gastoTrimestral = gastosJaneiro + gastosFevereiro + gastosMarco;
        double mediaTrimestral = gastoTrimestral/3;

        //Imprima a variável gastosTrimestre
        System.out.println("O gasto Trimestral é de R$ "+gastoTrimestral);
        System.out.println("A média Trimestral foi de R$ "+mediaTrimestral);
        //Adicione código na classe anterior para imprimir a média mensal de gasto, criando uma variável mediaMensal junto com uma mensagem.
    }
}