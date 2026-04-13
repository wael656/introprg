/*Per altra banda, tenim que el GatRenat continuarà sent un Gat. En aquest cas, però, ja sabem el nom de tots els gats Renat, oi? Per tant, els seus constructors no demanaran nom.
*/
public class GatRenat extends Gat {
        public GatRenat() {
            super("Renat");
        }

        public GatRenat(int vides) {
            super("Renat", vides);
        }

        public GatRenat(String posicio) {
            super("Renat", posicio); 
        }

        public GatRenat(int vides, String posicio) {
            super("Renat", vides, posicio);
        }
    }