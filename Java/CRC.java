import java.util.*;

public class CRC {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        // Input data bits
        System.out.print("Enter the size of the data array: ");
        int dataSize = scan.nextInt();
        int[] data = new int[dataSize];

        System.out.println("Enter data bits one by one:");
        for (int i = 0; i < dataSize; i++) {
            System.out.print("Bit " + (i + 1) + ": ");
            data[i] = scan.nextInt();
        }

        // Input divisor bits
        System.out.print("\nEnter the size of the divisor array: ");
        int divisorSize = scan.nextInt();
        int[] divisor = new int[divisorSize];

        System.out.println("Enter divisor bits one by one:");
        for (int i = 0; i < divisorSize; i++) {
            System.out.print("Bit " + (i + 1) + ": ");
            divisor[i] = scan.nextInt();
        }

        // Perform division to get remainder
        int[] remainder = divideDataWithDivisor(data, divisor);

        System.out.print("\nRemainder: ");
        for (int i = 0; i < remainder.length - 1; i++)
            System.out.print(remainder[i]);
        System.out.println();

        // Append remainder to data to form transmitted frame
        System.out.print("Generated CRC code: ");
        for (int bit : data)
            System.out.print(bit);
        for (int i = 0; i < remainder.length - 1; i++)
            System.out.print(remainder[i]);
        System.out.println();

        // Simulate transmission
        int[] sentData = new int[data.length + remainder.length - 1];
        System.arraycopy(data, 0, sentData, 0, data.length);
        System.arraycopy(remainder, 0, sentData, data.length, remainder.length - 1);

        // Check received data
        receiveData(sentData, divisor);
        scan.close();
    }

    static int[] divideDataWithDivisor(int[] oldData, int[] divisor) {
        int[] data = new int[oldData.length + divisor.length];
        System.arraycopy(oldData, 0, data, 0, oldData.length);
        int[] rem = new int[divisor.length];
        System.arraycopy(data, 0, rem, 0, divisor.length);

        for (int i = 0; i < oldData.length; i++) {
            if (rem[0] == 1) {
                for (int j = 1; j < divisor.length; j++) {
                    rem[j - 1] = exorOperation(rem[j], divisor[j]);
                }
            } else {
                for (int j = 1; j < divisor.length; j++) {
                    rem[j - 1] = exorOperation(rem[j], 0);
                }
            }
            rem[divisor.length - 1] = data[i + divisor.length];
        }
        return rem;
    }

    static int exorOperation(int x, int y) {
        return (x == y) ? 0 : 1;
    }

    static void receiveData(int[] data, int[] divisor) {
        int[] rem = divideDataWithDivisor(data, divisor);
        for (int bit : rem) {
            if (bit != 0) {
                System.out.println("\nReceived data is CORRUPTED!");
                return;
            }
        }
        System.out.println("\nReceived data is ERROR-FREE.");
    }
}
