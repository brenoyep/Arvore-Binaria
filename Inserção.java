public class ArvoreBinaria2 {

    class No {
        int valor;
        No esquerda, direita;

        No(int valor) {
            this.valor = valor;
            esquerda = direita = null;
        }
    }

    No raiz;

    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private No inserirRecursivo(No atual, int valor) {
        if (atual == null) {
            return new No(valor);
        }

        if (valor < atual.valor)
            atual.esquerda = inserirRecursivo(atual.esquerda, valor);

        else if (valor > atual.valor)//senao
            atual.direita = inserirRecursivo(atual.direita, valor);

        return atual;
    }
