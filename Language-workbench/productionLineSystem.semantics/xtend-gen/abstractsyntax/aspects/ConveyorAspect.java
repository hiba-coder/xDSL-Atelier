package abstractsyntax.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import productionlinesystem.abstractsyntax.Conveyor;

@Aspect(className = Conveyor.class)
@SuppressWarnings("all")
public class ConveyorAspect extends ContainerAspect {
  @Step
  @ReplaceAspectMethod
  @OverrideAspectMethod
  public static void moveAlong(final Conveyor _self) {
    final abstractsyntax.aspects.ConveyorAspectConveyorAspectProperties _self_ = abstractsyntax.aspects.ConveyorAspectConveyorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void moveAlong()
    if (_self instanceof productionlinesystem.abstractsyntax.Conveyor){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			abstractsyntax.aspects.ConveyorAspect._privk3_moveAlong(_self_, (productionlinesystem.abstractsyntax.Conveyor)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Conveyor", "moveAlong");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  private static void super_moveAlong(final Conveyor _self) {
    final abstractsyntax.aspects.ContainerAspectContainerAspectProperties _self_ = abstractsyntax.aspects.ContainerAspectContainerAspectContext.getSelf(_self);
     abstractsyntax.aspects.ContainerAspect._privk3_moveAlong(_self_, _self);
  }
  
  protected static void _privk3_moveAlong(final ConveyorAspectConveyorAspectProperties _self_, final Conveyor _self) {
    if (((_self.getTray() != null) && (!ContainerAspect.currentParts(_self).isEmpty()))) {
      String _name = _self.getName();
      String _plus = ("I am in the Conveyor name \'" + _name);
      String _plus_1 = (_plus + "\', i work to transmit the current part to the Tray");
      InputOutput.<String>println(_plus_1);
      ContainerAspect.currentParts(_self.getTray()).add(ContainerAspect.currentParts(_self).remove(0));
    } else {
      boolean _isEmpty = ContainerAspect.currentParts(_self).isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        String _name_1 = _self.getName();
        String _plus_2 = ("I am in the Conveyor name \'" + _name_1);
        String _plus_3 = (_plus_2 + "\'");
        InputOutput.<String>println(_plus_3);
        InputOutput.<String>println("End of the line");
        InputOutput.<String>println("/**********************************/");
        InputOutput.<String>println("\n\n\n");
        ContainerAspect.currentParts(_self).remove(0);
      }
    }
  }
}
