public class Mage extends Character {
    public Mage(String name){
        super(name, "Mage");
        System.out.println(this.name + ": May the gods be with me.");
    }

    @Override
    public void attack(String weapon){
        if (weapon.equals("magic") || weapon.equals("wand")){
            super.attack(weapon);
            System.out.println(this.name + ": Feel the power of my " + weapon + "!");
        }
    }
}
