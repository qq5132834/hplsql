// Generated from sics\seiois\res\plsql\Plsql.g4 by ANTLR 4.5
package sics.seiois.res.plsql;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlsqlParser}.
 */
public interface PlsqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PlsqlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PlsqlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PlsqlParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PlsqlParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#begin_end_block}.
	 * @param ctx the parse tree
	 */
	void enterBegin_end_block(PlsqlParser.Begin_end_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#begin_end_block}.
	 * @param ctx the parse tree
	 */
	void exitBegin_end_block(PlsqlParser.Begin_end_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#single_block_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSingle_block_stmt(PlsqlParser.Single_block_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#single_block_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSingle_block_stmt(PlsqlParser.Single_block_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#block_end}.
	 * @param ctx the parse tree
	 */
	void enterBlock_end(PlsqlParser.Block_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#block_end}.
	 * @param ctx the parse tree
	 */
	void exitBlock_end(PlsqlParser.Block_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#proc_block}.
	 * @param ctx the parse tree
	 */
	void enterProc_block(PlsqlParser.Proc_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#proc_block}.
	 * @param ctx the parse tree
	 */
	void exitProc_block(PlsqlParser.Proc_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PlsqlParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PlsqlParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon_stmt(PlsqlParser.Semicolon_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon_stmt(PlsqlParser.Semicolon_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#exception_block}.
	 * @param ctx the parse tree
	 */
	void enterException_block(PlsqlParser.Exception_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#exception_block}.
	 * @param ctx the parse tree
	 */
	void exitException_block(PlsqlParser.Exception_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#exception_block_item}.
	 * @param ctx the parse tree
	 */
	void enterException_block_item(PlsqlParser.Exception_block_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#exception_block_item}.
	 * @param ctx the parse tree
	 */
	void exitException_block_item(PlsqlParser.Exception_block_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNull_stmt(PlsqlParser.Null_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNull_stmt(PlsqlParser.Null_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(PlsqlParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(PlsqlParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(PlsqlParser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(PlsqlParser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_item(PlsqlParser.Assignment_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_item(PlsqlParser.Assignment_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_single_item(PlsqlParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_single_item(PlsqlParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_multiple_item(PlsqlParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_multiple_item(PlsqlParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_select_item(PlsqlParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_select_item(PlsqlParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#allocate_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAllocate_cursor_stmt(PlsqlParser.Allocate_cursor_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#allocate_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAllocate_cursor_stmt(PlsqlParser.Allocate_cursor_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#associate_locator_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssociate_locator_stmt(PlsqlParser.Associate_locator_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#associate_locator_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssociate_locator_stmt(PlsqlParser.Associate_locator_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#begin_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBegin_transaction_stmt(PlsqlParser.Begin_transaction_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#begin_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBegin_transaction_stmt(PlsqlParser.Begin_transaction_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(PlsqlParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(PlsqlParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCall_stmt(PlsqlParser.Call_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCall_stmt(PlsqlParser.Call_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#declare_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stmt(PlsqlParser.Declare_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#declare_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stmt(PlsqlParser.Declare_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_block(PlsqlParser.Declare_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_block(PlsqlParser.Declare_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_block_inplace(PlsqlParser.Declare_block_inplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_block_inplace(PlsqlParser.Declare_block_inplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stmt_item(PlsqlParser.Declare_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stmt_item(PlsqlParser.Declare_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#declare_var_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_var_item(PlsqlParser.Declare_var_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#declare_var_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_var_item(PlsqlParser.Declare_var_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#declare_condition_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_condition_item(PlsqlParser.Declare_condition_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#declare_condition_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_condition_item(PlsqlParser.Declare_condition_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_cursor_item(PlsqlParser.Declare_cursor_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_cursor_item(PlsqlParser.Declare_cursor_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#cursor_with_return}.
	 * @param ctx the parse tree
	 */
	void enterCursor_with_return(PlsqlParser.Cursor_with_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#cursor_with_return}.
	 * @param ctx the parse tree
	 */
	void exitCursor_with_return(PlsqlParser.Cursor_with_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#cursor_without_return}.
	 * @param ctx the parse tree
	 */
	void enterCursor_without_return(PlsqlParser.Cursor_without_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#cursor_without_return}.
	 * @param ctx the parse tree
	 */
	void exitCursor_without_return(PlsqlParser.Cursor_without_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#declare_handler_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_handler_item(PlsqlParser.Declare_handler_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#declare_handler_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_handler_item(PlsqlParser.Declare_handler_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_temporary_table_item(PlsqlParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_temporary_table_item(PlsqlParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(PlsqlParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(PlsqlParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_local_temp_table_stmt(PlsqlParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_local_temp_table_stmt(PlsqlParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_definition}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_definition(PlsqlParser.Create_table_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_definition}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_definition(PlsqlParser.Create_table_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_columns}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_columns(PlsqlParser.Create_table_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_columns}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_columns(PlsqlParser.Create_table_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_columns_item(PlsqlParser.Create_table_columns_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_columns_item(PlsqlParser.Create_table_columns_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(PlsqlParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(PlsqlParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_column_inline_cons(PlsqlParser.Create_table_column_inline_consContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_column_inline_cons(PlsqlParser.Create_table_column_inline_consContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_column_cons(PlsqlParser.Create_table_column_consContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_column_cons(PlsqlParser.Create_table_column_consContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_fk_action(PlsqlParser.Create_table_fk_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_fk_action(PlsqlParser.Create_table_fk_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions(PlsqlParser.Create_table_preoptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions(PlsqlParser.Create_table_preoptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions_item(PlsqlParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions_item(PlsqlParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions_td_item(PlsqlParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions_td_item(PlsqlParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_options}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options(PlsqlParser.Create_table_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_options}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options(PlsqlParser.Create_table_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_options_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_item(PlsqlParser.Create_table_options_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_options_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_item(PlsqlParser.Create_table_options_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_ora_item(PlsqlParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_ora_item(PlsqlParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_db2_item(PlsqlParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_db2_item(PlsqlParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_td_item(PlsqlParser.Create_table_options_td_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_td_item(PlsqlParser.Create_table_options_td_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_hive_item(PlsqlParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_hive_item(PlsqlParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_hive_row_format(PlsqlParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_hive_row_format(PlsqlParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_hive_row_format_fields(PlsqlParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_hive_row_format_fields(PlsqlParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_mssql_item(PlsqlParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_mssql_item(PlsqlParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_mysql_item(PlsqlParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_mysql_item(PlsqlParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(PlsqlParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(PlsqlParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#alter_table_item}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_item(PlsqlParser.Alter_table_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#alter_table_item}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_item(PlsqlParser.Alter_table_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add_constraint(PlsqlParser.Alter_table_add_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add_constraint(PlsqlParser.Alter_table_add_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#alter_table_add_constraint_item}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add_constraint_item(PlsqlParser.Alter_table_add_constraint_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#alter_table_add_constraint_item}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add_constraint_item(PlsqlParser.Alter_table_add_constraint_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#dtype}.
	 * @param ctx the parse tree
	 */
	void enterDtype(PlsqlParser.DtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#dtype}.
	 * @param ctx the parse tree
	 */
	void exitDtype(PlsqlParser.DtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#dtype_len}.
	 * @param ctx the parse tree
	 */
	void enterDtype_len(PlsqlParser.Dtype_lenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#dtype_len}.
	 * @param ctx the parse tree
	 */
	void exitDtype_len(PlsqlParser.Dtype_lenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#dtype_attr}.
	 * @param ctx the parse tree
	 */
	void enterDtype_attr(PlsqlParser.Dtype_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#dtype_attr}.
	 * @param ctx the parse tree
	 */
	void exitDtype_attr(PlsqlParser.Dtype_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#dtype_default}.
	 * @param ctx the parse tree
	 */
	void enterDtype_default(PlsqlParser.Dtype_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#dtype_default}.
	 * @param ctx the parse tree
	 */
	void exitDtype_default(PlsqlParser.Dtype_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_database_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_stmt(PlsqlParser.Create_database_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_database_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_stmt(PlsqlParser.Create_database_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_option(PlsqlParser.Create_database_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_option(PlsqlParser.Create_database_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_function_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_stmt(PlsqlParser.Create_function_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_function_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_stmt(PlsqlParser.Create_function_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_function_return}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_return(PlsqlParser.Create_function_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_function_return}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_return(PlsqlParser.Create_function_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_package_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_stmt(PlsqlParser.Create_package_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_package_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_stmt(PlsqlParser.Create_package_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec(PlsqlParser.Package_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec(PlsqlParser.Package_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#package_spec_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec_item(PlsqlParser.Package_spec_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#package_spec_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec_item(PlsqlParser.Package_spec_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_body_stmt(PlsqlParser.Create_package_body_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_body_stmt(PlsqlParser.Create_package_body_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#package_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body(PlsqlParser.Package_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#package_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body(PlsqlParser.Package_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#package_body_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body_item(PlsqlParser.Package_body_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#package_body_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body_item(PlsqlParser.Package_body_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_procedure_stmt(PlsqlParser.Create_procedure_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_procedure_stmt(PlsqlParser.Create_procedure_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_routine_params}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_params(PlsqlParser.Create_routine_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_routine_params}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_params(PlsqlParser.Create_routine_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_param_item(PlsqlParser.Create_routine_param_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_param_item(PlsqlParser.Create_routine_param_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_routine_options}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_options(PlsqlParser.Create_routine_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_routine_options}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_options(PlsqlParser.Create_routine_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_routine_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_option(PlsqlParser.Create_routine_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_routine_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_option(PlsqlParser.Create_routine_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_stmt(PlsqlParser.Drop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_stmt(PlsqlParser.Drop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#end_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEnd_transaction_stmt(PlsqlParser.End_transaction_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#end_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEnd_transaction_stmt(PlsqlParser.End_transaction_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#exec_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExec_stmt(PlsqlParser.Exec_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#exec_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExec_stmt(PlsqlParser.Exec_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(PlsqlParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(PlsqlParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_plsql_stmt(PlsqlParser.If_plsql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_plsql_stmt(PlsqlParser.If_plsql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_tsql_stmt(PlsqlParser.If_tsql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_tsql_stmt(PlsqlParser.If_tsql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_bteq_stmt(PlsqlParser.If_bteq_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_bteq_stmt(PlsqlParser.If_bteq_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#elseif_block}.
	 * @param ctx the parse tree
	 */
	void enterElseif_block(PlsqlParser.Elseif_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#elseif_block}.
	 * @param ctx the parse tree
	 */
	void exitElseif_block(PlsqlParser.Elseif_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(PlsqlParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(PlsqlParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#include_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInclude_stmt(PlsqlParser.Include_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#include_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInclude_stmt(PlsqlParser.Include_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(PlsqlParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(PlsqlParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#insert_stmt_cols}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt_cols(PlsqlParser.Insert_stmt_colsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#insert_stmt_cols}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt_cols(PlsqlParser.Insert_stmt_colsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#insert_stmt_rows}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt_rows(PlsqlParser.Insert_stmt_rowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#insert_stmt_rows}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt_rows(PlsqlParser.Insert_stmt_rowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#insert_stmt_row}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt_row(PlsqlParser.Insert_stmt_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#insert_stmt_row}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt_row(PlsqlParser.Insert_stmt_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#insert_directory_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_directory_stmt(PlsqlParser.Insert_directory_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#insert_directory_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_directory_stmt(PlsqlParser.Insert_directory_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#correct_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCorrect_stmt(PlsqlParser.Correct_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#correct_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCorrect_stmt(PlsqlParser.Correct_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#correct_stmt_cols}.
	 * @param ctx the parse tree
	 */
	void enterCorrect_stmt_cols(PlsqlParser.Correct_stmt_colsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#correct_stmt_cols}.
	 * @param ctx the parse tree
	 */
	void exitCorrect_stmt_cols(PlsqlParser.Correct_stmt_colsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#correct_update_assignment}.
	 * @param ctx the parse tree
	 */
	void enterCorrect_update_assignment(PlsqlParser.Correct_update_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#correct_update_assignment}.
	 * @param ctx the parse tree
	 */
	void exitCorrect_update_assignment(PlsqlParser.Correct_update_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExit_stmt(PlsqlParser.Exit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExit_stmt(PlsqlParser.Exit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#get_diag_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGet_diag_stmt(PlsqlParser.Get_diag_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#get_diag_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGet_diag_stmt(PlsqlParser.Get_diag_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#get_diag_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterGet_diag_stmt_item(PlsqlParser.Get_diag_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#get_diag_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitGet_diag_stmt_item(PlsqlParser.Get_diag_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#get_diag_stmt_exception_item}.
	 * @param ctx the parse tree
	 */
	void enterGet_diag_stmt_exception_item(PlsqlParser.Get_diag_stmt_exception_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#get_diag_stmt_exception_item}.
	 * @param ctx the parse tree
	 */
	void exitGet_diag_stmt_exception_item(PlsqlParser.Get_diag_stmt_exception_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#get_diag_stmt_rowcount_item}.
	 * @param ctx the parse tree
	 */
	void enterGet_diag_stmt_rowcount_item(PlsqlParser.Get_diag_stmt_rowcount_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#get_diag_stmt_rowcount_item}.
	 * @param ctx the parse tree
	 */
	void exitGet_diag_stmt_rowcount_item(PlsqlParser.Get_diag_stmt_rowcount_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#grant_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGrant_stmt(PlsqlParser.Grant_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#grant_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGrant_stmt(PlsqlParser.Grant_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#grant_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterGrant_stmt_item(PlsqlParser.Grant_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#grant_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitGrant_stmt_item(PlsqlParser.Grant_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#leave_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLeave_stmt(PlsqlParser.Leave_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#leave_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLeave_stmt(PlsqlParser.Leave_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#map_object_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMap_object_stmt(PlsqlParser.Map_object_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#map_object_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMap_object_stmt(PlsqlParser.Map_object_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#open_stmt}.
	 * @param ctx the parse tree
	 */
	void enterOpen_stmt(PlsqlParser.Open_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#open_stmt}.
	 * @param ctx the parse tree
	 */
	void exitOpen_stmt(PlsqlParser.Open_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#fetch_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFetch_stmt(PlsqlParser.Fetch_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#fetch_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFetch_stmt(PlsqlParser.Fetch_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#collect_stats_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCollect_stats_stmt(PlsqlParser.Collect_stats_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#collect_stats_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCollect_stats_stmt(PlsqlParser.Collect_stats_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#collect_stats_clause}.
	 * @param ctx the parse tree
	 */
	void enterCollect_stats_clause(PlsqlParser.Collect_stats_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#collect_stats_clause}.
	 * @param ctx the parse tree
	 */
	void exitCollect_stats_clause(PlsqlParser.Collect_stats_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#close_stmt}.
	 * @param ctx the parse tree
	 */
	void enterClose_stmt(PlsqlParser.Close_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#close_stmt}.
	 * @param ctx the parse tree
	 */
	void exitClose_stmt(PlsqlParser.Close_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#cmp_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCmp_stmt(PlsqlParser.Cmp_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#cmp_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCmp_stmt(PlsqlParser.Cmp_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#cmp_source}.
	 * @param ctx the parse tree
	 */
	void enterCmp_source(PlsqlParser.Cmp_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#cmp_source}.
	 * @param ctx the parse tree
	 */
	void exitCmp_source(PlsqlParser.Cmp_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#copy_from_local_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCopy_from_local_stmt(PlsqlParser.Copy_from_local_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#copy_from_local_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCopy_from_local_stmt(PlsqlParser.Copy_from_local_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#copy_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCopy_stmt(PlsqlParser.Copy_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#copy_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCopy_stmt(PlsqlParser.Copy_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#copy_source}.
	 * @param ctx the parse tree
	 */
	void enterCopy_source(PlsqlParser.Copy_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#copy_source}.
	 * @param ctx the parse tree
	 */
	void exitCopy_source(PlsqlParser.Copy_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#copy_target}.
	 * @param ctx the parse tree
	 */
	void enterCopy_target(PlsqlParser.Copy_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#copy_target}.
	 * @param ctx the parse tree
	 */
	void exitCopy_target(PlsqlParser.Copy_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#copy_option}.
	 * @param ctx the parse tree
	 */
	void enterCopy_option(PlsqlParser.Copy_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#copy_option}.
	 * @param ctx the parse tree
	 */
	void exitCopy_option(PlsqlParser.Copy_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#copy_file_option}.
	 * @param ctx the parse tree
	 */
	void enterCopy_file_option(PlsqlParser.Copy_file_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#copy_file_option}.
	 * @param ctx the parse tree
	 */
	void exitCopy_file_option(PlsqlParser.Copy_file_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommit_stmt(PlsqlParser.Commit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommit_stmt(PlsqlParser.Commit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(PlsqlParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(PlsqlParser.Create_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_index_col}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_col(PlsqlParser.Create_index_colContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_index_col}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_col(PlsqlParser.Create_index_colContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#index_storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_storage_clause(PlsqlParser.Index_storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#index_storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_storage_clause(PlsqlParser.Index_storage_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_mssql_storage_clause(PlsqlParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_mssql_storage_clause(PlsqlParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(PlsqlParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(PlsqlParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#quit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterQuit_stmt(PlsqlParser.Quit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#quit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitQuit_stmt(PlsqlParser.Quit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmt(PlsqlParser.Raise_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmt(PlsqlParser.Raise_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#resignal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterResignal_stmt(PlsqlParser.Resignal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#resignal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitResignal_stmt(PlsqlParser.Resignal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(PlsqlParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(PlsqlParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRollback_stmt(PlsqlParser.Rollback_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRollback_stmt(PlsqlParser.Rollback_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#set_session_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_session_option(PlsqlParser.Set_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#set_session_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_session_option(PlsqlParser.Set_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#set_current_schema_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_current_schema_option(PlsqlParser.Set_current_schema_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#set_current_schema_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_current_schema_option(PlsqlParser.Set_current_schema_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#set_mssql_session_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_mssql_session_option(PlsqlParser.Set_mssql_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#set_mssql_session_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_mssql_session_option(PlsqlParser.Set_mssql_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#set_teradata_session_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_teradata_session_option(PlsqlParser.Set_teradata_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#set_teradata_session_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_teradata_session_option(PlsqlParser.Set_teradata_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#signal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSignal_stmt(PlsqlParser.Signal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#signal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSignal_stmt(PlsqlParser.Signal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#summary_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSummary_stmt(PlsqlParser.Summary_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#summary_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSummary_stmt(PlsqlParser.Summary_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#truncate_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTruncate_stmt(PlsqlParser.Truncate_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#truncate_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTruncate_stmt(PlsqlParser.Truncate_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#use_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUse_stmt(PlsqlParser.Use_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#use_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUse_stmt(PlsqlParser.Use_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#values_into_stmt}.
	 * @param ctx the parse tree
	 */
	void enterValues_into_stmt(PlsqlParser.Values_into_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#values_into_stmt}.
	 * @param ctx the parse tree
	 */
	void exitValues_into_stmt(PlsqlParser.Values_into_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(PlsqlParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(PlsqlParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#for_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_cursor_stmt(PlsqlParser.For_cursor_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#for_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_cursor_stmt(PlsqlParser.For_cursor_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#for_range_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_range_stmt(PlsqlParser.For_range_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#for_range_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_range_stmt(PlsqlParser.For_range_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(PlsqlParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(PlsqlParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_clause(PlsqlParser.Using_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_clause(PlsqlParser.Using_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(PlsqlParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(PlsqlParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_stmt(PlsqlParser.Cte_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_stmt(PlsqlParser.Cte_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_stmt_item(PlsqlParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_stmt_item(PlsqlParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#cte_select_cols}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_cols(PlsqlParser.Cte_select_colsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#cte_select_cols}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_cols(PlsqlParser.Cte_select_colsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_stmt(PlsqlParser.Fullselect_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_stmt(PlsqlParser.Fullselect_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_stmt_item(PlsqlParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_stmt_item(PlsqlParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_set_clause(PlsqlParser.Fullselect_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_set_clause(PlsqlParser.Fullselect_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#subselect_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSubselect_stmt(PlsqlParser.Subselect_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#subselect_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSubselect_stmt(PlsqlParser.Subselect_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(PlsqlParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(PlsqlParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#select_list_set}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_set(PlsqlParser.Select_list_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#select_list_set}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_set(PlsqlParser.Select_list_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#select_list_limit}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_limit(PlsqlParser.Select_list_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#select_list_limit}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_limit(PlsqlParser.Select_list_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#select_list_item}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_item(PlsqlParser.Select_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#select_list_item}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_item(PlsqlParser.Select_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#select_list_alias}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_alias(PlsqlParser.Select_list_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#select_list_alias}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_alias(PlsqlParser.Select_list_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_asterisk(PlsqlParser.Select_list_asteriskContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_asterisk(PlsqlParser.Select_list_asteriskContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause(PlsqlParser.Into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause(PlsqlParser.Into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(PlsqlParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(PlsqlParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#from_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_clause(PlsqlParser.From_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#from_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_clause(PlsqlParser.From_table_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_name_clause(PlsqlParser.From_table_name_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_name_clause(PlsqlParser.From_table_name_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_subselect_clause(PlsqlParser.From_subselect_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_subselect_clause(PlsqlParser.From_subselect_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#from_join_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_join_clause(PlsqlParser.From_join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#from_join_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_join_clause(PlsqlParser.From_join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_join_type_clause(PlsqlParser.From_join_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_join_type_clause(PlsqlParser.From_join_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_values_clause(PlsqlParser.From_table_values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_values_clause(PlsqlParser.From_table_values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#from_table_values_row}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_values_row(PlsqlParser.From_table_values_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#from_table_values_row}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_values_row(PlsqlParser.From_table_values_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#from_alias_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_alias_clause(PlsqlParser.From_alias_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#from_alias_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_alias_clause(PlsqlParser.From_alias_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(PlsqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(PlsqlParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(PlsqlParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(PlsqlParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(PlsqlParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(PlsqlParser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(PlsqlParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(PlsqlParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#qualify_clause}.
	 * @param ctx the parse tree
	 */
	void enterQualify_clause(PlsqlParser.Qualify_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#qualify_clause}.
	 * @param ctx the parse tree
	 */
	void exitQualify_clause(PlsqlParser.Qualify_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(PlsqlParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(PlsqlParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#select_options}.
	 * @param ctx the parse tree
	 */
	void enterSelect_options(PlsqlParser.Select_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#select_options}.
	 * @param ctx the parse tree
	 */
	void exitSelect_options(PlsqlParser.Select_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#select_options_item}.
	 * @param ctx the parse tree
	 */
	void enterSelect_options_item(PlsqlParser.Select_options_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#select_options_item}.
	 * @param ctx the parse tree
	 */
	void exitSelect_options_item(PlsqlParser.Select_options_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(PlsqlParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(PlsqlParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#update_assignment}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_assignment(PlsqlParser.Update_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#update_assignment}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_assignment(PlsqlParser.Update_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#update_table}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_table(PlsqlParser.Update_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#update_table}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_table(PlsqlParser.Update_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#update_upsert}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_upsert(PlsqlParser.Update_upsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#update_upsert}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_upsert(PlsqlParser.Update_upsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#merge_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMerge_stmt(PlsqlParser.Merge_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#merge_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMerge_stmt(PlsqlParser.Merge_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#merge_table}.
	 * @param ctx the parse tree
	 */
	void enterMerge_table(PlsqlParser.Merge_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#merge_table}.
	 * @param ctx the parse tree
	 */
	void exitMerge_table(PlsqlParser.Merge_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#merge_condition}.
	 * @param ctx the parse tree
	 */
	void enterMerge_condition(PlsqlParser.Merge_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#merge_condition}.
	 * @param ctx the parse tree
	 */
	void exitMerge_condition(PlsqlParser.Merge_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#merge_action}.
	 * @param ctx the parse tree
	 */
	void enterMerge_action(PlsqlParser.Merge_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#merge_action}.
	 * @param ctx the parse tree
	 */
	void exitMerge_action(PlsqlParser.Merge_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(PlsqlParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(PlsqlParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#delete_alias}.
	 * @param ctx the parse tree
	 */
	void enterDelete_alias(PlsqlParser.Delete_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#delete_alias}.
	 * @param ctx the parse tree
	 */
	void exitDelete_alias(PlsqlParser.Delete_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#describe_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_stmt(PlsqlParser.Describe_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#describe_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_stmt(PlsqlParser.Describe_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(PlsqlParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(PlsqlParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_atom(PlsqlParser.Bool_expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_atom(PlsqlParser.Bool_expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_unary(PlsqlParser.Bool_expr_unaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_unary(PlsqlParser.Bool_expr_unaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_single_in(PlsqlParser.Bool_expr_single_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_single_in(PlsqlParser.Bool_expr_single_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_multi_in(PlsqlParser.Bool_expr_multi_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_multi_in(PlsqlParser.Bool_expr_multi_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_binary(PlsqlParser.Bool_expr_binaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_binary(PlsqlParser.Bool_expr_binaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_logical_operator(PlsqlParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_logical_operator(PlsqlParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_binary_operator(PlsqlParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_binary_operator(PlsqlParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PlsqlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PlsqlParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterExpr_atom(PlsqlParser.Expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitExpr_atom(PlsqlParser.Expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_interval}.
	 * @param ctx the parse tree
	 */
	void enterExpr_interval(PlsqlParser.Expr_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_interval}.
	 * @param ctx the parse tree
	 */
	void exitExpr_interval(PlsqlParser.Expr_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#interval_item}.
	 * @param ctx the parse tree
	 */
	void enterInterval_item(PlsqlParser.Interval_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#interval_item}.
	 * @param ctx the parse tree
	 */
	void exitInterval_item(PlsqlParser.Interval_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_concat}.
	 * @param ctx the parse tree
	 */
	void enterExpr_concat(PlsqlParser.Expr_concatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_concat}.
	 * @param ctx the parse tree
	 */
	void exitExpr_concat(PlsqlParser.Expr_concatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_concat_item}.
	 * @param ctx the parse tree
	 */
	void enterExpr_concat_item(PlsqlParser.Expr_concat_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_concat_item}.
	 * @param ctx the parse tree
	 */
	void exitExpr_concat_item(PlsqlParser.Expr_concat_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_case}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case(PlsqlParser.Expr_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_case}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case(PlsqlParser.Expr_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_case_simple}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case_simple(PlsqlParser.Expr_case_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_case_simple}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case_simple(PlsqlParser.Expr_case_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_case_searched}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case_searched(PlsqlParser.Expr_case_searchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_case_searched}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case_searched(PlsqlParser.Expr_case_searchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void enterExpr_cursor_attribute(PlsqlParser.Expr_cursor_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void exitExpr_cursor_attribute(PlsqlParser.Expr_cursor_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_agg_window_func(PlsqlParser.Expr_agg_window_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_agg_window_func(PlsqlParser.Expr_agg_window_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_all_distinct(PlsqlParser.Expr_func_all_distinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_all_distinct(PlsqlParser.Expr_func_all_distinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_over_clause(PlsqlParser.Expr_func_over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_over_clause(PlsqlParser.Expr_func_over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_partition_by_clause(PlsqlParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_partition_by_clause(PlsqlParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_spec_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_spec_func(PlsqlParser.Expr_spec_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_spec_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_spec_func(PlsqlParser.Expr_spec_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func(PlsqlParser.Expr_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func(PlsqlParser.Expr_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_func_params}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_params(PlsqlParser.Expr_func_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_func_params}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_params(PlsqlParser.Expr_func_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#func_param}.
	 * @param ctx the parse tree
	 */
	void enterFunc_param(PlsqlParser.Func_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#func_param}.
	 * @param ctx the parse tree
	 */
	void exitFunc_param(PlsqlParser.Func_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_select}.
	 * @param ctx the parse tree
	 */
	void enterExpr_select(PlsqlParser.Expr_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_select}.
	 * @param ctx the parse tree
	 */
	void exitExpr_select(PlsqlParser.Expr_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_file}.
	 * @param ctx the parse tree
	 */
	void enterExpr_file(PlsqlParser.Expr_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_file}.
	 * @param ctx the parse tree
	 */
	void exitExpr_file(PlsqlParser.Expr_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#hive}.
	 * @param ctx the parse tree
	 */
	void enterHive(PlsqlParser.HiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#hive}.
	 * @param ctx the parse tree
	 */
	void exitHive(PlsqlParser.HiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#hive_item}.
	 * @param ctx the parse tree
	 */
	void enterHive_item(PlsqlParser.Hive_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#hive_item}.
	 * @param ctx the parse tree
	 */
	void exitHive_item(PlsqlParser.Hive_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#host}.
	 * @param ctx the parse tree
	 */
	void enterHost(PlsqlParser.HostContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#host}.
	 * @param ctx the parse tree
	 */
	void exitHost(PlsqlParser.HostContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#host_cmd}.
	 * @param ctx the parse tree
	 */
	void enterHost_cmd(PlsqlParser.Host_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#host_cmd}.
	 * @param ctx the parse tree
	 */
	void exitHost_cmd(PlsqlParser.Host_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#host_stmt}.
	 * @param ctx the parse tree
	 */
	void enterHost_stmt(PlsqlParser.Host_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#host_stmt}.
	 * @param ctx the parse tree
	 */
	void exitHost_stmt(PlsqlParser.Host_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#file_name}.
	 * @param ctx the parse tree
	 */
	void enterFile_name(PlsqlParser.File_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#file_name}.
	 * @param ctx the parse tree
	 */
	void exitFile_name(PlsqlParser.File_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void enterDate_literal(PlsqlParser.Date_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void exitDate_literal(PlsqlParser.Date_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp_literal(PlsqlParser.Timestamp_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp_literal(PlsqlParser.Timestamp_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(PlsqlParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(PlsqlParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link PlsqlParser#string}.
	 * @param ctx the parse tree
	 */
	void enterSingle_quotedString(PlsqlParser.Single_quotedStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link PlsqlParser#string}.
	 * @param ctx the parse tree
	 */
	void exitSingle_quotedString(PlsqlParser.Single_quotedStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link PlsqlParser#string}.
	 * @param ctx the parse tree
	 */
	void enterDouble_quotedString(PlsqlParser.Double_quotedStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link PlsqlParser#string}.
	 * @param ctx the parse tree
	 */
	void exitDouble_quotedString(PlsqlParser.Double_quotedStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#int_number}.
	 * @param ctx the parse tree
	 */
	void enterInt_number(PlsqlParser.Int_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#int_number}.
	 * @param ctx the parse tree
	 */
	void exitInt_number(PlsqlParser.Int_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void enterDec_number(PlsqlParser.Dec_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void exitDec_number(PlsqlParser.Dec_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(PlsqlParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(PlsqlParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#null_const}.
	 * @param ctx the parse tree
	 */
	void enterNull_const(PlsqlParser.Null_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#null_const}.
	 * @param ctx the parse tree
	 */
	void exitNull_const(PlsqlParser.Null_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#non_reserved_words}.
	 * @param ctx the parse tree
	 */
	void enterNon_reserved_words(PlsqlParser.Non_reserved_wordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#non_reserved_words}.
	 * @param ctx the parse tree
	 */
	void exitNon_reserved_words(PlsqlParser.Non_reserved_wordsContext ctx);
}