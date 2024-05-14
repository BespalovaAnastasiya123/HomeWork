package HomeWorkThreadGuardTwo;


    public class Watch {
        public static void main(String[] args) {
            Guard guard1 = new Guard("Guard 1");
            Guard guard2 = new Guard("Guard 2");

            guard1.switchShift(guard2);
            guard2.switchShift(guard1);
            guard1.switchShift(guard2);
            guard2.switchShift(guard1);
            // и так далее, повторяем процесс смены охранников
        }
    }

