// Generated from Plsql.g4 by ANTLR 4.4
package sics.seiois.res.plsql;
import org.antlr.v4.runtime.misc.NotNull;
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
	 * Visit a parse tree produced by {@link PlsqlParser#from_table_values_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_values_row(@NotNull PlsqlParser.From_table_values_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case(@NotNull PlsqlParser.Expr_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_function_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_return(@NotNull PlsqlParser.Create_function_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(@NotNull PlsqlParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_concat_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat_item(@NotNull PlsqlParser.Expr_concat_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#package_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec(@NotNull PlsqlParser.Package_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(@NotNull PlsqlParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_plsql_stmt(@NotNull PlsqlParser.If_plsql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#fetch_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_stmt(@NotNull PlsqlParser.Fetch_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#null_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_const(@NotNull PlsqlParser.Null_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#exit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_stmt(@NotNull PlsqlParser.Exit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#declare_handler_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_handler_item(@NotNull PlsqlParser.Declare_handler_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(@NotNull PlsqlParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#cursor_without_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_without_return(@NotNull PlsqlParser.Cursor_without_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(@NotNull PlsqlParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_local_temp_table_stmt(@NotNull PlsqlParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#dtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype(@NotNull PlsqlParser.DtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#block_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_end(@NotNull PlsqlParser.Block_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt_item(@NotNull PlsqlParser.Declare_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#merge_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_condition(@NotNull PlsqlParser.Merge_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_index_col}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_col(@NotNull PlsqlParser.Create_index_colContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#index_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_storage_clause(@NotNull PlsqlParser.Index_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(@NotNull PlsqlParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#for_range_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_range_stmt(@NotNull PlsqlParser.For_range_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#from_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_clause(@NotNull PlsqlParser.From_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#host_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost_cmd(@NotNull PlsqlParser.Host_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_cursor_item(@NotNull PlsqlParser.Declare_cursor_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#select_list_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_limit(@NotNull PlsqlParser.Select_list_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#qualify_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualify_clause(@NotNull PlsqlParser.Qualify_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_agg_window_func(@NotNull PlsqlParser.Expr_agg_window_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(@NotNull PlsqlParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_partition_by_clause(@NotNull PlsqlParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_stmt(@NotNull PlsqlParser.Cte_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_td_item(@NotNull PlsqlParser.Create_table_options_td_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#copy_file_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_file_option(@NotNull PlsqlParser.Copy_file_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(@NotNull PlsqlParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#quit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuit_stmt(@NotNull PlsqlParser.Quit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon_stmt(@NotNull PlsqlParser.Semicolon_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(@NotNull PlsqlParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(@NotNull PlsqlParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(@NotNull PlsqlParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_definition(@NotNull PlsqlParser.Create_table_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_name_clause(@NotNull PlsqlParser.From_table_name_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#insert_stmt_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt_row(@NotNull PlsqlParser.Insert_stmt_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_case_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_simple(@NotNull PlsqlParser.Expr_case_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#select_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_item(@NotNull PlsqlParser.Select_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#leave_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeave_stmt(@NotNull PlsqlParser.Leave_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_database_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_option(@NotNull PlsqlParser.Create_database_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_atom(@NotNull PlsqlParser.Expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#dtype_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_attr(@NotNull PlsqlParser.Dtype_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#package_spec_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec_item(@NotNull PlsqlParser.Package_spec_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#associate_locator_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociate_locator_stmt(@NotNull PlsqlParser.Associate_locator_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#update_upsert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_upsert(@NotNull PlsqlParser.Update_upsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#get_diag_stmt_rowcount_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt_rowcount_item(@NotNull PlsqlParser.Get_diag_stmt_rowcount_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(@NotNull PlsqlParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#truncate_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncate_stmt(@NotNull PlsqlParser.Truncate_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#insert_stmt_rows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt_rows(@NotNull PlsqlParser.Insert_stmt_rowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#declare_var_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_var_item(@NotNull PlsqlParser.Declare_var_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_unary(@NotNull PlsqlParser.Bool_expr_unaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_stmt(@NotNull PlsqlParser.Drop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_routine_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_params(@NotNull PlsqlParser.Create_routine_paramsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link PlsqlParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_quotedString(@NotNull PlsqlParser.Double_quotedStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#values_into_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_into_stmt(@NotNull PlsqlParser.Values_into_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options(@NotNull PlsqlParser.Create_table_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(@NotNull PlsqlParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_body_stmt(@NotNull PlsqlParser.Create_package_body_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#insert_stmt_cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt_cols(@NotNull PlsqlParser.Insert_stmt_colsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#collect_stats_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollect_stats_stmt(@NotNull PlsqlParser.Collect_stats_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#select_options_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_options_item(@NotNull PlsqlParser.Select_options_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#set_current_schema_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_current_schema_option(@NotNull PlsqlParser.Set_current_schema_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_over_clause(@NotNull PlsqlParser.Expr_func_over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_stmt_item(@NotNull PlsqlParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#copy_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_option(@NotNull PlsqlParser.Copy_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#from_join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_join_clause(@NotNull PlsqlParser.From_join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#use_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_stmt(@NotNull PlsqlParser.Use_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#delete_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_alias(@NotNull PlsqlParser.Delete_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#select_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_options(@NotNull PlsqlParser.Select_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#call_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_stmt(@NotNull PlsqlParser.Call_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(@NotNull PlsqlParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#close_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_stmt(@NotNull PlsqlParser.Close_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#update_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_assignment(@NotNull PlsqlParser.Update_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block_inplace(@NotNull PlsqlParser.Declare_block_inplaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#open_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_stmt(@NotNull PlsqlParser.Open_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link PlsqlParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_quotedString(@NotNull PlsqlParser.Single_quotedStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(@NotNull PlsqlParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_case_searched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_searched(@NotNull PlsqlParser.Expr_case_searchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#package_body_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body_item(@NotNull PlsqlParser.Package_body_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#summary_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummary_stmt(@NotNull PlsqlParser.Summary_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#update_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_table(@NotNull PlsqlParser.Update_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_file(@NotNull PlsqlParser.Expr_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#host_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost_stmt(@NotNull PlsqlParser.Host_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#int_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_number(@NotNull PlsqlParser.Int_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(@NotNull PlsqlParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#cursor_with_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_with_return(@NotNull PlsqlParser.Cursor_with_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_select(@NotNull PlsqlParser.Expr_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_columns(@NotNull PlsqlParser.Create_table_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_routine_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_options(@NotNull PlsqlParser.Create_routine_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#for_cursor_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_cursor_stmt(@NotNull PlsqlParser.For_cursor_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_interval(@NotNull PlsqlParser.Expr_intervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(@NotNull PlsqlParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#grant_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_stmt_item(@NotNull PlsqlParser.Grant_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary_operator(@NotNull PlsqlParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#date_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_literal(@NotNull PlsqlParser.Date_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#from_alias_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_alias_clause(@NotNull PlsqlParser.From_alias_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#signal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_stmt(@NotNull PlsqlParser.Signal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#select_list_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_set(@NotNull PlsqlParser.Select_list_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_name(@NotNull PlsqlParser.File_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_param_item(@NotNull PlsqlParser.Create_routine_param_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#merge_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_table(@NotNull PlsqlParser.Merge_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(@NotNull PlsqlParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_clause(@NotNull PlsqlParser.Group_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(@NotNull PlsqlParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#copy_from_local_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_from_local_stmt(@NotNull PlsqlParser.Copy_from_local_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_fk_action(@NotNull PlsqlParser.Create_table_fk_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_atom(@NotNull PlsqlParser.Bool_expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions_td_item(@NotNull PlsqlParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#declare_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt(@NotNull PlsqlParser.Declare_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(@NotNull PlsqlParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_temporary_table_item(@NotNull PlsqlParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#single_block_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_block_stmt(@NotNull PlsqlParser.Single_block_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#end_transaction_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_transaction_stmt(@NotNull PlsqlParser.End_transaction_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#get_diag_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt_item(@NotNull PlsqlParser.Get_diag_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#using_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_clause(@NotNull PlsqlParser.Using_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions(@NotNull PlsqlParser.Create_table_preoptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_all_distinct(@NotNull PlsqlParser.Expr_func_all_distinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_hive_row_format(@NotNull PlsqlParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_cursor_attribute(@NotNull PlsqlParser.Expr_cursor_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull PlsqlParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(@NotNull PlsqlParser.Bool_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#copy_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_target(@NotNull PlsqlParser.Copy_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#set_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_session_option(@NotNull PlsqlParser.Set_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_stmt_item(@NotNull PlsqlParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_database_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_stmt(@NotNull PlsqlParser.Create_database_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#raise_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_stmt(@NotNull PlsqlParser.Raise_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat(@NotNull PlsqlParser.Expr_concatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_join_type_clause(@NotNull PlsqlParser.From_join_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#declare_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block(@NotNull PlsqlParser.Declare_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_single_in(@NotNull PlsqlParser.Bool_expr_single_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull PlsqlParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_mssql_item(@NotNull PlsqlParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#insert_directory_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_directory_stmt(@NotNull PlsqlParser.Insert_directory_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#collect_stats_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollect_stats_clause(@NotNull PlsqlParser.Collect_stats_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_stmt(@NotNull PlsqlParser.Create_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_procedure_stmt(@NotNull PlsqlParser.Create_procedure_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_logical_operator(@NotNull PlsqlParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#rollback_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_stmt(@NotNull PlsqlParser.Rollback_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#dtype_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_default(@NotNull PlsqlParser.Dtype_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#get_diag_stmt_exception_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt_exception_item(@NotNull PlsqlParser.Get_diag_stmt_exception_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_single_item(@NotNull PlsqlParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#cmp_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp_source(@NotNull PlsqlParser.Cmp_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_ora_item(@NotNull PlsqlParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#hive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHive(@NotNull PlsqlParser.HiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_db2_item(@NotNull PlsqlParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions_item(@NotNull PlsqlParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#get_diag_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt(@NotNull PlsqlParser.Get_diag_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_package_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_stmt(@NotNull PlsqlParser.Create_package_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_asterisk(@NotNull PlsqlParser.Select_list_asteriskContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#non_reserved_words}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_reserved_words(@NotNull PlsqlParser.Non_reserved_wordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_routine_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_option(@NotNull PlsqlParser.Create_routine_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_values_clause(@NotNull PlsqlParser.From_table_values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#set_teradata_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_teradata_session_option(@NotNull PlsqlParser.Set_teradata_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_select_item(@NotNull PlsqlParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#resignal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResignal_stmt(@NotNull PlsqlParser.Resignal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#exception_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_block(@NotNull PlsqlParser.Exception_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#cte_select_cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_cols(@NotNull PlsqlParser.Cte_select_colsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#alter_table_add_constraint_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add_constraint_item(@NotNull PlsqlParser.Alter_table_add_constraint_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary(@NotNull PlsqlParser.Bool_expr_binaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#allocate_cursor_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocate_cursor_stmt(@NotNull PlsqlParser.Allocate_cursor_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_stmt(@NotNull PlsqlParser.Create_function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#exec_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_stmt(@NotNull PlsqlParser.Exec_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(@NotNull PlsqlParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#exception_block_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_block_item(@NotNull PlsqlParser.Exception_block_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#elseif_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_block(@NotNull PlsqlParser.Elseif_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#set_mssql_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_mssql_session_option(@NotNull PlsqlParser.Set_mssql_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(@NotNull PlsqlParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_column_inline_cons(@NotNull PlsqlParser.Create_table_column_inline_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#dtype_len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_len(@NotNull PlsqlParser.Dtype_lenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add_constraint(@NotNull PlsqlParser.Alter_table_add_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#cmp_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp_stmt(@NotNull PlsqlParser.Cmp_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#merge_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_action(@NotNull PlsqlParser.Merge_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#copy_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_source(@NotNull PlsqlParser.Copy_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#declare_condition_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_condition_item(@NotNull PlsqlParser.Declare_condition_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#hive_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHive_item(@NotNull PlsqlParser.Hive_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#describe_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_stmt(@NotNull PlsqlParser.Describe_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#host}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost(@NotNull PlsqlParser.HostContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#merge_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_stmt(@NotNull PlsqlParser.Merge_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#func_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_param(@NotNull PlsqlParser.Func_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#proc_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_block(@NotNull PlsqlParser.Proc_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt(@NotNull PlsqlParser.Assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#grant_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_stmt(@NotNull PlsqlParser.Grant_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#interval_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_item(@NotNull PlsqlParser.Interval_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_tsql_stmt(@NotNull PlsqlParser.If_tsql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_hive_item(@NotNull PlsqlParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#dec_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_number(@NotNull PlsqlParser.Dec_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#null_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_stmt(@NotNull PlsqlParser.Null_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_options_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_item(@NotNull PlsqlParser.Create_table_options_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause(@NotNull PlsqlParser.Into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_set_clause(@NotNull PlsqlParser.Fullselect_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#select_list_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_alias(@NotNull PlsqlParser.Select_list_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_item(@NotNull PlsqlParser.Assignment_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_mssql_storage_clause(@NotNull PlsqlParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#subselect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubselect_stmt(@NotNull PlsqlParser.Subselect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_columns_item(@NotNull PlsqlParser.Create_table_columns_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_column_cons(@NotNull PlsqlParser.Create_table_column_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#begin_transaction_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_transaction_stmt(@NotNull PlsqlParser.Begin_transaction_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#commit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_stmt(@NotNull PlsqlParser.Commit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_multiple_item(@NotNull PlsqlParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_spec_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_spec_func(@NotNull PlsqlParser.Expr_spec_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_multi_in(@NotNull PlsqlParser.Bool_expr_multi_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_bteq_stmt(@NotNull PlsqlParser.If_bteq_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull PlsqlParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_hive_row_format_fields(@NotNull PlsqlParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#alter_table_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_item(@NotNull PlsqlParser.Alter_table_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_subselect_clause(@NotNull PlsqlParser.From_subselect_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_stmt(@NotNull PlsqlParser.Fullselect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#timestamp_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp_literal(@NotNull PlsqlParser.Timestamp_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(@NotNull PlsqlParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#package_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body(@NotNull PlsqlParser.Package_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#copy_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_stmt(@NotNull PlsqlParser.Copy_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_func_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_params(@NotNull PlsqlParser.Expr_func_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#begin_end_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_end_block(@NotNull PlsqlParser.Begin_end_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#map_object_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_object_stmt(@NotNull PlsqlParser.Map_object_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#expr_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func(@NotNull PlsqlParser.Expr_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#include_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude_stmt(@NotNull PlsqlParser.Include_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_mysql_item(@NotNull PlsqlParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(@NotNull PlsqlParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlsqlParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(@NotNull PlsqlParser.StmtContext ctx);
}