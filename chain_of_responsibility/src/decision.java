public class decision {

    private int decisionid;
    private String decisionlevel;
    private String decision;

    public decision(int decisionid, String decisionlevel, String decision) {
        this.decisionid = decisionid;
        this.decisionlevel = decisionlevel;
        this.decision = decision;
    }

    public void setDecisionlevel(String decisionlevel) {
        this.decisionlevel = decisionlevel;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public String getDecisionlevel() {
        return decisionlevel;
    }

    public String getDecision() {
        return decision;
    }

    public int getDecisionid() {
        return decisionid;
    }
}
