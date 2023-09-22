import java.util.*;
import java.util.Scanner;

public class Main {
	
	public static class PokemonGo implements Interface{
		String PokemonName;
		String PokemonType;
		int PokemonLevel;
    int PokemonGen;
    
		String PokeballName;
    int PokeballRate;
		
		@Override
		public void PokemonName(String PokemonName) {
			System.out.println("||Pokemon Name  = " + PokemonName);
      this.PokemonName = PokemonName;
		}

		@Override
		public void PokemonType(String PokemonType) {
			System.out.println("||Pokemon Type  = " + PokemonType);
      this.PokemonType = PokemonType;
		}

		@Override
		public void PokemonLevel(int PokemonLevel) {
			System.out.println("||Pokemon Level = " + PokemonLevel + " Xp");
      this.PokemonLevel = PokemonLevel;
		}

    @Override
		public void PokemonGen(int PokemonGen) {
			System.out.println("||Pokemon Gen   = " + PokemonGen);
      this.PokemonGen = PokemonGen;
		}

		@Override
		public void PokeballName(String PokeballName) {
			System.out.println("||Pokeball Name = " + PokeballName);
      this.PokeballName = PokeballName;
		}

    @Override
		public void PokeballRate(int PokeballRate) {
			System.out.println("||Pokeball Rate = " + PokeballRate +"%");
      this.PokeballRate = PokeballRate;
		}
	}

  
	public static class PokemonGo2 extends Pokemon{
		protected String PokemonName;
		protected String PokemonType;
		protected int PokemonLevel;
    protected int PokemonGen;
    
		protected String PokeballName;
    protected int PokeballRate;
		
		@Override
		public void InputPokemonGo(String PokemonName, String PokemonType, int PokemonLevel, int PokemonGen, String PokeballName, int PokeballRate) {
			System.out.println("||Pokemon Name  = " + PokemonName);
			System.out.println("||Pokemon Type  = " + PokemonType);
			System.out.println("||Pokemon Level = " + PokemonLevel + " Xp");
      System.out.println("||Pokemon Gen   = " + PokemonGen);
			System.out.println("||Pokeball Name = " + PokeballName);
      System.out.println("||Pokeball Rate = " + PokeballRate +"%");

      this.PokemonName = PokemonName;
			this.PokemonType = PokemonType;
			this.PokemonLevel = PokemonLevel;
      this.PokemonGen = PokemonGen;
      
			this.PokeballName = PokeballName;
      this.PokeballRate = PokeballRate;
		}
	}

  
  public static class PokemonGo3 extends Pokemon{
		protected String PokemonName;
		protected String PokemonType;
		protected int PokemonLevel;
    protected int PokemonGen;
    
		protected String PokeballName;
    protected int PokeballRate;
		
		@Override
		public void InputPokemonGo(String PokemonName, String PokemonType, int PokemonLevel, int PokemonGen, String PokeballName, int PokeballRate) {
			System.out.println("||Pokemon Name  = " + PokemonName);
			System.out.println("||Pokemon Type  = " + PokemonType);
			System.out.println("||Pokemon Level = " + PokemonLevel + " Xp");
      System.out.println("||Pokemon Gen   = " + PokemonGen);
			System.out.println("||Pokeball Name = " + PokeballName);
      System.out.println("||Pokeball Rate = " + PokeballRate +"%");

      this.PokemonName = PokemonName;
			this.PokemonType = PokemonType;
			this.PokemonLevel = PokemonLevel;
      this.PokemonGen = PokemonGen;
      
			this.PokeballName = PokeballName;
      this.PokeballRate = PokeballRate;
		}
	}

  

  
	public static void main(String[] args) {
		System.out.println("=============================");
    System.out.println("||                         ||");
    System.out.println("||         POKEMON         ||");
    System.out.println("||                         ||");
    System.out.println("=============================");

    System.out.println("");
    System.out.println("");
    
    PokemonGo newPokemonGo = new PokemonGo();
    System.out.println("=================");
    System.out.println("| FIRST POKEMON |");
    System.out.println("=================");
		newPokemonGo.PokemonName("Bulbasaur");
		newPokemonGo.PokemonType("Grass & Poison");
		newPokemonGo.PokemonLevel(12);
    newPokemonGo.PokemonGen(1);
		newPokemonGo.PokeballName("Monster Ball");
    newPokemonGo.PokeballRate(90);
		
		System.out.println("");
    
    PokemonGo2 newPokemonGo2 = new PokemonGo2();
    System.out.println("==================");
    System.out.println("| SECOND POKEMON |");
    System.out.println("==================");
		newPokemonGo2.InputPokemonGo("Charizard", "Fire & Flying", 30, 1, "Master Ball", 60);

    System.out.println("");
    
    PokemonGo3 newPokemonGo3 = new PokemonGo3();
    System.out.println("===================");
    System.out.println("|  THIRD POKEMON  |");
    System.out.println("===================");
		newPokemonGo3.InputPokemonGo("Turtwig", "Grass", 10, 3, "Ultra Ball", 85);
	}
}
