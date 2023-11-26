public class RPG_character {

    private final String name;
    private int level;
    private final double BaseSpeed;
    private double MaxHp,MaxMana,Hp,Mana,Atk,MaxSpeed,current_Speed;
    private Sword Sword;
    private Shield Shield;
    public RPG_character(String name,int _level,double _BaseSpeed){
        this.name = name;
        level = _level;
        MaxHp = 100+10*level;
        Hp = MaxHp;
        MaxMana = 50+2*level;
        Mana = MaxMana;
        Atk = 10+2*level;
        BaseSpeed = _BaseSpeed;
        MaxSpeed = BaseSpeed*(0.1+0.03*level);
        Sword = null;
        Shield = null;
    }
    public void LevelUp(){
        level++;
        if(Hp == MaxHp){
            Hp = 100+10*level;
        }
        if(Mana == MaxMana){
            Mana = 50+2*level;
        }
        MaxHp = 100+10*level;
        MaxMana = 50+2*level;
        Atk = 10+4*level;
        MaxSpeed = BaseSpeed*(0.1+0.03*level);
    }
    public  double attack(){
        if(Sword != null){
            return Sword.getSwordDamage()+Atk;
        }
        return Atk;
    }
    public void beAttacked(double damage){
        if(Shield != null){
            if(Shield.getShieldDefense() >= damage){
                System.out.println("U Take no damage");
            }else{
                Hp = Math.max((Hp - (damage-Shield.getShieldDefense())), 0);
            }
        }
        Hp = Math.max((Hp - damage), 0);
    }
    public void Equip(Sword sword){
        if(Sword == null){
            this.Sword = sword;
        }else{
            System.out.println("You already equip Sword!!!");
        }
    }
    public void Equip(Shield shield){
        if(Shield == null){
            this.Shield = new Shield(shield.getBaseDefense(),shield.getLevel());
        }else{
            System.out.println("You already equip Shield!!!");
        }
    }
    public void UnEquip(){
        Sword = null;
        Shield = null;
    }
    public void UnEquip(String equipment){
        if(equipment.equals("Sword")){
            Sword = null;
        }else if(equipment.equals("Shield")){
            Shield = null;
        }else{
            System.out.println("I don't know what equipment U want to Unequipped");
        }
    }
    public void ShowStat(){
        System.out.println("----------------------------------------------------------------");
        System.out.println(name +" level = " + level);
        System.out.println(name +" Hp = " + Hp + "/" + MaxHp);
        System.out.println(name +" Mp = " + Mana + "/" + MaxMana);
        System.out.println("Sword : " + (Sword != null ? "Sword" + " Lv." + Sword.getLevel(): "Nothing"));
        System.out.println("Shield : " + (Shield != null ? "Shield" + " Lv." + Shield.getLevel(): "Nothing"));
    }
}