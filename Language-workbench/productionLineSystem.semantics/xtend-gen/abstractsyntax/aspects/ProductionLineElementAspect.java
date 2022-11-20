package abstractsyntax.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import productionlinesystem.abstractsyntax.ProductionLineElement;

@Aspect(className = ProductionLineElement.class)
@SuppressWarnings("all")
public abstract class ProductionLineElementAspect {
  @Step
  public static void work(final ProductionLineElement _self) {
    final abstractsyntax.aspects.ProductionLineElementAspectProductionLineElementAspectProperties _self_ = abstractsyntax.aspects.ProductionLineElementAspectProductionLineElementAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void work()
    if (_self instanceof productionlinesystem.abstractsyntax.ProductionLineElement){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			abstractsyntax.aspects.ProductionLineElementAspect._privk3_work(_self_, (productionlinesystem.abstractsyntax.ProductionLineElement)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "ProductionLineElement", "work");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_work(final ProductionLineElementAspectProductionLineElementAspectProperties _self_, final ProductionLineElement _self) {
  }
}
