package hackerRank30Days;

public class Dia10 {

    public static void main(String[] args) {
        toBinario(439);
        toBinario(223);
        toBinario(22);
        toBinario(2268);
    }

    public static void toBinario (int j) {
        String binario = Integer.toBinaryString(j);
        int maior = Integer.MIN_VALUE;
        int seq = 0;
        for(int i = 0; i < binario.length(); i++) {
            char n = binario.charAt(i);

            if(n == '1') {
                seq++;
            }
            if(n == '0'){
                if(seq > maior) {
                    maior = seq;

                }
                seq = 0;
            }
            if(i+1 == binario.length()) {
                if(seq > maior) {
                    maior = seq;
                }
            }

        }
        System.out.println(binario);
        System.out.println(maior);

    }
}
