// Generated from sics\seiois\res\plsql\Plsql.g4 by ANTLR 4.5
package sics.seiois.res.plsql;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlsqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T_ACTION=6, T_ADD2=7, T_ALL=8, 
		T_ALLOCATE=9, T_ALTER=10, T_AND=11, T_ANSI_NULLS=12, T_ANSI_PADDING=13, 
		T_AS=14, T_ASC=15, T_ASSOCIATE=16, T_AT=17, T_AUTO_INCREMENT=18, T_AVG=19, 
		T_BATCHSIZE=20, T_BEGIN=21, T_BETWEEN=22, T_BIGINT=23, T_BINARY_DOUBLE=24, 
		T_BINARY_FLOAT=25, T_BINARY_INTEGER=26, T_BIT=27, T_BODY=28, T_BREAK=29, 
		T_BY=30, T_BYTE=31, T_CALL=32, T_CALLER=33, T_CASCADE=34, T_CASE=35, T_CASESPECIFIC=36, 
		T_CAST=37, T_CHAR=38, T_CHARACTER=39, T_CHARSET=40, T_CLIENT=41, T_CLOSE=42, 
		T_CLUSTERED=43, T_CMP=44, T_COLLECT=45, T_COLLECTION=46, T_COLUMN=47, 
		T_COMMENT=48, T_CONSTANT=49, T_COMMIT=50, T_COMPRESS=51, T_CONCAT=52, 
		T_CONDITION=53, T_CONSTRAINT=54, T_CONTINUE=55, T_COPY=56, T_COUNT=57, 
		T_COUNT_BIG=58, T_CREATE=59, T_CREATION=60, T_CREATOR=61, T_CS=62, T_CURRENT=63, 
		T_CURRENT_SCHEMA=64, T_CURSOR=65, T_DATABASE=66, T_DATA=67, T_DATE=68, 
		T_DATETIME=69, T_DAY=70, T_DAYS=71, T_DEC=72, T_DECIMAL=73, T_DECLARE=74, 
		T_DEFAULT=75, T_DEFERRED=76, T_DEFINED=77, T_DEFINER=78, T_DEFINITION=79, 
		T_DELETE=80, T_DELIMITED=81, T_DELIMITER=82, T_DESC=83, T_DESCRIBE=84, 
		T_DIAGNOSTICS=85, T_DIR=86, T_DIRECTORY=87, T_DISTINCT=88, T_DISTRIBUTE=89, 
		T_DO=90, T_DOUBLE=91, T_DROP=92, T_DYNAMIC=93, T_ELSE=94, T_ELSEIF=95, 
		T_ELSIF=96, T_ENABLE=97, T_END=98, T_ENGINE=99, T_ESCAPED=100, T_EXCEPT=101, 
		T_EXEC=102, T_EXECUTE=103, T_EXCEPTION=104, T_EXCLUSIVE=105, T_EXISTS=106, 
		T_EXIT=107, T_FALLBACK=108, T_FALSE=109, T_FETCH=110, T_FIELDS=111, T_FILE=112, 
		T_FILES=113, T_FLOAT=114, T_FOR=115, T_FOREIGN=116, T_FORMAT=117, T_FOUND=118, 
		T_FROM=119, T_FULL=120, T_FUNCTION=121, T_GET=122, T_GLOBAL=123, T_GO=124, 
		T_GRANT=125, T_GROUP=126, T_HANDLER=127, T_HASH=128, T_HAVING=129, T_HDFS=130, 
		T_HIVE=131, T_HOST=132, T_IDENTITY=133, T_IF=134, T_IGNORE=135, T_IMMEDIATE=136, 
		T_IN=137, T_INCLUDE=138, T_INDEX=139, T_INITRANS=140, T_INNER=141, T_INOUT=142, 
		T_INSERT=143, T_INT=144, T_INT2=145, T_INT4=146, T_INT8=147, T_INTEGER=148, 
		T_INTERSECT=149, T_INTERVAL=150, T_INTO=151, T_INVOKER=152, T_IS=153, 
		T_ISOPEN=154, T_ITEMS=155, T_JOIN=156, T_KEEP=157, T_KEY=158, T_KEYS=159, 
		T_LANGUAGE=160, T_LEAVE=161, T_LEFT=162, T_LIKE=163, T_LIMIT=164, T_LINES=165, 
		T_LOCAL=166, T_LOCATION=167, T_LOCATOR=168, T_LOCATORS=169, T_LOCKS=170, 
		T_LOG=171, T_LOGGED=172, T_LOGGING=173, T_LOOP=174, T_MAP=175, T_MATCHED=176, 
		T_MAX=177, T_MAXTRANS=178, T_MERGE=179, T_MESSAGE_TEXT=180, T_MICROSECOND=181, 
		T_MICROSECONDS=182, T_MIN=183, T_MULTISET=184, T_NCHAR=185, T_NEW=186, 
		T_NVARCHAR=187, T_NO=188, T_NOCOUNT=189, T_NOCOMPRESS=190, T_NOLOGGING=191, 
		T_NONE=192, T_NOT=193, T_NOTFOUND=194, T_NULL=195, T_NUMERIC=196, T_NUMBER=197, 
		T_OBJECT=198, T_OFF=199, T_ON=200, T_ONLY=201, T_OPEN=202, T_OR=203, T_ORDER=204, 
		T_OUT=205, T_OUTER=206, T_OVER=207, T_OVERWRITE=208, T_OWNER=209, T_PACKAGE=210, 
		T_PARTITION=211, T_PCTFREE=212, T_PCTUSED=213, T_PLS_INTEGER=214, T_PRECISION=215, 
		T_PRESERVE=216, T_PRIMARY=217, T_PRINT=218, T_PROC=219, T_PROCEDURE=220, 
		T_QUALIFY=221, T_QUERY_BAND=222, T_QUIT=223, T_QUOTED_IDENTIFIER=224, 
		T_RAISE=225, T_REAL=226, T_REFERENCES=227, T_REGEXP=228, T_REPLACE=229, 
		T_RESIGNAL=230, T_RESTRICT=231, T_RESULT=232, T_RESULT_SET_LOCATOR=233, 
		T_RETURN=234, T_RETURNS=235, T_REVERSE=236, T_RIGHT=237, T_RLIKE=238, 
		T_ROLE=239, T_ROLLBACK=240, T_ROW=241, T_ROWS=242, T_ROWTYPE=243, T_ROW_COUNT=244, 
		T_RR=245, T_RS=246, T_PWD=247, T_TRIM=248, T_SCHEMA=249, T_SECOND=250, 
		T_SECONDS=251, T_SECURITY=252, T_SEGMENT=253, T_SEL=254, T_SELECT=255, 
		T_SET=256, T_SESSION=257, T_SESSIONS=258, T_SETS=259, T_SHARE=260, T_SIGNAL=261, 
		T_SIMPLE_DOUBLE=262, T_SIMPLE_FLOAT=263, T_SIMPLE_INTEGER=264, T_SMALLDATETIME=265, 
		T_SMALLINT=266, T_SQL=267, T_SQLEXCEPTION=268, T_SQLINSERT=269, T_SQLSTATE=270, 
		T_SQLWARNING=271, T_STATS=272, T_STATISTICS=273, T_STEP=274, T_STORAGE=275, 
		T_STORED=276, T_STRING=277, T_SUBDIR=278, T_SUBSTRING=279, T_SUM=280, 
		T_SUMMARY=281, T_SYS_REFCURSOR=282, T_TABLE=283, T_TABLESPACE=284, T_TEMPORARY=285, 
		T_TERMINATED=286, T_TEXTIMAGE_ON=287, T_THEN=288, T_TIMESTAMP=289, T_TINYINT=290, 
		T_TITLE=291, T_TO=292, T_TOP=293, T_TRANSACTION=294, T_TRUE=295, T_TRUNCATE=296, 
		T_TYPE=297, T_UNION=298, T_UNIQUE=299, T_UPDATE=300, T_UR=301, T_USE=302, 
		T_USING=303, T_VALUE=304, T_VALUES=305, T_VAR=306, T_VARCHAR=307, T_VARCHAR2=308, 
		T_VARYING=309, T_VOLATILE=310, T_WHEN=311, T_WHERE=312, T_WHILE=313, T_WITH=314, 
		T_WITHOUT=315, T_WORK=316, T_XACT_ABORT=317, T_XML=318, T_YES=319, T_CORRECT=320, 
		T_ACTIVITY_COUNT=321, T_CUME_DIST=322, T_CURRENT_DATE=323, T_CURRENT_TIMESTAMP=324, 
		T_CURRENT_USER=325, T_DENSE_RANK=326, T_FIRST_VALUE=327, T_LAG=328, T_LAST_VALUE=329, 
		T_LEAD=330, T_MAX_PART_STRING=331, T_MIN_PART_STRING=332, T_MAX_PART_INT=333, 
		T_MIN_PART_INT=334, T_MAX_PART_DATE=335, T_MIN_PART_DATE=336, T_PART_COUNT=337, 
		T_PART_LOC=338, T_RANK=339, T_ROW_NUMBER=340, T_STDEV=341, T_SYSDATE=342, 
		T_VARIANCE=343, T_USER=344, T_ADD=345, T_COLON=346, T_COMMA=347, T_PIPE=348, 
		T_DIV=349, T_DOT2=350, T_EQUAL=351, T_EQUAL2=352, T_NOTEQUAL=353, T_NOTEQUAL2=354, 
		T_GREATER=355, T_GREATEREQUAL=356, T_LESS=357, T_LESSEQUAL=358, T_MUL=359, 
		T_OPEN_B=360, T_OPEN_P=361, T_OPEN_SB=362, T_CLOSE_B=363, T_CLOSE_P=364, 
		T_CLOSE_SB=365, T_SEMICOLON=366, T_SUB=367, L_ID=368, L_S_STRING=369, 
		L_D_STRING=370, L_INT=371, L_DEC=372, L_WS=373, L_M_COMMENT=374, L_S_COMMENT=375, 
		L_FILE=376, L_LABEL=377;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_begin_end_block = 2, RULE_single_block_stmt = 3, 
		RULE_block_end = 4, RULE_proc_block = 5, RULE_stmt = 6, RULE_semicolon_stmt = 7, 
		RULE_exception_block = 8, RULE_exception_block_item = 9, RULE_null_stmt = 10, 
		RULE_expr_stmt = 11, RULE_assignment_stmt = 12, RULE_assignment_stmt_item = 13, 
		RULE_assignment_stmt_single_item = 14, RULE_assignment_stmt_multiple_item = 15, 
		RULE_assignment_stmt_select_item = 16, RULE_allocate_cursor_stmt = 17, 
		RULE_associate_locator_stmt = 18, RULE_begin_transaction_stmt = 19, RULE_break_stmt = 20, 
		RULE_call_stmt = 21, RULE_declare_stmt = 22, RULE_declare_block = 23, 
		RULE_declare_block_inplace = 24, RULE_declare_stmt_item = 25, RULE_declare_var_item = 26, 
		RULE_declare_condition_item = 27, RULE_declare_cursor_item = 28, RULE_cursor_with_return = 29, 
		RULE_cursor_without_return = 30, RULE_declare_handler_item = 31, RULE_declare_temporary_table_item = 32, 
		RULE_create_table_stmt = 33, RULE_create_local_temp_table_stmt = 34, RULE_create_table_definition = 35, 
		RULE_create_table_columns = 36, RULE_create_table_columns_item = 37, RULE_column_name = 38, 
		RULE_create_table_column_inline_cons = 39, RULE_create_table_column_cons = 40, 
		RULE_create_table_fk_action = 41, RULE_create_table_preoptions = 42, RULE_create_table_preoptions_item = 43, 
		RULE_create_table_preoptions_td_item = 44, RULE_create_table_options = 45, 
		RULE_create_table_options_item = 46, RULE_create_table_options_ora_item = 47, 
		RULE_create_table_options_db2_item = 48, RULE_create_table_options_td_item = 49, 
		RULE_create_table_options_hive_item = 50, RULE_create_table_hive_row_format = 51, 
		RULE_create_table_hive_row_format_fields = 52, RULE_create_table_options_mssql_item = 53, 
		RULE_create_table_options_mysql_item = 54, RULE_alter_table_stmt = 55, 
		RULE_alter_table_item = 56, RULE_alter_table_add_constraint = 57, RULE_alter_table_add_constraint_item = 58, 
		RULE_dtype = 59, RULE_dtype_len = 60, RULE_dtype_attr = 61, RULE_dtype_default = 62, 
		RULE_create_database_stmt = 63, RULE_create_database_option = 64, RULE_create_function_stmt = 65, 
		RULE_create_function_return = 66, RULE_create_package_stmt = 67, RULE_package_spec = 68, 
		RULE_package_spec_item = 69, RULE_create_package_body_stmt = 70, RULE_package_body = 71, 
		RULE_package_body_item = 72, RULE_create_procedure_stmt = 73, RULE_create_routine_params = 74, 
		RULE_create_routine_param_item = 75, RULE_create_routine_options = 76, 
		RULE_create_routine_option = 77, RULE_drop_stmt = 78, RULE_end_transaction_stmt = 79, 
		RULE_exec_stmt = 80, RULE_if_stmt = 81, RULE_if_plsql_stmt = 82, RULE_if_tsql_stmt = 83, 
		RULE_if_bteq_stmt = 84, RULE_elseif_block = 85, RULE_else_block = 86, 
		RULE_include_stmt = 87, RULE_insert_stmt = 88, RULE_insert_stmt_cols = 89, 
		RULE_insert_stmt_rows = 90, RULE_insert_stmt_row = 91, RULE_insert_directory_stmt = 92, 
		RULE_correct_stmt = 93, RULE_correct_stmt_cols = 94, RULE_correct_update_assignment = 95, 
		RULE_exit_stmt = 96, RULE_get_diag_stmt = 97, RULE_get_diag_stmt_item = 98, 
		RULE_get_diag_stmt_exception_item = 99, RULE_get_diag_stmt_rowcount_item = 100, 
		RULE_grant_stmt = 101, RULE_grant_stmt_item = 102, RULE_leave_stmt = 103, 
		RULE_map_object_stmt = 104, RULE_open_stmt = 105, RULE_fetch_stmt = 106, 
		RULE_collect_stats_stmt = 107, RULE_collect_stats_clause = 108, RULE_close_stmt = 109, 
		RULE_cmp_stmt = 110, RULE_cmp_source = 111, RULE_copy_from_local_stmt = 112, 
		RULE_copy_stmt = 113, RULE_copy_source = 114, RULE_copy_target = 115, 
		RULE_copy_option = 116, RULE_copy_file_option = 117, RULE_commit_stmt = 118, 
		RULE_create_index_stmt = 119, RULE_create_index_col = 120, RULE_index_storage_clause = 121, 
		RULE_index_mssql_storage_clause = 122, RULE_print_stmt = 123, RULE_quit_stmt = 124, 
		RULE_raise_stmt = 125, RULE_resignal_stmt = 126, RULE_return_stmt = 127, 
		RULE_rollback_stmt = 128, RULE_set_session_option = 129, RULE_set_current_schema_option = 130, 
		RULE_set_mssql_session_option = 131, RULE_set_teradata_session_option = 132, 
		RULE_signal_stmt = 133, RULE_summary_stmt = 134, RULE_truncate_stmt = 135, 
		RULE_use_stmt = 136, RULE_values_into_stmt = 137, RULE_while_stmt = 138, 
		RULE_for_cursor_stmt = 139, RULE_for_range_stmt = 140, RULE_label = 141, 
		RULE_using_clause = 142, RULE_select_stmt = 143, RULE_cte_select_stmt = 144, 
		RULE_cte_select_stmt_item = 145, RULE_cte_select_cols = 146, RULE_fullselect_stmt = 147, 
		RULE_fullselect_stmt_item = 148, RULE_fullselect_set_clause = 149, RULE_subselect_stmt = 150, 
		RULE_select_list = 151, RULE_select_list_set = 152, RULE_select_list_limit = 153, 
		RULE_select_list_item = 154, RULE_select_list_alias = 155, RULE_select_list_asterisk = 156, 
		RULE_into_clause = 157, RULE_from_clause = 158, RULE_from_table_clause = 159, 
		RULE_from_table_name_clause = 160, RULE_from_subselect_clause = 161, RULE_from_join_clause = 162, 
		RULE_from_join_type_clause = 163, RULE_from_table_values_clause = 164, 
		RULE_from_table_values_row = 165, RULE_from_alias_clause = 166, RULE_table_name = 167, 
		RULE_where_clause = 168, RULE_group_by_clause = 169, RULE_having_clause = 170, 
		RULE_qualify_clause = 171, RULE_order_by_clause = 172, RULE_select_options = 173, 
		RULE_select_options_item = 174, RULE_update_stmt = 175, RULE_update_assignment = 176, 
		RULE_update_table = 177, RULE_update_upsert = 178, RULE_merge_stmt = 179, 
		RULE_merge_table = 180, RULE_merge_condition = 181, RULE_merge_action = 182, 
		RULE_delete_stmt = 183, RULE_delete_alias = 184, RULE_describe_stmt = 185, 
		RULE_bool_expr = 186, RULE_bool_expr_atom = 187, RULE_bool_expr_unary = 188, 
		RULE_bool_expr_single_in = 189, RULE_bool_expr_multi_in = 190, RULE_bool_expr_binary = 191, 
		RULE_bool_expr_logical_operator = 192, RULE_bool_expr_binary_operator = 193, 
		RULE_expr = 194, RULE_expr_atom = 195, RULE_expr_interval = 196, RULE_interval_item = 197, 
		RULE_expr_concat = 198, RULE_expr_concat_item = 199, RULE_expr_case = 200, 
		RULE_expr_case_simple = 201, RULE_expr_case_searched = 202, RULE_expr_cursor_attribute = 203, 
		RULE_expr_agg_window_func = 204, RULE_expr_func_all_distinct = 205, RULE_expr_func_over_clause = 206, 
		RULE_expr_func_partition_by_clause = 207, RULE_expr_spec_func = 208, RULE_expr_func = 209, 
		RULE_expr_func_params = 210, RULE_func_param = 211, RULE_expr_select = 212, 
		RULE_expr_file = 213, RULE_hive = 214, RULE_hive_item = 215, RULE_host = 216, 
		RULE_host_cmd = 217, RULE_host_stmt = 218, RULE_file_name = 219, RULE_date_literal = 220, 
		RULE_timestamp_literal = 221, RULE_ident = 222, RULE_string = 223, RULE_int_number = 224, 
		RULE_dec_number = 225, RULE_bool_literal = 226, RULE_null_const = 227, 
		RULE_non_reserved_words = 228;
	public static final String[] ruleNames = {
		"program", "block", "begin_end_block", "single_block_stmt", "block_end", 
		"proc_block", "stmt", "semicolon_stmt", "exception_block", "exception_block_item", 
		"null_stmt", "expr_stmt", "assignment_stmt", "assignment_stmt_item", "assignment_stmt_single_item", 
		"assignment_stmt_multiple_item", "assignment_stmt_select_item", "allocate_cursor_stmt", 
		"associate_locator_stmt", "begin_transaction_stmt", "break_stmt", "call_stmt", 
		"declare_stmt", "declare_block", "declare_block_inplace", "declare_stmt_item", 
		"declare_var_item", "declare_condition_item", "declare_cursor_item", "cursor_with_return", 
		"cursor_without_return", "declare_handler_item", "declare_temporary_table_item", 
		"create_table_stmt", "create_local_temp_table_stmt", "create_table_definition", 
		"create_table_columns", "create_table_columns_item", "column_name", "create_table_column_inline_cons", 
		"create_table_column_cons", "create_table_fk_action", "create_table_preoptions", 
		"create_table_preoptions_item", "create_table_preoptions_td_item", "create_table_options", 
		"create_table_options_item", "create_table_options_ora_item", "create_table_options_db2_item", 
		"create_table_options_td_item", "create_table_options_hive_item", "create_table_hive_row_format", 
		"create_table_hive_row_format_fields", "create_table_options_mssql_item", 
		"create_table_options_mysql_item", "alter_table_stmt", "alter_table_item", 
		"alter_table_add_constraint", "alter_table_add_constraint_item", "dtype", 
		"dtype_len", "dtype_attr", "dtype_default", "create_database_stmt", "create_database_option", 
		"create_function_stmt", "create_function_return", "create_package_stmt", 
		"package_spec", "package_spec_item", "create_package_body_stmt", "package_body", 
		"package_body_item", "create_procedure_stmt", "create_routine_params", 
		"create_routine_param_item", "create_routine_options", "create_routine_option", 
		"drop_stmt", "end_transaction_stmt", "exec_stmt", "if_stmt", "if_plsql_stmt", 
		"if_tsql_stmt", "if_bteq_stmt", "elseif_block", "else_block", "include_stmt", 
		"insert_stmt", "insert_stmt_cols", "insert_stmt_rows", "insert_stmt_row", 
		"insert_directory_stmt", "correct_stmt", "correct_stmt_cols", "correct_update_assignment", 
		"exit_stmt", "get_diag_stmt", "get_diag_stmt_item", "get_diag_stmt_exception_item", 
		"get_diag_stmt_rowcount_item", "grant_stmt", "grant_stmt_item", "leave_stmt", 
		"map_object_stmt", "open_stmt", "fetch_stmt", "collect_stats_stmt", "collect_stats_clause", 
		"close_stmt", "cmp_stmt", "cmp_source", "copy_from_local_stmt", "copy_stmt", 
		"copy_source", "copy_target", "copy_option", "copy_file_option", "commit_stmt", 
		"create_index_stmt", "create_index_col", "index_storage_clause", "index_mssql_storage_clause", 
		"print_stmt", "quit_stmt", "raise_stmt", "resignal_stmt", "return_stmt", 
		"rollback_stmt", "set_session_option", "set_current_schema_option", "set_mssql_session_option", 
		"set_teradata_session_option", "signal_stmt", "summary_stmt", "truncate_stmt", 
		"use_stmt", "values_into_stmt", "while_stmt", "for_cursor_stmt", "for_range_stmt", 
		"label", "using_clause", "select_stmt", "cte_select_stmt", "cte_select_stmt_item", 
		"cte_select_cols", "fullselect_stmt", "fullselect_stmt_item", "fullselect_set_clause", 
		"subselect_stmt", "select_list", "select_list_set", "select_list_limit", 
		"select_list_item", "select_list_alias", "select_list_asterisk", "into_clause", 
		"from_clause", "from_table_clause", "from_table_name_clause", "from_subselect_clause", 
		"from_join_clause", "from_join_type_clause", "from_table_values_clause", 
		"from_table_values_row", "from_alias_clause", "table_name", "where_clause", 
		"group_by_clause", "having_clause", "qualify_clause", "order_by_clause", 
		"select_options", "select_options_item", "update_stmt", "update_assignment", 
		"update_table", "update_upsert", "merge_stmt", "merge_table", "merge_condition", 
		"merge_action", "delete_stmt", "delete_alias", "describe_stmt", "bool_expr", 
		"bool_expr_atom", "bool_expr_unary", "bool_expr_single_in", "bool_expr_multi_in", 
		"bool_expr_binary", "bool_expr_logical_operator", "bool_expr_binary_operator", 
		"expr", "expr_atom", "expr_interval", "interval_item", "expr_concat", 
		"expr_concat_item", "expr_case", "expr_case_simple", "expr_case_searched", 
		"expr_cursor_attribute", "expr_agg_window_func", "expr_func_all_distinct", 
		"expr_func_over_clause", "expr_func_partition_by_clause", "expr_spec_func", 
		"expr_func", "expr_func_params", "func_param", "expr_select", "expr_file", 
		"hive", "hive_item", "host", "host_cmd", "host_stmt", "file_name", "date_literal", 
		"timestamp_literal", "ident", "string", "int_number", "dec_number", "bool_literal", 
		"null_const", "non_reserved_words"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@'", "'#'", "'%'", "'.'", "'!'", null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "'+'", "':'", 
		"','", "'||'", "'/'", "'..'", "'='", "'=='", "'<>'", "'!='", "'>'", "'>='", 
		"'<'", "'<='", "'*'", "'{'", "'('", "'['", "'}'", "')'", "']'", "';'", 
		"'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "T_ACTION", "T_ADD2", "T_ALL", "T_ALLOCATE", 
		"T_ALTER", "T_AND", "T_ANSI_NULLS", "T_ANSI_PADDING", "T_AS", "T_ASC", 
		"T_ASSOCIATE", "T_AT", "T_AUTO_INCREMENT", "T_AVG", "T_BATCHSIZE", "T_BEGIN", 
		"T_BETWEEN", "T_BIGINT", "T_BINARY_DOUBLE", "T_BINARY_FLOAT", "T_BINARY_INTEGER", 
		"T_BIT", "T_BODY", "T_BREAK", "T_BY", "T_BYTE", "T_CALL", "T_CALLER", 
		"T_CASCADE", "T_CASE", "T_CASESPECIFIC", "T_CAST", "T_CHAR", "T_CHARACTER", 
		"T_CHARSET", "T_CLIENT", "T_CLOSE", "T_CLUSTERED", "T_CMP", "T_COLLECT", 
		"T_COLLECTION", "T_COLUMN", "T_COMMENT", "T_CONSTANT", "T_COMMIT", "T_COMPRESS", 
		"T_CONCAT", "T_CONDITION", "T_CONSTRAINT", "T_CONTINUE", "T_COPY", "T_COUNT", 
		"T_COUNT_BIG", "T_CREATE", "T_CREATION", "T_CREATOR", "T_CS", "T_CURRENT", 
		"T_CURRENT_SCHEMA", "T_CURSOR", "T_DATABASE", "T_DATA", "T_DATE", "T_DATETIME", 
		"T_DAY", "T_DAYS", "T_DEC", "T_DECIMAL", "T_DECLARE", "T_DEFAULT", "T_DEFERRED", 
		"T_DEFINED", "T_DEFINER", "T_DEFINITION", "T_DELETE", "T_DELIMITED", "T_DELIMITER", 
		"T_DESC", "T_DESCRIBE", "T_DIAGNOSTICS", "T_DIR", "T_DIRECTORY", "T_DISTINCT", 
		"T_DISTRIBUTE", "T_DO", "T_DOUBLE", "T_DROP", "T_DYNAMIC", "T_ELSE", "T_ELSEIF", 
		"T_ELSIF", "T_ENABLE", "T_END", "T_ENGINE", "T_ESCAPED", "T_EXCEPT", "T_EXEC", 
		"T_EXECUTE", "T_EXCEPTION", "T_EXCLUSIVE", "T_EXISTS", "T_EXIT", "T_FALLBACK", 
		"T_FALSE", "T_FETCH", "T_FIELDS", "T_FILE", "T_FILES", "T_FLOAT", "T_FOR", 
		"T_FOREIGN", "T_FORMAT", "T_FOUND", "T_FROM", "T_FULL", "T_FUNCTION", 
		"T_GET", "T_GLOBAL", "T_GO", "T_GRANT", "T_GROUP", "T_HANDLER", "T_HASH", 
		"T_HAVING", "T_HDFS", "T_HIVE", "T_HOST", "T_IDENTITY", "T_IF", "T_IGNORE", 
		"T_IMMEDIATE", "T_IN", "T_INCLUDE", "T_INDEX", "T_INITRANS", "T_INNER", 
		"T_INOUT", "T_INSERT", "T_INT", "T_INT2", "T_INT4", "T_INT8", "T_INTEGER", 
		"T_INTERSECT", "T_INTERVAL", "T_INTO", "T_INVOKER", "T_IS", "T_ISOPEN", 
		"T_ITEMS", "T_JOIN", "T_KEEP", "T_KEY", "T_KEYS", "T_LANGUAGE", "T_LEAVE", 
		"T_LEFT", "T_LIKE", "T_LIMIT", "T_LINES", "T_LOCAL", "T_LOCATION", "T_LOCATOR", 
		"T_LOCATORS", "T_LOCKS", "T_LOG", "T_LOGGED", "T_LOGGING", "T_LOOP", "T_MAP", 
		"T_MATCHED", "T_MAX", "T_MAXTRANS", "T_MERGE", "T_MESSAGE_TEXT", "T_MICROSECOND", 
		"T_MICROSECONDS", "T_MIN", "T_MULTISET", "T_NCHAR", "T_NEW", "T_NVARCHAR", 
		"T_NO", "T_NOCOUNT", "T_NOCOMPRESS", "T_NOLOGGING", "T_NONE", "T_NOT", 
		"T_NOTFOUND", "T_NULL", "T_NUMERIC", "T_NUMBER", "T_OBJECT", "T_OFF", 
		"T_ON", "T_ONLY", "T_OPEN", "T_OR", "T_ORDER", "T_OUT", "T_OUTER", "T_OVER", 
		"T_OVERWRITE", "T_OWNER", "T_PACKAGE", "T_PARTITION", "T_PCTFREE", "T_PCTUSED", 
		"T_PLS_INTEGER", "T_PRECISION", "T_PRESERVE", "T_PRIMARY", "T_PRINT", 
		"T_PROC", "T_PROCEDURE", "T_QUALIFY", "T_QUERY_BAND", "T_QUIT", "T_QUOTED_IDENTIFIER", 
		"T_RAISE", "T_REAL", "T_REFERENCES", "T_REGEXP", "T_REPLACE", "T_RESIGNAL", 
		"T_RESTRICT", "T_RESULT", "T_RESULT_SET_LOCATOR", "T_RETURN", "T_RETURNS", 
		"T_REVERSE", "T_RIGHT", "T_RLIKE", "T_ROLE", "T_ROLLBACK", "T_ROW", "T_ROWS", 
		"T_ROWTYPE", "T_ROW_COUNT", "T_RR", "T_RS", "T_PWD", "T_TRIM", "T_SCHEMA", 
		"T_SECOND", "T_SECONDS", "T_SECURITY", "T_SEGMENT", "T_SEL", "T_SELECT", 
		"T_SET", "T_SESSION", "T_SESSIONS", "T_SETS", "T_SHARE", "T_SIGNAL", "T_SIMPLE_DOUBLE", 
		"T_SIMPLE_FLOAT", "T_SIMPLE_INTEGER", "T_SMALLDATETIME", "T_SMALLINT", 
		"T_SQL", "T_SQLEXCEPTION", "T_SQLINSERT", "T_SQLSTATE", "T_SQLWARNING", 
		"T_STATS", "T_STATISTICS", "T_STEP", "T_STORAGE", "T_STORED", "T_STRING", 
		"T_SUBDIR", "T_SUBSTRING", "T_SUM", "T_SUMMARY", "T_SYS_REFCURSOR", "T_TABLE", 
		"T_TABLESPACE", "T_TEMPORARY", "T_TERMINATED", "T_TEXTIMAGE_ON", "T_THEN", 
		"T_TIMESTAMP", "T_TINYINT", "T_TITLE", "T_TO", "T_TOP", "T_TRANSACTION", 
		"T_TRUE", "T_TRUNCATE", "T_TYPE", "T_UNION", "T_UNIQUE", "T_UPDATE", "T_UR", 
		"T_USE", "T_USING", "T_VALUE", "T_VALUES", "T_VAR", "T_VARCHAR", "T_VARCHAR2", 
		"T_VARYING", "T_VOLATILE", "T_WHEN", "T_WHERE", "T_WHILE", "T_WITH", "T_WITHOUT", 
		"T_WORK", "T_XACT_ABORT", "T_XML", "T_YES", "T_CORRECT", "T_ACTIVITY_COUNT", 
		"T_CUME_DIST", "T_CURRENT_DATE", "T_CURRENT_TIMESTAMP", "T_CURRENT_USER", 
		"T_DENSE_RANK", "T_FIRST_VALUE", "T_LAG", "T_LAST_VALUE", "T_LEAD", "T_MAX_PART_STRING", 
		"T_MIN_PART_STRING", "T_MAX_PART_INT", "T_MIN_PART_INT", "T_MAX_PART_DATE", 
		"T_MIN_PART_DATE", "T_PART_COUNT", "T_PART_LOC", "T_RANK", "T_ROW_NUMBER", 
		"T_STDEV", "T_SYSDATE", "T_VARIANCE", "T_USER", "T_ADD", "T_COLON", "T_COMMA", 
		"T_PIPE", "T_DIV", "T_DOT2", "T_EQUAL", "T_EQUAL2", "T_NOTEQUAL", "T_NOTEQUAL2", 
		"T_GREATER", "T_GREATEREQUAL", "T_LESS", "T_LESSEQUAL", "T_MUL", "T_OPEN_B", 
		"T_OPEN_P", "T_OPEN_SB", "T_CLOSE_B", "T_CLOSE_P", "T_CLOSE_SB", "T_SEMICOLON", 
		"T_SUB", "L_ID", "L_S_STRING", "L_D_STRING", "L_INT", "L_DEC", "L_WS", 
		"L_M_COMMENT", "L_S_COMMENT", "L_FILE", "L_LABEL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Plsql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlsqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PlsqlParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			block();
			setState(459);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<Begin_end_blockContext> begin_end_block() {
			return getRuleContexts(Begin_end_blockContext.class);
		}
		public Begin_end_blockContext begin_end_block(int i) {
			return getRuleContext(Begin_end_blockContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> T_GO() { return getTokens(PlsqlParser.T_GO); }
		public TerminalNode T_GO(int i) {
			return getToken(PlsqlParser.T_GO, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(468); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(463);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(461);
						begin_end_block();
						}
						break;
					case 2:
						{
						setState(462);
						stmt();
						}
						break;
					}
					setState(466);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(465);
						match(T_GO);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(470); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Begin_end_blockContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(PlsqlParser.T_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public Declare_blockContext declare_block() {
			return getRuleContext(Declare_blockContext.class,0);
		}
		public Exception_blockContext exception_block() {
			return getRuleContext(Exception_blockContext.class,0);
		}
		public Begin_end_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_end_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterBegin_end_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitBegin_end_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitBegin_end_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_end_blockContext begin_end_block() throws RecognitionException {
		Begin_end_blockContext _localctx = new Begin_end_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_begin_end_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_la = _input.LA(1);
			if (_la==T_DECLARE) {
				{
				setState(472);
				declare_block();
				}
			}

			setState(475);
			match(T_BEGIN);
			setState(476);
			block();
			setState(478);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(477);
				exception_block();
				}
				break;
			}
			setState(480);
			block_end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_block_stmtContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(PlsqlParser.T_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public Exception_blockContext exception_block() {
			return getRuleContext(Exception_blockContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(PlsqlParser.T_SEMICOLON, 0); }
		public Single_block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_block_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterSingle_block_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitSingle_block_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitSingle_block_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_block_stmtContext single_block_stmt() throws RecognitionException {
		Single_block_stmtContext _localctx = new Single_block_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single_block_stmt);
		try {
			setState(493);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				match(T_BEGIN);
				setState(483);
				block();
				setState(485);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(484);
					exception_block();
					}
					break;
				}
				setState(487);
				block_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				stmt();
				setState(491);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(490);
					match(T_SEMICOLON);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_endContext extends ParserRuleContext {
		public TerminalNode T_END() { return getToken(PlsqlParser.T_END, 0); }
		public Block_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterBlock_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitBlock_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitBlock_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_endContext block_end() throws RecognitionException {
		Block_endContext _localctx = new Block_endContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			if (!(!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION"))) throw new FailedPredicateException(this, "!_input.LT(2).getText().equalsIgnoreCase(\"TRANSACTION\")");
			setState(496);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Proc_blockContext extends ParserRuleContext {
		public Begin_end_blockContext begin_end_block() {
			return getRuleContext(Begin_end_blockContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode T_GO() { return getToken(PlsqlParser.T_GO, 0); }
		public Proc_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterProc_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitProc_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitProc_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_blockContext proc_block() throws RecognitionException {
		Proc_blockContext _localctx = new Proc_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_proc_block);
		try {
			int _alt;
			setState(507);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				begin_end_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(499);
						stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(502);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(505);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(504);
					match(T_GO);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public Assignment_stmtContext assignment_stmt() {
			return getRuleContext(Assignment_stmtContext.class,0);
		}
		public Allocate_cursor_stmtContext allocate_cursor_stmt() {
			return getRuleContext(Allocate_cursor_stmtContext.class,0);
		}
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Associate_locator_stmtContext associate_locator_stmt() {
			return getRuleContext(Associate_locator_stmtContext.class,0);
		}
		public Begin_transaction_stmtContext begin_transaction_stmt() {
			return getRuleContext(Begin_transaction_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Call_stmtContext call_stmt() {
			return getRuleContext(Call_stmtContext.class,0);
		}
		public Collect_stats_stmtContext collect_stats_stmt() {
			return getRuleContext(Collect_stats_stmtContext.class,0);
		}
		public Close_stmtContext close_stmt() {
			return getRuleContext(Close_stmtContext.class,0);
		}
		public Cmp_stmtContext cmp_stmt() {
			return getRuleContext(Cmp_stmtContext.class,0);
		}
		public Copy_from_local_stmtContext copy_from_local_stmt() {
			return getRuleContext(Copy_from_local_stmtContext.class,0);
		}
		public Copy_stmtContext copy_stmt() {
			return getRuleContext(Copy_stmtContext.class,0);
		}
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Create_database_stmtContext create_database_stmt() {
			return getRuleContext(Create_database_stmtContext.class,0);
		}
		public Create_function_stmtContext create_function_stmt() {
			return getRuleContext(Create_function_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_local_temp_table_stmtContext create_local_temp_table_stmt() {
			return getRuleContext(Create_local_temp_table_stmtContext.class,0);
		}
		public Create_package_stmtContext create_package_stmt() {
			return getRuleContext(Create_package_stmtContext.class,0);
		}
		public Create_package_body_stmtContext create_package_body_stmt() {
			return getRuleContext(Create_package_body_stmtContext.class,0);
		}
		public Create_procedure_stmtContext create_procedure_stmt() {
			return getRuleContext(Create_procedure_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Declare_stmtContext declare_stmt() {
			return getRuleContext(Declare_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Describe_stmtContext describe_stmt() {
			return getRuleContext(Describe_stmtContext.class,0);
		}
		public Drop_stmtContext drop_stmt() {
			return getRuleContext(Drop_stmtContext.class,0);
		}
		public End_transaction_stmtContext end_transaction_stmt() {
			return getRuleContext(End_transaction_stmtContext.class,0);
		}
		public Exec_stmtContext exec_stmt() {
			return getRuleContext(Exec_stmtContext.class,0);
		}
		public Exit_stmtContext exit_stmt() {
			return getRuleContext(Exit_stmtContext.class,0);
		}
		public Fetch_stmtContext fetch_stmt() {
			return getRuleContext(Fetch_stmtContext.class,0);
		}
		public For_cursor_stmtContext for_cursor_stmt() {
			return getRuleContext(For_cursor_stmtContext.class,0);
		}
		public For_range_stmtContext for_range_stmt() {
			return getRuleContext(For_range_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Include_stmtContext include_stmt() {
			return getRuleContext(Include_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Insert_directory_stmtContext insert_directory_stmt() {
			return getRuleContext(Insert_directory_stmtContext.class,0);
		}
		public Get_diag_stmtContext get_diag_stmt() {
			return getRuleContext(Get_diag_stmtContext.class,0);
		}
		public Grant_stmtContext grant_stmt() {
			return getRuleContext(Grant_stmtContext.class,0);
		}
		public Leave_stmtContext leave_stmt() {
			return getRuleContext(Leave_stmtContext.class,0);
		}
		public Map_object_stmtContext map_object_stmt() {
			return getRuleContext(Map_object_stmtContext.class,0);
		}
		public Merge_stmtContext merge_stmt() {
			return getRuleContext(Merge_stmtContext.class,0);
		}
		public Open_stmtContext open_stmt() {
			return getRuleContext(Open_stmtContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public Quit_stmtContext quit_stmt() {
			return getRuleContext(Quit_stmtContext.class,0);
		}
		public Raise_stmtContext raise_stmt() {
			return getRuleContext(Raise_stmtContext.class,0);
		}
		public Resignal_stmtContext resignal_stmt() {
			return getRuleContext(Resignal_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Signal_stmtContext signal_stmt() {
			return getRuleContext(Signal_stmtContext.class,0);
		}
		public Summary_stmtContext summary_stmt() {
			return getRuleContext(Summary_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Use_stmtContext use_stmt() {
			return getRuleContext(Use_stmtContext.class,0);
		}
		public Truncate_stmtContext truncate_stmt() {
			return getRuleContext(Truncate_stmtContext.class,0);
		}
		public Values_into_stmtContext values_into_stmt() {
			return getRuleContext(Values_into_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public HiveContext hive() {
			return getRuleContext(HiveContext.class,0);
		}
		public HostContext host() {
			return getRuleContext(HostContext.class,0);
		}
		public Null_stmtContext null_stmt() {
			return getRuleContext(Null_stmtContext.class,0);
		}
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Semicolon_stmtContext semicolon_stmt() {
			return getRuleContext(Semicolon_stmtContext.class,0);
		}
		public Correct_stmtContext correct_stmt() {
			return getRuleContext(Correct_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(571);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				allocate_cursor_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(511);
				alter_table_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(512);
				associate_locator_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(513);
				begin_transaction_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(514);
				break_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(515);
				call_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(516);
				collect_stats_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(517);
				close_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(518);
				cmp_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(519);
				copy_from_local_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(520);
				copy_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(521);
				commit_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(522);
				create_database_stmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(523);
				create_function_stmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(524);
				create_index_stmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(525);
				create_local_temp_table_stmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(526);
				create_package_stmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(527);
				create_package_body_stmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(528);
				create_procedure_stmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(529);
				create_table_stmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(530);
				declare_stmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(531);
				delete_stmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(532);
				describe_stmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(533);
				drop_stmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(534);
				end_transaction_stmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(535);
				exec_stmt();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(536);
				exit_stmt();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(537);
				fetch_stmt();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(538);
				for_cursor_stmt();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(539);
				for_range_stmt();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(540);
				if_stmt();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(541);
				include_stmt();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(542);
				insert_stmt();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(543);
				insert_directory_stmt();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(544);
				get_diag_stmt();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(545);
				grant_stmt();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(546);
				leave_stmt();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(547);
				map_object_stmt();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(548);
				merge_stmt();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(549);
				open_stmt();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(550);
				print_stmt();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(551);
				quit_stmt();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(552);
				raise_stmt();
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(553);
				resignal_stmt();
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(554);
				return_stmt();
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(555);
				rollback_stmt();
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(556);
				select_stmt();
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(557);
				signal_stmt();
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(558);
				summary_stmt();
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(559);
				update_stmt();
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(560);
				use_stmt();
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(561);
				truncate_stmt();
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(562);
				values_into_stmt();
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(563);
				while_stmt();
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(564);
				label();
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				setState(565);
				hive();
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 58);
				{
				setState(566);
				host();
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				setState(567);
				null_stmt();
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(568);
				expr_stmt();
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				setState(569);
				semicolon_stmt();
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 62);
				{
				setState(570);
				correct_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Semicolon_stmtContext extends ParserRuleContext {
		public TerminalNode T_SEMICOLON() { return getToken(PlsqlParser.T_SEMICOLON, 0); }
		public Semicolon_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterSemicolon_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitSemicolon_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitSemicolon_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Semicolon_stmtContext semicolon_stmt() throws RecognitionException {
		Semicolon_stmtContext _localctx = new Semicolon_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_semicolon_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1 || _la==T_DIV || _la==T_SEMICOLON) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exception_blockContext extends ParserRuleContext {
		public TerminalNode T_EXCEPTION() { return getToken(PlsqlParser.T_EXCEPTION, 0); }
		public List<Exception_block_itemContext> exception_block_item() {
			return getRuleContexts(Exception_block_itemContext.class);
		}
		public Exception_block_itemContext exception_block_item(int i) {
			return getRuleContext(Exception_block_itemContext.class,i);
		}
		public Exception_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterException_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitException_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitException_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_blockContext exception_block() throws RecognitionException {
		Exception_blockContext _localctx = new Exception_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exception_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(T_EXCEPTION);
			setState(577);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(576);
					exception_block_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exception_block_itemContext extends ParserRuleContext {
		public List<TerminalNode> T_WHEN() { return getTokens(PlsqlParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(PlsqlParser.T_WHEN, i);
		}
		public TerminalNode L_ID() { return getToken(PlsqlParser.L_ID, 0); }
		public TerminalNode T_THEN() { return getToken(PlsqlParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(PlsqlParser.T_END, 0); }
		public Exception_block_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_block_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterException_block_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitException_block_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitException_block_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_block_itemContext exception_block_item() throws RecognitionException {
		Exception_block_itemContext _localctx = new Exception_block_itemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exception_block_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(T_WHEN);
			setState(582);
			match(L_ID);
			setState(583);
			match(T_THEN);
			setState(584);
			block();
			setState(585);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T_END || _la==T_WHEN) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_stmtContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(PlsqlParser.T_NULL, 0); }
		public Null_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterNull_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitNull_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitNull_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_stmtContext null_stmt() throws RecognitionException {
		Null_stmtContext _localctx = new Null_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_null_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(T_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitExpr_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("GO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"GO\")");
			setState(590);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmtContext extends ParserRuleContext {
		public TerminalNode T_SET() { return getToken(PlsqlParser.T_SET, 0); }
		public Set_session_optionContext set_session_option() {
			return getRuleContext(Set_session_optionContext.class,0);
		}
		public List<Assignment_stmt_itemContext> assignment_stmt_item() {
			return getRuleContexts(Assignment_stmt_itemContext.class);
		}
		public Assignment_stmt_itemContext assignment_stmt_item(int i) {
			return getRuleContext(Assignment_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public Assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterAssignment_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitAssignment_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitAssignment_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment_stmt);
		try {
			int _alt;
			setState(605);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				match(T_SET);
				setState(593);
				set_session_option();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(595);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(594);
					match(T_SET);
					}
					break;
				}
				setState(597);
				assignment_stmt_item();
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(598);
						match(T_COMMA);
						setState(599);
						assignment_stmt_item();
						}
						}
					}
					setState(604);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_itemContext extends ParserRuleContext {
		public Assignment_stmt_single_itemContext assignment_stmt_single_item() {
			return getRuleContext(Assignment_stmt_single_itemContext.class,0);
		}
		public Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() {
			return getRuleContext(Assignment_stmt_multiple_itemContext.class,0);
		}
		public Assignment_stmt_select_itemContext assignment_stmt_select_item() {
			return getRuleContext(Assignment_stmt_select_itemContext.class,0);
		}
		public Assignment_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterAssignment_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitAssignment_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitAssignment_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_itemContext assignment_stmt_item() throws RecognitionException {
		Assignment_stmt_itemContext _localctx = new Assignment_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment_stmt_item);
		try {
			setState(610);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				assignment_stmt_single_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				assignment_stmt_multiple_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(609);
				assignment_stmt_select_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_single_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(PlsqlParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COLON() { return getToken(PlsqlParser.T_COLON, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public Assignment_stmt_single_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_single_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterAssignment_stmt_single_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitAssignment_stmt_single_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitAssignment_stmt_single_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_single_itemContext assignment_stmt_single_item() throws RecognitionException {
		Assignment_stmt_single_itemContext _localctx = new Assignment_stmt_single_itemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment_stmt_single_item);
		int _la;
		try {
			setState(628);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_CORRECT:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				ident();
				setState(614);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(613);
					match(T_COLON);
					}
				}

				setState(616);
				match(T_EQUAL);
				setState(617);
				expr(0);
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
				match(T_OPEN_P);
				setState(620);
				ident();
				setState(621);
				match(T_CLOSE_P);
				setState(623);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(622);
					match(T_COLON);
					}
				}

				setState(625);
				match(T_EQUAL);
				setState(626);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_multiple_itemContext extends ParserRuleContext {
		public List<TerminalNode> T_OPEN_P() { return getTokens(PlsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(PlsqlParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(PlsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(PlsqlParser.T_CLOSE_P, i);
		}
		public TerminalNode T_EQUAL() { return getToken(PlsqlParser.T_EQUAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public TerminalNode T_COLON() { return getToken(PlsqlParser.T_COLON, 0); }
		public Assignment_stmt_multiple_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_multiple_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterAssignment_stmt_multiple_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitAssignment_stmt_multiple_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitAssignment_stmt_multiple_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() throws RecognitionException {
		Assignment_stmt_multiple_itemContext _localctx = new Assignment_stmt_multiple_itemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment_stmt_multiple_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(T_OPEN_P);
			setState(631);
			ident();
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(632);
				match(T_COMMA);
				setState(633);
				ident();
				}
				}
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(639);
			match(T_CLOSE_P);
			setState(641);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(640);
				match(T_COLON);
				}
			}

			setState(643);
			match(T_EQUAL);
			setState(644);
			match(T_OPEN_P);
			setState(645);
			expr(0);
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(646);
				match(T_COMMA);
				setState(647);
				expr(0);
				}
				}
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(653);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_select_itemContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(PlsqlParser.T_EQUAL, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(PlsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(PlsqlParser.T_OPEN_P, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(PlsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(PlsqlParser.T_CLOSE_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_COLON() { return getToken(PlsqlParser.T_COLON, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public Assignment_stmt_select_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_select_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterAssignment_stmt_select_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitAssignment_stmt_select_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitAssignment_stmt_select_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_select_itemContext assignment_stmt_select_item() throws RecognitionException {
		Assignment_stmt_select_itemContext _localctx = new Assignment_stmt_select_itemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment_stmt_select_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_CORRECT:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case L_ID:
				{
				setState(655);
				ident();
				}
				break;
			case T_OPEN_P:
				{
				{
				setState(656);
				match(T_OPEN_P);
				setState(657);
				ident();
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(658);
					match(T_COMMA);
					setState(659);
					ident();
					}
					}
					setState(664);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(665);
				match(T_CLOSE_P);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(670);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(669);
				match(T_COLON);
				}
			}

			setState(672);
			match(T_EQUAL);
			setState(673);
			match(T_OPEN_P);
			setState(674);
			select_stmt();
			setState(675);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Allocate_cursor_stmtContext extends ParserRuleContext {
		public TerminalNode T_ALLOCATE() { return getToken(PlsqlParser.T_ALLOCATE, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CURSOR() { return getToken(PlsqlParser.T_CURSOR, 0); }
		public TerminalNode T_FOR() { return getToken(PlsqlParser.T_FOR, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(PlsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_RESULT() { return getToken(PlsqlParser.T_RESULT, 0); }
		public TerminalNode T_SET() { return getToken(PlsqlParser.T_SET, 0); }
		public Allocate_cursor_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocate_cursor_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterAllocate_cursor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitAllocate_cursor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitAllocate_cursor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Allocate_cursor_stmtContext allocate_cursor_stmt() throws RecognitionException {
		Allocate_cursor_stmtContext _localctx = new Allocate_cursor_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_allocate_cursor_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			match(T_ALLOCATE);
			setState(678);
			ident();
			setState(679);
			match(T_CURSOR);
			setState(680);
			match(T_FOR);
			setState(684);
			switch (_input.LA(1)) {
			case T_RESULT:
				{
				{
				setState(681);
				match(T_RESULT);
				setState(682);
				match(T_SET);
				}
				}
				break;
			case T_PROCEDURE:
				{
				setState(683);
				match(T_PROCEDURE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(686);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Associate_locator_stmtContext extends ParserRuleContext {
		public TerminalNode T_ASSOCIATE() { return getToken(PlsqlParser.T_ASSOCIATE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_WITH() { return getToken(PlsqlParser.T_WITH, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(PlsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_LOCATOR() { return getToken(PlsqlParser.T_LOCATOR, 0); }
		public TerminalNode T_LOCATORS() { return getToken(PlsqlParser.T_LOCATORS, 0); }
		public TerminalNode T_RESULT() { return getToken(PlsqlParser.T_RESULT, 0); }
		public TerminalNode T_SET() { return getToken(PlsqlParser.T_SET, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public Associate_locator_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associate_locator_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterAssociate_locator_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitAssociate_locator_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitAssociate_locator_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Associate_locator_stmtContext associate_locator_stmt() throws RecognitionException {
		Associate_locator_stmtContext _localctx = new Associate_locator_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_associate_locator_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(T_ASSOCIATE);
			setState(691);
			_la = _input.LA(1);
			if (_la==T_RESULT) {
				{
				setState(689);
				match(T_RESULT);
				setState(690);
				match(T_SET);
				}
			}

			setState(693);
			_la = _input.LA(1);
			if ( !(_la==T_LOCATOR || _la==T_LOCATORS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(694);
			match(T_OPEN_P);
			setState(695);
			ident();
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(696);
				match(T_COMMA);
				setState(697);
				ident();
				}
				}
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(703);
			match(T_CLOSE_P);
			setState(704);
			match(T_WITH);
			setState(705);
			match(T_PROCEDURE);
			setState(706);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Begin_transaction_stmtContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(PlsqlParser.T_BEGIN, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(PlsqlParser.T_TRANSACTION, 0); }
		public Begin_transaction_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_transaction_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterBegin_transaction_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitBegin_transaction_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitBegin_transaction_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_transaction_stmtContext begin_transaction_stmt() throws RecognitionException {
		Begin_transaction_stmtContext _localctx = new Begin_transaction_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_begin_transaction_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(T_BEGIN);
			setState(709);
			match(T_TRANSACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_stmtContext extends ParserRuleContext {
		public TerminalNode T_BREAK() { return getToken(PlsqlParser.T_BREAK, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterBreak_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitBreak_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(T_BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_stmtContext extends ParserRuleContext {
		public TerminalNode T_CALL() { return getToken(PlsqlParser.T_CALL, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public Call_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCall_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCall_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCall_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_stmtContext call_stmt() throws RecognitionException {
		Call_stmtContext _localctx = new Call_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_call_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(T_CALL);
			setState(714);
			ident();
			setState(721);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(715);
				match(T_OPEN_P);
				setState(717);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(716);
					expr_func_params();
					}
					break;
				}
				setState(719);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(720);
				expr_func_params();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_stmtContext extends ParserRuleContext {
		public TerminalNode T_DECLARE() { return getToken(PlsqlParser.T_DECLARE, 0); }
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public Declare_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterDeclare_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitDeclare_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitDeclare_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stmtContext declare_stmt() throws RecognitionException {
		Declare_stmtContext _localctx = new Declare_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declare_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(T_DECLARE);
			setState(724);
			declare_stmt_item();
			setState(729);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(725);
					match(T_COMMA);
					setState(726);
					declare_stmt_item();
					}
					}
				}
				setState(731);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_blockContext extends ParserRuleContext {
		public TerminalNode T_DECLARE() { return getToken(PlsqlParser.T_DECLARE, 0); }
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(PlsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(PlsqlParser.T_SEMICOLON, i);
		}
		public Declare_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterDeclare_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitDeclare_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitDeclare_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_blockContext declare_block() throws RecognitionException {
		Declare_blockContext _localctx = new Declare_blockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declare_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(T_DECLARE);
			setState(733);
			declare_stmt_item();
			setState(734);
			match(T_SEMICOLON);
			setState(740);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(735);
					declare_stmt_item();
					setState(736);
					match(T_SEMICOLON);
					}
					}
				}
				setState(742);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_block_inplaceContext extends ParserRuleContext {
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(PlsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(PlsqlParser.T_SEMICOLON, i);
		}
		public Declare_block_inplaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_block_inplace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterDeclare_block_inplace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitDeclare_block_inplace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitDeclare_block_inplace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_block_inplaceContext declare_block_inplace() throws RecognitionException {
		Declare_block_inplaceContext _localctx = new Declare_block_inplaceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_declare_block_inplace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			declare_stmt_item();
			setState(744);
			match(T_SEMICOLON);
			setState(750);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(745);
					declare_stmt_item();
					setState(746);
					match(T_SEMICOLON);
					}
					}
				}
				setState(752);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_stmt_itemContext extends ParserRuleContext {
		public Declare_cursor_itemContext declare_cursor_item() {
			return getRuleContext(Declare_cursor_itemContext.class,0);
		}
		public Declare_condition_itemContext declare_condition_item() {
			return getRuleContext(Declare_condition_itemContext.class,0);
		}
		public Declare_handler_itemContext declare_handler_item() {
			return getRuleContext(Declare_handler_itemContext.class,0);
		}
		public Declare_var_itemContext declare_var_item() {
			return getRuleContext(Declare_var_itemContext.class,0);
		}
		public Declare_temporary_table_itemContext declare_temporary_table_item() {
			return getRuleContext(Declare_temporary_table_itemContext.class,0);
		}
		public Declare_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterDeclare_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitDeclare_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitDeclare_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stmt_itemContext declare_stmt_item() throws RecognitionException {
		Declare_stmt_itemContext _localctx = new Declare_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declare_stmt_item);
		try {
			setState(758);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(753);
				declare_cursor_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(754);
				declare_condition_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(755);
				declare_handler_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(756);
				declare_var_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(757);
				declare_temporary_table_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_var_itemContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public TerminalNode T_AS() { return getToken(PlsqlParser.T_AS, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public TerminalNode T_CONSTANT() { return getToken(PlsqlParser.T_CONSTANT, 0); }
		public Declare_var_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_var_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterDeclare_var_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitDeclare_var_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitDeclare_var_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_var_itemContext declare_var_item() throws RecognitionException {
		Declare_var_itemContext _localctx = new Declare_var_itemContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declare_var_item);
		int _la;
		try {
			int _alt;
			setState(795);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(760);
				ident();
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(761);
					match(T_COMMA);
					setState(762);
					ident();
					}
					}
					setState(767);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(769);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(768);
					match(T_AS);
					}
					break;
				}
				setState(771);
				dtype();
				setState(773);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(772);
					dtype_len();
					}
					break;
				}
				setState(778);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(775);
						dtype_attr();
						}
						}
					}
					setState(780);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(782);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(781);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				ident();
				setState(785);
				match(T_CONSTANT);
				setState(787);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(786);
					match(T_AS);
					}
					break;
				}
				setState(789);
				dtype();
				setState(791);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(790);
					dtype_len();
					}
				}

				setState(793);
				dtype_default();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_condition_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CONDITION() { return getToken(PlsqlParser.T_CONDITION, 0); }
		public Declare_condition_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_condition_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterDeclare_condition_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitDeclare_condition_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitDeclare_condition_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_condition_itemContext declare_condition_item() throws RecognitionException {
		Declare_condition_itemContext _localctx = new Declare_condition_itemContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declare_condition_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			ident();
			setState(798);
			match(T_CONDITION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_cursor_itemContext extends ParserRuleContext {
		public TerminalNode T_IS() { return getToken(PlsqlParser.T_IS, 0); }
		public TerminalNode T_AS() { return getToken(PlsqlParser.T_AS, 0); }
		public TerminalNode T_FOR() { return getToken(PlsqlParser.T_FOR, 0); }
		public TerminalNode T_CURSOR() { return getToken(PlsqlParser.T_CURSOR, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Cursor_with_returnContext cursor_with_return() {
			return getRuleContext(Cursor_with_returnContext.class,0);
		}
		public Cursor_without_returnContext cursor_without_return() {
			return getRuleContext(Cursor_without_returnContext.class,0);
		}
		public Declare_cursor_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_cursor_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterDeclare_cursor_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitDeclare_cursor_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitDeclare_cursor_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_cursor_itemContext declare_cursor_item() throws RecognitionException {
		Declare_cursor_itemContext _localctx = new Declare_cursor_itemContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_declare_cursor_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(800);
				match(T_CURSOR);
				setState(801);
				ident();
				}
				break;
			case 2:
				{
				setState(802);
				ident();
				setState(803);
				match(T_CURSOR);
				}
				break;
			}
			setState(809);
			switch (_input.LA(1)) {
			case T_WITH:
				{
				setState(807);
				cursor_with_return();
				}
				break;
			case T_WITHOUT:
				{
				setState(808);
				cursor_without_return();
				}
				break;
			case T_AS:
			case T_FOR:
			case T_IS:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(811);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_FOR || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(814);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(812);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(813);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_with_returnContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(PlsqlParser.T_WITH, 0); }
		public TerminalNode T_RETURN() { return getToken(PlsqlParser.T_RETURN, 0); }
		public TerminalNode T_ONLY() { return getToken(PlsqlParser.T_ONLY, 0); }
		public TerminalNode T_TO() { return getToken(PlsqlParser.T_TO, 0); }
		public TerminalNode T_CALLER() { return getToken(PlsqlParser.T_CALLER, 0); }
		public TerminalNode T_CLIENT() { return getToken(PlsqlParser.T_CLIENT, 0); }
		public Cursor_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_with_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCursor_with_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCursor_with_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCursor_with_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_with_returnContext cursor_with_return() throws RecognitionException {
		Cursor_with_returnContext _localctx = new Cursor_with_returnContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cursor_with_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(T_WITH);
			setState(817);
			match(T_RETURN);
			setState(819);
			_la = _input.LA(1);
			if (_la==T_ONLY) {
				{
				setState(818);
				match(T_ONLY);
				}
			}

			setState(823);
			_la = _input.LA(1);
			if (_la==T_TO) {
				{
				setState(821);
				match(T_TO);
				setState(822);
				_la = _input.LA(1);
				if ( !(_la==T_CALLER || _la==T_CLIENT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_without_returnContext extends ParserRuleContext {
		public TerminalNode T_WITHOUT() { return getToken(PlsqlParser.T_WITHOUT, 0); }
		public TerminalNode T_RETURN() { return getToken(PlsqlParser.T_RETURN, 0); }
		public Cursor_without_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_without_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCursor_without_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCursor_without_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCursor_without_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_without_returnContext cursor_without_return() throws RecognitionException {
		Cursor_without_returnContext _localctx = new Cursor_without_returnContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cursor_without_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			match(T_WITHOUT);
			setState(826);
			match(T_RETURN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_handler_itemContext extends ParserRuleContext {
		public TerminalNode T_HANDLER() { return getToken(PlsqlParser.T_HANDLER, 0); }
		public TerminalNode T_FOR() { return getToken(PlsqlParser.T_FOR, 0); }
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public TerminalNode T_CONTINUE() { return getToken(PlsqlParser.T_CONTINUE, 0); }
		public TerminalNode T_EXIT() { return getToken(PlsqlParser.T_EXIT, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(PlsqlParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(PlsqlParser.T_SQLWARNING, 0); }
		public TerminalNode T_NOT() { return getToken(PlsqlParser.T_NOT, 0); }
		public TerminalNode T_FOUND() { return getToken(PlsqlParser.T_FOUND, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Declare_handler_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_handler_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterDeclare_handler_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitDeclare_handler_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitDeclare_handler_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_handler_itemContext declare_handler_item() throws RecognitionException {
		Declare_handler_itemContext _localctx = new Declare_handler_itemContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_declare_handler_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			_la = _input.LA(1);
			if ( !(_la==T_CONTINUE || _la==T_EXIT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(829);
			match(T_HANDLER);
			setState(830);
			match(T_FOR);
			setState(836);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(831);
				match(T_SQLEXCEPTION);
				}
				break;
			case 2:
				{
				setState(832);
				match(T_SQLWARNING);
				}
				break;
			case 3:
				{
				setState(833);
				match(T_NOT);
				setState(834);
				match(T_FOUND);
				}
				break;
			case 4:
				{
				setState(835);
				ident();
				}
				break;
			}
			setState(838);
			single_block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_temporary_table_itemContext extends ParserRuleContext {
		public TerminalNode T_TEMPORARY() { return getToken(PlsqlParser.T_TEMPORARY, 0); }
		public TerminalNode T_TABLE() { return getToken(PlsqlParser.T_TABLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_GLOBAL() { return getToken(PlsqlParser.T_GLOBAL, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Declare_temporary_table_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_temporary_table_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterDeclare_temporary_table_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitDeclare_temporary_table_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitDeclare_temporary_table_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_temporary_table_itemContext declare_temporary_table_item() throws RecognitionException {
		Declare_temporary_table_itemContext _localctx = new Declare_temporary_table_itemContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_declare_temporary_table_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			_la = _input.LA(1);
			if (_la==T_GLOBAL) {
				{
				setState(840);
				match(T_GLOBAL);
				}
			}

			setState(843);
			match(T_TEMPORARY);
			setState(844);
			match(T_TABLE);
			setState(845);
			ident();
			setState(847);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(846);
				create_table_preoptions();
				}
			}

			setState(849);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(PlsqlParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(PlsqlParser.T_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_IF() { return getToken(PlsqlParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(PlsqlParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(PlsqlParser.T_EXISTS, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			match(T_CREATE);
			setState(852);
			match(T_TABLE);
			setState(856);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(853);
				match(T_IF);
				setState(854);
				match(T_NOT);
				setState(855);
				match(T_EXISTS);
				}
				break;
			}
			setState(858);
			table_name();
			setState(860);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(859);
				create_table_preoptions();
				}
			}

			setState(862);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_local_temp_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(PlsqlParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(PlsqlParser.T_TABLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_LOCAL() { return getToken(PlsqlParser.T_LOCAL, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(PlsqlParser.T_TEMPORARY, 0); }
		public TerminalNode T_VOLATILE() { return getToken(PlsqlParser.T_VOLATILE, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public TerminalNode T_SET() { return getToken(PlsqlParser.T_SET, 0); }
		public TerminalNode T_MULTISET() { return getToken(PlsqlParser.T_MULTISET, 0); }
		public Create_local_temp_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_local_temp_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_local_temp_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_local_temp_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_local_temp_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_local_temp_table_stmtContext create_local_temp_table_stmt() throws RecognitionException {
		Create_local_temp_table_stmtContext _localctx = new Create_local_temp_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_create_local_temp_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(T_CREATE);
			setState(871);
			switch (_input.LA(1)) {
			case T_LOCAL:
				{
				setState(865);
				match(T_LOCAL);
				setState(866);
				match(T_TEMPORARY);
				}
				break;
			case T_MULTISET:
			case T_SET:
			case T_VOLATILE:
				{
				setState(868);
				_la = _input.LA(1);
				if (_la==T_MULTISET || _la==T_SET) {
					{
					setState(867);
					_la = _input.LA(1);
					if ( !(_la==T_MULTISET || _la==T_SET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(870);
				match(T_VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(873);
			match(T_TABLE);
			setState(874);
			ident();
			setState(876);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(875);
				create_table_preoptions();
				}
			}

			setState(878);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_definitionContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public Create_table_columnsContext create_table_columns() {
			return getRuleContext(Create_table_columnsContext.class,0);
		}
		public Create_table_optionsContext create_table_options() {
			return getRuleContext(Create_table_optionsContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(PlsqlParser.T_AS, 0); }
		public Create_table_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_table_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_table_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_table_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_definitionContext create_table_definition() throws RecognitionException {
		Create_table_definitionContext _localctx = new Create_table_definitionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_create_table_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(881);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(880);
					match(T_AS);
					}
				}

				setState(883);
				match(T_OPEN_P);
				setState(884);
				select_stmt();
				setState(885);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(888);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(887);
					match(T_AS);
					}
				}

				setState(890);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(891);
				match(T_OPEN_P);
				setState(892);
				create_table_columns();
				setState(893);
				match(T_CLOSE_P);
				}
				break;
			}
			setState(898);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(897);
				create_table_options();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_columnsContext extends ParserRuleContext {
		public List<Create_table_columns_itemContext> create_table_columns_item() {
			return getRuleContexts(Create_table_columns_itemContext.class);
		}
		public Create_table_columns_itemContext create_table_columns_item(int i) {
			return getRuleContext(Create_table_columns_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public Create_table_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_table_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_table_columns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_table_columns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_columnsContext create_table_columns() throws RecognitionException {
		Create_table_columnsContext _localctx = new Create_table_columnsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_create_table_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			create_table_columns_item();
			setState(905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(901);
				match(T_COMMA);
				setState(902);
				create_table_columns_item();
				}
				}
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_columns_itemContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public List<Create_table_column_inline_consContext> create_table_column_inline_cons() {
			return getRuleContexts(Create_table_column_inline_consContext.class);
		}
		public Create_table_column_inline_consContext create_table_column_inline_cons(int i) {
			return getRuleContext(Create_table_column_inline_consContext.class,i);
		}
		public Create_table_column_consContext create_table_column_cons() {
			return getRuleContext(Create_table_column_consContext.class,0);
		}
		public TerminalNode T_CONSTRAINT() { return getToken(PlsqlParser.T_CONSTRAINT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_columns_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_table_columns_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_table_columns_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_table_columns_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_columns_itemContext create_table_columns_item() throws RecognitionException {
		Create_table_columns_itemContext _localctx = new Create_table_columns_itemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_create_table_columns_item);
		int _la;
		try {
			int _alt;
			setState(930);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				column_name();
				setState(909);
				dtype();
				setState(911);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(910);
					dtype_len();
					}
				}

				setState(916);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(913);
						dtype_attr();
						}
						}
					}
					setState(918);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_AUTO_INCREMENT || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (T_DEFAULT - 75)) | (1L << (T_ENABLE - 75)) | (1L << (T_IDENTITY - 75)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (T_NOT - 193)) | (1L << (T_NULL - 193)) | (1L << (T_PRIMARY - 193)) | (1L << (T_REFERENCES - 193)))) != 0) || ((((_la - 299)) & ~0x3f) == 0 && ((1L << (_la - 299)) & ((1L << (T_UNIQUE - 299)) | (1L << (T_WITH - 299)) | (1L << (T_COLON - 299)) | (1L << (T_EQUAL - 299)))) != 0)) {
					{
					{
					setState(919);
					create_table_column_inline_cons();
					}
					}
					setState(924);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(927);
				_la = _input.LA(1);
				if (_la==T_CONSTRAINT) {
					{
					setState(925);
					match(T_CONSTRAINT);
					setState(926);
					ident();
					}
				}

				setState(929);
				create_table_column_cons();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_column_inline_consContext extends ParserRuleContext {
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public TerminalNode T_NULL() { return getToken(PlsqlParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(PlsqlParser.T_NOT, 0); }
		public TerminalNode T_PRIMARY() { return getToken(PlsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(PlsqlParser.T_KEY, 0); }
		public TerminalNode T_UNIQUE() { return getToken(PlsqlParser.T_UNIQUE, 0); }
		public TerminalNode T_REFERENCES() { return getToken(PlsqlParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public TerminalNode T_IDENTITY() { return getToken(PlsqlParser.T_IDENTITY, 0); }
		public List<TerminalNode> L_INT() { return getTokens(PlsqlParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(PlsqlParser.L_INT, i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public TerminalNode T_AUTO_INCREMENT() { return getToken(PlsqlParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_ENABLE() { return getToken(PlsqlParser.T_ENABLE, 0); }
		public Create_table_column_inline_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_inline_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_table_column_inline_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_table_column_inline_cons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_table_column_inline_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_column_inline_consContext create_table_column_inline_cons() throws RecognitionException {
		Create_table_column_inline_consContext _localctx = new Create_table_column_inline_consContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_create_table_column_inline_cons);
		int _la;
		try {
			setState(966);
			switch (_input.LA(1)) {
			case T_DEFAULT:
			case T_WITH:
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(934);
				dtype_default();
				}
				break;
			case T_NOT:
			case T_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(936);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(935);
					match(T_NOT);
					}
				}

				setState(938);
				match(T_NULL);
				}
				break;
			case T_PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(939);
				match(T_PRIMARY);
				setState(940);
				match(T_KEY);
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(941);
				match(T_UNIQUE);
				}
				break;
			case T_REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(942);
				match(T_REFERENCES);
				setState(943);
				table_name();
				setState(944);
				match(T_OPEN_P);
				setState(945);
				ident();
				setState(946);
				match(T_CLOSE_P);
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(947);
					create_table_fk_action();
					}
					}
					setState(952);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T_IDENTITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(953);
				match(T_IDENTITY);
				setState(954);
				match(T_OPEN_P);
				setState(955);
				match(L_INT);
				setState(960);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(956);
					match(T_COMMA);
					setState(957);
					match(L_INT);
					}
					}
					setState(962);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(963);
				match(T_CLOSE_P);
				}
				break;
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(964);
				match(T_AUTO_INCREMENT);
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(965);
				match(T_ENABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_column_consContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(PlsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(PlsqlParser.T_KEY, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(PlsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(PlsqlParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(PlsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(PlsqlParser.T_CLOSE_P, i);
		}
		public TerminalNode T_CLUSTERED() { return getToken(PlsqlParser.T_CLUSTERED, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public TerminalNode T_ENABLE() { return getToken(PlsqlParser.T_ENABLE, 0); }
		public Index_storage_clauseContext index_storage_clause() {
			return getRuleContext(Index_storage_clauseContext.class,0);
		}
		public List<TerminalNode> T_ASC() { return getTokens(PlsqlParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(PlsqlParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(PlsqlParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(PlsqlParser.T_DESC, i);
		}
		public TerminalNode T_FOREIGN() { return getToken(PlsqlParser.T_FOREIGN, 0); }
		public TerminalNode T_REFERENCES() { return getToken(PlsqlParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public Create_table_column_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_table_column_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_table_column_cons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_table_column_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_column_consContext create_table_column_cons() throws RecognitionException {
		Create_table_column_consContext _localctx = new Create_table_column_consContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_create_table_column_cons);
		int _la;
		try {
			setState(1025);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(968);
				match(T_PRIMARY);
				setState(969);
				match(T_KEY);
				setState(971);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(970);
					match(T_CLUSTERED);
					}
				}

				setState(973);
				match(T_OPEN_P);
				setState(974);
				ident();
				setState(976);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(975);
					_la = _input.LA(1);
					if ( !(_la==T_ASC || _la==T_DESC) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(978);
					match(T_COMMA);
					setState(979);
					ident();
					setState(981);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(980);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
					}

					}
					}
					setState(987);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(988);
				match(T_CLOSE_P);
				setState(990);
				_la = _input.LA(1);
				if (_la==T_ENABLE) {
					{
					setState(989);
					match(T_ENABLE);
					}
				}

				setState(993);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(992);
					index_storage_clause();
					}
				}

				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(995);
				match(T_FOREIGN);
				setState(996);
				match(T_KEY);
				setState(997);
				match(T_OPEN_P);
				setState(998);
				ident();
				setState(1003);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(999);
					match(T_COMMA);
					setState(1000);
					ident();
					}
					}
					setState(1005);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1006);
				match(T_CLOSE_P);
				setState(1007);
				match(T_REFERENCES);
				setState(1008);
				table_name();
				setState(1009);
				match(T_OPEN_P);
				setState(1010);
				ident();
				setState(1015);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1011);
					match(T_COMMA);
					setState(1012);
					ident();
					}
					}
					setState(1017);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1018);
				match(T_CLOSE_P);
				setState(1022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(1019);
					create_table_fk_action();
					}
					}
					setState(1024);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_fk_actionContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(PlsqlParser.T_ON, 0); }
		public TerminalNode T_UPDATE() { return getToken(PlsqlParser.T_UPDATE, 0); }
		public TerminalNode T_DELETE() { return getToken(PlsqlParser.T_DELETE, 0); }
		public TerminalNode T_NO() { return getToken(PlsqlParser.T_NO, 0); }
		public TerminalNode T_ACTION() { return getToken(PlsqlParser.T_ACTION, 0); }
		public TerminalNode T_RESTRICT() { return getToken(PlsqlParser.T_RESTRICT, 0); }
		public TerminalNode T_SET() { return getToken(PlsqlParser.T_SET, 0); }
		public TerminalNode T_NULL() { return getToken(PlsqlParser.T_NULL, 0); }
		public TerminalNode T_DEFAULT() { return getToken(PlsqlParser.T_DEFAULT, 0); }
		public TerminalNode T_CASCADE() { return getToken(PlsqlParser.T_CASCADE, 0); }
		public Create_table_fk_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_fk_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_table_fk_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_table_fk_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_table_fk_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_fk_actionContext create_table_fk_action() throws RecognitionException {
		Create_table_fk_actionContext _localctx = new Create_table_fk_actionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_create_table_fk_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			match(T_ON);
			setState(1028);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_UPDATE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1037);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(1029);
				match(T_NO);
				setState(1030);
				match(T_ACTION);
				}
				break;
			case 2:
				{
				setState(1031);
				match(T_RESTRICT);
				}
				break;
			case 3:
				{
				setState(1032);
				match(T_SET);
				setState(1033);
				match(T_NULL);
				}
				break;
			case 4:
				{
				setState(1034);
				match(T_SET);
				setState(1035);
				match(T_DEFAULT);
				}
				break;
			case 5:
				{
				setState(1036);
				match(T_CASCADE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preoptionsContext extends ParserRuleContext {
		public List<Create_table_preoptions_itemContext> create_table_preoptions_item() {
			return getRuleContexts(Create_table_preoptions_itemContext.class);
		}
		public Create_table_preoptions_itemContext create_table_preoptions_item(int i) {
			return getRuleContext(Create_table_preoptions_itemContext.class,i);
		}
		public Create_table_preoptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_table_preoptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_table_preoptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_table_preoptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptionsContext create_table_preoptions() throws RecognitionException {
		Create_table_preoptionsContext _localctx = new Create_table_preoptionsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_create_table_preoptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1039);
				create_table_preoptions_item();
				}
				}
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_ROW || _la==T_STORED || _la==T_COMMA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preoptions_itemContext extends ParserRuleContext {
		public TerminalNode T_COMMA() { return getToken(PlsqlParser.T_COMMA, 0); }
		public Create_table_preoptions_td_itemContext create_table_preoptions_td_item() {
			return getRuleContext(Create_table_preoptions_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_preoptions_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_table_preoptions_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_table_preoptions_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_table_preoptions_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptions_itemContext create_table_preoptions_item() throws RecognitionException {
		Create_table_preoptions_itemContext _localctx = new Create_table_preoptions_itemContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_create_table_preoptions_item);
		try {
			setState(1047);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1044);
				match(T_COMMA);
				setState(1045);
				create_table_preoptions_td_item();
				}
				break;
			case T_ROW:
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1046);
				create_table_options_hive_item();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preoptions_td_itemContext extends ParserRuleContext {
		public TerminalNode T_LOG() { return getToken(PlsqlParser.T_LOG, 0); }
		public TerminalNode T_FALLBACK() { return getToken(PlsqlParser.T_FALLBACK, 0); }
		public TerminalNode T_NO() { return getToken(PlsqlParser.T_NO, 0); }
		public Create_table_preoptions_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_td_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_table_preoptions_td_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_table_preoptions_td_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_table_preoptions_td_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptions_td_itemContext create_table_preoptions_td_item() throws RecognitionException {
		Create_table_preoptions_td_itemContext _localctx = new Create_table_preoptions_td_itemContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_create_table_preoptions_td_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			_la = _input.LA(1);
			if (_la==T_NO) {
				{
				setState(1049);
				match(T_NO);
				}
			}

			setState(1052);
			_la = _input.LA(1);
			if ( !(_la==T_FALLBACK || _la==T_LOG) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_optionsContext extends ParserRuleContext {
		public List<Create_table_options_itemContext> create_table_options_item() {
			return getRuleContexts(Create_table_options_itemContext.class);
		}
		public Create_table_options_itemContext create_table_options_item(int i) {
			return getRuleContext(Create_table_options_itemContext.class,i);
		}
		public Create_table_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_table_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_table_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_table_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_optionsContext create_table_options() throws RecognitionException {
		Create_table_optionsContext _localctx = new Create_table_optionsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_create_table_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1054);
					create_table_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1057);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(PlsqlParser.T_ON, 0); }
		public TerminalNode T_COMMIT() { return getToken(PlsqlParser.T_COMMIT, 0); }
		public TerminalNode T_ROWS() { return getToken(PlsqlParser.T_ROWS, 0); }
		public TerminalNode T_DELETE() { return getToken(PlsqlParser.T_DELETE, 0); }
		public TerminalNode T_PRESERVE() { return getToken(PlsqlParser.T_PRESERVE, 0); }
		public Create_table_options_ora_itemContext create_table_options_ora_item() {
			return getRuleContext(Create_table_options_ora_itemContext.class,0);
		}
		public Create_table_options_db2_itemContext create_table_options_db2_item() {
			return getRuleContext(Create_table_options_db2_itemContext.class,0);
		}
		public Create_table_options_td_itemContext create_table_options_td_item() {
			return getRuleContext(Create_table_options_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_options_mssql_itemContext create_table_options_mssql_item() {
			return getRuleContext(Create_table_options_mssql_itemContext.class,0);
		}
		public Create_table_options_mysql_itemContext create_table_options_mysql_item() {
			return getRuleContext(Create_table_options_mysql_itemContext.class,0);
		}
		public Create_table_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_table_options_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_table_options_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_table_options_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_itemContext create_table_options_item() throws RecognitionException {
		Create_table_options_itemContext _localctx = new Create_table_options_itemContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_create_table_options_item);
		int _la;
		try {
			setState(1069);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1059);
				match(T_ON);
				setState(1060);
				match(T_COMMIT);
				setState(1061);
				_la = _input.LA(1);
				if ( !(_la==T_DELETE || _la==T_PRESERVE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1062);
				match(T_ROWS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1063);
				create_table_options_ora_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1064);
				create_table_options_db2_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1065);
				create_table_options_td_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1066);
				create_table_options_hive_item();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1067);
				create_table_options_mssql_item();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1068);
				create_table_options_mysql_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_ora_itemContext extends ParserRuleContext {
		public TerminalNode T_SEGMENT() { return getToken(PlsqlParser.T_SEGMENT, 0); }
		public TerminalNode T_CREATION() { return getToken(PlsqlParser.T_CREATION, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(PlsqlParser.T_IMMEDIATE, 0); }
		public TerminalNode T_DEFERRED() { return getToken(PlsqlParser.T_DEFERRED, 0); }
		public List<TerminalNode> L_INT() { return getTokens(PlsqlParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(PlsqlParser.L_INT, i);
		}
		public TerminalNode T_PCTFREE() { return getToken(PlsqlParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(PlsqlParser.T_PCTUSED, 0); }
		public TerminalNode T_INITRANS() { return getToken(PlsqlParser.T_INITRANS, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(PlsqlParser.T_MAXTRANS, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(PlsqlParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_LOGGING() { return getToken(PlsqlParser.T_LOGGING, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(PlsqlParser.T_NOLOGGING, 0); }
		public TerminalNode T_STORAGE() { return getToken(PlsqlParser.T_STORAGE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_TABLESPACE() { return getToken(PlsqlParser.T_TABLESPACE, 0); }
		public Create_table_options_ora_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_ora_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_table_options_ora_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_table_options_ora_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_table_options_ora_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_ora_itemContext create_table_options_ora_item() throws RecognitionException {
		Create_table_options_ora_itemContext _localctx = new Create_table_options_ora_itemContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_create_table_options_ora_item);
		int _la;
		try {
			setState(1089);
			switch (_input.LA(1)) {
			case T_SEGMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1071);
				match(T_SEGMENT);
				setState(1072);
				match(T_CREATION);
				setState(1073);
				_la = _input.LA(1);
				if ( !(_la==T_DEFERRED || _la==T_IMMEDIATE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case T_INITRANS:
			case T_MAXTRANS:
			case T_PCTFREE:
			case T_PCTUSED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1074);
				_la = _input.LA(1);
				if ( !(_la==T_INITRANS || _la==T_MAXTRANS || _la==T_PCTFREE || _la==T_PCTUSED) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1075);
				match(L_INT);
				}
				break;
			case T_NOCOMPRESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1076);
				match(T_NOCOMPRESS);
				}
				break;
			case T_LOGGING:
			case T_NOLOGGING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1077);
				_la = _input.LA(1);
				if ( !(_la==T_LOGGING || _la==T_NOLOGGING) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case T_STORAGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1078);
				match(T_STORAGE);
				setState(1079);
				match(T_OPEN_P);
				setState(1082);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(1082);
					switch (_input.LA(1)) {
					case T_ACTION:
					case T_ADD2:
					case T_ALL:
					case T_ALLOCATE:
					case T_ALTER:
					case T_AND:
					case T_ANSI_NULLS:
					case T_ANSI_PADDING:
					case T_AS:
					case T_ASC:
					case T_ASSOCIATE:
					case T_AT:
					case T_AUTO_INCREMENT:
					case T_AVG:
					case T_BATCHSIZE:
					case T_BEGIN:
					case T_BETWEEN:
					case T_BIGINT:
					case T_BINARY_DOUBLE:
					case T_BINARY_FLOAT:
					case T_BIT:
					case T_BODY:
					case T_BREAK:
					case T_BY:
					case T_BYTE:
					case T_CALL:
					case T_CALLER:
					case T_CASCADE:
					case T_CASE:
					case T_CASESPECIFIC:
					case T_CAST:
					case T_CHAR:
					case T_CHARACTER:
					case T_CHARSET:
					case T_CLIENT:
					case T_CLOSE:
					case T_CLUSTERED:
					case T_CMP:
					case T_COLLECT:
					case T_COLLECTION:
					case T_COLUMN:
					case T_COMMENT:
					case T_CONSTANT:
					case T_COMMIT:
					case T_COMPRESS:
					case T_CONCAT:
					case T_CONDITION:
					case T_CONSTRAINT:
					case T_CONTINUE:
					case T_COPY:
					case T_COUNT:
					case T_COUNT_BIG:
					case T_CREATE:
					case T_CREATION:
					case T_CREATOR:
					case T_CS:
					case T_CURRENT:
					case T_CURRENT_SCHEMA:
					case T_CURSOR:
					case T_DATABASE:
					case T_DATA:
					case T_DATE:
					case T_DATETIME:
					case T_DAY:
					case T_DAYS:
					case T_DEC:
					case T_DECIMAL:
					case T_DECLARE:
					case T_DEFAULT:
					case T_DEFERRED:
					case T_DEFINED:
					case T_DEFINER:
					case T_DEFINITION:
					case T_DELETE:
					case T_DELIMITED:
					case T_DELIMITER:
					case T_DESC:
					case T_DESCRIBE:
					case T_DIAGNOSTICS:
					case T_DIR:
					case T_DIRECTORY:
					case T_DISTINCT:
					case T_DISTRIBUTE:
					case T_DO:
					case T_DOUBLE:
					case T_DROP:
					case T_DYNAMIC:
					case T_ENABLE:
					case T_ENGINE:
					case T_ESCAPED:
					case T_EXCEPT:
					case T_EXEC:
					case T_EXECUTE:
					case T_EXCEPTION:
					case T_EXCLUSIVE:
					case T_EXISTS:
					case T_EXIT:
					case T_FALLBACK:
					case T_FALSE:
					case T_FETCH:
					case T_FIELDS:
					case T_FILE:
					case T_FILES:
					case T_FLOAT:
					case T_FOR:
					case T_FOREIGN:
					case T_FORMAT:
					case T_FOUND:
					case T_FROM:
					case T_FULL:
					case T_FUNCTION:
					case T_GET:
					case T_GLOBAL:
					case T_GO:
					case T_GRANT:
					case T_GROUP:
					case T_HANDLER:
					case T_HASH:
					case T_HAVING:
					case T_HDFS:
					case T_HIVE:
					case T_HOST:
					case T_IDENTITY:
					case T_IF:
					case T_IGNORE:
					case T_IMMEDIATE:
					case T_IN:
					case T_INCLUDE:
					case T_INDEX:
					case T_INITRANS:
					case T_INNER:
					case T_INOUT:
					case T_INSERT:
					case T_INT:
					case T_INT2:
					case T_INT4:
					case T_INT8:
					case T_INTEGER:
					case T_INTERSECT:
					case T_INTERVAL:
					case T_INTO:
					case T_INVOKER:
					case T_IS:
					case T_ISOPEN:
					case T_ITEMS:
					case T_JOIN:
					case T_KEEP:
					case T_KEY:
					case T_KEYS:
					case T_LANGUAGE:
					case T_LEAVE:
					case T_LEFT:
					case T_LIKE:
					case T_LIMIT:
					case T_LINES:
					case T_LOCAL:
					case T_LOCATION:
					case T_LOCATOR:
					case T_LOCATORS:
					case T_LOCKS:
					case T_LOG:
					case T_LOGGED:
					case T_LOGGING:
					case T_LOOP:
					case T_MAP:
					case T_MATCHED:
					case T_MAX:
					case T_MAXTRANS:
					case T_MERGE:
					case T_MESSAGE_TEXT:
					case T_MICROSECOND:
					case T_MICROSECONDS:
					case T_MIN:
					case T_MULTISET:
					case T_NCHAR:
					case T_NEW:
					case T_NVARCHAR:
					case T_NO:
					case T_NOCOUNT:
					case T_NOCOMPRESS:
					case T_NOLOGGING:
					case T_NONE:
					case T_NOT:
					case T_NOTFOUND:
					case T_NUMERIC:
					case T_NUMBER:
					case T_OBJECT:
					case T_OFF:
					case T_ON:
					case T_ONLY:
					case T_OPEN:
					case T_OR:
					case T_ORDER:
					case T_OUT:
					case T_OUTER:
					case T_OVER:
					case T_OVERWRITE:
					case T_OWNER:
					case T_PACKAGE:
					case T_PARTITION:
					case T_PCTFREE:
					case T_PCTUSED:
					case T_PRECISION:
					case T_PRESERVE:
					case T_PRIMARY:
					case T_PRINT:
					case T_PROC:
					case T_PROCEDURE:
					case T_QUALIFY:
					case T_QUERY_BAND:
					case T_QUIT:
					case T_QUOTED_IDENTIFIER:
					case T_RAISE:
					case T_REAL:
					case T_REFERENCES:
					case T_REGEXP:
					case T_REPLACE:
					case T_RESIGNAL:
					case T_RESTRICT:
					case T_RESULT:
					case T_RESULT_SET_LOCATOR:
					case T_RETURN:
					case T_RETURNS:
					case T_REVERSE:
					case T_RIGHT:
					case T_RLIKE:
					case T_ROLE:
					case T_ROLLBACK:
					case T_ROW:
					case T_ROWS:
					case T_ROW_COUNT:
					case T_RR:
					case T_RS:
					case T_PWD:
					case T_TRIM:
					case T_SCHEMA:
					case T_SECOND:
					case T_SECONDS:
					case T_SECURITY:
					case T_SEGMENT:
					case T_SEL:
					case T_SELECT:
					case T_SET:
					case T_SESSION:
					case T_SESSIONS:
					case T_SETS:
					case T_SHARE:
					case T_SIGNAL:
					case T_SIMPLE_DOUBLE:
					case T_SIMPLE_FLOAT:
					case T_SMALLDATETIME:
					case T_SMALLINT:
					case T_SQL:
					case T_SQLEXCEPTION:
					case T_SQLINSERT:
					case T_SQLSTATE:
					case T_SQLWARNING:
					case T_STATS:
					case T_STATISTICS:
					case T_STEP:
					case T_STORAGE:
					case T_STORED:
					case T_STRING:
					case T_SUBDIR:
					case T_SUBSTRING:
					case T_SUM:
					case T_SUMMARY:
					case T_SYS_REFCURSOR:
					case T_TABLE:
					case T_TABLESPACE:
					case T_TEMPORARY:
					case T_TERMINATED:
					case T_TEXTIMAGE_ON:
					case T_THEN:
					case T_TIMESTAMP:
					case T_TITLE:
					case T_TO:
					case T_TOP:
					case T_TRANSACTION:
					case T_TRUE:
					case T_TRUNCATE:
					case T_UNIQUE:
					case T_UPDATE:
					case T_UR:
					case T_USE:
					case T_USING:
					case T_VALUE:
					case T_VALUES:
					case T_VAR:
					case T_VARCHAR:
					case T_VARCHAR2:
					case T_VARYING:
					case T_VOLATILE:
					case T_WHILE:
					case T_WITH:
					case T_WITHOUT:
					case T_WORK:
					case T_XACT_ABORT:
					case T_XML:
					case T_YES:
					case T_CORRECT:
					case T_ACTIVITY_COUNT:
					case T_CUME_DIST:
					case T_CURRENT_DATE:
					case T_CURRENT_TIMESTAMP:
					case T_CURRENT_USER:
					case T_DENSE_RANK:
					case T_FIRST_VALUE:
					case T_LAG:
					case T_LAST_VALUE:
					case T_LEAD:
					case T_PART_COUNT:
					case T_PART_LOC:
					case T_RANK:
					case T_ROW_NUMBER:
					case T_STDEV:
					case T_SYSDATE:
					case T_VARIANCE:
					case T_USER:
					case L_ID:
						{
						setState(1080);
						ident();
						}
						break;
					case L_INT:
						{
						setState(1081);
						match(L_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1084);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_CORRECT - 320)) | (1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)) | (1L << (L_ID - 320)) | (1L << (L_INT - 320)))) != 0) );
				setState(1086);
				match(T_CLOSE_P);
				}
				break;
			case T_TABLESPACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1087);
				match(T_TABLESPACE);
				setState(1088);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_db2_itemContext extends ParserRuleContext {
		public TerminalNode T_IN() { return getToken(PlsqlParser.T_IN, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_INDEX() { return getToken(PlsqlParser.T_INDEX, 0); }
		public TerminalNode T_WITH() { return getToken(PlsqlParser.T_WITH, 0); }
		public TerminalNode T_REPLACE() { return getToken(PlsqlParser.T_REPLACE, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(PlsqlParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_BY() { return getToken(PlsqlParser.T_BY, 0); }
		public TerminalNode T_HASH() { return getToken(PlsqlParser.T_HASH, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public TerminalNode T_LOGGED() { return getToken(PlsqlParser.T_LOGGED, 0); }
		public TerminalNode T_NOT() { return getToken(PlsqlParser.T_NOT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(PlsqlParser.T_COMPRESS, 0); }
		public TerminalNode T_YES() { return getToken(PlsqlParser.T_YES, 0); }
		public TerminalNode T_NO() { return getToken(PlsqlParser.T_NO, 0); }
		public TerminalNode T_DEFINITION() { return getToken(PlsqlParser.T_DEFINITION, 0); }
		public TerminalNode T_ONLY() { return getToken(PlsqlParser.T_ONLY, 0); }
		public TerminalNode T_RESTRICT() { return getToken(PlsqlParser.T_RESTRICT, 0); }
		public TerminalNode T_ON() { return getToken(PlsqlParser.T_ON, 0); }
		public TerminalNode T_DROP() { return getToken(PlsqlParser.T_DROP, 0); }
		public Create_table_options_db2_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_db2_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_table_options_db2_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_table_options_db2_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_table_options_db2_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_db2_itemContext create_table_options_db2_item() throws RecognitionException {
		Create_table_options_db2_itemContext _localctx = new Create_table_options_db2_itemContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_create_table_options_db2_item);
		int _la;
		try {
			setState(1124);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1092);
				_la = _input.LA(1);
				if (_la==T_INDEX) {
					{
					setState(1091);
					match(T_INDEX);
					}
				}

				setState(1094);
				match(T_IN);
				setState(1095);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1096);
				match(T_WITH);
				setState(1097);
				match(T_REPLACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1098);
				match(T_DISTRIBUTE);
				setState(1099);
				match(T_BY);
				setState(1100);
				match(T_HASH);
				setState(1101);
				match(T_OPEN_P);
				setState(1102);
				ident();
				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1103);
					match(T_COMMA);
					setState(1104);
					ident();
					}
					}
					setState(1109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1110);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1113);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1112);
					match(T_NOT);
					}
				}

				setState(1115);
				match(T_LOGGED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1116);
				match(T_COMPRESS);
				setState(1117);
				_la = _input.LA(1);
				if ( !(_la==T_NO || _la==T_YES) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1118);
				match(T_DEFINITION);
				setState(1119);
				match(T_ONLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1120);
				match(T_WITH);
				setState(1121);
				match(T_RESTRICT);
				setState(1122);
				match(T_ON);
				setState(1123);
				match(T_DROP);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_td_itemContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(PlsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_INDEX() { return getToken(PlsqlParser.T_INDEX, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_UNIQUE() { return getToken(PlsqlParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public TerminalNode T_WITH() { return getToken(PlsqlParser.T_WITH, 0); }
		public TerminalNode T_DATA() { return getToken(PlsqlParser.T_DATA, 0); }
		public Create_table_options_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_td_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_table_options_td_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_table_options_td_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_table_options_td_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_td_itemContext create_table_options_td_item() throws RecognitionException {
		Create_table_options_td_itemContext _localctx = new Create_table_options_td_itemContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_create_table_options_td_item);
		int _la;
		try {
			setState(1144);
			switch (_input.LA(1)) {
			case T_PRIMARY:
			case T_UNIQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1127);
				_la = _input.LA(1);
				if (_la==T_UNIQUE) {
					{
					setState(1126);
					match(T_UNIQUE);
					}
				}

				setState(1129);
				match(T_PRIMARY);
				setState(1130);
				match(T_INDEX);
				setState(1131);
				match(T_OPEN_P);
				setState(1132);
				ident();
				setState(1137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1133);
					match(T_COMMA);
					setState(1134);
					ident();
					}
					}
					setState(1139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1140);
				match(T_CLOSE_P);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1142);
				match(T_WITH);
				setState(1143);
				match(T_DATA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_hive_itemContext extends ParserRuleContext {
		public Create_table_hive_row_formatContext create_table_hive_row_format() {
			return getRuleContext(Create_table_hive_row_formatContext.class,0);
		}
		public TerminalNode T_STORED() { return getToken(PlsqlParser.T_STORED, 0); }
		public TerminalNode T_AS() { return getToken(PlsqlParser.T_AS, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_options_hive_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_hive_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_table_options_hive_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_table_options_hive_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_table_options_hive_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_hive_itemContext create_table_options_hive_item() throws RecognitionException {
		Create_table_options_hive_itemContext _localctx = new Create_table_options_hive_itemContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_create_table_options_hive_item);
		try {
			setState(1150);
			switch (_input.LA(1)) {
			case T_ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1146);
				create_table_hive_row_format();
				}
				break;
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1147);
				match(T_STORED);
				setState(1148);
				match(T_AS);
				setState(1149);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_hive_row_formatContext extends ParserRuleContext {
		public TerminalNode T_ROW() { return getToken(PlsqlParser.T_ROW, 0); }
		public TerminalNode T_FORMAT() { return getToken(PlsqlParser.T_FORMAT, 0); }
		public TerminalNode T_DELIMITED() { return getToken(PlsqlParser.T_DELIMITED, 0); }
		public List<Create_table_hive_row_format_fieldsContext> create_table_hive_row_format_fields() {
			return getRuleContexts(Create_table_hive_row_format_fieldsContext.class);
		}
		public Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields(int i) {
			return getRuleContext(Create_table_hive_row_format_fieldsContext.class,i);
		}
		public Create_table_hive_row_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_table_hive_row_format(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_table_hive_row_format(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_table_hive_row_format(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_hive_row_formatContext create_table_hive_row_format() throws RecognitionException {
		Create_table_hive_row_formatContext _localctx = new Create_table_hive_row_formatContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_create_table_hive_row_format);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			match(T_ROW);
			setState(1153);
			match(T_FORMAT);
			setState(1154);
			match(T_DELIMITED);
			setState(1158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1155);
					create_table_hive_row_format_fields();
					}
					}
				}
				setState(1160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_hive_row_format_fieldsContext extends ParserRuleContext {
		public TerminalNode T_FIELDS() { return getToken(PlsqlParser.T_FIELDS, 0); }
		public TerminalNode T_TERMINATED() { return getToken(PlsqlParser.T_TERMINATED, 0); }
		public List<TerminalNode> T_BY() { return getTokens(PlsqlParser.T_BY); }
		public TerminalNode T_BY(int i) {
			return getToken(PlsqlParser.T_BY, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_ESCAPED() { return getToken(PlsqlParser.T_ESCAPED, 0); }
		public TerminalNode T_COLLECTION() { return getToken(PlsqlParser.T_COLLECTION, 0); }
		public TerminalNode T_ITEMS() { return getToken(PlsqlParser.T_ITEMS, 0); }
		public TerminalNode T_MAP() { return getToken(PlsqlParser.T_MAP, 0); }
		public TerminalNode T_KEYS() { return getToken(PlsqlParser.T_KEYS, 0); }
		public TerminalNode T_LINES() { return getToken(PlsqlParser.T_LINES, 0); }
		public TerminalNode T_NULL() { return getToken(PlsqlParser.T_NULL, 0); }
		public TerminalNode T_DEFINED() { return getToken(PlsqlParser.T_DEFINED, 0); }
		public TerminalNode T_AS() { return getToken(PlsqlParser.T_AS, 0); }
		public Create_table_hive_row_format_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_table_hive_row_format_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_table_hive_row_format_fields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_table_hive_row_format_fields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields() throws RecognitionException {
		Create_table_hive_row_format_fieldsContext _localctx = new Create_table_hive_row_format_fieldsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_create_table_hive_row_format_fields);
		try {
			setState(1188);
			switch (_input.LA(1)) {
			case T_FIELDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1161);
				match(T_FIELDS);
				setState(1162);
				match(T_TERMINATED);
				setState(1163);
				match(T_BY);
				setState(1164);
				expr(0);
				setState(1168);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(1165);
					match(T_ESCAPED);
					setState(1166);
					match(T_BY);
					setState(1167);
					expr(0);
					}
					break;
				}
				}
				break;
			case T_COLLECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1170);
				match(T_COLLECTION);
				setState(1171);
				match(T_ITEMS);
				setState(1172);
				match(T_TERMINATED);
				setState(1173);
				match(T_BY);
				setState(1174);
				expr(0);
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1175);
				match(T_MAP);
				setState(1176);
				match(T_KEYS);
				setState(1177);
				match(T_TERMINATED);
				setState(1178);
				match(T_BY);
				setState(1179);
				expr(0);
				}
				break;
			case T_LINES:
				enterOuterAlt(_localctx, 4);
				{
				setState(1180);
				match(T_LINES);
				setState(1181);
				match(T_TERMINATED);
				setState(1182);
				match(T_BY);
				setState(1183);
				expr(0);
				}
				break;
			case T_NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1184);
				match(T_NULL);
				setState(1185);
				match(T_DEFINED);
				setState(1186);
				match(T_AS);
				setState(1187);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_mssql_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(PlsqlParser.T_ON, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(PlsqlParser.T_TEXTIMAGE_ON, 0); }
		public Create_table_options_mssql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mssql_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_table_options_mssql_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_table_options_mssql_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_table_options_mssql_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_mssql_itemContext create_table_options_mssql_item() throws RecognitionException {
		Create_table_options_mssql_itemContext _localctx = new Create_table_options_mssql_itemContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_create_table_options_mssql_item);
		try {
			setState(1194);
			switch (_input.LA(1)) {
			case T_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1190);
				match(T_ON);
				setState(1191);
				ident();
				}
				break;
			case T_TEXTIMAGE_ON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1192);
				match(T_TEXTIMAGE_ON);
				setState(1193);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_mysql_itemContext extends ParserRuleContext {
		public TerminalNode T_AUTO_INCREMENT() { return getToken(PlsqlParser.T_AUTO_INCREMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(PlsqlParser.T_EQUAL, 0); }
		public TerminalNode T_COMMENT() { return getToken(PlsqlParser.T_COMMENT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(PlsqlParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(PlsqlParser.T_SET, 0); }
		public TerminalNode T_CHARSET() { return getToken(PlsqlParser.T_CHARSET, 0); }
		public TerminalNode T_DEFAULT() { return getToken(PlsqlParser.T_DEFAULT, 0); }
		public TerminalNode T_ENGINE() { return getToken(PlsqlParser.T_ENGINE, 0); }
		public Create_table_options_mysql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mysql_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_table_options_mysql_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_table_options_mysql_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_table_options_mysql_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_mysql_itemContext create_table_options_mysql_item() throws RecognitionException {
		Create_table_options_mysql_itemContext _localctx = new Create_table_options_mysql_itemContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_create_table_options_mysql_item);
		int _la;
		try {
			setState(1223);
			switch (_input.LA(1)) {
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1196);
				match(T_AUTO_INCREMENT);
				setState(1198);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1197);
					match(T_EQUAL);
					}
				}

				setState(1200);
				expr(0);
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1201);
				match(T_COMMENT);
				setState(1203);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1202);
					match(T_EQUAL);
					}
				}

				setState(1205);
				expr(0);
				}
				break;
			case T_CHARACTER:
			case T_CHARSET:
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1207);
				_la = _input.LA(1);
				if (_la==T_DEFAULT) {
					{
					setState(1206);
					match(T_DEFAULT);
					}
				}

				setState(1212);
				switch (_input.LA(1)) {
				case T_CHARACTER:
					{
					setState(1209);
					match(T_CHARACTER);
					setState(1210);
					match(T_SET);
					}
					break;
				case T_CHARSET:
					{
					setState(1211);
					match(T_CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1215);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1214);
					match(T_EQUAL);
					}
				}

				setState(1217);
				expr(0);
				}
				break;
			case T_ENGINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1218);
				match(T_ENGINE);
				setState(1220);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1219);
					match(T_EQUAL);
					}
				}

				setState(1222);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_ALTER() { return getToken(PlsqlParser.T_ALTER, 0); }
		public TerminalNode T_TABLE() { return getToken(PlsqlParser.T_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Alter_table_itemContext alter_table_item() {
			return getRuleContext(Alter_table_itemContext.class,0);
		}
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1225);
			match(T_ALTER);
			setState(1226);
			match(T_TABLE);
			setState(1227);
			table_name();
			setState(1228);
			alter_table_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_itemContext extends ParserRuleContext {
		public Alter_table_add_constraintContext alter_table_add_constraint() {
			return getRuleContext(Alter_table_add_constraintContext.class,0);
		}
		public Alter_table_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterAlter_table_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitAlter_table_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitAlter_table_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_itemContext alter_table_item() throws RecognitionException {
		Alter_table_itemContext _localctx = new Alter_table_itemContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_alter_table_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
			alter_table_add_constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_add_constraintContext extends ParserRuleContext {
		public TerminalNode T_ADD2() { return getToken(PlsqlParser.T_ADD2, 0); }
		public Alter_table_add_constraint_itemContext alter_table_add_constraint_item() {
			return getRuleContext(Alter_table_add_constraint_itemContext.class,0);
		}
		public TerminalNode T_CONSTRAINT() { return getToken(PlsqlParser.T_CONSTRAINT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Alter_table_add_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterAlter_table_add_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitAlter_table_add_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitAlter_table_add_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_add_constraintContext alter_table_add_constraint() throws RecognitionException {
		Alter_table_add_constraintContext _localctx = new Alter_table_add_constraintContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_alter_table_add_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			match(T_ADD2);
			setState(1235);
			_la = _input.LA(1);
			if (_la==T_CONSTRAINT) {
				{
				setState(1233);
				match(T_CONSTRAINT);
				setState(1234);
				ident();
				}
			}

			setState(1237);
			alter_table_add_constraint_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_add_constraint_itemContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(PlsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(PlsqlParser.T_KEY, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(PlsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(PlsqlParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(PlsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(PlsqlParser.T_CLOSE_P, i);
		}
		public TerminalNode T_CLUSTERED() { return getToken(PlsqlParser.T_CLUSTERED, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public TerminalNode T_ENABLE() { return getToken(PlsqlParser.T_ENABLE, 0); }
		public Index_storage_clauseContext index_storage_clause() {
			return getRuleContext(Index_storage_clauseContext.class,0);
		}
		public List<TerminalNode> T_ASC() { return getTokens(PlsqlParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(PlsqlParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(PlsqlParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(PlsqlParser.T_DESC, i);
		}
		public TerminalNode T_FOREIGN() { return getToken(PlsqlParser.T_FOREIGN, 0); }
		public TerminalNode T_REFERENCES() { return getToken(PlsqlParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public TerminalNode T_DEFAULT() { return getToken(PlsqlParser.T_DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_FOR() { return getToken(PlsqlParser.T_FOR, 0); }
		public Alter_table_add_constraint_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_constraint_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterAlter_table_add_constraint_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitAlter_table_add_constraint_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitAlter_table_add_constraint_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_add_constraint_itemContext alter_table_add_constraint_item() throws RecognitionException {
		Alter_table_add_constraint_itemContext _localctx = new Alter_table_add_constraint_itemContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_alter_table_add_constraint_item);
		int _la;
		try {
			int _alt;
			setState(1301);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1239);
				match(T_PRIMARY);
				setState(1240);
				match(T_KEY);
				setState(1242);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(1241);
					match(T_CLUSTERED);
					}
				}

				setState(1244);
				match(T_OPEN_P);
				setState(1245);
				ident();
				setState(1247);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(1246);
					_la = _input.LA(1);
					if ( !(_la==T_ASC || _la==T_DESC) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(1256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1249);
					match(T_COMMA);
					setState(1250);
					ident();
					setState(1252);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(1251);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
					}

					}
					}
					setState(1258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1259);
				match(T_CLOSE_P);
				setState(1261);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1260);
					match(T_ENABLE);
					}
					break;
				}
				setState(1264);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1263);
					index_storage_clause();
					}
					break;
				}
				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1266);
				match(T_FOREIGN);
				setState(1267);
				match(T_KEY);
				setState(1268);
				match(T_OPEN_P);
				setState(1269);
				ident();
				setState(1274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1270);
					match(T_COMMA);
					setState(1271);
					ident();
					}
					}
					setState(1276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1277);
				match(T_CLOSE_P);
				setState(1278);
				match(T_REFERENCES);
				setState(1279);
				table_name();
				setState(1280);
				match(T_OPEN_P);
				setState(1281);
				ident();
				setState(1286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1282);
					match(T_COMMA);
					setState(1283);
					ident();
					}
					}
					setState(1288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1289);
				match(T_CLOSE_P);
				setState(1293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1290);
						create_table_fk_action();
						}
						}
					}
					setState(1295);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				}
				}
				break;
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1296);
				match(T_DEFAULT);
				setState(1297);
				expr(0);
				setState(1298);
				match(T_FOR);
				setState(1299);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtypeContext extends ParserRuleContext {
		public TerminalNode T_CHAR() { return getToken(PlsqlParser.T_CHAR, 0); }
		public TerminalNode T_BIGINT() { return getToken(PlsqlParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(PlsqlParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(PlsqlParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BINARY_INTEGER() { return getToken(PlsqlParser.T_BINARY_INTEGER, 0); }
		public TerminalNode T_BIT() { return getToken(PlsqlParser.T_BIT, 0); }
		public TerminalNode T_DATE() { return getToken(PlsqlParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(PlsqlParser.T_DATETIME, 0); }
		public TerminalNode T_DEC() { return getToken(PlsqlParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(PlsqlParser.T_DECIMAL, 0); }
		public TerminalNode T_DOUBLE() { return getToken(PlsqlParser.T_DOUBLE, 0); }
		public TerminalNode T_PRECISION() { return getToken(PlsqlParser.T_PRECISION, 0); }
		public TerminalNode T_FLOAT() { return getToken(PlsqlParser.T_FLOAT, 0); }
		public TerminalNode T_INT() { return getToken(PlsqlParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(PlsqlParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(PlsqlParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(PlsqlParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(PlsqlParser.T_INTEGER, 0); }
		public TerminalNode T_NCHAR() { return getToken(PlsqlParser.T_NCHAR, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(PlsqlParser.T_NVARCHAR, 0); }
		public TerminalNode T_NUMBER() { return getToken(PlsqlParser.T_NUMBER, 0); }
		public TerminalNode T_NUMERIC() { return getToken(PlsqlParser.T_NUMERIC, 0); }
		public TerminalNode T_PLS_INTEGER() { return getToken(PlsqlParser.T_PLS_INTEGER, 0); }
		public TerminalNode T_REAL() { return getToken(PlsqlParser.T_REAL, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(PlsqlParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_VARYING() { return getToken(PlsqlParser.T_VARYING, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(PlsqlParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(PlsqlParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_INTEGER() { return getToken(PlsqlParser.T_SIMPLE_INTEGER, 0); }
		public TerminalNode T_SMALLINT() { return getToken(PlsqlParser.T_SMALLINT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(PlsqlParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_STRING() { return getToken(PlsqlParser.T_STRING, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(PlsqlParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(PlsqlParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TINYINT() { return getToken(PlsqlParser.T_TINYINT, 0); }
		public TerminalNode T_VARCHAR() { return getToken(PlsqlParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(PlsqlParser.T_VARCHAR2, 0); }
		public TerminalNode T_XML() { return getToken(PlsqlParser.T_XML, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TYPE() { return getToken(PlsqlParser.T_TYPE, 0); }
		public TerminalNode T_ROWTYPE() { return getToken(PlsqlParser.T_ROWTYPE, 0); }
		public DtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterDtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitDtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitDtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_dtype);
		int _la;
		try {
			setState(1348);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1303);
				match(T_CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1304);
				match(T_BIGINT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1305);
				match(T_BINARY_DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1306);
				match(T_BINARY_FLOAT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1307);
				match(T_BINARY_INTEGER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1308);
				match(T_BIT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1309);
				match(T_DATE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1310);
				match(T_DATETIME);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1311);
				match(T_DEC);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1312);
				match(T_DECIMAL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1313);
				match(T_DOUBLE);
				setState(1315);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1314);
					match(T_PRECISION);
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1317);
				match(T_FLOAT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1318);
				match(T_INT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1319);
				match(T_INT2);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1320);
				match(T_INT4);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1321);
				match(T_INT8);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1322);
				match(T_INTEGER);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1323);
				match(T_NCHAR);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1324);
				match(T_NVARCHAR);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1325);
				match(T_NUMBER);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1326);
				match(T_NUMERIC);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1327);
				match(T_PLS_INTEGER);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1328);
				match(T_REAL);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1329);
				match(T_RESULT_SET_LOCATOR);
				setState(1330);
				match(T_VARYING);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1331);
				match(T_SIMPLE_FLOAT);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1332);
				match(T_SIMPLE_DOUBLE);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1333);
				match(T_SIMPLE_INTEGER);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1334);
				match(T_SMALLINT);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1335);
				match(T_SMALLDATETIME);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1336);
				match(T_STRING);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1337);
				match(T_SYS_REFCURSOR);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1338);
				match(T_TIMESTAMP);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1339);
				match(T_TINYINT);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1340);
				match(T_VARCHAR);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1341);
				match(T_VARCHAR2);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1342);
				match(T_XML);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1343);
				ident();
				setState(1346);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1344);
					match(T__2);
					setState(1345);
					_la = _input.LA(1);
					if ( !(_la==T_ROWTYPE || _la==T_TYPE) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_lenContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> L_INT() { return getTokens(PlsqlParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(PlsqlParser.L_INT, i);
		}
		public TerminalNode T_MAX() { return getToken(PlsqlParser.T_MAX, 0); }
		public TerminalNode T_COMMA() { return getToken(PlsqlParser.T_COMMA, 0); }
		public TerminalNode T_CHAR() { return getToken(PlsqlParser.T_CHAR, 0); }
		public TerminalNode T_BYTE() { return getToken(PlsqlParser.T_BYTE, 0); }
		public Dtype_lenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterDtype_len(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitDtype_len(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitDtype_len(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_lenContext dtype_len() throws RecognitionException {
		Dtype_lenContext _localctx = new Dtype_lenContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_dtype_len);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			match(T_OPEN_P);
			setState(1351);
			_la = _input.LA(1);
			if ( !(_la==T_MAX || _la==L_INT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1353);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(1352);
				_la = _input.LA(1);
				if ( !(_la==T_BYTE || _la==T_CHAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1357);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(1355);
				match(T_COMMA);
				setState(1356);
				match(L_INT);
				}
			}

			setState(1359);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_attrContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(PlsqlParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(PlsqlParser.T_NOT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(PlsqlParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(PlsqlParser.T_SET, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CASESPECIFIC() { return getToken(PlsqlParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CS() { return getToken(PlsqlParser.T_CS, 0); }
		public Dtype_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterDtype_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitDtype_attr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitDtype_attr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_attrContext dtype_attr() throws RecognitionException {
		Dtype_attrContext _localctx = new Dtype_attrContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_dtype_attr);
		int _la;
		try {
			setState(1372);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1362);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1361);
					match(T_NOT);
					}
				}

				setState(1364);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1365);
				match(T_CHARACTER);
				setState(1366);
				match(T_SET);
				setState(1367);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1369);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1368);
					match(T_NOT);
					}
				}

				setState(1371);
				_la = _input.LA(1);
				if ( !(_la==T_CASESPECIFIC || _la==T_CS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_defaultContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(PlsqlParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COLON() { return getToken(PlsqlParser.T_COLON, 0); }
		public TerminalNode T_DEFAULT() { return getToken(PlsqlParser.T_DEFAULT, 0); }
		public TerminalNode T_WITH() { return getToken(PlsqlParser.T_WITH, 0); }
		public Dtype_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterDtype_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitDtype_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitDtype_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_defaultContext dtype_default() throws RecognitionException {
		Dtype_defaultContext _localctx = new Dtype_defaultContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_dtype_default);
		int _la;
		try {
			setState(1386);
			switch (_input.LA(1)) {
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1375);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(1374);
					match(T_COLON);
					}
				}

				setState(1377);
				match(T_EQUAL);
				setState(1378);
				expr(0);
				}
				break;
			case T_DEFAULT:
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1380);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1379);
					match(T_WITH);
					}
				}

				setState(1382);
				match(T_DEFAULT);
				setState(1384);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1383);
					expr(0);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_database_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(PlsqlParser.T_CREATE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_DATABASE() { return getToken(PlsqlParser.T_DATABASE, 0); }
		public TerminalNode T_SCHEMA() { return getToken(PlsqlParser.T_SCHEMA, 0); }
		public TerminalNode T_IF() { return getToken(PlsqlParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(PlsqlParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(PlsqlParser.T_EXISTS, 0); }
		public List<Create_database_optionContext> create_database_option() {
			return getRuleContexts(Create_database_optionContext.class);
		}
		public Create_database_optionContext create_database_option(int i) {
			return getRuleContext(Create_database_optionContext.class,i);
		}
		public Create_database_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_database_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_database_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_database_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_stmtContext create_database_stmt() throws RecognitionException {
		Create_database_stmtContext _localctx = new Create_database_stmtContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_create_database_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			match(T_CREATE);
			setState(1389);
			_la = _input.LA(1);
			if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1393);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1390);
				match(T_IF);
				setState(1391);
				match(T_NOT);
				setState(1392);
				match(T_EXISTS);
				}
				break;
			}
			setState(1395);
			expr(0);
			setState(1399);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1396);
					create_database_option();
					}
					}
				}
				setState(1401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_database_optionContext extends ParserRuleContext {
		public TerminalNode T_COMMENT() { return getToken(PlsqlParser.T_COMMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_LOCATION() { return getToken(PlsqlParser.T_LOCATION, 0); }
		public Create_database_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_database_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_database_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_database_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_optionContext create_database_option() throws RecognitionException {
		Create_database_optionContext _localctx = new Create_database_optionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_create_database_option);
		try {
			setState(1406);
			switch (_input.LA(1)) {
			case T_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1402);
				match(T_COMMENT);
				setState(1403);
				expr(0);
				}
				break;
			case T_LOCATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1404);
				match(T_LOCATION);
				setState(1405);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_function_stmtContext extends ParserRuleContext {
		public TerminalNode T_FUNCTION() { return getToken(PlsqlParser.T_FUNCTION, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_function_returnContext create_function_return() {
			return getRuleContext(Create_function_returnContext.class,0);
		}
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public TerminalNode T_ALTER() { return getToken(PlsqlParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(PlsqlParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(PlsqlParser.T_REPLACE, 0); }
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public Declare_block_inplaceContext declare_block_inplace() {
			return getRuleContext(Declare_block_inplaceContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(PlsqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(PlsqlParser.T_IS, 0); }
		public TerminalNode T_OR() { return getToken(PlsqlParser.T_OR, 0); }
		public Create_function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_function_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_function_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_function_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_function_stmtContext create_function_stmt() throws RecognitionException {
		Create_function_stmtContext _localctx = new Create_function_stmtContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_create_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1415);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1408);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1409);
				match(T_CREATE);
				setState(1412);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1410);
					match(T_OR);
					setState(1411);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1414);
				match(T_REPLACE);
				}
				break;
			case T_FUNCTION:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1417);
			match(T_FUNCTION);
			setState(1418);
			ident();
			setState(1420);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1419);
				create_routine_params();
				}
				break;
			}
			setState(1422);
			create_function_return();
			setState(1424);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1423);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(1427);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1426);
				declare_block_inplace();
				}
				break;
			}
			setState(1429);
			single_block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_function_returnContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_RETURN() { return getToken(PlsqlParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(PlsqlParser.T_RETURNS, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public Create_function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_function_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_function_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_function_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_function_returnContext create_function_return() throws RecognitionException {
		Create_function_returnContext _localctx = new Create_function_returnContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_create_function_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			_la = _input.LA(1);
			if ( !(_la==T_RETURN || _la==T_RETURNS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1432);
			dtype();
			setState(1434);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1433);
				dtype_len();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_package_stmtContext extends ParserRuleContext {
		public TerminalNode T_PACKAGE() { return getToken(PlsqlParser.T_PACKAGE, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Package_specContext package_spec() {
			return getRuleContext(Package_specContext.class,0);
		}
		public TerminalNode T_END() { return getToken(PlsqlParser.T_END, 0); }
		public TerminalNode T_AS() { return getToken(PlsqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(PlsqlParser.T_IS, 0); }
		public TerminalNode T_ALTER() { return getToken(PlsqlParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(PlsqlParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(PlsqlParser.T_REPLACE, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(PlsqlParser.T_SEMICOLON, 0); }
		public TerminalNode T_OR() { return getToken(PlsqlParser.T_OR, 0); }
		public Create_package_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_package_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_package_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_package_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_package_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_package_stmtContext create_package_stmt() throws RecognitionException {
		Create_package_stmtContext _localctx = new Create_package_stmtContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_create_package_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1443);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1436);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1437);
				match(T_CREATE);
				setState(1440);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1438);
					match(T_OR);
					setState(1439);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1442);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1445);
			match(T_PACKAGE);
			setState(1446);
			ident();
			setState(1447);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1448);
			package_spec();
			setState(1449);
			match(T_END);
			setState(1453);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1450);
				ident();
				setState(1451);
				match(T_SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_specContext extends ParserRuleContext {
		public List<Package_spec_itemContext> package_spec_item() {
			return getRuleContexts(Package_spec_itemContext.class);
		}
		public Package_spec_itemContext package_spec_item(int i) {
			return getRuleContext(Package_spec_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(PlsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(PlsqlParser.T_SEMICOLON, i);
		}
		public Package_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterPackage_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitPackage_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitPackage_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_specContext package_spec() throws RecognitionException {
		Package_specContext _localctx = new Package_specContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_package_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1455);
			package_spec_item();
			setState(1456);
			match(T_SEMICOLON);
			setState(1462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_CORRECT - 320)) | (1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)) | (1L << (L_ID - 320)))) != 0)) {
				{
				{
				setState(1457);
				package_spec_item();
				setState(1458);
				match(T_SEMICOLON);
				}
				}
				setState(1464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_spec_itemContext extends ParserRuleContext {
		public Declare_stmt_itemContext declare_stmt_item() {
			return getRuleContext(Declare_stmt_itemContext.class,0);
		}
		public TerminalNode T_FUNCTION() { return getToken(PlsqlParser.T_FUNCTION, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_function_returnContext create_function_return() {
			return getRuleContext(Create_function_returnContext.class,0);
		}
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(PlsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_PROC() { return getToken(PlsqlParser.T_PROC, 0); }
		public Package_spec_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_spec_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterPackage_spec_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitPackage_spec_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitPackage_spec_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_spec_itemContext package_spec_item() throws RecognitionException {
		Package_spec_itemContext _localctx = new Package_spec_itemContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_package_spec_item);
		int _la;
		try {
			setState(1478);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1465);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1466);
				match(T_FUNCTION);
				setState(1467);
				ident();
				setState(1469);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1468);
					create_routine_params();
					}
					break;
				}
				setState(1471);
				create_function_return();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1473);
				_la = _input.LA(1);
				if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1474);
				ident();
				setState(1476);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1475);
					create_routine_params();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_package_body_stmtContext extends ParserRuleContext {
		public TerminalNode T_PACKAGE() { return getToken(PlsqlParser.T_PACKAGE, 0); }
		public TerminalNode T_BODY() { return getToken(PlsqlParser.T_BODY, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Package_bodyContext package_body() {
			return getRuleContext(Package_bodyContext.class,0);
		}
		public TerminalNode T_END() { return getToken(PlsqlParser.T_END, 0); }
		public TerminalNode T_AS() { return getToken(PlsqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(PlsqlParser.T_IS, 0); }
		public TerminalNode T_ALTER() { return getToken(PlsqlParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(PlsqlParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(PlsqlParser.T_REPLACE, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(PlsqlParser.T_SEMICOLON, 0); }
		public TerminalNode T_OR() { return getToken(PlsqlParser.T_OR, 0); }
		public Create_package_body_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_package_body_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_package_body_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_package_body_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_package_body_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_package_body_stmtContext create_package_body_stmt() throws RecognitionException {
		Create_package_body_stmtContext _localctx = new Create_package_body_stmtContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_create_package_body_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1487);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1480);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1481);
				match(T_CREATE);
				setState(1484);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1482);
					match(T_OR);
					setState(1483);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1486);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1489);
			match(T_PACKAGE);
			setState(1490);
			match(T_BODY);
			setState(1491);
			ident();
			setState(1492);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1493);
			package_body();
			setState(1494);
			match(T_END);
			setState(1498);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1495);
				ident();
				setState(1496);
				match(T_SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_bodyContext extends ParserRuleContext {
		public List<Package_body_itemContext> package_body_item() {
			return getRuleContexts(Package_body_itemContext.class);
		}
		public Package_body_itemContext package_body_item(int i) {
			return getRuleContext(Package_body_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(PlsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(PlsqlParser.T_SEMICOLON, i);
		}
		public Package_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterPackage_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitPackage_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitPackage_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_bodyContext package_body() throws RecognitionException {
		Package_bodyContext _localctx = new Package_bodyContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_package_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			package_body_item();
			setState(1501);
			match(T_SEMICOLON);
			setState(1507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_CORRECT - 320)) | (1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)) | (1L << (L_ID - 320)))) != 0)) {
				{
				{
				setState(1502);
				package_body_item();
				setState(1503);
				match(T_SEMICOLON);
				}
				}
				setState(1509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_body_itemContext extends ParserRuleContext {
		public Declare_stmt_itemContext declare_stmt_item() {
			return getRuleContext(Declare_stmt_itemContext.class,0);
		}
		public Create_function_stmtContext create_function_stmt() {
			return getRuleContext(Create_function_stmtContext.class,0);
		}
		public Create_procedure_stmtContext create_procedure_stmt() {
			return getRuleContext(Create_procedure_stmtContext.class,0);
		}
		public Package_body_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterPackage_body_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitPackage_body_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitPackage_body_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_body_itemContext package_body_item() throws RecognitionException {
		Package_body_itemContext _localctx = new Package_body_itemContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_package_body_item);
		try {
			setState(1513);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1510);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1511);
				create_function_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1512);
				create_procedure_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_procedure_stmtContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Proc_blockContext proc_block() {
			return getRuleContext(Proc_blockContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(PlsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_PROC() { return getToken(PlsqlParser.T_PROC, 0); }
		public TerminalNode T_ALTER() { return getToken(PlsqlParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(PlsqlParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(PlsqlParser.T_REPLACE, 0); }
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public Create_routine_optionsContext create_routine_options() {
			return getRuleContext(Create_routine_optionsContext.class,0);
		}
		public Declare_block_inplaceContext declare_block_inplace() {
			return getRuleContext(Declare_block_inplaceContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(PlsqlParser.T_SEMICOLON, 0); }
		public TerminalNode T_AS() { return getToken(PlsqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(PlsqlParser.T_IS, 0); }
		public TerminalNode T_OR() { return getToken(PlsqlParser.T_OR, 0); }
		public Create_procedure_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_procedure_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_procedure_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_procedure_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_procedure_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_procedure_stmtContext create_procedure_stmt() throws RecognitionException {
		Create_procedure_stmtContext _localctx = new Create_procedure_stmtContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_create_procedure_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1522);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1515);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1516);
				match(T_CREATE);
				setState(1519);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1517);
					match(T_OR);
					setState(1518);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1521);
				match(T_REPLACE);
				}
				break;
			case T_PROC:
			case T_PROCEDURE:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1524);
			_la = _input.LA(1);
			if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1525);
			ident();
			setState(1527);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1526);
				create_routine_params();
				}
				break;
			}
			setState(1530);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1529);
				create_routine_options();
				}
				break;
			}
			setState(1533);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1532);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(1536);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1535);
				declare_block_inplace();
				}
				break;
			}
			setState(1539);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1538);
				label();
				}
				break;
			}
			setState(1541);
			proc_block();
			setState(1545);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1542);
				ident();
				setState(1543);
				match(T_SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_paramsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public List<Create_routine_param_itemContext> create_routine_param_item() {
			return getRuleContexts(Create_routine_param_itemContext.class);
		}
		public Create_routine_param_itemContext create_routine_param_item(int i) {
			return getRuleContext(Create_routine_param_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public Create_routine_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_routine_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_routine_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_routine_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_paramsContext create_routine_params() throws RecognitionException {
		Create_routine_paramsContext _localctx = new Create_routine_paramsContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_create_routine_params);
		int _la;
		try {
			int _alt;
			setState(1569);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1547);
				match(T_OPEN_P);
				setState(1548);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1549);
				match(T_OPEN_P);
				setState(1550);
				create_routine_param_item();
				setState(1555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1551);
					match(T_COMMA);
					setState(1552);
					create_routine_param_item();
					}
					}
					setState(1557);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1558);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1560);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("IS") &&
				        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
				        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
				        )) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"IS\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"AS\") &&\r\n        !(_input.LT(1).getText().equalsIgnoreCase(\"DYNAMIC\") && _input.LT(2).getText().equalsIgnoreCase(\"RESULT\"))\r\n        ");
				setState(1561);
				create_routine_param_item();
				setState(1566);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1562);
						match(T_COMMA);
						setState(1563);
						create_routine_param_item();
						}
						}
					}
					setState(1568);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_param_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_IN() { return getToken(PlsqlParser.T_IN, 0); }
		public TerminalNode T_OUT() { return getToken(PlsqlParser.T_OUT, 0); }
		public TerminalNode T_INOUT() { return getToken(PlsqlParser.T_INOUT, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public Create_routine_param_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_param_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_routine_param_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_routine_param_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_routine_param_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_param_itemContext create_routine_param_item() throws RecognitionException {
		Create_routine_param_itemContext _localctx = new Create_routine_param_itemContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_create_routine_param_item);
		try {
			int _alt;
			setState(1613);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1576);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1571);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1572);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1573);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1574);
					match(T_IN);
					setState(1575);
					match(T_OUT);
					}
					break;
				}
				setState(1578);
				ident();
				setState(1579);
				dtype();
				setState(1581);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1580);
					dtype_len();
					}
					break;
				}
				setState(1586);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1583);
						dtype_attr();
						}
						}
					}
					setState(1588);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				}
				setState(1590);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1589);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1592);
				ident();
				setState(1598);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1593);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1594);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1595);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1596);
					match(T_IN);
					setState(1597);
					match(T_OUT);
					}
					break;
				}
				setState(1600);
				dtype();
				setState(1602);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1601);
					dtype_len();
					}
					break;
				}
				setState(1607);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1604);
						dtype_attr();
						}
						}
					}
					setState(1609);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				}
				setState(1611);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1610);
					dtype_default();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_optionsContext extends ParserRuleContext {
		public List<Create_routine_optionContext> create_routine_option() {
			return getRuleContexts(Create_routine_optionContext.class);
		}
		public Create_routine_optionContext create_routine_option(int i) {
			return getRuleContext(Create_routine_optionContext.class,i);
		}
		public Create_routine_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_routine_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_routine_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_routine_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_optionsContext create_routine_options() throws RecognitionException {
		Create_routine_optionsContext _localctx = new Create_routine_optionsContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_create_routine_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1616);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1615);
					create_routine_option();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1618);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_optionContext extends ParserRuleContext {
		public TerminalNode T_LANGUAGE() { return getToken(PlsqlParser.T_LANGUAGE, 0); }
		public TerminalNode T_SQL() { return getToken(PlsqlParser.T_SQL, 0); }
		public TerminalNode T_SECURITY() { return getToken(PlsqlParser.T_SECURITY, 0); }
		public TerminalNode T_CREATOR() { return getToken(PlsqlParser.T_CREATOR, 0); }
		public TerminalNode T_DEFINER() { return getToken(PlsqlParser.T_DEFINER, 0); }
		public TerminalNode T_INVOKER() { return getToken(PlsqlParser.T_INVOKER, 0); }
		public TerminalNode T_OWNER() { return getToken(PlsqlParser.T_OWNER, 0); }
		public TerminalNode T_RESULT() { return getToken(PlsqlParser.T_RESULT, 0); }
		public TerminalNode T_SETS() { return getToken(PlsqlParser.T_SETS, 0); }
		public TerminalNode L_INT() { return getToken(PlsqlParser.L_INT, 0); }
		public TerminalNode T_DYNAMIC() { return getToken(PlsqlParser.T_DYNAMIC, 0); }
		public Create_routine_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_routine_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_routine_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_routine_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_optionContext create_routine_option() throws RecognitionException {
		Create_routine_optionContext _localctx = new Create_routine_optionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_create_routine_option);
		int _la;
		try {
			setState(1631);
			switch (_input.LA(1)) {
			case T_LANGUAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1620);
				match(T_LANGUAGE);
				setState(1621);
				match(T_SQL);
				}
				break;
			case T_SQL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1622);
				match(T_SQL);
				setState(1623);
				match(T_SECURITY);
				setState(1624);
				_la = _input.LA(1);
				if ( !(_la==T_CREATOR || _la==T_DEFINER || _la==T_INVOKER || _la==T_OWNER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case T_DYNAMIC:
			case T_RESULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1626);
				_la = _input.LA(1);
				if (_la==T_DYNAMIC) {
					{
					setState(1625);
					match(T_DYNAMIC);
					}
				}

				setState(1628);
				match(T_RESULT);
				setState(1629);
				match(T_SETS);
				setState(1630);
				match(L_INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_stmtContext extends ParserRuleContext {
		public TerminalNode T_DROP() { return getToken(PlsqlParser.T_DROP, 0); }
		public TerminalNode T_TABLE() { return getToken(PlsqlParser.T_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_IF() { return getToken(PlsqlParser.T_IF, 0); }
		public TerminalNode T_EXISTS() { return getToken(PlsqlParser.T_EXISTS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_DATABASE() { return getToken(PlsqlParser.T_DATABASE, 0); }
		public TerminalNode T_SCHEMA() { return getToken(PlsqlParser.T_SCHEMA, 0); }
		public Drop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterDrop_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitDrop_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitDrop_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_stmtContext drop_stmt() throws RecognitionException {
		Drop_stmtContext _localctx = new Drop_stmtContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_drop_stmt);
		int _la;
		try {
			setState(1647);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1633);
				match(T_DROP);
				setState(1634);
				match(T_TABLE);
				setState(1637);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1635);
					match(T_IF);
					setState(1636);
					match(T_EXISTS);
					}
					break;
				}
				setState(1639);
				table_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1640);
				match(T_DROP);
				setState(1641);
				_la = _input.LA(1);
				if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1644);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1642);
					match(T_IF);
					setState(1643);
					match(T_EXISTS);
					}
					break;
				}
				setState(1646);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class End_transaction_stmtContext extends ParserRuleContext {
		public TerminalNode T_END() { return getToken(PlsqlParser.T_END, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(PlsqlParser.T_TRANSACTION, 0); }
		public End_transaction_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_transaction_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterEnd_transaction_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitEnd_transaction_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitEnd_transaction_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_transaction_stmtContext end_transaction_stmt() throws RecognitionException {
		End_transaction_stmtContext _localctx = new End_transaction_stmtContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_end_transaction_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1649);
			match(T_END);
			setState(1650);
			match(T_TRANSACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exec_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_EXEC() { return getToken(PlsqlParser.T_EXEC, 0); }
		public TerminalNode T_EXECUTE() { return getToken(PlsqlParser.T_EXECUTE, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(PlsqlParser.T_IMMEDIATE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_INTO() { return getToken(PlsqlParser.T_INTO, 0); }
		public List<TerminalNode> L_ID() { return getTokens(PlsqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(PlsqlParser.L_ID, i);
		}
		public Using_clauseContext using_clause() {
			return getRuleContext(Using_clauseContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public Exec_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exec_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterExec_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitExec_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitExec_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exec_stmtContext exec_stmt() throws RecognitionException {
		Exec_stmtContext _localctx = new Exec_stmtContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_exec_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1652);
			_la = _input.LA(1);
			if ( !(_la==T_EXEC || _la==T_EXECUTE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1654);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1653);
				match(T_IMMEDIATE);
				}
				break;
			}
			setState(1656);
			expr(0);
			setState(1662);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1657);
				match(T_OPEN_P);
				setState(1658);
				expr_func_params();
				setState(1659);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1661);
				expr_func_params();
				}
				break;
			}
			setState(1673);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1664);
				match(T_INTO);
				setState(1665);
				match(L_ID);
				setState(1670);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1666);
						match(T_COMMA);
						setState(1667);
						match(L_ID);
						}
						}
					}
					setState(1672);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				}
				}
				break;
			}
			setState(1676);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1675);
				using_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public If_plsql_stmtContext if_plsql_stmt() {
			return getRuleContext(If_plsql_stmtContext.class,0);
		}
		public If_tsql_stmtContext if_tsql_stmt() {
			return getRuleContext(If_tsql_stmtContext.class,0);
		}
		public If_bteq_stmtContext if_bteq_stmt() {
			return getRuleContext(If_bteq_stmtContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_if_stmt);
		try {
			setState(1681);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1678);
				if_plsql_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1679);
				if_tsql_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1680);
				if_bteq_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_plsql_stmtContext extends ParserRuleContext {
		public List<TerminalNode> T_IF() { return getTokens(PlsqlParser.T_IF); }
		public TerminalNode T_IF(int i) {
			return getToken(PlsqlParser.T_IF, i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(PlsqlParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(PlsqlParser.T_END, 0); }
		public List<Elseif_blockContext> elseif_block() {
			return getRuleContexts(Elseif_blockContext.class);
		}
		public Elseif_blockContext elseif_block(int i) {
			return getRuleContext(Elseif_blockContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_plsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_plsql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterIf_plsql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitIf_plsql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitIf_plsql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_plsql_stmtContext if_plsql_stmt() throws RecognitionException {
		If_plsql_stmtContext _localctx = new If_plsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_if_plsql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1683);
			match(T_IF);
			setState(1684);
			bool_expr(0);
			setState(1685);
			match(T_THEN);
			setState(1686);
			block();
			setState(1690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ELSEIF || _la==T_ELSIF) {
				{
				{
				setState(1687);
				elseif_block();
				}
				}
				setState(1692);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1694);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(1693);
				else_block();
				}
			}

			setState(1696);
			match(T_END);
			setState(1697);
			match(T_IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_tsql_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(PlsqlParser.T_IF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public List<Single_block_stmtContext> single_block_stmt() {
			return getRuleContexts(Single_block_stmtContext.class);
		}
		public Single_block_stmtContext single_block_stmt(int i) {
			return getRuleContext(Single_block_stmtContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(PlsqlParser.T_ELSE, 0); }
		public If_tsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_tsql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterIf_tsql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitIf_tsql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitIf_tsql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_tsql_stmtContext if_tsql_stmt() throws RecognitionException {
		If_tsql_stmtContext _localctx = new If_tsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_if_tsql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1699);
			match(T_IF);
			setState(1700);
			bool_expr(0);
			setState(1701);
			single_block_stmt();
			setState(1704);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1702);
				match(T_ELSE);
				setState(1703);
				single_block_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_bteq_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(PlsqlParser.T_IF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(PlsqlParser.T_THEN, 0); }
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public If_bteq_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_bteq_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterIf_bteq_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitIf_bteq_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitIf_bteq_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_bteq_stmtContext if_bteq_stmt() throws RecognitionException {
		If_bteq_stmtContext _localctx = new If_bteq_stmtContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_if_bteq_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			match(T__3);
			setState(1707);
			match(T_IF);
			setState(1708);
			bool_expr(0);
			setState(1709);
			match(T_THEN);
			setState(1710);
			single_block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elseif_blockContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(PlsqlParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_ELSIF() { return getToken(PlsqlParser.T_ELSIF, 0); }
		public TerminalNode T_ELSEIF() { return getToken(PlsqlParser.T_ELSEIF, 0); }
		public Elseif_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterElseif_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitElseif_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitElseif_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elseif_blockContext elseif_block() throws RecognitionException {
		Elseif_blockContext _localctx = new Elseif_blockContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_elseif_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
			_la = _input.LA(1);
			if ( !(_la==T_ELSEIF || _la==T_ELSIF) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1713);
			bool_expr(0);
			setState(1714);
			match(T_THEN);
			setState(1715);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(PlsqlParser.T_ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitElse_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1717);
			match(T_ELSE);
			setState(1718);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Include_stmtContext extends ParserRuleContext {
		public TerminalNode T_INCLUDE() { return getToken(PlsqlParser.T_INCLUDE, 0); }
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Include_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterInclude_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitInclude_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitInclude_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Include_stmtContext include_stmt() throws RecognitionException {
		Include_stmtContext _localctx = new Include_stmtContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_include_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1720);
			match(T_INCLUDE);
			setState(1723);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1721);
				file_name();
				}
				break;
			case 2:
				{
				setState(1722);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode T_INSERT() { return getToken(PlsqlParser.T_INSERT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OVERWRITE() { return getToken(PlsqlParser.T_OVERWRITE, 0); }
		public TerminalNode T_TABLE() { return getToken(PlsqlParser.T_TABLE, 0); }
		public TerminalNode T_INTO() { return getToken(PlsqlParser.T_INTO, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Insert_stmt_rowsContext insert_stmt_rows() {
			return getRuleContext(Insert_stmt_rowsContext.class,0);
		}
		public Insert_stmt_colsContext insert_stmt_cols() {
			return getRuleContext(Insert_stmt_colsContext.class,0);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_insert_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1725);
			match(T_INSERT);
			setState(1732);
			switch (_input.LA(1)) {
			case T_OVERWRITE:
				{
				setState(1726);
				match(T_OVERWRITE);
				setState(1727);
				match(T_TABLE);
				}
				break;
			case T_INTO:
				{
				setState(1728);
				match(T_INTO);
				setState(1730);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1729);
					match(T_TABLE);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1734);
			table_name();
			setState(1736);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1735);
				insert_stmt_cols();
				}
				break;
			}
			setState(1740);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
			case T_WITH:
			case T_OPEN_P:
				{
				setState(1738);
				select_stmt();
				}
				break;
			case T_VALUES:
				{
				setState(1739);
				insert_stmt_rows();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmt_colsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public Insert_stmt_colsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt_cols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterInsert_stmt_cols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitInsert_stmt_cols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitInsert_stmt_cols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmt_colsContext insert_stmt_cols() throws RecognitionException {
		Insert_stmt_colsContext _localctx = new Insert_stmt_colsContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_insert_stmt_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1742);
			match(T_OPEN_P);
			setState(1743);
			ident();
			setState(1748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1744);
				match(T_COMMA);
				setState(1745);
				ident();
				}
				}
				setState(1750);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1751);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmt_rowsContext extends ParserRuleContext {
		public TerminalNode T_VALUES() { return getToken(PlsqlParser.T_VALUES, 0); }
		public List<Insert_stmt_rowContext> insert_stmt_row() {
			return getRuleContexts(Insert_stmt_rowContext.class);
		}
		public Insert_stmt_rowContext insert_stmt_row(int i) {
			return getRuleContext(Insert_stmt_rowContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public Insert_stmt_rowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt_rows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterInsert_stmt_rows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitInsert_stmt_rows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitInsert_stmt_rows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmt_rowsContext insert_stmt_rows() throws RecognitionException {
		Insert_stmt_rowsContext _localctx = new Insert_stmt_rowsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_insert_stmt_rows);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1753);
			match(T_VALUES);
			setState(1754);
			insert_stmt_row();
			setState(1759);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1755);
					match(T_COMMA);
					setState(1756);
					insert_stmt_row();
					}
					}
				}
				setState(1761);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmt_rowContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public Insert_stmt_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterInsert_stmt_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitInsert_stmt_row(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitInsert_stmt_row(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmt_rowContext insert_stmt_row() throws RecognitionException {
		Insert_stmt_rowContext _localctx = new Insert_stmt_rowContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_insert_stmt_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1762);
			match(T_OPEN_P);
			setState(1763);
			expr(0);
			setState(1768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1764);
				match(T_COMMA);
				setState(1765);
				expr(0);
				}
				}
				setState(1770);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1771);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_directory_stmtContext extends ParserRuleContext {
		public TerminalNode T_INSERT() { return getToken(PlsqlParser.T_INSERT, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(PlsqlParser.T_OVERWRITE, 0); }
		public TerminalNode T_DIRECTORY() { return getToken(PlsqlParser.T_DIRECTORY, 0); }
		public Expr_fileContext expr_file() {
			return getRuleContext(Expr_fileContext.class,0);
		}
		public Expr_selectContext expr_select() {
			return getRuleContext(Expr_selectContext.class,0);
		}
		public TerminalNode T_LOCAL() { return getToken(PlsqlParser.T_LOCAL, 0); }
		public Insert_directory_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_directory_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterInsert_directory_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitInsert_directory_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitInsert_directory_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_directory_stmtContext insert_directory_stmt() throws RecognitionException {
		Insert_directory_stmtContext _localctx = new Insert_directory_stmtContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_insert_directory_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1773);
			match(T_INSERT);
			setState(1774);
			match(T_OVERWRITE);
			setState(1776);
			_la = _input.LA(1);
			if (_la==T_LOCAL) {
				{
				setState(1775);
				match(T_LOCAL);
				}
			}

			setState(1778);
			match(T_DIRECTORY);
			setState(1779);
			expr_file();
			setState(1780);
			expr_select();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Correct_stmtContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(PlsqlParser.T_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Correct_update_assignmentContext correct_update_assignment() {
			return getRuleContext(Correct_update_assignmentContext.class,0);
		}
		public Correct_stmt_colsContext correct_stmt_cols() {
			return getRuleContext(Correct_stmt_colsContext.class,0);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Correct_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_correct_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCorrect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCorrect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCorrect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Correct_stmtContext correct_stmt() throws RecognitionException {
		Correct_stmtContext _localctx = new Correct_stmtContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_correct_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1782);
			match(T_ON);
			setState(1783);
			table_name();
			setState(1785);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1784);
				correct_stmt_cols();
				}
				break;
			}
			setState(1788);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1787);
				from_alias_clause();
				}
				break;
			}
			setState(1791);
			_la = _input.LA(1);
			if (_la==T_WHERE) {
				{
				setState(1790);
				where_clause();
				}
			}

			setState(1793);
			correct_update_assignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Correct_stmt_colsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public Correct_stmt_colsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_correct_stmt_cols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCorrect_stmt_cols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCorrect_stmt_cols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCorrect_stmt_cols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Correct_stmt_colsContext correct_stmt_cols() throws RecognitionException {
		Correct_stmt_colsContext _localctx = new Correct_stmt_colsContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_correct_stmt_cols);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1795);
			match(T_OPEN_P);
			setState(1796);
			select_list();
			setState(1797);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Correct_update_assignmentContext extends ParserRuleContext {
		public TerminalNode T_CORRECT() { return getToken(PlsqlParser.T_CORRECT, 0); }
		public Update_assignmentContext update_assignment() {
			return getRuleContext(Update_assignmentContext.class,0);
		}
		public Correct_update_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_correct_update_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCorrect_update_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCorrect_update_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCorrect_update_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Correct_update_assignmentContext correct_update_assignment() throws RecognitionException {
		Correct_update_assignmentContext _localctx = new Correct_update_assignmentContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_correct_update_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1799);
			match(T_CORRECT);
			setState(1800);
			update_assignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exit_stmtContext extends ParserRuleContext {
		public TerminalNode T_EXIT() { return getToken(PlsqlParser.T_EXIT, 0); }
		public TerminalNode L_ID() { return getToken(PlsqlParser.L_ID, 0); }
		public TerminalNode T_WHEN() { return getToken(PlsqlParser.T_WHEN, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Exit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterExit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitExit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitExit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exit_stmtContext exit_stmt() throws RecognitionException {
		Exit_stmtContext _localctx = new Exit_stmtContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_exit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1802);
			match(T_EXIT);
			setState(1804);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1803);
				match(L_ID);
				}
				break;
			}
			setState(1808);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1806);
				match(T_WHEN);
				setState(1807);
				bool_expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_diag_stmtContext extends ParserRuleContext {
		public TerminalNode T_GET() { return getToken(PlsqlParser.T_GET, 0); }
		public TerminalNode T_DIAGNOSTICS() { return getToken(PlsqlParser.T_DIAGNOSTICS, 0); }
		public Get_diag_stmt_itemContext get_diag_stmt_item() {
			return getRuleContext(Get_diag_stmt_itemContext.class,0);
		}
		public Get_diag_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_diag_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterGet_diag_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitGet_diag_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitGet_diag_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_diag_stmtContext get_diag_stmt() throws RecognitionException {
		Get_diag_stmtContext _localctx = new Get_diag_stmtContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_get_diag_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810);
			match(T_GET);
			setState(1811);
			match(T_DIAGNOSTICS);
			setState(1812);
			get_diag_stmt_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_diag_stmt_itemContext extends ParserRuleContext {
		public Get_diag_stmt_exception_itemContext get_diag_stmt_exception_item() {
			return getRuleContext(Get_diag_stmt_exception_itemContext.class,0);
		}
		public Get_diag_stmt_rowcount_itemContext get_diag_stmt_rowcount_item() {
			return getRuleContext(Get_diag_stmt_rowcount_itemContext.class,0);
		}
		public Get_diag_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_diag_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterGet_diag_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitGet_diag_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitGet_diag_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_diag_stmt_itemContext get_diag_stmt_item() throws RecognitionException {
		Get_diag_stmt_itemContext _localctx = new Get_diag_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_get_diag_stmt_item);
		try {
			setState(1816);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1814);
				get_diag_stmt_exception_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1815);
				get_diag_stmt_rowcount_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_diag_stmt_exception_itemContext extends ParserRuleContext {
		public TerminalNode T_EXCEPTION() { return getToken(PlsqlParser.T_EXCEPTION, 0); }
		public TerminalNode L_INT() { return getToken(PlsqlParser.L_INT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(PlsqlParser.T_EQUAL, 0); }
		public TerminalNode T_MESSAGE_TEXT() { return getToken(PlsqlParser.T_MESSAGE_TEXT, 0); }
		public Get_diag_stmt_exception_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_diag_stmt_exception_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterGet_diag_stmt_exception_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitGet_diag_stmt_exception_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitGet_diag_stmt_exception_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_diag_stmt_exception_itemContext get_diag_stmt_exception_item() throws RecognitionException {
		Get_diag_stmt_exception_itemContext _localctx = new Get_diag_stmt_exception_itemContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_get_diag_stmt_exception_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1818);
			match(T_EXCEPTION);
			setState(1819);
			match(L_INT);
			setState(1820);
			ident();
			setState(1821);
			match(T_EQUAL);
			setState(1822);
			match(T_MESSAGE_TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_diag_stmt_rowcount_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(PlsqlParser.T_EQUAL, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(PlsqlParser.T_ROW_COUNT, 0); }
		public Get_diag_stmt_rowcount_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_diag_stmt_rowcount_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterGet_diag_stmt_rowcount_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitGet_diag_stmt_rowcount_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitGet_diag_stmt_rowcount_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_diag_stmt_rowcount_itemContext get_diag_stmt_rowcount_item() throws RecognitionException {
		Get_diag_stmt_rowcount_itemContext _localctx = new Get_diag_stmt_rowcount_itemContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_get_diag_stmt_rowcount_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1824);
			ident();
			setState(1825);
			match(T_EQUAL);
			setState(1826);
			match(T_ROW_COUNT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grant_stmtContext extends ParserRuleContext {
		public TerminalNode T_GRANT() { return getToken(PlsqlParser.T_GRANT, 0); }
		public List<Grant_stmt_itemContext> grant_stmt_item() {
			return getRuleContexts(Grant_stmt_itemContext.class);
		}
		public Grant_stmt_itemContext grant_stmt_item(int i) {
			return getRuleContext(Grant_stmt_itemContext.class,i);
		}
		public TerminalNode T_TO() { return getToken(PlsqlParser.T_TO, 0); }
		public TerminalNode T_ROLE() { return getToken(PlsqlParser.T_ROLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public Grant_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterGrant_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitGrant_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitGrant_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grant_stmtContext grant_stmt() throws RecognitionException {
		Grant_stmtContext _localctx = new Grant_stmtContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_grant_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			match(T_GRANT);
			setState(1829);
			grant_stmt_item();
			setState(1834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1830);
				match(T_COMMA);
				setState(1831);
				grant_stmt_item();
				}
				}
				setState(1836);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1837);
			match(T_TO);
			setState(1838);
			match(T_ROLE);
			setState(1839);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grant_stmt_itemContext extends ParserRuleContext {
		public TerminalNode T_EXECUTE() { return getToken(PlsqlParser.T_EXECUTE, 0); }
		public TerminalNode T_ON() { return getToken(PlsqlParser.T_ON, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(PlsqlParser.T_PROCEDURE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Grant_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterGrant_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitGrant_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitGrant_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grant_stmt_itemContext grant_stmt_item() throws RecognitionException {
		Grant_stmt_itemContext _localctx = new Grant_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_grant_stmt_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1841);
			match(T_EXECUTE);
			setState(1842);
			match(T_ON);
			setState(1843);
			match(T_PROCEDURE);
			setState(1844);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Leave_stmtContext extends ParserRuleContext {
		public TerminalNode T_LEAVE() { return getToken(PlsqlParser.T_LEAVE, 0); }
		public TerminalNode L_ID() { return getToken(PlsqlParser.L_ID, 0); }
		public Leave_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leave_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterLeave_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitLeave_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitLeave_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Leave_stmtContext leave_stmt() throws RecognitionException {
		Leave_stmtContext _localctx = new Leave_stmtContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_leave_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1846);
			match(T_LEAVE);
			setState(1848);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1847);
				match(L_ID);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Map_object_stmtContext extends ParserRuleContext {
		public TerminalNode T_MAP() { return getToken(PlsqlParser.T_MAP, 0); }
		public TerminalNode T_OBJECT() { return getToken(PlsqlParser.T_OBJECT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_TO() { return getToken(PlsqlParser.T_TO, 0); }
		public TerminalNode T_AT() { return getToken(PlsqlParser.T_AT, 0); }
		public Map_object_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_object_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterMap_object_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitMap_object_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitMap_object_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Map_object_stmtContext map_object_stmt() throws RecognitionException {
		Map_object_stmtContext _localctx = new Map_object_stmtContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_map_object_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1850);
			match(T_MAP);
			setState(1851);
			match(T_OBJECT);
			setState(1852);
			expr(0);
			setState(1855);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1853);
				match(T_TO);
				setState(1854);
				expr(0);
				}
				break;
			}
			setState(1859);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1857);
				match(T_AT);
				setState(1858);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Open_stmtContext extends ParserRuleContext {
		public TerminalNode T_OPEN() { return getToken(PlsqlParser.T_OPEN, 0); }
		public TerminalNode L_ID() { return getToken(PlsqlParser.L_ID, 0); }
		public TerminalNode T_FOR() { return getToken(PlsqlParser.T_FOR, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Open_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterOpen_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitOpen_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitOpen_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_stmtContext open_stmt() throws RecognitionException {
		Open_stmtContext _localctx = new Open_stmtContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_open_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1861);
			match(T_OPEN);
			setState(1862);
			match(L_ID);
			setState(1868);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1863);
				match(T_FOR);
				setState(1866);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1864);
					select_stmt();
					}
					break;
				case 2:
					{
					setState(1865);
					expr(0);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fetch_stmtContext extends ParserRuleContext {
		public TerminalNode T_FETCH() { return getToken(PlsqlParser.T_FETCH, 0); }
		public List<TerminalNode> L_ID() { return getTokens(PlsqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(PlsqlParser.L_ID, i);
		}
		public TerminalNode T_INTO() { return getToken(PlsqlParser.T_INTO, 0); }
		public TerminalNode T_FROM() { return getToken(PlsqlParser.T_FROM, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public Fetch_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterFetch_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitFetch_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitFetch_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fetch_stmtContext fetch_stmt() throws RecognitionException {
		Fetch_stmtContext _localctx = new Fetch_stmtContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_fetch_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1870);
			match(T_FETCH);
			setState(1872);
			_la = _input.LA(1);
			if (_la==T_FROM) {
				{
				setState(1871);
				match(T_FROM);
				}
			}

			setState(1874);
			match(L_ID);
			setState(1875);
			match(T_INTO);
			setState(1876);
			match(L_ID);
			setState(1881);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1877);
					match(T_COMMA);
					setState(1878);
					match(L_ID);
					}
					}
				}
				setState(1883);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collect_stats_stmtContext extends ParserRuleContext {
		public TerminalNode T_COLLECT() { return getToken(PlsqlParser.T_COLLECT, 0); }
		public TerminalNode T_ON() { return getToken(PlsqlParser.T_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_STATISTICS() { return getToken(PlsqlParser.T_STATISTICS, 0); }
		public TerminalNode T_STATS() { return getToken(PlsqlParser.T_STATS, 0); }
		public Collect_stats_clauseContext collect_stats_clause() {
			return getRuleContext(Collect_stats_clauseContext.class,0);
		}
		public Collect_stats_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collect_stats_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCollect_stats_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCollect_stats_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCollect_stats_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collect_stats_stmtContext collect_stats_stmt() throws RecognitionException {
		Collect_stats_stmtContext _localctx = new Collect_stats_stmtContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_collect_stats_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1884);
			match(T_COLLECT);
			setState(1885);
			_la = _input.LA(1);
			if ( !(_la==T_STATS || _la==T_STATISTICS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1886);
			match(T_ON);
			setState(1887);
			table_name();
			setState(1889);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1888);
				collect_stats_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collect_stats_clauseContext extends ParserRuleContext {
		public TerminalNode T_COLUMN() { return getToken(PlsqlParser.T_COLUMN, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public Collect_stats_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collect_stats_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCollect_stats_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCollect_stats_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCollect_stats_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collect_stats_clauseContext collect_stats_clause() throws RecognitionException {
		Collect_stats_clauseContext _localctx = new Collect_stats_clauseContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_collect_stats_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1891);
			match(T_COLUMN);
			setState(1892);
			match(T_OPEN_P);
			setState(1893);
			ident();
			setState(1898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1894);
				match(T_COMMA);
				setState(1895);
				ident();
				}
				}
				setState(1900);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1901);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Close_stmtContext extends ParserRuleContext {
		public TerminalNode T_CLOSE() { return getToken(PlsqlParser.T_CLOSE, 0); }
		public TerminalNode L_ID() { return getToken(PlsqlParser.L_ID, 0); }
		public Close_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterClose_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitClose_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitClose_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Close_stmtContext close_stmt() throws RecognitionException {
		Close_stmtContext _localctx = new Close_stmtContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_close_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1903);
			match(T_CLOSE);
			setState(1904);
			match(L_ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmp_stmtContext extends ParserRuleContext {
		public TerminalNode T_CMP() { return getToken(PlsqlParser.T_CMP, 0); }
		public List<Cmp_sourceContext> cmp_source() {
			return getRuleContexts(Cmp_sourceContext.class);
		}
		public Cmp_sourceContext cmp_source(int i) {
			return getRuleContext(Cmp_sourceContext.class,i);
		}
		public TerminalNode T_COMMA() { return getToken(PlsqlParser.T_COMMA, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(PlsqlParser.T_ROW_COUNT, 0); }
		public TerminalNode T_SUM() { return getToken(PlsqlParser.T_SUM, 0); }
		public Cmp_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCmp_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCmp_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCmp_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmp_stmtContext cmp_stmt() throws RecognitionException {
		Cmp_stmtContext _localctx = new Cmp_stmtContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_cmp_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1906);
			match(T_CMP);
			setState(1907);
			_la = _input.LA(1);
			if ( !(_la==T_ROW_COUNT || _la==T_SUM) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1908);
			cmp_source();
			setState(1909);
			match(T_COMMA);
			setState(1910);
			cmp_source();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmp_sourceContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_AT() { return getToken(PlsqlParser.T_AT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Cmp_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCmp_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCmp_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCmp_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmp_sourceContext cmp_source() throws RecognitionException {
		Cmp_sourceContext _localctx = new Cmp_sourceContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_cmp_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1920);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_CORRECT:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case L_ID:
				{
				setState(1912);
				table_name();
				setState(1914);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1913);
					where_clause();
					}
					break;
				}
				}
				break;
			case T_OPEN_P:
				{
				setState(1916);
				match(T_OPEN_P);
				setState(1917);
				select_stmt();
				setState(1918);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1924);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1922);
				match(T_AT);
				setState(1923);
				ident();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_from_local_stmtContext extends ParserRuleContext {
		public TerminalNode T_COPY() { return getToken(PlsqlParser.T_COPY, 0); }
		public TerminalNode T_FROM() { return getToken(PlsqlParser.T_FROM, 0); }
		public TerminalNode T_LOCAL() { return getToken(PlsqlParser.T_LOCAL, 0); }
		public List<Copy_sourceContext> copy_source() {
			return getRuleContexts(Copy_sourceContext.class);
		}
		public Copy_sourceContext copy_source(int i) {
			return getRuleContext(Copy_sourceContext.class,i);
		}
		public TerminalNode T_TO() { return getToken(PlsqlParser.T_TO, 0); }
		public Copy_targetContext copy_target() {
			return getRuleContext(Copy_targetContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public List<Copy_file_optionContext> copy_file_option() {
			return getRuleContexts(Copy_file_optionContext.class);
		}
		public Copy_file_optionContext copy_file_option(int i) {
			return getRuleContext(Copy_file_optionContext.class,i);
		}
		public Copy_from_local_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_from_local_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCopy_from_local_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCopy_from_local_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCopy_from_local_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_from_local_stmtContext copy_from_local_stmt() throws RecognitionException {
		Copy_from_local_stmtContext _localctx = new Copy_from_local_stmtContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_copy_from_local_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1926);
			match(T_COPY);
			setState(1927);
			match(T_FROM);
			setState(1928);
			match(T_LOCAL);
			setState(1929);
			copy_source();
			setState(1934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1930);
				match(T_COMMA);
				setState(1931);
				copy_source();
				}
				}
				setState(1936);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1937);
			match(T_TO);
			setState(1938);
			copy_target();
			setState(1942);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1939);
					copy_file_option();
					}
					}
				}
				setState(1944);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_stmtContext extends ParserRuleContext {
		public TerminalNode T_COPY() { return getToken(PlsqlParser.T_COPY, 0); }
		public TerminalNode T_TO() { return getToken(PlsqlParser.T_TO, 0); }
		public Copy_targetContext copy_target() {
			return getRuleContext(Copy_targetContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_HDFS() { return getToken(PlsqlParser.T_HDFS, 0); }
		public List<Copy_optionContext> copy_option() {
			return getRuleContexts(Copy_optionContext.class);
		}
		public Copy_optionContext copy_option(int i) {
			return getRuleContext(Copy_optionContext.class,i);
		}
		public Copy_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCopy_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCopy_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCopy_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_stmtContext copy_stmt() throws RecognitionException {
		Copy_stmtContext _localctx = new Copy_stmtContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_copy_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1945);
			match(T_COPY);
			setState(1951);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_CORRECT:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case L_ID:
				{
				setState(1946);
				table_name();
				}
				break;
			case T_OPEN_P:
				{
				setState(1947);
				match(T_OPEN_P);
				setState(1948);
				select_stmt();
				setState(1949);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1953);
			match(T_TO);
			setState(1955);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1954);
				match(T_HDFS);
				}
				break;
			}
			setState(1957);
			copy_target();
			setState(1961);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1958);
					copy_option();
					}
					}
				}
				setState(1963);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_sourceContext extends ParserRuleContext {
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Copy_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCopy_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCopy_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCopy_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_sourceContext copy_source() throws RecognitionException {
		Copy_sourceContext _localctx = new Copy_sourceContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_copy_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1966);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1964);
				file_name();
				}
				break;
			case 2:
				{
				setState(1965);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_targetContext extends ParserRuleContext {
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Copy_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCopy_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCopy_target(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCopy_target(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_targetContext copy_target() throws RecognitionException {
		Copy_targetContext _localctx = new Copy_targetContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_copy_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1970);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1968);
				file_name();
				}
				break;
			case 2:
				{
				setState(1969);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_optionContext extends ParserRuleContext {
		public TerminalNode T_AT() { return getToken(PlsqlParser.T_AT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_BATCHSIZE() { return getToken(PlsqlParser.T_BATCHSIZE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_DELIMITER() { return getToken(PlsqlParser.T_DELIMITER, 0); }
		public TerminalNode T_SQLINSERT() { return getToken(PlsqlParser.T_SQLINSERT, 0); }
		public Copy_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCopy_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCopy_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCopy_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_optionContext copy_option() throws RecognitionException {
		Copy_optionContext _localctx = new Copy_optionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_copy_option);
		try {
			setState(1980);
			switch (_input.LA(1)) {
			case T_AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1972);
				match(T_AT);
				setState(1973);
				ident();
				}
				break;
			case T_BATCHSIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1974);
				match(T_BATCHSIZE);
				setState(1975);
				expr(0);
				}
				break;
			case T_DELIMITER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1976);
				match(T_DELIMITER);
				setState(1977);
				expr(0);
				}
				break;
			case T_SQLINSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1978);
				match(T_SQLINSERT);
				setState(1979);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_file_optionContext extends ParserRuleContext {
		public TerminalNode T_DELETE() { return getToken(PlsqlParser.T_DELETE, 0); }
		public TerminalNode T_IGNORE() { return getToken(PlsqlParser.T_IGNORE, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(PlsqlParser.T_OVERWRITE, 0); }
		public Copy_file_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_file_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCopy_file_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCopy_file_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCopy_file_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_file_optionContext copy_file_option() throws RecognitionException {
		Copy_file_optionContext _localctx = new Copy_file_optionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_copy_file_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1982);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_IGNORE || _la==T_OVERWRITE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Commit_stmtContext extends ParserRuleContext {
		public TerminalNode T_COMMIT() { return getToken(PlsqlParser.T_COMMIT, 0); }
		public TerminalNode T_WORK() { return getToken(PlsqlParser.T_WORK, 0); }
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCommit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCommit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCommit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_commit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1984);
			match(T_COMMIT);
			setState(1986);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				setState(1985);
				match(T_WORK);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(PlsqlParser.T_CREATE, 0); }
		public TerminalNode T_INDEX() { return getToken(PlsqlParser.T_INDEX, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(PlsqlParser.T_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public List<Create_index_colContext> create_index_col() {
			return getRuleContexts(Create_index_colContext.class);
		}
		public Create_index_colContext create_index_col(int i) {
			return getRuleContext(Create_index_colContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_UNIQUE() { return getToken(PlsqlParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1988);
			match(T_CREATE);
			setState(1990);
			_la = _input.LA(1);
			if (_la==T_UNIQUE) {
				{
				setState(1989);
				match(T_UNIQUE);
				}
			}

			setState(1992);
			match(T_INDEX);
			setState(1993);
			ident();
			setState(1994);
			match(T_ON);
			setState(1995);
			table_name();
			setState(1996);
			match(T_OPEN_P);
			setState(1997);
			create_index_col();
			setState(2002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1998);
				match(T_COMMA);
				setState(1999);
				create_index_col();
				}
				}
				setState(2004);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2005);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_colContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ASC() { return getToken(PlsqlParser.T_ASC, 0); }
		public TerminalNode T_DESC() { return getToken(PlsqlParser.T_DESC, 0); }
		public Create_index_colContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_col; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCreate_index_col(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCreate_index_col(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCreate_index_col(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_colContext create_index_col() throws RecognitionException {
		Create_index_colContext _localctx = new Create_index_colContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_create_index_col);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2007);
			ident();
			setState(2009);
			_la = _input.LA(1);
			if (_la==T_ASC || _la==T_DESC) {
				{
				setState(2008);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_storage_clauseContext extends ParserRuleContext {
		public Index_mssql_storage_clauseContext index_mssql_storage_clause() {
			return getRuleContext(Index_mssql_storage_clauseContext.class,0);
		}
		public Index_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_storage_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterIndex_storage_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitIndex_storage_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitIndex_storage_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_storage_clauseContext index_storage_clause() throws RecognitionException {
		Index_storage_clauseContext _localctx = new Index_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_index_storage_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2011);
			index_mssql_storage_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_mssql_storage_clauseContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(PlsqlParser.T_WITH, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_EQUAL() { return getTokens(PlsqlParser.T_EQUAL); }
		public TerminalNode T_EQUAL(int i) {
			return getToken(PlsqlParser.T_EQUAL, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public List<Create_table_options_mssql_itemContext> create_table_options_mssql_item() {
			return getRuleContexts(Create_table_options_mssql_itemContext.class);
		}
		public Create_table_options_mssql_itemContext create_table_options_mssql_item(int i) {
			return getRuleContext(Create_table_options_mssql_itemContext.class,i);
		}
		public Index_mssql_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_mssql_storage_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterIndex_mssql_storage_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitIndex_mssql_storage_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitIndex_mssql_storage_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_mssql_storage_clauseContext index_mssql_storage_clause() throws RecognitionException {
		Index_mssql_storage_clauseContext _localctx = new Index_mssql_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_index_mssql_storage_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2013);
			match(T_WITH);
			setState(2014);
			match(T_OPEN_P);
			setState(2015);
			ident();
			setState(2016);
			match(T_EQUAL);
			setState(2017);
			ident();
			setState(2025);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2018);
				match(T_COMMA);
				setState(2019);
				ident();
				setState(2020);
				match(T_EQUAL);
				setState(2021);
				ident();
				}
				}
				setState(2027);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2028);
			match(T_CLOSE_P);
			setState(2032);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2029);
					create_table_options_mssql_item();
					}
					}
				}
				setState(2034);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_stmtContext extends ParserRuleContext {
		public TerminalNode T_PRINT() { return getToken(PlsqlParser.T_PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterPrint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitPrint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitPrint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_print_stmt);
		try {
			setState(2042);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2035);
				match(T_PRINT);
				setState(2036);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2037);
				match(T_PRINT);
				setState(2038);
				match(T_OPEN_P);
				setState(2039);
				expr(0);
				setState(2040);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quit_stmtContext extends ParserRuleContext {
		public TerminalNode T_QUIT() { return getToken(PlsqlParser.T_QUIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Quit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterQuit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitQuit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitQuit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quit_stmtContext quit_stmt() throws RecognitionException {
		Quit_stmtContext _localctx = new Quit_stmtContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_quit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2045);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(2044);
				match(T__3);
				}
			}

			setState(2047);
			match(T_QUIT);
			setState(2049);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				setState(2048);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raise_stmtContext extends ParserRuleContext {
		public TerminalNode T_RAISE() { return getToken(PlsqlParser.T_RAISE, 0); }
		public Raise_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterRaise_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitRaise_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitRaise_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_stmtContext raise_stmt() throws RecognitionException {
		Raise_stmtContext _localctx = new Raise_stmtContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_raise_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2051);
			match(T_RAISE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Resignal_stmtContext extends ParserRuleContext {
		public TerminalNode T_RESIGNAL() { return getToken(PlsqlParser.T_RESIGNAL, 0); }
		public TerminalNode T_SQLSTATE() { return getToken(PlsqlParser.T_SQLSTATE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_VALUE() { return getToken(PlsqlParser.T_VALUE, 0); }
		public TerminalNode T_SET() { return getToken(PlsqlParser.T_SET, 0); }
		public TerminalNode T_MESSAGE_TEXT() { return getToken(PlsqlParser.T_MESSAGE_TEXT, 0); }
		public TerminalNode T_EQUAL() { return getToken(PlsqlParser.T_EQUAL, 0); }
		public Resignal_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resignal_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterResignal_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitResignal_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitResignal_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Resignal_stmtContext resignal_stmt() throws RecognitionException {
		Resignal_stmtContext _localctx = new Resignal_stmtContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_resignal_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2053);
			match(T_RESIGNAL);
			setState(2065);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				setState(2054);
				match(T_SQLSTATE);
				setState(2056);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(2055);
					match(T_VALUE);
					}
					break;
				}
				setState(2058);
				expr(0);
				setState(2063);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(2059);
					match(T_SET);
					setState(2060);
					match(T_MESSAGE_TEXT);
					setState(2061);
					match(T_EQUAL);
					setState(2062);
					expr(0);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode T_RETURN() { return getToken(PlsqlParser.T_RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2067);
			match(T_RETURN);
			setState(2069);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(2068);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rollback_stmtContext extends ParserRuleContext {
		public TerminalNode T_ROLLBACK() { return getToken(PlsqlParser.T_ROLLBACK, 0); }
		public TerminalNode T_WORK() { return getToken(PlsqlParser.T_WORK, 0); }
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterRollback_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitRollback_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitRollback_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_rollback_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2071);
			match(T_ROLLBACK);
			setState(2073);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				{
				setState(2072);
				match(T_WORK);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_session_optionContext extends ParserRuleContext {
		public Set_current_schema_optionContext set_current_schema_option() {
			return getRuleContext(Set_current_schema_optionContext.class,0);
		}
		public Set_mssql_session_optionContext set_mssql_session_option() {
			return getRuleContext(Set_mssql_session_optionContext.class,0);
		}
		public Set_teradata_session_optionContext set_teradata_session_option() {
			return getRuleContext(Set_teradata_session_optionContext.class,0);
		}
		public Set_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_session_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterSet_session_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitSet_session_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitSet_session_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_session_optionContext set_session_option() throws RecognitionException {
		Set_session_optionContext _localctx = new Set_session_optionContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_set_session_option);
		try {
			setState(2078);
			switch (_input.LA(1)) {
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_SCHEMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(2075);
				set_current_schema_option();
				}
				break;
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_NOCOUNT:
			case T_QUOTED_IDENTIFIER:
			case T_XACT_ABORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2076);
				set_mssql_session_option();
				}
				break;
			case T_QUERY_BAND:
				enterOuterAlt(_localctx, 3);
				{
				setState(2077);
				set_teradata_session_option();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_current_schema_optionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CURRENT_SCHEMA() { return getToken(PlsqlParser.T_CURRENT_SCHEMA, 0); }
		public TerminalNode T_EQUAL() { return getToken(PlsqlParser.T_EQUAL, 0); }
		public TerminalNode T_SCHEMA() { return getToken(PlsqlParser.T_SCHEMA, 0); }
		public TerminalNode T_CURRENT() { return getToken(PlsqlParser.T_CURRENT, 0); }
		public Set_current_schema_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_current_schema_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterSet_current_schema_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitSet_current_schema_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitSet_current_schema_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_current_schema_optionContext set_current_schema_option() throws RecognitionException {
		Set_current_schema_optionContext _localctx = new Set_current_schema_optionContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_set_current_schema_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2085);
			switch (_input.LA(1)) {
			case T_CURRENT:
			case T_SCHEMA:
				{
				{
				setState(2081);
				_la = _input.LA(1);
				if (_la==T_CURRENT) {
					{
					setState(2080);
					match(T_CURRENT);
					}
				}

				setState(2083);
				match(T_SCHEMA);
				}
				}
				break;
			case T_CURRENT_SCHEMA:
				{
				setState(2084);
				match(T_CURRENT_SCHEMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2088);
			_la = _input.LA(1);
			if (_la==T_EQUAL) {
				{
				setState(2087);
				match(T_EQUAL);
				}
			}

			setState(2090);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_mssql_session_optionContext extends ParserRuleContext {
		public TerminalNode T_ANSI_NULLS() { return getToken(PlsqlParser.T_ANSI_NULLS, 0); }
		public TerminalNode T_ANSI_PADDING() { return getToken(PlsqlParser.T_ANSI_PADDING, 0); }
		public TerminalNode T_NOCOUNT() { return getToken(PlsqlParser.T_NOCOUNT, 0); }
		public TerminalNode T_QUOTED_IDENTIFIER() { return getToken(PlsqlParser.T_QUOTED_IDENTIFIER, 0); }
		public TerminalNode T_XACT_ABORT() { return getToken(PlsqlParser.T_XACT_ABORT, 0); }
		public TerminalNode T_ON() { return getToken(PlsqlParser.T_ON, 0); }
		public TerminalNode T_OFF() { return getToken(PlsqlParser.T_OFF, 0); }
		public Set_mssql_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_mssql_session_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterSet_mssql_session_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitSet_mssql_session_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitSet_mssql_session_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_mssql_session_optionContext set_mssql_session_option() throws RecognitionException {
		Set_mssql_session_optionContext _localctx = new Set_mssql_session_optionContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_set_mssql_session_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2092);
			_la = _input.LA(1);
			if ( !(_la==T_ANSI_NULLS || _la==T_ANSI_PADDING || _la==T_NOCOUNT || _la==T_QUOTED_IDENTIFIER || _la==T_XACT_ABORT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(2093);
			_la = _input.LA(1);
			if ( !(_la==T_OFF || _la==T_ON) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_teradata_session_optionContext extends ParserRuleContext {
		public TerminalNode T_QUERY_BAND() { return getToken(PlsqlParser.T_QUERY_BAND, 0); }
		public TerminalNode T_EQUAL() { return getToken(PlsqlParser.T_EQUAL, 0); }
		public TerminalNode T_FOR() { return getToken(PlsqlParser.T_FOR, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(PlsqlParser.T_TRANSACTION, 0); }
		public TerminalNode T_SESSION() { return getToken(PlsqlParser.T_SESSION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_NONE() { return getToken(PlsqlParser.T_NONE, 0); }
		public TerminalNode T_UPDATE() { return getToken(PlsqlParser.T_UPDATE, 0); }
		public Set_teradata_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_teradata_session_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterSet_teradata_session_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitSet_teradata_session_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitSet_teradata_session_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_teradata_session_optionContext set_teradata_session_option() throws RecognitionException {
		Set_teradata_session_optionContext _localctx = new Set_teradata_session_optionContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_set_teradata_session_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2095);
			match(T_QUERY_BAND);
			setState(2096);
			match(T_EQUAL);
			setState(2099);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(2097);
				expr(0);
				}
				break;
			case 2:
				{
				setState(2098);
				match(T_NONE);
				}
				break;
			}
			setState(2102);
			_la = _input.LA(1);
			if (_la==T_UPDATE) {
				{
				setState(2101);
				match(T_UPDATE);
				}
			}

			setState(2104);
			match(T_FOR);
			setState(2105);
			_la = _input.LA(1);
			if ( !(_la==T_SESSION || _la==T_TRANSACTION) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signal_stmtContext extends ParserRuleContext {
		public TerminalNode T_SIGNAL() { return getToken(PlsqlParser.T_SIGNAL, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Signal_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterSignal_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitSignal_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitSignal_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signal_stmtContext signal_stmt() throws RecognitionException {
		Signal_stmtContext _localctx = new Signal_stmtContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_signal_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2107);
			match(T_SIGNAL);
			setState(2108);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Summary_stmtContext extends ParserRuleContext {
		public TerminalNode T_SUMMARY() { return getToken(PlsqlParser.T_SUMMARY, 0); }
		public TerminalNode T_FOR() { return getToken(PlsqlParser.T_FOR, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_TOP() { return getToken(PlsqlParser.T_TOP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode T_LIMIT() { return getToken(PlsqlParser.T_LIMIT, 0); }
		public Summary_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summary_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterSummary_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitSummary_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitSummary_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Summary_stmtContext summary_stmt() throws RecognitionException {
		Summary_stmtContext _localctx = new Summary_stmtContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_summary_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2110);
			match(T_SUMMARY);
			setState(2113);
			_la = _input.LA(1);
			if (_la==T_TOP) {
				{
				setState(2111);
				match(T_TOP);
				setState(2112);
				expr(0);
				}
			}

			setState(2115);
			match(T_FOR);
			setState(2125);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				setState(2116);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(2117);
				table_name();
				setState(2119);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(2118);
					where_clause();
					}
					break;
				}
				setState(2123);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(2121);
					match(T_LIMIT);
					setState(2122);
					expr(0);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Truncate_stmtContext extends ParserRuleContext {
		public TerminalNode T_TRUNCATE() { return getToken(PlsqlParser.T_TRUNCATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_TABLE() { return getToken(PlsqlParser.T_TABLE, 0); }
		public Truncate_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncate_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterTruncate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitTruncate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitTruncate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Truncate_stmtContext truncate_stmt() throws RecognitionException {
		Truncate_stmtContext _localctx = new Truncate_stmtContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_truncate_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2127);
			match(T_TRUNCATE);
			setState(2129);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				{
				setState(2128);
				match(T_TABLE);
				}
				break;
			}
			setState(2131);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Use_stmtContext extends ParserRuleContext {
		public TerminalNode T_USE() { return getToken(PlsqlParser.T_USE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Use_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterUse_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitUse_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitUse_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_stmtContext use_stmt() throws RecognitionException {
		Use_stmtContext _localctx = new Use_stmtContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_use_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2133);
			match(T_USE);
			setState(2134);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Values_into_stmtContext extends ParserRuleContext {
		public TerminalNode T_VALUES() { return getToken(PlsqlParser.T_VALUES, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_INTO() { return getToken(PlsqlParser.T_INTO, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_OPEN_P() { return getTokens(PlsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(PlsqlParser.T_OPEN_P, i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(PlsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(PlsqlParser.T_CLOSE_P, i);
		}
		public Values_into_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values_into_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterValues_into_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitValues_into_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitValues_into_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Values_into_stmtContext values_into_stmt() throws RecognitionException {
		Values_into_stmtContext _localctx = new Values_into_stmtContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_values_into_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2136);
			match(T_VALUES);
			setState(2138);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(2137);
				match(T_OPEN_P);
				}
				break;
			}
			setState(2140);
			expr(0);
			setState(2145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2141);
				match(T_COMMA);
				setState(2142);
				expr(0);
				}
				}
				setState(2147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2149);
			_la = _input.LA(1);
			if (_la==T_CLOSE_P) {
				{
				setState(2148);
				match(T_CLOSE_P);
				}
			}

			setState(2151);
			match(T_INTO);
			setState(2153);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(2152);
				match(T_OPEN_P);
				}
			}

			setState(2155);
			ident();
			setState(2160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2156);
					match(T_COMMA);
					setState(2157);
					ident();
					}
					}
				}
				setState(2162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			}
			setState(2164);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(2163);
				match(T_CLOSE_P);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public List<TerminalNode> T_WHILE() { return getTokens(PlsqlParser.T_WHILE); }
		public TerminalNode T_WHILE(int i) {
			return getToken(PlsqlParser.T_WHILE, i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(PlsqlParser.T_END, 0); }
		public TerminalNode T_DO() { return getToken(PlsqlParser.T_DO, 0); }
		public List<TerminalNode> T_LOOP() { return getTokens(PlsqlParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(PlsqlParser.T_LOOP, i);
		}
		public TerminalNode T_THEN() { return getToken(PlsqlParser.T_THEN, 0); }
		public TerminalNode T_BEGIN() { return getToken(PlsqlParser.T_BEGIN, 0); }
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2166);
			match(T_WHILE);
			setState(2167);
			bool_expr(0);
			setState(2168);
			_la = _input.LA(1);
			if ( !(_la==T_BEGIN || _la==T_DO || _la==T_LOOP || _la==T_THEN) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(2169);
			block();
			setState(2170);
			match(T_END);
			setState(2172);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(2171);
				_la = _input.LA(1);
				if ( !(_la==T_LOOP || _la==T_WHILE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_cursor_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(PlsqlParser.T_FOR, 0); }
		public TerminalNode L_ID() { return getToken(PlsqlParser.L_ID, 0); }
		public TerminalNode T_IN() { return getToken(PlsqlParser.T_IN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_LOOP() { return getTokens(PlsqlParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(PlsqlParser.T_LOOP, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(PlsqlParser.T_END, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public For_cursor_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_cursor_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterFor_cursor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitFor_cursor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitFor_cursor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_cursor_stmtContext for_cursor_stmt() throws RecognitionException {
		For_cursor_stmtContext _localctx = new For_cursor_stmtContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_for_cursor_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2174);
			match(T_FOR);
			setState(2175);
			match(L_ID);
			setState(2176);
			match(T_IN);
			setState(2178);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(2177);
				match(T_OPEN_P);
				}
				break;
			}
			setState(2180);
			select_stmt();
			setState(2182);
			_la = _input.LA(1);
			if (_la==T_CLOSE_P) {
				{
				setState(2181);
				match(T_CLOSE_P);
				}
			}

			setState(2184);
			match(T_LOOP);
			setState(2185);
			block();
			setState(2186);
			match(T_END);
			setState(2187);
			match(T_LOOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_range_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(PlsqlParser.T_FOR, 0); }
		public TerminalNode L_ID() { return getToken(PlsqlParser.L_ID, 0); }
		public TerminalNode T_IN() { return getToken(PlsqlParser.T_IN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_DOT2() { return getToken(PlsqlParser.T_DOT2, 0); }
		public List<TerminalNode> T_LOOP() { return getTokens(PlsqlParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(PlsqlParser.T_LOOP, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(PlsqlParser.T_END, 0); }
		public TerminalNode T_REVERSE() { return getToken(PlsqlParser.T_REVERSE, 0); }
		public TerminalNode T_BY() { return getToken(PlsqlParser.T_BY, 0); }
		public TerminalNode T_STEP() { return getToken(PlsqlParser.T_STEP, 0); }
		public For_range_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_range_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterFor_range_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitFor_range_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitFor_range_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_range_stmtContext for_range_stmt() throws RecognitionException {
		For_range_stmtContext _localctx = new For_range_stmtContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_for_range_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2189);
			match(T_FOR);
			setState(2190);
			match(L_ID);
			setState(2191);
			match(T_IN);
			setState(2193);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(2192);
				match(T_REVERSE);
				}
				break;
			}
			setState(2195);
			expr(0);
			setState(2196);
			match(T_DOT2);
			setState(2197);
			expr(0);
			setState(2200);
			_la = _input.LA(1);
			if (_la==T_BY || _la==T_STEP) {
				{
				setState(2198);
				_la = _input.LA(1);
				if ( !(_la==T_BY || _la==T_STEP) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2199);
				expr(0);
				}
			}

			setState(2202);
			match(T_LOOP);
			setState(2203);
			block();
			setState(2204);
			match(T_END);
			setState(2205);
			match(T_LOOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode L_LABEL() { return getToken(PlsqlParser.L_LABEL, 0); }
		public List<TerminalNode> T_LESS() { return getTokens(PlsqlParser.T_LESS); }
		public TerminalNode T_LESS(int i) {
			return getToken(PlsqlParser.T_LESS, i);
		}
		public TerminalNode L_ID() { return getToken(PlsqlParser.L_ID, 0); }
		public List<TerminalNode> T_GREATER() { return getTokens(PlsqlParser.T_GREATER); }
		public TerminalNode T_GREATER(int i) {
			return getToken(PlsqlParser.T_GREATER, i);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_label);
		try {
			setState(2213);
			switch (_input.LA(1)) {
			case L_LABEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2207);
				match(L_LABEL);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(2208);
				match(T_LESS);
				setState(2209);
				match(T_LESS);
				setState(2210);
				match(L_ID);
				setState(2211);
				match(T_GREATER);
				setState(2212);
				match(T_GREATER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Using_clauseContext extends ParserRuleContext {
		public TerminalNode T_USING() { return getToken(PlsqlParser.T_USING, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public Using_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterUsing_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitUsing_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitUsing_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Using_clauseContext using_clause() throws RecognitionException {
		Using_clauseContext _localctx = new Using_clauseContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_using_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2215);
			match(T_USING);
			setState(2216);
			expr(0);
			setState(2221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2217);
					match(T_COMMA);
					setState(2218);
					expr(0);
					}
					}
				}
				setState(2223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public Cte_select_stmtContext cte_select_stmt() {
			return getRuleContext(Cte_select_stmtContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2225);
			_la = _input.LA(1);
			if (_la==T_WITH) {
				{
				setState(2224);
				cte_select_stmt();
				}
			}

			setState(2227);
			fullselect_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_select_stmtContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(PlsqlParser.T_WITH, 0); }
		public List<Cte_select_stmt_itemContext> cte_select_stmt_item() {
			return getRuleContexts(Cte_select_stmt_itemContext.class);
		}
		public Cte_select_stmt_itemContext cte_select_stmt_item(int i) {
			return getRuleContext(Cte_select_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public Cte_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCte_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCte_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCte_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_stmtContext cte_select_stmt() throws RecognitionException {
		Cte_select_stmtContext _localctx = new Cte_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_cte_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2229);
			match(T_WITH);
			setState(2230);
			cte_select_stmt_item();
			setState(2235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2231);
				match(T_COMMA);
				setState(2232);
				cte_select_stmt_item();
				}
				}
				setState(2237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_select_stmt_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(PlsqlParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public Cte_select_colsContext cte_select_cols() {
			return getRuleContext(Cte_select_colsContext.class,0);
		}
		public Cte_select_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCte_select_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCte_select_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCte_select_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_stmt_itemContext cte_select_stmt_item() throws RecognitionException {
		Cte_select_stmt_itemContext _localctx = new Cte_select_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_cte_select_stmt_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2238);
			ident();
			setState(2240);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(2239);
				cte_select_cols();
				}
			}

			setState(2242);
			match(T_AS);
			setState(2243);
			match(T_OPEN_P);
			setState(2244);
			fullselect_stmt();
			setState(2245);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_select_colsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public Cte_select_colsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_cols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCte_select_cols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCte_select_cols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCte_select_cols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_colsContext cte_select_cols() throws RecognitionException {
		Cte_select_colsContext _localctx = new Cte_select_colsContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_cte_select_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2247);
			match(T_OPEN_P);
			setState(2248);
			ident();
			setState(2253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2249);
				match(T_COMMA);
				setState(2250);
				ident();
				}
				}
				setState(2255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2256);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fullselect_stmtContext extends ParserRuleContext {
		public List<Fullselect_stmt_itemContext> fullselect_stmt_item() {
			return getRuleContexts(Fullselect_stmt_itemContext.class);
		}
		public Fullselect_stmt_itemContext fullselect_stmt_item(int i) {
			return getRuleContext(Fullselect_stmt_itemContext.class,i);
		}
		public List<Fullselect_set_clauseContext> fullselect_set_clause() {
			return getRuleContexts(Fullselect_set_clauseContext.class);
		}
		public Fullselect_set_clauseContext fullselect_set_clause(int i) {
			return getRuleContext(Fullselect_set_clauseContext.class,i);
		}
		public Fullselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterFullselect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitFullselect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitFullselect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_stmtContext fullselect_stmt() throws RecognitionException {
		Fullselect_stmtContext _localctx = new Fullselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_fullselect_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2258);
			fullselect_stmt_item();
			setState(2264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2259);
					fullselect_set_clause();
					setState(2260);
					fullselect_stmt_item();
					}
					}
				}
				setState(2266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fullselect_stmt_itemContext extends ParserRuleContext {
		public Subselect_stmtContext subselect_stmt() {
			return getRuleContext(Subselect_stmtContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public Fullselect_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterFullselect_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitFullselect_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitFullselect_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_stmt_itemContext fullselect_stmt_item() throws RecognitionException {
		Fullselect_stmt_itemContext _localctx = new Fullselect_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_fullselect_stmt_item);
		try {
			setState(2272);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2267);
				subselect_stmt();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(2268);
				match(T_OPEN_P);
				setState(2269);
				fullselect_stmt();
				setState(2270);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fullselect_set_clauseContext extends ParserRuleContext {
		public TerminalNode T_UNION() { return getToken(PlsqlParser.T_UNION, 0); }
		public TerminalNode T_ALL() { return getToken(PlsqlParser.T_ALL, 0); }
		public TerminalNode T_EXCEPT() { return getToken(PlsqlParser.T_EXCEPT, 0); }
		public TerminalNode T_INTERSECT() { return getToken(PlsqlParser.T_INTERSECT, 0); }
		public Fullselect_set_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_set_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterFullselect_set_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitFullselect_set_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitFullselect_set_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_set_clauseContext fullselect_set_clause() throws RecognitionException {
		Fullselect_set_clauseContext _localctx = new Fullselect_set_clauseContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_fullselect_set_clause);
		int _la;
		try {
			setState(2286);
			switch (_input.LA(1)) {
			case T_UNION:
				enterOuterAlt(_localctx, 1);
				{
				setState(2274);
				match(T_UNION);
				setState(2276);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(2275);
					match(T_ALL);
					}
				}

				}
				break;
			case T_EXCEPT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2278);
				match(T_EXCEPT);
				setState(2280);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(2279);
					match(T_ALL);
					}
				}

				}
				break;
			case T_INTERSECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2282);
				match(T_INTERSECT);
				setState(2284);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(2283);
					match(T_ALL);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subselect_stmtContext extends ParserRuleContext {
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode T_SELECT() { return getToken(PlsqlParser.T_SELECT, 0); }
		public TerminalNode T_SEL() { return getToken(PlsqlParser.T_SEL, 0); }
		public Into_clauseContext into_clause() {
			return getRuleContext(Into_clauseContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Group_by_clauseContext group_by_clause() {
			return getRuleContext(Group_by_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Qualify_clauseContext qualify_clause() {
			return getRuleContext(Qualify_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Select_optionsContext select_options() {
			return getRuleContext(Select_optionsContext.class,0);
		}
		public Subselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subselect_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterSubselect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitSubselect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitSubselect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subselect_stmtContext subselect_stmt() throws RecognitionException {
		Subselect_stmtContext _localctx = new Subselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_subselect_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2288);
			_la = _input.LA(1);
			if ( !(_la==T_SEL || _la==T_SELECT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(2289);
			select_list();
			setState(2291);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				{
				setState(2290);
				into_clause();
				}
				break;
			}
			setState(2294);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				{
				setState(2293);
				from_clause();
				}
				break;
			}
			setState(2297);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				{
				setState(2296);
				where_clause();
				}
				break;
			}
			setState(2300);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				{
				setState(2299);
				group_by_clause();
				}
				break;
			}
			setState(2304);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				setState(2302);
				having_clause();
				}
				break;
			case 2:
				{
				setState(2303);
				qualify_clause();
				}
				break;
			}
			setState(2307);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				{
				setState(2306);
				order_by_clause();
				}
				break;
			}
			setState(2310);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				{
				setState(2309);
				select_options();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_listContext extends ParserRuleContext {
		public List<Select_list_itemContext> select_list_item() {
			return getRuleContexts(Select_list_itemContext.class);
		}
		public Select_list_itemContext select_list_item(int i) {
			return getRuleContext(Select_list_itemContext.class,i);
		}
		public Select_list_setContext select_list_set() {
			return getRuleContext(Select_list_setContext.class,0);
		}
		public Select_list_limitContext select_list_limit() {
			return getRuleContext(Select_list_limitContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitSelect_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_select_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2313);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				{
				setState(2312);
				select_list_set();
				}
				break;
			}
			setState(2316);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(2315);
				select_list_limit();
				}
				break;
			}
			setState(2318);
			select_list_item();
			setState(2323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2319);
					match(T_COMMA);
					setState(2320);
					select_list_item();
					}
					}
				}
				setState(2325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_setContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(PlsqlParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(PlsqlParser.T_DISTINCT, 0); }
		public Select_list_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterSelect_list_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitSelect_list_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitSelect_list_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_setContext select_list_set() throws RecognitionException {
		Select_list_setContext _localctx = new Select_list_setContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_select_list_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2326);
			_la = _input.LA(1);
			if ( !(_la==T_ALL || _la==T_DISTINCT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_limitContext extends ParserRuleContext {
		public TerminalNode T_TOP() { return getToken(PlsqlParser.T_TOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_limitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterSelect_list_limit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitSelect_list_limit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitSelect_list_limit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_limitContext select_list_limit() throws RecognitionException {
		Select_list_limitContext _localctx = new Select_list_limitContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_select_list_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2328);
			match(T_TOP);
			setState(2329);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_itemContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_asteriskContext select_list_asterisk() {
			return getRuleContext(Select_list_asteriskContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(PlsqlParser.T_EQUAL, 0); }
		public Select_list_aliasContext select_list_alias() {
			return getRuleContext(Select_list_aliasContext.class,0);
		}
		public Select_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterSelect_list_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitSelect_list_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitSelect_list_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_itemContext select_list_item() throws RecognitionException {
		Select_list_itemContext _localctx = new Select_list_itemContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_select_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2341);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				{
				setState(2334);
				switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
				case 1:
					{
					setState(2331);
					ident();
					setState(2332);
					match(T_EQUAL);
					}
					break;
				}
				setState(2336);
				expr(0);
				setState(2338);
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(2337);
					select_list_alias();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(2340);
				select_list_asterisk();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_aliasContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(PlsqlParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_TITLE() { return getToken(PlsqlParser.T_TITLE, 0); }
		public TerminalNode L_S_STRING() { return getToken(PlsqlParser.L_S_STRING, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public Select_list_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterSelect_list_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitSelect_list_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitSelect_list_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_aliasContext select_list_alias() throws RecognitionException {
		Select_list_aliasContext _localctx = new Select_list_aliasContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_select_list_alias);
		try {
			setState(2352);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2343);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\") && !_input.LT(1).getText().equalsIgnoreCase(\"FROM\")");
				setState(2345);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2344);
					match(T_AS);
					}
					break;
				}
				setState(2347);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2348);
				match(T_OPEN_P);
				setState(2349);
				match(T_TITLE);
				setState(2350);
				match(L_S_STRING);
				setState(2351);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_asteriskContext extends ParserRuleContext {
		public TerminalNode L_ID() { return getToken(PlsqlParser.L_ID, 0); }
		public Select_list_asteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_asterisk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterSelect_list_asterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitSelect_list_asterisk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitSelect_list_asterisk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_asteriskContext select_list_asterisk() throws RecognitionException {
		Select_list_asteriskContext _localctx = new Select_list_asteriskContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_select_list_asterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2356);
			_la = _input.LA(1);
			if (_la==L_ID) {
				{
				setState(2354);
				match(L_ID);
				setState(2355);
				match(T__3);
				}
			}

			setState(2358);
			match(T_MUL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Into_clauseContext extends ParserRuleContext {
		public TerminalNode T_INTO() { return getToken(PlsqlParser.T_INTO, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public Into_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_into_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterInto_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitInto_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitInto_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Into_clauseContext into_clause() throws RecognitionException {
		Into_clauseContext _localctx = new Into_clauseContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_into_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2360);
			match(T_INTO);
			setState(2361);
			ident();
			setState(2366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2362);
					match(T_COMMA);
					setState(2363);
					ident();
					}
					}
				}
				setState(2368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode T_FROM() { return getToken(PlsqlParser.T_FROM, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public List<From_join_clauseContext> from_join_clause() {
			return getRuleContexts(From_join_clauseContext.class);
		}
		public From_join_clauseContext from_join_clause(int i) {
			return getRuleContext(From_join_clauseContext.class,i);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitFrom_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitFrom_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_from_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2369);
			match(T_FROM);
			setState(2370);
			from_table_clause();
			setState(2374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2371);
					from_join_clause();
					}
					}
				}
				setState(2376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_clauseContext extends ParserRuleContext {
		public From_table_name_clauseContext from_table_name_clause() {
			return getRuleContext(From_table_name_clauseContext.class,0);
		}
		public From_subselect_clauseContext from_subselect_clause() {
			return getRuleContext(From_subselect_clauseContext.class,0);
		}
		public From_table_values_clauseContext from_table_values_clause() {
			return getRuleContext(From_table_values_clauseContext.class,0);
		}
		public From_table_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterFrom_table_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitFrom_table_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitFrom_table_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_clauseContext from_table_clause() throws RecognitionException {
		From_table_clauseContext _localctx = new From_table_clauseContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_from_table_clause);
		try {
			setState(2380);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2377);
				from_table_name_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2378);
				from_subselect_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2379);
				from_table_values_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_name_clauseContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_name_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_name_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterFrom_table_name_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitFrom_table_name_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitFrom_table_name_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_name_clauseContext from_table_name_clause() throws RecognitionException {
		From_table_name_clauseContext _localctx = new From_table_name_clauseContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_from_table_name_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2382);
			table_name();
			setState(2384);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(2383);
				from_alias_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_subselect_clauseContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_subselect_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_subselect_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterFrom_subselect_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitFrom_subselect_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitFrom_subselect_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_subselect_clauseContext from_subselect_clause() throws RecognitionException {
		From_subselect_clauseContext _localctx = new From_subselect_clauseContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_from_subselect_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2386);
			match(T_OPEN_P);
			setState(2387);
			select_stmt();
			setState(2388);
			match(T_CLOSE_P);
			setState(2390);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				{
				setState(2389);
				from_alias_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_join_clauseContext extends ParserRuleContext {
		public TerminalNode T_COMMA() { return getToken(PlsqlParser.T_COMMA, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public From_join_type_clauseContext from_join_type_clause() {
			return getRuleContext(From_join_type_clauseContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(PlsqlParser.T_ON, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public From_join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterFrom_join_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitFrom_join_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitFrom_join_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_join_clauseContext from_join_clause() throws RecognitionException {
		From_join_clauseContext _localctx = new From_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_from_join_clause);
		try {
			setState(2399);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(2392);
				match(T_COMMA);
				setState(2393);
				from_table_clause();
				}
				break;
			case T_FULL:
			case T_INNER:
			case T_JOIN:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2394);
				from_join_type_clause();
				setState(2395);
				from_table_clause();
				setState(2396);
				match(T_ON);
				setState(2397);
				bool_expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_join_type_clauseContext extends ParserRuleContext {
		public TerminalNode T_JOIN() { return getToken(PlsqlParser.T_JOIN, 0); }
		public TerminalNode T_INNER() { return getToken(PlsqlParser.T_INNER, 0); }
		public TerminalNode T_LEFT() { return getToken(PlsqlParser.T_LEFT, 0); }
		public TerminalNode T_RIGHT() { return getToken(PlsqlParser.T_RIGHT, 0); }
		public TerminalNode T_FULL() { return getToken(PlsqlParser.T_FULL, 0); }
		public TerminalNode T_OUTER() { return getToken(PlsqlParser.T_OUTER, 0); }
		public From_join_type_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_type_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterFrom_join_type_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitFrom_join_type_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitFrom_join_type_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_join_type_clauseContext from_join_type_clause() throws RecognitionException {
		From_join_type_clauseContext _localctx = new From_join_type_clauseContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_from_join_type_clause);
		int _la;
		try {
			setState(2410);
			switch (_input.LA(1)) {
			case T_INNER:
			case T_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2402);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(2401);
					match(T_INNER);
					}
				}

				setState(2404);
				match(T_JOIN);
				}
				break;
			case T_FULL:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2405);
				_la = _input.LA(1);
				if ( !(_la==T_FULL || _la==T_LEFT || _la==T_RIGHT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2407);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(2406);
					match(T_OUTER);
					}
				}

				setState(2409);
				match(T_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_values_clauseContext extends ParserRuleContext {
		public TerminalNode T_TABLE() { return getToken(PlsqlParser.T_TABLE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_VALUES() { return getToken(PlsqlParser.T_VALUES, 0); }
		public List<From_table_values_rowContext> from_table_values_row() {
			return getRuleContexts(From_table_values_rowContext.class);
		}
		public From_table_values_rowContext from_table_values_row(int i) {
			return getRuleContext(From_table_values_rowContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_values_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterFrom_table_values_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitFrom_table_values_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitFrom_table_values_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_values_clauseContext from_table_values_clause() throws RecognitionException {
		From_table_values_clauseContext _localctx = new From_table_values_clauseContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_from_table_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2412);
			match(T_TABLE);
			setState(2413);
			match(T_OPEN_P);
			setState(2414);
			match(T_VALUES);
			setState(2415);
			from_table_values_row();
			setState(2420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2416);
				match(T_COMMA);
				setState(2417);
				from_table_values_row();
				}
				}
				setState(2422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2423);
			match(T_CLOSE_P);
			setState(2425);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				{
				setState(2424);
				from_alias_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_values_rowContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public From_table_values_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterFrom_table_values_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitFrom_table_values_row(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitFrom_table_values_row(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_values_rowContext from_table_values_row() throws RecognitionException {
		From_table_values_rowContext _localctx = new From_table_values_rowContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_from_table_values_row);
		int _la;
		try {
			setState(2439);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2427);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2428);
				match(T_OPEN_P);
				setState(2429);
				expr(0);
				setState(2434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2430);
					match(T_COMMA);
					setState(2431);
					expr(0);
					}
					}
					setState(2436);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2437);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_alias_clauseContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(PlsqlParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public List<TerminalNode> L_ID() { return getTokens(PlsqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(PlsqlParser.L_ID, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public From_alias_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_alias_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterFrom_alias_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitFrom_alias_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitFrom_alias_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_alias_clauseContext from_alias_clause() throws RecognitionException {
		From_alias_clauseContext _localctx = new From_alias_clauseContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_from_alias_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2441);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
			        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
			        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
			        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("WITH"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"EXEC\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"EXECUTE\") && \r\n        !_input.LT(1).getText().equalsIgnoreCase(\"INNER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LEFT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"GROUP\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"ORDER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LIMIT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"WITH\")");
			setState(2443);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				{
				setState(2442);
				match(T_AS);
				}
				break;
			}
			setState(2445);
			ident();
			setState(2456);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				{
				setState(2446);
				match(T_OPEN_P);
				setState(2447);
				match(L_ID);
				setState(2452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2448);
					match(T_COMMA);
					setState(2449);
					match(L_ID);
					}
					}
					setState(2454);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2455);
				match(T_CLOSE_P);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2458);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode T_WHERE() { return getToken(PlsqlParser.T_WHERE, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2460);
			match(T_WHERE);
			setState(2461);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_GROUP() { return getToken(PlsqlParser.T_GROUP, 0); }
		public TerminalNode T_BY() { return getToken(PlsqlParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public Group_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterGroup_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitGroup_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitGroup_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_clauseContext group_by_clause() throws RecognitionException {
		Group_by_clauseContext _localctx = new Group_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_group_by_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2463);
			match(T_GROUP);
			setState(2464);
			match(T_BY);
			setState(2465);
			expr(0);
			setState(2470);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2466);
					match(T_COMMA);
					setState(2467);
					expr(0);
					}
					}
				}
				setState(2472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode T_HAVING() { return getToken(PlsqlParser.T_HAVING, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterHaving_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitHaving_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitHaving_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2473);
			match(T_HAVING);
			setState(2474);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualify_clauseContext extends ParserRuleContext {
		public TerminalNode T_QUALIFY() { return getToken(PlsqlParser.T_QUALIFY, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Qualify_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualify_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterQualify_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitQualify_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitQualify_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualify_clauseContext qualify_clause() throws RecognitionException {
		Qualify_clauseContext _localctx = new Qualify_clauseContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_qualify_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2476);
			match(T_QUALIFY);
			setState(2477);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_ORDER() { return getToken(PlsqlParser.T_ORDER, 0); }
		public TerminalNode T_BY() { return getToken(PlsqlParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public List<TerminalNode> T_ASC() { return getTokens(PlsqlParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(PlsqlParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(PlsqlParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(PlsqlParser.T_DESC, i);
		}
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterOrder_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitOrder_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitOrder_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2479);
			match(T_ORDER);
			setState(2480);
			match(T_BY);
			setState(2481);
			expr(0);
			setState(2483);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				{
				setState(2482);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(2492);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2485);
					match(T_COMMA);
					setState(2486);
					expr(0);
					setState(2488);
					switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
					case 1:
						{
						setState(2487);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					}
					}
					}
				}
				setState(2494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_optionsContext extends ParserRuleContext {
		public List<Select_options_itemContext> select_options_item() {
			return getRuleContexts(Select_options_itemContext.class);
		}
		public Select_options_itemContext select_options_item(int i) {
			return getRuleContext(Select_options_itemContext.class,i);
		}
		public Select_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterSelect_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitSelect_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitSelect_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_optionsContext select_options() throws RecognitionException {
		Select_optionsContext _localctx = new Select_optionsContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_select_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2496);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2495);
					select_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_options_itemContext extends ParserRuleContext {
		public TerminalNode T_LIMIT() { return getToken(PlsqlParser.T_LIMIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_WITH() { return getToken(PlsqlParser.T_WITH, 0); }
		public TerminalNode T_RR() { return getToken(PlsqlParser.T_RR, 0); }
		public TerminalNode T_RS() { return getToken(PlsqlParser.T_RS, 0); }
		public TerminalNode T_CS() { return getToken(PlsqlParser.T_CS, 0); }
		public TerminalNode T_UR() { return getToken(PlsqlParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(PlsqlParser.T_USE, 0); }
		public TerminalNode T_AND() { return getToken(PlsqlParser.T_AND, 0); }
		public TerminalNode T_KEEP() { return getToken(PlsqlParser.T_KEEP, 0); }
		public TerminalNode T_LOCKS() { return getToken(PlsqlParser.T_LOCKS, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(PlsqlParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_UPDATE() { return getToken(PlsqlParser.T_UPDATE, 0); }
		public TerminalNode T_SHARE() { return getToken(PlsqlParser.T_SHARE, 0); }
		public Select_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_options_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterSelect_options_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitSelect_options_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitSelect_options_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_options_itemContext select_options_item() throws RecognitionException {
		Select_options_itemContext _localctx = new Select_options_itemContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_select_options_item);
		int _la;
		try {
			setState(2511);
			switch (_input.LA(1)) {
			case T_LIMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2500);
				match(T_LIMIT);
				setState(2501);
				expr(0);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(2502);
				match(T_WITH);
				setState(2503);
				_la = _input.LA(1);
				if ( !(_la==T_CS || ((((_la - 245)) & ~0x3f) == 0 && ((1L << (_la - 245)) & ((1L << (T_RR - 245)) | (1L << (T_RS - 245)) | (1L << (T_UR - 245)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2509);
				switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
				case 1:
					{
					setState(2504);
					match(T_USE);
					setState(2505);
					match(T_AND);
					setState(2506);
					match(T_KEEP);
					setState(2507);
					_la = _input.LA(1);
					if ( !(_la==T_EXCLUSIVE || _la==T_SHARE || _la==T_UPDATE) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(2508);
					match(T_LOCKS);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode T_UPDATE() { return getToken(PlsqlParser.T_UPDATE, 0); }
		public Update_tableContext update_table() {
			return getRuleContext(Update_tableContext.class,0);
		}
		public TerminalNode T_SET() { return getToken(PlsqlParser.T_SET, 0); }
		public Update_assignmentContext update_assignment() {
			return getRuleContext(Update_assignmentContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Update_upsertContext update_upsert() {
			return getRuleContext(Update_upsertContext.class,0);
		}
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_update_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2513);
			match(T_UPDATE);
			setState(2514);
			update_table();
			setState(2515);
			match(T_SET);
			setState(2516);
			update_assignment();
			setState(2518);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				{
				setState(2517);
				where_clause();
				}
				break;
			}
			setState(2521);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				{
				setState(2520);
				update_upsert();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_assignmentContext extends ParserRuleContext {
		public List<Assignment_stmt_itemContext> assignment_stmt_item() {
			return getRuleContexts(Assignment_stmt_itemContext.class);
		}
		public Assignment_stmt_itemContext assignment_stmt_item(int i) {
			return getRuleContext(Assignment_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public Update_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterUpdate_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitUpdate_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitUpdate_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_assignmentContext update_assignment() throws RecognitionException {
		Update_assignmentContext _localctx = new Update_assignmentContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_update_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2523);
			assignment_stmt_item();
			setState(2528);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2524);
					match(T_COMMA);
					setState(2525);
					assignment_stmt_item();
					}
					}
				}
				setState(2530);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_tableContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(PlsqlParser.T_AS, 0); }
		public Update_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterUpdate_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitUpdate_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitUpdate_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_tableContext update_table() throws RecognitionException {
		Update_tableContext _localctx = new Update_tableContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_update_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2539);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_CORRECT:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case L_ID:
				{
				setState(2531);
				table_name();
				setState(2533);
				switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
				case 1:
					{
					setState(2532);
					from_clause();
					}
					break;
				}
				}
				break;
			case T_OPEN_P:
				{
				setState(2535);
				match(T_OPEN_P);
				setState(2536);
				select_stmt();
				setState(2537);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2545);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				{
				setState(2542);
				switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
				case 1:
					{
					setState(2541);
					match(T_AS);
					}
					break;
				}
				setState(2544);
				ident();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_upsertContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(PlsqlParser.T_ELSE, 0); }
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Update_upsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_upsert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterUpdate_upsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitUpdate_upsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitUpdate_upsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_upsertContext update_upsert() throws RecognitionException {
		Update_upsertContext _localctx = new Update_upsertContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_update_upsert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2547);
			match(T_ELSE);
			setState(2548);
			insert_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Merge_stmtContext extends ParserRuleContext {
		public TerminalNode T_MERGE() { return getToken(PlsqlParser.T_MERGE, 0); }
		public TerminalNode T_INTO() { return getToken(PlsqlParser.T_INTO, 0); }
		public List<Merge_tableContext> merge_table() {
			return getRuleContexts(Merge_tableContext.class);
		}
		public Merge_tableContext merge_table(int i) {
			return getRuleContext(Merge_tableContext.class,i);
		}
		public TerminalNode T_USING() { return getToken(PlsqlParser.T_USING, 0); }
		public TerminalNode T_ON() { return getToken(PlsqlParser.T_ON, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public List<Merge_conditionContext> merge_condition() {
			return getRuleContexts(Merge_conditionContext.class);
		}
		public Merge_conditionContext merge_condition(int i) {
			return getRuleContext(Merge_conditionContext.class,i);
		}
		public Merge_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterMerge_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitMerge_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitMerge_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Merge_stmtContext merge_stmt() throws RecognitionException {
		Merge_stmtContext _localctx = new Merge_stmtContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_merge_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2550);
			match(T_MERGE);
			setState(2551);
			match(T_INTO);
			setState(2552);
			merge_table();
			setState(2553);
			match(T_USING);
			setState(2554);
			merge_table();
			setState(2555);
			match(T_ON);
			setState(2556);
			bool_expr(0);
			setState(2558);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2557);
					merge_condition();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2560);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Merge_tableContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_AS() { return getToken(PlsqlParser.T_AS, 0); }
		public Merge_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterMerge_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitMerge_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitMerge_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Merge_tableContext merge_table() throws RecognitionException {
		Merge_tableContext _localctx = new Merge_tableContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_merge_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2567);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_CORRECT:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case L_ID:
				{
				setState(2562);
				table_name();
				}
				break;
			case T_OPEN_P:
				{
				{
				setState(2563);
				match(T_OPEN_P);
				setState(2564);
				select_stmt();
				setState(2565);
				match(T_CLOSE_P);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2573);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				{
				setState(2570);
				switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
				case 1:
					{
					setState(2569);
					match(T_AS);
					}
					break;
				}
				setState(2572);
				ident();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Merge_conditionContext extends ParserRuleContext {
		public TerminalNode T_WHEN() { return getToken(PlsqlParser.T_WHEN, 0); }
		public TerminalNode T_MATCHED() { return getToken(PlsqlParser.T_MATCHED, 0); }
		public TerminalNode T_THEN() { return getToken(PlsqlParser.T_THEN, 0); }
		public Merge_actionContext merge_action() {
			return getRuleContext(Merge_actionContext.class,0);
		}
		public TerminalNode T_NOT() { return getToken(PlsqlParser.T_NOT, 0); }
		public TerminalNode T_AND() { return getToken(PlsqlParser.T_AND, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_ELSE() { return getToken(PlsqlParser.T_ELSE, 0); }
		public TerminalNode T_IGNORE() { return getToken(PlsqlParser.T_IGNORE, 0); }
		public Merge_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterMerge_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitMerge_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitMerge_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Merge_conditionContext merge_condition() throws RecognitionException {
		Merge_conditionContext _localctx = new Merge_conditionContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_merge_condition);
		int _la;
		try {
			setState(2588);
			switch (_input.LA(1)) {
			case T_WHEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2575);
				match(T_WHEN);
				setState(2577);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2576);
					match(T_NOT);
					}
				}

				setState(2579);
				match(T_MATCHED);
				setState(2582);
				_la = _input.LA(1);
				if (_la==T_AND) {
					{
					setState(2580);
					match(T_AND);
					setState(2581);
					bool_expr(0);
					}
				}

				setState(2584);
				match(T_THEN);
				setState(2585);
				merge_action();
				}
				break;
			case T_ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2586);
				match(T_ELSE);
				setState(2587);
				match(T_IGNORE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Merge_actionContext extends ParserRuleContext {
		public TerminalNode T_INSERT() { return getToken(PlsqlParser.T_INSERT, 0); }
		public TerminalNode T_VALUES() { return getToken(PlsqlParser.T_VALUES, 0); }
		public Insert_stmt_rowContext insert_stmt_row() {
			return getRuleContext(Insert_stmt_rowContext.class,0);
		}
		public Insert_stmt_colsContext insert_stmt_cols() {
			return getRuleContext(Insert_stmt_colsContext.class,0);
		}
		public TerminalNode T_UPDATE() { return getToken(PlsqlParser.T_UPDATE, 0); }
		public TerminalNode T_SET() { return getToken(PlsqlParser.T_SET, 0); }
		public List<Assignment_stmt_itemContext> assignment_stmt_item() {
			return getRuleContexts(Assignment_stmt_itemContext.class);
		}
		public Assignment_stmt_itemContext assignment_stmt_item(int i) {
			return getRuleContext(Assignment_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode T_DELETE() { return getToken(PlsqlParser.T_DELETE, 0); }
		public Merge_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterMerge_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitMerge_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitMerge_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Merge_actionContext merge_action() throws RecognitionException {
		Merge_actionContext _localctx = new Merge_actionContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_merge_action);
		int _la;
		try {
			int _alt;
			setState(2610);
			switch (_input.LA(1)) {
			case T_INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2590);
				match(T_INSERT);
				setState(2592);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(2591);
					insert_stmt_cols();
					}
				}

				setState(2594);
				match(T_VALUES);
				setState(2595);
				insert_stmt_row();
				}
				break;
			case T_UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2596);
				match(T_UPDATE);
				setState(2597);
				match(T_SET);
				setState(2598);
				assignment_stmt_item();
				setState(2603);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2599);
						match(T_COMMA);
						setState(2600);
						assignment_stmt_item();
						}
						}
					}
					setState(2605);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
				}
				setState(2607);
				switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
				case 1:
					{
					setState(2606);
					where_clause();
					}
					break;
				}
				}
				break;
			case T_DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2609);
				match(T_DELETE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode T_DELETE() { return getToken(PlsqlParser.T_DELETE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_FROM() { return getToken(PlsqlParser.T_FROM, 0); }
		public Delete_aliasContext delete_alias() {
			return getRuleContext(Delete_aliasContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode T_ALL() { return getToken(PlsqlParser.T_ALL, 0); }
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_delete_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2612);
			match(T_DELETE);
			setState(2614);
			switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
			case 1:
				{
				setState(2613);
				match(T_FROM);
				}
				break;
			}
			setState(2616);
			table_name();
			setState(2618);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				{
				setState(2617);
				delete_alias();
				}
				break;
			}
			setState(2622);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				{
				setState(2620);
				where_clause();
				}
				break;
			case 2:
				{
				setState(2621);
				match(T_ALL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_aliasContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(PlsqlParser.T_AS, 0); }
		public Delete_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterDelete_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitDelete_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitDelete_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_aliasContext delete_alias() throws RecognitionException {
		Delete_aliasContext _localctx = new Delete_aliasContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_delete_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2624);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("ALL"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"ALL\")");
			setState(2626);
			switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
			case 1:
				{
				setState(2625);
				match(T_AS);
				}
				break;
			}
			setState(2628);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Describe_stmtContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_DESCRIBE() { return getToken(PlsqlParser.T_DESCRIBE, 0); }
		public TerminalNode T_DESC() { return getToken(PlsqlParser.T_DESC, 0); }
		public TerminalNode T_TABLE() { return getToken(PlsqlParser.T_TABLE, 0); }
		public Describe_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describe_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterDescribe_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitDescribe_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitDescribe_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Describe_stmtContext describe_stmt() throws RecognitionException {
		Describe_stmtContext _localctx = new Describe_stmtContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_describe_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2630);
			_la = _input.LA(1);
			if ( !(_la==T_DESC || _la==T_DESCRIBE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(2632);
			switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
			case 1:
				{
				setState(2631);
				match(T_TABLE);
				}
				break;
			}
			setState(2634);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_exprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_NOT() { return getToken(PlsqlParser.T_NOT, 0); }
		public Bool_expr_atomContext bool_expr_atom() {
			return getRuleContext(Bool_expr_atomContext.class,0);
		}
		public Bool_expr_logical_operatorContext bool_expr_logical_operator() {
			return getRuleContext(Bool_expr_logical_operatorContext.class,0);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitBool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		return bool_expr(0);
	}

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
		int _startState = 372;
		enterRecursionRule(_localctx, 372, RULE_bool_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2645);
			switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
			case 1:
				{
				setState(2638);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2637);
					match(T_NOT);
					}
				}

				setState(2640);
				match(T_OPEN_P);
				setState(2641);
				bool_expr(0);
				setState(2642);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(2644);
				bool_expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2653);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,335,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(2647);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(2648);
					bool_expr_logical_operator();
					setState(2649);
					bool_expr(3);
					}
					}
				}
				setState(2655);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,335,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Bool_expr_atomContext extends ParserRuleContext {
		public Bool_expr_unaryContext bool_expr_unary() {
			return getRuleContext(Bool_expr_unaryContext.class,0);
		}
		public Bool_expr_binaryContext bool_expr_binary() {
			return getRuleContext(Bool_expr_binaryContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Bool_expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterBool_expr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitBool_expr_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitBool_expr_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_atomContext bool_expr_atom() throws RecognitionException {
		Bool_expr_atomContext _localctx = new Bool_expr_atomContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_bool_expr_atom);
		try {
			setState(2659);
			switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2656);
				bool_expr_unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2657);
				bool_expr_binary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2658);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_unaryContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IS() { return getToken(PlsqlParser.T_IS, 0); }
		public TerminalNode T_NULL() { return getToken(PlsqlParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(PlsqlParser.T_NOT, 0); }
		public TerminalNode T_BETWEEN() { return getToken(PlsqlParser.T_BETWEEN, 0); }
		public TerminalNode T_AND() { return getToken(PlsqlParser.T_AND, 0); }
		public TerminalNode T_EXISTS() { return getToken(PlsqlParser.T_EXISTS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public Bool_expr_single_inContext bool_expr_single_in() {
			return getRuleContext(Bool_expr_single_inContext.class,0);
		}
		public Bool_expr_multi_inContext bool_expr_multi_in() {
			return getRuleContext(Bool_expr_multi_inContext.class,0);
		}
		public Bool_expr_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterBool_expr_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitBool_expr_unary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitBool_expr_unary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_unaryContext bool_expr_unary() throws RecognitionException {
		Bool_expr_unaryContext _localctx = new Bool_expr_unaryContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_bool_expr_unary);
		int _la;
		try {
			setState(2684);
			switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2661);
				expr(0);
				setState(2662);
				match(T_IS);
				setState(2664);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2663);
					match(T_NOT);
					}
				}

				setState(2666);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2668);
				expr(0);
				setState(2669);
				match(T_BETWEEN);
				setState(2670);
				expr(0);
				setState(2671);
				match(T_AND);
				setState(2672);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2675);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2674);
					match(T_NOT);
					}
				}

				setState(2677);
				match(T_EXISTS);
				setState(2678);
				match(T_OPEN_P);
				setState(2679);
				select_stmt();
				setState(2680);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2682);
				bool_expr_single_in();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2683);
				bool_expr_multi_in();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_single_inContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IN() { return getToken(PlsqlParser.T_IN, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_NOT() { return getToken(PlsqlParser.T_NOT, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public Bool_expr_single_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_single_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterBool_expr_single_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitBool_expr_single_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitBool_expr_single_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_single_inContext bool_expr_single_in() throws RecognitionException {
		Bool_expr_single_inContext _localctx = new Bool_expr_single_inContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_bool_expr_single_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2686);
			expr(0);
			setState(2688);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(2687);
				match(T_NOT);
				}
			}

			setState(2690);
			match(T_IN);
			setState(2691);
			match(T_OPEN_P);
			setState(2701);
			switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
			case 1:
				{
				{
				setState(2692);
				expr(0);
				setState(2697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2693);
					match(T_COMMA);
					setState(2694);
					expr(0);
					}
					}
					setState(2699);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(2700);
				select_stmt();
				}
				break;
			}
			setState(2703);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_multi_inContext extends ParserRuleContext {
		public List<TerminalNode> T_OPEN_P() { return getTokens(PlsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(PlsqlParser.T_OPEN_P, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(PlsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(PlsqlParser.T_CLOSE_P, i);
		}
		public TerminalNode T_IN() { return getToken(PlsqlParser.T_IN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public TerminalNode T_NOT() { return getToken(PlsqlParser.T_NOT, 0); }
		public Bool_expr_multi_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_multi_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterBool_expr_multi_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitBool_expr_multi_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitBool_expr_multi_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_multi_inContext bool_expr_multi_in() throws RecognitionException {
		Bool_expr_multi_inContext _localctx = new Bool_expr_multi_inContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_bool_expr_multi_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2705);
			match(T_OPEN_P);
			setState(2706);
			expr(0);
			setState(2711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2707);
				match(T_COMMA);
				setState(2708);
				expr(0);
				}
				}
				setState(2713);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2714);
			match(T_CLOSE_P);
			setState(2716);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(2715);
				match(T_NOT);
				}
			}

			setState(2718);
			match(T_IN);
			setState(2719);
			match(T_OPEN_P);
			setState(2720);
			select_stmt();
			setState(2721);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_binaryContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Bool_expr_binary_operatorContext bool_expr_binary_operator() {
			return getRuleContext(Bool_expr_binary_operatorContext.class,0);
		}
		public Bool_expr_binaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterBool_expr_binary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitBool_expr_binary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitBool_expr_binary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_binaryContext bool_expr_binary() throws RecognitionException {
		Bool_expr_binaryContext _localctx = new Bool_expr_binaryContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_bool_expr_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2723);
			expr(0);
			setState(2724);
			bool_expr_binary_operator();
			setState(2725);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_logical_operatorContext extends ParserRuleContext {
		public TerminalNode T_AND() { return getToken(PlsqlParser.T_AND, 0); }
		public TerminalNode T_OR() { return getToken(PlsqlParser.T_OR, 0); }
		public Bool_expr_logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterBool_expr_logical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitBool_expr_logical_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitBool_expr_logical_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_logical_operatorContext bool_expr_logical_operator() throws RecognitionException {
		Bool_expr_logical_operatorContext _localctx = new Bool_expr_logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_bool_expr_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2727);
			_la = _input.LA(1);
			if ( !(_la==T_AND || _la==T_OR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_binary_operatorContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(PlsqlParser.T_EQUAL, 0); }
		public TerminalNode T_EQUAL2() { return getToken(PlsqlParser.T_EQUAL2, 0); }
		public TerminalNode T_NOTEQUAL() { return getToken(PlsqlParser.T_NOTEQUAL, 0); }
		public TerminalNode T_NOTEQUAL2() { return getToken(PlsqlParser.T_NOTEQUAL2, 0); }
		public TerminalNode T_LESS() { return getToken(PlsqlParser.T_LESS, 0); }
		public TerminalNode T_LESSEQUAL() { return getToken(PlsqlParser.T_LESSEQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(PlsqlParser.T_GREATER, 0); }
		public TerminalNode T_GREATEREQUAL() { return getToken(PlsqlParser.T_GREATEREQUAL, 0); }
		public TerminalNode T_LIKE() { return getToken(PlsqlParser.T_LIKE, 0); }
		public TerminalNode T_RLIKE() { return getToken(PlsqlParser.T_RLIKE, 0); }
		public TerminalNode T_REGEXP() { return getToken(PlsqlParser.T_REGEXP, 0); }
		public TerminalNode T_NOT() { return getToken(PlsqlParser.T_NOT, 0); }
		public Bool_expr_binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterBool_expr_binary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitBool_expr_binary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitBool_expr_binary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_binary_operatorContext bool_expr_binary_operator() throws RecognitionException {
		Bool_expr_binary_operatorContext _localctx = new Bool_expr_binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_bool_expr_binary_operator);
		int _la;
		try {
			setState(2741);
			switch (_input.LA(1)) {
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2729);
				match(T_EQUAL);
				}
				break;
			case T_EQUAL2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2730);
				match(T_EQUAL2);
				}
				break;
			case T_NOTEQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2731);
				match(T_NOTEQUAL);
				}
				break;
			case T_NOTEQUAL2:
				enterOuterAlt(_localctx, 4);
				{
				setState(2732);
				match(T_NOTEQUAL2);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 5);
				{
				setState(2733);
				match(T_LESS);
				}
				break;
			case T_LESSEQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(2734);
				match(T_LESSEQUAL);
				}
				break;
			case T_GREATER:
				enterOuterAlt(_localctx, 7);
				{
				setState(2735);
				match(T_GREATER);
				}
				break;
			case T_GREATEREQUAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2736);
				match(T_GREATEREQUAL);
				}
				break;
			case T_LIKE:
			case T_NOT:
			case T_REGEXP:
			case T_RLIKE:
				enterOuterAlt(_localctx, 9);
				{
				setState(2738);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2737);
					match(T_NOT);
					}
				}

				setState(2740);
				_la = _input.LA(1);
				if ( !(_la==T_LIKE || _la==T_REGEXP || _la==T_RLIKE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_intervalContext expr_interval() {
			return getRuleContext(Expr_intervalContext.class,0);
		}
		public Expr_concatContext expr_concat() {
			return getRuleContext(Expr_concatContext.class,0);
		}
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_cursor_attributeContext expr_cursor_attribute() {
			return getRuleContext(Expr_cursor_attributeContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public TerminalNode T_MUL() { return getToken(PlsqlParser.T_MUL, 0); }
		public TerminalNode T_DIV() { return getToken(PlsqlParser.T_DIV, 0); }
		public TerminalNode T_ADD() { return getToken(PlsqlParser.T_ADD, 0); }
		public TerminalNode T_SUB() { return getToken(PlsqlParser.T_SUB, 0); }
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 388;
		enterRecursionRule(_localctx, 388, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2760);
			switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
			case 1:
				{
				setState(2744);
				match(T_OPEN_P);
				setState(2745);
				select_stmt();
				setState(2746);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(2748);
				match(T_OPEN_P);
				setState(2749);
				expr(0);
				setState(2750);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				{
				setState(2752);
				expr_interval();
				}
				break;
			case 4:
				{
				setState(2753);
				expr_concat();
				}
				break;
			case 5:
				{
				setState(2754);
				expr_case();
				}
				break;
			case 6:
				{
				setState(2755);
				expr_cursor_attribute();
				}
				break;
			case 7:
				{
				setState(2756);
				expr_agg_window_func();
				}
				break;
			case 8:
				{
				setState(2757);
				expr_spec_func();
				}
				break;
			case 9:
				{
				setState(2758);
				expr_func();
				}
				break;
			case 10:
				{
				setState(2759);
				expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2778);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,349,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2776);
					switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2762);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2763);
						match(T_MUL);
						setState(2764);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2765);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2766);
						match(T_DIV);
						setState(2767);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2768);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2769);
						match(T_ADD);
						setState(2770);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2771);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2772);
						match(T_SUB);
						setState(2773);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2774);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2775);
						interval_item();
						}
						break;
					}
					}
				}
				setState(2780);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,349,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_atomContext extends ParserRuleContext {
		public Date_literalContext date_literal() {
			return getRuleContext(Date_literalContext.class,0);
		}
		public Timestamp_literalContext timestamp_literal() {
			return getRuleContext(Timestamp_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Dec_numberContext dec_number() {
			return getRuleContext(Dec_numberContext.class,0);
		}
		public Int_numberContext int_number() {
			return getRuleContext(Int_numberContext.class,0);
		}
		public Null_constContext null_const() {
			return getRuleContext(Null_constContext.class,0);
		}
		public Expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterExpr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitExpr_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitExpr_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_atomContext expr_atom() throws RecognitionException {
		Expr_atomContext _localctx = new Expr_atomContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_expr_atom);
		try {
			setState(2789);
			switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2781);
				date_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2782);
				timestamp_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2783);
				bool_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2784);
				ident();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2785);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2786);
				dec_number();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2787);
				int_number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2788);
				null_const();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_intervalContext extends ParserRuleContext {
		public TerminalNode T_INTERVAL() { return getToken(PlsqlParser.T_INTERVAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
		}
		public Expr_intervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterExpr_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitExpr_interval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitExpr_interval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_intervalContext expr_interval() throws RecognitionException {
		Expr_intervalContext _localctx = new Expr_intervalContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_expr_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2791);
			match(T_INTERVAL);
			setState(2792);
			expr(0);
			setState(2793);
			interval_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interval_itemContext extends ParserRuleContext {
		public TerminalNode T_DAY() { return getToken(PlsqlParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(PlsqlParser.T_DAYS, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(PlsqlParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(PlsqlParser.T_MICROSECONDS, 0); }
		public TerminalNode T_SECOND() { return getToken(PlsqlParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(PlsqlParser.T_SECONDS, 0); }
		public Interval_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterInterval_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitInterval_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitInterval_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interval_itemContext interval_item() throws RecognitionException {
		Interval_itemContext _localctx = new Interval_itemContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_interval_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2795);
			_la = _input.LA(1);
			if ( !(_la==T_DAY || _la==T_DAYS || _la==T_MICROSECOND || _la==T_MICROSECONDS || _la==T_SECOND || _la==T_SECONDS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_concatContext extends ParserRuleContext {
		public List<Expr_concat_itemContext> expr_concat_item() {
			return getRuleContexts(Expr_concat_itemContext.class);
		}
		public Expr_concat_itemContext expr_concat_item(int i) {
			return getRuleContext(Expr_concat_itemContext.class,i);
		}
		public List<TerminalNode> T_PIPE() { return getTokens(PlsqlParser.T_PIPE); }
		public TerminalNode T_PIPE(int i) {
			return getToken(PlsqlParser.T_PIPE, i);
		}
		public List<TerminalNode> T_CONCAT() { return getTokens(PlsqlParser.T_CONCAT); }
		public TerminalNode T_CONCAT(int i) {
			return getToken(PlsqlParser.T_CONCAT, i);
		}
		public Expr_concatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterExpr_concat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitExpr_concat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitExpr_concat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_concatContext expr_concat() throws RecognitionException {
		Expr_concatContext _localctx = new Expr_concatContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_expr_concat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2797);
			expr_concat_item();
			setState(2798);
			_la = _input.LA(1);
			if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(2799);
			expr_concat_item();
			setState(2804);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,351,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2800);
					_la = _input.LA(1);
					if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(2801);
					expr_concat_item();
					}
					}
				}
				setState(2806);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,351,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_concat_itemContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public Expr_concat_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterExpr_concat_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitExpr_concat_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitExpr_concat_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_concat_itemContext expr_concat_item() throws RecognitionException {
		Expr_concat_itemContext _localctx = new Expr_concat_itemContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_expr_concat_item);
		try {
			setState(2816);
			switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2807);
				match(T_OPEN_P);
				setState(2808);
				expr(0);
				setState(2809);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2811);
				expr_case();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2812);
				expr_agg_window_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2813);
				expr_spec_func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2814);
				expr_func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2815);
				expr_atom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_caseContext extends ParserRuleContext {
		public Expr_case_simpleContext expr_case_simple() {
			return getRuleContext(Expr_case_simpleContext.class,0);
		}
		public Expr_case_searchedContext expr_case_searched() {
			return getRuleContext(Expr_case_searchedContext.class,0);
		}
		public Expr_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterExpr_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitExpr_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitExpr_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_caseContext expr_case() throws RecognitionException {
		Expr_caseContext _localctx = new Expr_caseContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_expr_case);
		try {
			setState(2820);
			switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2818);
				expr_case_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2819);
				expr_case_searched();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_case_simpleContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(PlsqlParser.T_CASE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_END() { return getToken(PlsqlParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(PlsqlParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(PlsqlParser.T_WHEN, i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(PlsqlParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(PlsqlParser.T_THEN, i);
		}
		public TerminalNode T_ELSE() { return getToken(PlsqlParser.T_ELSE, 0); }
		public Expr_case_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterExpr_case_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitExpr_case_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitExpr_case_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_case_simpleContext expr_case_simple() throws RecognitionException {
		Expr_case_simpleContext _localctx = new Expr_case_simpleContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_expr_case_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2822);
			match(T_CASE);
			setState(2823);
			expr(0);
			setState(2829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2824);
				match(T_WHEN);
				setState(2825);
				expr(0);
				setState(2826);
				match(T_THEN);
				setState(2827);
				expr(0);
				}
				}
				setState(2831);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2835);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2833);
				match(T_ELSE);
				setState(2834);
				expr(0);
				}
			}

			setState(2837);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_case_searchedContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(PlsqlParser.T_CASE, 0); }
		public TerminalNode T_END() { return getToken(PlsqlParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(PlsqlParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(PlsqlParser.T_WHEN, i);
		}
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(PlsqlParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(PlsqlParser.T_THEN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(PlsqlParser.T_ELSE, 0); }
		public Expr_case_searchedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_searched; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterExpr_case_searched(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitExpr_case_searched(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitExpr_case_searched(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_case_searchedContext expr_case_searched() throws RecognitionException {
		Expr_case_searchedContext _localctx = new Expr_case_searchedContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_expr_case_searched);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2839);
			match(T_CASE);
			setState(2845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2840);
				match(T_WHEN);
				setState(2841);
				bool_expr(0);
				setState(2842);
				match(T_THEN);
				setState(2843);
				expr(0);
				}
				}
				setState(2847);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2851);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2849);
				match(T_ELSE);
				setState(2850);
				expr(0);
				}
			}

			setState(2853);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_cursor_attributeContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ISOPEN() { return getToken(PlsqlParser.T_ISOPEN, 0); }
		public TerminalNode T_FOUND() { return getToken(PlsqlParser.T_FOUND, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(PlsqlParser.T_NOTFOUND, 0); }
		public Expr_cursor_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cursor_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterExpr_cursor_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitExpr_cursor_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitExpr_cursor_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_cursor_attributeContext expr_cursor_attribute() throws RecognitionException {
		Expr_cursor_attributeContext _localctx = new Expr_cursor_attributeContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_expr_cursor_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2855);
			ident();
			setState(2856);
			match(T__2);
			setState(2857);
			_la = _input.LA(1);
			if ( !(_la==T_FOUND || _la==T_ISOPEN || _la==T_NOTFOUND) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_agg_window_funcContext extends ParserRuleContext {
		public TerminalNode T_AVG() { return getToken(PlsqlParser.T_AVG, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public Expr_func_all_distinctContext expr_func_all_distinct() {
			return getRuleContext(Expr_func_all_distinctContext.class,0);
		}
		public Expr_func_over_clauseContext expr_func_over_clause() {
			return getRuleContext(Expr_func_over_clauseContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(PlsqlParser.T_COUNT, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(PlsqlParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(PlsqlParser.T_CUME_DIST, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(PlsqlParser.T_DENSE_RANK, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(PlsqlParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_LAG() { return getToken(PlsqlParser.T_LAG, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public TerminalNode T_LAST_VALUE() { return getToken(PlsqlParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(PlsqlParser.T_LEAD, 0); }
		public TerminalNode T_MAX() { return getToken(PlsqlParser.T_MAX, 0); }
		public TerminalNode T_MIN() { return getToken(PlsqlParser.T_MIN, 0); }
		public TerminalNode T_RANK() { return getToken(PlsqlParser.T_RANK, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(PlsqlParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_STDEV() { return getToken(PlsqlParser.T_STDEV, 0); }
		public TerminalNode T_SUM() { return getToken(PlsqlParser.T_SUM, 0); }
		public TerminalNode T_VAR() { return getToken(PlsqlParser.T_VAR, 0); }
		public TerminalNode T_VARIANCE() { return getToken(PlsqlParser.T_VARIANCE, 0); }
		public Expr_agg_window_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_agg_window_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterExpr_agg_window_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitExpr_agg_window_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitExpr_agg_window_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_agg_window_funcContext expr_agg_window_func() throws RecognitionException {
		Expr_agg_window_funcContext _localctx = new Expr_agg_window_funcContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_expr_agg_window_func);
		int _la;
		try {
			setState(3011);
			switch (_input.LA(1)) {
			case T_AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(2859);
				match(T_AVG);
				setState(2860);
				match(T_OPEN_P);
				setState(2862);
				switch ( getInterpreter().adaptivePredict(_input,358,_ctx) ) {
				case 1:
					{
					setState(2861);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2864);
				expr(0);
				setState(2865);
				match(T_CLOSE_P);
				setState(2867);
				switch ( getInterpreter().adaptivePredict(_input,359,_ctx) ) {
				case 1:
					{
					setState(2866);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2869);
				match(T_COUNT);
				setState(2870);
				match(T_OPEN_P);
				setState(2876);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_CORRECT:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					{
					setState(2872);
					switch ( getInterpreter().adaptivePredict(_input,360,_ctx) ) {
					case 1:
						{
						setState(2871);
						expr_func_all_distinct();
						}
						break;
					}
					setState(2874);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2875);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2878);
				match(T_CLOSE_P);
				setState(2880);
				switch ( getInterpreter().adaptivePredict(_input,362,_ctx) ) {
				case 1:
					{
					setState(2879);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT_BIG:
				enterOuterAlt(_localctx, 3);
				{
				setState(2882);
				match(T_COUNT_BIG);
				setState(2883);
				match(T_OPEN_P);
				setState(2889);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_CORRECT:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					{
					setState(2885);
					switch ( getInterpreter().adaptivePredict(_input,363,_ctx) ) {
					case 1:
						{
						setState(2884);
						expr_func_all_distinct();
						}
						break;
					}
					setState(2887);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2888);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2891);
				match(T_CLOSE_P);
				setState(2893);
				switch ( getInterpreter().adaptivePredict(_input,365,_ctx) ) {
				case 1:
					{
					setState(2892);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_CUME_DIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(2895);
				match(T_CUME_DIST);
				setState(2896);
				match(T_OPEN_P);
				setState(2897);
				match(T_CLOSE_P);
				setState(2898);
				expr_func_over_clause();
				}
				break;
			case T_DENSE_RANK:
				enterOuterAlt(_localctx, 5);
				{
				setState(2899);
				match(T_DENSE_RANK);
				setState(2900);
				match(T_OPEN_P);
				setState(2901);
				match(T_CLOSE_P);
				setState(2902);
				expr_func_over_clause();
				}
				break;
			case T_FIRST_VALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2903);
				match(T_FIRST_VALUE);
				setState(2904);
				match(T_OPEN_P);
				setState(2905);
				expr(0);
				setState(2906);
				match(T_CLOSE_P);
				setState(2907);
				expr_func_over_clause();
				}
				break;
			case T_LAG:
				enterOuterAlt(_localctx, 7);
				{
				setState(2909);
				match(T_LAG);
				setState(2910);
				match(T_OPEN_P);
				setState(2911);
				expr(0);
				setState(2918);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2912);
					match(T_COMMA);
					setState(2913);
					expr(0);
					setState(2916);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2914);
						match(T_COMMA);
						setState(2915);
						expr(0);
						}
					}

					}
				}

				setState(2920);
				match(T_CLOSE_P);
				setState(2921);
				expr_func_over_clause();
				}
				break;
			case T_LAST_VALUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2923);
				match(T_LAST_VALUE);
				setState(2924);
				match(T_OPEN_P);
				setState(2925);
				expr(0);
				setState(2926);
				match(T_CLOSE_P);
				setState(2927);
				expr_func_over_clause();
				}
				break;
			case T_LEAD:
				enterOuterAlt(_localctx, 9);
				{
				setState(2929);
				match(T_LEAD);
				setState(2930);
				match(T_OPEN_P);
				setState(2931);
				expr(0);
				setState(2938);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2932);
					match(T_COMMA);
					setState(2933);
					expr(0);
					setState(2936);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2934);
						match(T_COMMA);
						setState(2935);
						expr(0);
						}
					}

					}
				}

				setState(2940);
				match(T_CLOSE_P);
				setState(2941);
				expr_func_over_clause();
				}
				break;
			case T_MAX:
				enterOuterAlt(_localctx, 10);
				{
				setState(2943);
				match(T_MAX);
				setState(2944);
				match(T_OPEN_P);
				setState(2946);
				switch ( getInterpreter().adaptivePredict(_input,370,_ctx) ) {
				case 1:
					{
					setState(2945);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2948);
				expr(0);
				setState(2949);
				match(T_CLOSE_P);
				setState(2951);
				switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
				case 1:
					{
					setState(2950);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_MIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(2953);
				match(T_MIN);
				setState(2954);
				match(T_OPEN_P);
				setState(2956);
				switch ( getInterpreter().adaptivePredict(_input,372,_ctx) ) {
				case 1:
					{
					setState(2955);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2958);
				expr(0);
				setState(2959);
				match(T_CLOSE_P);
				setState(2961);
				switch ( getInterpreter().adaptivePredict(_input,373,_ctx) ) {
				case 1:
					{
					setState(2960);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_RANK:
				enterOuterAlt(_localctx, 12);
				{
				setState(2963);
				match(T_RANK);
				setState(2964);
				match(T_OPEN_P);
				setState(2965);
				match(T_CLOSE_P);
				setState(2966);
				expr_func_over_clause();
				}
				break;
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 13);
				{
				setState(2967);
				match(T_ROW_NUMBER);
				setState(2968);
				match(T_OPEN_P);
				setState(2969);
				match(T_CLOSE_P);
				setState(2970);
				expr_func_over_clause();
				}
				break;
			case T_STDEV:
				enterOuterAlt(_localctx, 14);
				{
				setState(2971);
				match(T_STDEV);
				setState(2972);
				match(T_OPEN_P);
				setState(2974);
				switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
				case 1:
					{
					setState(2973);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2976);
				expr(0);
				setState(2977);
				match(T_CLOSE_P);
				setState(2979);
				switch ( getInterpreter().adaptivePredict(_input,375,_ctx) ) {
				case 1:
					{
					setState(2978);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_SUM:
				enterOuterAlt(_localctx, 15);
				{
				setState(2981);
				match(T_SUM);
				setState(2982);
				match(T_OPEN_P);
				setState(2984);
				switch ( getInterpreter().adaptivePredict(_input,376,_ctx) ) {
				case 1:
					{
					setState(2983);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2986);
				expr(0);
				setState(2987);
				match(T_CLOSE_P);
				setState(2989);
				switch ( getInterpreter().adaptivePredict(_input,377,_ctx) ) {
				case 1:
					{
					setState(2988);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(2991);
				match(T_VAR);
				setState(2992);
				match(T_OPEN_P);
				setState(2994);
				switch ( getInterpreter().adaptivePredict(_input,378,_ctx) ) {
				case 1:
					{
					setState(2993);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2996);
				expr(0);
				setState(2997);
				match(T_CLOSE_P);
				setState(2999);
				switch ( getInterpreter().adaptivePredict(_input,379,_ctx) ) {
				case 1:
					{
					setState(2998);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VARIANCE:
				enterOuterAlt(_localctx, 17);
				{
				setState(3001);
				match(T_VARIANCE);
				setState(3002);
				match(T_OPEN_P);
				setState(3004);
				switch ( getInterpreter().adaptivePredict(_input,380,_ctx) ) {
				case 1:
					{
					setState(3003);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3006);
				expr(0);
				setState(3007);
				match(T_CLOSE_P);
				setState(3009);
				switch ( getInterpreter().adaptivePredict(_input,381,_ctx) ) {
				case 1:
					{
					setState(3008);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_all_distinctContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(PlsqlParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(PlsqlParser.T_DISTINCT, 0); }
		public Expr_func_all_distinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_all_distinct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterExpr_func_all_distinct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitExpr_func_all_distinct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitExpr_func_all_distinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_all_distinctContext expr_func_all_distinct() throws RecognitionException {
		Expr_func_all_distinctContext _localctx = new Expr_func_all_distinctContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_expr_func_all_distinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3013);
			_la = _input.LA(1);
			if ( !(_la==T_ALL || _la==T_DISTINCT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_over_clauseContext extends ParserRuleContext {
		public TerminalNode T_OVER() { return getToken(PlsqlParser.T_OVER, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public Expr_func_partition_by_clauseContext expr_func_partition_by_clause() {
			return getRuleContext(Expr_func_partition_by_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Expr_func_over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_over_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterExpr_func_over_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitExpr_func_over_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitExpr_func_over_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_over_clauseContext expr_func_over_clause() throws RecognitionException {
		Expr_func_over_clauseContext _localctx = new Expr_func_over_clauseContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_expr_func_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3015);
			match(T_OVER);
			setState(3016);
			match(T_OPEN_P);
			setState(3018);
			_la = _input.LA(1);
			if (_la==T_PARTITION) {
				{
				setState(3017);
				expr_func_partition_by_clause();
				}
			}

			setState(3021);
			_la = _input.LA(1);
			if (_la==T_ORDER) {
				{
				setState(3020);
				order_by_clause();
				}
			}

			setState(3023);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_partition_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_PARTITION() { return getToken(PlsqlParser.T_PARTITION, 0); }
		public TerminalNode T_BY() { return getToken(PlsqlParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public Expr_func_partition_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_partition_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterExpr_func_partition_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitExpr_func_partition_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitExpr_func_partition_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_partition_by_clauseContext expr_func_partition_by_clause() throws RecognitionException {
		Expr_func_partition_by_clauseContext _localctx = new Expr_func_partition_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_expr_func_partition_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3025);
			match(T_PARTITION);
			setState(3026);
			match(T_BY);
			setState(3027);
			expr(0);
			setState(3032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(3028);
				match(T_COMMA);
				setState(3029);
				expr(0);
				}
				}
				setState(3034);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_spec_funcContext extends ParserRuleContext {
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(PlsqlParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_CAST() { return getToken(PlsqlParser.T_CAST, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_AS() { return getToken(PlsqlParser.T_AS, 0); }
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(PlsqlParser.T_COUNT, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(PlsqlParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT() { return getToken(PlsqlParser.T_CURRENT, 0); }
		public TerminalNode T_DATE() { return getToken(PlsqlParser.T_DATE, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(PlsqlParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(PlsqlParser.T_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(PlsqlParser.T_CURRENT_USER, 0); }
		public TerminalNode T_USER() { return getToken(PlsqlParser.T_USER, 0); }
		public TerminalNode T_MAX_PART_STRING() { return getToken(PlsqlParser.T_MAX_PART_STRING, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public List<TerminalNode> T_EQUAL() { return getTokens(PlsqlParser.T_EQUAL); }
		public TerminalNode T_EQUAL(int i) {
			return getToken(PlsqlParser.T_EQUAL, i);
		}
		public TerminalNode T_MIN_PART_STRING() { return getToken(PlsqlParser.T_MIN_PART_STRING, 0); }
		public TerminalNode T_MAX_PART_INT() { return getToken(PlsqlParser.T_MAX_PART_INT, 0); }
		public TerminalNode T_MIN_PART_INT() { return getToken(PlsqlParser.T_MIN_PART_INT, 0); }
		public TerminalNode T_MAX_PART_DATE() { return getToken(PlsqlParser.T_MAX_PART_DATE, 0); }
		public TerminalNode T_MIN_PART_DATE() { return getToken(PlsqlParser.T_MIN_PART_DATE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(PlsqlParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(PlsqlParser.T_PART_LOC, 0); }
		public TerminalNode T_TRIM() { return getToken(PlsqlParser.T_TRIM, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(PlsqlParser.T_SUBSTRING, 0); }
		public TerminalNode T_FROM() { return getToken(PlsqlParser.T_FROM, 0); }
		public TerminalNode T_FOR() { return getToken(PlsqlParser.T_FOR, 0); }
		public TerminalNode T_SYSDATE() { return getToken(PlsqlParser.T_SYSDATE, 0); }
		public Expr_spec_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_spec_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterExpr_spec_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitExpr_spec_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitExpr_spec_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_spec_funcContext expr_spec_func() throws RecognitionException {
		Expr_spec_funcContext _localctx = new Expr_spec_funcContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_expr_spec_func);
		int _la;
		try {
			int _alt;
			setState(3235);
			switch ( getInterpreter().adaptivePredict(_input,406,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3035);
				match(T_ACTIVITY_COUNT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3036);
				match(T_CAST);
				setState(3037);
				match(T_OPEN_P);
				setState(3038);
				expr(0);
				setState(3039);
				match(T_AS);
				setState(3040);
				dtype();
				setState(3042);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(3041);
					dtype_len();
					}
				}

				setState(3044);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3046);
				match(T_COUNT);
				setState(3047);
				match(T_OPEN_P);
				setState(3050);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_CORRECT:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					setState(3048);
					expr(0);
					}
					break;
				case T_MUL:
					{
					setState(3049);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3052);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3053);
				match(T_CURRENT_DATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3054);
				match(T_CURRENT);
				setState(3055);
				match(T_DATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3059);
				switch (_input.LA(1)) {
				case T_CURRENT_TIMESTAMP:
					{
					setState(3056);
					match(T_CURRENT_TIMESTAMP);
					}
					break;
				case T_CURRENT:
					{
					setState(3057);
					match(T_CURRENT);
					setState(3058);
					match(T_TIMESTAMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3065);
				switch ( getInterpreter().adaptivePredict(_input,389,_ctx) ) {
				case 1:
					{
					setState(3061);
					match(T_OPEN_P);
					setState(3062);
					expr(0);
					setState(3063);
					match(T_CLOSE_P);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3067);
				match(T_CURRENT_USER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3068);
				match(T_CURRENT);
				setState(3069);
				match(T_USER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(3070);
				match(T_MAX_PART_STRING);
				setState(3071);
				match(T_OPEN_P);
				setState(3072);
				expr(0);
				setState(3085);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3073);
					match(T_COMMA);
					setState(3074);
					expr(0);
					setState(3082);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3075);
						match(T_COMMA);
						setState(3076);
						expr(0);
						setState(3077);
						match(T_EQUAL);
						setState(3078);
						expr(0);
						}
						}
						setState(3084);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3087);
				match(T_CLOSE_P);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(3089);
				match(T_MIN_PART_STRING);
				setState(3090);
				match(T_OPEN_P);
				setState(3091);
				expr(0);
				setState(3104);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3092);
					match(T_COMMA);
					setState(3093);
					expr(0);
					setState(3101);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3094);
						match(T_COMMA);
						setState(3095);
						expr(0);
						setState(3096);
						match(T_EQUAL);
						setState(3097);
						expr(0);
						}
						}
						setState(3103);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3106);
				match(T_CLOSE_P);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(3108);
				match(T_MAX_PART_INT);
				setState(3109);
				match(T_OPEN_P);
				setState(3110);
				expr(0);
				setState(3123);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3111);
					match(T_COMMA);
					setState(3112);
					expr(0);
					setState(3120);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3113);
						match(T_COMMA);
						setState(3114);
						expr(0);
						setState(3115);
						match(T_EQUAL);
						setState(3116);
						expr(0);
						}
						}
						setState(3122);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3125);
				match(T_CLOSE_P);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(3127);
				match(T_MIN_PART_INT);
				setState(3128);
				match(T_OPEN_P);
				setState(3129);
				expr(0);
				setState(3142);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3130);
					match(T_COMMA);
					setState(3131);
					expr(0);
					setState(3139);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3132);
						match(T_COMMA);
						setState(3133);
						expr(0);
						setState(3134);
						match(T_EQUAL);
						setState(3135);
						expr(0);
						}
						}
						setState(3141);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3144);
				match(T_CLOSE_P);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(3146);
				match(T_MAX_PART_DATE);
				setState(3147);
				match(T_OPEN_P);
				setState(3148);
				expr(0);
				setState(3161);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3149);
					match(T_COMMA);
					setState(3150);
					expr(0);
					setState(3158);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3151);
						match(T_COMMA);
						setState(3152);
						expr(0);
						setState(3153);
						match(T_EQUAL);
						setState(3154);
						expr(0);
						}
						}
						setState(3160);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3163);
				match(T_CLOSE_P);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(3165);
				match(T_MIN_PART_DATE);
				setState(3166);
				match(T_OPEN_P);
				setState(3167);
				expr(0);
				setState(3180);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3168);
					match(T_COMMA);
					setState(3169);
					expr(0);
					setState(3177);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3170);
						match(T_COMMA);
						setState(3171);
						expr(0);
						setState(3172);
						match(T_EQUAL);
						setState(3173);
						expr(0);
						}
						}
						setState(3179);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3182);
				match(T_CLOSE_P);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(3184);
				match(T_PART_COUNT);
				setState(3185);
				match(T_OPEN_P);
				setState(3186);
				expr(0);
				setState(3194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(3187);
					match(T_COMMA);
					setState(3188);
					expr(0);
					setState(3189);
					match(T_EQUAL);
					setState(3190);
					expr(0);
					}
					}
					setState(3196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3197);
				match(T_CLOSE_P);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(3199);
				match(T_PART_LOC);
				setState(3200);
				match(T_OPEN_P);
				setState(3201);
				expr(0);
				setState(3207);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3202);
						match(T_COMMA);
						setState(3203);
						expr(0);
						setState(3204);
						match(T_EQUAL);
						setState(3205);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3209);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,403,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(3213);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3211);
					match(T_COMMA);
					setState(3212);
					expr(0);
					}
				}

				setState(3215);
				match(T_CLOSE_P);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(3217);
				match(T_TRIM);
				setState(3218);
				match(T_OPEN_P);
				setState(3219);
				expr(0);
				setState(3220);
				match(T_CLOSE_P);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(3222);
				match(T_SUBSTRING);
				setState(3223);
				match(T_OPEN_P);
				setState(3224);
				expr(0);
				setState(3225);
				match(T_FROM);
				setState(3226);
				expr(0);
				setState(3229);
				_la = _input.LA(1);
				if (_la==T_FOR) {
					{
					setState(3227);
					match(T_FOR);
					setState(3228);
					expr(0);
					}
				}

				setState(3231);
				match(T_CLOSE_P);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(3233);
				match(T_SYSDATE);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(3234);
				match(T_USER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_funcContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public Expr_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterExpr_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitExpr_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitExpr_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_funcContext expr_func() throws RecognitionException {
		Expr_funcContext _localctx = new Expr_funcContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_expr_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3237);
			ident();
			setState(3238);
			match(T_OPEN_P);
			setState(3240);
			switch ( getInterpreter().adaptivePredict(_input,407,_ctx) ) {
			case 1:
				{
				setState(3239);
				expr_func_params();
				}
				break;
			}
			setState(3242);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_paramsContext extends ParserRuleContext {
		public List<Func_paramContext> func_param() {
			return getRuleContexts(Func_paramContext.class);
		}
		public Func_paramContext func_param(int i) {
			return getRuleContext(Func_paramContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PlsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PlsqlParser.T_COMMA, i);
		}
		public Expr_func_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterExpr_func_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitExpr_func_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitExpr_func_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_paramsContext expr_func_params() throws RecognitionException {
		Expr_func_paramsContext _localctx = new Expr_func_paramsContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_expr_func_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3244);
			func_param();
			setState(3249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,408,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3245);
					match(T_COMMA);
					setState(3246);
					func_param();
					}
					}
				}
				setState(3251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,408,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_paramContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(PlsqlParser.T_EQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(PlsqlParser.T_GREATER, 0); }
		public Func_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterFunc_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitFunc_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitFunc_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_paramContext func_param() throws RecognitionException {
		Func_paramContext _localctx = new Func_paramContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_func_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3252);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\")");
			setState(3258);
			switch ( getInterpreter().adaptivePredict(_input,410,_ctx) ) {
			case 1:
				{
				setState(3253);
				ident();
				setState(3254);
				match(T_EQUAL);
				setState(3256);
				_la = _input.LA(1);
				if (_la==T_GREATER) {
					{
					setState(3255);
					match(T_GREATER);
					}
				}

				}
				break;
			}
			setState(3260);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_selectContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterExpr_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitExpr_select(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitExpr_select(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_selectContext expr_select() throws RecognitionException {
		Expr_selectContext _localctx = new Expr_selectContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_expr_select);
		try {
			setState(3264);
			switch ( getInterpreter().adaptivePredict(_input,411,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3262);
				select_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3263);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_fileContext extends ParserRuleContext {
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterExpr_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitExpr_file(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitExpr_file(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_fileContext expr_file() throws RecognitionException {
		Expr_fileContext _localctx = new Expr_fileContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_expr_file);
		try {
			setState(3268);
			switch ( getInterpreter().adaptivePredict(_input,412,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3266);
				file_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3267);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HiveContext extends ParserRuleContext {
		public TerminalNode T_HIVE() { return getToken(PlsqlParser.T_HIVE, 0); }
		public List<Hive_itemContext> hive_item() {
			return getRuleContexts(Hive_itemContext.class);
		}
		public Hive_itemContext hive_item(int i) {
			return getRuleContext(Hive_itemContext.class,i);
		}
		public HiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterHive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitHive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitHive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HiveContext hive() throws RecognitionException {
		HiveContext _localctx = new HiveContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_hive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3270);
			match(T_HIVE);
			setState(3274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,413,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3271);
					hive_item();
					}
					}
				}
				setState(3276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,413,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hive_itemContext extends ParserRuleContext {
		public TerminalNode T_SUB() { return getToken(PlsqlParser.T_SUB, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode L_ID() { return getToken(PlsqlParser.L_ID, 0); }
		public TerminalNode T_EQUAL() { return getToken(PlsqlParser.T_EQUAL, 0); }
		public Hive_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hive_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterHive_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitHive_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitHive_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hive_itemContext hive_item() throws RecognitionException {
		Hive_itemContext _localctx = new Hive_itemContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_hive_item);
		try {
			setState(3289);
			switch ( getInterpreter().adaptivePredict(_input,414,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3277);
				match(T_SUB);
				setState(3278);
				ident();
				setState(3279);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3281);
				match(T_SUB);
				setState(3282);
				ident();
				setState(3283);
				match(L_ID);
				setState(3284);
				match(T_EQUAL);
				setState(3285);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3287);
				match(T_SUB);
				setState(3288);
				ident();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HostContext extends ParserRuleContext {
		public Host_cmdContext host_cmd() {
			return getRuleContext(Host_cmdContext.class,0);
		}
		public Host_stmtContext host_stmt() {
			return getRuleContext(Host_stmtContext.class,0);
		}
		public HostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterHost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitHost(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitHost(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostContext host() throws RecognitionException {
		HostContext _localctx = new HostContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_host);
		try {
			setState(3296);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(3291);
				match(T__4);
				setState(3292);
				host_cmd();
				setState(3293);
				match(T_SEMICOLON);
				}
				break;
			case T_HOST:
				enterOuterAlt(_localctx, 2);
				{
				setState(3295);
				host_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Host_cmdContext extends ParserRuleContext {
		public Host_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterHost_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitHost_cmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitHost_cmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Host_cmdContext host_cmd() throws RecognitionException {
		Host_cmdContext _localctx = new Host_cmdContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_host_cmd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,416,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(3298);
					matchWildcard();
					}
					}
				}
				setState(3303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,416,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Host_stmtContext extends ParserRuleContext {
		public TerminalNode T_HOST() { return getToken(PlsqlParser.T_HOST, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Host_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterHost_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitHost_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitHost_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Host_stmtContext host_stmt() throws RecognitionException {
		Host_stmtContext _localctx = new Host_stmtContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_host_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3304);
			match(T_HOST);
			setState(3305);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_nameContext extends ParserRuleContext {
		public TerminalNode L_FILE() { return getToken(PlsqlParser.L_FILE, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public File_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterFile_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitFile_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitFile_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_nameContext file_name() throws RecognitionException {
		File_nameContext _localctx = new File_nameContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_file_name);
		try {
			int _alt;
			setState(3321);
			switch (_input.LA(1)) {
			case L_FILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3307);
				match(L_FILE);
				}
				break;
			case T__3:
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_CORRECT:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_DIV:
			case L_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(3311);
				switch (_input.LA(1)) {
				case T_DIV:
					{
					setState(3308);
					match(T_DIV);
					}
					break;
				case T__3:
					{
					setState(3309);
					match(T__3);
					setState(3310);
					match(T_DIV);
					}
					break;
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_CORRECT:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case L_ID:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3313);
				ident();
				setState(3318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,418,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3314);
						match(T_DIV);
						setState(3315);
						ident();
						}
						}
					}
					setState(3320);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,418,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_literalContext extends ParserRuleContext {
		public TerminalNode T_DATE() { return getToken(PlsqlParser.T_DATE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Date_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterDate_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitDate_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitDate_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_literalContext date_literal() throws RecognitionException {
		Date_literalContext _localctx = new Date_literalContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3323);
			match(T_DATE);
			setState(3324);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Timestamp_literalContext extends ParserRuleContext {
		public TerminalNode T_TIMESTAMP() { return getToken(PlsqlParser.T_TIMESTAMP, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Timestamp_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterTimestamp_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitTimestamp_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitTimestamp_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timestamp_literalContext timestamp_literal() throws RecognitionException {
		Timestamp_literalContext _localctx = new Timestamp_literalContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3326);
			match(T_TIMESTAMP);
			setState(3327);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentContext extends ParserRuleContext {
		public List<TerminalNode> L_ID() { return getTokens(PlsqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(PlsqlParser.L_ID, i);
		}
		public List<Non_reserved_wordsContext> non_reserved_words() {
			return getRuleContexts(Non_reserved_wordsContext.class);
		}
		public Non_reserved_wordsContext non_reserved_words(int i) {
			return getRuleContext(Non_reserved_wordsContext.class,i);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_ident);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3331);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(3329);
				match(L_ID);
				}
				break;
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_CORRECT:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
				{
				setState(3330);
				non_reserved_words();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(3340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,422,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3333);
					match(T__3);
					setState(3336);
					switch (_input.LA(1)) {
					case L_ID:
						{
						setState(3334);
						match(L_ID);
						}
						break;
					case T_ACTION:
					case T_ADD2:
					case T_ALL:
					case T_ALLOCATE:
					case T_ALTER:
					case T_AND:
					case T_ANSI_NULLS:
					case T_ANSI_PADDING:
					case T_AS:
					case T_ASC:
					case T_ASSOCIATE:
					case T_AT:
					case T_AUTO_INCREMENT:
					case T_AVG:
					case T_BATCHSIZE:
					case T_BEGIN:
					case T_BETWEEN:
					case T_BIGINT:
					case T_BINARY_DOUBLE:
					case T_BINARY_FLOAT:
					case T_BIT:
					case T_BODY:
					case T_BREAK:
					case T_BY:
					case T_BYTE:
					case T_CALL:
					case T_CALLER:
					case T_CASCADE:
					case T_CASE:
					case T_CASESPECIFIC:
					case T_CAST:
					case T_CHAR:
					case T_CHARACTER:
					case T_CHARSET:
					case T_CLIENT:
					case T_CLOSE:
					case T_CLUSTERED:
					case T_CMP:
					case T_COLLECT:
					case T_COLLECTION:
					case T_COLUMN:
					case T_COMMENT:
					case T_CONSTANT:
					case T_COMMIT:
					case T_COMPRESS:
					case T_CONCAT:
					case T_CONDITION:
					case T_CONSTRAINT:
					case T_CONTINUE:
					case T_COPY:
					case T_COUNT:
					case T_COUNT_BIG:
					case T_CREATE:
					case T_CREATION:
					case T_CREATOR:
					case T_CS:
					case T_CURRENT:
					case T_CURRENT_SCHEMA:
					case T_CURSOR:
					case T_DATABASE:
					case T_DATA:
					case T_DATE:
					case T_DATETIME:
					case T_DAY:
					case T_DAYS:
					case T_DEC:
					case T_DECIMAL:
					case T_DECLARE:
					case T_DEFAULT:
					case T_DEFERRED:
					case T_DEFINED:
					case T_DEFINER:
					case T_DEFINITION:
					case T_DELETE:
					case T_DELIMITED:
					case T_DELIMITER:
					case T_DESC:
					case T_DESCRIBE:
					case T_DIAGNOSTICS:
					case T_DIR:
					case T_DIRECTORY:
					case T_DISTINCT:
					case T_DISTRIBUTE:
					case T_DO:
					case T_DOUBLE:
					case T_DROP:
					case T_DYNAMIC:
					case T_ENABLE:
					case T_ENGINE:
					case T_ESCAPED:
					case T_EXCEPT:
					case T_EXEC:
					case T_EXECUTE:
					case T_EXCEPTION:
					case T_EXCLUSIVE:
					case T_EXISTS:
					case T_EXIT:
					case T_FALLBACK:
					case T_FALSE:
					case T_FETCH:
					case T_FIELDS:
					case T_FILE:
					case T_FILES:
					case T_FLOAT:
					case T_FOR:
					case T_FOREIGN:
					case T_FORMAT:
					case T_FOUND:
					case T_FROM:
					case T_FULL:
					case T_FUNCTION:
					case T_GET:
					case T_GLOBAL:
					case T_GO:
					case T_GRANT:
					case T_GROUP:
					case T_HANDLER:
					case T_HASH:
					case T_HAVING:
					case T_HDFS:
					case T_HIVE:
					case T_HOST:
					case T_IDENTITY:
					case T_IF:
					case T_IGNORE:
					case T_IMMEDIATE:
					case T_IN:
					case T_INCLUDE:
					case T_INDEX:
					case T_INITRANS:
					case T_INNER:
					case T_INOUT:
					case T_INSERT:
					case T_INT:
					case T_INT2:
					case T_INT4:
					case T_INT8:
					case T_INTEGER:
					case T_INTERSECT:
					case T_INTERVAL:
					case T_INTO:
					case T_INVOKER:
					case T_IS:
					case T_ISOPEN:
					case T_ITEMS:
					case T_JOIN:
					case T_KEEP:
					case T_KEY:
					case T_KEYS:
					case T_LANGUAGE:
					case T_LEAVE:
					case T_LEFT:
					case T_LIKE:
					case T_LIMIT:
					case T_LINES:
					case T_LOCAL:
					case T_LOCATION:
					case T_LOCATOR:
					case T_LOCATORS:
					case T_LOCKS:
					case T_LOG:
					case T_LOGGED:
					case T_LOGGING:
					case T_LOOP:
					case T_MAP:
					case T_MATCHED:
					case T_MAX:
					case T_MAXTRANS:
					case T_MERGE:
					case T_MESSAGE_TEXT:
					case T_MICROSECOND:
					case T_MICROSECONDS:
					case T_MIN:
					case T_MULTISET:
					case T_NCHAR:
					case T_NEW:
					case T_NVARCHAR:
					case T_NO:
					case T_NOCOUNT:
					case T_NOCOMPRESS:
					case T_NOLOGGING:
					case T_NONE:
					case T_NOT:
					case T_NOTFOUND:
					case T_NUMERIC:
					case T_NUMBER:
					case T_OBJECT:
					case T_OFF:
					case T_ON:
					case T_ONLY:
					case T_OPEN:
					case T_OR:
					case T_ORDER:
					case T_OUT:
					case T_OUTER:
					case T_OVER:
					case T_OVERWRITE:
					case T_OWNER:
					case T_PACKAGE:
					case T_PARTITION:
					case T_PCTFREE:
					case T_PCTUSED:
					case T_PRECISION:
					case T_PRESERVE:
					case T_PRIMARY:
					case T_PRINT:
					case T_PROC:
					case T_PROCEDURE:
					case T_QUALIFY:
					case T_QUERY_BAND:
					case T_QUIT:
					case T_QUOTED_IDENTIFIER:
					case T_RAISE:
					case T_REAL:
					case T_REFERENCES:
					case T_REGEXP:
					case T_REPLACE:
					case T_RESIGNAL:
					case T_RESTRICT:
					case T_RESULT:
					case T_RESULT_SET_LOCATOR:
					case T_RETURN:
					case T_RETURNS:
					case T_REVERSE:
					case T_RIGHT:
					case T_RLIKE:
					case T_ROLE:
					case T_ROLLBACK:
					case T_ROW:
					case T_ROWS:
					case T_ROW_COUNT:
					case T_RR:
					case T_RS:
					case T_PWD:
					case T_TRIM:
					case T_SCHEMA:
					case T_SECOND:
					case T_SECONDS:
					case T_SECURITY:
					case T_SEGMENT:
					case T_SEL:
					case T_SELECT:
					case T_SET:
					case T_SESSION:
					case T_SESSIONS:
					case T_SETS:
					case T_SHARE:
					case T_SIGNAL:
					case T_SIMPLE_DOUBLE:
					case T_SIMPLE_FLOAT:
					case T_SMALLDATETIME:
					case T_SMALLINT:
					case T_SQL:
					case T_SQLEXCEPTION:
					case T_SQLINSERT:
					case T_SQLSTATE:
					case T_SQLWARNING:
					case T_STATS:
					case T_STATISTICS:
					case T_STEP:
					case T_STORAGE:
					case T_STORED:
					case T_STRING:
					case T_SUBDIR:
					case T_SUBSTRING:
					case T_SUM:
					case T_SUMMARY:
					case T_SYS_REFCURSOR:
					case T_TABLE:
					case T_TABLESPACE:
					case T_TEMPORARY:
					case T_TERMINATED:
					case T_TEXTIMAGE_ON:
					case T_THEN:
					case T_TIMESTAMP:
					case T_TITLE:
					case T_TO:
					case T_TOP:
					case T_TRANSACTION:
					case T_TRUE:
					case T_TRUNCATE:
					case T_UNIQUE:
					case T_UPDATE:
					case T_UR:
					case T_USE:
					case T_USING:
					case T_VALUE:
					case T_VALUES:
					case T_VAR:
					case T_VARCHAR:
					case T_VARCHAR2:
					case T_VARYING:
					case T_VOLATILE:
					case T_WHILE:
					case T_WITH:
					case T_WITHOUT:
					case T_WORK:
					case T_XACT_ABORT:
					case T_XML:
					case T_YES:
					case T_CORRECT:
					case T_ACTIVITY_COUNT:
					case T_CUME_DIST:
					case T_CURRENT_DATE:
					case T_CURRENT_TIMESTAMP:
					case T_CURRENT_USER:
					case T_DENSE_RANK:
					case T_FIRST_VALUE:
					case T_LAG:
					case T_LAST_VALUE:
					case T_LEAD:
					case T_PART_COUNT:
					case T_PART_LOC:
					case T_RANK:
					case T_ROW_NUMBER:
					case T_STDEV:
					case T_SYSDATE:
					case T_VARIANCE:
					case T_USER:
						{
						setState(3335);
						non_reserved_words();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(3342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,422,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Double_quotedStringContext extends StringContext {
		public TerminalNode L_D_STRING() { return getToken(PlsqlParser.L_D_STRING, 0); }
		public Double_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterDouble_quotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitDouble_quotedString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitDouble_quotedString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Single_quotedStringContext extends StringContext {
		public TerminalNode L_S_STRING() { return getToken(PlsqlParser.L_S_STRING, 0); }
		public Single_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterSingle_quotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitSingle_quotedString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitSingle_quotedString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_string);
		try {
			setState(3345);
			switch (_input.LA(1)) {
			case L_S_STRING:
				_localctx = new Single_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3343);
				match(L_S_STRING);
				}
				break;
			case L_D_STRING:
				_localctx = new Double_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3344);
				match(L_D_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_numberContext extends ParserRuleContext {
		public TerminalNode L_INT() { return getToken(PlsqlParser.L_INT, 0); }
		public Int_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterInt_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitInt_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitInt_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_numberContext int_number() throws RecognitionException {
		Int_numberContext _localctx = new Int_numberContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_int_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3348);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(3347);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(3350);
			match(L_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dec_numberContext extends ParserRuleContext {
		public TerminalNode L_DEC() { return getToken(PlsqlParser.L_DEC, 0); }
		public Dec_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterDec_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitDec_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitDec_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_numberContext dec_number() throws RecognitionException {
		Dec_numberContext _localctx = new Dec_numberContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_dec_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3353);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(3352);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(3355);
			match(L_DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode T_TRUE() { return getToken(PlsqlParser.T_TRUE, 0); }
		public TerminalNode T_FALSE() { return getToken(PlsqlParser.T_FALSE, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitBool_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitBool_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3357);
			_la = _input.LA(1);
			if ( !(_la==T_FALSE || _la==T_TRUE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_constContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(PlsqlParser.T_NULL, 0); }
		public Null_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterNull_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitNull_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitNull_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_constContext null_const() throws RecognitionException {
		Null_constContext _localctx = new Null_constContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_null_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3359);
			match(T_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_reserved_wordsContext extends ParserRuleContext {
		public TerminalNode T_ACTION() { return getToken(PlsqlParser.T_ACTION, 0); }
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(PlsqlParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_ADD2() { return getToken(PlsqlParser.T_ADD2, 0); }
		public TerminalNode T_ALL() { return getToken(PlsqlParser.T_ALL, 0); }
		public TerminalNode T_ALLOCATE() { return getToken(PlsqlParser.T_ALLOCATE, 0); }
		public TerminalNode T_ALTER() { return getToken(PlsqlParser.T_ALTER, 0); }
		public TerminalNode T_AND() { return getToken(PlsqlParser.T_AND, 0); }
		public TerminalNode T_ANSI_NULLS() { return getToken(PlsqlParser.T_ANSI_NULLS, 0); }
		public TerminalNode T_ANSI_PADDING() { return getToken(PlsqlParser.T_ANSI_PADDING, 0); }
		public TerminalNode T_AS() { return getToken(PlsqlParser.T_AS, 0); }
		public TerminalNode T_ASC() { return getToken(PlsqlParser.T_ASC, 0); }
		public TerminalNode T_ASSOCIATE() { return getToken(PlsqlParser.T_ASSOCIATE, 0); }
		public TerminalNode T_AT() { return getToken(PlsqlParser.T_AT, 0); }
		public TerminalNode T_AUTO_INCREMENT() { return getToken(PlsqlParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_AVG() { return getToken(PlsqlParser.T_AVG, 0); }
		public TerminalNode T_BATCHSIZE() { return getToken(PlsqlParser.T_BATCHSIZE, 0); }
		public TerminalNode T_BEGIN() { return getToken(PlsqlParser.T_BEGIN, 0); }
		public TerminalNode T_BETWEEN() { return getToken(PlsqlParser.T_BETWEEN, 0); }
		public TerminalNode T_BIGINT() { return getToken(PlsqlParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(PlsqlParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(PlsqlParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BIT() { return getToken(PlsqlParser.T_BIT, 0); }
		public TerminalNode T_BODY() { return getToken(PlsqlParser.T_BODY, 0); }
		public TerminalNode T_BREAK() { return getToken(PlsqlParser.T_BREAK, 0); }
		public TerminalNode T_BY() { return getToken(PlsqlParser.T_BY, 0); }
		public TerminalNode T_BYTE() { return getToken(PlsqlParser.T_BYTE, 0); }
		public TerminalNode T_CALL() { return getToken(PlsqlParser.T_CALL, 0); }
		public TerminalNode T_CALLER() { return getToken(PlsqlParser.T_CALLER, 0); }
		public TerminalNode T_CASCADE() { return getToken(PlsqlParser.T_CASCADE, 0); }
		public TerminalNode T_CASE() { return getToken(PlsqlParser.T_CASE, 0); }
		public TerminalNode T_CASESPECIFIC() { return getToken(PlsqlParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CAST() { return getToken(PlsqlParser.T_CAST, 0); }
		public TerminalNode T_CHAR() { return getToken(PlsqlParser.T_CHAR, 0); }
		public TerminalNode T_CHARACTER() { return getToken(PlsqlParser.T_CHARACTER, 0); }
		public TerminalNode T_CHARSET() { return getToken(PlsqlParser.T_CHARSET, 0); }
		public TerminalNode T_CLIENT() { return getToken(PlsqlParser.T_CLIENT, 0); }
		public TerminalNode T_CLOSE() { return getToken(PlsqlParser.T_CLOSE, 0); }
		public TerminalNode T_CLUSTERED() { return getToken(PlsqlParser.T_CLUSTERED, 0); }
		public TerminalNode T_CMP() { return getToken(PlsqlParser.T_CMP, 0); }
		public TerminalNode T_COLLECT() { return getToken(PlsqlParser.T_COLLECT, 0); }
		public TerminalNode T_COLLECTION() { return getToken(PlsqlParser.T_COLLECTION, 0); }
		public TerminalNode T_COLUMN() { return getToken(PlsqlParser.T_COLUMN, 0); }
		public TerminalNode T_COMMENT() { return getToken(PlsqlParser.T_COMMENT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(PlsqlParser.T_COMPRESS, 0); }
		public TerminalNode T_CONSTANT() { return getToken(PlsqlParser.T_CONSTANT, 0); }
		public TerminalNode T_COPY() { return getToken(PlsqlParser.T_COPY, 0); }
		public TerminalNode T_COMMIT() { return getToken(PlsqlParser.T_COMMIT, 0); }
		public TerminalNode T_CONCAT() { return getToken(PlsqlParser.T_CONCAT, 0); }
		public TerminalNode T_CONDITION() { return getToken(PlsqlParser.T_CONDITION, 0); }
		public TerminalNode T_CONSTRAINT() { return getToken(PlsqlParser.T_CONSTRAINT, 0); }
		public TerminalNode T_CONTINUE() { return getToken(PlsqlParser.T_CONTINUE, 0); }
		public TerminalNode T_COUNT() { return getToken(PlsqlParser.T_COUNT, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(PlsqlParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CREATE() { return getToken(PlsqlParser.T_CREATE, 0); }
		public TerminalNode T_CREATION() { return getToken(PlsqlParser.T_CREATION, 0); }
		public TerminalNode T_CREATOR() { return getToken(PlsqlParser.T_CREATOR, 0); }
		public TerminalNode T_CS() { return getToken(PlsqlParser.T_CS, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(PlsqlParser.T_CUME_DIST, 0); }
		public TerminalNode T_CURRENT() { return getToken(PlsqlParser.T_CURRENT, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(PlsqlParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT_SCHEMA() { return getToken(PlsqlParser.T_CURRENT_SCHEMA, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(PlsqlParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(PlsqlParser.T_CURRENT_USER, 0); }
		public TerminalNode T_CURSOR() { return getToken(PlsqlParser.T_CURSOR, 0); }
		public TerminalNode T_DATA() { return getToken(PlsqlParser.T_DATA, 0); }
		public TerminalNode T_DATABASE() { return getToken(PlsqlParser.T_DATABASE, 0); }
		public TerminalNode T_DATE() { return getToken(PlsqlParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(PlsqlParser.T_DATETIME, 0); }
		public TerminalNode T_DAY() { return getToken(PlsqlParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(PlsqlParser.T_DAYS, 0); }
		public TerminalNode T_DEC() { return getToken(PlsqlParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(PlsqlParser.T_DECIMAL, 0); }
		public TerminalNode T_DECLARE() { return getToken(PlsqlParser.T_DECLARE, 0); }
		public TerminalNode T_DEFAULT() { return getToken(PlsqlParser.T_DEFAULT, 0); }
		public TerminalNode T_DEFERRED() { return getToken(PlsqlParser.T_DEFERRED, 0); }
		public TerminalNode T_DEFINED() { return getToken(PlsqlParser.T_DEFINED, 0); }
		public TerminalNode T_DEFINER() { return getToken(PlsqlParser.T_DEFINER, 0); }
		public TerminalNode T_DEFINITION() { return getToken(PlsqlParser.T_DEFINITION, 0); }
		public TerminalNode T_DELETE() { return getToken(PlsqlParser.T_DELETE, 0); }
		public TerminalNode T_DELIMITED() { return getToken(PlsqlParser.T_DELIMITED, 0); }
		public TerminalNode T_DELIMITER() { return getToken(PlsqlParser.T_DELIMITER, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(PlsqlParser.T_DENSE_RANK, 0); }
		public TerminalNode T_DESC() { return getToken(PlsqlParser.T_DESC, 0); }
		public TerminalNode T_DESCRIBE() { return getToken(PlsqlParser.T_DESCRIBE, 0); }
		public TerminalNode T_DIAGNOSTICS() { return getToken(PlsqlParser.T_DIAGNOSTICS, 0); }
		public TerminalNode T_DIR() { return getToken(PlsqlParser.T_DIR, 0); }
		public TerminalNode T_DIRECTORY() { return getToken(PlsqlParser.T_DIRECTORY, 0); }
		public TerminalNode T_DISTINCT() { return getToken(PlsqlParser.T_DISTINCT, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(PlsqlParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_DO() { return getToken(PlsqlParser.T_DO, 0); }
		public TerminalNode T_DOUBLE() { return getToken(PlsqlParser.T_DOUBLE, 0); }
		public TerminalNode T_DROP() { return getToken(PlsqlParser.T_DROP, 0); }
		public TerminalNode T_DYNAMIC() { return getToken(PlsqlParser.T_DYNAMIC, 0); }
		public TerminalNode T_ENABLE() { return getToken(PlsqlParser.T_ENABLE, 0); }
		public TerminalNode T_ENGINE() { return getToken(PlsqlParser.T_ENGINE, 0); }
		public TerminalNode T_ESCAPED() { return getToken(PlsqlParser.T_ESCAPED, 0); }
		public TerminalNode T_EXCEPT() { return getToken(PlsqlParser.T_EXCEPT, 0); }
		public TerminalNode T_EXEC() { return getToken(PlsqlParser.T_EXEC, 0); }
		public TerminalNode T_EXECUTE() { return getToken(PlsqlParser.T_EXECUTE, 0); }
		public TerminalNode T_EXCEPTION() { return getToken(PlsqlParser.T_EXCEPTION, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(PlsqlParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_EXISTS() { return getToken(PlsqlParser.T_EXISTS, 0); }
		public TerminalNode T_EXIT() { return getToken(PlsqlParser.T_EXIT, 0); }
		public TerminalNode T_FALLBACK() { return getToken(PlsqlParser.T_FALLBACK, 0); }
		public TerminalNode T_FALSE() { return getToken(PlsqlParser.T_FALSE, 0); }
		public TerminalNode T_FETCH() { return getToken(PlsqlParser.T_FETCH, 0); }
		public TerminalNode T_FIELDS() { return getToken(PlsqlParser.T_FIELDS, 0); }
		public TerminalNode T_FILE() { return getToken(PlsqlParser.T_FILE, 0); }
		public TerminalNode T_FILES() { return getToken(PlsqlParser.T_FILES, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(PlsqlParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_FLOAT() { return getToken(PlsqlParser.T_FLOAT, 0); }
		public TerminalNode T_FOR() { return getToken(PlsqlParser.T_FOR, 0); }
		public TerminalNode T_FOREIGN() { return getToken(PlsqlParser.T_FOREIGN, 0); }
		public TerminalNode T_FORMAT() { return getToken(PlsqlParser.T_FORMAT, 0); }
		public TerminalNode T_FOUND() { return getToken(PlsqlParser.T_FOUND, 0); }
		public TerminalNode T_FROM() { return getToken(PlsqlParser.T_FROM, 0); }
		public TerminalNode T_FULL() { return getToken(PlsqlParser.T_FULL, 0); }
		public TerminalNode T_FUNCTION() { return getToken(PlsqlParser.T_FUNCTION, 0); }
		public TerminalNode T_GET() { return getToken(PlsqlParser.T_GET, 0); }
		public TerminalNode T_GLOBAL() { return getToken(PlsqlParser.T_GLOBAL, 0); }
		public TerminalNode T_GO() { return getToken(PlsqlParser.T_GO, 0); }
		public TerminalNode T_GRANT() { return getToken(PlsqlParser.T_GRANT, 0); }
		public TerminalNode T_GROUP() { return getToken(PlsqlParser.T_GROUP, 0); }
		public TerminalNode T_HANDLER() { return getToken(PlsqlParser.T_HANDLER, 0); }
		public TerminalNode T_HASH() { return getToken(PlsqlParser.T_HASH, 0); }
		public TerminalNode T_HAVING() { return getToken(PlsqlParser.T_HAVING, 0); }
		public TerminalNode T_HDFS() { return getToken(PlsqlParser.T_HDFS, 0); }
		public TerminalNode T_HIVE() { return getToken(PlsqlParser.T_HIVE, 0); }
		public TerminalNode T_HOST() { return getToken(PlsqlParser.T_HOST, 0); }
		public TerminalNode T_IDENTITY() { return getToken(PlsqlParser.T_IDENTITY, 0); }
		public TerminalNode T_IF() { return getToken(PlsqlParser.T_IF, 0); }
		public TerminalNode T_IGNORE() { return getToken(PlsqlParser.T_IGNORE, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(PlsqlParser.T_IMMEDIATE, 0); }
		public TerminalNode T_IN() { return getToken(PlsqlParser.T_IN, 0); }
		public TerminalNode T_INCLUDE() { return getToken(PlsqlParser.T_INCLUDE, 0); }
		public TerminalNode T_INDEX() { return getToken(PlsqlParser.T_INDEX, 0); }
		public TerminalNode T_INITRANS() { return getToken(PlsqlParser.T_INITRANS, 0); }
		public TerminalNode T_INNER() { return getToken(PlsqlParser.T_INNER, 0); }
		public TerminalNode T_INOUT() { return getToken(PlsqlParser.T_INOUT, 0); }
		public TerminalNode T_INSERT() { return getToken(PlsqlParser.T_INSERT, 0); }
		public TerminalNode T_INT() { return getToken(PlsqlParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(PlsqlParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(PlsqlParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(PlsqlParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(PlsqlParser.T_INTEGER, 0); }
		public TerminalNode T_INTERSECT() { return getToken(PlsqlParser.T_INTERSECT, 0); }
		public TerminalNode T_INTERVAL() { return getToken(PlsqlParser.T_INTERVAL, 0); }
		public TerminalNode T_INTO() { return getToken(PlsqlParser.T_INTO, 0); }
		public TerminalNode T_INVOKER() { return getToken(PlsqlParser.T_INVOKER, 0); }
		public TerminalNode T_ITEMS() { return getToken(PlsqlParser.T_ITEMS, 0); }
		public TerminalNode T_IS() { return getToken(PlsqlParser.T_IS, 0); }
		public TerminalNode T_ISOPEN() { return getToken(PlsqlParser.T_ISOPEN, 0); }
		public TerminalNode T_JOIN() { return getToken(PlsqlParser.T_JOIN, 0); }
		public TerminalNode T_KEEP() { return getToken(PlsqlParser.T_KEEP, 0); }
		public TerminalNode T_KEY() { return getToken(PlsqlParser.T_KEY, 0); }
		public TerminalNode T_KEYS() { return getToken(PlsqlParser.T_KEYS, 0); }
		public TerminalNode T_LAG() { return getToken(PlsqlParser.T_LAG, 0); }
		public TerminalNode T_LANGUAGE() { return getToken(PlsqlParser.T_LANGUAGE, 0); }
		public TerminalNode T_LAST_VALUE() { return getToken(PlsqlParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(PlsqlParser.T_LEAD, 0); }
		public TerminalNode T_LEAVE() { return getToken(PlsqlParser.T_LEAVE, 0); }
		public TerminalNode T_LEFT() { return getToken(PlsqlParser.T_LEFT, 0); }
		public TerminalNode T_LIKE() { return getToken(PlsqlParser.T_LIKE, 0); }
		public TerminalNode T_LIMIT() { return getToken(PlsqlParser.T_LIMIT, 0); }
		public TerminalNode T_LINES() { return getToken(PlsqlParser.T_LINES, 0); }
		public TerminalNode T_LOCAL() { return getToken(PlsqlParser.T_LOCAL, 0); }
		public TerminalNode T_LOCATION() { return getToken(PlsqlParser.T_LOCATION, 0); }
		public TerminalNode T_LOCATOR() { return getToken(PlsqlParser.T_LOCATOR, 0); }
		public TerminalNode T_LOCATORS() { return getToken(PlsqlParser.T_LOCATORS, 0); }
		public TerminalNode T_LOCKS() { return getToken(PlsqlParser.T_LOCKS, 0); }
		public TerminalNode T_LOG() { return getToken(PlsqlParser.T_LOG, 0); }
		public TerminalNode T_LOGGED() { return getToken(PlsqlParser.T_LOGGED, 0); }
		public TerminalNode T_LOGGING() { return getToken(PlsqlParser.T_LOGGING, 0); }
		public TerminalNode T_LOOP() { return getToken(PlsqlParser.T_LOOP, 0); }
		public TerminalNode T_MAP() { return getToken(PlsqlParser.T_MAP, 0); }
		public TerminalNode T_MATCHED() { return getToken(PlsqlParser.T_MATCHED, 0); }
		public TerminalNode T_MAX() { return getToken(PlsqlParser.T_MAX, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(PlsqlParser.T_MAXTRANS, 0); }
		public TerminalNode T_MERGE() { return getToken(PlsqlParser.T_MERGE, 0); }
		public TerminalNode T_MESSAGE_TEXT() { return getToken(PlsqlParser.T_MESSAGE_TEXT, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(PlsqlParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(PlsqlParser.T_MICROSECONDS, 0); }
		public TerminalNode T_MIN() { return getToken(PlsqlParser.T_MIN, 0); }
		public TerminalNode T_MULTISET() { return getToken(PlsqlParser.T_MULTISET, 0); }
		public TerminalNode T_NCHAR() { return getToken(PlsqlParser.T_NCHAR, 0); }
		public TerminalNode T_NEW() { return getToken(PlsqlParser.T_NEW, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(PlsqlParser.T_NVARCHAR, 0); }
		public TerminalNode T_NO() { return getToken(PlsqlParser.T_NO, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(PlsqlParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_NOCOUNT() { return getToken(PlsqlParser.T_NOCOUNT, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(PlsqlParser.T_NOLOGGING, 0); }
		public TerminalNode T_NONE() { return getToken(PlsqlParser.T_NONE, 0); }
		public TerminalNode T_NOT() { return getToken(PlsqlParser.T_NOT, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(PlsqlParser.T_NOTFOUND, 0); }
		public TerminalNode T_NUMERIC() { return getToken(PlsqlParser.T_NUMERIC, 0); }
		public TerminalNode T_NUMBER() { return getToken(PlsqlParser.T_NUMBER, 0); }
		public TerminalNode T_OBJECT() { return getToken(PlsqlParser.T_OBJECT, 0); }
		public TerminalNode T_OFF() { return getToken(PlsqlParser.T_OFF, 0); }
		public TerminalNode T_ON() { return getToken(PlsqlParser.T_ON, 0); }
		public TerminalNode T_ONLY() { return getToken(PlsqlParser.T_ONLY, 0); }
		public TerminalNode T_OPEN() { return getToken(PlsqlParser.T_OPEN, 0); }
		public TerminalNode T_OR() { return getToken(PlsqlParser.T_OR, 0); }
		public TerminalNode T_ORDER() { return getToken(PlsqlParser.T_ORDER, 0); }
		public TerminalNode T_OUT() { return getToken(PlsqlParser.T_OUT, 0); }
		public TerminalNode T_OUTER() { return getToken(PlsqlParser.T_OUTER, 0); }
		public TerminalNode T_OVER() { return getToken(PlsqlParser.T_OVER, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(PlsqlParser.T_OVERWRITE, 0); }
		public TerminalNode T_OWNER() { return getToken(PlsqlParser.T_OWNER, 0); }
		public TerminalNode T_PACKAGE() { return getToken(PlsqlParser.T_PACKAGE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(PlsqlParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(PlsqlParser.T_PART_LOC, 0); }
		public TerminalNode T_PARTITION() { return getToken(PlsqlParser.T_PARTITION, 0); }
		public TerminalNode T_PCTFREE() { return getToken(PlsqlParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(PlsqlParser.T_PCTUSED, 0); }
		public TerminalNode T_PRECISION() { return getToken(PlsqlParser.T_PRECISION, 0); }
		public TerminalNode T_PRESERVE() { return getToken(PlsqlParser.T_PRESERVE, 0); }
		public TerminalNode T_PRIMARY() { return getToken(PlsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_PRINT() { return getToken(PlsqlParser.T_PRINT, 0); }
		public TerminalNode T_PROC() { return getToken(PlsqlParser.T_PROC, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(PlsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_PWD() { return getToken(PlsqlParser.T_PWD, 0); }
		public TerminalNode T_QUALIFY() { return getToken(PlsqlParser.T_QUALIFY, 0); }
		public TerminalNode T_QUERY_BAND() { return getToken(PlsqlParser.T_QUERY_BAND, 0); }
		public TerminalNode T_QUIT() { return getToken(PlsqlParser.T_QUIT, 0); }
		public TerminalNode T_QUOTED_IDENTIFIER() { return getToken(PlsqlParser.T_QUOTED_IDENTIFIER, 0); }
		public TerminalNode T_RAISE() { return getToken(PlsqlParser.T_RAISE, 0); }
		public TerminalNode T_RANK() { return getToken(PlsqlParser.T_RANK, 0); }
		public TerminalNode T_REAL() { return getToken(PlsqlParser.T_REAL, 0); }
		public TerminalNode T_REFERENCES() { return getToken(PlsqlParser.T_REFERENCES, 0); }
		public TerminalNode T_REGEXP() { return getToken(PlsqlParser.T_REGEXP, 0); }
		public TerminalNode T_RR() { return getToken(PlsqlParser.T_RR, 0); }
		public TerminalNode T_REPLACE() { return getToken(PlsqlParser.T_REPLACE, 0); }
		public TerminalNode T_RESIGNAL() { return getToken(PlsqlParser.T_RESIGNAL, 0); }
		public TerminalNode T_RESTRICT() { return getToken(PlsqlParser.T_RESTRICT, 0); }
		public TerminalNode T_RESULT() { return getToken(PlsqlParser.T_RESULT, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(PlsqlParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_RETURN() { return getToken(PlsqlParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(PlsqlParser.T_RETURNS, 0); }
		public TerminalNode T_REVERSE() { return getToken(PlsqlParser.T_REVERSE, 0); }
		public TerminalNode T_RIGHT() { return getToken(PlsqlParser.T_RIGHT, 0); }
		public TerminalNode T_RLIKE() { return getToken(PlsqlParser.T_RLIKE, 0); }
		public TerminalNode T_RS() { return getToken(PlsqlParser.T_RS, 0); }
		public TerminalNode T_ROLE() { return getToken(PlsqlParser.T_ROLE, 0); }
		public TerminalNode T_ROLLBACK() { return getToken(PlsqlParser.T_ROLLBACK, 0); }
		public TerminalNode T_ROW() { return getToken(PlsqlParser.T_ROW, 0); }
		public TerminalNode T_ROWS() { return getToken(PlsqlParser.T_ROWS, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(PlsqlParser.T_ROW_COUNT, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(PlsqlParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_SCHEMA() { return getToken(PlsqlParser.T_SCHEMA, 0); }
		public TerminalNode T_SECOND() { return getToken(PlsqlParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(PlsqlParser.T_SECONDS, 0); }
		public TerminalNode T_SECURITY() { return getToken(PlsqlParser.T_SECURITY, 0); }
		public TerminalNode T_SEGMENT() { return getToken(PlsqlParser.T_SEGMENT, 0); }
		public TerminalNode T_SEL() { return getToken(PlsqlParser.T_SEL, 0); }
		public TerminalNode T_SELECT() { return getToken(PlsqlParser.T_SELECT, 0); }
		public TerminalNode T_SESSION() { return getToken(PlsqlParser.T_SESSION, 0); }
		public TerminalNode T_SESSIONS() { return getToken(PlsqlParser.T_SESSIONS, 0); }
		public TerminalNode T_SET() { return getToken(PlsqlParser.T_SET, 0); }
		public TerminalNode T_SETS() { return getToken(PlsqlParser.T_SETS, 0); }
		public TerminalNode T_SHARE() { return getToken(PlsqlParser.T_SHARE, 0); }
		public TerminalNode T_SIGNAL() { return getToken(PlsqlParser.T_SIGNAL, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(PlsqlParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(PlsqlParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(PlsqlParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_SMALLINT() { return getToken(PlsqlParser.T_SMALLINT, 0); }
		public TerminalNode T_SQL() { return getToken(PlsqlParser.T_SQL, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(PlsqlParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLINSERT() { return getToken(PlsqlParser.T_SQLINSERT, 0); }
		public TerminalNode T_SQLSTATE() { return getToken(PlsqlParser.T_SQLSTATE, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(PlsqlParser.T_SQLWARNING, 0); }
		public TerminalNode T_STATS() { return getToken(PlsqlParser.T_STATS, 0); }
		public TerminalNode T_STATISTICS() { return getToken(PlsqlParser.T_STATISTICS, 0); }
		public TerminalNode T_STEP() { return getToken(PlsqlParser.T_STEP, 0); }
		public TerminalNode T_STDEV() { return getToken(PlsqlParser.T_STDEV, 0); }
		public TerminalNode T_STORAGE() { return getToken(PlsqlParser.T_STORAGE, 0); }
		public TerminalNode T_STORED() { return getToken(PlsqlParser.T_STORED, 0); }
		public TerminalNode T_STRING() { return getToken(PlsqlParser.T_STRING, 0); }
		public TerminalNode T_SUBDIR() { return getToken(PlsqlParser.T_SUBDIR, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(PlsqlParser.T_SUBSTRING, 0); }
		public TerminalNode T_SUM() { return getToken(PlsqlParser.T_SUM, 0); }
		public TerminalNode T_SUMMARY() { return getToken(PlsqlParser.T_SUMMARY, 0); }
		public TerminalNode T_SYSDATE() { return getToken(PlsqlParser.T_SYSDATE, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(PlsqlParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TABLE() { return getToken(PlsqlParser.T_TABLE, 0); }
		public TerminalNode T_TABLESPACE() { return getToken(PlsqlParser.T_TABLESPACE, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(PlsqlParser.T_TEMPORARY, 0); }
		public TerminalNode T_TERMINATED() { return getToken(PlsqlParser.T_TERMINATED, 0); }
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(PlsqlParser.T_TEXTIMAGE_ON, 0); }
		public TerminalNode T_THEN() { return getToken(PlsqlParser.T_THEN, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(PlsqlParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TITLE() { return getToken(PlsqlParser.T_TITLE, 0); }
		public TerminalNode T_TO() { return getToken(PlsqlParser.T_TO, 0); }
		public TerminalNode T_TOP() { return getToken(PlsqlParser.T_TOP, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(PlsqlParser.T_TRANSACTION, 0); }
		public TerminalNode T_TRIM() { return getToken(PlsqlParser.T_TRIM, 0); }
		public TerminalNode T_TRUE() { return getToken(PlsqlParser.T_TRUE, 0); }
		public TerminalNode T_TRUNCATE() { return getToken(PlsqlParser.T_TRUNCATE, 0); }
		public TerminalNode T_UNIQUE() { return getToken(PlsqlParser.T_UNIQUE, 0); }
		public TerminalNode T_UPDATE() { return getToken(PlsqlParser.T_UPDATE, 0); }
		public TerminalNode T_UR() { return getToken(PlsqlParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(PlsqlParser.T_USE, 0); }
		public TerminalNode T_USER() { return getToken(PlsqlParser.T_USER, 0); }
		public TerminalNode T_USING() { return getToken(PlsqlParser.T_USING, 0); }
		public TerminalNode T_VALUE() { return getToken(PlsqlParser.T_VALUE, 0); }
		public TerminalNode T_VALUES() { return getToken(PlsqlParser.T_VALUES, 0); }
		public TerminalNode T_VAR() { return getToken(PlsqlParser.T_VAR, 0); }
		public TerminalNode T_VARCHAR() { return getToken(PlsqlParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(PlsqlParser.T_VARCHAR2, 0); }
		public TerminalNode T_VARYING() { return getToken(PlsqlParser.T_VARYING, 0); }
		public TerminalNode T_VARIANCE() { return getToken(PlsqlParser.T_VARIANCE, 0); }
		public TerminalNode T_VOLATILE() { return getToken(PlsqlParser.T_VOLATILE, 0); }
		public TerminalNode T_WHILE() { return getToken(PlsqlParser.T_WHILE, 0); }
		public TerminalNode T_WITH() { return getToken(PlsqlParser.T_WITH, 0); }
		public TerminalNode T_WITHOUT() { return getToken(PlsqlParser.T_WITHOUT, 0); }
		public TerminalNode T_WORK() { return getToken(PlsqlParser.T_WORK, 0); }
		public TerminalNode T_XACT_ABORT() { return getToken(PlsqlParser.T_XACT_ABORT, 0); }
		public TerminalNode T_XML() { return getToken(PlsqlParser.T_XML, 0); }
		public TerminalNode T_YES() { return getToken(PlsqlParser.T_YES, 0); }
		public TerminalNode T_CORRECT() { return getToken(PlsqlParser.T_CORRECT, 0); }
		public Non_reserved_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_reserved_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterNon_reserved_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitNon_reserved_words(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitNon_reserved_words(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_reserved_wordsContext non_reserved_words() throws RecognitionException {
		Non_reserved_wordsContext _localctx = new Non_reserved_wordsContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_non_reserved_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3361);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_CORRECT - 320)) | (1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return block_end_sempred((Block_endContext)_localctx, predIndex);
		case 11:
			return expr_stmt_sempred((Expr_stmtContext)_localctx, predIndex);
		case 74:
			return create_routine_params_sempred((Create_routine_paramsContext)_localctx, predIndex);
		case 155:
			return select_list_alias_sempred((Select_list_aliasContext)_localctx, predIndex);
		case 166:
			return from_alias_clause_sempred((From_alias_clauseContext)_localctx, predIndex);
		case 184:
			return delete_alias_sempred((Delete_aliasContext)_localctx, predIndex);
		case 186:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 194:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 211:
			return func_param_sempred((Func_paramContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean block_end_sempred(Block_endContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !_input.LT(2).getText().equalsIgnoreCase("TRANSACTION");
		}
		return true;
	}
	private boolean expr_stmt_sempred(Expr_stmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return !_input.LT(1).getText().equalsIgnoreCase("GO");
		}
		return true;
	}
	private boolean create_routine_params_sempred(Create_routine_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return !_input.LT(1).getText().equalsIgnoreCase("IS") &&
		        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
		        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
		        ;
		}
		return true;
	}
	private boolean select_list_alias_sempred(Select_list_aliasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM");
		}
		return true;
	}
	private boolean from_alias_clause_sempred(From_alias_clauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return !_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
		        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") && 
		        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
		        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
		        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
		        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
		        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
		        !_input.LT(1).getText().equalsIgnoreCase("WITH");
		}
		return true;
	}
	private boolean delete_alias_sempred(Delete_aliasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return !_input.LT(1).getText().equalsIgnoreCase("ALL");
		}
		return true;
	}
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 11);
		case 11:
			return precpred(_ctx, 15);
		}
		return true;
	}
	private boolean func_param_sempred(Func_paramContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO");
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u017b\u0d26\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\3\2\3\2\3\2\3\3\3\3\5"+
		"\3\u01d2\n\3\3\3\5\3\u01d5\n\3\6\3\u01d7\n\3\r\3\16\3\u01d8\3\4\5\4\u01dc"+
		"\n\4\3\4\3\4\3\4\5\4\u01e1\n\4\3\4\3\4\3\5\3\5\3\5\5\5\u01e8\n\5\3\5\3"+
		"\5\3\5\3\5\5\5\u01ee\n\5\5\5\u01f0\n\5\3\6\3\6\3\6\3\7\3\7\6\7\u01f7\n"+
		"\7\r\7\16\7\u01f8\3\7\5\7\u01fc\n\7\5\7\u01fe\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u023e\n\b\3\t\3\t\3\n\3\n\6\n\u0244\n\n\r\n\16"+
		"\n\u0245\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\5\16\u0256\n\16\3\16\3\16\3\16\7\16\u025b\n\16\f\16\16\16\u025e\13"+
		"\16\5\16\u0260\n\16\3\17\3\17\3\17\5\17\u0265\n\17\3\20\3\20\5\20\u0269"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0272\n\20\3\20\3\20\3\20"+
		"\5\20\u0277\n\20\3\21\3\21\3\21\3\21\7\21\u027d\n\21\f\21\16\21\u0280"+
		"\13\21\3\21\3\21\5\21\u0284\n\21\3\21\3\21\3\21\3\21\3\21\7\21\u028b\n"+
		"\21\f\21\16\21\u028e\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u0297"+
		"\n\22\f\22\16\22\u029a\13\22\3\22\3\22\5\22\u029e\n\22\3\22\5\22\u02a1"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u02af\n\23\3\23\3\23\3\24\3\24\3\24\5\24\u02b6\n\24\3\24\3\24\3\24\3"+
		"\24\3\24\7\24\u02bd\n\24\f\24\16\24\u02c0\13\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u02d0\n\27\3\27"+
		"\3\27\5\27\u02d4\n\27\3\30\3\30\3\30\3\30\7\30\u02da\n\30\f\30\16\30\u02dd"+
		"\13\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u02e5\n\31\f\31\16\31\u02e8"+
		"\13\31\3\32\3\32\3\32\3\32\3\32\7\32\u02ef\n\32\f\32\16\32\u02f2\13\32"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u02f9\n\33\3\34\3\34\3\34\7\34\u02fe\n"+
		"\34\f\34\16\34\u0301\13\34\3\34\5\34\u0304\n\34\3\34\3\34\5\34\u0308\n"+
		"\34\3\34\7\34\u030b\n\34\f\34\16\34\u030e\13\34\3\34\5\34\u0311\n\34\3"+
		"\34\3\34\3\34\5\34\u0316\n\34\3\34\3\34\5\34\u031a\n\34\3\34\3\34\5\34"+
		"\u031e\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u0328\n\36\3"+
		"\36\3\36\5\36\u032c\n\36\3\36\3\36\3\36\5\36\u0331\n\36\3\37\3\37\3\37"+
		"\5\37\u0336\n\37\3\37\3\37\5\37\u033a\n\37\3 \3 \3 \3!\3!\3!\3!\3!\3!"+
		"\3!\3!\5!\u0347\n!\3!\3!\3\"\5\"\u034c\n\"\3\"\3\"\3\"\3\"\5\"\u0352\n"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\5#\u035b\n#\3#\3#\5#\u035f\n#\3#\3#\3$\3$\3"+
		"$\3$\5$\u0367\n$\3$\5$\u036a\n$\3$\3$\3$\5$\u036f\n$\3$\3$\3%\5%\u0374"+
		"\n%\3%\3%\3%\3%\3%\5%\u037b\n%\3%\3%\3%\3%\3%\5%\u0382\n%\3%\5%\u0385"+
		"\n%\3&\3&\3&\7&\u038a\n&\f&\16&\u038d\13&\3\'\3\'\3\'\5\'\u0392\n\'\3"+
		"\'\7\'\u0395\n\'\f\'\16\'\u0398\13\'\3\'\7\'\u039b\n\'\f\'\16\'\u039e"+
		"\13\'\3\'\3\'\5\'\u03a2\n\'\3\'\5\'\u03a5\n\'\3(\3(\3)\3)\5)\u03ab\n)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u03b7\n)\f)\16)\u03ba\13)\3)\3)\3)\3"+
		")\3)\7)\u03c1\n)\f)\16)\u03c4\13)\3)\3)\3)\5)\u03c9\n)\3*\3*\3*\5*\u03ce"+
		"\n*\3*\3*\3*\5*\u03d3\n*\3*\3*\3*\5*\u03d8\n*\7*\u03da\n*\f*\16*\u03dd"+
		"\13*\3*\3*\5*\u03e1\n*\3*\5*\u03e4\n*\3*\3*\3*\3*\3*\3*\7*\u03ec\n*\f"+
		"*\16*\u03ef\13*\3*\3*\3*\3*\3*\3*\3*\7*\u03f8\n*\f*\16*\u03fb\13*\3*\3"+
		"*\7*\u03ff\n*\f*\16*\u0402\13*\5*\u0404\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\5+\u0410\n+\3,\6,\u0413\n,\r,\16,\u0414\3-\3-\3-\5-\u041a\n-\3.\5"+
		".\u041d\n.\3.\3.\3/\6/\u0422\n/\r/\16/\u0423\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\5\60\u0430\n\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\6\61\u043d\n\61\r\61\16\61\u043e\3\61\3\61\3"+
		"\61\5\61\u0444\n\61\3\62\5\62\u0447\n\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\7\62\u0454\n\62\f\62\16\62\u0457\13\62\3\62"+
		"\3\62\3\62\5\62\u045c\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\5\62\u0467\n\62\3\63\5\63\u046a\n\63\3\63\3\63\3\63\3\63\3\63\3\63\7"+
		"\63\u0472\n\63\f\63\16\63\u0475\13\63\3\63\3\63\3\63\3\63\5\63\u047b\n"+
		"\63\3\64\3\64\3\64\3\64\5\64\u0481\n\64\3\65\3\65\3\65\3\65\7\65\u0487"+
		"\n\65\f\65\16\65\u048a\13\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0493"+
		"\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\5\66\u04a7\n\66\3\67\3\67\3\67\3\67\5\67\u04ad"+
		"\n\67\38\38\58\u04b1\n8\38\38\38\58\u04b6\n8\38\38\58\u04ba\n8\38\38\3"+
		"8\58\u04bf\n8\38\58\u04c2\n8\38\38\38\58\u04c7\n8\38\58\u04ca\n8\39\3"+
		"9\39\39\39\3:\3:\3;\3;\3;\5;\u04d6\n;\3;\3;\3<\3<\3<\5<\u04dd\n<\3<\3"+
		"<\3<\5<\u04e2\n<\3<\3<\3<\5<\u04e7\n<\7<\u04e9\n<\f<\16<\u04ec\13<\3<"+
		"\3<\5<\u04f0\n<\3<\5<\u04f3\n<\3<\3<\3<\3<\3<\3<\7<\u04fb\n<\f<\16<\u04fe"+
		"\13<\3<\3<\3<\3<\3<\3<\3<\7<\u0507\n<\f<\16<\u050a\13<\3<\3<\7<\u050e"+
		"\n<\f<\16<\u0511\13<\3<\3<\3<\3<\3<\5<\u0518\n<\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\5=\u0526\n=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0545\n=\5=\u0547\n=\3"+
		">\3>\3>\5>\u054c\n>\3>\3>\5>\u0550\n>\3>\3>\3?\5?\u0555\n?\3?\3?\3?\3"+
		"?\3?\5?\u055c\n?\3?\5?\u055f\n?\3@\5@\u0562\n@\3@\3@\3@\5@\u0567\n@\3"+
		"@\3@\5@\u056b\n@\5@\u056d\n@\3A\3A\3A\3A\3A\5A\u0574\nA\3A\3A\7A\u0578"+
		"\nA\fA\16A\u057b\13A\3B\3B\3B\3B\5B\u0581\nB\3C\3C\3C\3C\5C\u0587\nC\3"+
		"C\5C\u058a\nC\3C\3C\3C\5C\u058f\nC\3C\3C\5C\u0593\nC\3C\5C\u0596\nC\3"+
		"C\3C\3D\3D\3D\5D\u059d\nD\3E\3E\3E\3E\5E\u05a3\nE\3E\5E\u05a6\nE\3E\3"+
		"E\3E\3E\3E\3E\3E\3E\5E\u05b0\nE\3F\3F\3F\3F\3F\7F\u05b7\nF\fF\16F\u05ba"+
		"\13F\3G\3G\3G\3G\5G\u05c0\nG\3G\3G\3G\3G\3G\5G\u05c7\nG\5G\u05c9\nG\3"+
		"H\3H\3H\3H\5H\u05cf\nH\3H\5H\u05d2\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u05dd"+
		"\nH\3I\3I\3I\3I\3I\7I\u05e4\nI\fI\16I\u05e7\13I\3J\3J\3J\5J\u05ec\nJ\3"+
		"K\3K\3K\3K\5K\u05f2\nK\3K\5K\u05f5\nK\3K\3K\3K\5K\u05fa\nK\3K\5K\u05fd"+
		"\nK\3K\5K\u0600\nK\3K\5K\u0603\nK\3K\5K\u0606\nK\3K\3K\3K\3K\5K\u060c"+
		"\nK\3L\3L\3L\3L\3L\3L\7L\u0614\nL\fL\16L\u0617\13L\3L\3L\3L\3L\3L\3L\7"+
		"L\u061f\nL\fL\16L\u0622\13L\5L\u0624\nL\3M\3M\3M\3M\3M\5M\u062b\nM\3M"+
		"\3M\3M\5M\u0630\nM\3M\7M\u0633\nM\fM\16M\u0636\13M\3M\5M\u0639\nM\3M\3"+
		"M\3M\3M\3M\3M\5M\u0641\nM\3M\3M\5M\u0645\nM\3M\7M\u0648\nM\fM\16M\u064b"+
		"\13M\3M\5M\u064e\nM\5M\u0650\nM\3N\6N\u0653\nN\rN\16N\u0654\3O\3O\3O\3"+
		"O\3O\3O\5O\u065d\nO\3O\3O\3O\5O\u0662\nO\3P\3P\3P\3P\5P\u0668\nP\3P\3"+
		"P\3P\3P\3P\5P\u066f\nP\3P\5P\u0672\nP\3Q\3Q\3Q\3R\3R\5R\u0679\nR\3R\3"+
		"R\3R\3R\3R\3R\5R\u0681\nR\3R\3R\3R\3R\7R\u0687\nR\fR\16R\u068a\13R\5R"+
		"\u068c\nR\3R\5R\u068f\nR\3S\3S\3S\5S\u0694\nS\3T\3T\3T\3T\3T\7T\u069b"+
		"\nT\fT\16T\u069e\13T\3T\5T\u06a1\nT\3T\3T\3T\3U\3U\3U\3U\3U\5U\u06ab\n"+
		"U\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3X\3X\3X\3Y\3Y\3Y\5Y\u06be\nY\3Z\3"+
		"Z\3Z\3Z\3Z\5Z\u06c5\nZ\5Z\u06c7\nZ\3Z\3Z\5Z\u06cb\nZ\3Z\3Z\5Z\u06cf\n"+
		"Z\3[\3[\3[\3[\7[\u06d5\n[\f[\16[\u06d8\13[\3[\3[\3\\\3\\\3\\\3\\\7\\\u06e0"+
		"\n\\\f\\\16\\\u06e3\13\\\3]\3]\3]\3]\7]\u06e9\n]\f]\16]\u06ec\13]\3]\3"+
		"]\3^\3^\3^\5^\u06f3\n^\3^\3^\3^\3^\3_\3_\3_\5_\u06fc\n_\3_\5_\u06ff\n"+
		"_\3_\5_\u0702\n_\3_\3_\3`\3`\3`\3`\3a\3a\3a\3b\3b\5b\u070f\nb\3b\3b\5"+
		"b\u0713\nb\3c\3c\3c\3c\3d\3d\5d\u071b\nd\3e\3e\3e\3e\3e\3e\3f\3f\3f\3"+
		"f\3g\3g\3g\3g\7g\u072b\ng\fg\16g\u072e\13g\3g\3g\3g\3g\3h\3h\3h\3h\3h"+
		"\3i\3i\5i\u073b\ni\3j\3j\3j\3j\3j\5j\u0742\nj\3j\3j\5j\u0746\nj\3k\3k"+
		"\3k\3k\3k\5k\u074d\nk\5k\u074f\nk\3l\3l\5l\u0753\nl\3l\3l\3l\3l\3l\7l"+
		"\u075a\nl\fl\16l\u075d\13l\3m\3m\3m\3m\3m\5m\u0764\nm\3n\3n\3n\3n\3n\7"+
		"n\u076b\nn\fn\16n\u076e\13n\3n\3n\3o\3o\3o\3p\3p\3p\3p\3p\3p\3q\3q\5q"+
		"\u077d\nq\3q\3q\3q\3q\5q\u0783\nq\3q\3q\5q\u0787\nq\3r\3r\3r\3r\3r\3r"+
		"\7r\u078f\nr\fr\16r\u0792\13r\3r\3r\3r\7r\u0797\nr\fr\16r\u079a\13r\3"+
		"s\3s\3s\3s\3s\3s\5s\u07a2\ns\3s\3s\5s\u07a6\ns\3s\3s\7s\u07aa\ns\fs\16"+
		"s\u07ad\13s\3t\3t\5t\u07b1\nt\3u\3u\5u\u07b5\nu\3v\3v\3v\3v\3v\3v\3v\3"+
		"v\5v\u07bf\nv\3w\3w\3x\3x\5x\u07c5\nx\3y\3y\5y\u07c9\ny\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\7y\u07d3\ny\fy\16y\u07d6\13y\3y\3y\3z\3z\5z\u07dc\nz\3{\3{"+
		"\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\7|\u07ea\n|\f|\16|\u07ed\13|\3|\3|\7|\u07f1"+
		"\n|\f|\16|\u07f4\13|\3}\3}\3}\3}\3}\3}\3}\5}\u07fd\n}\3~\5~\u0800\n~\3"+
		"~\3~\5~\u0804\n~\3\177\3\177\3\u0080\3\u0080\3\u0080\5\u0080\u080b\n\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u0812\n\u0080\5\u0080"+
		"\u0814\n\u0080\3\u0081\3\u0081\5\u0081\u0818\n\u0081\3\u0082\3\u0082\5"+
		"\u0082\u081c\n\u0082\3\u0083\3\u0083\3\u0083\5\u0083\u0821\n\u0083\3\u0084"+
		"\5\u0084\u0824\n\u0084\3\u0084\3\u0084\5\u0084\u0828\n\u0084\3\u0084\5"+
		"\u0084\u082b\n\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0086\3"+
		"\u0086\3\u0086\3\u0086\5\u0086\u0836\n\u0086\3\u0086\5\u0086\u0839\n\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088"+
		"\5\u0088\u0844\n\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u084a\n"+
		"\u0088\3\u0088\3\u0088\5\u0088\u084e\n\u0088\5\u0088\u0850\n\u0088\3\u0089"+
		"\3\u0089\5\u0089\u0854\n\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a"+
		"\3\u008b\3\u008b\5\u008b\u085d\n\u008b\3\u008b\3\u008b\3\u008b\7\u008b"+
		"\u0862\n\u008b\f\u008b\16\u008b\u0865\13\u008b\3\u008b\5\u008b\u0868\n"+
		"\u008b\3\u008b\3\u008b\5\u008b\u086c\n\u008b\3\u008b\3\u008b\3\u008b\7"+
		"\u008b\u0871\n\u008b\f\u008b\16\u008b\u0874\13\u008b\3\u008b\5\u008b\u0877"+
		"\n\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u087f"+
		"\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0885\n\u008d\3\u008d"+
		"\3\u008d\5\u008d\u0889\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u0894\n\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\5\u008e\u089b\n\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f"+
		"\u08a8\n\u008f\3\u0090\3\u0090\3\u0090\3\u0090\7\u0090\u08ae\n\u0090\f"+
		"\u0090\16\u0090\u08b1\13\u0090\3\u0091\5\u0091\u08b4\n\u0091\3\u0091\3"+
		"\u0091\3\u0092\3\u0092\3\u0092\3\u0092\7\u0092\u08bc\n\u0092\f\u0092\16"+
		"\u0092\u08bf\13\u0092\3\u0093\3\u0093\5\u0093\u08c3\n\u0093\3\u0093\3"+
		"\u0093\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094\7\u0094"+
		"\u08ce\n\u0094\f\u0094\16\u0094\u08d1\13\u0094\3\u0094\3\u0094\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\7\u0095\u08d9\n\u0095\f\u0095\16\u0095\u08dc"+
		"\13\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u08e3\n\u0096"+
		"\3\u0097\3\u0097\5\u0097\u08e7\n\u0097\3\u0097\3\u0097\5\u0097\u08eb\n"+
		"\u0097\3\u0097\3\u0097\5\u0097\u08ef\n\u0097\5\u0097\u08f1\n\u0097\3\u0098"+
		"\3\u0098\3\u0098\5\u0098\u08f6\n\u0098\3\u0098\5\u0098\u08f9\n\u0098\3"+
		"\u0098\5\u0098\u08fc\n\u0098\3\u0098\5\u0098\u08ff\n\u0098\3\u0098\3\u0098"+
		"\5\u0098\u0903\n\u0098\3\u0098\5\u0098\u0906\n\u0098\3\u0098\5\u0098\u0909"+
		"\n\u0098\3\u0099\5\u0099\u090c\n\u0099\3\u0099\5\u0099\u090f\n\u0099\3"+
		"\u0099\3\u0099\3\u0099\7\u0099\u0914\n\u0099\f\u0099\16\u0099\u0917\13"+
		"\u0099\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c"+
		"\5\u009c\u0921\n\u009c\3\u009c\3\u009c\5\u009c\u0925\n\u009c\3\u009c\5"+
		"\u009c\u0928\n\u009c\3\u009d\3\u009d\5\u009d\u092c\n\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\5\u009d\u0933\n\u009d\3\u009e\3\u009e\5\u009e"+
		"\u0937\n\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\3\u009f\7\u009f"+
		"\u093f\n\u009f\f\u009f\16\u009f\u0942\13\u009f\3\u00a0\3\u00a0\3\u00a0"+
		"\7\u00a0\u0947\n\u00a0\f\u00a0\16\u00a0\u094a\13\u00a0\3\u00a1\3\u00a1"+
		"\3\u00a1\5\u00a1\u094f\n\u00a1\3\u00a2\3\u00a2\5\u00a2\u0953\n\u00a2\3"+
		"\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0959\n\u00a3\3\u00a4\3\u00a4\3"+
		"\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u0962\n\u00a4\3\u00a5\5"+
		"\u00a5\u0965\n\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u096a\n\u00a5\3\u00a5"+
		"\5\u00a5\u096d\n\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\7\u00a6\u0975\n\u00a6\f\u00a6\16\u00a6\u0978\13\u00a6\3\u00a6\3\u00a6"+
		"\5\u00a6\u097c\n\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\7\u00a7"+
		"\u0983\n\u00a7\f\u00a7\16\u00a7\u0986\13\u00a7\3\u00a7\3\u00a7\5\u00a7"+
		"\u098a\n\u00a7\3\u00a8\3\u00a8\5\u00a8\u098e\n\u00a8\3\u00a8\3\u00a8\3"+
		"\u00a8\3\u00a8\3\u00a8\7\u00a8\u0995\n\u00a8\f\u00a8\16\u00a8\u0998\13"+
		"\u00a8\3\u00a8\5\u00a8\u099b\n\u00a8\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3"+
		"\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\7\u00ab\u09a7\n\u00ab\f"+
		"\u00ab\16\u00ab\u09aa\13\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u09b6\n\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\5\u00ae\u09bb\n\u00ae\7\u00ae\u09bd\n\u00ae\f\u00ae\16"+
		"\u00ae\u09c0\13\u00ae\3\u00af\6\u00af\u09c3\n\u00af\r\u00af\16\u00af\u09c4"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\5\u00b0\u09d0\n\u00b0\5\u00b0\u09d2\n\u00b0\3\u00b1\3\u00b1\3\u00b1\3"+
		"\u00b1\3\u00b1\5\u00b1\u09d9\n\u00b1\3\u00b1\5\u00b1\u09dc\n\u00b1\3\u00b2"+
		"\3\u00b2\3\u00b2\7\u00b2\u09e1\n\u00b2\f\u00b2\16\u00b2\u09e4\13\u00b2"+
		"\3\u00b3\3\u00b3\5\u00b3\u09e8\n\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\5\u00b3\u09ee\n\u00b3\3\u00b3\5\u00b3\u09f1\n\u00b3\3\u00b3\5\u00b3\u09f4"+
		"\n\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\6\u00b5\u0a01\n\u00b5\r\u00b5\16\u00b5\u0a02"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u0a0a\n\u00b6\3\u00b6"+
		"\5\u00b6\u0a0d\n\u00b6\3\u00b6\5\u00b6\u0a10\n\u00b6\3\u00b7\3\u00b7\5"+
		"\u00b7\u0a14\n\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0a19\n\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0a1f\n\u00b7\3\u00b8\3\u00b8\5\u00b8"+
		"\u0a23\n\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\7\u00b8\u0a2c\n\u00b8\f\u00b8\16\u00b8\u0a2f\13\u00b8\3\u00b8\5\u00b8"+
		"\u0a32\n\u00b8\3\u00b8\5\u00b8\u0a35\n\u00b8\3\u00b9\3\u00b9\5\u00b9\u0a39"+
		"\n\u00b9\3\u00b9\3\u00b9\5\u00b9\u0a3d\n\u00b9\3\u00b9\3\u00b9\5\u00b9"+
		"\u0a41\n\u00b9\3\u00ba\3\u00ba\5\u00ba\u0a45\n\u00ba\3\u00ba\3\u00ba\3"+
		"\u00bb\3\u00bb\5\u00bb\u0a4b\n\u00bb\3\u00bb\3\u00bb\3\u00bc\3\u00bc\5"+
		"\u00bc\u0a51\n\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0a58"+
		"\n\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\7\u00bc\u0a5e\n\u00bc\f\u00bc"+
		"\16\u00bc\u0a61\13\u00bc\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0a66\n\u00bd"+
		"\3\u00be\3\u00be\3\u00be\5\u00be\u0a6b\n\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0a76\n\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0a7f"+
		"\n\u00be\3\u00bf\3\u00bf\5\u00bf\u0a83\n\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\3\u00bf\7\u00bf\u0a8a\n\u00bf\f\u00bf\16\u00bf\u0a8d\13\u00bf"+
		"\3\u00bf\5\u00bf\u0a90\n\u00bf\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\7\u00c0\u0a98\n\u00c0\f\u00c0\16\u00c0\u0a9b\13\u00c0\3\u00c0"+
		"\3\u00c0\5\u00c0\u0a9f\n\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u0ab5\n\u00c3"+
		"\3\u00c3\5\u00c3\u0ab8\n\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u0acb\n\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\7\u00c4\u0adb\n\u00c4\f\u00c4\16\u00c4\u0ade\13\u00c4"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5"+
		"\u0ae8\n\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\7\u00c8\u0af5\n\u00c8\f\u00c8\16\u00c8"+
		"\u0af8\13\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\5\u00c9\u0b03\n\u00c9\3\u00ca\3\u00ca\5\u00ca\u0b07\n"+
		"\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\6\u00cb"+
		"\u0b10\n\u00cb\r\u00cb\16\u00cb\u0b11\3\u00cb\3\u00cb\5\u00cb\u0b16\n"+
		"\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\6\u00cc\u0b20\n\u00cc\r\u00cc\16\u00cc\u0b21\3\u00cc\3\u00cc\5\u00cc"+
		"\u0b26\n\u00cc\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00ce"+
		"\3\u00ce\3\u00ce\5\u00ce\u0b31\n\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce"+
		"\u0b36\n\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0b3b\n\u00ce\3\u00ce\3"+
		"\u00ce\5\u00ce\u0b3f\n\u00ce\3\u00ce\3\u00ce\5\u00ce\u0b43\n\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\5\u00ce\u0b48\n\u00ce\3\u00ce\3\u00ce\5\u00ce\u0b4c\n"+
		"\u00ce\3\u00ce\3\u00ce\5\u00ce\u0b50\n\u00ce\3\u00ce\3\u00ce\3\u00ce\3"+
		"\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\5\u00ce\u0b67\n\u00ce\5\u00ce\u0b69\n\u00ce\3\u00ce\3\u00ce\3\u00ce\3"+
		"\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0b7b\n\u00ce\5\u00ce\u0b7d\n"+
		"\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0b85\n"+
		"\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0b8a\n\u00ce\3\u00ce\3\u00ce\3"+
		"\u00ce\5\u00ce\u0b8f\n\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0b94\n\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\5\u00ce\u0ba1\n\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce"+
		"\u0ba6\n\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0bab\n\u00ce\3\u00ce\3"+
		"\u00ce\3\u00ce\5\u00ce\u0bb0\n\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0bb5"+
		"\n\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0bba\n\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\5\u00ce\u0bbf\n\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0bc4\n"+
		"\u00ce\5\u00ce\u0bc6\n\u00ce\3\u00cf\3\u00cf\3\u00d0\3\u00d0\3\u00d0\5"+
		"\u00d0\u0bcd\n\u00d0\3\u00d0\5\u00d0\u0bd0\n\u00d0\3\u00d0\3\u00d0\3\u00d1"+
		"\3\u00d1\3\u00d1\3\u00d1\3\u00d1\7\u00d1\u0bd9\n\u00d1\f\u00d1\16\u00d1"+
		"\u0bdc\13\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\5\u00d2\u0be5\n\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\5\u00d2\u0bed\n\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\5\u00d2\u0bf6\n\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2"+
		"\u0bfc\n\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\7\u00d2\u0c0b\n\u00d2"+
		"\f\u00d2\16\u00d2\u0c0e\13\u00d2\5\u00d2\u0c10\n\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\7\u00d2\u0c1e\n\u00d2\f\u00d2\16\u00d2\u0c21\13\u00d2\5\u00d2"+
		"\u0c23\n\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\7\u00d2\u0c31\n\u00d2\f\u00d2"+
		"\16\u00d2\u0c34\13\u00d2\5\u00d2\u0c36\n\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\7\u00d2\u0c44\n\u00d2\f\u00d2\16\u00d2\u0c47\13\u00d2\5\u00d2\u0c49\n"+
		"\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\7\u00d2\u0c57\n\u00d2\f\u00d2\16\u00d2"+
		"\u0c5a\13\u00d2\5\u00d2\u0c5c\n\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\7\u00d2"+
		"\u0c6a\n\u00d2\f\u00d2\16\u00d2\u0c6d\13\u00d2\5\u00d2\u0c6f\n\u00d2\3"+
		"\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\7\u00d2\u0c7b\n\u00d2\f\u00d2\16\u00d2\u0c7e\13\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\6\u00d2\u0c8a\n\u00d2\r\u00d2\16\u00d2\u0c8b\3\u00d2\3\u00d2\5\u00d2"+
		"\u0c90\n\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u0ca0"+
		"\n\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u0ca6\n\u00d2\3\u00d3"+
		"\3\u00d3\3\u00d3\5\u00d3\u0cab\n\u00d3\3\u00d3\3\u00d3\3\u00d4\3\u00d4"+
		"\3\u00d4\7\u00d4\u0cb2\n\u00d4\f\u00d4\16\u00d4\u0cb5\13\u00d4\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u0cbb\n\u00d5\5\u00d5\u0cbd\n\u00d5\3"+
		"\u00d5\3\u00d5\3\u00d6\3\u00d6\5\u00d6\u0cc3\n\u00d6\3\u00d7\3\u00d7\5"+
		"\u00d7\u0cc7\n\u00d7\3\u00d8\3\u00d8\7\u00d8\u0ccb\n\u00d8\f\u00d8\16"+
		"\u00d8\u0cce\13\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u0cdc\n\u00d9"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\5\u00da\u0ce3\n\u00da\3\u00db"+
		"\7\u00db\u0ce6\n\u00db\f\u00db\16\u00db\u0ce9\13\u00db\3\u00dc\3\u00dc"+
		"\3\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u0cf2\n\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\7\u00dd\u0cf7\n\u00dd\f\u00dd\16\u00dd\u0cfa\13\u00dd"+
		"\5\u00dd\u0cfc\n\u00dd\3\u00de\3\u00de\3\u00de\3\u00df\3\u00df\3\u00df"+
		"\3\u00e0\3\u00e0\5\u00e0\u0d06\n\u00e0\3\u00e0\3\u00e0\3\u00e0\5\u00e0"+
		"\u0d0b\n\u00e0\7\u00e0\u0d0d\n\u00e0\f\u00e0\16\u00e0\u0d10\13\u00e0\3"+
		"\u00e1\3\u00e1\5\u00e1\u0d14\n\u00e1\3\u00e2\5\u00e2\u0d17\n\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e3\5\u00e3\u0d1c\n\u00e3\3\u00e3\3\u00e3\3\u00e4\3\u00e4"+
		"\3\u00e5\3\u00e5\3\u00e6\3\u00e6\3\u00e6\3\u0ce7\4\u0176\u0186\u00e7\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106"+
		"\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e"+
		"\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136"+
		"\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e"+
		"\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166"+
		"\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e"+
		"\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196"+
		"\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae"+
		"\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6"+
		"\u01c8\u01ca\2\63\5\2\3\4\u015f\u015f\u0170\u0170\4\2dd\u0139\u0139\3"+
		"\2\u00aa\u00ab\5\2\20\20uu\u009b\u009b\4\2##++\4\299mm\4\2\u00ba\u00ba"+
		"\u0102\u0102\4\2\21\21UU\4\2RR\u012e\u012e\4\2nn\u00ad\u00ad\4\2RR\u00da"+
		"\u00da\4\2NN\u008a\u008a\5\2\u008e\u008e\u00b4\u00b4\u00d6\u00d7\4\2\u00af"+
		"\u00af\u00c1\u00c1\4\2\u00be\u00be\u0141\u0141\4\2\u00f5\u00f5\u012b\u012b"+
		"\4\2\u00b3\u00b3\u0175\u0175\4\2!!((\4\2&&@@\4\2DD\u00fb\u00fb\4\2\20"+
		"\20\u009b\u009b\3\2\u00ec\u00ed\3\2\u00dd\u00de\6\2??PP\u009a\u009a\u00d3"+
		"\u00d3\3\2hi\3\2ab\3\2\u0112\u0113\4\2\u00f6\u00f6\u011a\u011a\5\2RR\u0089"+
		"\u0089\u00d2\u00d2\6\2\16\17\u00bf\u00bf\u00e2\u00e2\u013f\u013f\3\2\u00c9"+
		"\u00ca\4\2\u0103\u0103\u0128\u0128\6\2\27\27\\\\\u00b0\u00b0\u0122\u0122"+
		"\4\2\u00b0\u00b0\u013b\u013b\4\2  \u0114\u0114\3\2\u0100\u0101\4\2\n\n"+
		"ZZ\5\2zz\u00a4\u00a4\u00ef\u00ef\5\2@@\u00f7\u00f8\u012f\u012f\5\2kk\u0106"+
		"\u0106\u012e\u012e\3\2UV\4\2\r\r\u00cd\u00cd\5\2\u00a5\u00a5\u00e6\u00e6"+
		"\u00f0\u00f0\5\2HI\u00b7\u00b8\u00fc\u00fd\4\2\66\66\u015e\u015e\5\2x"+
		"x\u009c\u009c\u00c4\u00c4\4\2\u015b\u015b\u0171\u0171\4\2oo\u0129\u0129"+
		"\16\2\b\33\35_cce\u00c4\u00c6\u00d7\u00d9\u00f4\u00f6\u0109\u010b\u0123"+
		"\u0125\u012a\u012d\u0138\u013b\u014c\u0153\u015a\u0ecf\2\u01cc\3\2\2\2"+
		"\4\u01d6\3\2\2\2\6\u01db\3\2\2\2\b\u01ef\3\2\2\2\n\u01f1\3\2\2\2\f\u01fd"+
		"\3\2\2\2\16\u023d\3\2\2\2\20\u023f\3\2\2\2\22\u0241\3\2\2\2\24\u0247\3"+
		"\2\2\2\26\u024d\3\2\2\2\30\u024f\3\2\2\2\32\u025f\3\2\2\2\34\u0264\3\2"+
		"\2\2\36\u0276\3\2\2\2 \u0278\3\2\2\2\"\u029d\3\2\2\2$\u02a7\3\2\2\2&\u02b2"+
		"\3\2\2\2(\u02c6\3\2\2\2*\u02c9\3\2\2\2,\u02cb\3\2\2\2.\u02d5\3\2\2\2\60"+
		"\u02de\3\2\2\2\62\u02e9\3\2\2\2\64\u02f8\3\2\2\2\66\u031d\3\2\2\28\u031f"+
		"\3\2\2\2:\u0327\3\2\2\2<\u0332\3\2\2\2>\u033b\3\2\2\2@\u033e\3\2\2\2B"+
		"\u034b\3\2\2\2D\u0355\3\2\2\2F\u0362\3\2\2\2H\u0381\3\2\2\2J\u0386\3\2"+
		"\2\2L\u03a4\3\2\2\2N\u03a6\3\2\2\2P\u03c8\3\2\2\2R\u0403\3\2\2\2T\u0405"+
		"\3\2\2\2V\u0412\3\2\2\2X\u0419\3\2\2\2Z\u041c\3\2\2\2\\\u0421\3\2\2\2"+
		"^\u042f\3\2\2\2`\u0443\3\2\2\2b\u0466\3\2\2\2d\u047a\3\2\2\2f\u0480\3"+
		"\2\2\2h\u0482\3\2\2\2j\u04a6\3\2\2\2l\u04ac\3\2\2\2n\u04c9\3\2\2\2p\u04cb"+
		"\3\2\2\2r\u04d0\3\2\2\2t\u04d2\3\2\2\2v\u0517\3\2\2\2x\u0546\3\2\2\2z"+
		"\u0548\3\2\2\2|\u055e\3\2\2\2~\u056c\3\2\2\2\u0080\u056e\3\2\2\2\u0082"+
		"\u0580\3\2\2\2\u0084\u0589\3\2\2\2\u0086\u0599\3\2\2\2\u0088\u05a5\3\2"+
		"\2\2\u008a\u05b1\3\2\2\2\u008c\u05c8\3\2\2\2\u008e\u05d1\3\2\2\2\u0090"+
		"\u05de\3\2\2\2\u0092\u05eb\3\2\2\2\u0094\u05f4\3\2\2\2\u0096\u0623\3\2"+
		"\2\2\u0098\u064f\3\2\2\2\u009a\u0652\3\2\2\2\u009c\u0661\3\2\2\2\u009e"+
		"\u0671\3\2\2\2\u00a0\u0673\3\2\2\2\u00a2\u0676\3\2\2\2\u00a4\u0693\3\2"+
		"\2\2\u00a6\u0695\3\2\2\2\u00a8\u06a5\3\2\2\2\u00aa\u06ac\3\2\2\2\u00ac"+
		"\u06b2\3\2\2\2\u00ae\u06b7\3\2\2\2\u00b0\u06ba\3\2\2\2\u00b2\u06bf\3\2"+
		"\2\2\u00b4\u06d0\3\2\2\2\u00b6\u06db\3\2\2\2\u00b8\u06e4\3\2\2\2\u00ba"+
		"\u06ef\3\2\2\2\u00bc\u06f8\3\2\2\2\u00be\u0705\3\2\2\2\u00c0\u0709\3\2"+
		"\2\2\u00c2\u070c\3\2\2\2\u00c4\u0714\3\2\2\2\u00c6\u071a\3\2\2\2\u00c8"+
		"\u071c\3\2\2\2\u00ca\u0722\3\2\2\2\u00cc\u0726\3\2\2\2\u00ce\u0733\3\2"+
		"\2\2\u00d0\u0738\3\2\2\2\u00d2\u073c\3\2\2\2\u00d4\u0747\3\2\2\2\u00d6"+
		"\u0750\3\2\2\2\u00d8\u075e\3\2\2\2\u00da\u0765\3\2\2\2\u00dc\u0771\3\2"+
		"\2\2\u00de\u0774\3\2\2\2\u00e0\u0782\3\2\2\2\u00e2\u0788\3\2\2\2\u00e4"+
		"\u079b\3\2\2\2\u00e6\u07b0\3\2\2\2\u00e8\u07b4\3\2\2\2\u00ea\u07be\3\2"+
		"\2\2\u00ec\u07c0\3\2\2\2\u00ee\u07c2\3\2\2\2\u00f0\u07c6\3\2\2\2\u00f2"+
		"\u07d9\3\2\2\2\u00f4\u07dd\3\2\2\2\u00f6\u07df\3\2\2\2\u00f8\u07fc\3\2"+
		"\2\2\u00fa\u07ff\3\2\2\2\u00fc\u0805\3\2\2\2\u00fe\u0807\3\2\2\2\u0100"+
		"\u0815\3\2\2\2\u0102\u0819\3\2\2\2\u0104\u0820\3\2\2\2\u0106\u0827\3\2"+
		"\2\2\u0108\u082e\3\2\2\2\u010a\u0831\3\2\2\2\u010c\u083d\3\2\2\2\u010e"+
		"\u0840\3\2\2\2\u0110\u0851\3\2\2\2\u0112\u0857\3\2\2\2\u0114\u085a\3\2"+
		"\2\2\u0116\u0878\3\2\2\2\u0118\u0880\3\2\2\2\u011a\u088f\3\2\2\2\u011c"+
		"\u08a7\3\2\2\2\u011e\u08a9\3\2\2\2\u0120\u08b3\3\2\2\2\u0122\u08b7\3\2"+
		"\2\2\u0124\u08c0\3\2\2\2\u0126\u08c9\3\2\2\2\u0128\u08d4\3\2\2\2\u012a"+
		"\u08e2\3\2\2\2\u012c\u08f0\3\2\2\2\u012e\u08f2\3\2\2\2\u0130\u090b\3\2"+
		"\2\2\u0132\u0918\3\2\2\2\u0134\u091a\3\2\2\2\u0136\u0927\3\2\2\2\u0138"+
		"\u0932\3\2\2\2\u013a\u0936\3\2\2\2\u013c\u093a\3\2\2\2\u013e\u0943\3\2"+
		"\2\2\u0140\u094e\3\2\2\2\u0142\u0950\3\2\2\2\u0144\u0954\3\2\2\2\u0146"+
		"\u0961\3\2\2\2\u0148\u096c\3\2\2\2\u014a\u096e\3\2\2\2\u014c\u0989\3\2"+
		"\2\2\u014e\u098b\3\2\2\2\u0150\u099c\3\2\2\2\u0152\u099e\3\2\2\2\u0154"+
		"\u09a1\3\2\2\2\u0156\u09ab\3\2\2\2\u0158\u09ae\3\2\2\2\u015a\u09b1\3\2"+
		"\2\2\u015c\u09c2\3\2\2\2\u015e\u09d1\3\2\2\2\u0160\u09d3\3\2\2\2\u0162"+
		"\u09dd\3\2\2\2\u0164\u09ed\3\2\2\2\u0166\u09f5\3\2\2\2\u0168\u09f8\3\2"+
		"\2\2\u016a\u0a09\3\2\2\2\u016c\u0a1e\3\2\2\2\u016e\u0a34\3\2\2\2\u0170"+
		"\u0a36\3\2\2\2\u0172\u0a42\3\2\2\2\u0174\u0a48\3\2\2\2\u0176\u0a57\3\2"+
		"\2\2\u0178\u0a65\3\2\2\2\u017a\u0a7e\3\2\2\2\u017c\u0a80\3\2\2\2\u017e"+
		"\u0a93\3\2\2\2\u0180\u0aa5\3\2\2\2\u0182\u0aa9\3\2\2\2\u0184\u0ab7\3\2"+
		"\2\2\u0186\u0aca\3\2\2\2\u0188\u0ae7\3\2\2\2\u018a\u0ae9\3\2\2\2\u018c"+
		"\u0aed\3\2\2\2\u018e\u0aef\3\2\2\2\u0190\u0b02\3\2\2\2\u0192\u0b06\3\2"+
		"\2\2\u0194\u0b08\3\2\2\2\u0196\u0b19\3\2\2\2\u0198\u0b29\3\2\2\2\u019a"+
		"\u0bc5\3\2\2\2\u019c\u0bc7\3\2\2\2\u019e\u0bc9\3\2\2\2\u01a0\u0bd3\3\2"+
		"\2\2\u01a2\u0ca5\3\2\2\2\u01a4\u0ca7\3\2\2\2\u01a6\u0cae\3\2\2\2\u01a8"+
		"\u0cb6\3\2\2\2\u01aa\u0cc2\3\2\2\2\u01ac\u0cc6\3\2\2\2\u01ae\u0cc8\3\2"+
		"\2\2\u01b0\u0cdb\3\2\2\2\u01b2\u0ce2\3\2\2\2\u01b4\u0ce7\3\2\2\2\u01b6"+
		"\u0cea\3\2\2\2\u01b8\u0cfb\3\2\2\2\u01ba\u0cfd\3\2\2\2\u01bc\u0d00\3\2"+
		"\2\2\u01be\u0d05\3\2\2\2\u01c0\u0d13\3\2\2\2\u01c2\u0d16\3\2\2\2\u01c4"+
		"\u0d1b\3\2\2\2\u01c6\u0d1f\3\2\2\2\u01c8\u0d21\3\2\2\2\u01ca\u0d23\3\2"+
		"\2\2\u01cc\u01cd\5\4\3\2\u01cd\u01ce\7\2\2\3\u01ce\3\3\2\2\2\u01cf\u01d2"+
		"\5\6\4\2\u01d0\u01d2\5\16\b\2\u01d1\u01cf\3\2\2\2\u01d1\u01d0\3\2\2\2"+
		"\u01d2\u01d4\3\2\2\2\u01d3\u01d5\7~\2\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5"+
		"\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d1\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\5\3\2\2\2\u01da\u01dc\5\60\31"+
		"\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de"+
		"\7\27\2\2\u01de\u01e0\5\4\3\2\u01df\u01e1\5\22\n\2\u01e0\u01df\3\2\2\2"+
		"\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\5\n\6\2\u01e3\7\3"+
		"\2\2\2\u01e4\u01e5\7\27\2\2\u01e5\u01e7\5\4\3\2\u01e6\u01e8\5\22\n\2\u01e7"+
		"\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\5\n"+
		"\6\2\u01ea\u01f0\3\2\2\2\u01eb\u01ed\5\16\b\2\u01ec\u01ee\7\u0170\2\2"+
		"\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01e4"+
		"\3\2\2\2\u01ef\u01eb\3\2\2\2\u01f0\t\3\2\2\2\u01f1\u01f2\6\6\2\2\u01f2"+
		"\u01f3\7d\2\2\u01f3\13\3\2\2\2\u01f4\u01fe\5\6\4\2\u01f5\u01f7\5\16\b"+
		"\2\u01f6\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9"+
		"\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01fc\7~\2\2\u01fb\u01fa\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01f4\3\2\2\2\u01fd\u01f6\3\2"+
		"\2\2\u01fe\r\3\2\2\2\u01ff\u023e\5\32\16\2\u0200\u023e\5$\23\2\u0201\u023e"+
		"\5p9\2\u0202\u023e\5&\24\2\u0203\u023e\5(\25\2\u0204\u023e\5*\26\2\u0205"+
		"\u023e\5,\27\2\u0206\u023e\5\u00d8m\2\u0207\u023e\5\u00dco\2\u0208\u023e"+
		"\5\u00dep\2\u0209\u023e\5\u00e2r\2\u020a\u023e\5\u00e4s\2\u020b\u023e"+
		"\5\u00eex\2\u020c\u023e\5\u0080A\2\u020d\u023e\5\u0084C\2\u020e\u023e"+
		"\5\u00f0y\2\u020f\u023e\5F$\2\u0210\u023e\5\u0088E\2\u0211\u023e\5\u008e"+
		"H\2\u0212\u023e\5\u0094K\2\u0213\u023e\5D#\2\u0214\u023e\5.\30\2\u0215"+
		"\u023e\5\u0170\u00b9\2\u0216\u023e\5\u0174\u00bb\2\u0217\u023e\5\u009e"+
		"P\2\u0218\u023e\5\u00a0Q\2\u0219\u023e\5\u00a2R\2\u021a\u023e\5\u00c2"+
		"b\2\u021b\u023e\5\u00d6l\2\u021c\u023e\5\u0118\u008d\2\u021d\u023e\5\u011a"+
		"\u008e\2\u021e\u023e\5\u00a4S\2\u021f\u023e\5\u00b0Y\2\u0220\u023e\5\u00b2"+
		"Z\2\u0221\u023e\5\u00ba^\2\u0222\u023e\5\u00c4c\2\u0223\u023e\5\u00cc"+
		"g\2\u0224\u023e\5\u00d0i\2\u0225\u023e\5\u00d2j\2\u0226\u023e\5\u0168"+
		"\u00b5\2\u0227\u023e\5\u00d4k\2\u0228\u023e\5\u00f8}\2\u0229\u023e\5\u00fa"+
		"~\2\u022a\u023e\5\u00fc\177\2\u022b\u023e\5\u00fe\u0080\2\u022c\u023e"+
		"\5\u0100\u0081\2\u022d\u023e\5\u0102\u0082\2\u022e\u023e\5\u0120\u0091"+
		"\2\u022f\u023e\5\u010c\u0087\2\u0230\u023e\5\u010e\u0088\2\u0231\u023e"+
		"\5\u0160\u00b1\2\u0232\u023e\5\u0112\u008a\2\u0233\u023e\5\u0110\u0089"+
		"\2\u0234\u023e\5\u0114\u008b\2\u0235\u023e\5\u0116\u008c\2\u0236\u023e"+
		"\5\u011c\u008f\2\u0237\u023e\5\u01ae\u00d8\2\u0238\u023e\5\u01b2\u00da"+
		"\2\u0239\u023e\5\26\f\2\u023a\u023e\5\30\r\2\u023b\u023e\5\20\t\2\u023c"+
		"\u023e\5\u00bc_\2\u023d\u01ff\3\2\2\2\u023d\u0200\3\2\2\2\u023d\u0201"+
		"\3\2\2\2\u023d\u0202\3\2\2\2\u023d\u0203\3\2\2\2\u023d\u0204\3\2\2\2\u023d"+
		"\u0205\3\2\2\2\u023d\u0206\3\2\2\2\u023d\u0207\3\2\2\2\u023d\u0208\3\2"+
		"\2\2\u023d\u0209\3\2\2\2\u023d\u020a\3\2\2\2\u023d\u020b\3\2\2\2\u023d"+
		"\u020c\3\2\2\2\u023d\u020d\3\2\2\2\u023d\u020e\3\2\2\2\u023d\u020f\3\2"+
		"\2\2\u023d\u0210\3\2\2\2\u023d\u0211\3\2\2\2\u023d\u0212\3\2\2\2\u023d"+
		"\u0213\3\2\2\2\u023d\u0214\3\2\2\2\u023d\u0215\3\2\2\2\u023d\u0216\3\2"+
		"\2\2\u023d\u0217\3\2\2\2\u023d\u0218\3\2\2\2\u023d\u0219\3\2\2\2\u023d"+
		"\u021a\3\2\2\2\u023d\u021b\3\2\2\2\u023d\u021c\3\2\2\2\u023d\u021d\3\2"+
		"\2\2\u023d\u021e\3\2\2\2\u023d\u021f\3\2\2\2\u023d\u0220\3\2\2\2\u023d"+
		"\u0221\3\2\2\2\u023d\u0222\3\2\2\2\u023d\u0223\3\2\2\2\u023d\u0224\3\2"+
		"\2\2\u023d\u0225\3\2\2\2\u023d\u0226\3\2\2\2\u023d\u0227\3\2\2\2\u023d"+
		"\u0228\3\2\2\2\u023d\u0229\3\2\2\2\u023d\u022a\3\2\2\2\u023d\u022b\3\2"+
		"\2\2\u023d\u022c\3\2\2\2\u023d\u022d\3\2\2\2\u023d\u022e\3\2\2\2\u023d"+
		"\u022f\3\2\2\2\u023d\u0230\3\2\2\2\u023d\u0231\3\2\2\2\u023d\u0232\3\2"+
		"\2\2\u023d\u0233\3\2\2\2\u023d\u0234\3\2\2\2\u023d\u0235\3\2\2\2\u023d"+
		"\u0236\3\2\2\2\u023d\u0237\3\2\2\2\u023d\u0238\3\2\2\2\u023d\u0239\3\2"+
		"\2\2\u023d\u023a\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023c\3\2\2\2\u023e"+
		"\17\3\2\2\2\u023f\u0240\t\2\2\2\u0240\21\3\2\2\2\u0241\u0243\7j\2\2\u0242"+
		"\u0244\5\24\13\2\u0243\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0243\3"+
		"\2\2\2\u0245\u0246\3\2\2\2\u0246\23\3\2\2\2\u0247\u0248\7\u0139\2\2\u0248"+
		"\u0249\7\u0172\2\2\u0249\u024a\7\u0122\2\2\u024a\u024b\5\4\3\2\u024b\u024c"+
		"\n\3\2\2\u024c\25\3\2\2\2\u024d\u024e\7\u00c5\2\2\u024e\27\3\2\2\2\u024f"+
		"\u0250\6\r\3\2\u0250\u0251\5\u0186\u00c4\2\u0251\31\3\2\2\2\u0252\u0253"+
		"\7\u0102\2\2\u0253\u0260\5\u0104\u0083\2\u0254\u0256\7\u0102\2\2\u0255"+
		"\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u025c\5\34"+
		"\17\2\u0258\u0259\7\u015d\2\2\u0259\u025b\5\34\17\2\u025a\u0258\3\2\2"+
		"\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u0260"+
		"\3\2\2\2\u025e\u025c\3\2\2\2\u025f\u0252\3\2\2\2\u025f\u0255\3\2\2\2\u0260"+
		"\33\3\2\2\2\u0261\u0265\5\36\20\2\u0262\u0265\5 \21\2\u0263\u0265\5\""+
		"\22\2\u0264\u0261\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0263\3\2\2\2\u0265"+
		"\35\3\2\2\2\u0266\u0268\5\u01be\u00e0\2\u0267\u0269\7\u015c\2\2\u0268"+
		"\u0267\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\7\u0161"+
		"\2\2\u026b\u026c\5\u0186\u00c4\2\u026c\u0277\3\2\2\2\u026d\u026e\7\u016b"+
		"\2\2\u026e\u026f\5\u01be\u00e0\2\u026f\u0271\7\u016e\2\2\u0270\u0272\7"+
		"\u015c\2\2\u0271\u0270\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\3\2\2\2"+
		"\u0273\u0274\7\u0161\2\2\u0274\u0275\5\u0186\u00c4\2\u0275\u0277\3\2\2"+
		"\2\u0276\u0266\3\2\2\2\u0276\u026d\3\2\2\2\u0277\37\3\2\2\2\u0278\u0279"+
		"\7\u016b\2\2\u0279\u027e\5\u01be\u00e0\2\u027a\u027b\7\u015d\2\2\u027b"+
		"\u027d\5\u01be\u00e0\2\u027c\u027a\3\2\2\2\u027d\u0280\3\2\2\2\u027e\u027c"+
		"\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0281\3\2\2\2\u0280\u027e\3\2\2\2\u0281"+
		"\u0283\7\u016e\2\2\u0282\u0284\7\u015c\2\2\u0283\u0282\3\2\2\2\u0283\u0284"+
		"\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\7\u0161\2\2\u0286\u0287\7\u016b"+
		"\2\2\u0287\u028c\5\u0186\u00c4\2\u0288\u0289\7\u015d\2\2\u0289\u028b\5"+
		"\u0186\u00c4\2\u028a\u0288\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2"+
		"\2\2\u028c\u028d\3\2\2\2\u028d\u028f\3\2\2\2\u028e\u028c\3\2\2\2\u028f"+
		"\u0290\7\u016e\2\2\u0290!\3\2\2\2\u0291\u029e\5\u01be\u00e0\2\u0292\u0293"+
		"\7\u016b\2\2\u0293\u0298\5\u01be\u00e0\2\u0294\u0295\7\u015d\2\2\u0295"+
		"\u0297\5\u01be\u00e0\2\u0296\u0294\3\2\2\2\u0297\u029a\3\2\2\2\u0298\u0296"+
		"\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029b\3\2\2\2\u029a\u0298\3\2\2\2\u029b"+
		"\u029c\7\u016e\2\2\u029c\u029e\3\2\2\2\u029d\u0291\3\2\2\2\u029d\u0292"+
		"\3\2\2\2\u029e\u02a0\3\2\2\2\u029f\u02a1\7\u015c\2\2\u02a0\u029f\3\2\2"+
		"\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\7\u0161\2\2\u02a3"+
		"\u02a4\7\u016b\2\2\u02a4\u02a5\5\u0120\u0091\2\u02a5\u02a6\7\u016e\2\2"+
		"\u02a6#\3\2\2\2\u02a7\u02a8\7\13\2\2\u02a8\u02a9\5\u01be\u00e0\2\u02a9"+
		"\u02aa\7C\2\2\u02aa\u02ae\7u\2\2\u02ab\u02ac\7\u00ea\2\2\u02ac\u02af\7"+
		"\u0102\2\2\u02ad\u02af\7\u00de\2\2\u02ae\u02ab\3\2\2\2\u02ae\u02ad\3\2"+
		"\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b1\5\u01be\u00e0\2\u02b1%\3\2\2\2\u02b2"+
		"\u02b5\7\22\2\2\u02b3\u02b4\7\u00ea\2\2\u02b4\u02b6\7\u0102\2\2\u02b5"+
		"\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\t\4"+
		"\2\2\u02b8\u02b9\7\u016b\2\2\u02b9\u02be\5\u01be\u00e0\2\u02ba\u02bb\7"+
		"\u015d\2\2\u02bb\u02bd\5\u01be\u00e0\2\u02bc\u02ba\3\2\2\2\u02bd\u02c0"+
		"\3\2\2\2\u02be\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c1\3\2\2\2\u02c0"+
		"\u02be\3\2\2\2\u02c1\u02c2\7\u016e\2\2\u02c2\u02c3\7\u013c\2\2\u02c3\u02c4"+
		"\7\u00de\2\2\u02c4\u02c5\5\u01be\u00e0\2\u02c5\'\3\2\2\2\u02c6\u02c7\7"+
		"\27\2\2\u02c7\u02c8\7\u0128\2\2\u02c8)\3\2\2\2\u02c9\u02ca\7\37\2\2\u02ca"+
		"+\3\2\2\2\u02cb\u02cc\7\"\2\2\u02cc\u02d3\5\u01be\u00e0\2\u02cd\u02cf"+
		"\7\u016b\2\2\u02ce\u02d0\5\u01a6\u00d4\2\u02cf\u02ce\3\2\2\2\u02cf\u02d0"+
		"\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d4\7\u016e\2\2\u02d2\u02d4\5\u01a6"+
		"\u00d4\2\u02d3\u02cd\3\2\2\2\u02d3\u02d2\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4"+
		"-\3\2\2\2\u02d5\u02d6\7L\2\2\u02d6\u02db\5\64\33\2\u02d7\u02d8\7\u015d"+
		"\2\2\u02d8\u02da\5\64\33\2\u02d9\u02d7\3\2\2\2\u02da\u02dd\3\2\2\2\u02db"+
		"\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc/\3\2\2\2\u02dd\u02db\3\2\2\2"+
		"\u02de\u02df\7L\2\2\u02df\u02e0\5\64\33\2\u02e0\u02e6\7\u0170\2\2\u02e1"+
		"\u02e2\5\64\33\2\u02e2\u02e3\7\u0170\2\2\u02e3\u02e5\3\2\2\2\u02e4\u02e1"+
		"\3\2\2\2\u02e5\u02e8\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7"+
		"\61\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e9\u02ea\5\64\33\2\u02ea\u02f0\7\u0170"+
		"\2\2\u02eb\u02ec\5\64\33\2\u02ec\u02ed\7\u0170\2\2\u02ed\u02ef\3\2\2\2"+
		"\u02ee\u02eb\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02f1"+
		"\3\2\2\2\u02f1\63\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f3\u02f9\5:\36\2\u02f4"+
		"\u02f9\58\35\2\u02f5\u02f9\5@!\2\u02f6\u02f9\5\66\34\2\u02f7\u02f9\5B"+
		"\"\2\u02f8\u02f3\3\2\2\2\u02f8\u02f4\3\2\2\2\u02f8\u02f5\3\2\2\2\u02f8"+
		"\u02f6\3\2\2\2\u02f8\u02f7\3\2\2\2\u02f9\65\3\2\2\2\u02fa\u02ff\5\u01be"+
		"\u00e0\2\u02fb\u02fc\7\u015d\2\2\u02fc\u02fe\5\u01be\u00e0\2\u02fd\u02fb"+
		"\3\2\2\2\u02fe\u0301\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300"+
		"\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0302\u0304\7\20\2\2\u0303\u0302\3"+
		"\2\2\2\u0303\u0304\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0307\5x=\2\u0306"+
		"\u0308\5z>\2\u0307\u0306\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u030c\3\2\2"+
		"\2\u0309\u030b\5|?\2\u030a\u0309\3\2\2\2\u030b\u030e\3\2\2\2\u030c\u030a"+
		"\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u0310\3\2\2\2\u030e\u030c\3\2\2\2\u030f"+
		"\u0311\5~@\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u031e\3\2\2"+
		"\2\u0312\u0313\5\u01be\u00e0\2\u0313\u0315\7\63\2\2\u0314\u0316\7\20\2"+
		"\2\u0315\u0314\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0319"+
		"\5x=\2\u0318\u031a\5z>\2\u0319\u0318\3\2\2\2\u0319\u031a\3\2\2\2\u031a"+
		"\u031b\3\2\2\2\u031b\u031c\5~@\2\u031c\u031e\3\2\2\2\u031d\u02fa\3\2\2"+
		"\2\u031d\u0312\3\2\2\2\u031e\67\3\2\2\2\u031f\u0320\5\u01be\u00e0\2\u0320"+
		"\u0321\7\67\2\2\u03219\3\2\2\2\u0322\u0323\7C\2\2\u0323\u0328\5\u01be"+
		"\u00e0\2\u0324\u0325\5\u01be\u00e0\2\u0325\u0326\7C\2\2\u0326\u0328\3"+
		"\2\2\2\u0327\u0322\3\2\2\2\u0327\u0324\3\2\2\2\u0328\u032b\3\2\2\2\u0329"+
		"\u032c\5<\37\2\u032a\u032c\5> \2\u032b\u0329\3\2\2\2\u032b\u032a\3\2\2"+
		"\2\u032b\u032c\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u0330\t\5\2\2\u032e\u0331"+
		"\5\u0120\u0091\2\u032f\u0331\5\u0186\u00c4\2\u0330\u032e\3\2\2\2\u0330"+
		"\u032f\3\2\2\2\u0331;\3\2\2\2\u0332\u0333\7\u013c\2\2\u0333\u0335\7\u00ec"+
		"\2\2\u0334\u0336\7\u00cb\2\2\u0335\u0334\3\2\2\2\u0335\u0336\3\2\2\2\u0336"+
		"\u0339\3\2\2\2\u0337\u0338\7\u0126\2\2\u0338\u033a\t\6\2\2\u0339\u0337"+
		"\3\2\2\2\u0339\u033a\3\2\2\2\u033a=\3\2\2\2\u033b\u033c\7\u013d\2\2\u033c"+
		"\u033d\7\u00ec\2\2\u033d?\3\2\2\2\u033e\u033f\t\7\2\2\u033f\u0340\7\u0081"+
		"\2\2\u0340\u0346\7u\2\2\u0341\u0347\7\u010e\2\2\u0342\u0347\7\u0111\2"+
		"\2\u0343\u0344\7\u00c3\2\2\u0344\u0347\7x\2\2\u0345\u0347\5\u01be\u00e0"+
		"\2\u0346\u0341\3\2\2\2\u0346\u0342\3\2\2\2\u0346\u0343\3\2\2\2\u0346\u0345"+
		"\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\5\b\5\2\u0349A\3\2\2\2\u034a"+
		"\u034c\7}\2\2\u034b\u034a\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034d\3\2"+
		"\2\2\u034d\u034e\7\u011f\2\2\u034e\u034f\7\u011d\2\2\u034f\u0351\5\u01be"+
		"\u00e0\2\u0350\u0352\5V,\2\u0351\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352"+
		"\u0353\3\2\2\2\u0353\u0354\5H%\2\u0354C\3\2\2\2\u0355\u0356\7=\2\2\u0356"+
		"\u035a\7\u011d\2\2\u0357\u0358\7\u0088\2\2\u0358\u0359\7\u00c3\2\2\u0359"+
		"\u035b\7l\2\2\u035a\u0357\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035c\3\2"+
		"\2\2\u035c\u035e\5\u0150\u00a9\2\u035d\u035f\5V,\2\u035e\u035d\3\2\2\2"+
		"\u035e\u035f\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\5H%\2\u0361E\3\2"+
		"\2\2\u0362\u0369\7=\2\2\u0363\u0364\7\u00a8\2\2\u0364\u036a\7\u011f\2"+
		"\2\u0365\u0367\t\b\2\2\u0366\u0365\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0368"+
		"\3\2\2\2\u0368\u036a\7\u0138\2\2\u0369\u0363\3\2\2\2\u0369\u0366\3\2\2"+
		"\2\u036a\u036b\3\2\2\2\u036b\u036c\7\u011d\2\2\u036c\u036e\5\u01be\u00e0"+
		"\2\u036d\u036f\5V,\2\u036e\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0370"+
		"\3\2\2\2\u0370\u0371\5H%\2\u0371G\3\2\2\2\u0372\u0374\7\20\2\2\u0373\u0372"+
		"\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376\7\u016b\2"+
		"\2\u0376\u0377\5\u0120\u0091\2\u0377\u0378\7\u016e\2\2\u0378\u0382\3\2"+
		"\2\2\u0379\u037b\7\20\2\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b"+
		"\u037c\3\2\2\2\u037c\u0382\5\u0120\u0091\2\u037d\u037e\7\u016b\2\2\u037e"+
		"\u037f\5J&\2\u037f\u0380\7\u016e\2\2\u0380\u0382\3\2\2\2\u0381\u0373\3"+
		"\2\2\2\u0381\u037a\3\2\2\2\u0381\u037d\3\2\2\2\u0382\u0384\3\2\2\2\u0383"+
		"\u0385\5\\/\2\u0384\u0383\3\2\2\2\u0384\u0385\3\2\2\2\u0385I\3\2\2\2\u0386"+
		"\u038b\5L\'\2\u0387\u0388\7\u015d\2\2\u0388\u038a\5L\'\2\u0389\u0387\3"+
		"\2\2\2\u038a\u038d\3\2\2\2\u038b\u0389\3\2\2\2\u038b\u038c\3\2\2\2\u038c"+
		"K\3\2\2\2\u038d\u038b\3\2\2\2\u038e\u038f\5N(\2\u038f\u0391\5x=\2\u0390"+
		"\u0392\5z>\2\u0391\u0390\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0396\3\2\2"+
		"\2\u0393\u0395\5|?\2\u0394\u0393\3\2\2\2\u0395\u0398\3\2\2\2\u0396\u0394"+
		"\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u039c\3\2\2\2\u0398\u0396\3\2\2\2\u0399"+
		"\u039b\5P)\2\u039a\u0399\3\2\2\2\u039b\u039e\3\2\2\2\u039c\u039a\3\2\2"+
		"\2\u039c\u039d\3\2\2\2\u039d\u03a5\3\2\2\2\u039e\u039c\3\2\2\2\u039f\u03a0"+
		"\78\2\2\u03a0\u03a2\5\u01be\u00e0\2\u03a1\u039f\3\2\2\2\u03a1\u03a2\3"+
		"\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a5\5R*\2\u03a4\u038e\3\2\2\2\u03a4"+
		"\u03a1\3\2\2\2\u03a5M\3\2\2\2\u03a6\u03a7\5\u01be\u00e0\2\u03a7O\3\2\2"+
		"\2\u03a8\u03c9\5~@\2\u03a9\u03ab\7\u00c3\2\2\u03aa\u03a9\3\2\2\2\u03aa"+
		"\u03ab\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03c9\7\u00c5\2\2\u03ad\u03ae"+
		"\7\u00db\2\2\u03ae\u03c9\7\u00a0\2\2\u03af\u03c9\7\u012d\2\2\u03b0\u03b1"+
		"\7\u00e5\2\2\u03b1\u03b2\5\u0150\u00a9\2\u03b2\u03b3\7\u016b\2\2\u03b3"+
		"\u03b4\5\u01be\u00e0\2\u03b4\u03b8\7\u016e\2\2\u03b5\u03b7\5T+\2\u03b6"+
		"\u03b5\3\2\2\2\u03b7\u03ba\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b8\u03b9\3\2"+
		"\2\2\u03b9\u03c9\3\2\2\2\u03ba\u03b8\3\2\2\2\u03bb\u03bc\7\u0087\2\2\u03bc"+
		"\u03bd\7\u016b\2\2\u03bd\u03c2\7\u0175\2\2\u03be\u03bf\7\u015d\2\2\u03bf"+
		"\u03c1\7\u0175\2\2\u03c0\u03be\3\2\2\2\u03c1\u03c4\3\2\2\2\u03c2\u03c0"+
		"\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c5\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c5"+
		"\u03c9\7\u016e\2\2\u03c6\u03c9\7\24\2\2\u03c7\u03c9\7c\2\2\u03c8\u03a8"+
		"\3\2\2\2\u03c8\u03aa\3\2\2\2\u03c8\u03ad\3\2\2\2\u03c8\u03af\3\2\2\2\u03c8"+
		"\u03b0\3\2\2\2\u03c8\u03bb\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c8\u03c7\3\2"+
		"\2\2\u03c9Q\3\2\2\2\u03ca\u03cb\7\u00db\2\2\u03cb\u03cd\7\u00a0\2\2\u03cc"+
		"\u03ce\7-\2\2\u03cd\u03cc\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03cf\3\2"+
		"\2\2\u03cf\u03d0\7\u016b\2\2\u03d0\u03d2\5\u01be\u00e0\2\u03d1\u03d3\t"+
		"\t\2\2\u03d2\u03d1\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03db\3\2\2\2\u03d4"+
		"\u03d5\7\u015d\2\2\u03d5\u03d7\5\u01be\u00e0\2\u03d6\u03d8\t\t\2\2\u03d7"+
		"\u03d6\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03da\3\2\2\2\u03d9\u03d4\3\2"+
		"\2\2\u03da\u03dd\3\2\2\2\u03db\u03d9\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc"+
		"\u03de\3\2\2\2\u03dd\u03db\3\2\2\2\u03de\u03e0\7\u016e\2\2\u03df\u03e1"+
		"\7c\2\2\u03e0\u03df\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e3\3\2\2\2\u03e2"+
		"\u03e4\5\u00f4{\2\u03e3\u03e2\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u0404"+
		"\3\2\2\2\u03e5\u03e6\7v\2\2\u03e6\u03e7\7\u00a0\2\2\u03e7\u03e8\7\u016b"+
		"\2\2\u03e8\u03ed\5\u01be\u00e0\2\u03e9\u03ea\7\u015d\2\2\u03ea\u03ec\5"+
		"\u01be\u00e0\2\u03eb\u03e9\3\2\2\2\u03ec\u03ef\3\2\2\2\u03ed\u03eb\3\2"+
		"\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03f0\3\2\2\2\u03ef\u03ed\3\2\2\2\u03f0"+
		"\u03f1\7\u016e\2\2\u03f1\u03f2\7\u00e5\2\2\u03f2\u03f3\5\u0150\u00a9\2"+
		"\u03f3\u03f4\7\u016b\2\2\u03f4\u03f9\5\u01be\u00e0\2\u03f5\u03f6\7\u015d"+
		"\2\2\u03f6\u03f8\5\u01be\u00e0\2\u03f7\u03f5\3\2\2\2\u03f8\u03fb\3\2\2"+
		"\2\u03f9\u03f7\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fc\3\2\2\2\u03fb\u03f9"+
		"\3\2\2\2\u03fc\u0400\7\u016e\2\2\u03fd\u03ff\5T+\2\u03fe\u03fd\3\2\2\2"+
		"\u03ff\u0402\3\2\2\2\u0400\u03fe\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0404"+
		"\3\2\2\2\u0402\u0400\3\2\2\2\u0403\u03ca\3\2\2\2\u0403\u03e5\3\2\2\2\u0404"+
		"S\3\2\2\2\u0405\u0406\7\u00ca\2\2\u0406\u040f\t\n\2\2\u0407\u0408\7\u00be"+
		"\2\2\u0408\u0410\7\b\2\2\u0409\u0410\7\u00e9\2\2\u040a\u040b\7\u0102\2"+
		"\2\u040b\u0410\7\u00c5\2\2\u040c\u040d\7\u0102\2\2\u040d\u0410\7M\2\2"+
		"\u040e\u0410\7$\2\2\u040f\u0407\3\2\2\2\u040f\u0409\3\2\2\2\u040f\u040a"+
		"\3\2\2\2\u040f\u040c\3\2\2\2\u040f\u040e\3\2\2\2\u0410U\3\2\2\2\u0411"+
		"\u0413\5X-\2\u0412\u0411\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0412\3\2\2"+
		"\2\u0414\u0415\3\2\2\2\u0415W\3\2\2\2\u0416\u0417\7\u015d\2\2\u0417\u041a"+
		"\5Z.\2\u0418\u041a\5f\64\2\u0419\u0416\3\2\2\2\u0419\u0418\3\2\2\2\u041a"+
		"Y\3\2\2\2\u041b\u041d\7\u00be\2\2\u041c\u041b\3\2\2\2\u041c\u041d\3\2"+
		"\2\2\u041d\u041e\3\2\2\2\u041e\u041f\t\13\2\2\u041f[\3\2\2\2\u0420\u0422"+
		"\5^\60\2\u0421\u0420\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0421\3\2\2\2\u0423"+
		"\u0424\3\2\2\2\u0424]\3\2\2\2\u0425\u0426\7\u00ca\2\2\u0426\u0427\7\64"+
		"\2\2\u0427\u0428\t\f\2\2\u0428\u0430\7\u00f4\2\2\u0429\u0430\5`\61\2\u042a"+
		"\u0430\5b\62\2\u042b\u0430\5d\63\2\u042c\u0430\5f\64\2\u042d\u0430\5l"+
		"\67\2\u042e\u0430\5n8\2\u042f\u0425\3\2\2\2\u042f\u0429\3\2\2\2\u042f"+
		"\u042a\3\2\2\2\u042f\u042b\3\2\2\2\u042f\u042c\3\2\2\2\u042f\u042d\3\2"+
		"\2\2\u042f\u042e\3\2\2\2\u0430_\3\2\2\2\u0431\u0432\7\u00ff\2\2\u0432"+
		"\u0433\7>\2\2\u0433\u0444\t\r\2\2\u0434\u0435\t\16\2\2\u0435\u0444\7\u0175"+
		"\2\2\u0436\u0444\7\u00c0\2\2\u0437\u0444\t\17\2\2\u0438\u0439\7\u0115"+
		"\2\2\u0439\u043c\7\u016b\2\2\u043a\u043d\5\u01be\u00e0\2\u043b\u043d\7"+
		"\u0175\2\2\u043c\u043a\3\2\2\2\u043c\u043b\3\2\2\2\u043d\u043e\3\2\2\2"+
		"\u043e\u043c\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0444"+
		"\7\u016e\2\2\u0441\u0442\7\u011e\2\2\u0442\u0444\5\u01be\u00e0\2\u0443"+
		"\u0431\3\2\2\2\u0443\u0434\3\2\2\2\u0443\u0436\3\2\2\2\u0443\u0437\3\2"+
		"\2\2\u0443\u0438\3\2\2\2\u0443\u0441\3\2\2\2\u0444a\3\2\2\2\u0445\u0447"+
		"\7\u008d\2\2\u0446\u0445\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0448\3\2\2"+
		"\2\u0448\u0449\7\u008b\2\2\u0449\u0467\5\u01be\u00e0\2\u044a\u044b\7\u013c"+
		"\2\2\u044b\u0467\7\u00e7\2\2\u044c\u044d\7[\2\2\u044d\u044e\7 \2\2\u044e"+
		"\u044f\7\u0082\2\2\u044f\u0450\7\u016b\2\2\u0450\u0455\5\u01be\u00e0\2"+
		"\u0451\u0452\7\u015d\2\2\u0452\u0454\5\u01be\u00e0\2\u0453\u0451\3\2\2"+
		"\2\u0454\u0457\3\2\2\2\u0455\u0453\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0458"+
		"\3\2\2\2\u0457\u0455\3\2\2\2\u0458\u0459\7\u016e\2\2\u0459\u0467\3\2\2"+
		"\2\u045a\u045c\7\u00c3\2\2\u045b\u045a\3\2\2\2\u045b\u045c\3\2\2\2\u045c"+
		"\u045d\3\2\2\2\u045d\u0467\7\u00ae\2\2\u045e\u045f\7\65\2\2\u045f\u0467"+
		"\t\20\2\2\u0460\u0461\7Q\2\2\u0461\u0467\7\u00cb\2\2\u0462\u0463\7\u013c"+
		"\2\2\u0463\u0464\7\u00e9\2\2\u0464\u0465\7\u00ca\2\2\u0465\u0467\7^\2"+
		"\2\u0466\u0446\3\2\2\2\u0466\u044a\3\2\2\2\u0466\u044c\3\2\2\2\u0466\u045b"+
		"\3\2\2\2\u0466\u045e\3\2\2\2\u0466\u0460\3\2\2\2\u0466\u0462\3\2\2\2\u0467"+
		"c\3\2\2\2\u0468\u046a\7\u012d\2\2\u0469\u0468\3\2\2\2\u0469\u046a\3\2"+
		"\2\2\u046a\u046b\3\2\2\2\u046b\u046c\7\u00db\2\2\u046c\u046d\7\u008d\2"+
		"\2\u046d\u046e\7\u016b\2\2\u046e\u0473\5\u01be\u00e0\2\u046f\u0470\7\u015d"+
		"\2\2\u0470\u0472\5\u01be\u00e0\2\u0471\u046f\3\2\2\2\u0472\u0475\3\2\2"+
		"\2\u0473\u0471\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0476\3\2\2\2\u0475\u0473"+
		"\3\2\2\2\u0476\u0477\7\u016e\2\2\u0477\u047b\3\2\2\2\u0478\u0479\7\u013c"+
		"\2\2\u0479\u047b\7E\2\2\u047a\u0469\3\2\2\2\u047a\u0478\3\2\2\2\u047b"+
		"e\3\2\2\2\u047c\u0481\5h\65\2\u047d\u047e\7\u0116\2\2\u047e\u047f\7\20"+
		"\2\2\u047f\u0481\5\u01be\u00e0\2\u0480\u047c\3\2\2\2\u0480\u047d\3\2\2"+
		"\2\u0481g\3\2\2\2\u0482\u0483\7\u00f3\2\2\u0483\u0484\7w\2\2\u0484\u0488"+
		"\7S\2\2\u0485\u0487\5j\66\2\u0486\u0485\3\2\2\2\u0487\u048a\3\2\2\2\u0488"+
		"\u0486\3\2\2\2\u0488\u0489\3\2\2\2\u0489i\3\2\2\2\u048a\u0488\3\2\2\2"+
		"\u048b\u048c\7q\2\2\u048c\u048d\7\u0120\2\2\u048d\u048e\7 \2\2\u048e\u0492"+
		"\5\u0186\u00c4\2\u048f\u0490\7f\2\2\u0490\u0491\7 \2\2\u0491\u0493\5\u0186"+
		"\u00c4\2\u0492\u048f\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u04a7\3\2\2\2\u0494"+
		"\u0495\7\60\2\2\u0495\u0496\7\u009d\2\2\u0496\u0497\7\u0120\2\2\u0497"+
		"\u0498\7 \2\2\u0498\u04a7\5\u0186\u00c4\2\u0499\u049a\7\u00b1\2\2\u049a"+
		"\u049b\7\u00a1\2\2\u049b\u049c\7\u0120\2\2\u049c\u049d\7 \2\2\u049d\u04a7"+
		"\5\u0186\u00c4\2\u049e\u049f\7\u00a7\2\2\u049f\u04a0\7\u0120\2\2\u04a0"+
		"\u04a1\7 \2\2\u04a1\u04a7\5\u0186\u00c4\2\u04a2\u04a3\7\u00c5\2\2\u04a3"+
		"\u04a4\7O\2\2\u04a4\u04a5\7\20\2\2\u04a5\u04a7\5\u0186\u00c4\2\u04a6\u048b"+
		"\3\2\2\2\u04a6\u0494\3\2\2\2\u04a6\u0499\3\2\2\2\u04a6\u049e\3\2\2\2\u04a6"+
		"\u04a2\3\2\2\2\u04a7k\3\2\2\2\u04a8\u04a9\7\u00ca\2\2\u04a9\u04ad\5\u01be"+
		"\u00e0\2\u04aa\u04ab\7\u0121\2\2\u04ab\u04ad\5\u01be\u00e0\2\u04ac\u04a8"+
		"\3\2\2\2\u04ac\u04aa\3\2\2\2\u04adm\3\2\2\2\u04ae\u04b0\7\24\2\2\u04af"+
		"\u04b1\7\u0161\2\2\u04b0\u04af\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b2"+
		"\3\2\2\2\u04b2\u04ca\5\u0186\u00c4\2\u04b3\u04b5\7\62\2\2\u04b4\u04b6"+
		"\7\u0161\2\2\u04b5\u04b4\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b7\3\2\2"+
		"\2\u04b7\u04ca\5\u0186\u00c4\2\u04b8\u04ba\7M\2\2\u04b9\u04b8\3\2\2\2"+
		"\u04b9\u04ba\3\2\2\2\u04ba\u04be\3\2\2\2\u04bb\u04bc\7)\2\2\u04bc\u04bf"+
		"\7\u0102\2\2\u04bd\u04bf\7*\2\2\u04be\u04bb\3\2\2\2\u04be\u04bd\3\2\2"+
		"\2\u04bf\u04c1\3\2\2\2\u04c0\u04c2\7\u0161\2\2\u04c1\u04c0\3\2\2\2\u04c1"+
		"\u04c2\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04ca\5\u0186\u00c4\2\u04c4\u04c6"+
		"\7e\2\2\u04c5\u04c7\7\u0161\2\2\u04c6\u04c5\3\2\2\2\u04c6\u04c7\3\2\2"+
		"\2\u04c7\u04c8\3\2\2\2\u04c8\u04ca\5\u0186\u00c4\2\u04c9\u04ae\3\2\2\2"+
		"\u04c9\u04b3\3\2\2\2\u04c9\u04b9\3\2\2\2\u04c9\u04c4\3\2\2\2\u04cao\3"+
		"\2\2\2\u04cb\u04cc\7\f\2\2\u04cc\u04cd\7\u011d\2\2\u04cd\u04ce\5\u0150"+
		"\u00a9\2\u04ce\u04cf\5r:\2\u04cfq\3\2\2\2\u04d0\u04d1\5t;\2\u04d1s\3\2"+
		"\2\2\u04d2\u04d5\7\t\2\2\u04d3\u04d4\78\2\2\u04d4\u04d6\5\u01be\u00e0"+
		"\2\u04d5\u04d3\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04d8"+
		"\5v<\2\u04d8u\3\2\2\2\u04d9\u04da\7\u00db\2\2\u04da\u04dc\7\u00a0\2\2"+
		"\u04db\u04dd\7-\2\2\u04dc\u04db\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04de"+
		"\3\2\2\2\u04de\u04df\7\u016b\2\2\u04df\u04e1\5\u01be\u00e0\2\u04e0\u04e2"+
		"\t\t\2\2\u04e1\u04e0\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04ea\3\2\2\2\u04e3"+
		"\u04e4\7\u015d\2\2\u04e4\u04e6\5\u01be\u00e0\2\u04e5\u04e7\t\t\2\2\u04e6"+
		"\u04e5\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e9\3\2\2\2\u04e8\u04e3\3\2"+
		"\2\2\u04e9\u04ec\3\2\2\2\u04ea\u04e8\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb"+
		"\u04ed\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ed\u04ef\7\u016e\2\2\u04ee\u04f0"+
		"\7c\2\2\u04ef\u04ee\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f2\3\2\2\2\u04f1"+
		"\u04f3\5\u00f4{\2\u04f2\u04f1\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u0518"+
		"\3\2\2\2\u04f4\u04f5\7v\2\2\u04f5\u04f6\7\u00a0\2\2\u04f6\u04f7\7\u016b"+
		"\2\2\u04f7\u04fc\5\u01be\u00e0\2\u04f8\u04f9\7\u015d\2\2\u04f9\u04fb\5"+
		"\u01be\u00e0\2\u04fa\u04f8\3\2\2\2\u04fb\u04fe\3\2\2\2\u04fc\u04fa\3\2"+
		"\2\2\u04fc\u04fd\3\2\2\2\u04fd\u04ff\3\2\2\2\u04fe\u04fc\3\2\2\2\u04ff"+
		"\u0500\7\u016e\2\2\u0500\u0501\7\u00e5\2\2\u0501\u0502\5\u0150\u00a9\2"+
		"\u0502\u0503\7\u016b\2\2\u0503\u0508\5\u01be\u00e0\2\u0504\u0505\7\u015d"+
		"\2\2\u0505\u0507\5\u01be\u00e0\2\u0506\u0504\3\2\2\2\u0507\u050a\3\2\2"+
		"\2\u0508\u0506\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u050b\3\2\2\2\u050a\u0508"+
		"\3\2\2\2\u050b\u050f\7\u016e\2\2\u050c\u050e\5T+\2\u050d\u050c\3\2\2\2"+
		"\u050e\u0511\3\2\2\2\u050f\u050d\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0518"+
		"\3\2\2\2\u0511\u050f\3\2\2\2\u0512\u0513\7M\2\2\u0513\u0514\5\u0186\u00c4"+
		"\2\u0514\u0515\7u\2\2\u0515\u0516\5\u01be\u00e0\2\u0516\u0518\3\2\2\2"+
		"\u0517\u04d9\3\2\2\2\u0517\u04f4\3\2\2\2\u0517\u0512\3\2\2\2\u0518w\3"+
		"\2\2\2\u0519\u0547\7(\2\2\u051a\u0547\7\31\2\2\u051b\u0547\7\32\2\2\u051c"+
		"\u0547\7\33\2\2\u051d\u0547\7\34\2\2\u051e\u0547\7\35\2\2\u051f\u0547"+
		"\7F\2\2\u0520\u0547\7G\2\2\u0521\u0547\7J\2\2\u0522\u0547\7K\2\2\u0523"+
		"\u0525\7]\2\2\u0524\u0526\7\u00d9\2\2\u0525\u0524\3\2\2\2\u0525\u0526"+
		"\3\2\2\2\u0526\u0547\3\2\2\2\u0527\u0547\7t\2\2\u0528\u0547\7\u0092\2"+
		"\2\u0529\u0547\7\u0093\2\2\u052a\u0547\7\u0094\2\2\u052b\u0547\7\u0095"+
		"\2\2\u052c\u0547\7\u0096\2\2\u052d\u0547\7\u00bb\2\2\u052e\u0547\7\u00bd"+
		"\2\2\u052f\u0547\7\u00c7\2\2\u0530\u0547\7\u00c6\2\2\u0531\u0547\7\u00d8"+
		"\2\2\u0532\u0547\7\u00e4\2\2\u0533\u0534\7\u00eb\2\2\u0534\u0547\7\u0137"+
		"\2\2\u0535\u0547\7\u0109\2\2\u0536\u0547\7\u0108\2\2\u0537\u0547\7\u010a"+
		"\2\2\u0538\u0547\7\u010c\2\2\u0539\u0547\7\u010b\2\2\u053a\u0547\7\u0117"+
		"\2\2\u053b\u0547\7\u011c\2\2\u053c\u0547\7\u0123\2\2\u053d\u0547\7\u0124"+
		"\2\2\u053e\u0547\7\u0135\2\2\u053f\u0547\7\u0136\2\2\u0540\u0547\7\u0140"+
		"\2\2\u0541\u0544\5\u01be\u00e0\2\u0542\u0543\7\5\2\2\u0543\u0545\t\21"+
		"\2\2\u0544\u0542\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0547\3\2\2\2\u0546"+
		"\u0519\3\2\2\2\u0546\u051a\3\2\2\2\u0546\u051b\3\2\2\2\u0546\u051c\3\2"+
		"\2\2\u0546\u051d\3\2\2\2\u0546\u051e\3\2\2\2\u0546\u051f\3\2\2\2\u0546"+
		"\u0520\3\2\2\2\u0546\u0521\3\2\2\2\u0546\u0522\3\2\2\2\u0546\u0523\3\2"+
		"\2\2\u0546\u0527\3\2\2\2\u0546\u0528\3\2\2\2\u0546\u0529\3\2\2\2\u0546"+
		"\u052a\3\2\2\2\u0546\u052b\3\2\2\2\u0546\u052c\3\2\2\2\u0546\u052d\3\2"+
		"\2\2\u0546\u052e\3\2\2\2\u0546\u052f\3\2\2\2\u0546\u0530\3\2\2\2\u0546"+
		"\u0531\3\2\2\2\u0546\u0532\3\2\2\2\u0546\u0533\3\2\2\2\u0546\u0535\3\2"+
		"\2\2\u0546\u0536\3\2\2\2\u0546\u0537\3\2\2\2\u0546\u0538\3\2\2\2\u0546"+
		"\u0539\3\2\2\2\u0546\u053a\3\2\2\2\u0546\u053b\3\2\2\2\u0546\u053c\3\2"+
		"\2\2\u0546\u053d\3\2\2\2\u0546\u053e\3\2\2\2\u0546\u053f\3\2\2\2\u0546"+
		"\u0540\3\2\2\2\u0546\u0541\3\2\2\2\u0547y\3\2\2\2\u0548\u0549\7\u016b"+
		"\2\2\u0549\u054b\t\22\2\2\u054a\u054c\t\23\2\2\u054b\u054a\3\2\2\2\u054b"+
		"\u054c\3\2\2\2\u054c\u054f\3\2\2\2\u054d\u054e\7\u015d\2\2\u054e\u0550"+
		"\7\u0175\2\2\u054f\u054d\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0551\3\2\2"+
		"\2\u0551\u0552\7\u016e\2\2\u0552{\3\2\2\2\u0553\u0555\7\u00c3\2\2\u0554"+
		"\u0553\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u055f\7\u00c5"+
		"\2\2\u0557\u0558\7)\2\2\u0558\u0559\7\u0102\2\2\u0559\u055f\5\u01be\u00e0"+
		"\2\u055a\u055c\7\u00c3\2\2\u055b\u055a\3\2\2\2\u055b\u055c\3\2\2\2\u055c"+
		"\u055d\3\2\2\2\u055d\u055f\t\24\2\2\u055e\u0554\3\2\2\2\u055e\u0557\3"+
		"\2\2\2\u055e\u055b\3\2\2\2\u055f}\3\2\2\2\u0560\u0562\7\u015c\2\2\u0561"+
		"\u0560\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0564\7\u0161"+
		"\2\2\u0564\u056d\5\u0186\u00c4\2\u0565\u0567\7\u013c\2\2\u0566\u0565\3"+
		"\2\2\2\u0566\u0567\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u056a\7M\2\2\u0569"+
		"\u056b\5\u0186\u00c4\2\u056a\u0569\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056d"+
		"\3\2\2\2\u056c\u0561\3\2\2\2\u056c\u0566\3\2\2\2\u056d\177\3\2\2\2\u056e"+
		"\u056f\7=\2\2\u056f\u0573\t\25\2\2\u0570\u0571\7\u0088\2\2\u0571\u0572"+
		"\7\u00c3\2\2\u0572\u0574\7l\2\2\u0573\u0570\3\2\2\2\u0573\u0574\3\2\2"+
		"\2\u0574\u0575\3\2\2\2\u0575\u0579\5\u0186\u00c4\2\u0576\u0578\5\u0082"+
		"B\2\u0577\u0576\3\2\2\2\u0578\u057b\3\2\2\2\u0579\u0577\3\2\2\2\u0579"+
		"\u057a\3\2\2\2\u057a\u0081\3\2\2\2\u057b\u0579\3\2\2\2\u057c\u057d\7\62"+
		"\2\2\u057d\u0581\5\u0186\u00c4\2\u057e\u057f\7\u00a9\2\2\u057f\u0581\5"+
		"\u0186\u00c4\2\u0580\u057c\3\2\2\2\u0580\u057e\3\2\2\2\u0581\u0083\3\2"+
		"\2\2\u0582\u058a\7\f\2\2\u0583\u0586\7=\2\2\u0584\u0585\7\u00cd\2\2\u0585"+
		"\u0587\7\u00e7\2\2\u0586\u0584\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u058a"+
		"\3\2\2\2\u0588\u058a\7\u00e7\2\2\u0589\u0582\3\2\2\2\u0589\u0583\3\2\2"+
		"\2\u0589\u0588\3\2\2\2\u0589\u058a\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058c"+
		"\7{\2\2\u058c\u058e\5\u01be\u00e0\2\u058d\u058f\5\u0096L\2\u058e\u058d"+
		"\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u0592\5\u0086D"+
		"\2\u0591\u0593\t\26\2\2\u0592\u0591\3\2\2\2\u0592\u0593\3\2\2\2\u0593"+
		"\u0595\3\2\2\2\u0594\u0596\5\62\32\2\u0595\u0594\3\2\2\2\u0595\u0596\3"+
		"\2\2\2\u0596\u0597\3\2\2\2\u0597\u0598\5\b\5\2\u0598\u0085\3\2\2\2\u0599"+
		"\u059a\t\27\2\2\u059a\u059c\5x=\2\u059b\u059d\5z>\2\u059c\u059b\3\2\2"+
		"\2\u059c\u059d\3\2\2\2\u059d\u0087\3\2\2\2\u059e\u05a6\7\f\2\2\u059f\u05a2"+
		"\7=\2\2\u05a0\u05a1\7\u00cd\2\2\u05a1\u05a3\7\u00e7\2\2\u05a2\u05a0\3"+
		"\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a6\3\2\2\2\u05a4\u05a6\7\u00e7\2\2"+
		"\u05a5\u059e\3\2\2\2\u05a5\u059f\3\2\2\2\u05a5\u05a4\3\2\2\2\u05a5\u05a6"+
		"\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05a8\7\u00d4\2\2\u05a8\u05a9\5\u01be"+
		"\u00e0\2\u05a9\u05aa\t\26\2\2\u05aa\u05ab\5\u008aF\2\u05ab\u05af\7d\2"+
		"\2\u05ac\u05ad\5\u01be\u00e0\2\u05ad\u05ae\7\u0170\2\2\u05ae\u05b0\3\2"+
		"\2\2\u05af\u05ac\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u0089\3\2\2\2\u05b1"+
		"\u05b2\5\u008cG\2\u05b2\u05b8\7\u0170\2\2\u05b3\u05b4\5\u008cG\2\u05b4"+
		"\u05b5\7\u0170\2\2\u05b5\u05b7\3\2\2\2\u05b6\u05b3\3\2\2\2\u05b7\u05ba"+
		"\3\2\2\2\u05b8\u05b6\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u008b\3\2\2\2\u05ba"+
		"\u05b8\3\2\2\2\u05bb\u05c9\5\64\33\2\u05bc\u05bd\7{\2\2\u05bd\u05bf\5"+
		"\u01be\u00e0\2\u05be\u05c0\5\u0096L\2\u05bf\u05be\3\2\2\2\u05bf\u05c0"+
		"\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05c2\5\u0086D\2\u05c2\u05c9\3\2\2"+
		"\2\u05c3\u05c4\t\30\2\2\u05c4\u05c6\5\u01be\u00e0\2\u05c5\u05c7\5\u0096"+
		"L\2\u05c6\u05c5\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c9\3\2\2\2\u05c8"+
		"\u05bb\3\2\2\2\u05c8\u05bc\3\2\2\2\u05c8\u05c3\3\2\2\2\u05c9\u008d\3\2"+
		"\2\2\u05ca\u05d2\7\f\2\2\u05cb\u05ce\7=\2\2\u05cc\u05cd\7\u00cd\2\2\u05cd"+
		"\u05cf\7\u00e7\2\2\u05ce\u05cc\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d2"+
		"\3\2\2\2\u05d0\u05d2\7\u00e7\2\2\u05d1\u05ca\3\2\2\2\u05d1\u05cb\3\2\2"+
		"\2\u05d1\u05d0\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d4"+
		"\7\u00d4\2\2\u05d4\u05d5\7\36\2\2\u05d5\u05d6\5\u01be\u00e0\2\u05d6\u05d7"+
		"\t\26\2\2\u05d7\u05d8\5\u0090I\2\u05d8\u05dc\7d\2\2\u05d9\u05da\5\u01be"+
		"\u00e0\2\u05da\u05db\7\u0170\2\2\u05db\u05dd\3\2\2\2\u05dc\u05d9\3\2\2"+
		"\2\u05dc\u05dd\3\2\2\2\u05dd\u008f\3\2\2\2\u05de\u05df\5\u0092J\2\u05df"+
		"\u05e5\7\u0170\2\2\u05e0\u05e1\5\u0092J\2\u05e1\u05e2\7\u0170\2\2\u05e2"+
		"\u05e4\3\2\2\2\u05e3\u05e0\3\2\2\2\u05e4\u05e7\3\2\2\2\u05e5\u05e3\3\2"+
		"\2\2\u05e5\u05e6\3\2\2\2\u05e6\u0091\3\2\2\2\u05e7\u05e5\3\2\2\2\u05e8"+
		"\u05ec\5\64\33\2\u05e9\u05ec\5\u0084C\2\u05ea\u05ec\5\u0094K\2\u05eb\u05e8"+
		"\3\2\2\2\u05eb\u05e9\3\2\2\2\u05eb\u05ea\3\2\2\2\u05ec\u0093\3\2\2\2\u05ed"+
		"\u05f5\7\f\2\2\u05ee\u05f1\7=\2\2\u05ef\u05f0\7\u00cd\2\2\u05f0\u05f2"+
		"\7\u00e7\2\2\u05f1\u05ef\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f5\3\2\2"+
		"\2\u05f3\u05f5\7\u00e7\2\2\u05f4\u05ed\3\2\2\2\u05f4\u05ee\3\2\2\2\u05f4"+
		"\u05f3\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f7\t\30"+
		"\2\2\u05f7\u05f9\5\u01be\u00e0\2\u05f8\u05fa\5\u0096L\2\u05f9\u05f8\3"+
		"\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u05fc\3\2\2\2\u05fb\u05fd\5\u009aN\2"+
		"\u05fc\u05fb\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u05ff\3\2\2\2\u05fe\u0600"+
		"\t\26\2\2\u05ff\u05fe\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0602\3\2\2\2"+
		"\u0601\u0603\5\62\32\2\u0602\u0601\3\2\2\2\u0602\u0603\3\2\2\2\u0603\u0605"+
		"\3\2\2\2\u0604\u0606\5\u011c\u008f\2\u0605\u0604\3\2\2\2\u0605\u0606\3"+
		"\2\2\2\u0606\u0607\3\2\2\2\u0607\u060b\5\f\7\2\u0608\u0609\5\u01be\u00e0"+
		"\2\u0609\u060a\7\u0170\2\2\u060a\u060c\3\2\2\2\u060b\u0608\3\2\2\2\u060b"+
		"\u060c\3\2\2\2\u060c\u0095\3\2\2\2\u060d\u060e\7\u016b\2\2\u060e\u0624"+
		"\7\u016e\2\2\u060f\u0610\7\u016b\2\2\u0610\u0615\5\u0098M\2\u0611\u0612"+
		"\7\u015d\2\2\u0612\u0614\5\u0098M\2\u0613\u0611\3\2\2\2\u0614\u0617\3"+
		"\2\2\2\u0615\u0613\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u0618\3\2\2\2\u0617"+
		"\u0615\3\2\2\2\u0618\u0619\7\u016e\2\2\u0619\u0624\3\2\2\2\u061a\u061b"+
		"\6L\4\2\u061b\u0620\5\u0098M\2\u061c\u061d\7\u015d\2\2\u061d\u061f\5\u0098"+
		"M\2\u061e\u061c\3\2\2\2\u061f\u0622\3\2\2\2\u0620\u061e\3\2\2\2\u0620"+
		"\u0621\3\2\2\2\u0621\u0624\3\2\2\2\u0622\u0620\3\2\2\2\u0623\u060d\3\2"+
		"\2\2\u0623\u060f\3\2\2\2\u0623\u061a\3\2\2\2\u0624\u0097\3\2\2\2\u0625"+
		"\u062b\7\u008b\2\2\u0626\u062b\7\u00cf\2\2\u0627\u062b\7\u0090\2\2\u0628"+
		"\u0629\7\u008b\2\2\u0629\u062b\7\u00cf\2\2\u062a\u0625\3\2\2\2\u062a\u0626"+
		"\3\2\2\2\u062a\u0627\3\2\2\2\u062a\u0628\3\2\2\2\u062a\u062b\3\2\2\2\u062b"+
		"\u062c\3\2\2\2\u062c\u062d\5\u01be\u00e0\2\u062d\u062f\5x=\2\u062e\u0630"+
		"\5z>\2\u062f\u062e\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0634\3\2\2\2\u0631"+
		"\u0633\5|?\2\u0632\u0631\3\2\2\2\u0633\u0636\3\2\2\2\u0634\u0632\3\2\2"+
		"\2\u0634\u0635\3\2\2\2\u0635\u0638\3\2\2\2\u0636\u0634\3\2\2\2\u0637\u0639"+
		"\5~@\2\u0638\u0637\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u0650\3\2\2\2\u063a"+
		"\u0640\5\u01be\u00e0\2\u063b\u0641\7\u008b\2\2\u063c\u0641\7\u00cf\2\2"+
		"\u063d\u0641\7\u0090\2\2\u063e\u063f\7\u008b\2\2\u063f\u0641\7\u00cf\2"+
		"\2\u0640\u063b\3\2\2\2\u0640\u063c\3\2\2\2\u0640\u063d\3\2\2\2\u0640\u063e"+
		"\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0644\5x=\2\u0643"+
		"\u0645\5z>\2\u0644\u0643\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u0649\3\2\2"+
		"\2\u0646\u0648\5|?\2\u0647\u0646\3\2\2\2\u0648\u064b\3\2\2\2\u0649\u0647"+
		"\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u064d\3\2\2\2\u064b\u0649\3\2\2\2\u064c"+
		"\u064e\5~@\2\u064d\u064c\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u0650\3\2\2"+
		"\2\u064f\u062a\3\2\2\2\u064f\u063a\3\2\2\2\u0650\u0099\3\2\2\2\u0651\u0653"+
		"\5\u009cO\2\u0652\u0651\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0652\3\2\2"+
		"\2\u0654\u0655\3\2\2\2\u0655\u009b\3\2\2\2\u0656\u0657\7\u00a2\2\2\u0657"+
		"\u0662\7\u010d\2\2\u0658\u0659\7\u010d\2\2\u0659\u065a\7\u00fe\2\2\u065a"+
		"\u0662\t\31\2\2\u065b\u065d\7_\2\2\u065c\u065b\3\2\2\2\u065c\u065d\3\2"+
		"\2\2\u065d\u065e\3\2\2\2\u065e\u065f\7\u00ea\2\2\u065f\u0660\7\u0105\2"+
		"\2\u0660\u0662\7\u0175\2\2\u0661\u0656\3\2\2\2\u0661\u0658\3\2\2\2\u0661"+
		"\u065c\3\2\2\2\u0662\u009d\3\2\2\2\u0663\u0664\7^\2\2\u0664\u0667\7\u011d"+
		"\2\2\u0665\u0666\7\u0088\2\2\u0666\u0668\7l\2\2\u0667\u0665\3\2\2\2\u0667"+
		"\u0668\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u0672\5\u0150\u00a9\2\u066a\u066b"+
		"\7^\2\2\u066b\u066e\t\25\2\2\u066c\u066d\7\u0088\2\2\u066d\u066f\7l\2"+
		"\2\u066e\u066c\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u0672"+
		"\5\u0186\u00c4\2\u0671\u0663\3\2\2\2\u0671\u066a\3\2\2\2\u0672\u009f\3"+
		"\2\2\2\u0673\u0674\7d\2\2\u0674\u0675\7\u0128\2\2\u0675\u00a1\3\2\2\2"+
		"\u0676\u0678\t\32\2\2\u0677\u0679\7\u008a\2\2\u0678\u0677\3\2\2\2\u0678"+
		"\u0679\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u0680\5\u0186\u00c4\2\u067b\u067c"+
		"\7\u016b\2\2\u067c\u067d\5\u01a6\u00d4\2\u067d\u067e\7\u016e\2\2\u067e"+
		"\u0681\3\2\2\2\u067f\u0681\5\u01a6\u00d4\2\u0680\u067b\3\2\2\2\u0680\u067f"+
		"\3\2\2\2\u0680\u0681\3\2\2\2\u0681\u068b\3\2\2\2\u0682\u0683\7\u0099\2"+
		"\2\u0683\u0688\7\u0172\2\2\u0684\u0685\7\u015d\2\2\u0685\u0687\7\u0172"+
		"\2\2\u0686\u0684\3\2\2\2\u0687\u068a\3\2\2\2\u0688\u0686\3\2\2\2\u0688"+
		"\u0689\3\2\2\2\u0689\u068c\3\2\2\2\u068a\u0688\3\2\2\2\u068b\u0682\3\2"+
		"\2\2\u068b\u068c\3\2\2\2\u068c\u068e\3\2\2\2\u068d\u068f\5\u011e\u0090"+
		"\2\u068e\u068d\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u00a3\3\2\2\2\u0690\u0694"+
		"\5\u00a6T\2\u0691\u0694\5\u00a8U\2\u0692\u0694\5\u00aaV\2\u0693\u0690"+
		"\3\2\2\2\u0693\u0691\3\2\2\2\u0693\u0692\3\2\2\2\u0694\u00a5\3\2\2\2\u0695"+
		"\u0696\7\u0088\2\2\u0696\u0697\5\u0176\u00bc\2\u0697\u0698\7\u0122\2\2"+
		"\u0698\u069c\5\4\3\2\u0699\u069b\5\u00acW\2\u069a\u0699\3\2\2\2\u069b"+
		"\u069e\3\2\2\2\u069c\u069a\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u06a0\3\2"+
		"\2\2\u069e\u069c\3\2\2\2\u069f\u06a1\5\u00aeX\2\u06a0\u069f\3\2\2\2\u06a0"+
		"\u06a1\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a3\7d\2\2\u06a3\u06a4\7\u0088"+
		"\2\2\u06a4\u00a7\3\2\2\2\u06a5\u06a6\7\u0088\2\2\u06a6\u06a7\5\u0176\u00bc"+
		"\2\u06a7\u06aa\5\b\5\2\u06a8\u06a9\7`\2\2\u06a9\u06ab\5\b\5\2\u06aa\u06a8"+
		"\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u00a9\3\2\2\2\u06ac\u06ad\7\6\2\2\u06ad"+
		"\u06ae\7\u0088\2\2\u06ae\u06af\5\u0176\u00bc\2\u06af\u06b0\7\u0122\2\2"+
		"\u06b0\u06b1\5\b\5\2\u06b1\u00ab\3\2\2\2\u06b2\u06b3\t\33\2\2\u06b3\u06b4"+
		"\5\u0176\u00bc\2\u06b4\u06b5\7\u0122\2\2\u06b5\u06b6\5\4\3\2\u06b6\u00ad"+
		"\3\2\2\2\u06b7\u06b8\7`\2\2\u06b8\u06b9\5\4\3\2\u06b9\u00af\3\2\2\2\u06ba"+
		"\u06bd\7\u008c\2\2\u06bb\u06be\5\u01b8\u00dd\2\u06bc\u06be\5\u0186\u00c4"+
		"\2\u06bd\u06bb\3\2\2\2\u06bd\u06bc\3\2\2\2\u06be\u00b1\3\2\2\2\u06bf\u06c6"+
		"\7\u0091\2\2\u06c0\u06c1\7\u00d2\2\2\u06c1\u06c7\7\u011d\2\2\u06c2\u06c4"+
		"\7\u0099\2\2\u06c3\u06c5\7\u011d\2\2\u06c4\u06c3\3\2\2\2\u06c4\u06c5\3"+
		"\2\2\2\u06c5\u06c7\3\2\2\2\u06c6\u06c0\3\2\2\2\u06c6\u06c2\3\2\2\2\u06c7"+
		"\u06c8\3\2\2\2\u06c8\u06ca\5\u0150\u00a9\2\u06c9\u06cb\5\u00b4[\2\u06ca"+
		"\u06c9\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb\u06ce\3\2\2\2\u06cc\u06cf\5\u0120"+
		"\u0091\2\u06cd\u06cf\5\u00b6\\\2\u06ce\u06cc\3\2\2\2\u06ce\u06cd\3\2\2"+
		"\2\u06cf\u00b3\3\2\2\2\u06d0\u06d1\7\u016b\2\2\u06d1\u06d6\5\u01be\u00e0"+
		"\2\u06d2\u06d3\7\u015d\2\2\u06d3\u06d5\5\u01be\u00e0\2\u06d4\u06d2\3\2"+
		"\2\2\u06d5\u06d8\3\2\2\2\u06d6\u06d4\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7"+
		"\u06d9\3\2\2\2\u06d8\u06d6\3\2\2\2\u06d9\u06da\7\u016e\2\2\u06da\u00b5"+
		"\3\2\2\2\u06db\u06dc\7\u0133\2\2\u06dc\u06e1\5\u00b8]\2\u06dd\u06de\7"+
		"\u015d\2\2\u06de\u06e0\5\u00b8]\2\u06df\u06dd\3\2\2\2\u06e0\u06e3\3\2"+
		"\2\2\u06e1\u06df\3\2\2\2\u06e1\u06e2\3\2\2\2\u06e2\u00b7\3\2\2\2\u06e3"+
		"\u06e1\3\2\2\2\u06e4\u06e5\7\u016b\2\2\u06e5\u06ea\5\u0186\u00c4\2\u06e6"+
		"\u06e7\7\u015d\2\2\u06e7\u06e9\5\u0186\u00c4\2\u06e8\u06e6\3\2\2\2\u06e9"+
		"\u06ec\3\2\2\2\u06ea\u06e8\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ed\3\2"+
		"\2\2\u06ec\u06ea\3\2\2\2\u06ed\u06ee\7\u016e\2\2\u06ee\u00b9\3\2\2\2\u06ef"+
		"\u06f0\7\u0091\2\2\u06f0\u06f2\7\u00d2\2\2\u06f1\u06f3\7\u00a8\2\2\u06f2"+
		"\u06f1\3\2\2\2\u06f2\u06f3\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u06f5\7Y"+
		"\2\2\u06f5\u06f6\5\u01ac\u00d7\2\u06f6\u06f7\5\u01aa\u00d6\2\u06f7\u00bb"+
		"\3\2\2\2\u06f8\u06f9\7\u00ca\2\2\u06f9\u06fb\5\u0150\u00a9\2\u06fa\u06fc"+
		"\5\u00be`\2\u06fb\u06fa\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc\u06fe\3\2\2"+
		"\2\u06fd\u06ff\5\u014e\u00a8\2\u06fe\u06fd\3\2\2\2\u06fe\u06ff\3\2\2\2"+
		"\u06ff\u0701\3\2\2\2\u0700\u0702\5\u0152\u00aa\2\u0701\u0700\3\2\2\2\u0701"+
		"\u0702\3\2\2\2\u0702\u0703\3\2\2\2\u0703\u0704\5\u00c0a\2\u0704\u00bd"+
		"\3\2\2\2\u0705\u0706\7\u016b\2\2\u0706\u0707\5\u0130\u0099\2\u0707\u0708"+
		"\7\u016e\2\2\u0708\u00bf\3\2\2\2\u0709\u070a\7\u0142\2\2\u070a\u070b\5"+
		"\u0162\u00b2\2\u070b\u00c1\3\2\2\2\u070c\u070e\7m\2\2\u070d\u070f\7\u0172"+
		"\2\2\u070e\u070d\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0712\3\2\2\2\u0710"+
		"\u0711\7\u0139\2\2\u0711\u0713\5\u0176\u00bc\2\u0712\u0710\3\2\2\2\u0712"+
		"\u0713\3\2\2\2\u0713\u00c3\3\2\2\2\u0714\u0715\7|\2\2\u0715\u0716\7W\2"+
		"\2\u0716\u0717\5\u00c6d\2\u0717\u00c5\3\2\2\2\u0718\u071b\5\u00c8e\2\u0719"+
		"\u071b\5\u00caf\2\u071a\u0718\3\2\2\2\u071a\u0719\3\2\2\2\u071b\u00c7"+
		"\3\2\2\2\u071c\u071d\7j\2\2\u071d\u071e\7\u0175\2\2\u071e\u071f\5\u01be"+
		"\u00e0\2\u071f\u0720\7\u0161\2\2\u0720\u0721\7\u00b6\2\2\u0721\u00c9\3"+
		"\2\2\2\u0722\u0723\5\u01be\u00e0\2\u0723\u0724\7\u0161\2\2\u0724\u0725"+
		"\7\u00f6\2\2\u0725\u00cb\3\2\2\2\u0726\u0727\7\177\2\2\u0727\u072c\5\u00ce"+
		"h\2\u0728\u0729\7\u015d\2\2\u0729\u072b\5\u00ceh\2\u072a\u0728\3\2\2\2"+
		"\u072b\u072e\3\2\2\2\u072c\u072a\3\2\2\2\u072c\u072d\3\2\2\2\u072d\u072f"+
		"\3\2\2\2\u072e\u072c\3\2\2\2\u072f\u0730\7\u0126\2\2\u0730\u0731\7\u00f1"+
		"\2\2\u0731\u0732\5\u01be\u00e0\2\u0732\u00cd\3\2\2\2\u0733\u0734\7i\2"+
		"\2\u0734\u0735\7\u00ca\2\2\u0735\u0736\7\u00de\2\2\u0736\u0737\5\u01be"+
		"\u00e0\2\u0737\u00cf\3\2\2\2\u0738\u073a\7\u00a3\2\2\u0739\u073b\7\u0172"+
		"\2\2\u073a\u0739\3\2\2\2\u073a\u073b\3\2\2\2\u073b\u00d1\3\2\2\2\u073c"+
		"\u073d\7\u00b1\2\2\u073d\u073e\7\u00c8\2\2\u073e\u0741\5\u0186\u00c4\2"+
		"\u073f\u0740\7\u0126\2\2\u0740\u0742\5\u0186\u00c4\2\u0741\u073f\3\2\2"+
		"\2\u0741\u0742\3\2\2\2\u0742\u0745\3\2\2\2\u0743\u0744\7\23\2\2\u0744"+
		"\u0746\5\u0186\u00c4\2\u0745\u0743\3\2\2\2\u0745\u0746\3\2\2\2\u0746\u00d3"+
		"\3\2\2\2\u0747\u0748\7\u00cc\2\2\u0748\u074e\7\u0172\2\2\u0749\u074c\7"+
		"u\2\2\u074a\u074d\5\u0120\u0091\2\u074b\u074d\5\u0186\u00c4\2\u074c\u074a"+
		"\3\2\2\2\u074c\u074b\3\2\2\2\u074d\u074f\3\2\2\2\u074e\u0749\3\2\2\2\u074e"+
		"\u074f\3\2\2\2\u074f\u00d5\3\2\2\2\u0750\u0752\7p\2\2\u0751\u0753\7y\2"+
		"\2\u0752\u0751\3\2\2\2\u0752\u0753\3\2\2\2\u0753\u0754\3\2\2\2\u0754\u0755"+
		"\7\u0172\2\2\u0755\u0756\7\u0099\2\2\u0756\u075b\7\u0172\2\2\u0757\u0758"+
		"\7\u015d\2\2\u0758\u075a\7\u0172\2\2\u0759\u0757\3\2\2\2\u075a\u075d\3"+
		"\2\2\2\u075b\u0759\3\2\2\2\u075b\u075c\3\2\2\2\u075c\u00d7\3\2\2\2\u075d"+
		"\u075b\3\2\2\2\u075e\u075f\7/\2\2\u075f\u0760\t\34\2\2\u0760\u0761\7\u00ca"+
		"\2\2\u0761\u0763\5\u0150\u00a9\2\u0762\u0764\5\u00dan\2\u0763\u0762\3"+
		"\2\2\2\u0763\u0764\3\2\2\2\u0764\u00d9\3\2\2\2\u0765\u0766\7\61\2\2\u0766"+
		"\u0767\7\u016b\2\2\u0767\u076c\5\u01be\u00e0\2\u0768\u0769\7\u015d\2\2"+
		"\u0769\u076b\5\u01be\u00e0\2\u076a\u0768\3\2\2\2\u076b\u076e\3\2\2\2\u076c"+
		"\u076a\3\2\2\2\u076c\u076d\3\2\2\2\u076d\u076f\3\2\2\2\u076e\u076c\3\2"+
		"\2\2\u076f\u0770\7\u016e\2\2\u0770\u00db\3\2\2\2\u0771\u0772\7,\2\2\u0772"+
		"\u0773\7\u0172\2\2\u0773\u00dd\3\2\2\2\u0774\u0775\7.\2\2\u0775\u0776"+
		"\t\35\2\2\u0776\u0777\5\u00e0q\2\u0777\u0778\7\u015d\2\2\u0778\u0779\5"+
		"\u00e0q\2\u0779\u00df\3\2\2\2\u077a\u077c\5\u0150\u00a9\2\u077b\u077d"+
		"\5\u0152\u00aa\2\u077c\u077b\3\2\2\2\u077c\u077d\3\2\2\2\u077d\u0783\3"+
		"\2\2\2\u077e\u077f\7\u016b\2\2\u077f\u0780\5\u0120\u0091\2\u0780\u0781"+
		"\7\u016e\2\2\u0781\u0783\3\2\2\2\u0782\u077a\3\2\2\2\u0782\u077e\3\2\2"+
		"\2\u0783\u0786\3\2\2\2\u0784\u0785\7\23\2\2\u0785\u0787\5\u01be\u00e0"+
		"\2\u0786\u0784\3\2\2\2\u0786\u0787\3\2\2\2\u0787\u00e1\3\2\2\2\u0788\u0789"+
		"\7:\2\2\u0789\u078a\7y\2\2\u078a\u078b\7\u00a8\2\2\u078b\u0790\5\u00e6"+
		"t\2\u078c\u078d\7\u015d\2\2\u078d\u078f\5\u00e6t\2\u078e\u078c\3\2\2\2"+
		"\u078f\u0792\3\2\2\2\u0790\u078e\3\2\2\2\u0790\u0791\3\2\2\2\u0791\u0793"+
		"\3\2\2\2\u0792\u0790\3\2\2\2\u0793\u0794\7\u0126\2\2\u0794\u0798\5\u00e8"+
		"u\2\u0795\u0797\5\u00ecw\2\u0796\u0795\3\2\2\2\u0797\u079a\3\2\2\2\u0798"+
		"\u0796\3\2\2\2\u0798\u0799\3\2\2\2\u0799\u00e3\3\2\2\2\u079a\u0798\3\2"+
		"\2\2\u079b\u07a1\7:\2\2\u079c\u07a2\5\u0150\u00a9\2\u079d\u079e\7\u016b"+
		"\2\2\u079e\u079f\5\u0120\u0091\2\u079f\u07a0\7\u016e\2\2\u07a0\u07a2\3"+
		"\2\2\2\u07a1\u079c\3\2\2\2\u07a1\u079d\3\2\2\2\u07a2\u07a3\3\2\2\2\u07a3"+
		"\u07a5\7\u0126\2\2\u07a4\u07a6\7\u0084\2\2\u07a5\u07a4\3\2\2\2\u07a5\u07a6"+
		"\3\2\2\2\u07a6\u07a7\3\2\2\2\u07a7\u07ab\5\u00e8u\2\u07a8\u07aa\5\u00ea"+
		"v\2\u07a9\u07a8\3\2\2\2\u07aa\u07ad\3\2\2\2\u07ab\u07a9\3\2\2\2\u07ab"+
		"\u07ac\3\2\2\2\u07ac\u00e5\3\2\2\2\u07ad\u07ab\3\2\2\2\u07ae\u07b1\5\u01b8"+
		"\u00dd\2\u07af\u07b1\5\u0186\u00c4\2\u07b0\u07ae\3\2\2\2\u07b0\u07af\3"+
		"\2\2\2\u07b1\u00e7\3\2\2\2\u07b2\u07b5\5\u01b8\u00dd\2\u07b3\u07b5\5\u0186"+
		"\u00c4\2\u07b4\u07b2\3\2\2\2\u07b4\u07b3\3\2\2\2\u07b5\u00e9\3\2\2\2\u07b6"+
		"\u07b7\7\23\2\2\u07b7\u07bf\5\u01be\u00e0\2\u07b8\u07b9\7\26\2\2\u07b9"+
		"\u07bf\5\u0186\u00c4\2\u07ba\u07bb\7T\2\2\u07bb\u07bf\5\u0186\u00c4\2"+
		"\u07bc\u07bd\7\u010f\2\2\u07bd\u07bf\5\u01be\u00e0\2\u07be\u07b6\3\2\2"+
		"\2\u07be\u07b8\3\2\2\2\u07be\u07ba\3\2\2\2\u07be\u07bc\3\2\2\2\u07bf\u00eb"+
		"\3\2\2\2\u07c0\u07c1\t\36\2\2\u07c1\u00ed\3\2\2\2\u07c2\u07c4\7\64\2\2"+
		"\u07c3\u07c5\7\u013e\2\2\u07c4\u07c3\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5"+
		"\u00ef\3\2\2\2\u07c6\u07c8\7=\2\2\u07c7\u07c9\7\u012d\2\2\u07c8\u07c7"+
		"\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca\u07cb\7\u008d\2"+
		"\2\u07cb\u07cc\5\u01be\u00e0\2\u07cc\u07cd\7\u00ca\2\2\u07cd\u07ce\5\u0150"+
		"\u00a9\2\u07ce\u07cf\7\u016b\2\2\u07cf\u07d4\5\u00f2z\2\u07d0\u07d1\7"+
		"\u015d\2\2\u07d1\u07d3\5\u00f2z\2\u07d2\u07d0\3\2\2\2\u07d3\u07d6\3\2"+
		"\2\2\u07d4\u07d2\3\2\2\2\u07d4\u07d5\3\2\2\2\u07d5\u07d7\3\2\2\2\u07d6"+
		"\u07d4\3\2\2\2\u07d7\u07d8\7\u016e\2\2\u07d8\u00f1\3\2\2\2\u07d9\u07db"+
		"\5\u01be\u00e0\2\u07da\u07dc\t\t\2\2\u07db\u07da\3\2\2\2\u07db\u07dc\3"+
		"\2\2\2\u07dc\u00f3\3\2\2\2\u07dd\u07de\5\u00f6|\2\u07de\u00f5\3\2\2\2"+
		"\u07df\u07e0\7\u013c\2\2\u07e0\u07e1\7\u016b\2\2\u07e1\u07e2\5\u01be\u00e0"+
		"\2\u07e2\u07e3\7\u0161\2\2\u07e3\u07eb\5\u01be\u00e0\2\u07e4\u07e5\7\u015d"+
		"\2\2\u07e5\u07e6\5\u01be\u00e0\2\u07e6\u07e7\7\u0161\2\2\u07e7\u07e8\5"+
		"\u01be\u00e0\2\u07e8\u07ea\3\2\2\2\u07e9\u07e4\3\2\2\2\u07ea\u07ed\3\2"+
		"\2\2\u07eb\u07e9\3\2\2\2\u07eb\u07ec\3\2\2\2\u07ec\u07ee\3\2\2\2\u07ed"+
		"\u07eb\3\2\2\2\u07ee\u07f2\7\u016e\2\2\u07ef\u07f1\5l\67\2\u07f0\u07ef"+
		"\3\2\2\2\u07f1\u07f4\3\2\2\2\u07f2\u07f0\3\2\2\2\u07f2\u07f3\3\2\2\2\u07f3"+
		"\u00f7\3\2\2\2\u07f4\u07f2\3\2\2\2\u07f5\u07f6\7\u00dc\2\2\u07f6\u07fd"+
		"\5\u0186\u00c4\2\u07f7\u07f8\7\u00dc\2\2\u07f8\u07f9\7\u016b\2\2\u07f9"+
		"\u07fa\5\u0186\u00c4\2\u07fa\u07fb\7\u016e\2\2\u07fb\u07fd\3\2\2\2\u07fc"+
		"\u07f5\3\2\2\2\u07fc\u07f7\3\2\2\2\u07fd\u00f9\3\2\2\2\u07fe\u0800\7\6"+
		"\2\2\u07ff\u07fe\3\2\2\2\u07ff\u0800\3\2\2\2\u0800\u0801\3\2\2\2\u0801"+
		"\u0803\7\u00e1\2\2\u0802\u0804\5\u0186\u00c4\2\u0803\u0802\3\2\2\2\u0803"+
		"\u0804\3\2\2\2\u0804\u00fb\3\2\2\2\u0805\u0806\7\u00e3\2\2\u0806\u00fd"+
		"\3\2\2\2\u0807\u0813\7\u00e8\2\2\u0808\u080a\7\u0110\2\2\u0809\u080b\7"+
		"\u0132\2\2\u080a\u0809\3\2\2\2\u080a\u080b\3\2\2\2\u080b\u080c\3\2\2\2"+
		"\u080c\u0811\5\u0186\u00c4\2\u080d\u080e\7\u0102\2\2\u080e\u080f\7\u00b6"+
		"\2\2\u080f\u0810\7\u0161\2\2\u0810\u0812\5\u0186\u00c4\2\u0811\u080d\3"+
		"\2\2\2\u0811\u0812\3\2\2\2\u0812\u0814\3\2\2\2\u0813\u0808\3\2\2\2\u0813"+
		"\u0814\3\2\2\2\u0814\u00ff\3\2\2\2\u0815\u0817\7\u00ec\2\2\u0816\u0818"+
		"\5\u0186\u00c4\2\u0817\u0816\3\2\2\2\u0817\u0818\3\2\2\2\u0818\u0101\3"+
		"\2\2\2\u0819\u081b\7\u00f2\2\2\u081a\u081c\7\u013e\2\2\u081b\u081a\3\2"+
		"\2\2\u081b\u081c\3\2\2\2\u081c\u0103\3\2\2\2\u081d\u0821\5\u0106\u0084"+
		"\2\u081e\u0821\5\u0108\u0085\2\u081f\u0821\5\u010a\u0086\2\u0820\u081d"+
		"\3\2\2\2\u0820\u081e\3\2\2\2\u0820\u081f\3\2\2\2\u0821\u0105\3\2\2\2\u0822"+
		"\u0824\7A\2\2\u0823\u0822\3\2\2\2\u0823\u0824\3\2\2\2\u0824\u0825\3\2"+
		"\2\2\u0825\u0828\7\u00fb\2\2\u0826\u0828\7B\2\2\u0827\u0823\3\2\2\2\u0827"+
		"\u0826\3\2\2\2\u0828\u082a\3\2\2\2\u0829\u082b\7\u0161\2\2\u082a\u0829"+
		"\3\2\2\2\u082a\u082b\3\2\2\2\u082b\u082c\3\2\2\2\u082c\u082d\5\u0186\u00c4"+
		"\2\u082d\u0107\3\2\2\2\u082e\u082f\t\37\2\2\u082f\u0830\t \2\2\u0830\u0109"+
		"\3\2\2\2\u0831\u0832\7\u00e0\2\2\u0832\u0835\7\u0161\2\2\u0833\u0836\5"+
		"\u0186\u00c4\2\u0834\u0836\7\u00c2\2\2\u0835\u0833\3\2\2\2\u0835\u0834"+
		"\3\2\2\2\u0836\u0838\3\2\2\2\u0837\u0839\7\u012e\2\2\u0838\u0837\3\2\2"+
		"\2\u0838\u0839\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u083b\7u\2\2\u083b\u083c"+
		"\t!\2\2\u083c\u010b\3\2\2\2\u083d\u083e\7\u0107\2\2\u083e\u083f\5\u01be"+
		"\u00e0\2\u083f\u010d\3\2\2\2\u0840\u0843\7\u011b\2\2\u0841\u0842\7\u0127"+
		"\2\2\u0842\u0844\5\u0186\u00c4\2\u0843\u0841\3\2\2\2\u0843\u0844\3\2\2"+
		"\2\u0844\u0845\3\2\2\2\u0845\u084f\7u\2\2\u0846\u0850\5\u0120\u0091\2"+
		"\u0847\u0849\5\u0150\u00a9\2\u0848\u084a\5\u0152\u00aa\2\u0849\u0848\3"+
		"\2\2\2\u0849\u084a\3\2\2\2\u084a\u084d\3\2\2\2\u084b\u084c\7\u00a6\2\2"+
		"\u084c\u084e\5\u0186\u00c4\2\u084d\u084b\3\2\2\2\u084d\u084e\3\2\2\2\u084e"+
		"\u0850\3\2\2\2\u084f\u0846\3\2\2\2\u084f\u0847\3\2\2\2\u0850\u010f\3\2"+
		"\2\2\u0851\u0853\7\u012a\2\2\u0852\u0854\7\u011d\2\2\u0853\u0852\3\2\2"+
		"\2\u0853\u0854\3\2\2\2\u0854\u0855\3\2\2\2\u0855\u0856\5\u0150\u00a9\2"+
		"\u0856\u0111\3\2\2\2\u0857\u0858\7\u0130\2\2\u0858\u0859\5\u0186\u00c4"+
		"\2\u0859\u0113\3\2\2\2\u085a\u085c\7\u0133\2\2\u085b\u085d\7\u016b\2\2"+
		"\u085c\u085b\3\2\2\2\u085c\u085d\3\2\2\2\u085d\u085e\3\2\2\2\u085e\u0863"+
		"\5\u0186\u00c4\2\u085f\u0860\7\u015d\2\2\u0860\u0862\5\u0186\u00c4\2\u0861"+
		"\u085f\3\2\2\2\u0862\u0865\3\2\2\2\u0863\u0861\3\2\2\2\u0863\u0864\3\2"+
		"\2\2\u0864\u0867\3\2\2\2\u0865\u0863\3\2\2\2\u0866\u0868\7\u016e\2\2\u0867"+
		"\u0866\3\2\2\2\u0867\u0868\3\2\2\2\u0868\u0869\3\2\2\2\u0869\u086b\7\u0099"+
		"\2\2\u086a\u086c\7\u016b\2\2\u086b\u086a\3\2\2\2\u086b\u086c\3\2\2\2\u086c"+
		"\u086d\3\2\2\2\u086d\u0872\5\u01be\u00e0\2\u086e\u086f\7\u015d\2\2";
	private static final String _serializedATNSegment1 =
		"\u086f\u0871\5\u01be\u00e0\2\u0870\u086e\3\2\2\2\u0871\u0874\3\2\2\2\u0872"+
		"\u0870\3\2\2\2\u0872\u0873\3\2\2\2\u0873\u0876\3\2\2\2\u0874\u0872\3\2"+
		"\2\2\u0875\u0877\7\u016e\2\2\u0876\u0875\3\2\2\2\u0876\u0877\3\2\2\2\u0877"+
		"\u0115\3\2\2\2\u0878\u0879\7\u013b\2\2\u0879\u087a\5\u0176\u00bc\2\u087a"+
		"\u087b\t\"\2\2\u087b\u087c\5\4\3\2\u087c\u087e\7d\2\2\u087d\u087f\t#\2"+
		"\2\u087e\u087d\3\2\2\2\u087e\u087f\3\2\2\2\u087f\u0117\3\2\2\2\u0880\u0881"+
		"\7u\2\2\u0881\u0882\7\u0172\2\2\u0882\u0884\7\u008b\2\2\u0883\u0885\7"+
		"\u016b\2\2\u0884\u0883\3\2\2\2\u0884\u0885\3\2\2\2\u0885\u0886\3\2\2\2"+
		"\u0886\u0888\5\u0120\u0091\2\u0887\u0889\7\u016e\2\2\u0888\u0887\3\2\2"+
		"\2\u0888\u0889\3\2\2\2\u0889\u088a\3\2\2\2\u088a\u088b\7\u00b0\2\2\u088b"+
		"\u088c\5\4\3\2\u088c\u088d\7d\2\2\u088d\u088e\7\u00b0\2\2\u088e\u0119"+
		"\3\2\2\2\u088f\u0890\7u\2\2\u0890\u0891\7\u0172\2\2\u0891\u0893\7\u008b"+
		"\2\2\u0892\u0894\7\u00ee\2\2\u0893\u0892\3\2\2\2\u0893\u0894\3\2\2\2\u0894"+
		"\u0895\3\2\2\2\u0895\u0896\5\u0186\u00c4\2\u0896\u0897\7\u0160\2\2\u0897"+
		"\u089a\5\u0186\u00c4\2\u0898\u0899\t$\2\2\u0899\u089b\5\u0186\u00c4\2"+
		"\u089a\u0898\3\2\2\2\u089a\u089b\3\2\2\2\u089b\u089c\3\2\2\2\u089c\u089d"+
		"\7\u00b0\2\2\u089d\u089e\5\4\3\2\u089e\u089f\7d\2\2\u089f\u08a0\7\u00b0"+
		"\2\2\u08a0\u011b\3\2\2\2\u08a1\u08a8\7\u017b\2\2\u08a2\u08a3\7\u0167\2"+
		"\2\u08a3\u08a4\7\u0167\2\2\u08a4\u08a5\7\u0172\2\2\u08a5\u08a6\7\u0165"+
		"\2\2\u08a6\u08a8\7\u0165\2\2\u08a7\u08a1\3\2\2\2\u08a7\u08a2\3\2\2\2\u08a8"+
		"\u011d\3\2\2\2\u08a9\u08aa\7\u0131\2\2\u08aa\u08af\5\u0186\u00c4\2\u08ab"+
		"\u08ac\7\u015d\2\2\u08ac\u08ae\5\u0186\u00c4\2\u08ad\u08ab\3\2\2\2\u08ae"+
		"\u08b1\3\2\2\2\u08af\u08ad\3\2\2\2\u08af\u08b0\3\2\2\2\u08b0\u011f\3\2"+
		"\2\2\u08b1\u08af\3\2\2\2\u08b2\u08b4\5\u0122\u0092\2\u08b3\u08b2\3\2\2"+
		"\2\u08b3\u08b4\3\2\2\2\u08b4\u08b5\3\2\2\2\u08b5\u08b6\5\u0128\u0095\2"+
		"\u08b6\u0121\3\2\2\2\u08b7\u08b8\7\u013c\2\2\u08b8\u08bd\5\u0124\u0093"+
		"\2\u08b9\u08ba\7\u015d\2\2\u08ba\u08bc\5\u0124\u0093\2\u08bb\u08b9\3\2"+
		"\2\2\u08bc\u08bf\3\2\2\2\u08bd\u08bb\3\2\2\2\u08bd\u08be\3\2\2\2\u08be"+
		"\u0123\3\2\2\2\u08bf\u08bd\3\2\2\2\u08c0\u08c2\5\u01be\u00e0\2\u08c1\u08c3"+
		"\5\u0126\u0094\2\u08c2\u08c1\3\2\2\2\u08c2\u08c3\3\2\2\2\u08c3\u08c4\3"+
		"\2\2\2\u08c4\u08c5\7\20\2\2\u08c5\u08c6\7\u016b\2\2\u08c6\u08c7\5\u0128"+
		"\u0095\2\u08c7\u08c8\7\u016e\2\2\u08c8\u0125\3\2\2\2\u08c9\u08ca\7\u016b"+
		"\2\2\u08ca\u08cf\5\u01be\u00e0\2\u08cb\u08cc\7\u015d\2\2\u08cc\u08ce\5"+
		"\u01be\u00e0\2\u08cd\u08cb\3\2\2\2\u08ce\u08d1\3\2\2\2\u08cf\u08cd\3\2"+
		"\2\2\u08cf\u08d0\3\2\2\2\u08d0\u08d2\3\2\2\2\u08d1\u08cf\3\2\2\2\u08d2"+
		"\u08d3\7\u016e\2\2\u08d3\u0127\3\2\2\2\u08d4\u08da\5\u012a\u0096\2\u08d5"+
		"\u08d6\5\u012c\u0097\2\u08d6\u08d7\5\u012a\u0096\2\u08d7\u08d9\3\2\2\2"+
		"\u08d8\u08d5\3\2\2\2\u08d9\u08dc\3\2\2\2\u08da\u08d8\3\2\2\2\u08da\u08db"+
		"\3\2\2\2\u08db\u0129\3\2\2\2\u08dc\u08da\3\2\2\2\u08dd\u08e3\5\u012e\u0098"+
		"\2\u08de\u08df\7\u016b\2\2\u08df\u08e0\5\u0128\u0095\2\u08e0\u08e1\7\u016e"+
		"\2\2\u08e1\u08e3\3\2\2\2\u08e2\u08dd\3\2\2\2\u08e2\u08de\3\2\2\2\u08e3"+
		"\u012b\3\2\2\2\u08e4\u08e6\7\u012c\2\2\u08e5\u08e7\7\n\2\2\u08e6\u08e5"+
		"\3\2\2\2\u08e6\u08e7\3\2\2\2\u08e7\u08f1\3\2\2\2\u08e8\u08ea\7g\2\2\u08e9"+
		"\u08eb\7\n\2\2\u08ea\u08e9\3\2\2\2\u08ea\u08eb\3\2\2\2\u08eb\u08f1\3\2"+
		"\2\2\u08ec\u08ee\7\u0097\2\2\u08ed\u08ef\7\n\2\2\u08ee\u08ed\3\2\2\2\u08ee"+
		"\u08ef\3\2\2\2\u08ef\u08f1\3\2\2\2\u08f0\u08e4\3\2\2\2\u08f0\u08e8\3\2"+
		"\2\2\u08f0\u08ec\3\2\2\2\u08f1\u012d\3\2\2\2\u08f2\u08f3\t%\2\2\u08f3"+
		"\u08f5\5\u0130\u0099\2\u08f4\u08f6\5\u013c\u009f\2\u08f5\u08f4\3\2\2\2"+
		"\u08f5\u08f6\3\2\2\2\u08f6\u08f8\3\2\2\2\u08f7\u08f9\5\u013e\u00a0\2\u08f8"+
		"\u08f7\3\2\2\2\u08f8\u08f9\3\2\2\2\u08f9\u08fb\3\2\2\2\u08fa\u08fc\5\u0152"+
		"\u00aa\2\u08fb\u08fa\3\2\2\2\u08fb\u08fc\3\2\2\2\u08fc\u08fe\3\2\2\2\u08fd"+
		"\u08ff\5\u0154\u00ab\2\u08fe\u08fd\3\2\2\2\u08fe\u08ff\3\2\2\2\u08ff\u0902"+
		"\3\2\2\2\u0900\u0903\5\u0156\u00ac\2\u0901\u0903\5\u0158\u00ad\2\u0902"+
		"\u0900\3\2\2\2\u0902\u0901\3\2\2\2\u0902\u0903\3\2\2\2\u0903\u0905\3\2"+
		"\2\2\u0904\u0906\5\u015a\u00ae\2\u0905\u0904\3\2\2\2\u0905\u0906\3\2\2"+
		"\2\u0906\u0908\3\2\2\2\u0907\u0909\5\u015c\u00af\2\u0908\u0907\3\2\2\2"+
		"\u0908\u0909\3\2\2\2\u0909\u012f\3\2\2\2\u090a\u090c\5\u0132\u009a\2\u090b"+
		"\u090a\3\2\2\2\u090b\u090c\3\2\2\2\u090c\u090e\3\2\2\2\u090d\u090f\5\u0134"+
		"\u009b\2\u090e\u090d\3\2\2\2\u090e\u090f\3\2\2\2\u090f\u0910\3\2\2\2\u0910"+
		"\u0915\5\u0136\u009c\2\u0911\u0912\7\u015d\2\2\u0912\u0914\5\u0136\u009c"+
		"\2\u0913\u0911\3\2\2\2\u0914\u0917\3\2\2\2\u0915\u0913\3\2\2\2\u0915\u0916"+
		"\3\2\2\2\u0916\u0131\3\2\2\2\u0917\u0915\3\2\2\2\u0918\u0919\t&\2\2\u0919"+
		"\u0133\3\2\2\2\u091a\u091b\7\u0127\2\2\u091b\u091c\5\u0186\u00c4\2\u091c"+
		"\u0135\3\2\2\2\u091d\u091e\5\u01be\u00e0\2\u091e\u091f\7\u0161\2\2\u091f"+
		"\u0921\3\2\2\2\u0920\u091d\3\2\2\2\u0920\u0921\3\2\2\2\u0921\u0922\3\2"+
		"\2\2\u0922\u0924\5\u0186\u00c4\2\u0923\u0925\5\u0138\u009d\2\u0924\u0923"+
		"\3\2\2\2\u0924\u0925\3\2\2\2\u0925\u0928\3\2\2\2\u0926\u0928\5\u013a\u009e"+
		"\2\u0927\u0920\3\2\2\2\u0927\u0926\3\2\2\2\u0928\u0137\3\2\2\2\u0929\u092b"+
		"\6\u009d\5\2\u092a\u092c\7\20\2\2\u092b\u092a\3\2\2\2\u092b\u092c\3\2"+
		"\2\2\u092c\u092d\3\2\2\2\u092d\u0933\5\u01be\u00e0\2\u092e\u092f\7\u016b"+
		"\2\2\u092f\u0930\7\u0125\2\2\u0930\u0931\7\u0173\2\2\u0931\u0933\7\u016e"+
		"\2\2\u0932\u0929\3\2\2\2\u0932\u092e\3\2\2\2\u0933\u0139\3\2\2\2\u0934"+
		"\u0935\7\u0172\2\2\u0935\u0937\7\6\2\2\u0936\u0934\3\2\2\2\u0936\u0937"+
		"\3\2\2\2\u0937\u0938\3\2\2\2\u0938\u0939\7\u0169\2\2\u0939\u013b\3\2\2"+
		"\2\u093a\u093b\7\u0099\2\2\u093b\u0940\5\u01be\u00e0\2\u093c\u093d\7\u015d"+
		"\2\2\u093d\u093f\5\u01be\u00e0\2\u093e\u093c\3\2\2\2\u093f\u0942\3\2\2"+
		"\2\u0940\u093e\3\2\2\2\u0940\u0941\3\2\2\2\u0941\u013d\3\2\2\2\u0942\u0940"+
		"\3\2\2\2\u0943\u0944\7y\2\2\u0944\u0948\5\u0140\u00a1\2\u0945\u0947\5"+
		"\u0146\u00a4\2\u0946\u0945\3\2\2\2\u0947\u094a\3\2\2\2\u0948\u0946\3\2"+
		"\2\2\u0948\u0949\3\2\2\2\u0949\u013f\3\2\2\2\u094a\u0948\3\2\2\2\u094b"+
		"\u094f\5\u0142\u00a2\2\u094c\u094f\5\u0144\u00a3\2\u094d\u094f\5\u014a"+
		"\u00a6\2\u094e\u094b\3\2\2\2\u094e\u094c\3\2\2\2\u094e\u094d\3\2\2\2\u094f"+
		"\u0141\3\2\2\2\u0950\u0952\5\u0150\u00a9\2\u0951\u0953\5\u014e\u00a8\2"+
		"\u0952\u0951\3\2\2\2\u0952\u0953\3\2\2\2\u0953\u0143\3\2\2\2\u0954\u0955"+
		"\7\u016b\2\2\u0955\u0956\5\u0120\u0091\2\u0956\u0958\7\u016e\2\2\u0957"+
		"\u0959\5\u014e\u00a8\2\u0958\u0957\3\2\2\2\u0958\u0959\3\2\2\2\u0959\u0145"+
		"\3\2\2\2\u095a\u095b\7\u015d\2\2\u095b\u0962\5\u0140\u00a1\2\u095c\u095d"+
		"\5\u0148\u00a5\2\u095d\u095e\5\u0140\u00a1\2\u095e\u095f\7\u00ca\2\2\u095f"+
		"\u0960\5\u0176\u00bc\2\u0960\u0962\3\2\2\2\u0961\u095a\3\2\2\2\u0961\u095c"+
		"\3\2\2\2\u0962\u0147\3\2\2\2\u0963\u0965\7\u008f\2\2\u0964\u0963\3\2\2"+
		"\2\u0964\u0965\3\2\2\2\u0965\u0966\3\2\2\2\u0966\u096d\7\u009e\2\2\u0967"+
		"\u0969\t\'\2\2\u0968\u096a\7\u00d0\2\2\u0969\u0968\3\2\2\2\u0969\u096a"+
		"\3\2\2\2\u096a\u096b\3\2\2\2\u096b\u096d\7\u009e\2\2\u096c\u0964\3\2\2"+
		"\2\u096c\u0967\3\2\2\2\u096d\u0149\3\2\2\2\u096e\u096f\7\u011d\2\2\u096f"+
		"\u0970\7\u016b\2\2\u0970\u0971\7\u0133\2\2\u0971\u0976\5\u014c\u00a7\2"+
		"\u0972\u0973\7\u015d\2\2\u0973\u0975\5\u014c\u00a7\2\u0974\u0972\3\2\2"+
		"\2\u0975\u0978\3\2\2\2\u0976\u0974\3\2\2\2\u0976\u0977\3\2\2\2\u0977\u0979"+
		"\3\2\2\2\u0978\u0976\3\2\2\2\u0979\u097b\7\u016e\2\2\u097a\u097c\5\u014e"+
		"\u00a8\2\u097b\u097a\3\2\2\2\u097b\u097c\3\2\2\2\u097c\u014b\3\2\2\2\u097d"+
		"\u098a\5\u0186\u00c4\2\u097e\u097f\7\u016b\2\2\u097f\u0984\5\u0186\u00c4"+
		"\2\u0980\u0981\7\u015d\2\2\u0981\u0983\5\u0186\u00c4\2\u0982\u0980\3\2"+
		"\2\2\u0983\u0986\3\2\2\2\u0984\u0982\3\2\2\2\u0984\u0985\3\2\2\2\u0985"+
		"\u0987\3\2\2\2\u0986\u0984\3\2\2\2\u0987\u0988\7\u016e\2\2\u0988\u098a"+
		"\3\2\2\2\u0989\u097d\3\2\2\2\u0989\u097e\3\2\2\2\u098a\u014d\3\2\2\2\u098b"+
		"\u098d\6\u00a8\6\2\u098c\u098e\7\20\2\2\u098d\u098c\3\2\2\2\u098d\u098e"+
		"\3\2\2\2\u098e\u098f\3\2\2\2\u098f\u099a\5\u01be\u00e0\2\u0990\u0991\7"+
		"\u016b\2\2\u0991\u0996\7\u0172\2\2\u0992\u0993\7\u015d\2\2\u0993\u0995"+
		"\7\u0172\2\2\u0994\u0992\3\2\2\2\u0995\u0998\3\2\2\2\u0996\u0994\3\2\2"+
		"\2\u0996\u0997\3\2\2\2\u0997\u0999\3\2\2\2\u0998\u0996\3\2\2\2\u0999\u099b"+
		"\7\u016e\2\2\u099a\u0990\3\2\2\2\u099a\u099b\3\2\2\2\u099b\u014f\3\2\2"+
		"\2\u099c\u099d\5\u01be\u00e0\2\u099d\u0151\3\2\2\2\u099e\u099f\7\u013a"+
		"\2\2\u099f\u09a0\5\u0176\u00bc\2\u09a0\u0153\3\2\2\2\u09a1\u09a2\7\u0080"+
		"\2\2\u09a2\u09a3\7 \2\2\u09a3\u09a8\5\u0186\u00c4\2\u09a4\u09a5\7\u015d"+
		"\2\2\u09a5\u09a7\5\u0186\u00c4\2\u09a6\u09a4\3\2\2\2\u09a7\u09aa\3\2\2"+
		"\2\u09a8\u09a6\3\2\2\2\u09a8\u09a9\3\2\2\2\u09a9\u0155\3\2\2\2\u09aa\u09a8"+
		"\3\2\2\2\u09ab\u09ac\7\u0083\2\2\u09ac\u09ad\5\u0176\u00bc\2\u09ad\u0157"+
		"\3\2\2\2\u09ae\u09af\7\u00df\2\2\u09af\u09b0\5\u0176\u00bc\2\u09b0\u0159"+
		"\3\2\2\2\u09b1\u09b2\7\u00ce\2\2\u09b2\u09b3\7 \2\2\u09b3\u09b5\5\u0186"+
		"\u00c4\2\u09b4\u09b6\t\t\2\2\u09b5\u09b4\3\2\2\2\u09b5\u09b6\3\2\2\2\u09b6"+
		"\u09be\3\2\2\2\u09b7\u09b8\7\u015d\2\2\u09b8\u09ba\5\u0186\u00c4\2\u09b9"+
		"\u09bb\t\t\2\2\u09ba\u09b9\3\2\2\2\u09ba\u09bb\3\2\2\2\u09bb\u09bd\3\2"+
		"\2\2\u09bc\u09b7\3\2\2\2\u09bd\u09c0\3\2\2\2\u09be\u09bc\3\2\2\2\u09be"+
		"\u09bf\3\2\2\2\u09bf\u015b\3\2\2\2\u09c0\u09be\3\2\2\2\u09c1\u09c3\5\u015e"+
		"\u00b0\2\u09c2\u09c1\3\2\2\2\u09c3\u09c4\3\2\2\2\u09c4\u09c2\3\2\2\2\u09c4"+
		"\u09c5\3\2\2\2\u09c5\u015d\3\2\2\2\u09c6\u09c7\7\u00a6\2\2\u09c7\u09d2"+
		"\5\u0186\u00c4\2\u09c8\u09c9\7\u013c\2\2\u09c9\u09cf\t(\2\2\u09ca\u09cb"+
		"\7\u0130\2\2\u09cb\u09cc\7\r\2\2\u09cc\u09cd\7\u009f\2\2\u09cd\u09ce\t"+
		")\2\2\u09ce\u09d0\7\u00ac\2\2\u09cf\u09ca\3\2\2\2\u09cf\u09d0\3\2\2\2"+
		"\u09d0\u09d2\3\2\2\2\u09d1\u09c6\3\2\2\2\u09d1\u09c8\3\2\2\2\u09d2\u015f"+
		"\3\2\2\2\u09d3\u09d4\7\u012e\2\2\u09d4\u09d5\5\u0164\u00b3\2\u09d5\u09d6"+
		"\7\u0102\2\2\u09d6\u09d8\5\u0162\u00b2\2\u09d7\u09d9\5\u0152\u00aa\2\u09d8"+
		"\u09d7\3\2\2\2\u09d8\u09d9\3\2\2\2\u09d9\u09db\3\2\2\2\u09da\u09dc\5\u0166"+
		"\u00b4\2\u09db\u09da\3\2\2\2\u09db\u09dc\3\2\2\2\u09dc\u0161\3\2\2\2\u09dd"+
		"\u09e2\5\34\17\2\u09de\u09df\7\u015d\2\2\u09df\u09e1\5\34\17\2\u09e0\u09de"+
		"\3\2\2\2\u09e1\u09e4\3\2\2\2\u09e2\u09e0\3\2\2\2\u09e2\u09e3\3\2\2\2\u09e3"+
		"\u0163\3\2\2\2\u09e4\u09e2\3\2\2\2\u09e5\u09e7\5\u0150\u00a9\2\u09e6\u09e8"+
		"\5\u013e\u00a0\2\u09e7\u09e6\3\2\2\2\u09e7\u09e8\3\2\2\2\u09e8\u09ee\3"+
		"\2\2\2\u09e9\u09ea\7\u016b\2\2\u09ea\u09eb\5\u0120\u0091\2\u09eb\u09ec"+
		"\7\u016e\2\2\u09ec\u09ee\3\2\2\2\u09ed\u09e5\3\2\2\2\u09ed\u09e9\3\2\2"+
		"\2\u09ee\u09f3\3\2\2\2\u09ef\u09f1\7\20\2\2\u09f0\u09ef\3\2\2\2\u09f0"+
		"\u09f1\3\2\2\2\u09f1\u09f2\3\2\2\2\u09f2\u09f4\5\u01be\u00e0\2\u09f3\u09f0"+
		"\3\2\2\2\u09f3\u09f4\3\2\2\2\u09f4\u0165\3\2\2\2\u09f5\u09f6\7`\2\2\u09f6"+
		"\u09f7\5\u00b2Z\2\u09f7\u0167\3\2\2\2\u09f8\u09f9\7\u00b5\2\2\u09f9\u09fa"+
		"\7\u0099\2\2\u09fa\u09fb\5\u016a\u00b6\2\u09fb\u09fc\7\u0131\2\2\u09fc"+
		"\u09fd\5\u016a\u00b6\2\u09fd\u09fe\7\u00ca\2\2\u09fe\u0a00\5\u0176\u00bc"+
		"\2\u09ff\u0a01\5\u016c\u00b7\2\u0a00\u09ff\3\2\2\2\u0a01\u0a02\3\2\2\2"+
		"\u0a02\u0a00\3\2\2\2\u0a02\u0a03\3\2\2\2\u0a03\u0169\3\2\2\2\u0a04\u0a0a"+
		"\5\u0150\u00a9\2\u0a05\u0a06\7\u016b\2\2\u0a06\u0a07\5\u0120\u0091\2\u0a07"+
		"\u0a08\7\u016e\2\2\u0a08\u0a0a\3\2\2\2\u0a09\u0a04\3\2\2\2\u0a09\u0a05"+
		"\3\2\2\2\u0a0a\u0a0f\3\2\2\2\u0a0b\u0a0d\7\20\2\2\u0a0c\u0a0b\3\2\2\2"+
		"\u0a0c\u0a0d\3\2\2\2\u0a0d\u0a0e\3\2\2\2\u0a0e\u0a10\5\u01be\u00e0\2\u0a0f"+
		"\u0a0c\3\2\2\2\u0a0f\u0a10\3\2\2\2\u0a10\u016b\3\2\2\2\u0a11\u0a13\7\u0139"+
		"\2\2\u0a12\u0a14\7\u00c3\2\2\u0a13\u0a12\3\2\2\2\u0a13\u0a14\3\2\2\2\u0a14"+
		"\u0a15\3\2\2\2\u0a15\u0a18\7\u00b2\2\2\u0a16\u0a17\7\r\2\2\u0a17\u0a19"+
		"\5\u0176\u00bc\2\u0a18\u0a16\3\2\2\2\u0a18\u0a19\3\2\2\2\u0a19\u0a1a\3"+
		"\2\2\2\u0a1a\u0a1b\7\u0122\2\2\u0a1b\u0a1f\5\u016e\u00b8\2\u0a1c\u0a1d"+
		"\7`\2\2\u0a1d\u0a1f\7\u0089\2\2\u0a1e\u0a11\3\2\2\2\u0a1e\u0a1c\3\2\2"+
		"\2\u0a1f\u016d\3\2\2\2\u0a20\u0a22\7\u0091\2\2\u0a21\u0a23\5\u00b4[\2"+
		"\u0a22\u0a21\3\2\2\2\u0a22\u0a23\3\2\2\2\u0a23\u0a24\3\2\2\2\u0a24\u0a25"+
		"\7\u0133\2\2\u0a25\u0a35\5\u00b8]\2\u0a26\u0a27\7\u012e\2\2\u0a27\u0a28"+
		"\7\u0102\2\2\u0a28\u0a2d\5\34\17\2\u0a29\u0a2a\7\u015d\2\2\u0a2a\u0a2c"+
		"\5\34\17\2\u0a2b\u0a29\3\2\2\2\u0a2c\u0a2f\3\2\2\2\u0a2d\u0a2b\3\2\2\2"+
		"\u0a2d\u0a2e\3\2\2\2\u0a2e\u0a31\3\2\2\2\u0a2f\u0a2d\3\2\2\2\u0a30\u0a32"+
		"\5\u0152\u00aa\2\u0a31\u0a30\3\2\2\2\u0a31\u0a32\3\2\2\2\u0a32\u0a35\3"+
		"\2\2\2\u0a33\u0a35\7R\2\2\u0a34\u0a20\3\2\2\2\u0a34\u0a26\3\2\2\2\u0a34"+
		"\u0a33\3\2\2\2\u0a35\u016f\3\2\2\2\u0a36\u0a38\7R\2\2\u0a37\u0a39\7y\2"+
		"\2\u0a38\u0a37\3\2\2\2\u0a38\u0a39\3\2\2\2\u0a39\u0a3a\3\2\2\2\u0a3a\u0a3c"+
		"\5\u0150\u00a9\2\u0a3b\u0a3d\5\u0172\u00ba\2\u0a3c\u0a3b\3\2\2\2\u0a3c"+
		"\u0a3d\3\2\2\2\u0a3d\u0a40\3\2\2\2\u0a3e\u0a41\5\u0152\u00aa\2\u0a3f\u0a41"+
		"\7\n\2\2\u0a40\u0a3e\3\2\2\2\u0a40\u0a3f\3\2\2\2\u0a40\u0a41\3\2\2\2\u0a41"+
		"\u0171\3\2\2\2\u0a42\u0a44\6\u00ba\7\2\u0a43\u0a45\7\20\2\2\u0a44\u0a43"+
		"\3\2\2\2\u0a44\u0a45\3\2\2\2\u0a45\u0a46\3\2\2\2\u0a46\u0a47\5\u01be\u00e0"+
		"\2\u0a47\u0173\3\2\2\2\u0a48\u0a4a\t*\2\2\u0a49\u0a4b\7\u011d\2\2\u0a4a"+
		"\u0a49\3\2\2\2\u0a4a\u0a4b\3\2\2\2\u0a4b\u0a4c\3\2\2\2\u0a4c\u0a4d\5\u0150"+
		"\u00a9\2\u0a4d\u0175\3\2\2\2\u0a4e\u0a50\b\u00bc\1\2\u0a4f\u0a51\7\u00c3"+
		"\2\2\u0a50\u0a4f\3\2\2\2\u0a50\u0a51\3\2\2\2\u0a51\u0a52\3\2\2\2\u0a52"+
		"\u0a53\7\u016b\2\2\u0a53\u0a54\5\u0176\u00bc\2\u0a54\u0a55\7\u016e\2\2"+
		"\u0a55\u0a58\3\2\2\2\u0a56\u0a58\5\u0178\u00bd\2\u0a57\u0a4e\3\2\2\2\u0a57"+
		"\u0a56\3\2\2\2\u0a58\u0a5f\3\2\2\2\u0a59\u0a5a\f\4\2\2\u0a5a\u0a5b\5\u0182"+
		"\u00c2\2\u0a5b\u0a5c\5\u0176\u00bc\5\u0a5c\u0a5e\3\2\2\2\u0a5d\u0a59\3"+
		"\2\2\2\u0a5e\u0a61\3\2\2\2\u0a5f\u0a5d\3\2\2\2\u0a5f\u0a60\3\2\2\2\u0a60"+
		"\u0177\3\2\2\2\u0a61\u0a5f\3\2\2\2\u0a62\u0a66\5\u017a\u00be\2\u0a63\u0a66"+
		"\5\u0180\u00c1\2\u0a64\u0a66\5\u0186\u00c4\2\u0a65\u0a62\3\2\2\2\u0a65"+
		"\u0a63\3\2\2\2\u0a65\u0a64\3\2\2\2\u0a66\u0179\3\2\2\2\u0a67\u0a68\5\u0186"+
		"\u00c4\2\u0a68\u0a6a\7\u009b\2\2\u0a69\u0a6b\7\u00c3\2\2\u0a6a\u0a69\3"+
		"\2\2\2\u0a6a\u0a6b\3\2\2\2\u0a6b\u0a6c\3\2\2\2\u0a6c\u0a6d\7\u00c5\2\2"+
		"\u0a6d\u0a7f\3\2\2\2\u0a6e\u0a6f\5\u0186\u00c4\2\u0a6f\u0a70\7\30\2\2"+
		"\u0a70\u0a71\5\u0186\u00c4\2\u0a71\u0a72\7\r\2\2\u0a72\u0a73\5\u0186\u00c4"+
		"\2\u0a73\u0a7f\3\2\2\2\u0a74\u0a76\7\u00c3\2\2\u0a75\u0a74\3\2\2\2\u0a75"+
		"\u0a76\3\2\2\2\u0a76\u0a77\3\2\2\2\u0a77\u0a78\7l\2\2\u0a78\u0a79\7\u016b"+
		"\2\2\u0a79\u0a7a\5\u0120\u0091\2\u0a7a\u0a7b\7\u016e\2\2\u0a7b\u0a7f\3"+
		"\2\2\2\u0a7c\u0a7f\5\u017c\u00bf\2\u0a7d\u0a7f\5\u017e\u00c0\2\u0a7e\u0a67"+
		"\3\2\2\2\u0a7e\u0a6e\3\2\2\2\u0a7e\u0a75\3\2\2\2\u0a7e\u0a7c\3\2\2\2\u0a7e"+
		"\u0a7d\3\2\2\2\u0a7f\u017b\3\2\2\2\u0a80\u0a82\5\u0186\u00c4\2\u0a81\u0a83"+
		"\7\u00c3\2\2\u0a82\u0a81\3\2\2\2\u0a82\u0a83\3\2\2\2\u0a83\u0a84\3\2\2"+
		"\2\u0a84\u0a85\7\u008b\2\2\u0a85\u0a8f\7\u016b\2\2\u0a86\u0a8b\5\u0186"+
		"\u00c4\2\u0a87\u0a88\7\u015d\2\2\u0a88\u0a8a\5\u0186\u00c4\2\u0a89\u0a87"+
		"\3\2\2\2\u0a8a\u0a8d\3\2\2\2\u0a8b\u0a89\3\2\2\2\u0a8b\u0a8c\3\2\2\2\u0a8c"+
		"\u0a90\3\2\2\2\u0a8d\u0a8b\3\2\2\2\u0a8e\u0a90\5\u0120\u0091\2\u0a8f\u0a86"+
		"\3\2\2\2\u0a8f\u0a8e\3\2\2\2\u0a90\u0a91\3\2\2\2\u0a91\u0a92\7\u016e\2"+
		"\2\u0a92\u017d\3\2\2\2\u0a93\u0a94\7\u016b\2\2\u0a94\u0a99\5\u0186\u00c4"+
		"\2\u0a95\u0a96\7\u015d\2\2\u0a96\u0a98\5\u0186\u00c4\2\u0a97\u0a95\3\2"+
		"\2\2\u0a98\u0a9b\3\2\2\2\u0a99\u0a97\3\2\2\2\u0a99\u0a9a\3\2\2\2\u0a9a"+
		"\u0a9c\3\2\2\2\u0a9b\u0a99\3\2\2\2\u0a9c\u0a9e\7\u016e\2\2\u0a9d\u0a9f"+
		"\7\u00c3\2\2\u0a9e\u0a9d\3\2\2\2\u0a9e\u0a9f\3\2\2\2\u0a9f\u0aa0\3\2\2"+
		"\2\u0aa0\u0aa1\7\u008b\2\2\u0aa1\u0aa2\7\u016b\2\2\u0aa2\u0aa3\5\u0120"+
		"\u0091\2\u0aa3\u0aa4\7\u016e\2\2\u0aa4\u017f\3\2\2\2\u0aa5\u0aa6\5\u0186"+
		"\u00c4\2\u0aa6\u0aa7\5\u0184\u00c3\2\u0aa7\u0aa8\5\u0186\u00c4\2\u0aa8"+
		"\u0181\3\2\2\2\u0aa9\u0aaa\t+\2\2\u0aaa\u0183\3\2\2\2\u0aab\u0ab8\7\u0161"+
		"\2\2\u0aac\u0ab8\7\u0162\2\2\u0aad\u0ab8\7\u0163\2\2\u0aae\u0ab8\7\u0164"+
		"\2\2\u0aaf\u0ab8\7\u0167\2\2\u0ab0\u0ab8\7\u0168\2\2\u0ab1\u0ab8\7\u0165"+
		"\2\2\u0ab2\u0ab8\7\u0166\2\2\u0ab3\u0ab5\7\u00c3\2\2\u0ab4\u0ab3\3\2\2"+
		"\2\u0ab4\u0ab5\3\2\2\2\u0ab5\u0ab6\3\2\2\2\u0ab6\u0ab8\t,\2\2\u0ab7\u0aab"+
		"\3\2\2\2\u0ab7\u0aac\3\2\2\2\u0ab7\u0aad\3\2\2\2\u0ab7\u0aae\3\2\2\2\u0ab7"+
		"\u0aaf\3\2\2\2\u0ab7\u0ab0\3\2\2\2\u0ab7\u0ab1\3\2\2\2\u0ab7\u0ab2\3\2"+
		"\2\2\u0ab7\u0ab4\3\2\2\2\u0ab8\u0185\3\2\2\2\u0ab9\u0aba\b\u00c4\1\2\u0aba"+
		"\u0abb\7\u016b\2\2\u0abb\u0abc\5\u0120\u0091\2\u0abc\u0abd\7\u016e\2\2"+
		"\u0abd\u0acb\3\2\2\2\u0abe\u0abf\7\u016b\2\2\u0abf\u0ac0\5\u0186\u00c4"+
		"\2\u0ac0\u0ac1\7\u016e\2\2\u0ac1\u0acb\3\2\2\2\u0ac2\u0acb\5\u018a\u00c6"+
		"\2\u0ac3\u0acb\5\u018e\u00c8\2\u0ac4\u0acb\5\u0192\u00ca\2\u0ac5\u0acb"+
		"\5\u0198\u00cd\2\u0ac6\u0acb\5\u019a\u00ce\2\u0ac7\u0acb\5\u01a2\u00d2"+
		"\2\u0ac8\u0acb\5\u01a4\u00d3\2\u0ac9\u0acb\5\u0188\u00c5\2\u0aca\u0ab9"+
		"\3\2\2\2\u0aca\u0abe\3\2\2\2\u0aca\u0ac2\3\2\2\2\u0aca\u0ac3\3\2\2\2\u0aca"+
		"\u0ac4\3\2\2\2\u0aca\u0ac5\3\2\2\2\u0aca\u0ac6\3\2\2\2\u0aca\u0ac7\3\2"+
		"\2\2\u0aca\u0ac8\3\2\2\2\u0aca\u0ac9\3\2\2\2\u0acb\u0adc\3\2\2\2\u0acc"+
		"\u0acd\f\20\2\2\u0acd\u0ace\7\u0169\2\2\u0ace\u0adb\5\u0186\u00c4\21\u0acf"+
		"\u0ad0\f\17\2\2\u0ad0\u0ad1\7\u015f\2\2\u0ad1\u0adb\5\u0186\u00c4\20\u0ad2"+
		"\u0ad3\f\16\2\2\u0ad3\u0ad4\7\u015b\2\2\u0ad4\u0adb\5\u0186\u00c4\17\u0ad5"+
		"\u0ad6\f\r\2\2\u0ad6\u0ad7\7\u0171\2\2\u0ad7\u0adb\5\u0186\u00c4\16\u0ad8"+
		"\u0ad9\f\21\2\2\u0ad9\u0adb\5\u018c\u00c7\2\u0ada\u0acc\3\2\2\2\u0ada"+
		"\u0acf\3\2\2\2\u0ada\u0ad2\3\2\2\2\u0ada\u0ad5\3\2\2\2\u0ada\u0ad8\3\2"+
		"\2\2\u0adb\u0ade\3\2\2\2\u0adc\u0ada\3\2\2\2\u0adc\u0add\3\2\2\2\u0add"+
		"\u0187\3\2\2\2\u0ade\u0adc\3\2\2\2\u0adf\u0ae8\5\u01ba\u00de\2\u0ae0\u0ae8"+
		"\5\u01bc\u00df\2\u0ae1\u0ae8\5\u01c6\u00e4\2\u0ae2\u0ae8\5\u01be\u00e0"+
		"\2\u0ae3\u0ae8\5\u01c0\u00e1\2\u0ae4\u0ae8\5\u01c4\u00e3\2\u0ae5\u0ae8"+
		"\5\u01c2\u00e2\2\u0ae6\u0ae8\5\u01c8\u00e5\2\u0ae7\u0adf\3\2\2\2\u0ae7"+
		"\u0ae0\3\2\2\2\u0ae7\u0ae1\3\2\2\2\u0ae7\u0ae2\3\2\2\2\u0ae7\u0ae3\3\2"+
		"\2\2\u0ae7\u0ae4\3\2\2\2\u0ae7\u0ae5\3\2\2\2\u0ae7\u0ae6\3\2\2\2\u0ae8"+
		"\u0189\3\2\2\2\u0ae9\u0aea\7\u0098\2\2\u0aea\u0aeb\5\u0186\u00c4\2\u0aeb"+
		"\u0aec\5\u018c\u00c7\2\u0aec\u018b\3\2\2\2\u0aed\u0aee\t-\2\2\u0aee\u018d"+
		"\3\2\2\2\u0aef\u0af0\5\u0190\u00c9\2\u0af0\u0af1\t.\2\2\u0af1\u0af6\5"+
		"\u0190\u00c9\2\u0af2\u0af3\t.\2\2\u0af3\u0af5\5\u0190\u00c9\2\u0af4\u0af2"+
		"\3\2\2\2\u0af5\u0af8\3\2\2\2\u0af6\u0af4\3\2\2\2\u0af6\u0af7\3\2\2\2\u0af7"+
		"\u018f\3\2\2\2\u0af8\u0af6\3\2\2\2\u0af9\u0afa\7\u016b\2\2\u0afa\u0afb"+
		"\5\u0186\u00c4\2\u0afb\u0afc\7\u016e\2\2\u0afc\u0b03\3\2\2\2\u0afd\u0b03"+
		"\5\u0192\u00ca\2\u0afe\u0b03\5\u019a\u00ce\2\u0aff\u0b03\5\u01a2\u00d2"+
		"\2\u0b00\u0b03\5\u01a4\u00d3\2\u0b01\u0b03\5\u0188\u00c5\2\u0b02\u0af9"+
		"\3\2\2\2\u0b02\u0afd\3\2\2\2\u0b02\u0afe\3\2\2\2\u0b02\u0aff\3\2\2\2\u0b02"+
		"\u0b00\3\2\2\2\u0b02\u0b01\3\2\2\2\u0b03\u0191\3\2\2\2\u0b04\u0b07\5\u0194"+
		"\u00cb\2\u0b05\u0b07\5\u0196\u00cc\2\u0b06\u0b04\3\2\2\2\u0b06\u0b05\3"+
		"\2\2\2\u0b07\u0193\3\2\2\2\u0b08\u0b09\7%\2\2\u0b09\u0b0f\5\u0186\u00c4"+
		"\2\u0b0a\u0b0b\7\u0139\2\2\u0b0b\u0b0c\5\u0186\u00c4\2\u0b0c\u0b0d\7\u0122"+
		"\2\2\u0b0d\u0b0e\5\u0186\u00c4\2\u0b0e\u0b10\3\2\2\2\u0b0f\u0b0a\3\2\2"+
		"\2\u0b10\u0b11\3\2\2\2\u0b11\u0b0f\3\2\2\2\u0b11\u0b12\3\2\2\2\u0b12\u0b15"+
		"\3\2\2\2\u0b13\u0b14\7`\2\2\u0b14\u0b16\5\u0186\u00c4\2\u0b15\u0b13\3"+
		"\2\2\2\u0b15\u0b16\3\2\2\2\u0b16\u0b17\3\2\2\2\u0b17\u0b18\7d\2\2\u0b18"+
		"\u0195\3\2\2\2\u0b19\u0b1f\7%\2\2\u0b1a\u0b1b\7\u0139\2\2\u0b1b\u0b1c"+
		"\5\u0176\u00bc\2\u0b1c\u0b1d\7\u0122\2\2\u0b1d\u0b1e\5\u0186\u00c4\2\u0b1e"+
		"\u0b20\3\2\2\2\u0b1f\u0b1a\3\2\2\2\u0b20\u0b21\3\2\2\2\u0b21\u0b1f\3\2"+
		"\2\2\u0b21\u0b22\3\2\2\2\u0b22\u0b25\3\2\2\2\u0b23\u0b24\7`\2\2\u0b24"+
		"\u0b26\5\u0186\u00c4\2\u0b25\u0b23\3\2\2\2\u0b25\u0b26\3\2\2\2\u0b26\u0b27"+
		"\3\2\2\2\u0b27\u0b28\7d\2\2\u0b28\u0197\3\2\2\2\u0b29\u0b2a\5\u01be\u00e0"+
		"\2\u0b2a\u0b2b\7\5\2\2\u0b2b\u0b2c\t/\2\2\u0b2c\u0199\3\2\2\2\u0b2d\u0b2e"+
		"\7\25\2\2\u0b2e\u0b30\7\u016b\2\2\u0b2f\u0b31\5\u019c\u00cf\2\u0b30\u0b2f"+
		"\3\2\2\2\u0b30\u0b31\3\2\2\2\u0b31\u0b32\3\2\2\2\u0b32\u0b33\5\u0186\u00c4"+
		"\2\u0b33\u0b35\7\u016e\2\2\u0b34\u0b36\5\u019e\u00d0\2\u0b35\u0b34\3\2"+
		"\2\2\u0b35\u0b36\3\2\2\2\u0b36\u0bc6\3\2\2\2\u0b37\u0b38\7;\2\2\u0b38"+
		"\u0b3e\7\u016b\2\2\u0b39\u0b3b\5\u019c\u00cf\2\u0b3a\u0b39\3\2\2\2\u0b3a"+
		"\u0b3b\3\2\2\2\u0b3b\u0b3c\3\2\2\2\u0b3c\u0b3f\5\u0186\u00c4\2\u0b3d\u0b3f"+
		"\7\u0169\2\2\u0b3e\u0b3a\3\2\2\2\u0b3e\u0b3d\3\2\2\2\u0b3f\u0b40\3\2\2"+
		"\2\u0b40\u0b42\7\u016e\2\2\u0b41\u0b43\5\u019e\u00d0\2\u0b42\u0b41\3\2"+
		"\2\2\u0b42\u0b43\3\2\2\2\u0b43\u0bc6\3\2\2\2\u0b44\u0b45\7<\2\2\u0b45"+
		"\u0b4b\7\u016b\2\2\u0b46\u0b48\5\u019c\u00cf\2\u0b47\u0b46\3\2\2\2\u0b47"+
		"\u0b48\3\2\2\2\u0b48\u0b49\3\2\2\2\u0b49\u0b4c\5\u0186\u00c4\2\u0b4a\u0b4c"+
		"\7\u0169\2\2\u0b4b\u0b47\3\2\2\2\u0b4b\u0b4a\3\2\2\2\u0b4c\u0b4d\3\2\2"+
		"\2\u0b4d\u0b4f\7\u016e\2\2\u0b4e\u0b50\5\u019e\u00d0\2\u0b4f\u0b4e\3\2"+
		"\2\2\u0b4f\u0b50\3\2\2\2\u0b50\u0bc6\3\2\2\2\u0b51\u0b52\7\u0144\2\2\u0b52"+
		"\u0b53\7\u016b\2\2\u0b53\u0b54\7\u016e\2\2\u0b54\u0bc6\5\u019e\u00d0\2"+
		"\u0b55\u0b56\7\u0148\2\2\u0b56\u0b57\7\u016b\2\2\u0b57\u0b58\7\u016e\2"+
		"\2\u0b58\u0bc6\5\u019e\u00d0\2\u0b59\u0b5a\7\u0149\2\2\u0b5a\u0b5b\7\u016b"+
		"\2\2\u0b5b\u0b5c\5\u0186\u00c4\2\u0b5c\u0b5d\7\u016e\2\2\u0b5d\u0b5e\5"+
		"\u019e\u00d0\2\u0b5e\u0bc6\3\2\2\2\u0b5f\u0b60\7\u014a\2\2\u0b60\u0b61"+
		"\7\u016b\2\2\u0b61\u0b68\5\u0186\u00c4\2\u0b62\u0b63\7\u015d\2\2\u0b63"+
		"\u0b66\5\u0186\u00c4\2\u0b64\u0b65\7\u015d\2\2\u0b65\u0b67\5\u0186\u00c4"+
		"\2\u0b66\u0b64\3\2\2\2\u0b66\u0b67\3\2\2\2\u0b67\u0b69\3\2\2\2\u0b68\u0b62"+
		"\3\2\2\2\u0b68\u0b69\3\2\2\2\u0b69\u0b6a\3\2\2\2\u0b6a\u0b6b\7\u016e\2"+
		"\2\u0b6b\u0b6c\5\u019e\u00d0\2\u0b6c\u0bc6\3\2\2\2\u0b6d\u0b6e\7\u014b"+
		"\2\2\u0b6e\u0b6f\7\u016b\2\2\u0b6f\u0b70\5\u0186\u00c4\2\u0b70\u0b71\7"+
		"\u016e\2\2\u0b71\u0b72\5\u019e\u00d0\2\u0b72\u0bc6\3\2\2\2\u0b73\u0b74"+
		"\7\u014c\2\2\u0b74\u0b75\7\u016b\2\2\u0b75\u0b7c\5\u0186\u00c4\2\u0b76"+
		"\u0b77\7\u015d\2\2\u0b77\u0b7a\5\u0186\u00c4\2\u0b78\u0b79\7\u015d\2\2"+
		"\u0b79\u0b7b\5\u0186\u00c4\2\u0b7a\u0b78\3\2\2\2\u0b7a\u0b7b\3\2\2\2\u0b7b"+
		"\u0b7d\3\2\2\2\u0b7c\u0b76\3\2\2\2\u0b7c\u0b7d\3\2\2\2\u0b7d\u0b7e\3\2"+
		"\2\2\u0b7e\u0b7f\7\u016e\2\2\u0b7f\u0b80\5\u019e\u00d0\2\u0b80\u0bc6\3"+
		"\2\2\2\u0b81\u0b82\7\u00b3\2\2\u0b82\u0b84\7\u016b\2\2\u0b83\u0b85\5\u019c"+
		"\u00cf\2\u0b84\u0b83\3\2\2\2\u0b84\u0b85\3\2\2\2\u0b85\u0b86\3\2\2\2\u0b86"+
		"\u0b87\5\u0186\u00c4\2\u0b87\u0b89\7\u016e\2\2\u0b88\u0b8a\5\u019e\u00d0"+
		"\2\u0b89\u0b88\3\2\2\2\u0b89\u0b8a\3\2\2\2\u0b8a\u0bc6\3\2\2\2\u0b8b\u0b8c"+
		"\7\u00b9\2\2\u0b8c\u0b8e\7\u016b\2\2\u0b8d\u0b8f\5\u019c\u00cf\2\u0b8e"+
		"\u0b8d\3\2\2\2\u0b8e\u0b8f\3\2\2\2\u0b8f\u0b90\3\2\2\2\u0b90\u0b91\5\u0186"+
		"\u00c4\2\u0b91\u0b93\7\u016e\2\2\u0b92\u0b94\5\u019e\u00d0\2\u0b93\u0b92"+
		"\3\2\2\2\u0b93\u0b94\3\2\2\2\u0b94\u0bc6\3\2\2\2\u0b95\u0b96\7\u0155\2"+
		"\2\u0b96\u0b97\7\u016b\2\2\u0b97\u0b98\7\u016e\2\2\u0b98\u0bc6\5\u019e"+
		"\u00d0\2\u0b99\u0b9a\7\u0156\2\2\u0b9a\u0b9b\7\u016b\2\2\u0b9b\u0b9c\7"+
		"\u016e\2\2\u0b9c\u0bc6\5\u019e\u00d0\2\u0b9d\u0b9e\7\u0157\2\2\u0b9e\u0ba0"+
		"\7\u016b\2\2\u0b9f\u0ba1\5\u019c\u00cf\2\u0ba0\u0b9f\3\2\2\2\u0ba0\u0ba1"+
		"\3\2\2\2\u0ba1\u0ba2\3\2\2\2\u0ba2\u0ba3\5\u0186\u00c4\2\u0ba3\u0ba5\7"+
		"\u016e\2\2\u0ba4\u0ba6\5\u019e\u00d0\2\u0ba5\u0ba4\3\2\2\2\u0ba5\u0ba6"+
		"\3\2\2\2\u0ba6\u0bc6\3\2\2\2\u0ba7\u0ba8\7\u011a\2\2\u0ba8\u0baa\7\u016b"+
		"\2\2\u0ba9\u0bab\5\u019c\u00cf\2\u0baa\u0ba9\3\2\2\2\u0baa\u0bab\3\2\2"+
		"\2\u0bab\u0bac\3\2\2\2\u0bac\u0bad\5\u0186\u00c4\2\u0bad\u0baf\7\u016e"+
		"\2\2\u0bae\u0bb0\5\u019e\u00d0\2\u0baf\u0bae\3\2\2\2\u0baf\u0bb0\3\2\2"+
		"\2\u0bb0\u0bc6\3\2\2\2\u0bb1\u0bb2\7\u0134\2\2\u0bb2\u0bb4\7\u016b\2\2"+
		"\u0bb3\u0bb5\5\u019c\u00cf\2\u0bb4\u0bb3\3\2\2\2\u0bb4\u0bb5\3\2\2\2\u0bb5"+
		"\u0bb6\3\2\2\2\u0bb6\u0bb7\5\u0186\u00c4\2\u0bb7\u0bb9\7\u016e\2\2\u0bb8"+
		"\u0bba\5\u019e\u00d0\2\u0bb9\u0bb8\3\2\2\2\u0bb9\u0bba\3\2\2\2\u0bba\u0bc6"+
		"\3\2\2\2\u0bbb\u0bbc\7\u0159\2\2\u0bbc\u0bbe\7\u016b\2\2\u0bbd\u0bbf\5"+
		"\u019c\u00cf\2\u0bbe\u0bbd\3\2\2\2\u0bbe\u0bbf\3\2\2\2\u0bbf\u0bc0\3\2"+
		"\2\2\u0bc0\u0bc1\5\u0186\u00c4\2\u0bc1\u0bc3\7\u016e\2\2\u0bc2\u0bc4\5"+
		"\u019e\u00d0\2\u0bc3\u0bc2\3\2\2\2\u0bc3\u0bc4\3\2\2\2\u0bc4\u0bc6\3\2"+
		"\2\2\u0bc5\u0b2d\3\2\2\2\u0bc5\u0b37\3\2\2\2\u0bc5\u0b44\3\2\2\2\u0bc5"+
		"\u0b51\3\2\2\2\u0bc5\u0b55\3\2\2\2\u0bc5\u0b59\3\2\2\2\u0bc5\u0b5f\3\2"+
		"\2\2\u0bc5\u0b6d\3\2\2\2\u0bc5\u0b73\3\2\2\2\u0bc5\u0b81\3\2\2\2\u0bc5"+
		"\u0b8b\3\2\2\2\u0bc5\u0b95\3\2\2\2\u0bc5\u0b99\3\2\2\2\u0bc5\u0b9d\3\2"+
		"\2\2\u0bc5\u0ba7\3\2\2\2\u0bc5\u0bb1\3\2\2\2\u0bc5\u0bbb\3\2\2\2\u0bc6"+
		"\u019b\3\2\2\2\u0bc7\u0bc8\t&\2\2\u0bc8\u019d\3\2\2\2\u0bc9\u0bca\7\u00d1"+
		"\2\2\u0bca\u0bcc\7\u016b\2\2\u0bcb\u0bcd\5\u01a0\u00d1\2\u0bcc\u0bcb\3"+
		"\2\2\2\u0bcc\u0bcd\3\2\2\2\u0bcd\u0bcf\3\2\2\2\u0bce\u0bd0\5\u015a\u00ae"+
		"\2\u0bcf\u0bce\3\2\2\2\u0bcf\u0bd0\3\2\2\2\u0bd0\u0bd1\3\2\2\2\u0bd1\u0bd2"+
		"\7\u016e\2\2\u0bd2\u019f\3\2\2\2\u0bd3\u0bd4\7\u00d5\2\2\u0bd4\u0bd5\7"+
		" \2\2\u0bd5\u0bda\5\u0186\u00c4\2\u0bd6\u0bd7\7\u015d\2\2\u0bd7\u0bd9"+
		"\5\u0186\u00c4\2\u0bd8\u0bd6\3\2\2\2\u0bd9\u0bdc\3\2\2\2\u0bda\u0bd8\3"+
		"\2\2\2\u0bda\u0bdb\3\2\2\2\u0bdb\u01a1\3\2\2\2\u0bdc\u0bda\3\2\2\2\u0bdd"+
		"\u0ca6\7\u0143\2\2\u0bde\u0bdf\7\'\2\2\u0bdf\u0be0\7\u016b\2\2\u0be0\u0be1"+
		"\5\u0186\u00c4\2\u0be1\u0be2\7\20\2\2\u0be2\u0be4\5x=\2\u0be3\u0be5\5"+
		"z>\2\u0be4\u0be3\3\2\2\2\u0be4\u0be5\3\2\2\2\u0be5\u0be6\3\2\2\2\u0be6"+
		"\u0be7\7\u016e\2\2\u0be7\u0ca6\3\2\2\2\u0be8\u0be9\7;\2\2\u0be9\u0bec"+
		"\7\u016b\2\2\u0bea\u0bed\5\u0186\u00c4\2\u0beb\u0bed\7\u0169\2\2\u0bec"+
		"\u0bea\3\2\2\2\u0bec\u0beb\3\2\2\2\u0bed\u0bee\3\2\2\2\u0bee\u0ca6\7\u016e"+
		"\2\2\u0bef\u0ca6\7\u0145\2\2\u0bf0\u0bf1\7A\2\2\u0bf1\u0ca6\7F\2\2\u0bf2"+
		"\u0bf6\7\u0146\2\2\u0bf3\u0bf4\7A\2\2\u0bf4\u0bf6\7\u0123\2\2\u0bf5\u0bf2"+
		"\3\2\2\2\u0bf5\u0bf3\3\2\2\2\u0bf6\u0bfb\3\2\2\2\u0bf7\u0bf8\7\u016b\2"+
		"\2\u0bf8\u0bf9\5\u0186\u00c4\2\u0bf9\u0bfa\7\u016e\2\2\u0bfa\u0bfc\3\2"+
		"\2\2\u0bfb\u0bf7\3\2\2\2\u0bfb\u0bfc\3\2\2\2\u0bfc\u0ca6\3\2\2\2\u0bfd"+
		"\u0ca6\7\u0147\2\2\u0bfe\u0bff\7A\2\2\u0bff\u0ca6\7\u015a\2\2\u0c00\u0c01"+
		"\7\u014d\2\2\u0c01\u0c02\7\u016b\2\2\u0c02\u0c0f\5\u0186\u00c4\2\u0c03"+
		"\u0c04\7\u015d\2\2\u0c04\u0c0c\5\u0186\u00c4\2\u0c05\u0c06\7\u015d\2\2"+
		"\u0c06\u0c07\5\u0186\u00c4\2\u0c07\u0c08\7\u0161\2\2\u0c08\u0c09\5\u0186"+
		"\u00c4\2\u0c09\u0c0b\3\2\2\2\u0c0a\u0c05\3\2\2\2\u0c0b\u0c0e\3\2\2\2\u0c0c"+
		"\u0c0a\3\2\2\2\u0c0c\u0c0d\3\2\2\2\u0c0d\u0c10\3\2\2\2\u0c0e\u0c0c\3\2"+
		"\2\2\u0c0f\u0c03\3\2\2\2\u0c0f\u0c10\3\2\2\2\u0c10\u0c11\3\2\2\2\u0c11"+
		"\u0c12\7\u016e\2\2\u0c12\u0ca6\3\2\2\2\u0c13\u0c14\7\u014e\2\2\u0c14\u0c15"+
		"\7\u016b\2\2\u0c15\u0c22\5\u0186\u00c4\2\u0c16\u0c17\7\u015d\2\2\u0c17"+
		"\u0c1f\5\u0186\u00c4\2\u0c18\u0c19\7\u015d\2\2\u0c19\u0c1a\5\u0186\u00c4"+
		"\2\u0c1a\u0c1b\7\u0161\2\2\u0c1b\u0c1c\5\u0186\u00c4\2\u0c1c\u0c1e\3\2"+
		"\2\2\u0c1d\u0c18\3\2\2\2\u0c1e\u0c21\3\2\2\2\u0c1f\u0c1d\3\2\2\2\u0c1f"+
		"\u0c20\3\2\2\2\u0c20\u0c23\3\2\2\2\u0c21\u0c1f\3\2\2\2\u0c22\u0c16\3\2"+
		"\2\2\u0c22\u0c23\3\2\2\2\u0c23\u0c24\3\2\2\2\u0c24\u0c25\7\u016e\2\2\u0c25"+
		"\u0ca6\3\2\2\2\u0c26\u0c27\7\u014f\2\2\u0c27\u0c28\7\u016b\2\2\u0c28\u0c35"+
		"\5\u0186\u00c4\2\u0c29\u0c2a\7\u015d\2\2\u0c2a\u0c32\5\u0186\u00c4\2\u0c2b"+
		"\u0c2c\7\u015d\2\2\u0c2c\u0c2d\5\u0186\u00c4\2\u0c2d\u0c2e\7\u0161\2\2"+
		"\u0c2e\u0c2f\5\u0186\u00c4\2\u0c2f\u0c31\3\2\2\2\u0c30\u0c2b\3\2\2\2\u0c31"+
		"\u0c34\3\2\2\2\u0c32\u0c30\3\2\2\2\u0c32\u0c33\3\2\2\2\u0c33\u0c36\3\2"+
		"\2\2\u0c34\u0c32\3\2\2\2\u0c35\u0c29\3\2\2\2\u0c35\u0c36\3\2\2\2\u0c36"+
		"\u0c37\3\2\2\2\u0c37\u0c38\7\u016e\2\2\u0c38\u0ca6\3\2\2\2\u0c39\u0c3a"+
		"\7\u0150\2\2\u0c3a\u0c3b\7\u016b\2\2\u0c3b\u0c48\5\u0186\u00c4\2\u0c3c"+
		"\u0c3d\7\u015d\2\2\u0c3d\u0c45\5\u0186\u00c4\2\u0c3e\u0c3f\7\u015d\2\2"+
		"\u0c3f\u0c40\5\u0186\u00c4\2\u0c40\u0c41\7\u0161\2\2\u0c41\u0c42\5\u0186"+
		"\u00c4\2\u0c42\u0c44\3\2\2\2\u0c43\u0c3e\3\2\2\2\u0c44\u0c47\3\2\2\2\u0c45"+
		"\u0c43\3\2\2\2\u0c45\u0c46\3\2\2\2\u0c46\u0c49\3\2\2\2\u0c47\u0c45\3\2"+
		"\2\2\u0c48\u0c3c\3\2\2\2\u0c48\u0c49\3\2\2\2\u0c49\u0c4a\3\2\2\2\u0c4a"+
		"\u0c4b\7\u016e\2\2\u0c4b\u0ca6\3\2\2\2\u0c4c\u0c4d\7\u0151\2\2\u0c4d\u0c4e"+
		"\7\u016b\2\2\u0c4e\u0c5b\5\u0186\u00c4\2\u0c4f\u0c50\7\u015d\2\2\u0c50"+
		"\u0c58\5\u0186\u00c4\2\u0c51\u0c52\7\u015d\2\2\u0c52\u0c53\5\u0186\u00c4"+
		"\2\u0c53\u0c54\7\u0161\2\2\u0c54\u0c55\5\u0186\u00c4\2\u0c55\u0c57\3\2"+
		"\2\2\u0c56\u0c51\3\2\2\2\u0c57\u0c5a\3\2\2\2\u0c58\u0c56\3\2\2\2\u0c58"+
		"\u0c59\3\2\2\2\u0c59\u0c5c\3\2\2\2\u0c5a\u0c58\3\2\2\2\u0c5b\u0c4f\3\2"+
		"\2\2\u0c5b\u0c5c\3\2\2\2\u0c5c\u0c5d\3\2\2\2\u0c5d\u0c5e\7\u016e\2\2\u0c5e"+
		"\u0ca6\3\2\2\2\u0c5f\u0c60\7\u0152\2\2\u0c60\u0c61\7\u016b\2\2\u0c61\u0c6e"+
		"\5\u0186\u00c4\2\u0c62\u0c63\7\u015d\2\2\u0c63\u0c6b\5\u0186\u00c4\2\u0c64"+
		"\u0c65\7\u015d\2\2\u0c65\u0c66\5\u0186\u00c4\2\u0c66\u0c67\7\u0161\2\2"+
		"\u0c67\u0c68\5\u0186\u00c4\2\u0c68\u0c6a\3\2\2\2\u0c69\u0c64\3\2\2\2\u0c6a"+
		"\u0c6d\3\2\2\2\u0c6b\u0c69\3\2\2\2\u0c6b\u0c6c\3\2\2\2\u0c6c\u0c6f\3\2"+
		"\2\2\u0c6d\u0c6b\3\2\2\2\u0c6e\u0c62\3\2\2\2\u0c6e\u0c6f\3\2\2\2\u0c6f"+
		"\u0c70\3\2\2\2\u0c70\u0c71\7\u016e\2\2\u0c71\u0ca6\3\2\2\2\u0c72\u0c73"+
		"\7\u0153\2\2\u0c73\u0c74\7\u016b\2\2\u0c74\u0c7c\5\u0186\u00c4\2\u0c75"+
		"\u0c76\7\u015d\2\2\u0c76\u0c77\5\u0186\u00c4\2\u0c77\u0c78\7\u0161\2\2"+
		"\u0c78\u0c79\5\u0186\u00c4\2\u0c79\u0c7b\3\2\2\2\u0c7a\u0c75\3\2\2\2\u0c7b"+
		"\u0c7e\3\2\2\2\u0c7c\u0c7a\3\2\2\2\u0c7c\u0c7d\3\2\2\2\u0c7d\u0c7f\3\2"+
		"\2\2\u0c7e\u0c7c\3\2\2\2\u0c7f\u0c80\7\u016e\2\2\u0c80\u0ca6\3\2\2\2\u0c81"+
		"\u0c82\7\u0154\2\2\u0c82\u0c83\7\u016b\2\2\u0c83\u0c89\5\u0186\u00c4\2"+
		"\u0c84\u0c85\7\u015d\2\2\u0c85\u0c86\5\u0186\u00c4\2\u0c86\u0c87\7\u0161"+
		"\2\2\u0c87\u0c88\5\u0186\u00c4\2\u0c88\u0c8a\3\2\2\2\u0c89\u0c84\3\2\2"+
		"\2\u0c8a\u0c8b\3\2\2\2\u0c8b\u0c89\3\2\2\2\u0c8b\u0c8c\3\2\2\2\u0c8c\u0c8f"+
		"\3\2\2\2\u0c8d\u0c8e\7\u015d\2\2\u0c8e\u0c90\5\u0186\u00c4\2\u0c8f\u0c8d"+
		"\3\2\2\2\u0c8f\u0c90\3\2\2\2\u0c90\u0c91\3\2\2\2\u0c91\u0c92\7\u016e\2"+
		"\2\u0c92\u0ca6\3\2\2\2\u0c93\u0c94\7\u00fa\2\2\u0c94\u0c95\7\u016b\2\2"+
		"\u0c95\u0c96\5\u0186\u00c4\2\u0c96\u0c97\7\u016e\2\2\u0c97\u0ca6\3\2\2"+
		"\2\u0c98\u0c99\7\u0119\2\2\u0c99\u0c9a\7\u016b\2\2\u0c9a\u0c9b\5\u0186"+
		"\u00c4\2\u0c9b\u0c9c\7y\2\2\u0c9c\u0c9f\5\u0186\u00c4\2\u0c9d\u0c9e\7"+
		"u\2\2\u0c9e\u0ca0\5\u0186\u00c4\2\u0c9f\u0c9d\3\2\2\2\u0c9f\u0ca0\3\2"+
		"\2\2\u0ca0\u0ca1\3\2\2\2\u0ca1\u0ca2\7\u016e\2\2\u0ca2\u0ca6\3\2\2\2\u0ca3"+
		"\u0ca6\7\u0158\2\2\u0ca4\u0ca6\7\u015a\2\2\u0ca5\u0bdd\3\2\2\2\u0ca5\u0bde"+
		"\3\2\2\2\u0ca5\u0be8\3\2\2\2\u0ca5\u0bef\3\2\2\2\u0ca5\u0bf0\3\2\2\2\u0ca5"+
		"\u0bf5\3\2\2\2\u0ca5\u0bfd\3\2\2\2\u0ca5\u0bfe\3\2\2\2\u0ca5\u0c00\3\2"+
		"\2\2\u0ca5\u0c13\3\2\2\2\u0ca5\u0c26\3\2\2\2\u0ca5\u0c39\3\2\2\2\u0ca5"+
		"\u0c4c\3\2\2\2\u0ca5\u0c5f\3\2\2\2\u0ca5\u0c72\3\2\2\2\u0ca5\u0c81\3\2"+
		"\2\2\u0ca5\u0c93\3\2\2\2\u0ca5\u0c98\3\2\2\2\u0ca5\u0ca3\3\2\2\2\u0ca5"+
		"\u0ca4\3\2\2\2\u0ca6\u01a3\3\2\2\2\u0ca7\u0ca8\5\u01be\u00e0\2\u0ca8\u0caa"+
		"\7\u016b\2\2\u0ca9\u0cab\5\u01a6\u00d4\2\u0caa\u0ca9\3\2\2\2\u0caa\u0cab"+
		"\3\2\2\2\u0cab\u0cac\3\2\2\2\u0cac\u0cad\7\u016e\2\2\u0cad\u01a5\3\2\2"+
		"\2\u0cae\u0cb3\5\u01a8\u00d5\2\u0caf\u0cb0\7\u015d\2\2\u0cb0\u0cb2\5\u01a8"+
		"\u00d5\2\u0cb1\u0caf\3\2\2\2\u0cb2\u0cb5\3\2\2\2\u0cb3\u0cb1\3\2\2\2\u0cb3"+
		"\u0cb4\3\2\2\2\u0cb4\u01a7\3\2\2\2\u0cb5\u0cb3\3\2\2\2\u0cb6\u0cbc\6\u00d5"+
		"\16\2\u0cb7\u0cb8\5\u01be\u00e0\2\u0cb8\u0cba\7\u0161\2\2\u0cb9\u0cbb"+
		"\7\u0165\2\2\u0cba\u0cb9\3\2\2\2\u0cba\u0cbb\3\2\2\2\u0cbb\u0cbd\3\2\2"+
		"\2\u0cbc\u0cb7\3\2\2\2\u0cbc\u0cbd\3\2\2\2\u0cbd\u0cbe\3\2\2\2\u0cbe\u0cbf"+
		"\5\u0186\u00c4\2\u0cbf\u01a9\3\2\2\2\u0cc0\u0cc3\5\u0120\u0091\2\u0cc1"+
		"\u0cc3\5\u0186\u00c4\2\u0cc2\u0cc0\3\2\2\2\u0cc2\u0cc1\3\2\2\2\u0cc3\u01ab"+
		"\3\2\2\2\u0cc4\u0cc7\5\u01b8\u00dd\2\u0cc5\u0cc7\5\u0186\u00c4\2\u0cc6"+
		"\u0cc4\3\2\2\2\u0cc6\u0cc5\3\2\2\2\u0cc7\u01ad\3\2\2\2\u0cc8\u0ccc\7\u0085"+
		"\2\2\u0cc9\u0ccb\5\u01b0\u00d9\2\u0cca\u0cc9\3\2\2\2\u0ccb\u0cce\3\2\2"+
		"\2\u0ccc\u0cca\3\2\2\2\u0ccc\u0ccd\3\2\2\2\u0ccd\u01af\3\2\2\2\u0cce\u0ccc"+
		"\3\2\2\2\u0ccf\u0cd0\7\u0171\2\2\u0cd0\u0cd1\5\u01be\u00e0\2\u0cd1\u0cd2"+
		"\5\u0186\u00c4\2\u0cd2\u0cdc\3\2\2\2\u0cd3\u0cd4\7\u0171\2\2\u0cd4\u0cd5"+
		"\5\u01be\u00e0\2\u0cd5\u0cd6\7\u0172\2\2\u0cd6\u0cd7\7\u0161\2\2\u0cd7"+
		"\u0cd8\5\u0186\u00c4\2\u0cd8\u0cdc\3\2\2\2\u0cd9\u0cda\7\u0171\2\2\u0cda"+
		"\u0cdc\5\u01be\u00e0\2\u0cdb\u0ccf\3\2\2\2\u0cdb\u0cd3\3\2\2\2\u0cdb\u0cd9"+
		"\3\2\2\2\u0cdc\u01b1\3\2\2\2\u0cdd\u0cde\7\7\2\2\u0cde\u0cdf\5\u01b4\u00db"+
		"\2\u0cdf\u0ce0\7\u0170\2\2\u0ce0\u0ce3\3\2\2\2\u0ce1\u0ce3\5\u01b6\u00dc"+
		"\2\u0ce2\u0cdd\3\2\2\2\u0ce2\u0ce1\3\2\2\2\u0ce3\u01b3\3\2\2\2\u0ce4\u0ce6"+
		"\13\2\2\2\u0ce5\u0ce4\3\2\2\2\u0ce6\u0ce9\3\2\2\2\u0ce7\u0ce8\3\2\2\2"+
		"\u0ce7\u0ce5\3\2\2\2\u0ce8\u01b5\3\2\2\2\u0ce9\u0ce7\3\2\2\2\u0cea\u0ceb"+
		"\7\u0086\2\2\u0ceb\u0cec\5\u0186\u00c4\2\u0cec\u01b7\3\2\2\2\u0ced\u0cfc"+
		"\7\u017a\2\2\u0cee\u0cf2\7\u015f\2\2\u0cef\u0cf0\7\6\2\2\u0cf0\u0cf2\7"+
		"\u015f\2\2\u0cf1\u0cee\3\2\2\2\u0cf1\u0cef\3\2\2\2\u0cf1\u0cf2\3\2\2\2"+
		"\u0cf2\u0cf3\3\2\2\2\u0cf3\u0cf8\5\u01be\u00e0\2\u0cf4\u0cf5\7\u015f\2"+
		"\2\u0cf5\u0cf7\5\u01be\u00e0\2\u0cf6\u0cf4\3\2\2\2\u0cf7\u0cfa\3\2\2\2"+
		"\u0cf8\u0cf6\3\2\2\2\u0cf8\u0cf9\3\2\2\2\u0cf9\u0cfc\3\2\2\2\u0cfa\u0cf8"+
		"\3\2\2\2\u0cfb\u0ced\3\2\2\2\u0cfb\u0cf1\3\2\2\2\u0cfc\u01b9\3\2\2\2\u0cfd"+
		"\u0cfe\7F\2\2\u0cfe\u0cff\5\u01c0\u00e1\2\u0cff\u01bb\3\2\2\2\u0d00\u0d01"+
		"\7\u0123\2\2\u0d01\u0d02\5\u01c0\u00e1\2\u0d02\u01bd\3\2\2\2\u0d03\u0d06"+
		"\7\u0172\2\2\u0d04\u0d06\5\u01ca\u00e6\2\u0d05\u0d03\3\2\2\2\u0d05\u0d04"+
		"\3\2\2\2\u0d06\u0d0e\3\2\2\2\u0d07\u0d0a\7\6\2\2\u0d08\u0d0b\7\u0172\2"+
		"\2\u0d09\u0d0b\5\u01ca\u00e6\2\u0d0a\u0d08\3\2\2\2\u0d0a\u0d09\3\2\2\2"+
		"\u0d0b\u0d0d\3\2\2\2\u0d0c\u0d07\3\2\2\2\u0d0d\u0d10\3\2\2\2\u0d0e\u0d0c"+
		"\3\2\2\2\u0d0e\u0d0f\3\2\2\2\u0d0f\u01bf\3\2\2\2\u0d10\u0d0e\3\2\2\2\u0d11"+
		"\u0d14\7\u0173\2\2\u0d12\u0d14\7\u0174\2\2\u0d13\u0d11\3\2\2\2\u0d13\u0d12"+
		"\3\2\2\2\u0d14\u01c1\3\2\2\2\u0d15\u0d17\t\60\2\2\u0d16\u0d15\3\2\2\2"+
		"\u0d16\u0d17\3\2\2\2\u0d17\u0d18\3\2\2\2\u0d18\u0d19\7\u0175\2\2\u0d19"+
		"\u01c3\3\2\2\2\u0d1a\u0d1c\t\60\2\2\u0d1b\u0d1a\3\2\2\2\u0d1b\u0d1c\3"+
		"\2\2\2\u0d1c\u0d1d\3\2\2\2\u0d1d\u0d1e\7\u0176\2\2\u0d1e\u01c5\3\2\2\2"+
		"\u0d1f\u0d20\t\61\2\2\u0d20\u01c7\3\2\2\2\u0d21\u0d22\7\u00c5\2\2\u0d22"+
		"\u01c9\3\2\2\2\u0d23\u0d24\t\62\2\2\u0d24\u01cb\3\2\2\2\u01ac\u01d1\u01d4"+
		"\u01d8\u01db\u01e0\u01e7\u01ed\u01ef\u01f8\u01fb\u01fd\u023d\u0245\u0255"+
		"\u025c\u025f\u0264\u0268\u0271\u0276\u027e\u0283\u028c\u0298\u029d\u02a0"+
		"\u02ae\u02b5\u02be\u02cf\u02d3\u02db\u02e6\u02f0\u02f8\u02ff\u0303\u0307"+
		"\u030c\u0310\u0315\u0319\u031d\u0327\u032b\u0330\u0335\u0339\u0346\u034b"+
		"\u0351\u035a\u035e\u0366\u0369\u036e\u0373\u037a\u0381\u0384\u038b\u0391"+
		"\u0396\u039c\u03a1\u03a4\u03aa\u03b8\u03c2\u03c8\u03cd\u03d2\u03d7\u03db"+
		"\u03e0\u03e3\u03ed\u03f9\u0400\u0403\u040f\u0414\u0419\u041c\u0423\u042f"+
		"\u043c\u043e\u0443\u0446\u0455\u045b\u0466\u0469\u0473\u047a\u0480\u0488"+
		"\u0492\u04a6\u04ac\u04b0\u04b5\u04b9\u04be\u04c1\u04c6\u04c9\u04d5\u04dc"+
		"\u04e1\u04e6\u04ea\u04ef\u04f2\u04fc\u0508\u050f\u0517\u0525\u0544\u0546"+
		"\u054b\u054f\u0554\u055b\u055e\u0561\u0566\u056a\u056c\u0573\u0579\u0580"+
		"\u0586\u0589\u058e\u0592\u0595\u059c\u05a2\u05a5\u05af\u05b8\u05bf\u05c6"+
		"\u05c8\u05ce\u05d1\u05dc\u05e5\u05eb\u05f1\u05f4\u05f9\u05fc\u05ff\u0602"+
		"\u0605\u060b\u0615\u0620\u0623\u062a\u062f\u0634\u0638\u0640\u0644\u0649"+
		"\u064d\u064f\u0654\u065c\u0661\u0667\u066e\u0671\u0678\u0680\u0688\u068b"+
		"\u068e\u0693\u069c\u06a0\u06aa\u06bd\u06c4\u06c6\u06ca\u06ce\u06d6\u06e1"+
		"\u06ea\u06f2\u06fb\u06fe\u0701\u070e\u0712\u071a\u072c\u073a\u0741\u0745"+
		"\u074c\u074e\u0752\u075b\u0763\u076c\u077c\u0782\u0786\u0790\u0798\u07a1"+
		"\u07a5\u07ab\u07b0\u07b4\u07be\u07c4\u07c8\u07d4\u07db\u07eb\u07f2\u07fc"+
		"\u07ff\u0803\u080a\u0811\u0813\u0817\u081b\u0820\u0823\u0827\u082a\u0835"+
		"\u0838\u0843\u0849\u084d\u084f\u0853\u085c\u0863\u0867\u086b\u0872\u0876"+
		"\u087e\u0884\u0888\u0893\u089a\u08a7\u08af\u08b3\u08bd\u08c2\u08cf\u08da"+
		"\u08e2\u08e6\u08ea\u08ee\u08f0\u08f5\u08f8\u08fb\u08fe\u0902\u0905\u0908"+
		"\u090b\u090e\u0915\u0920\u0924\u0927\u092b\u0932\u0936\u0940\u0948\u094e"+
		"\u0952\u0958\u0961\u0964\u0969\u096c\u0976\u097b\u0984\u0989\u098d\u0996"+
		"\u099a\u09a8\u09b5\u09ba\u09be\u09c4\u09cf\u09d1\u09d8\u09db\u09e2\u09e7"+
		"\u09ed\u09f0\u09f3\u0a02\u0a09\u0a0c\u0a0f\u0a13\u0a18\u0a1e\u0a22\u0a2d"+
		"\u0a31\u0a34\u0a38\u0a3c\u0a40\u0a44\u0a4a\u0a50\u0a57\u0a5f\u0a65\u0a6a"+
		"\u0a75\u0a7e\u0a82\u0a8b\u0a8f\u0a99\u0a9e\u0ab4\u0ab7\u0aca\u0ada\u0adc"+
		"\u0ae7\u0af6\u0b02\u0b06\u0b11\u0b15\u0b21\u0b25\u0b30\u0b35\u0b3a\u0b3e"+
		"\u0b42\u0b47\u0b4b\u0b4f\u0b66\u0b68\u0b7a\u0b7c\u0b84\u0b89\u0b8e\u0b93"+
		"\u0ba0\u0ba5\u0baa\u0baf\u0bb4\u0bb9\u0bbe\u0bc3\u0bc5\u0bcc\u0bcf\u0bda"+
		"\u0be4\u0bec\u0bf5\u0bfb\u0c0c\u0c0f\u0c1f\u0c22\u0c32\u0c35\u0c45\u0c48"+
		"\u0c58\u0c5b\u0c6b\u0c6e\u0c7c\u0c8b\u0c8f\u0c9f\u0ca5\u0caa\u0cb3\u0cba"+
		"\u0cbc\u0cc2\u0cc6\u0ccc\u0cdb\u0ce2\u0ce7\u0cf1\u0cf8\u0cfb\u0d05\u0d0a"+
		"\u0d0e\u0d13\u0d16\u0d1b";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}