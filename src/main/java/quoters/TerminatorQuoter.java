package quoters;

import javax.annotation.PostConstruct;

/**
 * Created by super on 01/10/2018.
 */
@DeprecatedClass(newImpl = T1000.class)
@Profiling
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt (min = 2, max = 7)
    private int repeat;

    private String message;

    @PostConstruct
    public void init ()
    {
        System.out.println("Phase 2");
        System.out.println(repeat);
    }

    public TerminatorQuoter() {
        System.out.println("Phase 1");
    }

    @Override
    @PostProxy
    public void sayQuote() {
        System.out.println("Phase 3");
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
