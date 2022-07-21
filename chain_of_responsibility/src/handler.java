public abstract class handler {

    public void setSuccessor(handler successor) {
        this.successor = successor;
    }

    protected handler successor;

    public abstract String applyapproval(decision decision);


}
