import java.lang.ref.Cleaner;

class GarbageCollection {

    private static final Cleaner cleaner = Cleaner.create();

    private final Cleaner.Cleanable cleanable;

    public GarbageCollection(String name) {
        this.cleanable = cleaner.register(this, new CleanupTask(name));
    }

    static class CleanupTask implements Runnable {
        private final String name;

        CleanupTask(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("Cleaned up: " + name);
        }
    }

    public static void main(String[] args) {
        GarbageCollection obj1 = new GarbageCollection("Object1");
        GarbageCollection obj2 = new GarbageCollection("Object2");

        obj1 = null;
        obj2 = null;

        System.gc();
        System.out.println("End of main method");
    }
}
