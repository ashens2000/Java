public class MementoPatternDemo {
    public static void main(String[] args) {

        currentwindowstate currentstate = new currentwindowstate();
        Caretaker careTaker = new Caretaker();

        currentstate.setThiswindowstate("Fullscreen");
        currentstate.setThiswindowstate("Maximized");
        careTaker.add(currentstate.saveStateToMemento());

        currentstate.setThiswindowstate("Minimized");
        careTaker.add(currentstate.saveStateToMemento());

        currentstate.setThiswindowstate("Freezed");
        System.out.println("Current State: " + currentstate.getThiswindowstate());

        currentstate.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + currentstate.getThiswindowstate());
        currentstate.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + currentstate.getThiswindowstate());
    }
}