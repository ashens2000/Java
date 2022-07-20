public class Prototypepatterndemo
{
    public static void main(String[] args) {
        cache.loadCache();

        dog cloneddog = (dog) cache.getDog("Tom");
        System.out.println("Dog : " + cloneddog.getColor());

        dog cloneddog2 = (dog) cache.getDog("Debbie");
        System.out.println("Dog : " + cloneddog2.getColor());

        dog cloneddog3 = (dog) cache.getDog("Jimmy");
        System.out.println("Dog : " + cloneddog3.getColor());
    }
}
