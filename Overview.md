# RPG Game Data and Operations

## 1. How and Where to Store Data

Character data is stored as instances of the `RPG_character` class.

```java
public class RPG_character {
    private final String name;
    private int level;
    private double health;
    private double mana;
    // Other attributes...

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
