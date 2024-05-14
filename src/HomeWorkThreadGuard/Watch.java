package HomeWorkThreadGuard;

public class Watch {


            private boolean sleeping;

        public Watch() {
            this.sleeping = true;
        }

        public synchronized void wakeUp() {
            sleeping = false;
            notify();
            try {
                while (sleeping) {
                    wait();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            sleeping = true;
            notify();
        }
    }

