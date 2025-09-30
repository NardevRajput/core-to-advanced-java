class car_final {
    final int noOfWheels;
    final String model;
    final String engineInLiters;

    public car_final(int noOfWheels, String model, String engineInLiters){
        this.noOfWheels = noOfWheels;
        this.model = model;
        this.engineInLiters = engineInLiters;
    }

    @Override
    public String toString() {
        return "Car details:- " +
        "No. of wheels: "+ noOfWheels +
                ", Model number: "+ model +
                ", Engine capacity: "+engineInLiters;
    }

    public static void main(String[] args) {
        car_final myCar = new car_final(4, "BMW", "20");
        System.out.println(myCar.noOfWheels);
        System.out.println(myCar.model);
        System.out.println(myCar.engineInLiters);

        //toString
        System.out.println(myCar);
    }
}
