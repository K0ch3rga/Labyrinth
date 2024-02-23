package labyrinth;

import org.junit.jupiter.api.Test;

import labyrinth.Domain.Labyrinth;
import labyrinth.Domain.RandomGenerator;

import static org.junit.jupiter.api.Assertions.*;

public class LabyrinthGeneratorTest {
    RandomGenerator randomGenerator = new RandomGenerator(1984);

    @Test void generatesLabyrinth() { 
        assertInstanceOf(Labyrinth.class, randomGenerator.generateLabyrinth());
    }

    @Test void correctWidthGeneration() {
        int width = 3;
        Labyrinth lab = randomGenerator.setWidth(width).generateLabyrinth();
        assertEquals(lab.getWidth(), width);
    }

    @Test void correctHeigthGeneration() {
        int height =5;
        Labyrinth lab = randomGenerator.setHeigth(height).generateLabyrinth();
        assertEquals(lab.getHeigth(), height);
    }
}
