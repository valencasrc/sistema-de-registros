public class Principal {

    public static void main(String[] args) {



        Pessoa eu = new Pessoa();
        eu.nome = "Lucas Valença";
        eu.cpf = "111.111.111-11";
        eu.anoNascimento = 1995;

        Pessoa voce = new Pessoa();
        voce.nome = "Louyse Camille";
        voce.cpf = "222.222.222-22";
        voce.anoNascimento = 1998;

        Pessoa cliente = new Pessoa();
        cliente.nome = "";
        cliente.cpf = "";
        cliente.anoNascimento = 2000; //O certo seria usar Interger como variável da classe Carro

        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "HONDA";
        meuCarro.modelo = "Civic";
        meuCarro.precoCompra = 120000;
        meuCarro.propietario = eu;

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2012;
        seuCarro.cor = "Vermelho";
        seuCarro.fabricante = "Volkswagen";
        seuCarro.modelo = "Golf GTI";
        seuCarro.precoCompra = 100000;
        seuCarro.propietario = voce;

        Carro vendido = new Carro();
        vendido.anoFabricacao = 2024;
        vendido.cor = "";
        vendido.fabricante = "";
        vendido.modelo = "";
        vendido.precoCompra = 160.000;
        vendido.propietario = cliente;

        meuCarro.calcularValorRevenda();
        seuCarro.calcularValorRevenda();

        meuCarro.imprimirDepreciacao();

      /*  double valorRevendaMeuCarro = meuCarro.calcularValorRevenda();
        int tempoDeUsoMeuCarro = meuCarro.calcularTempoDeUsoEmAnos();

        System.out.printf("Tempo de uso (anos):  %d%n", tempoDeUsoMeuCarro);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevendaMeuCarro);*/

        System.out.println(meuCarro.calcularValorRevenda());

/*
        System.out.println("Meu carro:");
        System.out.printf("------");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
        System.out.printf("Proprietário: %s%n", meuCarro.propietario.nome);

        System.out.println();

        System.out.println("Seu carro:");
        System.out.printf("------");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
        System.out.printf("Proprietário: %s%n", seuCarro.propietario.nome);
*/

    }

}


