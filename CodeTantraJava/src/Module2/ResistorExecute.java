package Module2;
import java.util.Scanner;

class Resistor {
    double resistance;
    // Instance method to assign data to the resistance variable
    void giveData(double resistance) {
        this.resistance = resistance;
    }

    // Instance method to display data in the resistance variable
    void displayData(String resistorName) {
        System.out.println(resistorName + " Resistance:" + resistance);
    }
}

class SeriesCircuit extends Resistor {
    // Method to calculate series resistance
    static Resistor calculateSeriesResistance(Resistor resistor1, Resistor resistor2) {
        Resistor seriesResistor = new Resistor();
        seriesResistor.resistance = resistor1.resistance + resistor2.resistance;
        return seriesResistor;
    }
}

class ParallelCircuit extends Resistor {
    // Method to calculate parallel resistance
    static Resistor calculateParallelResistance(Resistor resistor1, Resistor resistor2) {
        Resistor parallelResistor = new Resistor();
        parallelResistor.resistance = 1 / ((1 / resistor1.resistance) + (1 / resistor2.resistance));
        return parallelResistor;
    }
}

class ResistorExecute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for resistor values
        System.out.println("Enter resistance value for Resistor-1:");
        double resistance1 = scanner.nextDouble();

        System.out.println("Enter resistance value for Resistor-2:");
        double resistance2 = scanner.nextDouble();

        // Creating Resistor objects and assigning data
        Resistor resistor1 = new Resistor();
        resistor1.giveData(resistance1);

        Resistor resistor2 = new Resistor();
        resistor2.giveData(resistance2);

        // Displaying data
        resistor1.displayData("Resistor-1");
        resistor2.displayData("Resistor-2");

        // Testing series circuit
        Resistor seriesResult = SeriesCircuit.calculateSeriesResistance(resistor1, resistor2);
        seriesResult.displayData("Series");

        // Testing parallel circuit
        Resistor parallelResult = ParallelCircuit.calculateParallelResistance(resistor1, resistor2);
        parallelResult.displayData("Parallel");

        scanner.close();
    }
}