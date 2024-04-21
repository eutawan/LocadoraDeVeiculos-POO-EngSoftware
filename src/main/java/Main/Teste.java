package Main;

import domain.Carro;
import domain.Locatario;
import enums.Cor;
import service.Autenticacao;
import service.Locacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Teste {
    public static void main(String[] args) {
        var autenticacao = new Autenticacao();
        var locatario = new Locatario();

        autenticacao.setLogin("lulu");
        autenticacao.setSenha("aicanalha");

        locatario.setEmail("chamanabota@gmail.com");
        locatario.setCpf("345.332.435-55");
        locatario.setAutenticacao(autenticacao);
        locatario.setNome("Teste");

        var carro = new Carro();
        carro.setMarca("BMW");
        carro.setCor(Cor.AMARELO);
        carro.setAno(2020);
        carro.setPlaca("HTTP-2233");
        carro.setModelo("BMW M5");

        var locacao = new Locacao();
        locacao.setLocatario(locatario);
        locacao.setVeiculo(carro);
        locacao.setValorDiaria(2000.0);
        locacao.setDataLocacao(LocalDate.of(2024, 7, 10));
        locacao.setDataDevolucao(LocalDate.of(2024, 7, 30));

        var valorTotalDaLocacao = locacao.locar(locacao.getLocatario(), locacao.getVeiculo(), locacao.getDataLocacao(),
                locacao.getDataDevolucao(), locacao.getValorDiaria());

        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Relatório da locação: ");
        System.out.println("-------------------------------------");
        System.out.println("Veículo: " + locacao.getVeiculo().getModelo());
        System.out.println("Marca: " + locacao.getVeiculo().getMarca());
        System.out.println("Data de locação: " + locacao.getDataLocacao().format(formatter));
        System.out.println("Data de devolução: " + locacao.getDataDevolucao().format(formatter));
        System.out.println("-------------------------------------");
        System.out.println("Valor total: " + valorTotalDaLocacao);

    }
}
