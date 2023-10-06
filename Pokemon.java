public class Pokemon{
    
    private int HP;
    private String Nombre;
    private int nivel;
    private String tipo;
    
    public Pokemon(String Nombre, String tipo, int nivel){
    
    this.HP = 100;
    this.tipo =tipo;
    this.nivel=nivel;
    this.Nombre=Nombre;
}
    
    public int getHp(){
        return HP;}
        
    public int getnivel(){
        return nivel;
    }
    
    public String gettipo(){
        return tipo;
    }    
    public String getNombre(){
        return Nombre;
    }
    
    public int calculaDanio(int danio) {
    this.HP -= danio;
    System.out.printf("%s recibe %d puntos de danio\n",this.getNombre(), danio);
    return danio;
       
}
    public void recibirAtaque(String movimiento) {
    System.out.printf("%s recibe ATK %s\n", this.getNombre(),movimiento);
    int vida =this.HP - calculaDanio((int)(Math.random()*10+1));
    System.out.printf("%s tiene ahora %d puntos de vida \n", this.getNombre(), vida);
}
    public void atacar(String movimiento, Pokemon pokemon) {
    System.out.printf("%s ataca a %s con %s\n", this.getNombre(),pokemon.getNombre(),movimiento);
    pokemon.recibirAtaque(movimiento);
}
    
}
