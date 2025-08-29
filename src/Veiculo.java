class Veiculo {
    String placa; //só definindo variavel
    int horas; //só definindo variavel
    double precoHora = 5.0; //só definindo variavel, porem aqui defino o valor fixo

    // isso constroi a classe, sempre que um 'Veiculo' se criar, ele vai ser chamado
    Veiculo(String placa, int horas) {
        this.placa = placa; //aqui ele vai atribuir o que o usuario digitou em placa, e atribuir ao objeto placa
        this.horas = horas; //aqui ele vai atribuir o que o usuario digitou em horas, e atribuir ao objeto horas

    }

    double calcularValor() {
        return horas * precoHora; //aqui é um metodo publico pra calcular o valor só
    }

    //Aqui é só uma exibição dos valores simples, ele é publico e não retorna nada, por isso é void == vazio, ele só mostra informações
    void mostrarInfo() { 
        System.out.println("Placa: " + placa);
        System.out.println("Horas estacionado: " + horas);
        System.out.println("Valor a pagar: R$ " + calcularValor());
    }
}