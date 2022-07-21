public class boss_level extends handler{
    @Override
    public String applyapproval(decision decision) {

//       decision.setDecision(decision.getDecision());
        System.out.println("Inside Boss Approval");
           return decision.getDecisionlevel();




    }
}
