// Generated from sics\seiois\res\plsql\Plsql.g4 by ANTLR 4.5
package sics.seiois.res.plsql;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PlsqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PlsqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PlsqlParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PlsqlParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#begin_end_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_end_block(PlsqlParser.Begin_end_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#single_block_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_block_stmt(PlsqlParser.Single_block_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#block_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_end(PlsqlParser.Block_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#proc_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_block(PlsqlParser.Proc_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PlsqlParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon_stmt(PlsqlParser.Semicolon_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#exception_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_block(PlsqlParser.Exception_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#exception_block_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_block_item(PlsqlParser.Exception_block_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#null_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_stmt(PlsqlParser.Null_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(PlsqlParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt(PlsqlParser.Assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_item(PlsqlParser.Assignment_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_single_item(PlsqlParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_multiple_item(PlsqlParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_select_item(PlsqlParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#allocate_cursor_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocate_cursor_stmt(PlsqlParser.Allocate_cursor_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#associate_locator_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociate_locator_stmt(PlsqlParser.Associate_locator_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#begin_transaction_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_transaction_stmt(PlsqlParser.Begin_transaction_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(PlsqlParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#call_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_stmt(PlsqlParser.Call_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#declare_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt(PlsqlParser.Declare_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#declare_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block(PlsqlParser.Declare_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block_inplace(PlsqlParser.Declare_block_inplaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt_item(PlsqlParser.Declare_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#declare_var_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_var_item(PlsqlParser.Declare_var_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#declare_condition_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_condition_item(PlsqlParser.Declare_condition_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_cursor_item(PlsqlParser.Declare_cursor_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#cursor_with_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_with_return(PlsqlParser.Cursor_with_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#cursor_without_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_without_return(PlsqlParser.Cursor_without_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#declare_handler_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_handler_item(PlsqlParser.Declare_handler_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_temporary_table_item(PlsqlParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(PlsqlParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_local_temp_table_stmt(PlsqlParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_definition(PlsqlParser.Create_table_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_columns(PlsqlParser.Create_table_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_columns_item(PlsqlParser.Create_table_columns_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(PlsqlParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_column_inline_cons(PlsqlParser.Create_table_column_inline_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_column_cons(PlsqlParser.Create_table_column_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_fk_action(PlsqlParser.Create_table_fk_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions(PlsqlParser.Create_table_preoptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions_item(PlsqlParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions_td_item(PlsqlParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options(PlsqlParser.Create_table_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_options_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_item(PlsqlParser.Create_table_options_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_ora_item(PlsqlParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_db2_item(PlsqlParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_td_item(PlsqlParser.Create_table_options_td_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_hive_item(PlsqlParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_hive_row_format(PlsqlParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_hive_row_format_fields(PlsqlParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_mssql_item(PlsqlParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_mysql_item(PlsqlParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(PlsqlParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#alter_table_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_item(PlsqlParser.Alter_table_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add_constraint(PlsqlParser.Alter_table_add_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#alter_table_add_constraint_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add_constraint_item(PlsqlParser.Alter_table_add_constraint_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#dtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype(PlsqlParser.DtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#dtype_len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_len(PlsqlParser.Dtype_lenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#dtype_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_attr(PlsqlParser.Dtype_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#dtype_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_default(PlsqlParser.Dtype_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_database_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_stmt(PlsqlParser.Create_database_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_database_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_option(PlsqlParser.Create_database_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_stmt(PlsqlParser.Create_function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_function_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_return(PlsqlParser.Create_function_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_package_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_stmt(PlsqlParser.Create_package_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#package_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec(PlsqlParser.Package_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#package_spec_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec_item(PlsqlParser.Package_spec_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_body_stmt(PlsqlParser.Create_package_body_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#package_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body(PlsqlParser.Package_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#package_body_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body_item(PlsqlParser.Package_body_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_procedure_stmt(PlsqlParser.Create_procedure_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_routine_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_params(PlsqlParser.Create_routine_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_param_item(PlsqlParser.Create_routine_param_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_routine_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_options(PlsqlParser.Create_routine_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_routine_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_option(PlsqlParser.Create_routine_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_stmt(PlsqlParser.Drop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#end_transaction_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_transaction_stmt(PlsqlParser.End_transaction_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#exec_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_stmt(PlsqlParser.Exec_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(PlsqlParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_plsql_stmt(PlsqlParser.If_plsql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_tsql_stmt(PlsqlParser.If_tsql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_bteq_stmt(PlsqlParser.If_bteq_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#elseif_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_block(PlsqlParser.Elseif_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(PlsqlParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#include_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude_stmt(PlsqlParser.Include_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(PlsqlParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#insert_stmt_cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt_cols(PlsqlParser.Insert_stmt_colsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#insert_stmt_rows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt_rows(PlsqlParser.Insert_stmt_rowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#insert_stmt_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt_row(PlsqlParser.Insert_stmt_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#insert_directory_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_directory_stmt(PlsqlParser.Insert_directory_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#correct_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorrect_stmt(PlsqlParser.Correct_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#correct_stmt_cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorrect_stmt_cols(PlsqlParser.Correct_stmt_colsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#correct_update_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorrect_update_assignment(PlsqlParser.Correct_update_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#exit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_stmt(PlsqlParser.Exit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#get_diag_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt(PlsqlParser.Get_diag_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#get_diag_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt_item(PlsqlParser.Get_diag_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#get_diag_stmt_exception_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt_exception_item(PlsqlParser.Get_diag_stmt_exception_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#get_diag_stmt_rowcount_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt_rowcount_item(PlsqlParser.Get_diag_stmt_rowcount_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#grant_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_stmt(PlsqlParser.Grant_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#grant_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_stmt_item(PlsqlParser.Grant_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#leave_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeave_stmt(PlsqlParser.Leave_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#map_object_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_object_stmt(PlsqlParser.Map_object_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#open_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_stmt(PlsqlParser.Open_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#fetch_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_stmt(PlsqlParser.Fetch_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#collect_stats_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollect_stats_stmt(PlsqlParser.Collect_stats_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#collect_stats_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollect_stats_clause(PlsqlParser.Collect_stats_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#close_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_stmt(PlsqlParser.Close_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#cmp_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp_stmt(PlsqlParser.Cmp_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#cmp_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp_source(PlsqlParser.Cmp_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#copy_from_local_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_from_local_stmt(PlsqlParser.Copy_from_local_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#copy_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_stmt(PlsqlParser.Copy_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#copy_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_source(PlsqlParser.Copy_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#copy_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_target(PlsqlParser.Copy_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#copy_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_option(PlsqlParser.Copy_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#copy_file_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_file_option(PlsqlParser.Copy_file_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#commit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_stmt(PlsqlParser.Commit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_stmt(PlsqlParser.Create_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_index_col}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_col(PlsqlParser.Create_index_colContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#index_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_storage_clause(PlsqlParser.Index_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_mssql_storage_clause(PlsqlParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(PlsqlParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#obtain_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObtain_stmt(PlsqlParser.Obtain_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#quit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuit_stmt(PlsqlParser.Quit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#raise_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_stmt(PlsqlParser.Raise_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#resignal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResignal_stmt(PlsqlParser.Resignal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(PlsqlParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#rollback_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_stmt(PlsqlParser.Rollback_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#set_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_session_option(PlsqlParser.Set_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#set_current_schema_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_current_schema_option(PlsqlParser.Set_current_schema_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#set_mssql_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_mssql_session_option(PlsqlParser.Set_mssql_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#set_teradata_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_teradata_session_option(PlsqlParser.Set_teradata_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#signal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_stmt(PlsqlParser.Signal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#summary_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummary_stmt(PlsqlParser.Summary_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#truncate_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncate_stmt(PlsqlParser.Truncate_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#use_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_stmt(PlsqlParser.Use_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#values_into_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_into_stmt(PlsqlParser.Values_into_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(PlsqlParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#for_cursor_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_cursor_stmt(PlsqlParser.For_cursor_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#for_range_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_range_stmt(PlsqlParser.For_range_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(PlsqlParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#using_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_clause(PlsqlParser.Using_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(PlsqlParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_stmt(PlsqlParser.Cte_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_stmt_item(PlsqlParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#cte_select_cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_cols(PlsqlParser.Cte_select_colsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_stmt(PlsqlParser.Fullselect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_stmt_item(PlsqlParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_set_clause(PlsqlParser.Fullselect_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#subselect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubselect_stmt(PlsqlParser.Subselect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(PlsqlParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#select_list_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_set(PlsqlParser.Select_list_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#select_list_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_limit(PlsqlParser.Select_list_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#select_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_item(PlsqlParser.Select_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#select_list_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_alias(PlsqlParser.Select_list_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_asterisk(PlsqlParser.Select_list_asteriskContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause(PlsqlParser.Into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(PlsqlParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#from_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_clause(PlsqlParser.From_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_name_clause(PlsqlParser.From_table_name_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_subselect_clause(PlsqlParser.From_subselect_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#from_join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_join_clause(PlsqlParser.From_join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_join_type_clause(PlsqlParser.From_join_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_values_clause(PlsqlParser.From_table_values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#from_table_values_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_values_row(PlsqlParser.From_table_values_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#from_alias_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_alias_clause(PlsqlParser.From_alias_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(PlsqlParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(PlsqlParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_clause(PlsqlParser.Group_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(PlsqlParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#qualify_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualify_clause(PlsqlParser.Qualify_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(PlsqlParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#select_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_options(PlsqlParser.Select_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#select_options_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_options_item(PlsqlParser.Select_options_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(PlsqlParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#update_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_assignment(PlsqlParser.Update_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#update_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_table(PlsqlParser.Update_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#update_upsert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_upsert(PlsqlParser.Update_upsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#merge_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_stmt(PlsqlParser.Merge_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#merge_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_table(PlsqlParser.Merge_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#merge_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_condition(PlsqlParser.Merge_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#merge_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_action(PlsqlParser.Merge_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(PlsqlParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#delete_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_alias(PlsqlParser.Delete_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#describe_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_stmt(PlsqlParser.Describe_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(PlsqlParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_atom(PlsqlParser.Bool_expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_unary(PlsqlParser.Bool_expr_unaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_single_in(PlsqlParser.Bool_expr_single_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_multi_in(PlsqlParser.Bool_expr_multi_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary(PlsqlParser.Bool_expr_binaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_logical_operator(PlsqlParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary_operator(PlsqlParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PlsqlParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_atom(PlsqlParser.Expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_interval(PlsqlParser.Expr_intervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#interval_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_item(PlsqlParser.Interval_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat(PlsqlParser.Expr_concatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_concat_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat_item(PlsqlParser.Expr_concat_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case(PlsqlParser.Expr_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_case_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_simple(PlsqlParser.Expr_case_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_case_searched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_searched(PlsqlParser.Expr_case_searchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_cursor_attribute(PlsqlParser.Expr_cursor_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_agg_window_func(PlsqlParser.Expr_agg_window_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_all_distinct(PlsqlParser.Expr_func_all_distinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_over_clause(PlsqlParser.Expr_func_over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_partition_by_clause(PlsqlParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_spec_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_spec_func(PlsqlParser.Expr_spec_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func(PlsqlParser.Expr_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_func_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_params(PlsqlParser.Expr_func_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#func_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_param(PlsqlParser.Func_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_select(PlsqlParser.Expr_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_file(PlsqlParser.Expr_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#hive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHive(PlsqlParser.HiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#hive_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHive_item(PlsqlParser.Hive_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#host}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost(PlsqlParser.HostContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#host_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost_cmd(PlsqlParser.Host_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#host_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost_stmt(PlsqlParser.Host_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_name(PlsqlParser.File_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#date_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_literal(PlsqlParser.Date_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#timestamp_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp_literal(PlsqlParser.Timestamp_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(PlsqlParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link PlsqlParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_quotedString(PlsqlParser.Single_quotedStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link PlsqlParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_quotedString(PlsqlParser.Double_quotedStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#int_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_number(PlsqlParser.Int_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#dec_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_number(PlsqlParser.Dec_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(PlsqlParser.Bool_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#null_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_const(PlsqlParser.Null_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#non_reserved_words}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_reserved_words(PlsqlParser.Non_reserved_wordsContext ctx);
}