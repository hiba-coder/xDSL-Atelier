package abstractsyntax.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import productionlinesystem.abstractsyntax.Container;
import productionlinesystem.abstractsyntax.Part;

@Aspect(className = Container.class)
@SuppressWarnings("all")
public abstract class ContainerAspect extends ProductionLineElementAspect {
  @Step
  public static void moveAlong(final Container _self) {
    final abstractsyntax.aspects.ContainerAspectContainerAspectProperties _self_ = abstractsyntax.aspects.ContainerAspectContainerAspectContext.getSelf(_self);
    	// BeginInjectInto abstractsyntax.aspects.ContainerAspect#void moveAlong() from abstractsyntax.aspects.ConveyorAspect
    		if (_self instanceof productionlinesystem.abstractsyntax.Conveyor){
    			abstractsyntax.aspects.ConveyorAspect.moveAlong((productionlinesystem.abstractsyntax.Conveyor)_self);
    		} else
    		// EndInjectInto abstractsyntax.aspects.ContainerAspect#void moveAlong() from abstractsyntax.aspects.ConveyorAspect
    // #DispatchPointCut_before# void moveAlong()
    if (_self instanceof productionlinesystem.abstractsyntax.Container){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			abstractsyntax.aspects.ContainerAspect._privk3_moveAlong(_self_, (productionlinesystem.abstractsyntax.Container)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Container", "moveAlong");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  public static EObjectContainmentEList<Part> currentParts(final Container _self) {
    final abstractsyntax.aspects.ContainerAspectContainerAspectProperties _self_ = abstractsyntax.aspects.ContainerAspectContainerAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# EObjectContainmentEList<Part> currentParts()
    if (_self instanceof productionlinesystem.abstractsyntax.Container){
    	result = abstractsyntax.aspects.ContainerAspect._privk3_currentParts(_self_, (productionlinesystem.abstractsyntax.Container)_self);
    };
    return (org.eclipse.emf.ecore.util.EObjectContainmentEList<productionlinesystem.abstractsyntax.Part>)result;
  }
  
  public static void currentParts(final Container _self, final EObjectContainmentEList<Part> currentParts) {
    final abstractsyntax.aspects.ContainerAspectContainerAspectProperties _self_ = abstractsyntax.aspects.ContainerAspectContainerAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentParts(EObjectContainmentEList<Part>)
    if (_self instanceof productionlinesystem.abstractsyntax.Container){
    	abstractsyntax.aspects.ContainerAspect._privk3_currentParts(_self_, (productionlinesystem.abstractsyntax.Container)_self,currentParts);
    };
  }
  
  protected static void _privk3_moveAlong(final ContainerAspectContainerAspectProperties _self_, final Container _self) {
  }
  
  protected static EObjectContainmentEList<Part> _privk3_currentParts(final ContainerAspectContainerAspectProperties _self_, final Container _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentParts") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.eclipse.emf.ecore.util.EObjectContainmentEList) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentParts;
  }
  
  protected static void _privk3_currentParts(final ContainerAspectContainerAspectProperties _self_, final Container _self, final EObjectContainmentEList<Part> currentParts) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentParts")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentParts);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentParts = currentParts;
    }
  }
}
