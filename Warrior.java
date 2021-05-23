public class Warrior extends Character {
    public Warrior(String name){
        super(name, "Warrior");
        System.out.println(this.name + ": My name will go down in history!");
    }

    @Override
    public void attack(String weapon){
        if (weapon.equals("hammer") || weapon.equals("sword")){
            super.attack(weapon);
            System.out.println(this.name + ": I’ll crush you with my " + weapon + "!");
        }
    }
}
