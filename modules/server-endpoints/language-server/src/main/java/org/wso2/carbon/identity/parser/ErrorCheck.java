package org.wso2.carbon.identity.parser;


import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;

/**
 * ErrorCheck class #Todo Add relevant comments.
 */
public class ErrorCheck extends DefaultErrorStrategy {
    private LS ls;
    public ErrorCheck(LS ls) {
        this.ls = ls;
    }

    @Override
    public void reportError(Parser recognizer, RecognitionException e) {
        recognizer.getContext();

    }

    @Override
    protected void reportInputMismatch(Parser recognizer, InputMismatchException e) {
        recognizer.getContext();
    }

    @Override
    protected void reportMissingToken(Parser recognizer) {
        recognizer.getContext();
    }

    @Override
    protected void reportNoViableAlternative(Parser recognizer, NoViableAltException e) {
        recognizer.getContext();
    }

    @Override
    protected void reportUnwantedToken(Parser recognizer) {
        recognizer.getContext();
    }
}
