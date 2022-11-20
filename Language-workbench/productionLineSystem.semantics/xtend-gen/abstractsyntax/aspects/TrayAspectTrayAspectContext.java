package abstractsyntax.aspects;

import java.util.Map;
import productionlinesystem.abstractsyntax.Tray;

@SuppressWarnings("all")
public class TrayAspectTrayAspectContext {
  public static final TrayAspectTrayAspectContext INSTANCE = new TrayAspectTrayAspectContext();
  
  public static TrayAspectTrayAspectProperties getSelf(final Tray _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new abstractsyntax.aspects.TrayAspectTrayAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Tray, TrayAspectTrayAspectProperties> map = new java.util.WeakHashMap<productionlinesystem.abstractsyntax.Tray, abstractsyntax.aspects.TrayAspectTrayAspectProperties>();
  
  public Map<Tray, TrayAspectTrayAspectProperties> getMap() {
    return map;
  }
}
