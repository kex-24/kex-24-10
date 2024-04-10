public class GenshinCharacter {

    private String name;
    private String element;
    private int level;
    private int hp;
    private boolean isConcious;

    public GenshinCharacter(String name, String element, int level, int hp, boolean isConcious) {
        this.name = name;
        this.element = element;
        this.level = level;
        this.hp = hp;
        this.isConcious = isConcious;
    }

    public String getName() {
        return name;
    }

    public String getElement() {
        return element;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public boolean isConcious() {
        return isConcious;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setConcious(boolean concious) {
        isConcious = concious;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Element: " +  this.element);
        System.out.println("Level: " + this.level);
        System.out.println("HP: " + this.hp);
        System.out.println("Is concious: " + this.isConcious);
    }

    public void elementalBurst(GenshinCharacter enemy) {
        int damage = this.hp / 10;
        enemy.setHp(enemy.getHp() - damage);
    }

    public static void main(String[] args) {

        GenshinCharacter childe = new GenshinCharacter("Tartaglia", "Hydro", 90, 13103, true);
        childe.printInfo();
        GenshinCharacter morax = new GenshinCharacter("Zhongli", "Geo", 90, 14695, true);
        morax.printInfo();
        childe.elementalBurst(morax);
        morax.printInfo();
    }
}
