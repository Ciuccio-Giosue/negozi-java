public class Negozio{
    private String nome;
    private String indirizzo;
    private int Magazzino;
    
      public Cliente(String nome,String indirizzo){
        setNome(nome);
        setIndirizzo(indirizzo);
    }
    public String getNome(){
        return nome;
    }
    public String getIndirizzo(){
    return indirizzo;
    }
    public int getMagazzino(){
        return prodotto;
    }
    
public void setNome(String nome){
    this.nome=nome;
}
public void setIndirizzo(String indirizzo){
    this.indirizzo=indirizzo;
}
public void setMagazzino(int magazzino){
    this.magazzino=magazzino;
}
}