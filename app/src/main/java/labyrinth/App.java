/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package labyrinth;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public void lab() {
        Labyrinth lab = new LabyrinthGenerator(0).setWidth(5).generateLabyrinth();
        System.out.println(lab.toString());
    }

    public static void main(String[] args) {
        // System.out.println(new App().getGreeting());
        new App().lab();
        System.out.println("Done");
    }

}
