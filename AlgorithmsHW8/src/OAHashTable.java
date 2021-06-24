public abstract class OAHashTable implements IHashTable {

    private static final HashTableElement DELETED = new HashTableElement(0, 0);
    private final HashTableElement[] table;

    public OAHashTable(int m) {
        this.table = new HashTableElement[m];
    }



    @Override
    public HashTableElement Find(long key) {
        for (int i = 0; i < this.table.length; i++) {
            int index = this.Hash(key, i);
            HashTableElement elem = this.table[index];
            if (elem == null) {
                return null;
            }
            if ((elem.GetKey() == key) && (elem != DELETED)) {
                return elem;
            }
        }
        return null;
    }


    @Override
    public void Insert(HashTableElement hte) throws TableIsFullException, KeyAlreadyExistsException {

        HashTableElement found = Find(hte.GetKey());
        if (found != null) {
            throw new KeyAlreadyExistsException(hte);
        }

        for (int i = 0; i < this.table.length; i++) {
            int index = this.Hash(hte.GetKey(), i);
            HashTableElement elem = this.table[index];
            if ((elem == null) || (elem == DELETED)) {
                this.table[index] = hte;
                return;
            }
        }

        throw new TableIsFullException(hte); // all indices in probing sequence are full
    }



    // Removes an element with this key from the hash table if exists,
    // or throws KeyDoesntExistException.

    @Override
    public void Delete(long key) throws KeyDoesntExistException {
        for (int i = 0; i < this.table.length; i++) {
            int index = this.Hash(key, i);
            HashTableElement elem = this.table[index];
            if (elem == null) {
                throw new KeyDoesntExistException(key);
            }
            if ((elem.GetKey() == key) && (elem != DELETED)) {
                this.table[index] = DELETED; // marks the cell. DELETED != null
                return;
            }
        }
        throw new KeyDoesntExistException(key);
    }

    /**
     * @param x - the key to hash
     * @param i - the index in the probing sequence
     * @return the index into the hash table to place the key x
     */
    public abstract int Hash(long x, int i);
}
