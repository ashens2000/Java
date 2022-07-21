public class intern_level extends handler{
    @Override
    public String applyapproval(decision decision) {

//       decision.setDecision(decision.getDecision());
        System.out.println("Inside intern Approval");
        if(decision.getDecision()=="notimportant")
        {

            return decision.getDecisionlevel();

        }
        else
        {
            return successor.applyapproval(decision);
        }


    }
}
