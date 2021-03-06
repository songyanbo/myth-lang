package com.keenant.myth.lang.statement;

import com.keenant.myth.CompileContext;
import com.keenant.myth.lang.expression.Expression;
import com.keenant.myth.lang.scope.LocalScope;
import lombok.ToString;
import org.objectweb.asm.MethodVisitor;

@ToString
public class ExpressionStatement extends Statement {
  private final Expression expr;

  public ExpressionStatement(Expression expr) {
    this.expr = expr;
  }

  @Override
  public void analyze(LocalScope scope, CompileContext context) {
    expr.analyze(scope, context);
  }

  @Override
  public void codegen(MethodVisitor mv) {
    expr.codegen(mv);
  }
}
