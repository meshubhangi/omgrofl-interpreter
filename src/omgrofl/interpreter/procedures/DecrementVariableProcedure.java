package omgrofl.interpreter.procedures;

import omgrofl.interpreter.Globals;

public class DecrementVariableProcedure extends AbstractVariableProcedure {

    @Override
    public String getName() {
        return Globals.decrementVariableOperator;
    }

    @Override
    public Object execute() {
        incrementVariableBy(-1);
        return null;
    }
}