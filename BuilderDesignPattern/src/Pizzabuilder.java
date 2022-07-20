public class Pizzabuilder {


    private final int pizzaid;
    private final String pizzatype;
    private final String pizzabuildstatus;
    private final int pizzaprice;


    public Pizzabuilder(Builder pizzabuilder) {

        this.pizzaid = pizzabuilder.pizzaid;
        this.pizzatype = pizzabuilder.pizzatype;
        this.pizzabuildstatus = pizzabuilder.pizzabuildstatus;
        this.pizzaprice = pizzabuilder.pizzaprice;
    }


    public int getPizzaid() {
        return pizzaid;
    }


    public String getPizzatype() {
        return pizzatype;
    }


    public String getPizzabuildstatus() {
        return pizzabuildstatus;
    }


    public int getPizzaprice() {
        return pizzaprice;
    }


    @Override
    public String toString() {
        return "PizzaBuilder {"  +
                "Pizzaid=" + pizzaid +
                ", pizzatype=" + pizzatype +
                ", pizzabuildstatus=" + pizzabuildstatus +
                ", pizzaprice=" + pizzaprice + "}";
    }


    static class Builder{

        private int pizzaid;
        private String pizzatype;
        private String pizzabuildstatus;
        private int pizzaprice;

        public Pizzabuilder build(){
            Pizzabuilder pizza=new Pizzabuilder(this);
            return pizza;

        }

        public Builder(int pizzaid,String pizzatype){

            this.pizzaid =pizzaid;
            this.pizzatype =pizzatype;
        }

        public void setPizzaid(int pizzaid) {
            this.pizzaid = pizzaid;
        }

        public void setPizzatype(String pizzatype) {
            this.pizzatype = pizzatype;
        }

        public void setPizzabuildstatus(String pizzabuildstatus) {
            this.pizzabuildstatus = pizzabuildstatus;
        }

        public void setPizzaprice(int pizzaprice) {
            this.pizzaprice = pizzaprice;
        }
    }



}
