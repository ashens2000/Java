public class LGRefrigerator
{

        public static void main(String[] args) {

            //illegal construct
            //Compile Time Error: The constructor SingleObject() is not visible
            //SingleObject object = new SingleObject();

            //Get the only object available
            Refrigerator object = Refrigerator.getInstance();

            //show the message
            object.showMessage();
        }


}
