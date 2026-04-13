/*En Garfield és, per descomptat, un Gat i en totes les seves instàncies es diu "Garfield". Es tracta d'un gat també molt especial. En Garfield, a diferència del Renat, i de fet, de la majoria dels gats, neix sempre amb 9 vides i mai no pot tenir més de 9 vides ni el seu nombre de vides no ser vàlid per qualsevol altre gat. Tampoc no pot néixer d'una altra manera que no sigui estirat. Per altra banda, les ordres d'ensinistrament no són tan flexibles com les de la resta dels gats. Així, només pot aixecar-se o estirar-se si estava assegut, mentre que pot seure sempre i quant no estigués ja assegut. El mètode heretat setPosicio() però, podrà canviar la posició sense restriccions.
*/
public class Garfield extends Gat {
    public Garfield() {
        super("Garfield", 9, "estirat");
    }

    @Override
    public void setVides(int novesVides) {
        if (novesVides >= 0 && novesVides <= 9) {
            super.setVides(novesVides);
        }
    }

    @Override
    public String aixecat() {
        if (esAssegut()) {
            setPosicio("dret");
            return "ja m'aixeco";
        }
        return "passo de fer res";
    }

    @Override
    public String estirat() {
        if (esAssegut()) {
            setPosicio("estirat");
            return "Bai Maitea, bai";
        }
        return "passo de fer res";
    }
}