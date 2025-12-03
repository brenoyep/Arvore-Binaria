private No removerRecursivo(No atual, int valor) {
        if (atual == null)
            return null;

        if (valor < atual.valor) {
            atual.esquerda = removerRecursivo(atual.esquerda, valor);

        } else if (valor > atual.valor) {
            atual.direita = removerRecursivo(atual.direita, valor);

        } else {
            // Caso 1
            if (atual.esquerda == null && atual.direita == null)
                return null;

            // Caso 2
            else if (atual.esquerda == null)
                return atual.direita;
            else if (atual.direita == null)
                return atual.esquerda;

            // Caso 3
            atual.valor = menorValor(atual.direita);
            atual.direita = removerRecursivo(atual.direita, atual.valor);
        }
        return atual;
    }

    private int menorValor(No no) {
        int menor = no.valor;
        while (no.esquerda != null) {
            menor = no.esquerda.valor;
            no = no.esquerda;
        }
        return menor;
