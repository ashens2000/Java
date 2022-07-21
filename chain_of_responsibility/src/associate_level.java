public class associate_level extends handler{

    @Override
    public String applyapproval(decision decision) {

//       decision.setDecision(decision.getDecision());
        System.out.println("Inside Associate Approval");
        if(decision.getDecision()=="lessimportant")
        {

            return decision.getDecisionlevel();

        }
        else
        {
            return successor.applyapproval(decision);
        }


    }
}
