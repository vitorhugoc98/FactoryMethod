package factorymethodabstractclass;

public class Cliente {

    public static void main(String[] args) {
        CreatorFactoryFabricaoDeAviao factory = new FactoryFabricaoDeAviao(); 
        
        factory.verificaAviao(100); 
    }
    
}
