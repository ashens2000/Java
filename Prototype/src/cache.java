import java.util.Hashtable;

public class cache {

    private static Hashtable<String, dog> shapeMap  = new Hashtable<String, dog>();

    public static dog getDog(String name) {
        dog cacheddog = shapeMap.get(name);
        return (dog) cacheddog.clone();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes

    public static void loadCache() {
        Husky husky = new Husky();
        husky.setColor("White");
        shapeMap.put(husky.getName(),husky);

        dobberman dobberMan = new dobberman();
        dobberMan.setColor("Black");
        shapeMap.put(dobberMan.getName(),dobberMan);

        goldenretriever gr = new goldenretriever();
        gr.setColor("Brown");
        shapeMap.put(gr.getName(),gr);
    }
}
