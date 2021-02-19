package warriors.engine;

public abstract class LocalHero implements warriors.contracts.Hero {
    protected String heroName;
    protected int lifeLevel;
    protected int attackLevel;
    protected Weapon weapon;
    protected Spell spell;

    public LocalHero (String name, Integer life, Integer attack) {
        heroName = name;
        lifeLevel = life;
        attackLevel = attack;
    }

    @Override
    public String getName() {
        return heroName;
    }

    @Override
    public int getLife() {
        return lifeLevel;
    }

    @Override
    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }
    public void setLifeLevel(int lifeLevel) {
        this.lifeLevel = lifeLevel;
    }

    public abstract int getMaxLife();

    public abstract int getMaxAttack();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon)
    {
        this.weapon = weapon;
    }

    public void setSpell(Spell spell)
    {
        this.spell = spell;
    }

    public void deleteWeapon(){
        if (this.weapon != null) {
            attackLevel = attackLevel - weapon.getAttackLevel();
        }
    }

    public void deleteSpell(){
        if (this.spell != null) {
            attackLevel = attackLevel - spell.getAttackLevel();
        }
    }
}
