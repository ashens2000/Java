public class pizzabuilderdemo {

    public static void main(String[] args) {
        Pizzabuilder.Builder builder=new  Pizzabuilder.Builder(1,"Cheese Crust");
        builder.setPizzabuildstatus("InMaking"); builder.setPizzaprice(2000);
        Pizzabuilder pizza= builder.build();
        System.out.println(pizza);

        Pizzabuilder.Builder builder2=new  Pizzabuilder.Builder(2,"Cheese Crust");

        Pizzabuilder pizza2= builder2.build();
        System.out.println(pizza2);


    }

}
