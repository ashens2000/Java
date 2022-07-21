public class takedecision extends handler{
    @Override
    public String applyapproval(decision decision) {
        return successor.applyapproval(decision);
    }
}
