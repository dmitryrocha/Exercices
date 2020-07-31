package hackerRank30Days;

public class Dia12 {
    public static void main(String[] args) {

    }
}
 class Studante {
    private int id;
    private String nome;
    private String sobrenome;
    private int[] arr;

     public Studante(int id, String nome, String sobrenome, int[] arr) {
         this.id = id;
         this.nome = nome;
         this.sobrenome = sobrenome;
         this.arr = arr;
     }

     public char calculate() {
         int media = 0;
         int sum = 0;
         for(int i = 0; i < arr.length; i++){
             sum+=arr[i];
         }
         media = sum/arr.length;
         if(media>= 90 && media <= 100){
             return 'O';
         } else if (media>= 80 && media < 90){
             return 'E';
         } else if (media>= 70 && media < 80){
             return 'A';
         }else if (media>= 55 && media < 70){
             return 'P';
         }else if (media>= 40 && media < 55){
             return 'D';
         }else{
             return 'T';
         }
     }
 }
