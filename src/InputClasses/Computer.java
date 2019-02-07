package InputClasses;

public class Computer {
    class Processor {
        private boolean isStart;

        public void start() {
            isStart = true;
        }

        public void shutdown() {
            isStart = false;
        }
    }

    class RAM {
        private boolean isStart;

        public void start() {
            isStart = true;
            System.out.println("Start?: " + isStart);
        }

        public void shutdown() {
            isStart = false;
        }
    }

    Processor i7 = new Processor();
    RAM transfer = new RAM();
}
