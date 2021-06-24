public class Test2 {
    public static void main(String[] args) throws IHashTable.TableIsFullException, IHashTable.KeyAlreadyExistsException
    {
        int m = 10000019;
        long p = 1000000007;
        int n;

        // Part A
        System.out.println("Starting part A.");
        n = m / 2;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
            measureAll(m, p, n, true);
            System.out.println();
        }


        // Part B
        n = (19 * m) / 20;
        System.out.println("Starting part B.");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
            measureAll(m, p, n, false);
            System.out.println();
        }
    }
        public static void measureAll ( int m, long p, int n, boolean doQP) throws
        IHashTable.TableIsFullException, IHashTable.KeyAlreadyExistsException {
            IHashTable table;

            table = new LinearProbingHashTable(m, p);
            long timeLP = measure(table, n);
            System.out.println("Time linear probing: " + timeLP);

            if (doQP) {
                table = new QPHashTable(m, p);
                long timeQP = measure(table, n);
                System.out.println("Time quadratic probing: " + timeQP);
            }

            table = new AQPHashTable(m, p);
            long timeAQP = measure(table, n);
            System.out.println("Time alternating quadratic probing: " + timeAQP);

            table = new DoubleHashTable(m, p);
            long timeDoubleHash = measure(table, n);
            System.out.println("Time double hashing: " + timeDoubleHash);
        }

        public static long measure (IHashTable table,int n) throws
        IHashTable.TableIsFullException, IHashTable.KeyAlreadyExistsException {
            long[] a = new long[n];

            long timeStart = System.currentTimeMillis();

            // Generate sequence
            for (int i = 0; i < n; i++) {
                a[i] = 100L * (long) i + (long) (Math.random() * 100);
            }

            // Insert sequence
            for (int i = 0; i < n; i++) {
                HashTableElement elem = new HashTableElement(a[i], a[i]);
                table.Insert(elem);
            }

            long timeEnd = System.currentTimeMillis();

            return timeEnd - timeStart;
        }

}
