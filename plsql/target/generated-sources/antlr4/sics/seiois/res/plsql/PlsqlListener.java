// Generated from Plsql.g4 by ANTLR 4.4
package sics.seiois.res.plsql;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlsqlParser}.
 */
public interface PlsqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#from_table_values_row}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_values_row(@NotNull PlsqlParser.From_table_values_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#from_table_values_row}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_values_row(@NotNull PlsqlParser.From_table_values_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_case}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case(@NotNull PlsqlParser.Expr_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_case}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case(@NotNull PlsqlParser.Expr_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_function_return}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_return(@NotNull PlsqlParser.Create_function_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_function_return}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_return(@NotNull PlsqlParser.Create_function_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(@NotNull PlsqlParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(@NotNull PlsqlParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_concat_item}.
	 * @param ctx the parse tree
	 */
	void enterExpr_concat_item(@NotNull PlsqlParser.Expr_concat_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_concat_item}.
	 * @param ctx the parse tree
	 */
	void exitExpr_concat_item(@NotNull PlsqlParser.Expr_concat_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec(@NotNull PlsqlParser.Package_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec(@NotNull PlsqlParser.Package_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(@NotNull PlsqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(@NotNull PlsqlParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_plsql_stmt(@NotNull PlsqlParser.If_plsql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_plsql_stmt(@NotNull PlsqlParser.If_plsql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#fetch_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFetch_stmt(@NotNull PlsqlParser.Fetch_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#fetch_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFetch_stmt(@NotNull PlsqlParser.Fetch_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#null_const}.
	 * @param ctx the parse tree
	 */
	void enterNull_const(@NotNull PlsqlParser.Null_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#null_const}.
	 * @param ctx the parse tree
	 */
	void exitNull_const(@NotNull PlsqlParser.Null_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExit_stmt(@NotNull PlsqlParser.Exit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExit_stmt(@NotNull PlsqlParser.Exit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#declare_handler_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_handler_item(@NotNull PlsqlParser.Declare_handler_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#declare_handler_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_handler_item(@NotNull PlsqlParser.Declare_handler_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(@NotNull PlsqlParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(@NotNull PlsqlParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#cursor_without_return}.
	 * @param ctx the parse tree
	 */
	void enterCursor_without_return(@NotNull PlsqlParser.Cursor_without_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#cursor_without_return}.
	 * @param ctx the parse tree
	 */
	void exitCursor_without_return(@NotNull PlsqlParser.Cursor_without_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(@NotNull PlsqlParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(@NotNull PlsqlParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_local_temp_table_stmt(@NotNull PlsqlParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_local_temp_table_stmt(@NotNull PlsqlParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#dtype}.
	 * @param ctx the parse tree
	 */
	void enterDtype(@NotNull PlsqlParser.DtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#dtype}.
	 * @param ctx the parse tree
	 */
	void exitDtype(@NotNull PlsqlParser.DtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#block_end}.
	 * @param ctx the parse tree
	 */
	void enterBlock_end(@NotNull PlsqlParser.Block_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#block_end}.
	 * @param ctx the parse tree
	 */
	void exitBlock_end(@NotNull PlsqlParser.Block_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stmt_item(@NotNull PlsqlParser.Declare_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stmt_item(@NotNull PlsqlParser.Declare_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#merge_condition}.
	 * @param ctx the parse tree
	 */
	void enterMerge_condition(@NotNull PlsqlParser.Merge_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#merge_condition}.
	 * @param ctx the parse tree
	 */
	void exitMerge_condition(@NotNull PlsqlParser.Merge_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_index_col}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_col(@NotNull PlsqlParser.Create_index_colContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_index_col}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_col(@NotNull PlsqlParser.Create_index_colContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#index_storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_storage_clause(@NotNull PlsqlParser.Index_storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#index_storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_storage_clause(@NotNull PlsqlParser.Index_storage_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(@NotNull PlsqlParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(@NotNull PlsqlParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#for_range_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_range_stmt(@NotNull PlsqlParser.For_range_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#for_range_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_range_stmt(@NotNull PlsqlParser.For_range_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#from_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_clause(@NotNull PlsqlParser.From_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#from_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_clause(@NotNull PlsqlParser.From_table_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#host_cmd}.
	 * @param ctx the parse tree
	 */
	void enterHost_cmd(@NotNull PlsqlParser.Host_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#host_cmd}.
	 * @param ctx the parse tree
	 */
	void exitHost_cmd(@NotNull PlsqlParser.Host_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_cursor_item(@NotNull PlsqlParser.Declare_cursor_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_cursor_item(@NotNull PlsqlParser.Declare_cursor_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#select_list_limit}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_limit(@NotNull PlsqlParser.Select_list_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#select_list_limit}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_limit(@NotNull PlsqlParser.Select_list_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#qualify_clause}.
	 * @param ctx the parse tree
	 */
	void enterQualify_clause(@NotNull PlsqlParser.Qualify_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#qualify_clause}.
	 * @param ctx the parse tree
	 */
	void exitQualify_clause(@NotNull PlsqlParser.Qualify_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_agg_window_func(@NotNull PlsqlParser.Expr_agg_window_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_agg_window_func(@NotNull PlsqlParser.Expr_agg_window_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(@NotNull PlsqlParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(@NotNull PlsqlParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_partition_by_clause(@NotNull PlsqlParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_partition_by_clause(@NotNull PlsqlParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_stmt(@NotNull PlsqlParser.Cte_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_stmt(@NotNull PlsqlParser.Cte_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_td_item(@NotNull PlsqlParser.Create_table_options_td_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_td_item(@NotNull PlsqlParser.Create_table_options_td_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#copy_file_option}.
	 * @param ctx the parse tree
	 */
	void enterCopy_file_option(@NotNull PlsqlParser.Copy_file_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#copy_file_option}.
	 * @param ctx the parse tree
	 */
	void exitCopy_file_option(@NotNull PlsqlParser.Copy_file_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(@NotNull PlsqlParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(@NotNull PlsqlParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#quit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterQuit_stmt(@NotNull PlsqlParser.Quit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#quit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitQuit_stmt(@NotNull PlsqlParser.Quit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon_stmt(@NotNull PlsqlParser.Semicolon_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon_stmt(@NotNull PlsqlParser.Semicolon_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(@NotNull PlsqlParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(@NotNull PlsqlParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(@NotNull PlsqlParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(@NotNull PlsqlParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(@NotNull PlsqlParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(@NotNull PlsqlParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_definition}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_definition(@NotNull PlsqlParser.Create_table_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_definition}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_definition(@NotNull PlsqlParser.Create_table_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_name_clause(@NotNull PlsqlParser.From_table_name_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_name_clause(@NotNull PlsqlParser.From_table_name_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#insert_stmt_row}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt_row(@NotNull PlsqlParser.Insert_stmt_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#insert_stmt_row}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt_row(@NotNull PlsqlParser.Insert_stmt_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_case_simple}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case_simple(@NotNull PlsqlParser.Expr_case_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_case_simple}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case_simple(@NotNull PlsqlParser.Expr_case_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#select_list_item}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_item(@NotNull PlsqlParser.Select_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#select_list_item}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_item(@NotNull PlsqlParser.Select_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#leave_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLeave_stmt(@NotNull PlsqlParser.Leave_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#leave_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLeave_stmt(@NotNull PlsqlParser.Leave_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_option(@NotNull PlsqlParser.Create_database_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_option(@NotNull PlsqlParser.Create_database_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterExpr_atom(@NotNull PlsqlParser.Expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitExpr_atom(@NotNull PlsqlParser.Expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#dtype_attr}.
	 * @param ctx the parse tree
	 */
	void enterDtype_attr(@NotNull PlsqlParser.Dtype_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#dtype_attr}.
	 * @param ctx the parse tree
	 */
	void exitDtype_attr(@NotNull PlsqlParser.Dtype_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#package_spec_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec_item(@NotNull PlsqlParser.Package_spec_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#package_spec_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec_item(@NotNull PlsqlParser.Package_spec_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#associate_locator_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssociate_locator_stmt(@NotNull PlsqlParser.Associate_locator_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#associate_locator_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssociate_locator_stmt(@NotNull PlsqlParser.Associate_locator_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#update_upsert}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_upsert(@NotNull PlsqlParser.Update_upsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#update_upsert}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_upsert(@NotNull PlsqlParser.Update_upsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#get_diag_stmt_rowcount_item}.
	 * @param ctx the parse tree
	 */
	void enterGet_diag_stmt_rowcount_item(@NotNull PlsqlParser.Get_diag_stmt_rowcount_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#get_diag_stmt_rowcount_item}.
	 * @param ctx the parse tree
	 */
	void exitGet_diag_stmt_rowcount_item(@NotNull PlsqlParser.Get_diag_stmt_rowcount_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(@NotNull PlsqlParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(@NotNull PlsqlParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#truncate_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTruncate_stmt(@NotNull PlsqlParser.Truncate_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#truncate_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTruncate_stmt(@NotNull PlsqlParser.Truncate_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#insert_stmt_rows}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt_rows(@NotNull PlsqlParser.Insert_stmt_rowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#insert_stmt_rows}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt_rows(@NotNull PlsqlParser.Insert_stmt_rowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#declare_var_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_var_item(@NotNull PlsqlParser.Declare_var_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#declare_var_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_var_item(@NotNull PlsqlParser.Declare_var_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_unary(@NotNull PlsqlParser.Bool_expr_unaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_unary(@NotNull PlsqlParser.Bool_expr_unaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_stmt(@NotNull PlsqlParser.Drop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_stmt(@NotNull PlsqlParser.Drop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_routine_params}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_params(@NotNull PlsqlParser.Create_routine_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_routine_params}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_params(@NotNull PlsqlParser.Create_routine_paramsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link PlsqlParser#string}.
	 * @param ctx the parse tree
	 */
	void enterDouble_quotedString(@NotNull PlsqlParser.Double_quotedStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link PlsqlParser#string}.
	 * @param ctx the parse tree
	 */
	void exitDouble_quotedString(@NotNull PlsqlParser.Double_quotedStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#values_into_stmt}.
	 * @param ctx the parse tree
	 */
	void enterValues_into_stmt(@NotNull PlsqlParser.Values_into_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#values_into_stmt}.
	 * @param ctx the parse tree
	 */
	void exitValues_into_stmt(@NotNull PlsqlParser.Values_into_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_options}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options(@NotNull PlsqlParser.Create_table_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_options}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options(@NotNull PlsqlParser.Create_table_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(@NotNull PlsqlParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(@NotNull PlsqlParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_body_stmt(@NotNull PlsqlParser.Create_package_body_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_body_stmt(@NotNull PlsqlParser.Create_package_body_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#insert_stmt_cols}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt_cols(@NotNull PlsqlParser.Insert_stmt_colsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#insert_stmt_cols}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt_cols(@NotNull PlsqlParser.Insert_stmt_colsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#collect_stats_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCollect_stats_stmt(@NotNull PlsqlParser.Collect_stats_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#collect_stats_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCollect_stats_stmt(@NotNull PlsqlParser.Collect_stats_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#select_options_item}.
	 * @param ctx the parse tree
	 */
	void enterSelect_options_item(@NotNull PlsqlParser.Select_options_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#select_options_item}.
	 * @param ctx the parse tree
	 */
	void exitSelect_options_item(@NotNull PlsqlParser.Select_options_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#set_current_schema_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_current_schema_option(@NotNull PlsqlParser.Set_current_schema_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#set_current_schema_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_current_schema_option(@NotNull PlsqlParser.Set_current_schema_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_over_clause(@NotNull PlsqlParser.Expr_func_over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_over_clause(@NotNull PlsqlParser.Expr_func_over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_stmt_item(@NotNull PlsqlParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_stmt_item(@NotNull PlsqlParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#copy_option}.
	 * @param ctx the parse tree
	 */
	void enterCopy_option(@NotNull PlsqlParser.Copy_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#copy_option}.
	 * @param ctx the parse tree
	 */
	void exitCopy_option(@NotNull PlsqlParser.Copy_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#from_join_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_join_clause(@NotNull PlsqlParser.From_join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#from_join_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_join_clause(@NotNull PlsqlParser.From_join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#use_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUse_stmt(@NotNull PlsqlParser.Use_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#use_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUse_stmt(@NotNull PlsqlParser.Use_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#delete_alias}.
	 * @param ctx the parse tree
	 */
	void enterDelete_alias(@NotNull PlsqlParser.Delete_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#delete_alias}.
	 * @param ctx the parse tree
	 */
	void exitDelete_alias(@NotNull PlsqlParser.Delete_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#select_options}.
	 * @param ctx the parse tree
	 */
	void enterSelect_options(@NotNull PlsqlParser.Select_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#select_options}.
	 * @param ctx the parse tree
	 */
	void exitSelect_options(@NotNull PlsqlParser.Select_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCall_stmt(@NotNull PlsqlParser.Call_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCall_stmt(@NotNull PlsqlParser.Call_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(@NotNull PlsqlParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(@NotNull PlsqlParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#close_stmt}.
	 * @param ctx the parse tree
	 */
	void enterClose_stmt(@NotNull PlsqlParser.Close_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#close_stmt}.
	 * @param ctx the parse tree
	 */
	void exitClose_stmt(@NotNull PlsqlParser.Close_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#update_assignment}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_assignment(@NotNull PlsqlParser.Update_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#update_assignment}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_assignment(@NotNull PlsqlParser.Update_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_block_inplace(@NotNull PlsqlParser.Declare_block_inplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_block_inplace(@NotNull PlsqlParser.Declare_block_inplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#open_stmt}.
	 * @param ctx the parse tree
	 */
	void enterOpen_stmt(@NotNull PlsqlParser.Open_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#open_stmt}.
	 * @param ctx the parse tree
	 */
	void exitOpen_stmt(@NotNull PlsqlParser.Open_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link PlsqlParser#string}.
	 * @param ctx the parse tree
	 */
	void enterSingle_quotedString(@NotNull PlsqlParser.Single_quotedStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link PlsqlParser#string}.
	 * @param ctx the parse tree
	 */
	void exitSingle_quotedString(@NotNull PlsqlParser.Single_quotedStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(@NotNull PlsqlParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(@NotNull PlsqlParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_case_searched}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case_searched(@NotNull PlsqlParser.Expr_case_searchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_case_searched}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case_searched(@NotNull PlsqlParser.Expr_case_searchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#package_body_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body_item(@NotNull PlsqlParser.Package_body_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#package_body_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body_item(@NotNull PlsqlParser.Package_body_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#summary_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSummary_stmt(@NotNull PlsqlParser.Summary_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#summary_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSummary_stmt(@NotNull PlsqlParser.Summary_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#update_table}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_table(@NotNull PlsqlParser.Update_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#update_table}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_table(@NotNull PlsqlParser.Update_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_file}.
	 * @param ctx the parse tree
	 */
	void enterExpr_file(@NotNull PlsqlParser.Expr_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_file}.
	 * @param ctx the parse tree
	 */
	void exitExpr_file(@NotNull PlsqlParser.Expr_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#host_stmt}.
	 * @param ctx the parse tree
	 */
	void enterHost_stmt(@NotNull PlsqlParser.Host_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#host_stmt}.
	 * @param ctx the parse tree
	 */
	void exitHost_stmt(@NotNull PlsqlParser.Host_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#int_number}.
	 * @param ctx the parse tree
	 */
	void enterInt_number(@NotNull PlsqlParser.Int_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#int_number}.
	 * @param ctx the parse tree
	 */
	void exitInt_number(@NotNull PlsqlParser.Int_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(@NotNull PlsqlParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(@NotNull PlsqlParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#cursor_with_return}.
	 * @param ctx the parse tree
	 */
	void enterCursor_with_return(@NotNull PlsqlParser.Cursor_with_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#cursor_with_return}.
	 * @param ctx the parse tree
	 */
	void exitCursor_with_return(@NotNull PlsqlParser.Cursor_with_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_select}.
	 * @param ctx the parse tree
	 */
	void enterExpr_select(@NotNull PlsqlParser.Expr_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_select}.
	 * @param ctx the parse tree
	 */
	void exitExpr_select(@NotNull PlsqlParser.Expr_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_columns}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_columns(@NotNull PlsqlParser.Create_table_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_columns}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_columns(@NotNull PlsqlParser.Create_table_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_routine_options}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_options(@NotNull PlsqlParser.Create_routine_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_routine_options}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_options(@NotNull PlsqlParser.Create_routine_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#for_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_cursor_stmt(@NotNull PlsqlParser.For_cursor_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#for_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_cursor_stmt(@NotNull PlsqlParser.For_cursor_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_interval}.
	 * @param ctx the parse tree
	 */
	void enterExpr_interval(@NotNull PlsqlParser.Expr_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_interval}.
	 * @param ctx the parse tree
	 */
	void exitExpr_interval(@NotNull PlsqlParser.Expr_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(@NotNull PlsqlParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(@NotNull PlsqlParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#grant_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterGrant_stmt_item(@NotNull PlsqlParser.Grant_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#grant_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitGrant_stmt_item(@NotNull PlsqlParser.Grant_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_binary_operator(@NotNull PlsqlParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_binary_operator(@NotNull PlsqlParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void enterDate_literal(@NotNull PlsqlParser.Date_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void exitDate_literal(@NotNull PlsqlParser.Date_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#from_alias_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_alias_clause(@NotNull PlsqlParser.From_alias_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#from_alias_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_alias_clause(@NotNull PlsqlParser.From_alias_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#signal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSignal_stmt(@NotNull PlsqlParser.Signal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#signal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSignal_stmt(@NotNull PlsqlParser.Signal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#select_list_set}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_set(@NotNull PlsqlParser.Select_list_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#select_list_set}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_set(@NotNull PlsqlParser.Select_list_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#file_name}.
	 * @param ctx the parse tree
	 */
	void enterFile_name(@NotNull PlsqlParser.File_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#file_name}.
	 * @param ctx the parse tree
	 */
	void exitFile_name(@NotNull PlsqlParser.File_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_param_item(@NotNull PlsqlParser.Create_routine_param_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_param_item(@NotNull PlsqlParser.Create_routine_param_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#merge_table}.
	 * @param ctx the parse tree
	 */
	void enterMerge_table(@NotNull PlsqlParser.Merge_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#merge_table}.
	 * @param ctx the parse tree
	 */
	void exitMerge_table(@NotNull PlsqlParser.Merge_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(@NotNull PlsqlParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(@NotNull PlsqlParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(@NotNull PlsqlParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(@NotNull PlsqlParser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(@NotNull PlsqlParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(@NotNull PlsqlParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#copy_from_local_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCopy_from_local_stmt(@NotNull PlsqlParser.Copy_from_local_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#copy_from_local_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCopy_from_local_stmt(@NotNull PlsqlParser.Copy_from_local_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_fk_action(@NotNull PlsqlParser.Create_table_fk_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_fk_action(@NotNull PlsqlParser.Create_table_fk_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_atom(@NotNull PlsqlParser.Bool_expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_atom(@NotNull PlsqlParser.Bool_expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions_td_item(@NotNull PlsqlParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions_td_item(@NotNull PlsqlParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#declare_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stmt(@NotNull PlsqlParser.Declare_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#declare_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stmt(@NotNull PlsqlParser.Declare_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(@NotNull PlsqlParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(@NotNull PlsqlParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_temporary_table_item(@NotNull PlsqlParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_temporary_table_item(@NotNull PlsqlParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#single_block_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSingle_block_stmt(@NotNull PlsqlParser.Single_block_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#single_block_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSingle_block_stmt(@NotNull PlsqlParser.Single_block_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#end_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEnd_transaction_stmt(@NotNull PlsqlParser.End_transaction_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#end_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEnd_transaction_stmt(@NotNull PlsqlParser.End_transaction_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#get_diag_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterGet_diag_stmt_item(@NotNull PlsqlParser.Get_diag_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#get_diag_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitGet_diag_stmt_item(@NotNull PlsqlParser.Get_diag_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_clause(@NotNull PlsqlParser.Using_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_clause(@NotNull PlsqlParser.Using_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions(@NotNull PlsqlParser.Create_table_preoptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions(@NotNull PlsqlParser.Create_table_preoptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_all_distinct(@NotNull PlsqlParser.Expr_func_all_distinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_all_distinct(@NotNull PlsqlParser.Expr_func_all_distinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_hive_row_format(@NotNull PlsqlParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_hive_row_format(@NotNull PlsqlParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void enterExpr_cursor_attribute(@NotNull PlsqlParser.Expr_cursor_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void exitExpr_cursor_attribute(@NotNull PlsqlParser.Expr_cursor_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull PlsqlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull PlsqlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(@NotNull PlsqlParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(@NotNull PlsqlParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#copy_target}.
	 * @param ctx the parse tree
	 */
	void enterCopy_target(@NotNull PlsqlParser.Copy_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#copy_target}.
	 * @param ctx the parse tree
	 */
	void exitCopy_target(@NotNull PlsqlParser.Copy_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#set_session_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_session_option(@NotNull PlsqlParser.Set_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#set_session_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_session_option(@NotNull PlsqlParser.Set_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_stmt_item(@NotNull PlsqlParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_stmt_item(@NotNull PlsqlParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_database_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_stmt(@NotNull PlsqlParser.Create_database_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_database_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_stmt(@NotNull PlsqlParser.Create_database_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmt(@NotNull PlsqlParser.Raise_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmt(@NotNull PlsqlParser.Raise_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_concat}.
	 * @param ctx the parse tree
	 */
	void enterExpr_concat(@NotNull PlsqlParser.Expr_concatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_concat}.
	 * @param ctx the parse tree
	 */
	void exitExpr_concat(@NotNull PlsqlParser.Expr_concatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_join_type_clause(@NotNull PlsqlParser.From_join_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_join_type_clause(@NotNull PlsqlParser.From_join_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_block(@NotNull PlsqlParser.Declare_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_block(@NotNull PlsqlParser.Declare_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_single_in(@NotNull PlsqlParser.Bool_expr_single_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_single_in(@NotNull PlsqlParser.Bool_expr_single_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull PlsqlParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull PlsqlParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_mssql_item(@NotNull PlsqlParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_mssql_item(@NotNull PlsqlParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#insert_directory_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_directory_stmt(@NotNull PlsqlParser.Insert_directory_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#insert_directory_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_directory_stmt(@NotNull PlsqlParser.Insert_directory_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#collect_stats_clause}.
	 * @param ctx the parse tree
	 */
	void enterCollect_stats_clause(@NotNull PlsqlParser.Collect_stats_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#collect_stats_clause}.
	 * @param ctx the parse tree
	 */
	void exitCollect_stats_clause(@NotNull PlsqlParser.Collect_stats_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(@NotNull PlsqlParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(@NotNull PlsqlParser.Create_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_procedure_stmt(@NotNull PlsqlParser.Create_procedure_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_procedure_stmt(@NotNull PlsqlParser.Create_procedure_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_logical_operator(@NotNull PlsqlParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_logical_operator(@NotNull PlsqlParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRollback_stmt(@NotNull PlsqlParser.Rollback_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRollback_stmt(@NotNull PlsqlParser.Rollback_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#dtype_default}.
	 * @param ctx the parse tree
	 */
	void enterDtype_default(@NotNull PlsqlParser.Dtype_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#dtype_default}.
	 * @param ctx the parse tree
	 */
	void exitDtype_default(@NotNull PlsqlParser.Dtype_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#get_diag_stmt_exception_item}.
	 * @param ctx the parse tree
	 */
	void enterGet_diag_stmt_exception_item(@NotNull PlsqlParser.Get_diag_stmt_exception_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#get_diag_stmt_exception_item}.
	 * @param ctx the parse tree
	 */
	void exitGet_diag_stmt_exception_item(@NotNull PlsqlParser.Get_diag_stmt_exception_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_single_item(@NotNull PlsqlParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_single_item(@NotNull PlsqlParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#cmp_source}.
	 * @param ctx the parse tree
	 */
	void enterCmp_source(@NotNull PlsqlParser.Cmp_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#cmp_source}.
	 * @param ctx the parse tree
	 */
	void exitCmp_source(@NotNull PlsqlParser.Cmp_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_ora_item(@NotNull PlsqlParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_ora_item(@NotNull PlsqlParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#hive}.
	 * @param ctx the parse tree
	 */
	void enterHive(@NotNull PlsqlParser.HiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#hive}.
	 * @param ctx the parse tree
	 */
	void exitHive(@NotNull PlsqlParser.HiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_db2_item(@NotNull PlsqlParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_db2_item(@NotNull PlsqlParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions_item(@NotNull PlsqlParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions_item(@NotNull PlsqlParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#get_diag_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGet_diag_stmt(@NotNull PlsqlParser.Get_diag_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#get_diag_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGet_diag_stmt(@NotNull PlsqlParser.Get_diag_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_package_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_stmt(@NotNull PlsqlParser.Create_package_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_package_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_stmt(@NotNull PlsqlParser.Create_package_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_asterisk(@NotNull PlsqlParser.Select_list_asteriskContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_asterisk(@NotNull PlsqlParser.Select_list_asteriskContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#non_reserved_words}.
	 * @param ctx the parse tree
	 */
	void enterNon_reserved_words(@NotNull PlsqlParser.Non_reserved_wordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#non_reserved_words}.
	 * @param ctx the parse tree
	 */
	void exitNon_reserved_words(@NotNull PlsqlParser.Non_reserved_wordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_routine_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_option(@NotNull PlsqlParser.Create_routine_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_routine_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_option(@NotNull PlsqlParser.Create_routine_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_values_clause(@NotNull PlsqlParser.From_table_values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_values_clause(@NotNull PlsqlParser.From_table_values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#set_teradata_session_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_teradata_session_option(@NotNull PlsqlParser.Set_teradata_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#set_teradata_session_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_teradata_session_option(@NotNull PlsqlParser.Set_teradata_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_select_item(@NotNull PlsqlParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_select_item(@NotNull PlsqlParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#resignal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterResignal_stmt(@NotNull PlsqlParser.Resignal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#resignal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitResignal_stmt(@NotNull PlsqlParser.Resignal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#exception_block}.
	 * @param ctx the parse tree
	 */
	void enterException_block(@NotNull PlsqlParser.Exception_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#exception_block}.
	 * @param ctx the parse tree
	 */
	void exitException_block(@NotNull PlsqlParser.Exception_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#cte_select_cols}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_cols(@NotNull PlsqlParser.Cte_select_colsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#cte_select_cols}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_cols(@NotNull PlsqlParser.Cte_select_colsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#alter_table_add_constraint_item}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add_constraint_item(@NotNull PlsqlParser.Alter_table_add_constraint_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#alter_table_add_constraint_item}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add_constraint_item(@NotNull PlsqlParser.Alter_table_add_constraint_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_binary(@NotNull PlsqlParser.Bool_expr_binaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_binary(@NotNull PlsqlParser.Bool_expr_binaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#allocate_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAllocate_cursor_stmt(@NotNull PlsqlParser.Allocate_cursor_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#allocate_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAllocate_cursor_stmt(@NotNull PlsqlParser.Allocate_cursor_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_function_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_stmt(@NotNull PlsqlParser.Create_function_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_function_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_stmt(@NotNull PlsqlParser.Create_function_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#exec_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExec_stmt(@NotNull PlsqlParser.Exec_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#exec_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExec_stmt(@NotNull PlsqlParser.Exec_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(@NotNull PlsqlParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(@NotNull PlsqlParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#exception_block_item}.
	 * @param ctx the parse tree
	 */
	void enterException_block_item(@NotNull PlsqlParser.Exception_block_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#exception_block_item}.
	 * @param ctx the parse tree
	 */
	void exitException_block_item(@NotNull PlsqlParser.Exception_block_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#elseif_block}.
	 * @param ctx the parse tree
	 */
	void enterElseif_block(@NotNull PlsqlParser.Elseif_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#elseif_block}.
	 * @param ctx the parse tree
	 */
	void exitElseif_block(@NotNull PlsqlParser.Elseif_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#set_mssql_session_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_mssql_session_option(@NotNull PlsqlParser.Set_mssql_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#set_mssql_session_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_mssql_session_option(@NotNull PlsqlParser.Set_mssql_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(@NotNull PlsqlParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(@NotNull PlsqlParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_column_inline_cons(@NotNull PlsqlParser.Create_table_column_inline_consContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_column_inline_cons(@NotNull PlsqlParser.Create_table_column_inline_consContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#dtype_len}.
	 * @param ctx the parse tree
	 */
	void enterDtype_len(@NotNull PlsqlParser.Dtype_lenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#dtype_len}.
	 * @param ctx the parse tree
	 */
	void exitDtype_len(@NotNull PlsqlParser.Dtype_lenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add_constraint(@NotNull PlsqlParser.Alter_table_add_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add_constraint(@NotNull PlsqlParser.Alter_table_add_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#cmp_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCmp_stmt(@NotNull PlsqlParser.Cmp_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#cmp_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCmp_stmt(@NotNull PlsqlParser.Cmp_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#merge_action}.
	 * @param ctx the parse tree
	 */
	void enterMerge_action(@NotNull PlsqlParser.Merge_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#merge_action}.
	 * @param ctx the parse tree
	 */
	void exitMerge_action(@NotNull PlsqlParser.Merge_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#copy_source}.
	 * @param ctx the parse tree
	 */
	void enterCopy_source(@NotNull PlsqlParser.Copy_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#copy_source}.
	 * @param ctx the parse tree
	 */
	void exitCopy_source(@NotNull PlsqlParser.Copy_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#declare_condition_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_condition_item(@NotNull PlsqlParser.Declare_condition_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#declare_condition_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_condition_item(@NotNull PlsqlParser.Declare_condition_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#hive_item}.
	 * @param ctx the parse tree
	 */
	void enterHive_item(@NotNull PlsqlParser.Hive_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#hive_item}.
	 * @param ctx the parse tree
	 */
	void exitHive_item(@NotNull PlsqlParser.Hive_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#describe_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_stmt(@NotNull PlsqlParser.Describe_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#describe_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_stmt(@NotNull PlsqlParser.Describe_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#host}.
	 * @param ctx the parse tree
	 */
	void enterHost(@NotNull PlsqlParser.HostContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#host}.
	 * @param ctx the parse tree
	 */
	void exitHost(@NotNull PlsqlParser.HostContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#merge_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMerge_stmt(@NotNull PlsqlParser.Merge_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#merge_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMerge_stmt(@NotNull PlsqlParser.Merge_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#func_param}.
	 * @param ctx the parse tree
	 */
	void enterFunc_param(@NotNull PlsqlParser.Func_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#func_param}.
	 * @param ctx the parse tree
	 */
	void exitFunc_param(@NotNull PlsqlParser.Func_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#proc_block}.
	 * @param ctx the parse tree
	 */
	void enterProc_block(@NotNull PlsqlParser.Proc_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#proc_block}.
	 * @param ctx the parse tree
	 */
	void exitProc_block(@NotNull PlsqlParser.Proc_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(@NotNull PlsqlParser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(@NotNull PlsqlParser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#grant_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGrant_stmt(@NotNull PlsqlParser.Grant_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#grant_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGrant_stmt(@NotNull PlsqlParser.Grant_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#interval_item}.
	 * @param ctx the parse tree
	 */
	void enterInterval_item(@NotNull PlsqlParser.Interval_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#interval_item}.
	 * @param ctx the parse tree
	 */
	void exitInterval_item(@NotNull PlsqlParser.Interval_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_tsql_stmt(@NotNull PlsqlParser.If_tsql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_tsql_stmt(@NotNull PlsqlParser.If_tsql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_hive_item(@NotNull PlsqlParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_hive_item(@NotNull PlsqlParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void enterDec_number(@NotNull PlsqlParser.Dec_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void exitDec_number(@NotNull PlsqlParser.Dec_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNull_stmt(@NotNull PlsqlParser.Null_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNull_stmt(@NotNull PlsqlParser.Null_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_options_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_item(@NotNull PlsqlParser.Create_table_options_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_options_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_item(@NotNull PlsqlParser.Create_table_options_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause(@NotNull PlsqlParser.Into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause(@NotNull PlsqlParser.Into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_set_clause(@NotNull PlsqlParser.Fullselect_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_set_clause(@NotNull PlsqlParser.Fullselect_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#select_list_alias}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_alias(@NotNull PlsqlParser.Select_list_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#select_list_alias}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_alias(@NotNull PlsqlParser.Select_list_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_item(@NotNull PlsqlParser.Assignment_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_item(@NotNull PlsqlParser.Assignment_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_mssql_storage_clause(@NotNull PlsqlParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_mssql_storage_clause(@NotNull PlsqlParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#subselect_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSubselect_stmt(@NotNull PlsqlParser.Subselect_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#subselect_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSubselect_stmt(@NotNull PlsqlParser.Subselect_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_columns_item(@NotNull PlsqlParser.Create_table_columns_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_columns_item(@NotNull PlsqlParser.Create_table_columns_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_column_cons(@NotNull PlsqlParser.Create_table_column_consContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_column_cons(@NotNull PlsqlParser.Create_table_column_consContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#begin_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBegin_transaction_stmt(@NotNull PlsqlParser.Begin_transaction_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#begin_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBegin_transaction_stmt(@NotNull PlsqlParser.Begin_transaction_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommit_stmt(@NotNull PlsqlParser.Commit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommit_stmt(@NotNull PlsqlParser.Commit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_multiple_item(@NotNull PlsqlParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_multiple_item(@NotNull PlsqlParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_spec_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_spec_func(@NotNull PlsqlParser.Expr_spec_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_spec_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_spec_func(@NotNull PlsqlParser.Expr_spec_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_multi_in(@NotNull PlsqlParser.Bool_expr_multi_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_multi_in(@NotNull PlsqlParser.Bool_expr_multi_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_bteq_stmt(@NotNull PlsqlParser.If_bteq_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_bteq_stmt(@NotNull PlsqlParser.If_bteq_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull PlsqlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull PlsqlParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_hive_row_format_fields(@NotNull PlsqlParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_hive_row_format_fields(@NotNull PlsqlParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#alter_table_item}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_item(@NotNull PlsqlParser.Alter_table_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#alter_table_item}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_item(@NotNull PlsqlParser.Alter_table_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_subselect_clause(@NotNull PlsqlParser.From_subselect_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_subselect_clause(@NotNull PlsqlParser.From_subselect_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_stmt(@NotNull PlsqlParser.Fullselect_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_stmt(@NotNull PlsqlParser.Fullselect_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp_literal(@NotNull PlsqlParser.Timestamp_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp_literal(@NotNull PlsqlParser.Timestamp_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(@NotNull PlsqlParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(@NotNull PlsqlParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#package_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body(@NotNull PlsqlParser.Package_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#package_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body(@NotNull PlsqlParser.Package_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#copy_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCopy_stmt(@NotNull PlsqlParser.Copy_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#copy_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCopy_stmt(@NotNull PlsqlParser.Copy_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_func_params}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_params(@NotNull PlsqlParser.Expr_func_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_func_params}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_params(@NotNull PlsqlParser.Expr_func_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#begin_end_block}.
	 * @param ctx the parse tree
	 */
	void enterBegin_end_block(@NotNull PlsqlParser.Begin_end_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#begin_end_block}.
	 * @param ctx the parse tree
	 */
	void exitBegin_end_block(@NotNull PlsqlParser.Begin_end_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#map_object_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMap_object_stmt(@NotNull PlsqlParser.Map_object_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#map_object_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMap_object_stmt(@NotNull PlsqlParser.Map_object_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#expr_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func(@NotNull PlsqlParser.Expr_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#expr_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func(@NotNull PlsqlParser.Expr_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#include_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInclude_stmt(@NotNull PlsqlParser.Include_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#include_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInclude_stmt(@NotNull PlsqlParser.Include_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_mysql_item(@NotNull PlsqlParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_mysql_item(@NotNull PlsqlParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(@NotNull PlsqlParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(@NotNull PlsqlParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlsqlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull PlsqlParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlsqlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull PlsqlParser.StmtContext ctx);
}