package gradlecopado;

public class gestorArrays {
    // comptarElements(): Retorna el numero d'elements de l'array.

    public static int ElementsCount(int[] array) {
        return array.length;
    }

    public static int firstElement(int[] array) {
        return array[0];
    }

    public static int lastElement(int[] array) {

        return array[7];
    }

    public static int thirdPosition(int[] array) throws IllegalArgumentException {

        if (array.length < 3) {
            throw new IllegalArgumentException("The array is no longer than 3 numbers ");
        }
        return array[2];
    }

    public static int sumaTotal(int[] arraySum) {
        int count = 0;
        for (int value : arraySum) {
            count += value;
        }
        return count;
    }

    public static double mediaTotal(int[] array) {
        if (array == null) {
            return 0;
        }

        double count = 0;
        for (int value : array) {
            count += value;
        }
        return count / array.length; // Division done with a double
    }

}
