package HomeWorkThreadGuard;

public class Guard {
        private String name;
        private Watch watch;

        public Guard(String name, Watch watch) {
            this.name = name;
            this.watch = watch;
        }

        public void standOnPost() {
            for (int i = 0; i < 2; i++) {
                System.out.println(name + " is standing on post.");
                try {
                    Thread.sleep(1000); // Guard stands for 1 hour
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(name + " checks the time on the watch.");
                watch.wakeUp(); // Wake up the other guard
                System.out.println(name + " goes to sleep.");
            }
        }
    }





