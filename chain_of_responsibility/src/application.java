public class application {
    public static void main(String[] args) {
        intern_level il=new intern_level();
        associate_level al=new associate_level();
        manager_level ml=new manager_level();
        boss_level bl=new boss_level();
        takedecision td=new takedecision();

        td.setSuccessor(il);
        il.setSuccessor(al);
        al.setSuccessor(ml);
        ml.setSuccessor(bl);

        decision decision1=new decision(1,"Boss","important");
        System.out.println(td.applyapproval(decision1));
        System.out.println("");

        decision decision2=new decision(2,"Intern","notimportant");
        System.out.println(td.applyapproval(decision2));
        System.out.println("");

        decision decision3=new decision(3,"Manager","moderatelyimportant");
        System.out.println(td.applyapproval(decision3));
        System.out.println("");

        decision decision4=new decision(4,"Associate","lessimportant");
        System.out.println(td.applyapproval(decision4));
        System.out.println("");


    }
}
