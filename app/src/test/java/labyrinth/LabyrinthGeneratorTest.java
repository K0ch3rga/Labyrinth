package labyrinth;

import org.junit.jupiter.api.Test;

import labyrinth.Domain.Labyrinth;
import labyrinth.Domain.LabyrinthGenerator;

import static org.junit.jupiter.api.Assertions.*;

public class LabyrinthGeneratorTest {
    LabyrinthGenerator labyrinthGenerator = new LabyrinthGenerator(1984);

    @Test void generatesLabyrinth() { 
        assertInstanceOf(Labyrinth.class, labyrinthGenerator.generateLabyrinth());
    }

    @Test void correctWidthGeneration() {
        int width = 3;
        Labyrinth lab = labyrinthGenerator.setWidth(width).generateLabyrinth();
        assertEquals(lab.getWidth(), width);
    }

    @Test void correctHeigthGeneration() {
        int height =5;
        Labyrinth lab = labyrinthGenerator.setHeigth(height).generateLabyrinth();
        assertEquals(lab.getHeigth(), height);
    }
}
