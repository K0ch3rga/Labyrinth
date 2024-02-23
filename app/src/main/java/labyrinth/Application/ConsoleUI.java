package labyrinth.Application;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import labyrinth.Domain.Labyrinth;
import labyrinth.Domain.LabyrinthGenerator;
import labyrinth.Domain.RandomGenerator;
import labyrinth.Domain.rooms.Room;

public class ConsoleUI implements Runnable {
    

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.println("Type seed");
            int seed = Integer.parseInt(reader.readLine());
            System.out.println("Type width");
            int width = Integer.parseInt(reader.readLine());
            System.out.println("Type height");
            int height = Integer.parseInt(reader.readLine());

            System.out.println("Generating");
            LabyrinthGenerator generator = new RandomGenerator(seed).setHeigth(height).setWidth(width);
            Labyrinth labyrinth = generator.generateLabyrinth();
            StringBuilder output = new StringBuilder();
            int count = 0;
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    Room room = labyrinth.getRoom(x, y);
                    switch (room.getType()) {
                        case MISSING:
                            output.append("  ");
                            break;
                        case EMPTY:
                            output.append("[]");
                            count++;
                            break;
                        default:
                            break;
                    }
                    output.append("\t");
                }
                output.append("\n");
            }
            System.out.println(output.toString());
            System.out.println(count);

            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
