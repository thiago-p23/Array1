import static java.lang.IO.*;
import java.util.ArrayList;

void main() {

    ArrayList<String> produtos = new ArrayList<>();

    int opcao;

    while (true) {

        println("\n===== LISTA DE COMPRAS =====");
        println("1 - Adicionar produto");
        println("2 - Pesquisar produto");
        println("3 - Remover produto");
        println("4 - Alterar produto");
        println("5 - Listar produtos");
        println("6 - Sair");

        opcao = Integer.parseInt(readln("Escolha uma opção: "));

        switch (opcao) {
            case 1:
                while (true) {
                    String produto = readln("Digite um produto (ou 'sair'): ");

                    if (produto.equals("sair")) {
                        break;
                    }
                    produtos.add(produto);
                    println("Produto adicionado com sucesso!");
                }
                break;

            case 2:
                String pesquisa = readln("Digite o produto para pesquisar: ");
                if (produtos.contains(pesquisa)) {
                    println("Produto encontrado: " + pesquisa);
                } else {
                    println("Produto não encontrado");
                }
                break;

            case 3:
                String remover = readln("Digite o produto para remover: ");
                if (produtos.contains(remover)) {
                    produtos.remove(remover);
                    println("Produto encontrado e removido!");
                } else {
                    println("Produto não encontrado");
                }
                break;

            case 4:
                String antigo = readln("Digite o produto para alterar: ");
                if (produtos.contains(antigo)) {
                    String novo = readln("Digite o novo nome do produto: ");

                    int posicao = produtos.indexOf(antigo);
                    produtos.set(posicao, novo);
                    println("Produto alterado com sucesso!");
                } else {
                    println("Produto não encontrado");
                }
                break;

            case 5:
                if (produtos.isEmpty()) {
                    println("Lista vazia");
                } else {
                    println("\n===== PRODUTOS CADASTRADOS =====");
                    for (int i = 0; i < produtos.size(); i++) {
                        println((i + 1) + " - " + produtos.get(i));
                    }
                }

                break;

            case 6:
                println("Programa encerrado com sucesso!");
                return;

            default:
                println("Opção inválida!");
        }
    }
}