public class currentwindowstate {
    private String thiswindowstate;

    public void setThiswindowstate(String thiswindowstate){
        this.thiswindowstate = thiswindowstate;
    }

    public String getThiswindowstate(){
        return thiswindowstate;
    }

    public storedstate saveStateToMemento(){
        return new storedstate(thiswindowstate);
    }

    public void getStateFromMemento(storedstate prevstate){
        thiswindowstate = prevstate.getStoredwindowstate();
    }
}