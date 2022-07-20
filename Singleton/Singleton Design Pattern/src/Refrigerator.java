public class Refrigerator
{
        //create an object of Refrigerator
        private static Refrigerator instance = new Refrigerator();

        //make the constructor private so that this class cannot be
        //instantiated
        private Refrigerator(){}

        //Get the only object available
        public static Refrigerator getInstance(){
            return instance;
        }

        public void showMessage(){
            System.out.println("This is a Refrigerator");
        }


}
