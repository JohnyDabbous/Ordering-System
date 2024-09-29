public class BurritoOrder{
    private Burrito[] m_order;
    private int m_numBurritos;
    private int m_numBurritosMax;

    public BurritoOrder(){
        m_numBurritos = 0;
        m_numBurritosMax = 1;
        m_order = new Burrito[1];

    }
    public BurritoOrder(int sizeOfOrder){
        m_numBurritos = 0;
        m_numBurritosMax = sizeOfOrder;
        m_order = new Burrito[sizeOfOrder];
    }

    public int addBurrito(Burrito b){
        if(m_numBurritos < m_numBurritosMax){
            m_order[m_numBurritos] = b; // assigns the number of the burrito the same numbered index in the array as long as the number of burritos does not exceed the max
            m_numBurritos++;
        }
        return m_numBurritos;
    }

    public double calcTotal(){
        double total = 0.0;
        for (int i = 0; i < m_order.length; ++i){
            if(m_order[i] == null){
                continue; // checks to see if the index is null and continues if it is
            }
            else{
                double amount; // calls calcCost to each burrito object in the array
                amount = m_order[i].calcCost(m_order[i]); // assigns that value to amount after each iteration
                total += amount; // adds that amount to total each time
            }
        }
        return total;
    }

    public String toString(){
        String s = "";
        s += "Total: " + calcTotal() + "\n";
        for (int i = 0; i < m_order.length; ++i){
            s = s + m_order[i] + "\n";
        }
        return s;
    }
}