package idv.design.pattern.observer.example1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @author Carl Lu
 */
public class ObserverPatternExample1Test {

    @Test
    public void testObserverPattern() {
        final String state = "FOO";
        final ConcreteSubject subject = new ConcreteSubject();

        final ConcreteObserver observer1 = new ConcreteObserver();
        final ConcreteObserver observer2 = new ConcreteObserver();
        final ConcreteObserver observer3 = new ConcreteObserver();

        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);

        assertNull(observer1.getObserverState());
        assertNull(observer2.getObserverState());
        assertNull(observer3.getObserverState());

        subject.setSubjectState(state);

        assertEquals(state, observer1.getObserverState());
        assertEquals(state, observer2.getObserverState());
        assertEquals(state, observer3.getObserverState());
    }

}
