import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<App> apps = Arrays.asList(
            new App("SuperGame", "JohnDoe", 450, "Games", 20),
            new App("MegaTool", "JaneDoe", 550, "Utility", 10),
            new App("FinTrack", "BadDev", 400, "Finance", 5),
            new App("EnterpriseSuite", "CorpDev", 300, "Enterprise", 150)
        );

        AppManager.processApps(apps);
    }
}
