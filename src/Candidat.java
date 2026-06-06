
package votingsystem;

public class Candidat extends Electeur {
    private String motDePasse;
    private int votes;

    public Candidat(String nom, String motDePasse) {
        super(nom);
        this.motDePasse = motDePasse;
        this.votes = 0;
    }

    public void ajouterVote() {
        ++this.votes;
    }

    public int getNombreVotes() {
        return this.votes;
    }

    public boolean authentifier(String mdp) {
        return this.motDePasse.equals(mdp);
    }
}
