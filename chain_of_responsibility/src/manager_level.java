public class manager_level extends handler{
    @Override
    public String applyapproval(decision decision) {

//       decision.setDecision(decision.getDecision());
        System.out.println("Inside Manager Approval");
        if(decision.getDecision()=="moderatelyimportant")
        {

            return decision.getDecisionlevel();

        }
        else
        {
            return successor.applyapproval(decision);
        }


    }
}
