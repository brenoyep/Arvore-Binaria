public int altura(No no) {
        if (no == null)
            return -1;
        int esquerda = altura(no.esquerda);
        int direita = altura(no.direita);
        return Math.max(esquerda, direita) + 1;
    }

    // Calcula a profundidade de um valor (distância até a raiz)
    public int profundidade(int valor) {
        return profundidadeRec(raiz, valor, 0);
    }

    private int profundidadeRec(No no, int valor, int nivel) {
        if (no == null)
            return -1;
        if (no.valor == valor)
            return nivel;
        if (valor < no.valor)
            return profundidadeRec(no.esquerda, valor, nivel + 1);
        else
            return profundidadeRec(no.direita, valor, nivel + 1);
    }
    public static void main(String[] args) {
        ArvoreBinaria2 arvore = new ArvoreBinaria2();

        // Inserindo vários valores
        int[] valores = {50, 30, 70, 20, 40, 60, 80};
        for (int v : valores) arvore.inserir(v);

        System.out.print("Em ordem: ");
        arvore.emOrdem(arvore.raiz);
        System.out.println();

        System.out.print("Pré-ordem: ");
        arvore.preOrdem(arvore.raiz);
        System.out.println();

        System.out.print("Pós-ordem: ");
        arvore.posOrdem(arvore.raiz);
        System.out.println();

        System.out.println("Buscar 40: " + arvore.buscar(40));

        System.out.println("Altura: " + arvore.altura(arvore.raiz));

        System.out.println("Profundidade de 60: " + arvore.profundidade(60));

        arvore.remover(30);
        System.out.print("Após remover 30: ");
        arvore.emOrdem(arvore.raiz);
    }
}
