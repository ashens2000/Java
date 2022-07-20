public class storedstate {
    private String storedwindowstate;

    public storedstate(String nextwindowstate){
        this.storedwindowstate = nextwindowstate;
    }

    public String getStoredwindowstate(){
        return storedwindowstate;
    }
}