package abstractsyntax.aspects;

import java.util.Map;
import productionlinesystem.abstractsyntax.GenHead;

@SuppressWarnings("all")
public class GenHeadAspectGenHeadAspectContext {
  public static final GenHeadAspectGenHeadAspectContext INSTANCE = new GenHeadAspectGenHeadAspectContext();
  
  public static GenHeadAspectGenHeadAspectProperties getSelf(final GenHead _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new abstractsyntax.aspects.GenHeadAspectGenHeadAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<GenHead, GenHeadAspectGenHeadAspectProperties> map = new java.util.WeakHashMap<productionlinesystem.abstractsyntax.GenHead, abstractsyntax.aspects.GenHeadAspectGenHeadAspectProperties>();
  
  public Map<GenHead, GenHeadAspectGenHeadAspectProperties> getMap() {
    return map;
  }
}
