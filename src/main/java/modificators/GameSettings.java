package modificators;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    static void setMaxPlayers(int players) {
        maxPlayers = players;
    }

    void addPlayer() {
        currentPlayers++;
    }

    void printGameStatus() {
        System.out.println("Game Name: " + gameName);
        System.out.println("Current Players: " + currentPlayers);
        System.out.println("Max Players: " + maxPlayers);
    }
}
