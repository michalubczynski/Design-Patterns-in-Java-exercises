package ObserwatorV3;

import java.util.Observer;

public interface IObservable {
    public void attach(Subskrybent subskrybent);
    public  void  detach(Subskrybent subskrybent);
    public void powiadom();
}
