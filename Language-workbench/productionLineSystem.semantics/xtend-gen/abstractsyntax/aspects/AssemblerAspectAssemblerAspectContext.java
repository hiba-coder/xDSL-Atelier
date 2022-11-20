package abstractsyntax.aspects;

import java.util.Map;
import productionlinesystem.abstractsyntax.Assembler;

@SuppressWarnings("all")
public class AssemblerAspectAssemblerAspectContext {
  public static final AssemblerAspectAssemblerAspectContext INSTANCE = new AssemblerAspectAssemblerAspectContext();
  
  public static AssemblerAspectAssemblerAspectProperties getSelf(final Assembler _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new abstractsyntax.aspects.AssemblerAspectAssemblerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Assembler, AssemblerAspectAssemblerAspectProperties> map = new java.util.WeakHashMap<productionlinesystem.abstractsyntax.Assembler, abstractsyntax.aspects.AssemblerAspectAssemblerAspectProperties>();
  
  public Map<Assembler, AssemblerAspectAssemblerAspectProperties> getMap() {
    return map;
  }
}
