package HomeWorkThreadGuardTwo;

public class Guard {
        private String name;
        private boolean sleeping;

        public Guard(String name) {
            this.name = name;
            this.sleeping = false;
        }

        public void switchShift(Guard otherGuard) {
            if (this.sleeping) {
                System.out.println(this.name + " is sleeping");
                this.sleeping = false;
                otherGuard.sleeping = true;
                System.out.println(otherGuard.name + " is now on duty");
            } else {
                System.out.println(this.name + " is already on duty");
            }
        }
    }



