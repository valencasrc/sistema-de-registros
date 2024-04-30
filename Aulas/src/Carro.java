public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Pessoa propietario;

    void imprimirDepreciacao(){
        double valorRevendaMeuCarro = calcularValorRevenda();
        int tempoDeUsoMeuCarro = calcularTempoDeUsoEmAnos();

        System.out.printf("Tempo de uso (anos):  %d%n", tempoDeUsoMeuCarro);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevendaMeuCarro);
    }

    double calcularIpva(){
        return calcularValorRevenda() * 0.04;
    }


    int calcularTempoDeUsoEmAnos(){
        return 2022 - anoFabricacao;
    }

    double calcularValorRevenda(){
        int tempoDeUsoEmAnos = 2022 - anoFabricacao;
        int vidaUtilEmAnos = 20;

        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);

        if (valorRevenda < 0){
            valorRevenda = 0;
        }

        System.out.printf("Calcular valor de revenda de: %s %d%n", modelo, anoFabricacao);


        return valorRevenda;
    }

}
