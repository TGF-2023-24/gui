package pnpl.design;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.jface.window.Window;
/**
 * The services class used by VSM.
 */

public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
	 public String parseExpression(EObject expression) {
	        // Check if the object is a Feature
	        if (expression.eClass().getName().equals("Feature")) {
	            EObject feature = (EObject) expression.eGet(expression.eClass().getEStructuralFeature("feature"));
	            return (String) feature.eGet(feature.eClass().getEStructuralFeature("name"));
	        
	        // Check if the object is a UnaryExpression
	        } else if (expression.eClass().getName().equals("UnaryExpression")) {
	            String operator = expression.eGet(expression.eClass().getEStructuralFeature("operator")).toString();
	            EObject right = (EObject) expression.eGet(expression.eClass().getEStructuralFeature("right"));
	            return operator + "(" + parseExpression(right) + ")";
	        
	        // Check if the object is a BinaryExpression
	        } else if (expression.eClass().getName().equals("BinaryExpression")) {
	            EObject left = (EObject) expression.eGet(expression.eClass().getEStructuralFeature("left"));
	            String operator = expression.eGet(expression.eClass().getEStructuralFeature("operator")).toString();
	            EObject right = (EObject) expression.eGet(expression.eClass().getEStructuralFeature("right"));
	            return "(" + parseExpression(left) + " " + operator + " " + parseExpression(right) + ")";
	        } 
	        
	        // Return a default value for unknown expressions
	        return "--Invalid Expression--";
	    }
	 
	 /**
	     * Opens a dialog for editing or composing expressions.
	     * @param currentExpression The current expression to be edited.
	     * @return The new expression entered by the user.
	     */
	 /**
	     * Opens a dialog for editing or composing expressions on an EObject.
	     * @param eObject The EObject containing the expression attribute.
	     */
	    public void openExpressionEditor(EObject eObject) {
	        // Assume that the EObject has an attribute called "expression" of type String
	        String currentExpression = (String) eObject.eGet(eObject.eClass().getEStructuralFeature("expression"));

	        // Create an input dialog for editing the expression
	        InputDialog dialog = new InputDialog(Display.getDefault().getActiveShell(),
	                                             "Edit Expression",
	                                             "Compose your expression:",
	                                             currentExpression,
	                                             input -> {
	                                                 // Validation logic for the expression
	                                                 if (input == null || input.trim().isEmpty()) {
	                                                     return "Expression cannot be empty";
	                                                 }
	                                                 // Add further validation logic here if necessary
	                                                 return null;
	                                             });

	        // Open the dialog and check if OK was pressed
	        if (dialog.open() == Window.OK) {
	            String newExpression = dialog.getValue();
	            if (!newExpression.equals(currentExpression)) {
	                // Set the new expression value back to the EObject
	                eObject.eSet(eObject.eClass().getEStructuralFeature("expression"), newExpression);
	            }
	        }
	    }
	 
}
