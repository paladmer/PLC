// Referenced rda.c

void id(void) {
}

void bool_factor(void) {
	bool_expr();
	if (nextToken == += || nextToken == -= || nextToken == *= || nextToken == ^= || nextToken == /= || nextToken == %= || nextToken == &= || nextToken == |= || nextToken == <<== || nextToken == >>== ) {
		assign_expr();
	}
	if (nextToken == IDENT) {
		id();
	}
}
bool_expr(void) {
}

void relation_expr(void) {
	if (nextToken == )

}

void bool_term(void) {
	bool_factor();
}

void expr(void) {
	 term();
	 while (nextToken == SUB_OP || nextToken == ADD_OP) {
		 lex();
		 term();
	 }
}

void term(void) {
	 factor();
	 while ( nextToken == DIV_OP || nextToken == MULT_OP || nextToken == MOD_OP) {
		 lex();
		 factor();
	 }
	
}


void factor(void) {
	 if (nextToken == INT_LIT || nextToken == IDENT )
		 lex();
		 else
		 	error();
		 }
	
}



