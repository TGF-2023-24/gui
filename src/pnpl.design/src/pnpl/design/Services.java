package pnpl.design;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import java.util.List;
/**
 * The services class used by VSM.
 */

public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
	 public EObject myService(EObject self, String arg) {
	       // TODO Auto-generated code
	      return self;
	    }
	 
	 public void clearRequires(EObject element) {
	        if (element != null) {
	            EStructuralFeature childsFeature = element.eClass().getEStructuralFeature("childs");
	            if (childsFeature != null) {
	                Object childsValue = element.eGet(childsFeature);
	                if (childsValue instanceof List<?>) {
	                    List<?> childsList = (List<?>) childsValue;
	                    for (Object child : childsList) {
	                        if (child instanceof EObject) {
	                            EObject childEObject = (EObject) child;
	                            EStructuralFeature requiresFeature = childEObject.eClass().getEStructuralFeature("requires");
	                            if (requiresFeature != null) {
	                                childEObject.eSet(requiresFeature, null);
	                            }
	                        }
	                    }
	                }
	            }
	        }
	    }
   
}
