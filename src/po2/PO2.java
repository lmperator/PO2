package po2;

/**
 *
 * @author Artur Laskowski
 */
public class PO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // making two threats one is supervisor all, second the rest
        GameThreat Game = new GameThreat();
        SupervisorThreat Supervisor = new SupervisorThreat();
        
        Game.run();
        Supervisor.run();
    }
}
