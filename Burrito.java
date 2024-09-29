public class Burrito{
    private String m_size;
    private String m_protein;
    private String m_rice;
    private String m_beans;
    private boolean m_guac;
    private boolean m_tomatillo;
    private boolean m_sourCream;
    private boolean m_cheese;
    private boolean m_lettuce;


    public Burrito(){
        m_protein = "Chicken";
        m_size = "Regular";
        m_beans = "Black";
        m_rice = "White";
        m_lettuce = true;
        m_sourCream = true;

    }

    public Burrito(String size, String beans, String rice, String protein, boolean guac, boolean tomatillo, boolean sourCream, boolean cheese, boolean lettuce){
        m_size = size;
        m_beans = beans;
        m_rice = rice;
        m_protein = protein;
        m_guac = guac;
        m_tomatillo = tomatillo;
        m_sourCream = sourCream;
        m_cheese = cheese;
        m_lettuce = lettuce;

    }

    public Burrito(Burrito burritoToCopy){
        m_size = burritoToCopy.m_size;
        m_beans = burritoToCopy.m_beans;
        m_rice = burritoToCopy.m_rice;
        m_protein = burritoToCopy.m_protein;
        m_guac = burritoToCopy.m_guac;
        m_tomatillo = burritoToCopy.m_tomatillo;
        m_sourCream = burritoToCopy.m_sourCream;
        m_cheese = burritoToCopy.m_cheese;
        m_lettuce = burritoToCopy.m_lettuce;


    }

    public String getBeans(){
        return m_beans;
    }

    public String getProtein(){
        return m_protein;
    }

    public String getSize(){
        return m_size;
    }
    
    public String getRice(){
        return m_rice;
    }

    public boolean getGuac(){
        return m_guac;
    }

    public boolean getTomatillo(){
        return m_tomatillo;
    }

    public boolean getSourCream(){
        return m_sourCream;
    }

    public boolean getCheese(){
        return m_cheese;
    }

    public boolean getLettuce(){
        return m_lettuce;
    }
    public void changeProtein(String protein){
        m_protein = protein;
    }
    public void changeRice(String rice){
        m_rice = rice;
    }

    public void changeSize(String size){
        m_size = size;
    }

    public void changeBeans(String beans){
        m_beans = beans;
    }

    public void changeGuac(boolean guac){
        m_guac = guac;
    }

    public void changeTomatillo(boolean tomatillo){
        m_tomatillo = tomatillo;
    }

    public void changeSourCream(boolean sourCream){
        m_sourCream = sourCream;
    }

    public void changeCheese(boolean cheese){
        m_cheese = cheese;
    }

    public void changeLettuce(boolean lettuce){
        m_lettuce = lettuce;
    }

    public double calcCost(Burrito burritoToCalc){
        double cost = 0.00;
        if(burritoToCalc.m_size == "Kids"){
            cost += 7.00;
        }
        else if(burritoToCalc.m_size == "Regular"){
            cost += 9.00;
        }
        else{
            cost += 0.00;
        }
        if(burritoToCalc.m_protein == "Steak"){
            cost += 1.25;
        }   
        else if(burritoToCalc.m_protein == "Chicken" || burritoToCalc.m_protein == "Veggies"){
            cost += 0.50;
        }
        else{
            cost += 0.00;
        }
        if(burritoToCalc.m_guac == true){
            cost += 2.65;
        }   
        if(burritoToCalc.m_tomatillo == true || burritoToCalc.m_tomatillo == false){
            cost += 0.00;
        }
        if(burritoToCalc.m_sourCream == true){
            cost += 0.25;
        }
        if(burritoToCalc.m_lettuce == true || burritoToCalc.m_lettuce == false){
            cost += 0.00;
        }
        return cost;
    }

    public boolean equals(Object o){
        if (this == o) {return true;}
        if(!(o instanceof Burrito)) {return false;}
        Burrito c = (Burrito) o;
        return this.m_size.equals(c.m_size) &&
            this.m_protein.equals(c.m_protein) &&
            this.m_beans.equals(c.m_beans) &&
            this.m_rice.equals(c.m_rice);
    }
    public String toString(){
        String s = "";
        s += "Size: " + m_size + "\n";
        s += "Protein: " + m_protein + "\n";
        s += "Rice: " + m_rice + "\n";
        s += "Beans: " + m_beans + "\n";
        s += "Guac: " + m_guac + "\n";
        s += "Tomatillo: " + m_tomatillo + "\n";
        s += "Sour Cream: " + m_sourCream + "\n";
        s += "Cheese: " + m_cheese + "\n";
        s += "Lettuce: " + m_lettuce + "\n";
        return s;
    }
}
