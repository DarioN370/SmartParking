public class Ticket {
    // Este método é 'static' porque ele não precisa de informações de um objeto Ticket.
    // Ele é como uma calculadora: você entrega os dados (o objeto 'veiculo') e ele te devolve o resultado.
    // Não precisamos criar um 'new Ticket()' para usá-lo.
    public static double calculaPagamento(Veiculo veiculo) {
        // a conta que tava la na class Veiculo.java, agora esta aqui
        return veiculo.horas * veiculo.precoHora;
    }
}
