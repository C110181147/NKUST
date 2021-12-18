public class role {
    public static void main(String[] args) {

        skill Archer = new skill(15, 10, 30, "阿杜", "普攻", "技能", "裝備");
        Archer.Displaydata();
        Archer.displayskill();

        skill Berserker = new skill(20, 5, 15, "黑輪","普攻","技能","裝備");
        Berserker.Displaydata();
        Berserker.displayskill();

        skill Magician = new skill(10, 30, 40, "老婆","普攻","技能","裝備");
        Magician.Displaydata();
        Magician.displayskill();
    }
}
