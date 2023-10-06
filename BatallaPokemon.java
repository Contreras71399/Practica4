public class BatallaPokemon {
    public static void main(String[]args){
       PokemonTipo Pokemon1=new PokemonTipo("Gyarados",10,"Volador");
       PokemonTipo Pokemon2=new PokemonTipo("Jolteon",10,"Electrico");
       
       realizaAtaque(Pokemon1,Pokemon2,"Hidrobomba");
       realizaAtaque(Pokemon2,Pokemon1,"Impactrueno");
       
       System.out.println(Pokemon1.getNombre()+"tiene ahora"+Pokemon1.getHP()+"tiene puntos ");
    }

    private static void realizaAtaque(PokemonAtacante, PokemonObjetivo, String ataque) {
        int  danio= CalcularDanio(ataque);
        int PuntosDeVidaObjetivo=
                
                }
                }

