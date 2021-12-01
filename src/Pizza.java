/**
 * @author MRossello11
 * @version 1.0
 * @since 19/11/2021
 * @description
* */
class Pizza {
    //atributos
    private String tipo;
    private String medida;
    private boolean servida = false;

    private static int pizzasPedidas = 0;
    private static int pizzasServidas = 0;

    //constructor por defecto
    public Pizza(){
        this.tipo = "margarita";
        this.medida = "mediana";
    }
    //constructor
    public Pizza(String tipo, String medida){
        this.tipo  = tipo;
        this.medida = medida;
        pizzasPedidas += 1;
    }

    //metodos
    private void servir(){
        if (this.servida){
            System.out.println("Ya esta servida");
        } else{
            System.out.println("Sirviendo....");
            this.servida = true;
            pizzasPedidas -= 1;
            pizzasServidas += 1;
        }
    }

    private static int getPizzasPedidas(){
        return pizzasPedidas;
    }
    private static int getPizzasServidas(){
        return pizzasServidas;
    }


    public static void main(String[] args) {
        Pizza p1 = new Pizza("margarita", "mediana");
        Pizza p2 = new Pizza("funghi", "familiar");
        p2.servir();
        Pizza p3 = new Pizza("cuatro quesos", "mediana");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.servir();
        System.out.println("Pedidas: " + Pizza.getPizzasPedidas());
        System.out.println("Servidas " + Pizza.getPizzasServidas());
    }

}
