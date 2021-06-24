public class Test3 {
    public static void main(String[] args) throws IHashTable.TableIsFullException, IHashTable.KeyAlreadyExistsException, IHashTable.KeyDoesntExistException {
        int m = 10000019;
        long p = 1000000007;

        // Perform everything 5 times and average results
        for (int i = 1; i <= 5; i++) {
            DoubleHashTable table = new DoubleHashTable(m, p);
            int n = m / 2;

            long timeStart1 = System.currentTimeMillis();
            for (int k = 1; k <= 3; k++) {
                insertSequence(table, n);
            }
            long timeEnd1 = System.currentTimeMillis();

            long timeStart2 = System.currentTimeMillis();
            for (int k = 1; k <= 3; k++) {
                insertSequence(table, n);
            }
            long timeEnd2 = System.currentTimeMillis();

            System.out.println("First 3 iterations running time (ms): " + (timeEnd1 - timeStart1));
            System.out.println("Last 3 iterations running time (ms): " + (timeEnd2 - timeStart2));
        }
    }
    public static void insertSequence(DoubleHashTable table, int n) throws IHashTable.TableIsFullException, IHashTable.KeyAlreadyExistsException, IHashTable.KeyDoesntExistException {
        long[] a = new long[n];
        // Generate sequence
        for (int i = 0; i < n; i++) {
            a[i] = 100L * (long)i + (long) (Math.random() * 100);
        }

        // Insert sequence
        for (int i = 0; i < n; i++) {
            HashTableElement elem = new HashTableElement(a[i], a[i]);
            table.Insert(elem);
        }

        // Delete sequence
        for (int i = 0; i < n; i++) {
            table.Delete(a[i]);
        }
    }
}
