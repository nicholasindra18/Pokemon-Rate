abstract class Pokemon{
	protected String PokemonName;
	protected String PokemonType;
	protected int PokemonLevel;
  protected int PokemonGen;
  
	protected String PokeballName;
  protected int PokeballRate;

  
	protected String getPokemonName() {
		return PokemonName;
	}
  
	protected void setPokemonName(String PokemonName) {
		this.PokemonName = PokemonName;
	}
  
	protected String getPokemonType() {
		return PokemonType;
	}
  
	protected void setType(String PokemonType) {
		this.PokemonType = PokemonType;
	}
  
	protected int getPokemonLevel() {
		return PokemonLevel;
	}
  
	protected void setPokemonLevel(int PokemonLevel) {
		this.PokemonLevel = PokemonLevel;
	}
  
  protected int getPokemonGen() {
		return PokemonGen;
	}
  
	protected void setPokemonGen(int PokemonGen) {
		this.PokemonGen = PokemonGen;
	}
  
	protected String getPokeballName() {
		return PokeballName;
	}
  
	protected void setPokeballName(String PokeballName) {
		this.PokeballName = PokeballName;
	}
  
  protected int getPokeballRate() {
		return PokeballRate;
	}
  
	protected void setPokeballRate(int PokeballRate) {
		this.PokeballRate = PokeballRate;
	}

  
	protected abstract void InputPokemonGo(String PokemonName, String PokemonType, int PokemonLevel, int PokemonGen, String PokeballName, int PokeballRate);
}
