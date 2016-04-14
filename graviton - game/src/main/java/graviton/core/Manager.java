package graviton.core;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Botan on 16/06/2015.
 */
public class Manager {
    final private List<graviton.api.Manager> managers;

    public Manager() {
        managers = new ArrayList<>();
    }

    public void add(graviton.api.Manager manager) {
        this.managers.add(manager);
    }

    public Manager start() {
        this.managers.forEach(graviton.api.Manager::load);
        return this;
    }

    public void stop() {
        this.managers.forEach(graviton.api.Manager::unload);
    }

}
