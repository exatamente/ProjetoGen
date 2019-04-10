package projetogen;

public abstract class Celulas
{
    
    private int x, y;
    private int cor;
    
    
    public void Celulas(int x, int y)
    {      
        this.x = x;
        this.y = y;
    }

    public int celulaX() 
    {
        return x;
    }


    public int celulaY() 
    {
        return y;
    }

    
    public void setCelulaX(int x) 
    {
        this.x = x;
    }

    public void setCelulaY(int y) 
    {
        this.y = y;
    }

    public int getCor() 
    {
        return cor;
    }

    public void setCor(int cor) 
    {
        this.cor = cor;
    }
    
}
