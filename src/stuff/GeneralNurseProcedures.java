package stuff;

public interface GeneralNurseProcedures {
    default void makeBandage(){
        System.out.println("Making a bandage");
    }
    default void giveInjection(){
        System.out.println("Giving an injection");
    }
}
