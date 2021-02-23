class ProgFuncional {
    public static void main(String[] args) {
        int[] valores={10,20,30,40,50,60,70,80,90,100};
        int dobro[] = new int[10];
        for(int i = 0 ; i<valores.length ; i++){
            dobro[i] = valores[i]*2;
            System.out.print(dobro[i] + " | ");
        }
    }
}

// Exemplo 2: em uma lista de valores inteiros, retornar o dobro de cada valor na mesma posição.