public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(No atual, int valor) {
        if (atual == null){
            return false;
        }
        if (atual.valor == valor){
            return true;
        }
        return valor < atual.valor // percorre à esquerda ou direita
                ? buscarRecursivo(atual.esquerda, valor)
                : buscarRecursivo(atual.direita, valor);
