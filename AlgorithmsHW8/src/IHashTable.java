public interface IHashTable {
     void Insert(HashTableElement hte) throws TableIsFullException, KeyAlreadyExistsException;


     void Delete(long key) throws KeyDoesntExistException;


     HashTableElement Find(long key);

     class TableIsFullException extends Exception{
        public HashTableElement hte;

        public TableIsFullException(HashTableElement hte) {
            this.hte=hte;
        }
    }

     class KeyAlreadyExistsException extends Exception{
        public HashTableElement hte;

        public KeyAlreadyExistsException(HashTableElement hte) {
            this.hte=hte;
        }
    }

     class KeyDoesntExistException extends Exception{
        public long key;

        public KeyDoesntExistException(long key) {
            this.key=key;
        }
    }
}
