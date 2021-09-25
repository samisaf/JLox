package com.ssafadi.lox;

public abstract class _Expr {
}

class Binary extends _Expr {
    final _Expr left;
    final _Expr right;
    final Token operator;

    Binary(_Expr left, _Expr right, Token operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }
}