package Practice14;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class Philosopher {
    private final ReentrantLock[] lockList = { new ReentrantLock(), new ReentrantLock(), new ReentrantLock(), new ReentrantLock(), new ReentrantLock()};
    private Semaphore limit = new Semaphore(4);

}
