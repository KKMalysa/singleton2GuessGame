public class Main {

    public static void main(String[] args) {

        GuessGame game = GuessGame.getInstance();

        game.play();

        int score = game.getScore();

        GuessGame GameReference = GuessGame.getInstance();

        if(game == GameReference  ) {
            System.out.println("Singleton works!");
            if(score == GameReference.getScore()) {
                System.out.println("Do you enjoy your game?");
            }
        }
    }
}
