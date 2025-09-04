class Veiculo {
    String placa; //só definindo variavel
    String cor;
    int horas; //só definindo variavel
    double precoHora; //só definindo variavel, porem aqui defino o valor fixo

    // isso constroi a classe, sempre que um 'Veiculo' se criar, ele vai ser chamado
    Veiculo(String placa, int horas, double preco, String cor) {
        this.placa = placa; //aqui ele vai atribuir o que o usuario digitou em placa, e atribuir ao objeto placa
        this.cor = cor;
        this.horas = horas; //aqui ele vai atribuir o que o usuario digitou em horas, e atribuir ao objeto horas
        this.precoHora = preco;
    }

    // O MÉTODO calcularValor() FOI REMOVIDO DAQUI! - agora quem faz isso é a classe Ticket.java


    //Aqui é só uma exibição dos valores simples, ele é publico e não retorna nada, por isso é void == vazio, ele só mostra informações
    void mostrarInfo() { 
        System.out.println(); //pula linha
        // desenho só pra ficar bonitinho
        System.out.println("+--------------------------------+");
        System.out.println("|      TICKET DE PAGAMENTO       |");
        System.out.println("+--------------------------------+");
        System.out.println("Placa: " + placa);
        System.out.println("cor: " + cor);
        System.out.println("Horas estacionado: " + horas);

        // Aqui chamammos o metodo da NOVA CLASSE TICKET
        // A palavra 'this' significa que o próprio objeto Veiculo está se passando como informação para o cálculo.
        System.out.println("Valor a pagar: R$ " + Ticket.calculaPagamento(this));
        System.out.println("+--------------------------------+");
        System.out.println(); //pula linha de novo rs
    }
}