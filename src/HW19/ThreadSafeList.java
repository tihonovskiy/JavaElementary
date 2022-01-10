package HW19;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import static HW19.Main.doSleep;

public class ThreadSafeList {
    CopyOnWriteArrayList<String> worlds = new CopyOnWriteArrayList<>();

    public synchronized void add(String newWorld) {
        doSleep(1000, 2000);
        worlds.add(newWorld);
    }

    public synchronized void remove(int index) {
        doSleep(1000, 2000);
        worlds.remove(index);
    }

    public synchronized List<String> get(){
        doSleep(1000, 2000);
        return this.worlds;
    }

    public synchronized String get(int index){
        doSleep(1000, 2000);
        return this.worlds.get(index);
    }

}
