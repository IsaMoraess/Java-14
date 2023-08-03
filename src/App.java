import deviflix.Filme;

public class App {
    public static void main(String[] args) throws Exception {
        // Um unico nome -> pod ter comportamento diferente Polimorfismo
        Filme filme = new Filme("Titanic"); 
        filme.play();
    }
}
