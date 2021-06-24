public class LinearProbingHashTable extends OAHashTable {
    private final ModHash modhash;
    private int m;

    public LinearProbingHashTable(int m, long p) {
        super(m);
        this.modhash = ModHash.GetFunc(m, p);
        this.m = m;
    }

    @Override
    public int Hash(long x, int i) {
        return ((modhash.Hash(x) + i) % m);
    }
}
