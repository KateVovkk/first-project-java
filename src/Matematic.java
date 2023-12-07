public class Matematic {
        String name;
        String surname;
       private int speed; // скорость вычисления математиком от 1 до 100
        private int educationlevel; // образование от 0 до 10

        public Matematic(int speed, int educationlevel) {
                if (speed>1 || speed>100){

                        throw new RuntimeException("Скорость должна быть между 1 - 100, введено значение: " + speed) }

                if (speed>1 || speed>100){
                                throw new RuntimeException("Скорость должна быть между 1 - 100, введено значение: " + speed)
                        } else{
                                this.speed = speed;
                        }
                        this.educationlevel = educationlevel;
                }

        public int getSpeed() {
                return speed;
        }

        public int getEducationlevel() {
                return educationlevel;
        }

        public double calculateSquareSurface(double side){
                        if (educationlevel) >= 2 {
                                System.out.println("Я начал работать.");

                        if (side <= 0) {
                                //нужно выбрасывать ошибку
                                System.out.println("Строна квадрата не может быть отрицательной");
                                return -1;
                        }
                }
                return side * side;
        }

}
