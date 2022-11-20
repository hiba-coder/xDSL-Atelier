package abstractsyntax.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import productionlinesystem.abstractsyntax.AbstractsyntaxFactory;
import productionlinesystem.abstractsyntax.GenHead;
import productionlinesystem.abstractsyntax.Head;

@Aspect(className = GenHead.class)
@SuppressWarnings("all")
public class GenHeadAspect extends GeneratorAspect {
  @Step
  @OverrideAspectMethod
  @ReplaceAspectMethod
  public static void start(final GenHead _self) {
    final abstractsyntax.aspects.GenHeadAspectGenHeadAspectProperties _self_ = abstractsyntax.aspects.GenHeadAspectGenHeadAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void start()
    if (_self instanceof productionlinesystem.abstractsyntax.GenHead){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			abstractsyntax.aspects.GenHeadAspect._privk3_start(_self_, (productionlinesystem.abstractsyntax.GenHead)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "GenHead", "start");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  private static void super_start(final GenHead _self) {
    final abstractsyntax.aspects.MachineAspectMachineAspectProperties _self_ = abstractsyntax.aspects.MachineAspectMachineAspectContext.getSelf(_self);
     abstractsyntax.aspects.MachineAspect._privk3_start(_self_, _self);
  }
  
  protected static void _privk3_start(final GenHeadAspectGenHeadAspectProperties _self_, final GenHead _self) {
    String _name = _self.getName();
    String _plus = ("I am in the Generator of the  Head name \'" + _name);
    String _plus_1 = (_plus + "\'");
    InputOutput.<String>println(_plus_1);
    Head aHead = AbstractsyntaxFactory.eINSTANCE.createHead();
    ContainerAspect.currentParts(_self.getOut()).add(aHead);
    return;
  }
}
