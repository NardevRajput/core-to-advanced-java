class diceRoll {


    int roll(){
        double random = Math.random() * 6;
        return (int)Math.ceil(random);
    }
    public static void main(String[] args) {
        diceRoll dice = new diceRoll();
        int roll = dice.roll();
        System.out.println(roll);

        for (int i = 0; i < 10; i++) {
            System.out.println(dice.roll());
        }
    }
}
