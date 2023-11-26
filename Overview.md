# RPG Game Data and Operations

## 1. How and Where to Store Data

Character data is stored as instances of the `RPG_character` class.

```java
public class RPG_character {
    private final String name;
    private int level;
    private double health;
    private double mana;
    // Other fields

    // Constructor and methods...
}
```
Equipment data are stored as `Sword` and `Shield`classes.
```java
public class Sword {
    private final int baseDamage;
    private int level;
    private double SwordDamage;

    // Constructor and methods...
}
```
```java
public class Shield {
    private final int baseDefense;
    private int level;
    private double ShieldDefense;

    // Constructor and methods...
}
```

## 2. What Operations are Needed

Character Operations
* Level Up() : void - ตัวละครจะมีการ level up ขึ้นได้ โดย LevelUp method in the RPG_character class.
* Equipping/Unequipping Sword: ตัวละครสามารถ ถอด/ใส่ ของ โดย Equip/UnEquip methods in the RPG_character class.
* Equipping/Unequipping Shield: เหมือนกับของ Sword
* attack() : double - return ค่า atk
* beAttack(double) : void - รับค่า damage และทำการคำนวณ hp ใหม่ที่ทำการหักกับ shield แล้ว (ถ้ามี)


Sword and Shield Operations
* levelUp(): void - This method in both the Sword and Shield classes that can leveling up your equipment.


## 3. How and Where to Compute Information
```java
public class RPG_character {
// ... Other fields and methods ...

    public double attack() {
        // คำนวณตอนมี Sword จะทำการนำ (Sword's attack power) + (Character's attack power)
        // ถ้ายังไม่มี Sword ก็ return Character's attack power
    }

    public void beAttacked(double damage) {
        /* 
        ถ้าตอนมี Shield และมีค่ามากกว่า damage ที่ได้รับก็จะให้ไม่ได้รับความเสียหายเลย 
        แต่ถ้ามี Shield น้อยกว่า จะทำให้ได้รับความเสียหายและ hp เหลือ hp - damage-shieldDefense (0 is lowest hp)
        
        ถัาตอนไม่มี Shield ก็โดนเต๋็ม hp เหลือ hp-damage (0 is lowest hp)
         
         */
    }
}
```
```java
public class Sword {
// ... Other fields and methods ...

    public void LevelUp(){ //ตำนวณเพิ่มค่า damage ตาม level จากสูตรที่ให้มา
        Level += 1;
        SwordDamage = BaseDamage*(1+0.1*Level);
    }
}

public class Shield {
// ... Other fields and methods ...

    public void Levelup(){ //ตำนวณเพิ่มค่า Defense ตาม level จากสูตรที่ให้มา
        Level++;
        ShieldDefense = BaseDefense*(1+0.05*Level);
    }
}
```
