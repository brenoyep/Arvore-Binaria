public void emOrdem(No atual) {
        if (atual != null) {
            emOrdem(atual.esquerda);                // visita a subárvore esquerda
            System.out.print(atual.valor + " "); // visita o nó atual
            emOrdem(atual.direita);           // visita a subárvore direita
        }
    }

    // Percurso PRÉ-ORDEM (nó, esquerda, direita)
    public void preOrdem(No no) {
        if (no != null) {
            System.out.print(no.valor + " "); // visita o nó atual
            preOrdem(no.esquerda);           // visita a esquerda
            preOrdem(no.direita);            // visita a direita
        }
    }

    // Percurso PÓS-ORDEM (esquerda, direita, nó)
    public void posOrdem(No no) {
        if (no != null) {
            posOrdem(no.esquerda);           // visita esquerda
            posOrdem(no.direita);            // visita direita
            System.out.print(no.valor + " "); // visita o nó por último
        }
    }
