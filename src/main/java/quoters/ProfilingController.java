package quoters;

/**
 * Created by Erik Feigin on 06/10/2018.
 */
public class ProfilingController implements ProfilingControllerMBean{
    private boolean enabled = true;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
