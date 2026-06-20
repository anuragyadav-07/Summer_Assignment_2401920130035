import java.util.Random;

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random random = new Random();

        for (int i = 0; i < compartments.length; i++) {
            int num = random.nextInt(4) + 1;

            switch (num) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }

        
        for (int i = 0; i < compartments.length; i++) {
            System.out.println("Compartment " + (i + 1) + ": " + compartments[i].notice());
        }
    }
}

// OUTPUT

// Compartment 1: Ladies Compartment
// Compartment 2: General Compartment
// Compartment 3: Luggage Compartment
// Compartment 4: First Class Compartment
// Compartment 5: Ladies Compartment
// Compartment 6: General Compartment
// Compartment 7: First Class Compartment
// Compartment 8: Luggage Compartment
// Compartment 9: General Compartment
// Compartment 10: Ladies Compartment