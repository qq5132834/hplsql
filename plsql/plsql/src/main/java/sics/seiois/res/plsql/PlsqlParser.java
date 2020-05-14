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
		T_PRESERVE=216, T_PRIMARY=217, T_PRINT=218, T_OBTAIN=219, T_PROC=220, 
		T_PROCEDURE=221, T_QUALIFY=222, T_QUERY_BAND=223, T_QUIT=224, T_QUOTED_IDENTIFIER=225, 
		T_RAISE=226, T_REAL=227, T_REFERENCES=228, T_REGEXP=229, T_REPLACE=230, 
		T_RESIGNAL=231, T_RESTRICT=232, T_RESULT=233, T_RESULT_SET_LOCATOR=234, 
		T_RETURN=235, T_RETURNS=236, T_REVERSE=237, T_RIGHT=238, T_RLIKE=239, 
		T_ROLE=240, T_ROLLBACK=241, T_ROW=242, T_ROWS=243, T_ROWTYPE=244, T_ROW_COUNT=245, 
		T_RR=246, T_RS=247, T_PWD=248, T_TRIM=249, T_SCHEMA=250, T_SECOND=251, 
		T_SECONDS=252, T_SECURITY=253, T_SEGMENT=254, T_SEL=255, T_SELECT=256, 
		T_SET=257, T_SESSION=258, T_SESSIONS=259, T_SETS=260, T_SHARE=261, T_SIGNAL=262, 
		T_SIMPLE_DOUBLE=263, T_SIMPLE_FLOAT=264, T_SIMPLE_INTEGER=265, T_SMALLDATETIME=266, 
		T_SMALLINT=267, T_SQL=268, T_SQLEXCEPTION=269, T_SQLINSERT=270, T_SQLSTATE=271, 
		T_SQLWARNING=272, T_STATS=273, T_STATISTICS=274, T_STEP=275, T_STORAGE=276, 
		T_STORED=277, T_STRING=278, T_SUBDIR=279, T_SUBSTRING=280, T_SUM=281, 
		T_SUMMARY=282, T_SYS_REFCURSOR=283, T_TABLE=284, T_TABLESPACE=285, T_TEMPORARY=286, 
		T_TERMINATED=287, T_TEXTIMAGE_ON=288, T_THEN=289, T_TIMESTAMP=290, T_TINYINT=291, 
		T_TITLE=292, T_TO=293, T_TOP=294, T_TRANSACTION=295, T_TRUE=296, T_TRUNCATE=297, 
		T_TYPE=298, T_UNION=299, T_UNIQUE=300, T_UPDATE=301, T_UR=302, T_USE=303, 
		T_USING=304, T_VALUE=305, T_VALUES=306, T_VAR=307, T_VARCHAR=308, T_VARCHAR2=309, 
		T_VARYING=310, T_VOLATILE=311, T_WHEN=312, T_WHERE=313, T_WHILE=314, T_WITH=315, 
		T_WITHOUT=316, T_WORK=317, T_XACT_ABORT=318, T_XML=319, T_YES=320, T_CORRECT=321, 
		T_CHECK=322, T_ACTIVITY_COUNT=323, T_CUME_DIST=324, T_CURRENT_DATE=325, 
		T_CURRENT_TIMESTAMP=326, T_CURRENT_USER=327, T_DENSE_RANK=328, T_FIRST_VALUE=329, 
		T_LAG=330, T_LAST_VALUE=331, T_LEAD=332, T_MAX_PART_STRING=333, T_MIN_PART_STRING=334, 
		T_MAX_PART_INT=335, T_MIN_PART_INT=336, T_MAX_PART_DATE=337, T_MIN_PART_DATE=338, 
		T_PART_COUNT=339, T_PART_LOC=340, T_RANK=341, T_ROW_NUMBER=342, T_STDEV=343, 
		T_SYSDATE=344, T_VARIANCE=345, T_USER=346, T_ADD=347, T_COLON=348, T_COMMA=349, 
		T_PIPE=350, T_DIV=351, T_DOT2=352, T_EQUAL=353, T_EQUAL2=354, T_NOTEQUAL=355, 
		T_NOTEQUAL2=356, T_GREATER=357, T_GREATEREQUAL=358, T_LESS=359, T_LESSEQUAL=360, 
		T_MUL=361, T_OPEN_B=362, T_OPEN_P=363, T_OPEN_SB=364, T_CLOSE_B=365, T_CLOSE_P=366, 
		T_CLOSE_SB=367, T_SEMICOLON=368, T_SUB=369, L_ID=370, L_S_STRING=371, 
		L_D_STRING=372, L_INT=373, L_DEC=374, L_WS=375, L_M_COMMENT=376, L_S_COMMENT=377, 
		L_FILE=378, L_LABEL=379;
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
		RULE_check_stmt = 96, RULE_check_stmt_cols = 97, RULE_check_stmt_with_rows = 98, 
		RULE_check_stmt_alias = 99, RULE_check_assignment = 100, RULE_exit_stmt = 101, 
		RULE_get_diag_stmt = 102, RULE_get_diag_stmt_item = 103, RULE_get_diag_stmt_exception_item = 104, 
		RULE_get_diag_stmt_rowcount_item = 105, RULE_grant_stmt = 106, RULE_grant_stmt_item = 107, 
		RULE_leave_stmt = 108, RULE_map_object_stmt = 109, RULE_open_stmt = 110, 
		RULE_fetch_stmt = 111, RULE_collect_stats_stmt = 112, RULE_collect_stats_clause = 113, 
		RULE_close_stmt = 114, RULE_cmp_stmt = 115, RULE_cmp_source = 116, RULE_copy_from_local_stmt = 117, 
		RULE_copy_stmt = 118, RULE_copy_source = 119, RULE_copy_target = 120, 
		RULE_copy_option = 121, RULE_copy_file_option = 122, RULE_commit_stmt = 123, 
		RULE_create_index_stmt = 124, RULE_create_index_col = 125, RULE_index_storage_clause = 126, 
		RULE_index_mssql_storage_clause = 127, RULE_print_stmt = 128, RULE_obtain_stmt = 129, 
		RULE_quit_stmt = 130, RULE_raise_stmt = 131, RULE_resignal_stmt = 132, 
		RULE_return_stmt = 133, RULE_rollback_stmt = 134, RULE_set_session_option = 135, 
		RULE_set_current_schema_option = 136, RULE_set_mssql_session_option = 137, 
		RULE_set_teradata_session_option = 138, RULE_signal_stmt = 139, RULE_summary_stmt = 140, 
		RULE_truncate_stmt = 141, RULE_use_stmt = 142, RULE_values_into_stmt = 143, 
		RULE_while_stmt = 144, RULE_for_cursor_stmt = 145, RULE_for_range_stmt = 146, 
		RULE_label = 147, RULE_using_clause = 148, RULE_select_stmt = 149, RULE_cte_select_stmt = 150, 
		RULE_cte_select_stmt_item = 151, RULE_cte_select_cols = 152, RULE_fullselect_stmt = 153, 
		RULE_fullselect_stmt_item = 154, RULE_fullselect_set_clause = 155, RULE_subselect_stmt = 156, 
		RULE_select_list = 157, RULE_select_list_set = 158, RULE_select_list_limit = 159, 
		RULE_select_list_item = 160, RULE_select_list_alias = 161, RULE_select_list_asterisk = 162, 
		RULE_into_clause = 163, RULE_from_clause = 164, RULE_from_table_clause = 165, 
		RULE_from_table_name_clause = 166, RULE_from_subselect_clause = 167, RULE_from_join_clause = 168, 
		RULE_from_join_type_clause = 169, RULE_from_table_values_clause = 170, 
		RULE_from_table_values_row = 171, RULE_from_alias_clause = 172, RULE_table_name = 173, 
		RULE_where_clause = 174, RULE_group_by_clause = 175, RULE_having_clause = 176, 
		RULE_qualify_clause = 177, RULE_order_by_clause = 178, RULE_select_options = 179, 
		RULE_select_options_item = 180, RULE_update_stmt = 181, RULE_update_assignment = 182, 
		RULE_update_table = 183, RULE_update_upsert = 184, RULE_merge_stmt = 185, 
		RULE_merge_table = 186, RULE_merge_condition = 187, RULE_merge_action = 188, 
		RULE_delete_stmt = 189, RULE_delete_alias = 190, RULE_describe_stmt = 191, 
		RULE_bool_expr = 192, RULE_bool_expr_atom = 193, RULE_bool_expr_unary = 194, 
		RULE_bool_expr_single_in = 195, RULE_bool_expr_multi_in = 196, RULE_bool_expr_binary = 197, 
		RULE_bool_expr_logical_operator = 198, RULE_bool_expr_binary_operator = 199, 
		RULE_expr = 200, RULE_expr_atom = 201, RULE_expr_interval = 202, RULE_interval_item = 203, 
		RULE_expr_concat = 204, RULE_expr_concat_item = 205, RULE_expr_case = 206, 
		RULE_expr_case_simple = 207, RULE_expr_case_searched = 208, RULE_expr_cursor_attribute = 209, 
		RULE_expr_agg_window_func = 210, RULE_expr_func_all_distinct = 211, RULE_expr_func_over_clause = 212, 
		RULE_expr_func_partition_by_clause = 213, RULE_expr_spec_func = 214, RULE_expr_func = 215, 
		RULE_expr_func_params = 216, RULE_func_param = 217, RULE_expr_select = 218, 
		RULE_expr_file = 219, RULE_hive = 220, RULE_hive_item = 221, RULE_host = 222, 
		RULE_host_cmd = 223, RULE_host_stmt = 224, RULE_file_name = 225, RULE_date_literal = 226, 
		RULE_timestamp_literal = 227, RULE_ident = 228, RULE_string = 229, RULE_int_number = 230, 
		RULE_dec_number = 231, RULE_bool_literal = 232, RULE_null_const = 233, 
		RULE_non_reserved_words = 234;
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
		"check_stmt", "check_stmt_cols", "check_stmt_with_rows", "check_stmt_alias", 
		"check_assignment", "exit_stmt", "get_diag_stmt", "get_diag_stmt_item", 
		"get_diag_stmt_exception_item", "get_diag_stmt_rowcount_item", "grant_stmt", 
		"grant_stmt_item", "leave_stmt", "map_object_stmt", "open_stmt", "fetch_stmt", 
		"collect_stats_stmt", "collect_stats_clause", "close_stmt", "cmp_stmt", 
		"cmp_source", "copy_from_local_stmt", "copy_stmt", "copy_source", "copy_target", 
		"copy_option", "copy_file_option", "commit_stmt", "create_index_stmt", 
		"create_index_col", "index_storage_clause", "index_mssql_storage_clause", 
		"print_stmt", "obtain_stmt", "quit_stmt", "raise_stmt", "resignal_stmt", 
		"return_stmt", "rollback_stmt", "set_session_option", "set_current_schema_option", 
		"set_mssql_session_option", "set_teradata_session_option", "signal_stmt", 
		"summary_stmt", "truncate_stmt", "use_stmt", "values_into_stmt", "while_stmt", 
		"for_cursor_stmt", "for_range_stmt", "label", "using_clause", "select_stmt", 
		"cte_select_stmt", "cte_select_stmt_item", "cte_select_cols", "fullselect_stmt", 
		"fullselect_stmt_item", "fullselect_set_clause", "subselect_stmt", "select_list", 
		"select_list_set", "select_list_limit", "select_list_item", "select_list_alias", 
		"select_list_asterisk", "into_clause", "from_clause", "from_table_clause", 
		"from_table_name_clause", "from_subselect_clause", "from_join_clause", 
		"from_join_type_clause", "from_table_values_clause", "from_table_values_row", 
		"from_alias_clause", "table_name", "where_clause", "group_by_clause", 
		"having_clause", "qualify_clause", "order_by_clause", "select_options", 
		"select_options_item", "update_stmt", "update_assignment", "update_table", 
		"update_upsert", "merge_stmt", "merge_table", "merge_condition", "merge_action", 
		"delete_stmt", "delete_alias", "describe_stmt", "bool_expr", "bool_expr_atom", 
		"bool_expr_unary", "bool_expr_single_in", "bool_expr_multi_in", "bool_expr_binary", 
		"bool_expr_logical_operator", "bool_expr_binary_operator", "expr", "expr_atom", 
		"expr_interval", "interval_item", "expr_concat", "expr_concat_item", "expr_case", 
		"expr_case_simple", "expr_case_searched", "expr_cursor_attribute", "expr_agg_window_func", 
		"expr_func_all_distinct", "expr_func_over_clause", "expr_func_partition_by_clause", 
		"expr_spec_func", "expr_func", "expr_func_params", "func_param", "expr_select", 
		"expr_file", "hive", "hive_item", "host", "host_cmd", "host_stmt", "file_name", 
		"date_literal", "timestamp_literal", "ident", "string", "int_number", 
		"dec_number", "bool_literal", "null_const", "non_reserved_words"
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
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'+'", "':'", "','", "'||'", "'/'", "'..'", "'='", "'=='", "'<>'", "'!='", 
		"'>'", "'>='", "'<'", "'<='", "'*'", "'{'", "'('", "'['", "'}'", "')'", 
		"']'", "';'", "'-'"
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
		"T_OBTAIN", "T_PROC", "T_PROCEDURE", "T_QUALIFY", "T_QUERY_BAND", "T_QUIT", 
		"T_QUOTED_IDENTIFIER", "T_RAISE", "T_REAL", "T_REFERENCES", "T_REGEXP", 
		"T_REPLACE", "T_RESIGNAL", "T_RESTRICT", "T_RESULT", "T_RESULT_SET_LOCATOR", 
		"T_RETURN", "T_RETURNS", "T_REVERSE", "T_RIGHT", "T_RLIKE", "T_ROLE", 
		"T_ROLLBACK", "T_ROW", "T_ROWS", "T_ROWTYPE", "T_ROW_COUNT", "T_RR", "T_RS", 
		"T_PWD", "T_TRIM", "T_SCHEMA", "T_SECOND", "T_SECONDS", "T_SECURITY", 
		"T_SEGMENT", "T_SEL", "T_SELECT", "T_SET", "T_SESSION", "T_SESSIONS", 
		"T_SETS", "T_SHARE", "T_SIGNAL", "T_SIMPLE_DOUBLE", "T_SIMPLE_FLOAT", 
		"T_SIMPLE_INTEGER", "T_SMALLDATETIME", "T_SMALLINT", "T_SQL", "T_SQLEXCEPTION", 
		"T_SQLINSERT", "T_SQLSTATE", "T_SQLWARNING", "T_STATS", "T_STATISTICS", 
		"T_STEP", "T_STORAGE", "T_STORED", "T_STRING", "T_SUBDIR", "T_SUBSTRING", 
		"T_SUM", "T_SUMMARY", "T_SYS_REFCURSOR", "T_TABLE", "T_TABLESPACE", "T_TEMPORARY", 
		"T_TERMINATED", "T_TEXTIMAGE_ON", "T_THEN", "T_TIMESTAMP", "T_TINYINT", 
		"T_TITLE", "T_TO", "T_TOP", "T_TRANSACTION", "T_TRUE", "T_TRUNCATE", "T_TYPE", 
		"T_UNION", "T_UNIQUE", "T_UPDATE", "T_UR", "T_USE", "T_USING", "T_VALUE", 
		"T_VALUES", "T_VAR", "T_VARCHAR", "T_VARCHAR2", "T_VARYING", "T_VOLATILE", 
		"T_WHEN", "T_WHERE", "T_WHILE", "T_WITH", "T_WITHOUT", "T_WORK", "T_XACT_ABORT", 
		"T_XML", "T_YES", "T_CORRECT", "T_CHECK", "T_ACTIVITY_COUNT", "T_CUME_DIST", 
		"T_CURRENT_DATE", "T_CURRENT_TIMESTAMP", "T_CURRENT_USER", "T_DENSE_RANK", 
		"T_FIRST_VALUE", "T_LAG", "T_LAST_VALUE", "T_LEAD", "T_MAX_PART_STRING", 
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
			setState(470);
			block();
			setState(471);
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
			setState(480); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(475);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(473);
						begin_end_block();
						}
						break;
					case 2:
						{
						setState(474);
						stmt();
						}
						break;
					}
					setState(478);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(477);
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
				setState(482); 
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
			setState(485);
			_la = _input.LA(1);
			if (_la==T_DECLARE) {
				{
				setState(484);
				declare_block();
				}
			}

			setState(487);
			match(T_BEGIN);
			setState(488);
			block();
			setState(490);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(489);
				exception_block();
				}
				break;
			}
			setState(492);
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
			setState(505);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				match(T_BEGIN);
				setState(495);
				block();
				setState(497);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(496);
					exception_block();
					}
					break;
				}
				setState(499);
				block_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				stmt();
				setState(503);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(502);
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
			setState(507);
			if (!(!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION"))) throw new FailedPredicateException(this, "!_input.LT(2).getText().equalsIgnoreCase(\"TRANSACTION\")");
			setState(508);
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
			setState(519);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				begin_end_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(511);
						stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(514);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(517);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(516);
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
		public Obtain_stmtContext obtain_stmt() {
			return getRuleContext(Obtain_stmtContext.class,0);
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
		public Check_stmtContext check_stmt() {
			return getRuleContext(Check_stmtContext.class,0);
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
			setState(585);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				allocate_cursor_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(523);
				alter_table_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(524);
				associate_locator_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(525);
				begin_transaction_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(526);
				break_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(527);
				call_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(528);
				collect_stats_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(529);
				close_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(530);
				cmp_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(531);
				copy_from_local_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(532);
				copy_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(533);
				commit_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(534);
				create_database_stmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(535);
				create_function_stmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(536);
				create_index_stmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(537);
				create_local_temp_table_stmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(538);
				create_package_stmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(539);
				create_package_body_stmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(540);
				create_procedure_stmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(541);
				create_table_stmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(542);
				declare_stmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(543);
				delete_stmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(544);
				describe_stmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(545);
				drop_stmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(546);
				end_transaction_stmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(547);
				exec_stmt();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(548);
				exit_stmt();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(549);
				fetch_stmt();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(550);
				for_cursor_stmt();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(551);
				for_range_stmt();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(552);
				if_stmt();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(553);
				include_stmt();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(554);
				insert_stmt();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(555);
				insert_directory_stmt();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(556);
				get_diag_stmt();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(557);
				grant_stmt();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(558);
				leave_stmt();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(559);
				map_object_stmt();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(560);
				merge_stmt();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(561);
				open_stmt();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(562);
				print_stmt();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(563);
				obtain_stmt();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(564);
				quit_stmt();
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(565);
				raise_stmt();
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(566);
				resignal_stmt();
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(567);
				return_stmt();
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(568);
				rollback_stmt();
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(569);
				select_stmt();
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(570);
				signal_stmt();
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(571);
				summary_stmt();
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(572);
				update_stmt();
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(573);
				use_stmt();
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(574);
				truncate_stmt();
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(575);
				values_into_stmt();
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(576);
				while_stmt();
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				setState(577);
				label();
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 58);
				{
				setState(578);
				hive();
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				setState(579);
				host();
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(580);
				null_stmt();
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				setState(581);
				expr_stmt();
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 62);
				{
				setState(582);
				semicolon_stmt();
				}
				break;
			case 63:
				enterOuterAlt(_localctx, 63);
				{
				setState(583);
				correct_stmt();
				}
				break;
			case 64:
				enterOuterAlt(_localctx, 64);
				{
				setState(584);
				check_stmt();
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
			setState(587);
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
			setState(589);
			match(T_EXCEPTION);
			setState(591);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(590);
					exception_block_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(593);
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
			setState(595);
			match(T_WHEN);
			setState(596);
			match(L_ID);
			setState(597);
			match(T_THEN);
			setState(598);
			block();
			setState(599);
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
			setState(601);
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
			setState(603);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("GO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"GO\")");
			setState(604);
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
			setState(619);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				match(T_SET);
				setState(607);
				set_session_option();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(608);
					match(T_SET);
					}
					break;
				}
				setState(611);
				assignment_stmt_item();
				setState(616);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(612);
						match(T_COMMA);
						setState(613);
						assignment_stmt_item();
						}
						}
					}
					setState(618);
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
			setState(624);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				assignment_stmt_single_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
				assignment_stmt_multiple_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(623);
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
			setState(642);
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
			case T_OBTAIN:
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
			case T_CHECK:
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
				setState(626);
				ident();
				setState(628);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(627);
					match(T_COLON);
					}
				}

				setState(630);
				match(T_EQUAL);
				setState(631);
				expr(0);
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				match(T_OPEN_P);
				setState(634);
				ident();
				setState(635);
				match(T_CLOSE_P);
				setState(637);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(636);
					match(T_COLON);
					}
				}

				setState(639);
				match(T_EQUAL);
				setState(640);
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
			setState(644);
			match(T_OPEN_P);
			setState(645);
			ident();
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(646);
				match(T_COMMA);
				setState(647);
				ident();
				}
				}
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(653);
			match(T_CLOSE_P);
			setState(655);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(654);
				match(T_COLON);
				}
			}

			setState(657);
			match(T_EQUAL);
			setState(658);
			match(T_OPEN_P);
			setState(659);
			expr(0);
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(660);
				match(T_COMMA);
				setState(661);
				expr(0);
				}
				}
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(667);
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
			setState(681);
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
			case T_OBTAIN:
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
			case T_CHECK:
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
				setState(669);
				ident();
				}
				break;
			case T_OPEN_P:
				{
				{
				setState(670);
				match(T_OPEN_P);
				setState(671);
				ident();
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(672);
					match(T_COMMA);
					setState(673);
					ident();
					}
					}
					setState(678);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(679);
				match(T_CLOSE_P);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(684);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(683);
				match(T_COLON);
				}
			}

			setState(686);
			match(T_EQUAL);
			setState(687);
			match(T_OPEN_P);
			setState(688);
			select_stmt();
			setState(689);
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
			setState(691);
			match(T_ALLOCATE);
			setState(692);
			ident();
			setState(693);
			match(T_CURSOR);
			setState(694);
			match(T_FOR);
			setState(698);
			switch (_input.LA(1)) {
			case T_RESULT:
				{
				{
				setState(695);
				match(T_RESULT);
				setState(696);
				match(T_SET);
				}
				}
				break;
			case T_PROCEDURE:
				{
				setState(697);
				match(T_PROCEDURE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(700);
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
			setState(702);
			match(T_ASSOCIATE);
			setState(705);
			_la = _input.LA(1);
			if (_la==T_RESULT) {
				{
				setState(703);
				match(T_RESULT);
				setState(704);
				match(T_SET);
				}
			}

			setState(707);
			_la = _input.LA(1);
			if ( !(_la==T_LOCATOR || _la==T_LOCATORS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(708);
			match(T_OPEN_P);
			setState(709);
			ident();
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(710);
				match(T_COMMA);
				setState(711);
				ident();
				}
				}
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(717);
			match(T_CLOSE_P);
			setState(718);
			match(T_WITH);
			setState(719);
			match(T_PROCEDURE);
			setState(720);
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
			setState(722);
			match(T_BEGIN);
			setState(723);
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
			setState(725);
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
			setState(727);
			match(T_CALL);
			setState(728);
			ident();
			setState(735);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(729);
				match(T_OPEN_P);
				setState(731);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(730);
					expr_func_params();
					}
					break;
				}
				setState(733);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(734);
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
			setState(737);
			match(T_DECLARE);
			setState(738);
			declare_stmt_item();
			setState(743);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(739);
					match(T_COMMA);
					setState(740);
					declare_stmt_item();
					}
					}
				}
				setState(745);
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
			setState(746);
			match(T_DECLARE);
			setState(747);
			declare_stmt_item();
			setState(748);
			match(T_SEMICOLON);
			setState(754);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(749);
					declare_stmt_item();
					setState(750);
					match(T_SEMICOLON);
					}
					}
				}
				setState(756);
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
			setState(757);
			declare_stmt_item();
			setState(758);
			match(T_SEMICOLON);
			setState(764);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(759);
					declare_stmt_item();
					setState(760);
					match(T_SEMICOLON);
					}
					}
				}
				setState(766);
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
			setState(772);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				declare_cursor_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				declare_condition_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(769);
				declare_handler_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(770);
				declare_var_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(771);
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
			setState(809);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(774);
				ident();
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(775);
					match(T_COMMA);
					setState(776);
					ident();
					}
					}
					setState(781);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(783);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(782);
					match(T_AS);
					}
					break;
				}
				setState(785);
				dtype();
				setState(787);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(786);
					dtype_len();
					}
					break;
				}
				setState(792);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(789);
						dtype_attr();
						}
						}
					}
					setState(794);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(796);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(795);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(798);
				ident();
				setState(799);
				match(T_CONSTANT);
				setState(801);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(800);
					match(T_AS);
					}
					break;
				}
				setState(803);
				dtype();
				setState(805);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(804);
					dtype_len();
					}
				}

				setState(807);
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
			setState(811);
			ident();
			setState(812);
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
			setState(819);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(814);
				match(T_CURSOR);
				setState(815);
				ident();
				}
				break;
			case 2:
				{
				setState(816);
				ident();
				setState(817);
				match(T_CURSOR);
				}
				break;
			}
			setState(823);
			switch (_input.LA(1)) {
			case T_WITH:
				{
				setState(821);
				cursor_with_return();
				}
				break;
			case T_WITHOUT:
				{
				setState(822);
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
			setState(825);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_FOR || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(828);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(826);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(827);
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
			setState(830);
			match(T_WITH);
			setState(831);
			match(T_RETURN);
			setState(833);
			_la = _input.LA(1);
			if (_la==T_ONLY) {
				{
				setState(832);
				match(T_ONLY);
				}
			}

			setState(837);
			_la = _input.LA(1);
			if (_la==T_TO) {
				{
				setState(835);
				match(T_TO);
				setState(836);
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
			setState(839);
			match(T_WITHOUT);
			setState(840);
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
			setState(842);
			_la = _input.LA(1);
			if ( !(_la==T_CONTINUE || _la==T_EXIT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(843);
			match(T_HANDLER);
			setState(844);
			match(T_FOR);
			setState(850);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(845);
				match(T_SQLEXCEPTION);
				}
				break;
			case 2:
				{
				setState(846);
				match(T_SQLWARNING);
				}
				break;
			case 3:
				{
				setState(847);
				match(T_NOT);
				setState(848);
				match(T_FOUND);
				}
				break;
			case 4:
				{
				setState(849);
				ident();
				}
				break;
			}
			setState(852);
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
			setState(855);
			_la = _input.LA(1);
			if (_la==T_GLOBAL) {
				{
				setState(854);
				match(T_GLOBAL);
				}
			}

			setState(857);
			match(T_TEMPORARY);
			setState(858);
			match(T_TABLE);
			setState(859);
			ident();
			setState(861);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(860);
				create_table_preoptions();
				}
			}

			setState(863);
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
			setState(865);
			match(T_CREATE);
			setState(866);
			match(T_TABLE);
			setState(870);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(867);
				match(T_IF);
				setState(868);
				match(T_NOT);
				setState(869);
				match(T_EXISTS);
				}
				break;
			}
			setState(872);
			table_name();
			setState(874);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(873);
				create_table_preoptions();
				}
			}

			setState(876);
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
			setState(878);
			match(T_CREATE);
			setState(885);
			switch (_input.LA(1)) {
			case T_LOCAL:
				{
				setState(879);
				match(T_LOCAL);
				setState(880);
				match(T_TEMPORARY);
				}
				break;
			case T_MULTISET:
			case T_SET:
			case T_VOLATILE:
				{
				setState(882);
				_la = _input.LA(1);
				if (_la==T_MULTISET || _la==T_SET) {
					{
					setState(881);
					_la = _input.LA(1);
					if ( !(_la==T_MULTISET || _la==T_SET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(884);
				match(T_VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(887);
			match(T_TABLE);
			setState(888);
			ident();
			setState(890);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(889);
				create_table_preoptions();
				}
			}

			setState(892);
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
			setState(909);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(895);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(894);
					match(T_AS);
					}
				}

				setState(897);
				match(T_OPEN_P);
				setState(898);
				select_stmt();
				setState(899);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(902);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(901);
					match(T_AS);
					}
				}

				setState(904);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(905);
				match(T_OPEN_P);
				setState(906);
				create_table_columns();
				setState(907);
				match(T_CLOSE_P);
				}
				break;
			}
			setState(912);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(911);
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
			setState(914);
			create_table_columns_item();
			setState(919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(915);
				match(T_COMMA);
				setState(916);
				create_table_columns_item();
				}
				}
				setState(921);
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
			setState(944);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(922);
				column_name();
				setState(923);
				dtype();
				setState(925);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(924);
					dtype_len();
					}
				}

				setState(930);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(927);
						dtype_attr();
						}
						}
					}
					setState(932);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_AUTO_INCREMENT || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (T_DEFAULT - 75)) | (1L << (T_ENABLE - 75)) | (1L << (T_IDENTITY - 75)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (T_NOT - 193)) | (1L << (T_NULL - 193)) | (1L << (T_PRIMARY - 193)) | (1L << (T_REFERENCES - 193)))) != 0) || ((((_la - 300)) & ~0x3f) == 0 && ((1L << (_la - 300)) & ((1L << (T_UNIQUE - 300)) | (1L << (T_WITH - 300)) | (1L << (T_COLON - 300)) | (1L << (T_EQUAL - 300)))) != 0)) {
					{
					{
					setState(933);
					create_table_column_inline_cons();
					}
					}
					setState(938);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(941);
				_la = _input.LA(1);
				if (_la==T_CONSTRAINT) {
					{
					setState(939);
					match(T_CONSTRAINT);
					setState(940);
					ident();
					}
				}

				setState(943);
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
			setState(946);
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
			setState(980);
			switch (_input.LA(1)) {
			case T_DEFAULT:
			case T_WITH:
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(948);
				dtype_default();
				}
				break;
			case T_NOT:
			case T_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(950);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(949);
					match(T_NOT);
					}
				}

				setState(952);
				match(T_NULL);
				}
				break;
			case T_PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(953);
				match(T_PRIMARY);
				setState(954);
				match(T_KEY);
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(955);
				match(T_UNIQUE);
				}
				break;
			case T_REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(956);
				match(T_REFERENCES);
				setState(957);
				table_name();
				setState(958);
				match(T_OPEN_P);
				setState(959);
				ident();
				setState(960);
				match(T_CLOSE_P);
				setState(964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(961);
					create_table_fk_action();
					}
					}
					setState(966);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T_IDENTITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(967);
				match(T_IDENTITY);
				setState(968);
				match(T_OPEN_P);
				setState(969);
				match(L_INT);
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(970);
					match(T_COMMA);
					setState(971);
					match(L_INT);
					}
					}
					setState(976);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(977);
				match(T_CLOSE_P);
				}
				break;
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(978);
				match(T_AUTO_INCREMENT);
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(979);
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
			setState(1039);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(982);
				match(T_PRIMARY);
				setState(983);
				match(T_KEY);
				setState(985);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(984);
					match(T_CLUSTERED);
					}
				}

				setState(987);
				match(T_OPEN_P);
				setState(988);
				ident();
				setState(990);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(989);
					_la = _input.LA(1);
					if ( !(_la==T_ASC || _la==T_DESC) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(992);
					match(T_COMMA);
					setState(993);
					ident();
					setState(995);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(994);
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
					setState(1001);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1002);
				match(T_CLOSE_P);
				setState(1004);
				_la = _input.LA(1);
				if (_la==T_ENABLE) {
					{
					setState(1003);
					match(T_ENABLE);
					}
				}

				setState(1007);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1006);
					index_storage_clause();
					}
				}

				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1009);
				match(T_FOREIGN);
				setState(1010);
				match(T_KEY);
				setState(1011);
				match(T_OPEN_P);
				setState(1012);
				ident();
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1013);
					match(T_COMMA);
					setState(1014);
					ident();
					}
					}
					setState(1019);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1020);
				match(T_CLOSE_P);
				setState(1021);
				match(T_REFERENCES);
				setState(1022);
				table_name();
				setState(1023);
				match(T_OPEN_P);
				setState(1024);
				ident();
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1025);
					match(T_COMMA);
					setState(1026);
					ident();
					}
					}
					setState(1031);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1032);
				match(T_CLOSE_P);
				setState(1036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(1033);
					create_table_fk_action();
					}
					}
					setState(1038);
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
			setState(1041);
			match(T_ON);
			setState(1042);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_UPDATE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1051);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(1043);
				match(T_NO);
				setState(1044);
				match(T_ACTION);
				}
				break;
			case 2:
				{
				setState(1045);
				match(T_RESTRICT);
				}
				break;
			case 3:
				{
				setState(1046);
				match(T_SET);
				setState(1047);
				match(T_NULL);
				}
				break;
			case 4:
				{
				setState(1048);
				match(T_SET);
				setState(1049);
				match(T_DEFAULT);
				}
				break;
			case 5:
				{
				setState(1050);
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
			setState(1054);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1053);
				create_table_preoptions_item();
				}
				}
				setState(1056);
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
			setState(1061);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1058);
				match(T_COMMA);
				setState(1059);
				create_table_preoptions_td_item();
				}
				break;
			case T_ROW:
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1060);
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
			setState(1064);
			_la = _input.LA(1);
			if (_la==T_NO) {
				{
				setState(1063);
				match(T_NO);
				}
			}

			setState(1066);
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
			setState(1069);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1068);
					create_table_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1071);
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
			setState(1083);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1073);
				match(T_ON);
				setState(1074);
				match(T_COMMIT);
				setState(1075);
				_la = _input.LA(1);
				if ( !(_la==T_DELETE || _la==T_PRESERVE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1076);
				match(T_ROWS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1077);
				create_table_options_ora_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1078);
				create_table_options_db2_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1079);
				create_table_options_td_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1080);
				create_table_options_hive_item();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1081);
				create_table_options_mssql_item();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1082);
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
			setState(1103);
			switch (_input.LA(1)) {
			case T_SEGMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1085);
				match(T_SEGMENT);
				setState(1086);
				match(T_CREATION);
				setState(1087);
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
				setState(1088);
				_la = _input.LA(1);
				if ( !(_la==T_INITRANS || _la==T_MAXTRANS || _la==T_PCTFREE || _la==T_PCTUSED) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1089);
				match(L_INT);
				}
				break;
			case T_NOCOMPRESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1090);
				match(T_NOCOMPRESS);
				}
				break;
			case T_LOGGING:
			case T_NOLOGGING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1091);
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
				setState(1092);
				match(T_STORAGE);
				setState(1093);
				match(T_OPEN_P);
				setState(1096);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(1096);
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
					case T_OBTAIN:
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
					case T_CHECK:
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
						setState(1094);
						ident();
						}
						break;
					case L_INT:
						{
						setState(1095);
						match(L_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1098);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_OBTAIN - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SELECT - 256)) | (1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_YES - 320)) | (1L << (T_CORRECT - 320)) | (1L << (T_CHECK - 320)) | (1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)) | (1L << (L_ID - 320)) | (1L << (L_INT - 320)))) != 0) );
				setState(1100);
				match(T_CLOSE_P);
				}
				break;
			case T_TABLESPACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1101);
				match(T_TABLESPACE);
				setState(1102);
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
			setState(1138);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1106);
				_la = _input.LA(1);
				if (_la==T_INDEX) {
					{
					setState(1105);
					match(T_INDEX);
					}
				}

				setState(1108);
				match(T_IN);
				setState(1109);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1110);
				match(T_WITH);
				setState(1111);
				match(T_REPLACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1112);
				match(T_DISTRIBUTE);
				setState(1113);
				match(T_BY);
				setState(1114);
				match(T_HASH);
				setState(1115);
				match(T_OPEN_P);
				setState(1116);
				ident();
				setState(1121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1117);
					match(T_COMMA);
					setState(1118);
					ident();
					}
					}
					setState(1123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1124);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1127);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1126);
					match(T_NOT);
					}
				}

				setState(1129);
				match(T_LOGGED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1130);
				match(T_COMPRESS);
				setState(1131);
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
				setState(1132);
				match(T_DEFINITION);
				setState(1133);
				match(T_ONLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1134);
				match(T_WITH);
				setState(1135);
				match(T_RESTRICT);
				setState(1136);
				match(T_ON);
				setState(1137);
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
			setState(1158);
			switch (_input.LA(1)) {
			case T_PRIMARY:
			case T_UNIQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1141);
				_la = _input.LA(1);
				if (_la==T_UNIQUE) {
					{
					setState(1140);
					match(T_UNIQUE);
					}
				}

				setState(1143);
				match(T_PRIMARY);
				setState(1144);
				match(T_INDEX);
				setState(1145);
				match(T_OPEN_P);
				setState(1146);
				ident();
				setState(1151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1147);
					match(T_COMMA);
					setState(1148);
					ident();
					}
					}
					setState(1153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1154);
				match(T_CLOSE_P);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1156);
				match(T_WITH);
				setState(1157);
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
			setState(1164);
			switch (_input.LA(1)) {
			case T_ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1160);
				create_table_hive_row_format();
				}
				break;
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1161);
				match(T_STORED);
				setState(1162);
				match(T_AS);
				setState(1163);
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
			setState(1166);
			match(T_ROW);
			setState(1167);
			match(T_FORMAT);
			setState(1168);
			match(T_DELIMITED);
			setState(1172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1169);
					create_table_hive_row_format_fields();
					}
					}
				}
				setState(1174);
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
			setState(1202);
			switch (_input.LA(1)) {
			case T_FIELDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1175);
				match(T_FIELDS);
				setState(1176);
				match(T_TERMINATED);
				setState(1177);
				match(T_BY);
				setState(1178);
				expr(0);
				setState(1182);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(1179);
					match(T_ESCAPED);
					setState(1180);
					match(T_BY);
					setState(1181);
					expr(0);
					}
					break;
				}
				}
				break;
			case T_COLLECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1184);
				match(T_COLLECTION);
				setState(1185);
				match(T_ITEMS);
				setState(1186);
				match(T_TERMINATED);
				setState(1187);
				match(T_BY);
				setState(1188);
				expr(0);
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1189);
				match(T_MAP);
				setState(1190);
				match(T_KEYS);
				setState(1191);
				match(T_TERMINATED);
				setState(1192);
				match(T_BY);
				setState(1193);
				expr(0);
				}
				break;
			case T_LINES:
				enterOuterAlt(_localctx, 4);
				{
				setState(1194);
				match(T_LINES);
				setState(1195);
				match(T_TERMINATED);
				setState(1196);
				match(T_BY);
				setState(1197);
				expr(0);
				}
				break;
			case T_NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1198);
				match(T_NULL);
				setState(1199);
				match(T_DEFINED);
				setState(1200);
				match(T_AS);
				setState(1201);
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
			setState(1208);
			switch (_input.LA(1)) {
			case T_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1204);
				match(T_ON);
				setState(1205);
				ident();
				}
				break;
			case T_TEXTIMAGE_ON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1206);
				match(T_TEXTIMAGE_ON);
				setState(1207);
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
			setState(1237);
			switch (_input.LA(1)) {
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1210);
				match(T_AUTO_INCREMENT);
				setState(1212);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1211);
					match(T_EQUAL);
					}
				}

				setState(1214);
				expr(0);
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1215);
				match(T_COMMENT);
				setState(1217);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1216);
					match(T_EQUAL);
					}
				}

				setState(1219);
				expr(0);
				}
				break;
			case T_CHARACTER:
			case T_CHARSET:
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1221);
				_la = _input.LA(1);
				if (_la==T_DEFAULT) {
					{
					setState(1220);
					match(T_DEFAULT);
					}
				}

				setState(1226);
				switch (_input.LA(1)) {
				case T_CHARACTER:
					{
					setState(1223);
					match(T_CHARACTER);
					setState(1224);
					match(T_SET);
					}
					break;
				case T_CHARSET:
					{
					setState(1225);
					match(T_CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1229);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1228);
					match(T_EQUAL);
					}
				}

				setState(1231);
				expr(0);
				}
				break;
			case T_ENGINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1232);
				match(T_ENGINE);
				setState(1234);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1233);
					match(T_EQUAL);
					}
				}

				setState(1236);
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
			setState(1239);
			match(T_ALTER);
			setState(1240);
			match(T_TABLE);
			setState(1241);
			table_name();
			setState(1242);
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
			setState(1244);
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
			setState(1246);
			match(T_ADD2);
			setState(1249);
			_la = _input.LA(1);
			if (_la==T_CONSTRAINT) {
				{
				setState(1247);
				match(T_CONSTRAINT);
				setState(1248);
				ident();
				}
			}

			setState(1251);
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
			setState(1315);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1253);
				match(T_PRIMARY);
				setState(1254);
				match(T_KEY);
				setState(1256);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(1255);
					match(T_CLUSTERED);
					}
				}

				setState(1258);
				match(T_OPEN_P);
				setState(1259);
				ident();
				setState(1261);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(1260);
					_la = _input.LA(1);
					if ( !(_la==T_ASC || _la==T_DESC) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(1270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1263);
					match(T_COMMA);
					setState(1264);
					ident();
					setState(1266);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(1265);
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
					setState(1272);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1273);
				match(T_CLOSE_P);
				setState(1275);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1274);
					match(T_ENABLE);
					}
					break;
				}
				setState(1278);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1277);
					index_storage_clause();
					}
					break;
				}
				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1280);
				match(T_FOREIGN);
				setState(1281);
				match(T_KEY);
				setState(1282);
				match(T_OPEN_P);
				setState(1283);
				ident();
				setState(1288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1284);
					match(T_COMMA);
					setState(1285);
					ident();
					}
					}
					setState(1290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1291);
				match(T_CLOSE_P);
				setState(1292);
				match(T_REFERENCES);
				setState(1293);
				table_name();
				setState(1294);
				match(T_OPEN_P);
				setState(1295);
				ident();
				setState(1300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1296);
					match(T_COMMA);
					setState(1297);
					ident();
					}
					}
					setState(1302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1303);
				match(T_CLOSE_P);
				setState(1307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1304);
						create_table_fk_action();
						}
						}
					}
					setState(1309);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				}
				}
				break;
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1310);
				match(T_DEFAULT);
				setState(1311);
				expr(0);
				setState(1312);
				match(T_FOR);
				setState(1313);
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
			setState(1362);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1317);
				match(T_CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1318);
				match(T_BIGINT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1319);
				match(T_BINARY_DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1320);
				match(T_BINARY_FLOAT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1321);
				match(T_BINARY_INTEGER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1322);
				match(T_BIT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1323);
				match(T_DATE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1324);
				match(T_DATETIME);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1325);
				match(T_DEC);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1326);
				match(T_DECIMAL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1327);
				match(T_DOUBLE);
				setState(1329);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1328);
					match(T_PRECISION);
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1331);
				match(T_FLOAT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1332);
				match(T_INT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1333);
				match(T_INT2);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1334);
				match(T_INT4);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1335);
				match(T_INT8);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1336);
				match(T_INTEGER);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1337);
				match(T_NCHAR);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1338);
				match(T_NVARCHAR);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1339);
				match(T_NUMBER);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1340);
				match(T_NUMERIC);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1341);
				match(T_PLS_INTEGER);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1342);
				match(T_REAL);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1343);
				match(T_RESULT_SET_LOCATOR);
				setState(1344);
				match(T_VARYING);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1345);
				match(T_SIMPLE_FLOAT);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1346);
				match(T_SIMPLE_DOUBLE);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1347);
				match(T_SIMPLE_INTEGER);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1348);
				match(T_SMALLINT);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1349);
				match(T_SMALLDATETIME);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1350);
				match(T_STRING);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1351);
				match(T_SYS_REFCURSOR);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1352);
				match(T_TIMESTAMP);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1353);
				match(T_TINYINT);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1354);
				match(T_VARCHAR);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1355);
				match(T_VARCHAR2);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1356);
				match(T_XML);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1357);
				ident();
				setState(1360);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1358);
					match(T__2);
					setState(1359);
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
			setState(1364);
			match(T_OPEN_P);
			setState(1365);
			_la = _input.LA(1);
			if ( !(_la==T_MAX || _la==L_INT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1367);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(1366);
				_la = _input.LA(1);
				if ( !(_la==T_BYTE || _la==T_CHAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1371);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(1369);
				match(T_COMMA);
				setState(1370);
				match(L_INT);
				}
			}

			setState(1373);
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
			setState(1386);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1376);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1375);
					match(T_NOT);
					}
				}

				setState(1378);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1379);
				match(T_CHARACTER);
				setState(1380);
				match(T_SET);
				setState(1381);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1383);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1382);
					match(T_NOT);
					}
				}

				setState(1385);
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
			setState(1400);
			switch (_input.LA(1)) {
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1389);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(1388);
					match(T_COLON);
					}
				}

				setState(1391);
				match(T_EQUAL);
				setState(1392);
				expr(0);
				}
				break;
			case T_DEFAULT:
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1394);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1393);
					match(T_WITH);
					}
				}

				setState(1396);
				match(T_DEFAULT);
				setState(1398);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1397);
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
			setState(1402);
			match(T_CREATE);
			setState(1403);
			_la = _input.LA(1);
			if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1407);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1404);
				match(T_IF);
				setState(1405);
				match(T_NOT);
				setState(1406);
				match(T_EXISTS);
				}
				break;
			}
			setState(1409);
			expr(0);
			setState(1413);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1410);
					create_database_option();
					}
					}
				}
				setState(1415);
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
			setState(1420);
			switch (_input.LA(1)) {
			case T_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1416);
				match(T_COMMENT);
				setState(1417);
				expr(0);
				}
				break;
			case T_LOCATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1418);
				match(T_LOCATION);
				setState(1419);
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
			setState(1429);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1422);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1423);
				match(T_CREATE);
				setState(1426);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1424);
					match(T_OR);
					setState(1425);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1428);
				match(T_REPLACE);
				}
				break;
			case T_FUNCTION:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1431);
			match(T_FUNCTION);
			setState(1432);
			ident();
			setState(1434);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1433);
				create_routine_params();
				}
				break;
			}
			setState(1436);
			create_function_return();
			setState(1438);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1437);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(1441);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1440);
				declare_block_inplace();
				}
				break;
			}
			setState(1443);
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
			setState(1445);
			_la = _input.LA(1);
			if ( !(_la==T_RETURN || _la==T_RETURNS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1446);
			dtype();
			setState(1448);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1447);
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
			setState(1457);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1450);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1451);
				match(T_CREATE);
				setState(1454);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1452);
					match(T_OR);
					setState(1453);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1456);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1459);
			match(T_PACKAGE);
			setState(1460);
			ident();
			setState(1461);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1462);
			package_spec();
			setState(1463);
			match(T_END);
			setState(1467);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1464);
				ident();
				setState(1465);
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
			setState(1469);
			package_spec_item();
			setState(1470);
			match(T_SEMICOLON);
			setState(1476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_OBTAIN - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SELECT - 256)) | (1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_YES - 320)) | (1L << (T_CORRECT - 320)) | (1L << (T_CHECK - 320)) | (1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)) | (1L << (L_ID - 320)))) != 0)) {
				{
				{
				setState(1471);
				package_spec_item();
				setState(1472);
				match(T_SEMICOLON);
				}
				}
				setState(1478);
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
			setState(1492);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1479);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1480);
				match(T_FUNCTION);
				setState(1481);
				ident();
				setState(1483);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1482);
					create_routine_params();
					}
					break;
				}
				setState(1485);
				create_function_return();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1487);
				_la = _input.LA(1);
				if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1488);
				ident();
				setState(1490);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1489);
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
			setState(1501);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1494);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1495);
				match(T_CREATE);
				setState(1498);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1496);
					match(T_OR);
					setState(1497);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1500);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1503);
			match(T_PACKAGE);
			setState(1504);
			match(T_BODY);
			setState(1505);
			ident();
			setState(1506);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1507);
			package_body();
			setState(1508);
			match(T_END);
			setState(1512);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1509);
				ident();
				setState(1510);
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
			setState(1514);
			package_body_item();
			setState(1515);
			match(T_SEMICOLON);
			setState(1521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_OBTAIN - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SELECT - 256)) | (1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_YES - 320)) | (1L << (T_CORRECT - 320)) | (1L << (T_CHECK - 320)) | (1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)) | (1L << (L_ID - 320)))) != 0)) {
				{
				{
				setState(1516);
				package_body_item();
				setState(1517);
				match(T_SEMICOLON);
				}
				}
				setState(1523);
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
			setState(1527);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1524);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1525);
				create_function_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1526);
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
			setState(1536);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1529);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1530);
				match(T_CREATE);
				setState(1533);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1531);
					match(T_OR);
					setState(1532);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1535);
				match(T_REPLACE);
				}
				break;
			case T_PROC:
			case T_PROCEDURE:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1538);
			_la = _input.LA(1);
			if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1539);
			ident();
			setState(1541);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1540);
				create_routine_params();
				}
				break;
			}
			setState(1544);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1543);
				create_routine_options();
				}
				break;
			}
			setState(1547);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1546);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(1550);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1549);
				declare_block_inplace();
				}
				break;
			}
			setState(1553);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1552);
				label();
				}
				break;
			}
			setState(1555);
			proc_block();
			setState(1559);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1556);
				ident();
				setState(1557);
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
			setState(1583);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1561);
				match(T_OPEN_P);
				setState(1562);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1563);
				match(T_OPEN_P);
				setState(1564);
				create_routine_param_item();
				setState(1569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1565);
					match(T_COMMA);
					setState(1566);
					create_routine_param_item();
					}
					}
					setState(1571);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1572);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1574);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("IS") &&
				        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
				        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
				        )) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"IS\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"AS\") &&\r\n        !(_input.LT(1).getText().equalsIgnoreCase(\"DYNAMIC\") && _input.LT(2).getText().equalsIgnoreCase(\"RESULT\"))\r\n        ");
				setState(1575);
				create_routine_param_item();
				setState(1580);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1576);
						match(T_COMMA);
						setState(1577);
						create_routine_param_item();
						}
						}
					}
					setState(1582);
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
			setState(1627);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1590);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1585);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1586);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1587);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1588);
					match(T_IN);
					setState(1589);
					match(T_OUT);
					}
					break;
				}
				setState(1592);
				ident();
				setState(1593);
				dtype();
				setState(1595);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1594);
					dtype_len();
					}
					break;
				}
				setState(1600);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1597);
						dtype_attr();
						}
						}
					}
					setState(1602);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				}
				setState(1604);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1603);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1606);
				ident();
				setState(1612);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1607);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1608);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1609);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1610);
					match(T_IN);
					setState(1611);
					match(T_OUT);
					}
					break;
				}
				setState(1614);
				dtype();
				setState(1616);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1615);
					dtype_len();
					}
					break;
				}
				setState(1621);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1618);
						dtype_attr();
						}
						}
					}
					setState(1623);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				}
				setState(1625);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1624);
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
			setState(1630);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1629);
					create_routine_option();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1632);
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
			setState(1645);
			switch (_input.LA(1)) {
			case T_LANGUAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1634);
				match(T_LANGUAGE);
				setState(1635);
				match(T_SQL);
				}
				break;
			case T_SQL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1636);
				match(T_SQL);
				setState(1637);
				match(T_SECURITY);
				setState(1638);
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
				setState(1640);
				_la = _input.LA(1);
				if (_la==T_DYNAMIC) {
					{
					setState(1639);
					match(T_DYNAMIC);
					}
				}

				setState(1642);
				match(T_RESULT);
				setState(1643);
				match(T_SETS);
				setState(1644);
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
			setState(1661);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1647);
				match(T_DROP);
				setState(1648);
				match(T_TABLE);
				setState(1651);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1649);
					match(T_IF);
					setState(1650);
					match(T_EXISTS);
					}
					break;
				}
				setState(1653);
				table_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1654);
				match(T_DROP);
				setState(1655);
				_la = _input.LA(1);
				if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1658);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1656);
					match(T_IF);
					setState(1657);
					match(T_EXISTS);
					}
					break;
				}
				setState(1660);
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
			setState(1663);
			match(T_END);
			setState(1664);
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
			setState(1666);
			_la = _input.LA(1);
			if ( !(_la==T_EXEC || _la==T_EXECUTE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1668);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1667);
				match(T_IMMEDIATE);
				}
				break;
			}
			setState(1670);
			expr(0);
			setState(1676);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1671);
				match(T_OPEN_P);
				setState(1672);
				expr_func_params();
				setState(1673);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1675);
				expr_func_params();
				}
				break;
			}
			setState(1687);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1678);
				match(T_INTO);
				setState(1679);
				match(L_ID);
				setState(1684);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1680);
						match(T_COMMA);
						setState(1681);
						match(L_ID);
						}
						}
					}
					setState(1686);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				}
				}
				break;
			}
			setState(1690);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1689);
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
			setState(1695);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1692);
				if_plsql_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1693);
				if_tsql_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1694);
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
			setState(1697);
			match(T_IF);
			setState(1698);
			bool_expr(0);
			setState(1699);
			match(T_THEN);
			setState(1700);
			block();
			setState(1704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ELSEIF || _la==T_ELSIF) {
				{
				{
				setState(1701);
				elseif_block();
				}
				}
				setState(1706);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1708);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(1707);
				else_block();
				}
			}

			setState(1710);
			match(T_END);
			setState(1711);
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
			setState(1713);
			match(T_IF);
			setState(1714);
			bool_expr(0);
			setState(1715);
			single_block_stmt();
			setState(1718);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1716);
				match(T_ELSE);
				setState(1717);
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
			setState(1720);
			match(T__3);
			setState(1721);
			match(T_IF);
			setState(1722);
			bool_expr(0);
			setState(1723);
			match(T_THEN);
			setState(1724);
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
			setState(1726);
			_la = _input.LA(1);
			if ( !(_la==T_ELSEIF || _la==T_ELSIF) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1727);
			bool_expr(0);
			setState(1728);
			match(T_THEN);
			setState(1729);
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
			setState(1731);
			match(T_ELSE);
			setState(1732);
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
			setState(1734);
			match(T_INCLUDE);
			setState(1737);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1735);
				file_name();
				}
				break;
			case 2:
				{
				setState(1736);
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
			setState(1739);
			match(T_INSERT);
			setState(1746);
			switch (_input.LA(1)) {
			case T_OVERWRITE:
				{
				setState(1740);
				match(T_OVERWRITE);
				setState(1741);
				match(T_TABLE);
				}
				break;
			case T_INTO:
				{
				setState(1742);
				match(T_INTO);
				setState(1744);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1743);
					match(T_TABLE);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1748);
			table_name();
			setState(1750);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1749);
				insert_stmt_cols();
				}
				break;
			}
			setState(1754);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
			case T_WITH:
			case T_OPEN_P:
				{
				setState(1752);
				select_stmt();
				}
				break;
			case T_VALUES:
				{
				setState(1753);
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
			setState(1756);
			match(T_OPEN_P);
			setState(1757);
			ident();
			setState(1762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1758);
				match(T_COMMA);
				setState(1759);
				ident();
				}
				}
				setState(1764);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1765);
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
			setState(1767);
			match(T_VALUES);
			setState(1768);
			insert_stmt_row();
			setState(1773);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1769);
					match(T_COMMA);
					setState(1770);
					insert_stmt_row();
					}
					}
				}
				setState(1775);
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
			setState(1776);
			match(T_OPEN_P);
			setState(1777);
			expr(0);
			setState(1782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1778);
				match(T_COMMA);
				setState(1779);
				expr(0);
				}
				}
				setState(1784);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1785);
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
			setState(1787);
			match(T_INSERT);
			setState(1788);
			match(T_OVERWRITE);
			setState(1790);
			_la = _input.LA(1);
			if (_la==T_LOCAL) {
				{
				setState(1789);
				match(T_LOCAL);
				}
			}

			setState(1792);
			match(T_DIRECTORY);
			setState(1793);
			expr_file();
			setState(1794);
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
			setState(1796);
			match(T_ON);
			setState(1797);
			table_name();
			setState(1799);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1798);
				correct_stmt_cols();
				}
				break;
			}
			setState(1802);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1801);
				from_alias_clause();
				}
				break;
			}
			setState(1805);
			_la = _input.LA(1);
			if (_la==T_WHERE) {
				{
				setState(1804);
				where_clause();
				}
			}

			setState(1807);
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
			setState(1809);
			match(T_OPEN_P);
			setState(1810);
			select_list();
			setState(1811);
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
			setState(1813);
			match(T_CORRECT);
			setState(1814);
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

	public static class Check_stmtContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(PlsqlParser.T_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Check_assignmentContext check_assignment() {
			return getRuleContext(Check_assignmentContext.class,0);
		}
		public Check_stmt_colsContext check_stmt_cols() {
			return getRuleContext(Check_stmt_colsContext.class,0);
		}
		public Check_stmt_with_rowsContext check_stmt_with_rows() {
			return getRuleContext(Check_stmt_with_rowsContext.class,0);
		}
		public Check_stmt_aliasContext check_stmt_alias() {
			return getRuleContext(Check_stmt_aliasContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Check_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCheck_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCheck_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCheck_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Check_stmtContext check_stmt() throws RecognitionException {
		Check_stmtContext _localctx = new Check_stmtContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_check_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1816);
			match(T_ON);
			setState(1817);
			table_name();
			setState(1819);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(1818);
				check_stmt_cols();
				}
			}

			setState(1822);
			_la = _input.LA(1);
			if (_la==T_WITH) {
				{
				setState(1821);
				check_stmt_with_rows();
				}
			}

			setState(1825);
			_la = _input.LA(1);
			if (_la==T_AS) {
				{
				setState(1824);
				check_stmt_alias();
				}
			}

			setState(1828);
			_la = _input.LA(1);
			if (_la==T_WHERE) {
				{
				setState(1827);
				where_clause();
				}
			}

			setState(1830);
			check_assignment();
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

	public static class Check_stmt_colsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public Check_stmt_colsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check_stmt_cols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCheck_stmt_cols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCheck_stmt_cols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCheck_stmt_cols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Check_stmt_colsContext check_stmt_cols() throws RecognitionException {
		Check_stmt_colsContext _localctx = new Check_stmt_colsContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_check_stmt_cols);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1832);
			match(T_OPEN_P);
			setState(1833);
			select_list();
			setState(1834);
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

	public static class Check_stmt_with_rowsContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(PlsqlParser.T_WITH, 0); }
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
		public Check_stmt_with_rowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check_stmt_with_rows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCheck_stmt_with_rows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCheck_stmt_with_rows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCheck_stmt_with_rows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Check_stmt_with_rowsContext check_stmt_with_rows() throws RecognitionException {
		Check_stmt_with_rowsContext _localctx = new Check_stmt_with_rowsContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_check_stmt_with_rows);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			match(T_WITH);
			setState(1838);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1837);
				ident();
				}
				break;
			}
			setState(1844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1840);
				match(T_COMMA);
				setState(1841);
				ident();
				}
				}
				setState(1846);
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

	public static class Check_stmt_aliasContext extends ParserRuleContext {
		public TerminalNode T_AS() { return getToken(PlsqlParser.T_AS, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Check_stmt_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check_stmt_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCheck_stmt_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCheck_stmt_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCheck_stmt_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Check_stmt_aliasContext check_stmt_alias() throws RecognitionException {
		Check_stmt_aliasContext _localctx = new Check_stmt_aliasContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_check_stmt_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1847);
			match(T_AS);
			setState(1848);
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

	public static class Check_assignmentContext extends ParserRuleContext {
		public TerminalNode T_CHECK() { return getToken(PlsqlParser.T_CHECK, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Check_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterCheck_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitCheck_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitCheck_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Check_assignmentContext check_assignment() throws RecognitionException {
		Check_assignmentContext _localctx = new Check_assignmentContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_check_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1850);
			match(T_CHECK);
			setState(1851);
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
		enterRule(_localctx, 202, RULE_exit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1853);
			match(T_EXIT);
			setState(1855);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1854);
				match(L_ID);
				}
				break;
			}
			setState(1859);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1857);
				match(T_WHEN);
				setState(1858);
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
		enterRule(_localctx, 204, RULE_get_diag_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1861);
			match(T_GET);
			setState(1862);
			match(T_DIAGNOSTICS);
			setState(1863);
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
		enterRule(_localctx, 206, RULE_get_diag_stmt_item);
		try {
			setState(1867);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1865);
				get_diag_stmt_exception_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1866);
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
		enterRule(_localctx, 208, RULE_get_diag_stmt_exception_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1869);
			match(T_EXCEPTION);
			setState(1870);
			match(L_INT);
			setState(1871);
			ident();
			setState(1872);
			match(T_EQUAL);
			setState(1873);
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
		enterRule(_localctx, 210, RULE_get_diag_stmt_rowcount_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1875);
			ident();
			setState(1876);
			match(T_EQUAL);
			setState(1877);
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
		enterRule(_localctx, 212, RULE_grant_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1879);
			match(T_GRANT);
			setState(1880);
			grant_stmt_item();
			setState(1885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1881);
				match(T_COMMA);
				setState(1882);
				grant_stmt_item();
				}
				}
				setState(1887);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1888);
			match(T_TO);
			setState(1889);
			match(T_ROLE);
			setState(1890);
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
		enterRule(_localctx, 214, RULE_grant_stmt_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1892);
			match(T_EXECUTE);
			setState(1893);
			match(T_ON);
			setState(1894);
			match(T_PROCEDURE);
			setState(1895);
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
		enterRule(_localctx, 216, RULE_leave_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1897);
			match(T_LEAVE);
			setState(1899);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1898);
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
		enterRule(_localctx, 218, RULE_map_object_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1901);
			match(T_MAP);
			setState(1902);
			match(T_OBJECT);
			setState(1903);
			expr(0);
			setState(1906);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1904);
				match(T_TO);
				setState(1905);
				expr(0);
				}
				break;
			}
			setState(1910);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1908);
				match(T_AT);
				setState(1909);
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
		enterRule(_localctx, 220, RULE_open_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1912);
			match(T_OPEN);
			setState(1913);
			match(L_ID);
			setState(1919);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1914);
				match(T_FOR);
				setState(1917);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1915);
					select_stmt();
					}
					break;
				case 2:
					{
					setState(1916);
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
		enterRule(_localctx, 222, RULE_fetch_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1921);
			match(T_FETCH);
			setState(1923);
			_la = _input.LA(1);
			if (_la==T_FROM) {
				{
				setState(1922);
				match(T_FROM);
				}
			}

			setState(1925);
			match(L_ID);
			setState(1926);
			match(T_INTO);
			setState(1927);
			match(L_ID);
			setState(1932);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1928);
					match(T_COMMA);
					setState(1929);
					match(L_ID);
					}
					}
				}
				setState(1934);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
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
		enterRule(_localctx, 224, RULE_collect_stats_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1935);
			match(T_COLLECT);
			setState(1936);
			_la = _input.LA(1);
			if ( !(_la==T_STATS || _la==T_STATISTICS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1937);
			match(T_ON);
			setState(1938);
			table_name();
			setState(1940);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				{
				setState(1939);
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
		enterRule(_localctx, 226, RULE_collect_stats_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1942);
			match(T_COLUMN);
			setState(1943);
			match(T_OPEN_P);
			setState(1944);
			ident();
			setState(1949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1945);
				match(T_COMMA);
				setState(1946);
				ident();
				}
				}
				setState(1951);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1952);
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
		enterRule(_localctx, 228, RULE_close_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1954);
			match(T_CLOSE);
			setState(1955);
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
		enterRule(_localctx, 230, RULE_cmp_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1957);
			match(T_CMP);
			setState(1958);
			_la = _input.LA(1);
			if ( !(_la==T_ROW_COUNT || _la==T_SUM) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1959);
			cmp_source();
			setState(1960);
			match(T_COMMA);
			setState(1961);
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
		enterRule(_localctx, 232, RULE_cmp_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1971);
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
			case T_OBTAIN:
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
			case T_CHECK:
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
				setState(1963);
				table_name();
				setState(1965);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1964);
					where_clause();
					}
					break;
				}
				}
				break;
			case T_OPEN_P:
				{
				setState(1967);
				match(T_OPEN_P);
				setState(1968);
				select_stmt();
				setState(1969);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1975);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1973);
				match(T_AT);
				setState(1974);
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
		enterRule(_localctx, 234, RULE_copy_from_local_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1977);
			match(T_COPY);
			setState(1978);
			match(T_FROM);
			setState(1979);
			match(T_LOCAL);
			setState(1980);
			copy_source();
			setState(1985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1981);
				match(T_COMMA);
				setState(1982);
				copy_source();
				}
				}
				setState(1987);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1988);
			match(T_TO);
			setState(1989);
			copy_target();
			setState(1993);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1990);
					copy_file_option();
					}
					}
				}
				setState(1995);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
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
		enterRule(_localctx, 236, RULE_copy_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1996);
			match(T_COPY);
			setState(2002);
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
			case T_OBTAIN:
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
			case T_CHECK:
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
				setState(1997);
				table_name();
				}
				break;
			case T_OPEN_P:
				{
				setState(1998);
				match(T_OPEN_P);
				setState(1999);
				select_stmt();
				setState(2000);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2004);
			match(T_TO);
			setState(2006);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				{
				setState(2005);
				match(T_HDFS);
				}
				break;
			}
			setState(2008);
			copy_target();
			setState(2012);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2009);
					copy_option();
					}
					}
				}
				setState(2014);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
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
		enterRule(_localctx, 238, RULE_copy_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2017);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(2015);
				file_name();
				}
				break;
			case 2:
				{
				setState(2016);
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
		enterRule(_localctx, 240, RULE_copy_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2021);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(2019);
				file_name();
				}
				break;
			case 2:
				{
				setState(2020);
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
		enterRule(_localctx, 242, RULE_copy_option);
		try {
			setState(2031);
			switch (_input.LA(1)) {
			case T_AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2023);
				match(T_AT);
				setState(2024);
				ident();
				}
				break;
			case T_BATCHSIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2025);
				match(T_BATCHSIZE);
				setState(2026);
				expr(0);
				}
				break;
			case T_DELIMITER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2027);
				match(T_DELIMITER);
				setState(2028);
				expr(0);
				}
				break;
			case T_SQLINSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(2029);
				match(T_SQLINSERT);
				setState(2030);
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
		enterRule(_localctx, 244, RULE_copy_file_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2033);
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
		enterRule(_localctx, 246, RULE_commit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2035);
			match(T_COMMIT);
			setState(2037);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(2036);
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
		enterRule(_localctx, 248, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2039);
			match(T_CREATE);
			setState(2041);
			_la = _input.LA(1);
			if (_la==T_UNIQUE) {
				{
				setState(2040);
				match(T_UNIQUE);
				}
			}

			setState(2043);
			match(T_INDEX);
			setState(2044);
			ident();
			setState(2045);
			match(T_ON);
			setState(2046);
			table_name();
			setState(2047);
			match(T_OPEN_P);
			setState(2048);
			create_index_col();
			setState(2053);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2049);
				match(T_COMMA);
				setState(2050);
				create_index_col();
				}
				}
				setState(2055);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2056);
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
		enterRule(_localctx, 250, RULE_create_index_col);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2058);
			ident();
			setState(2060);
			_la = _input.LA(1);
			if (_la==T_ASC || _la==T_DESC) {
				{
				setState(2059);
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
		enterRule(_localctx, 252, RULE_index_storage_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2062);
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
		enterRule(_localctx, 254, RULE_index_mssql_storage_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2064);
			match(T_WITH);
			setState(2065);
			match(T_OPEN_P);
			setState(2066);
			ident();
			setState(2067);
			match(T_EQUAL);
			setState(2068);
			ident();
			setState(2076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2069);
				match(T_COMMA);
				setState(2070);
				ident();
				setState(2071);
				match(T_EQUAL);
				setState(2072);
				ident();
				}
				}
				setState(2078);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2079);
			match(T_CLOSE_P);
			setState(2083);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2080);
					create_table_options_mssql_item();
					}
					}
				}
				setState(2085);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
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
		enterRule(_localctx, 256, RULE_print_stmt);
		try {
			setState(2093);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2086);
				match(T_PRINT);
				setState(2087);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2088);
				match(T_PRINT);
				setState(2089);
				match(T_OPEN_P);
				setState(2090);
				expr(0);
				setState(2091);
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

	public static class Obtain_stmtContext extends ParserRuleContext {
		public TerminalNode T_OBTAIN() { return getToken(PlsqlParser.T_OBTAIN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(PlsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PlsqlParser.T_CLOSE_P, 0); }
		public Obtain_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obtain_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).enterObtain_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlsqlListener ) ((PlsqlListener)listener).exitObtain_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlsqlVisitor ) return ((PlsqlVisitor<? extends T>)visitor).visitObtain_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Obtain_stmtContext obtain_stmt() throws RecognitionException {
		Obtain_stmtContext _localctx = new Obtain_stmtContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_obtain_stmt);
		try {
			setState(2102);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2095);
				match(T_OBTAIN);
				setState(2096);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2097);
				match(T_OBTAIN);
				setState(2098);
				match(T_OPEN_P);
				setState(2099);
				expr(0);
				setState(2100);
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
		enterRule(_localctx, 260, RULE_quit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2105);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(2104);
				match(T__3);
				}
			}

			setState(2107);
			match(T_QUIT);
			setState(2109);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(2108);
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
		enterRule(_localctx, 262, RULE_raise_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2111);
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
		enterRule(_localctx, 264, RULE_resignal_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2113);
			match(T_RESIGNAL);
			setState(2125);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(2114);
				match(T_SQLSTATE);
				setState(2116);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(2115);
					match(T_VALUE);
					}
					break;
				}
				setState(2118);
				expr(0);
				setState(2123);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(2119);
					match(T_SET);
					setState(2120);
					match(T_MESSAGE_TEXT);
					setState(2121);
					match(T_EQUAL);
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
		enterRule(_localctx, 266, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2127);
			match(T_RETURN);
			setState(2129);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(2128);
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
		enterRule(_localctx, 268, RULE_rollback_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2131);
			match(T_ROLLBACK);
			setState(2133);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(2132);
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
		enterRule(_localctx, 270, RULE_set_session_option);
		try {
			setState(2138);
			switch (_input.LA(1)) {
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_SCHEMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(2135);
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
				setState(2136);
				set_mssql_session_option();
				}
				break;
			case T_QUERY_BAND:
				enterOuterAlt(_localctx, 3);
				{
				setState(2137);
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
		enterRule(_localctx, 272, RULE_set_current_schema_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2145);
			switch (_input.LA(1)) {
			case T_CURRENT:
			case T_SCHEMA:
				{
				{
				setState(2141);
				_la = _input.LA(1);
				if (_la==T_CURRENT) {
					{
					setState(2140);
					match(T_CURRENT);
					}
				}

				setState(2143);
				match(T_SCHEMA);
				}
				}
				break;
			case T_CURRENT_SCHEMA:
				{
				setState(2144);
				match(T_CURRENT_SCHEMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2148);
			_la = _input.LA(1);
			if (_la==T_EQUAL) {
				{
				setState(2147);
				match(T_EQUAL);
				}
			}

			setState(2150);
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
		enterRule(_localctx, 274, RULE_set_mssql_session_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2152);
			_la = _input.LA(1);
			if ( !(_la==T_ANSI_NULLS || _la==T_ANSI_PADDING || _la==T_NOCOUNT || _la==T_QUOTED_IDENTIFIER || _la==T_XACT_ABORT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(2153);
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
		enterRule(_localctx, 276, RULE_set_teradata_session_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2155);
			match(T_QUERY_BAND);
			setState(2156);
			match(T_EQUAL);
			setState(2159);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(2157);
				expr(0);
				}
				break;
			case 2:
				{
				setState(2158);
				match(T_NONE);
				}
				break;
			}
			setState(2162);
			_la = _input.LA(1);
			if (_la==T_UPDATE) {
				{
				setState(2161);
				match(T_UPDATE);
				}
			}

			setState(2164);
			match(T_FOR);
			setState(2165);
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
		enterRule(_localctx, 278, RULE_signal_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2167);
			match(T_SIGNAL);
			setState(2168);
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
		enterRule(_localctx, 280, RULE_summary_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2170);
			match(T_SUMMARY);
			setState(2173);
			_la = _input.LA(1);
			if (_la==T_TOP) {
				{
				setState(2171);
				match(T_TOP);
				setState(2172);
				expr(0);
				}
			}

			setState(2175);
			match(T_FOR);
			setState(2185);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(2176);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(2177);
				table_name();
				setState(2179);
				switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
				case 1:
					{
					setState(2178);
					where_clause();
					}
					break;
				}
				setState(2183);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(2181);
					match(T_LIMIT);
					setState(2182);
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
		enterRule(_localctx, 282, RULE_truncate_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2187);
			match(T_TRUNCATE);
			setState(2189);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(2188);
				match(T_TABLE);
				}
				break;
			}
			setState(2191);
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
		enterRule(_localctx, 284, RULE_use_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2193);
			match(T_USE);
			setState(2194);
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
		enterRule(_localctx, 286, RULE_values_into_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2196);
			match(T_VALUES);
			setState(2198);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(2197);
				match(T_OPEN_P);
				}
				break;
			}
			setState(2200);
			expr(0);
			setState(2205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2201);
				match(T_COMMA);
				setState(2202);
				expr(0);
				}
				}
				setState(2207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2209);
			_la = _input.LA(1);
			if (_la==T_CLOSE_P) {
				{
				setState(2208);
				match(T_CLOSE_P);
				}
			}

			setState(2211);
			match(T_INTO);
			setState(2213);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(2212);
				match(T_OPEN_P);
				}
			}

			setState(2215);
			ident();
			setState(2220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2216);
					match(T_COMMA);
					setState(2217);
					ident();
					}
					}
				}
				setState(2222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			}
			setState(2224);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				{
				setState(2223);
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
		enterRule(_localctx, 288, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2226);
			match(T_WHILE);
			setState(2227);
			bool_expr(0);
			setState(2228);
			_la = _input.LA(1);
			if ( !(_la==T_BEGIN || _la==T_DO || _la==T_LOOP || _la==T_THEN) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(2229);
			block();
			setState(2230);
			match(T_END);
			setState(2232);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(2231);
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
		enterRule(_localctx, 290, RULE_for_cursor_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2234);
			match(T_FOR);
			setState(2235);
			match(L_ID);
			setState(2236);
			match(T_IN);
			setState(2238);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(2237);
				match(T_OPEN_P);
				}
				break;
			}
			setState(2240);
			select_stmt();
			setState(2242);
			_la = _input.LA(1);
			if (_la==T_CLOSE_P) {
				{
				setState(2241);
				match(T_CLOSE_P);
				}
			}

			setState(2244);
			match(T_LOOP);
			setState(2245);
			block();
			setState(2246);
			match(T_END);
			setState(2247);
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
		enterRule(_localctx, 292, RULE_for_range_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2249);
			match(T_FOR);
			setState(2250);
			match(L_ID);
			setState(2251);
			match(T_IN);
			setState(2253);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				{
				setState(2252);
				match(T_REVERSE);
				}
				break;
			}
			setState(2255);
			expr(0);
			setState(2256);
			match(T_DOT2);
			setState(2257);
			expr(0);
			setState(2260);
			_la = _input.LA(1);
			if (_la==T_BY || _la==T_STEP) {
				{
				setState(2258);
				_la = _input.LA(1);
				if ( !(_la==T_BY || _la==T_STEP) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2259);
				expr(0);
				}
			}

			setState(2262);
			match(T_LOOP);
			setState(2263);
			block();
			setState(2264);
			match(T_END);
			setState(2265);
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
		enterRule(_localctx, 294, RULE_label);
		try {
			setState(2273);
			switch (_input.LA(1)) {
			case L_LABEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2267);
				match(L_LABEL);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(2268);
				match(T_LESS);
				setState(2269);
				match(T_LESS);
				setState(2270);
				match(L_ID);
				setState(2271);
				match(T_GREATER);
				setState(2272);
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
		enterRule(_localctx, 296, RULE_using_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2275);
			match(T_USING);
			setState(2276);
			expr(0);
			setState(2281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2277);
					match(T_COMMA);
					setState(2278);
					expr(0);
					}
					}
				}
				setState(2283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
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
		enterRule(_localctx, 298, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2285);
			_la = _input.LA(1);
			if (_la==T_WITH) {
				{
				setState(2284);
				cte_select_stmt();
				}
			}

			setState(2287);
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
		enterRule(_localctx, 300, RULE_cte_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2289);
			match(T_WITH);
			setState(2290);
			cte_select_stmt_item();
			setState(2295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2291);
				match(T_COMMA);
				setState(2292);
				cte_select_stmt_item();
				}
				}
				setState(2297);
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
		enterRule(_localctx, 302, RULE_cte_select_stmt_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2298);
			ident();
			setState(2300);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(2299);
				cte_select_cols();
				}
			}

			setState(2302);
			match(T_AS);
			setState(2303);
			match(T_OPEN_P);
			setState(2304);
			fullselect_stmt();
			setState(2305);
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
		enterRule(_localctx, 304, RULE_cte_select_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2307);
			match(T_OPEN_P);
			setState(2308);
			ident();
			setState(2313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2309);
				match(T_COMMA);
				setState(2310);
				ident();
				}
				}
				setState(2315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2316);
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
		enterRule(_localctx, 306, RULE_fullselect_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2318);
			fullselect_stmt_item();
			setState(2324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2319);
					fullselect_set_clause();
					setState(2320);
					fullselect_stmt_item();
					}
					}
				}
				setState(2326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
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
		enterRule(_localctx, 308, RULE_fullselect_stmt_item);
		try {
			setState(2332);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2327);
				subselect_stmt();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(2328);
				match(T_OPEN_P);
				setState(2329);
				fullselect_stmt();
				setState(2330);
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
		enterRule(_localctx, 310, RULE_fullselect_set_clause);
		int _la;
		try {
			setState(2346);
			switch (_input.LA(1)) {
			case T_UNION:
				enterOuterAlt(_localctx, 1);
				{
				setState(2334);
				match(T_UNION);
				setState(2336);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(2335);
					match(T_ALL);
					}
				}

				}
				break;
			case T_EXCEPT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2338);
				match(T_EXCEPT);
				setState(2340);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(2339);
					match(T_ALL);
					}
				}

				}
				break;
			case T_INTERSECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2342);
				match(T_INTERSECT);
				setState(2344);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(2343);
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
		enterRule(_localctx, 312, RULE_subselect_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2348);
			_la = _input.LA(1);
			if ( !(_la==T_SEL || _la==T_SELECT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(2349);
			select_list();
			setState(2351);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				{
				setState(2350);
				into_clause();
				}
				break;
			}
			setState(2354);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(2353);
				from_clause();
				}
				break;
			}
			setState(2357);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				{
				setState(2356);
				where_clause();
				}
				break;
			}
			setState(2360);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				{
				setState(2359);
				group_by_clause();
				}
				break;
			}
			setState(2364);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				{
				setState(2362);
				having_clause();
				}
				break;
			case 2:
				{
				setState(2363);
				qualify_clause();
				}
				break;
			}
			setState(2367);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				{
				setState(2366);
				order_by_clause();
				}
				break;
			}
			setState(2370);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				{
				setState(2369);
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
		enterRule(_localctx, 314, RULE_select_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2373);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				{
				setState(2372);
				select_list_set();
				}
				break;
			}
			setState(2376);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				{
				setState(2375);
				select_list_limit();
				}
				break;
			}
			setState(2378);
			select_list_item();
			setState(2383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2379);
					match(T_COMMA);
					setState(2380);
					select_list_item();
					}
					}
				}
				setState(2385);
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
		enterRule(_localctx, 316, RULE_select_list_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2386);
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
		enterRule(_localctx, 318, RULE_select_list_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2388);
			match(T_TOP);
			setState(2389);
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
		enterRule(_localctx, 320, RULE_select_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2401);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(2394);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(2391);
					ident();
					setState(2392);
					match(T_EQUAL);
					}
					break;
				}
				setState(2396);
				expr(0);
				setState(2398);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(2397);
					select_list_alias();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(2400);
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
		enterRule(_localctx, 322, RULE_select_list_alias);
		try {
			setState(2412);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2403);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\") && !_input.LT(1).getText().equalsIgnoreCase(\"FROM\")");
				setState(2405);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2404);
					match(T_AS);
					}
					break;
				}
				setState(2407);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2408);
				match(T_OPEN_P);
				setState(2409);
				match(T_TITLE);
				setState(2410);
				match(L_S_STRING);
				setState(2411);
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
		enterRule(_localctx, 324, RULE_select_list_asterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2416);
			_la = _input.LA(1);
			if (_la==L_ID) {
				{
				setState(2414);
				match(L_ID);
				setState(2415);
				match(T__3);
				}
			}

			setState(2418);
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
		enterRule(_localctx, 326, RULE_into_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2420);
			match(T_INTO);
			setState(2421);
			ident();
			setState(2426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2422);
					match(T_COMMA);
					setState(2423);
					ident();
					}
					}
				}
				setState(2428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
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
		enterRule(_localctx, 328, RULE_from_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2429);
			match(T_FROM);
			setState(2430);
			from_table_clause();
			setState(2434);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2431);
					from_join_clause();
					}
					}
				}
				setState(2436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
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
		enterRule(_localctx, 330, RULE_from_table_clause);
		try {
			setState(2440);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2437);
				from_table_name_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2438);
				from_subselect_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2439);
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
		enterRule(_localctx, 332, RULE_from_table_name_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2442);
			table_name();
			setState(2444);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				{
				setState(2443);
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
		enterRule(_localctx, 334, RULE_from_subselect_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2446);
			match(T_OPEN_P);
			setState(2447);
			select_stmt();
			setState(2448);
			match(T_CLOSE_P);
			setState(2450);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				{
				setState(2449);
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
		enterRule(_localctx, 336, RULE_from_join_clause);
		try {
			setState(2459);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(2452);
				match(T_COMMA);
				setState(2453);
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
				setState(2454);
				from_join_type_clause();
				setState(2455);
				from_table_clause();
				setState(2456);
				match(T_ON);
				setState(2457);
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
		enterRule(_localctx, 338, RULE_from_join_type_clause);
		int _la;
		try {
			setState(2470);
			switch (_input.LA(1)) {
			case T_INNER:
			case T_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2462);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(2461);
					match(T_INNER);
					}
				}

				setState(2464);
				match(T_JOIN);
				}
				break;
			case T_FULL:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2465);
				_la = _input.LA(1);
				if ( !(_la==T_FULL || _la==T_LEFT || _la==T_RIGHT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2467);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(2466);
					match(T_OUTER);
					}
				}

				setState(2469);
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
		enterRule(_localctx, 340, RULE_from_table_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2472);
			match(T_TABLE);
			setState(2473);
			match(T_OPEN_P);
			setState(2474);
			match(T_VALUES);
			setState(2475);
			from_table_values_row();
			setState(2480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2476);
				match(T_COMMA);
				setState(2477);
				from_table_values_row();
				}
				}
				setState(2482);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2483);
			match(T_CLOSE_P);
			setState(2485);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				{
				setState(2484);
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
		enterRule(_localctx, 342, RULE_from_table_values_row);
		int _la;
		try {
			setState(2499);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2487);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2488);
				match(T_OPEN_P);
				setState(2489);
				expr(0);
				setState(2494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2490);
					match(T_COMMA);
					setState(2491);
					expr(0);
					}
					}
					setState(2496);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2497);
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
		enterRule(_localctx, 344, RULE_from_alias_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2501);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
			        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
			        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
			        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("WITH"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"EXEC\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"EXECUTE\") && \r\n        !_input.LT(1).getText().equalsIgnoreCase(\"INNER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LEFT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"GROUP\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"ORDER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LIMIT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"WITH\")");
			setState(2503);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				{
				setState(2502);
				match(T_AS);
				}
				break;
			}
			setState(2505);
			ident();
			setState(2516);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				{
				setState(2506);
				match(T_OPEN_P);
				setState(2507);
				match(L_ID);
				setState(2512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2508);
					match(T_COMMA);
					setState(2509);
					match(L_ID);
					}
					}
					setState(2514);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2515);
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
		enterRule(_localctx, 346, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2518);
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
		enterRule(_localctx, 348, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2520);
			match(T_WHERE);
			setState(2521);
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
		enterRule(_localctx, 350, RULE_group_by_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2523);
			match(T_GROUP);
			setState(2524);
			match(T_BY);
			setState(2525);
			expr(0);
			setState(2530);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2526);
					match(T_COMMA);
					setState(2527);
					expr(0);
					}
					}
				}
				setState(2532);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
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
		enterRule(_localctx, 352, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2533);
			match(T_HAVING);
			setState(2534);
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
		enterRule(_localctx, 354, RULE_qualify_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2536);
			match(T_QUALIFY);
			setState(2537);
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
		enterRule(_localctx, 356, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2539);
			match(T_ORDER);
			setState(2540);
			match(T_BY);
			setState(2541);
			expr(0);
			setState(2543);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				{
				setState(2542);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(2552);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2545);
					match(T_COMMA);
					setState(2546);
					expr(0);
					setState(2548);
					switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
					case 1:
						{
						setState(2547);
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
				setState(2554);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
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
		enterRule(_localctx, 358, RULE_select_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2556);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2555);
					select_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2558);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
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
		enterRule(_localctx, 360, RULE_select_options_item);
		int _la;
		try {
			setState(2571);
			switch (_input.LA(1)) {
			case T_LIMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2560);
				match(T_LIMIT);
				setState(2561);
				expr(0);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(2562);
				match(T_WITH);
				setState(2563);
				_la = _input.LA(1);
				if ( !(_la==T_CS || ((((_la - 246)) & ~0x3f) == 0 && ((1L << (_la - 246)) & ((1L << (T_RR - 246)) | (1L << (T_RS - 246)) | (1L << (T_UR - 246)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2569);
				switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
				case 1:
					{
					setState(2564);
					match(T_USE);
					setState(2565);
					match(T_AND);
					setState(2566);
					match(T_KEEP);
					setState(2567);
					_la = _input.LA(1);
					if ( !(_la==T_EXCLUSIVE || _la==T_SHARE || _la==T_UPDATE) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(2568);
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
		enterRule(_localctx, 362, RULE_update_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2573);
			match(T_UPDATE);
			setState(2574);
			update_table();
			setState(2575);
			match(T_SET);
			setState(2576);
			update_assignment();
			setState(2578);
			switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
			case 1:
				{
				setState(2577);
				where_clause();
				}
				break;
			}
			setState(2581);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				{
				setState(2580);
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
		enterRule(_localctx, 364, RULE_update_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2583);
			assignment_stmt_item();
			setState(2588);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2584);
					match(T_COMMA);
					setState(2585);
					assignment_stmt_item();
					}
					}
				}
				setState(2590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
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
		enterRule(_localctx, 366, RULE_update_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2599);
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
			case T_OBTAIN:
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
			case T_CHECK:
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
				setState(2591);
				table_name();
				setState(2593);
				switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
				case 1:
					{
					setState(2592);
					from_clause();
					}
					break;
				}
				}
				break;
			case T_OPEN_P:
				{
				setState(2595);
				match(T_OPEN_P);
				setState(2596);
				select_stmt();
				setState(2597);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2605);
			switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
			case 1:
				{
				setState(2602);
				switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
				case 1:
					{
					setState(2601);
					match(T_AS);
					}
					break;
				}
				setState(2604);
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
		enterRule(_localctx, 368, RULE_update_upsert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2607);
			match(T_ELSE);
			setState(2608);
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
		enterRule(_localctx, 370, RULE_merge_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2610);
			match(T_MERGE);
			setState(2611);
			match(T_INTO);
			setState(2612);
			merge_table();
			setState(2613);
			match(T_USING);
			setState(2614);
			merge_table();
			setState(2615);
			match(T_ON);
			setState(2616);
			bool_expr(0);
			setState(2618);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2617);
					merge_condition();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2620);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,324,_ctx);
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
		enterRule(_localctx, 372, RULE_merge_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2627);
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
			case T_OBTAIN:
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
			case T_CHECK:
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
				setState(2622);
				table_name();
				}
				break;
			case T_OPEN_P:
				{
				{
				setState(2623);
				match(T_OPEN_P);
				setState(2624);
				select_stmt();
				setState(2625);
				match(T_CLOSE_P);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2633);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				{
				setState(2630);
				switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
				case 1:
					{
					setState(2629);
					match(T_AS);
					}
					break;
				}
				setState(2632);
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
		enterRule(_localctx, 374, RULE_merge_condition);
		int _la;
		try {
			setState(2648);
			switch (_input.LA(1)) {
			case T_WHEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2635);
				match(T_WHEN);
				setState(2637);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2636);
					match(T_NOT);
					}
				}

				setState(2639);
				match(T_MATCHED);
				setState(2642);
				_la = _input.LA(1);
				if (_la==T_AND) {
					{
					setState(2640);
					match(T_AND);
					setState(2641);
					bool_expr(0);
					}
				}

				setState(2644);
				match(T_THEN);
				setState(2645);
				merge_action();
				}
				break;
			case T_ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2646);
				match(T_ELSE);
				setState(2647);
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
		enterRule(_localctx, 376, RULE_merge_action);
		int _la;
		try {
			int _alt;
			setState(2670);
			switch (_input.LA(1)) {
			case T_INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2650);
				match(T_INSERT);
				setState(2652);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(2651);
					insert_stmt_cols();
					}
				}

				setState(2654);
				match(T_VALUES);
				setState(2655);
				insert_stmt_row();
				}
				break;
			case T_UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2656);
				match(T_UPDATE);
				setState(2657);
				match(T_SET);
				setState(2658);
				assignment_stmt_item();
				setState(2663);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,332,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2659);
						match(T_COMMA);
						setState(2660);
						assignment_stmt_item();
						}
						}
					}
					setState(2665);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,332,_ctx);
				}
				setState(2667);
				switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
				case 1:
					{
					setState(2666);
					where_clause();
					}
					break;
				}
				}
				break;
			case T_DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2669);
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
		enterRule(_localctx, 378, RULE_delete_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2672);
			match(T_DELETE);
			setState(2674);
			switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
			case 1:
				{
				setState(2673);
				match(T_FROM);
				}
				break;
			}
			setState(2676);
			table_name();
			setState(2678);
			switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
			case 1:
				{
				setState(2677);
				delete_alias();
				}
				break;
			}
			setState(2682);
			switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
			case 1:
				{
				setState(2680);
				where_clause();
				}
				break;
			case 2:
				{
				setState(2681);
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
		enterRule(_localctx, 380, RULE_delete_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2684);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("ALL"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"ALL\")");
			setState(2686);
			switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
			case 1:
				{
				setState(2685);
				match(T_AS);
				}
				break;
			}
			setState(2688);
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
		enterRule(_localctx, 382, RULE_describe_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2690);
			_la = _input.LA(1);
			if ( !(_la==T_DESC || _la==T_DESCRIBE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(2692);
			switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
			case 1:
				{
				setState(2691);
				match(T_TABLE);
				}
				break;
			}
			setState(2694);
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
		int _startState = 384;
		enterRecursionRule(_localctx, 384, RULE_bool_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2705);
			switch ( getInterpreter().adaptivePredict(_input,341,_ctx) ) {
			case 1:
				{
				setState(2698);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2697);
					match(T_NOT);
					}
				}

				setState(2700);
				match(T_OPEN_P);
				setState(2701);
				bool_expr(0);
				setState(2702);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(2704);
				bool_expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2713);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,342,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(2707);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(2708);
					bool_expr_logical_operator();
					setState(2709);
					bool_expr(3);
					}
					}
				}
				setState(2715);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,342,_ctx);
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
		enterRule(_localctx, 386, RULE_bool_expr_atom);
		try {
			setState(2719);
			switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2716);
				bool_expr_unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2717);
				bool_expr_binary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2718);
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
		enterRule(_localctx, 388, RULE_bool_expr_unary);
		int _la;
		try {
			setState(2744);
			switch ( getInterpreter().adaptivePredict(_input,346,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2721);
				expr(0);
				setState(2722);
				match(T_IS);
				setState(2724);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2723);
					match(T_NOT);
					}
				}

				setState(2726);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2728);
				expr(0);
				setState(2729);
				match(T_BETWEEN);
				setState(2730);
				expr(0);
				setState(2731);
				match(T_AND);
				setState(2732);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2735);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2734);
					match(T_NOT);
					}
				}

				setState(2737);
				match(T_EXISTS);
				setState(2738);
				match(T_OPEN_P);
				setState(2739);
				select_stmt();
				setState(2740);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2742);
				bool_expr_single_in();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2743);
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
		enterRule(_localctx, 390, RULE_bool_expr_single_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2746);
			expr(0);
			setState(2748);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(2747);
				match(T_NOT);
				}
			}

			setState(2750);
			match(T_IN);
			setState(2751);
			match(T_OPEN_P);
			setState(2761);
			switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
			case 1:
				{
				{
				setState(2752);
				expr(0);
				setState(2757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2753);
					match(T_COMMA);
					setState(2754);
					expr(0);
					}
					}
					setState(2759);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(2760);
				select_stmt();
				}
				break;
			}
			setState(2763);
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
		enterRule(_localctx, 392, RULE_bool_expr_multi_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2765);
			match(T_OPEN_P);
			setState(2766);
			expr(0);
			setState(2771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2767);
				match(T_COMMA);
				setState(2768);
				expr(0);
				}
				}
				setState(2773);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2774);
			match(T_CLOSE_P);
			setState(2776);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(2775);
				match(T_NOT);
				}
			}

			setState(2778);
			match(T_IN);
			setState(2779);
			match(T_OPEN_P);
			setState(2780);
			select_stmt();
			setState(2781);
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
		enterRule(_localctx, 394, RULE_bool_expr_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2783);
			expr(0);
			setState(2784);
			bool_expr_binary_operator();
			setState(2785);
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
		enterRule(_localctx, 396, RULE_bool_expr_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2787);
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
		enterRule(_localctx, 398, RULE_bool_expr_binary_operator);
		int _la;
		try {
			setState(2801);
			switch (_input.LA(1)) {
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2789);
				match(T_EQUAL);
				}
				break;
			case T_EQUAL2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2790);
				match(T_EQUAL2);
				}
				break;
			case T_NOTEQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2791);
				match(T_NOTEQUAL);
				}
				break;
			case T_NOTEQUAL2:
				enterOuterAlt(_localctx, 4);
				{
				setState(2792);
				match(T_NOTEQUAL2);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 5);
				{
				setState(2793);
				match(T_LESS);
				}
				break;
			case T_LESSEQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(2794);
				match(T_LESSEQUAL);
				}
				break;
			case T_GREATER:
				enterOuterAlt(_localctx, 7);
				{
				setState(2795);
				match(T_GREATER);
				}
				break;
			case T_GREATEREQUAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2796);
				match(T_GREATEREQUAL);
				}
				break;
			case T_LIKE:
			case T_NOT:
			case T_REGEXP:
			case T_RLIKE:
				enterOuterAlt(_localctx, 9);
				{
				setState(2798);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2797);
					match(T_NOT);
					}
				}

				setState(2800);
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
		int _startState = 400;
		enterRecursionRule(_localctx, 400, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2820);
			switch ( getInterpreter().adaptivePredict(_input,354,_ctx) ) {
			case 1:
				{
				setState(2804);
				match(T_OPEN_P);
				setState(2805);
				select_stmt();
				setState(2806);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(2808);
				match(T_OPEN_P);
				setState(2809);
				expr(0);
				setState(2810);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				{
				setState(2812);
				expr_interval();
				}
				break;
			case 4:
				{
				setState(2813);
				expr_concat();
				}
				break;
			case 5:
				{
				setState(2814);
				expr_case();
				}
				break;
			case 6:
				{
				setState(2815);
				expr_cursor_attribute();
				}
				break;
			case 7:
				{
				setState(2816);
				expr_agg_window_func();
				}
				break;
			case 8:
				{
				setState(2817);
				expr_spec_func();
				}
				break;
			case 9:
				{
				setState(2818);
				expr_func();
				}
				break;
			case 10:
				{
				setState(2819);
				expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2838);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,356,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2836);
					switch ( getInterpreter().adaptivePredict(_input,355,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2822);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2823);
						match(T_MUL);
						setState(2824);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2825);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2826);
						match(T_DIV);
						setState(2827);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2828);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2829);
						match(T_ADD);
						setState(2830);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2831);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2832);
						match(T_SUB);
						setState(2833);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2834);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2835);
						interval_item();
						}
						break;
					}
					}
				}
				setState(2840);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,356,_ctx);
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
		enterRule(_localctx, 402, RULE_expr_atom);
		try {
			setState(2849);
			switch ( getInterpreter().adaptivePredict(_input,357,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2841);
				date_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2842);
				timestamp_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2843);
				bool_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2844);
				ident();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2845);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2846);
				dec_number();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2847);
				int_number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2848);
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
		enterRule(_localctx, 404, RULE_expr_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2851);
			match(T_INTERVAL);
			setState(2852);
			expr(0);
			setState(2853);
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
		enterRule(_localctx, 406, RULE_interval_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2855);
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
		enterRule(_localctx, 408, RULE_expr_concat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2857);
			expr_concat_item();
			setState(2858);
			_la = _input.LA(1);
			if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(2859);
			expr_concat_item();
			setState(2864);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,358,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2860);
					_la = _input.LA(1);
					if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(2861);
					expr_concat_item();
					}
					}
				}
				setState(2866);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,358,_ctx);
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
		enterRule(_localctx, 410, RULE_expr_concat_item);
		try {
			setState(2876);
			switch ( getInterpreter().adaptivePredict(_input,359,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2867);
				match(T_OPEN_P);
				setState(2868);
				expr(0);
				setState(2869);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2871);
				expr_case();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2872);
				expr_agg_window_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2873);
				expr_spec_func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2874);
				expr_func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2875);
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
		enterRule(_localctx, 412, RULE_expr_case);
		try {
			setState(2880);
			switch ( getInterpreter().adaptivePredict(_input,360,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2878);
				expr_case_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2879);
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
		enterRule(_localctx, 414, RULE_expr_case_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2882);
			match(T_CASE);
			setState(2883);
			expr(0);
			setState(2889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2884);
				match(T_WHEN);
				setState(2885);
				expr(0);
				setState(2886);
				match(T_THEN);
				setState(2887);
				expr(0);
				}
				}
				setState(2891);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2895);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2893);
				match(T_ELSE);
				setState(2894);
				expr(0);
				}
			}

			setState(2897);
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
		enterRule(_localctx, 416, RULE_expr_case_searched);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2899);
			match(T_CASE);
			setState(2905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2900);
				match(T_WHEN);
				setState(2901);
				bool_expr(0);
				setState(2902);
				match(T_THEN);
				setState(2903);
				expr(0);
				}
				}
				setState(2907);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2911);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2909);
				match(T_ELSE);
				setState(2910);
				expr(0);
				}
			}

			setState(2913);
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
		enterRule(_localctx, 418, RULE_expr_cursor_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2915);
			ident();
			setState(2916);
			match(T__2);
			setState(2917);
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
		enterRule(_localctx, 420, RULE_expr_agg_window_func);
		int _la;
		try {
			setState(3071);
			switch (_input.LA(1)) {
			case T_AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(2919);
				match(T_AVG);
				setState(2920);
				match(T_OPEN_P);
				setState(2922);
				switch ( getInterpreter().adaptivePredict(_input,365,_ctx) ) {
				case 1:
					{
					setState(2921);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2924);
				expr(0);
				setState(2925);
				match(T_CLOSE_P);
				setState(2927);
				switch ( getInterpreter().adaptivePredict(_input,366,_ctx) ) {
				case 1:
					{
					setState(2926);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2929);
				match(T_COUNT);
				setState(2930);
				match(T_OPEN_P);
				setState(2936);
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
				case T_OBTAIN:
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
				case T_CHECK:
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
					setState(2932);
					switch ( getInterpreter().adaptivePredict(_input,367,_ctx) ) {
					case 1:
						{
						setState(2931);
						expr_func_all_distinct();
						}
						break;
					}
					setState(2934);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2935);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2938);
				match(T_CLOSE_P);
				setState(2940);
				switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
				case 1:
					{
					setState(2939);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT_BIG:
				enterOuterAlt(_localctx, 3);
				{
				setState(2942);
				match(T_COUNT_BIG);
				setState(2943);
				match(T_OPEN_P);
				setState(2949);
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
				case T_OBTAIN:
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
				case T_CHECK:
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
					setState(2945);
					switch ( getInterpreter().adaptivePredict(_input,370,_ctx) ) {
					case 1:
						{
						setState(2944);
						expr_func_all_distinct();
						}
						break;
					}
					setState(2947);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2948);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2951);
				match(T_CLOSE_P);
				setState(2953);
				switch ( getInterpreter().adaptivePredict(_input,372,_ctx) ) {
				case 1:
					{
					setState(2952);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_CUME_DIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(2955);
				match(T_CUME_DIST);
				setState(2956);
				match(T_OPEN_P);
				setState(2957);
				match(T_CLOSE_P);
				setState(2958);
				expr_func_over_clause();
				}
				break;
			case T_DENSE_RANK:
				enterOuterAlt(_localctx, 5);
				{
				setState(2959);
				match(T_DENSE_RANK);
				setState(2960);
				match(T_OPEN_P);
				setState(2961);
				match(T_CLOSE_P);
				setState(2962);
				expr_func_over_clause();
				}
				break;
			case T_FIRST_VALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2963);
				match(T_FIRST_VALUE);
				setState(2964);
				match(T_OPEN_P);
				setState(2965);
				expr(0);
				setState(2966);
				match(T_CLOSE_P);
				setState(2967);
				expr_func_over_clause();
				}
				break;
			case T_LAG:
				enterOuterAlt(_localctx, 7);
				{
				setState(2969);
				match(T_LAG);
				setState(2970);
				match(T_OPEN_P);
				setState(2971);
				expr(0);
				setState(2978);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2972);
					match(T_COMMA);
					setState(2973);
					expr(0);
					setState(2976);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2974);
						match(T_COMMA);
						setState(2975);
						expr(0);
						}
					}

					}
				}

				setState(2980);
				match(T_CLOSE_P);
				setState(2981);
				expr_func_over_clause();
				}
				break;
			case T_LAST_VALUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2983);
				match(T_LAST_VALUE);
				setState(2984);
				match(T_OPEN_P);
				setState(2985);
				expr(0);
				setState(2986);
				match(T_CLOSE_P);
				setState(2987);
				expr_func_over_clause();
				}
				break;
			case T_LEAD:
				enterOuterAlt(_localctx, 9);
				{
				setState(2989);
				match(T_LEAD);
				setState(2990);
				match(T_OPEN_P);
				setState(2991);
				expr(0);
				setState(2998);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2992);
					match(T_COMMA);
					setState(2993);
					expr(0);
					setState(2996);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2994);
						match(T_COMMA);
						setState(2995);
						expr(0);
						}
					}

					}
				}

				setState(3000);
				match(T_CLOSE_P);
				setState(3001);
				expr_func_over_clause();
				}
				break;
			case T_MAX:
				enterOuterAlt(_localctx, 10);
				{
				setState(3003);
				match(T_MAX);
				setState(3004);
				match(T_OPEN_P);
				setState(3006);
				switch ( getInterpreter().adaptivePredict(_input,377,_ctx) ) {
				case 1:
					{
					setState(3005);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3008);
				expr(0);
				setState(3009);
				match(T_CLOSE_P);
				setState(3011);
				switch ( getInterpreter().adaptivePredict(_input,378,_ctx) ) {
				case 1:
					{
					setState(3010);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_MIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(3013);
				match(T_MIN);
				setState(3014);
				match(T_OPEN_P);
				setState(3016);
				switch ( getInterpreter().adaptivePredict(_input,379,_ctx) ) {
				case 1:
					{
					setState(3015);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3018);
				expr(0);
				setState(3019);
				match(T_CLOSE_P);
				setState(3021);
				switch ( getInterpreter().adaptivePredict(_input,380,_ctx) ) {
				case 1:
					{
					setState(3020);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_RANK:
				enterOuterAlt(_localctx, 12);
				{
				setState(3023);
				match(T_RANK);
				setState(3024);
				match(T_OPEN_P);
				setState(3025);
				match(T_CLOSE_P);
				setState(3026);
				expr_func_over_clause();
				}
				break;
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 13);
				{
				setState(3027);
				match(T_ROW_NUMBER);
				setState(3028);
				match(T_OPEN_P);
				setState(3029);
				match(T_CLOSE_P);
				setState(3030);
				expr_func_over_clause();
				}
				break;
			case T_STDEV:
				enterOuterAlt(_localctx, 14);
				{
				setState(3031);
				match(T_STDEV);
				setState(3032);
				match(T_OPEN_P);
				setState(3034);
				switch ( getInterpreter().adaptivePredict(_input,381,_ctx) ) {
				case 1:
					{
					setState(3033);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3036);
				expr(0);
				setState(3037);
				match(T_CLOSE_P);
				setState(3039);
				switch ( getInterpreter().adaptivePredict(_input,382,_ctx) ) {
				case 1:
					{
					setState(3038);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_SUM:
				enterOuterAlt(_localctx, 15);
				{
				setState(3041);
				match(T_SUM);
				setState(3042);
				match(T_OPEN_P);
				setState(3044);
				switch ( getInterpreter().adaptivePredict(_input,383,_ctx) ) {
				case 1:
					{
					setState(3043);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3046);
				expr(0);
				setState(3047);
				match(T_CLOSE_P);
				setState(3049);
				switch ( getInterpreter().adaptivePredict(_input,384,_ctx) ) {
				case 1:
					{
					setState(3048);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(3051);
				match(T_VAR);
				setState(3052);
				match(T_OPEN_P);
				setState(3054);
				switch ( getInterpreter().adaptivePredict(_input,385,_ctx) ) {
				case 1:
					{
					setState(3053);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3056);
				expr(0);
				setState(3057);
				match(T_CLOSE_P);
				setState(3059);
				switch ( getInterpreter().adaptivePredict(_input,386,_ctx) ) {
				case 1:
					{
					setState(3058);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VARIANCE:
				enterOuterAlt(_localctx, 17);
				{
				setState(3061);
				match(T_VARIANCE);
				setState(3062);
				match(T_OPEN_P);
				setState(3064);
				switch ( getInterpreter().adaptivePredict(_input,387,_ctx) ) {
				case 1:
					{
					setState(3063);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3066);
				expr(0);
				setState(3067);
				match(T_CLOSE_P);
				setState(3069);
				switch ( getInterpreter().adaptivePredict(_input,388,_ctx) ) {
				case 1:
					{
					setState(3068);
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
		enterRule(_localctx, 422, RULE_expr_func_all_distinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3073);
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
		enterRule(_localctx, 424, RULE_expr_func_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3075);
			match(T_OVER);
			setState(3076);
			match(T_OPEN_P);
			setState(3078);
			_la = _input.LA(1);
			if (_la==T_PARTITION) {
				{
				setState(3077);
				expr_func_partition_by_clause();
				}
			}

			setState(3081);
			_la = _input.LA(1);
			if (_la==T_ORDER) {
				{
				setState(3080);
				order_by_clause();
				}
			}

			setState(3083);
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
		enterRule(_localctx, 426, RULE_expr_func_partition_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3085);
			match(T_PARTITION);
			setState(3086);
			match(T_BY);
			setState(3087);
			expr(0);
			setState(3092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(3088);
				match(T_COMMA);
				setState(3089);
				expr(0);
				}
				}
				setState(3094);
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
		enterRule(_localctx, 428, RULE_expr_spec_func);
		int _la;
		try {
			int _alt;
			setState(3295);
			switch ( getInterpreter().adaptivePredict(_input,413,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3095);
				match(T_ACTIVITY_COUNT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3096);
				match(T_CAST);
				setState(3097);
				match(T_OPEN_P);
				setState(3098);
				expr(0);
				setState(3099);
				match(T_AS);
				setState(3100);
				dtype();
				setState(3102);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(3101);
					dtype_len();
					}
				}

				setState(3104);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3106);
				match(T_COUNT);
				setState(3107);
				match(T_OPEN_P);
				setState(3110);
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
				case T_OBTAIN:
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
				case T_CHECK:
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
					setState(3108);
					expr(0);
					}
					break;
				case T_MUL:
					{
					setState(3109);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3112);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3113);
				match(T_CURRENT_DATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3114);
				match(T_CURRENT);
				setState(3115);
				match(T_DATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3119);
				switch (_input.LA(1)) {
				case T_CURRENT_TIMESTAMP:
					{
					setState(3116);
					match(T_CURRENT_TIMESTAMP);
					}
					break;
				case T_CURRENT:
					{
					setState(3117);
					match(T_CURRENT);
					setState(3118);
					match(T_TIMESTAMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3125);
				switch ( getInterpreter().adaptivePredict(_input,396,_ctx) ) {
				case 1:
					{
					setState(3121);
					match(T_OPEN_P);
					setState(3122);
					expr(0);
					setState(3123);
					match(T_CLOSE_P);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3127);
				match(T_CURRENT_USER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3128);
				match(T_CURRENT);
				setState(3129);
				match(T_USER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(3130);
				match(T_MAX_PART_STRING);
				setState(3131);
				match(T_OPEN_P);
				setState(3132);
				expr(0);
				setState(3145);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3133);
					match(T_COMMA);
					setState(3134);
					expr(0);
					setState(3142);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3135);
						match(T_COMMA);
						setState(3136);
						expr(0);
						setState(3137);
						match(T_EQUAL);
						setState(3138);
						expr(0);
						}
						}
						setState(3144);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3147);
				match(T_CLOSE_P);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(3149);
				match(T_MIN_PART_STRING);
				setState(3150);
				match(T_OPEN_P);
				setState(3151);
				expr(0);
				setState(3164);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3152);
					match(T_COMMA);
					setState(3153);
					expr(0);
					setState(3161);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3154);
						match(T_COMMA);
						setState(3155);
						expr(0);
						setState(3156);
						match(T_EQUAL);
						setState(3157);
						expr(0);
						}
						}
						setState(3163);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3166);
				match(T_CLOSE_P);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(3168);
				match(T_MAX_PART_INT);
				setState(3169);
				match(T_OPEN_P);
				setState(3170);
				expr(0);
				setState(3183);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3171);
					match(T_COMMA);
					setState(3172);
					expr(0);
					setState(3180);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3173);
						match(T_COMMA);
						setState(3174);
						expr(0);
						setState(3175);
						match(T_EQUAL);
						setState(3176);
						expr(0);
						}
						}
						setState(3182);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3185);
				match(T_CLOSE_P);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(3187);
				match(T_MIN_PART_INT);
				setState(3188);
				match(T_OPEN_P);
				setState(3189);
				expr(0);
				setState(3202);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3190);
					match(T_COMMA);
					setState(3191);
					expr(0);
					setState(3199);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3192);
						match(T_COMMA);
						setState(3193);
						expr(0);
						setState(3194);
						match(T_EQUAL);
						setState(3195);
						expr(0);
						}
						}
						setState(3201);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3204);
				match(T_CLOSE_P);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(3206);
				match(T_MAX_PART_DATE);
				setState(3207);
				match(T_OPEN_P);
				setState(3208);
				expr(0);
				setState(3221);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3209);
					match(T_COMMA);
					setState(3210);
					expr(0);
					setState(3218);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3211);
						match(T_COMMA);
						setState(3212);
						expr(0);
						setState(3213);
						match(T_EQUAL);
						setState(3214);
						expr(0);
						}
						}
						setState(3220);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3223);
				match(T_CLOSE_P);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(3225);
				match(T_MIN_PART_DATE);
				setState(3226);
				match(T_OPEN_P);
				setState(3227);
				expr(0);
				setState(3240);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3228);
					match(T_COMMA);
					setState(3229);
					expr(0);
					setState(3237);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3230);
						match(T_COMMA);
						setState(3231);
						expr(0);
						setState(3232);
						match(T_EQUAL);
						setState(3233);
						expr(0);
						}
						}
						setState(3239);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3242);
				match(T_CLOSE_P);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(3244);
				match(T_PART_COUNT);
				setState(3245);
				match(T_OPEN_P);
				setState(3246);
				expr(0);
				setState(3254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(3247);
					match(T_COMMA);
					setState(3248);
					expr(0);
					setState(3249);
					match(T_EQUAL);
					setState(3250);
					expr(0);
					}
					}
					setState(3256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3257);
				match(T_CLOSE_P);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(3259);
				match(T_PART_LOC);
				setState(3260);
				match(T_OPEN_P);
				setState(3261);
				expr(0);
				setState(3267);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3262);
						match(T_COMMA);
						setState(3263);
						expr(0);
						setState(3264);
						match(T_EQUAL);
						setState(3265);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3269);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,410,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(3273);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3271);
					match(T_COMMA);
					setState(3272);
					expr(0);
					}
				}

				setState(3275);
				match(T_CLOSE_P);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(3277);
				match(T_TRIM);
				setState(3278);
				match(T_OPEN_P);
				setState(3279);
				expr(0);
				setState(3280);
				match(T_CLOSE_P);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(3282);
				match(T_SUBSTRING);
				setState(3283);
				match(T_OPEN_P);
				setState(3284);
				expr(0);
				setState(3285);
				match(T_FROM);
				setState(3286);
				expr(0);
				setState(3289);
				_la = _input.LA(1);
				if (_la==T_FOR) {
					{
					setState(3287);
					match(T_FOR);
					setState(3288);
					expr(0);
					}
				}

				setState(3291);
				match(T_CLOSE_P);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(3293);
				match(T_SYSDATE);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(3294);
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
		enterRule(_localctx, 430, RULE_expr_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3297);
			ident();
			setState(3298);
			match(T_OPEN_P);
			setState(3300);
			switch ( getInterpreter().adaptivePredict(_input,414,_ctx) ) {
			case 1:
				{
				setState(3299);
				expr_func_params();
				}
				break;
			}
			setState(3302);
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
		enterRule(_localctx, 432, RULE_expr_func_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3304);
			func_param();
			setState(3309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,415,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3305);
					match(T_COMMA);
					setState(3306);
					func_param();
					}
					}
				}
				setState(3311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,415,_ctx);
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
		enterRule(_localctx, 434, RULE_func_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3312);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\")");
			setState(3318);
			switch ( getInterpreter().adaptivePredict(_input,417,_ctx) ) {
			case 1:
				{
				setState(3313);
				ident();
				setState(3314);
				match(T_EQUAL);
				setState(3316);
				_la = _input.LA(1);
				if (_la==T_GREATER) {
					{
					setState(3315);
					match(T_GREATER);
					}
				}

				}
				break;
			}
			setState(3320);
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
		enterRule(_localctx, 436, RULE_expr_select);
		try {
			setState(3324);
			switch ( getInterpreter().adaptivePredict(_input,418,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3322);
				select_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3323);
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
		enterRule(_localctx, 438, RULE_expr_file);
		try {
			setState(3328);
			switch ( getInterpreter().adaptivePredict(_input,419,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3326);
				file_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3327);
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
		enterRule(_localctx, 440, RULE_hive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3330);
			match(T_HIVE);
			setState(3334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,420,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3331);
					hive_item();
					}
					}
				}
				setState(3336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,420,_ctx);
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
		enterRule(_localctx, 442, RULE_hive_item);
		try {
			setState(3349);
			switch ( getInterpreter().adaptivePredict(_input,421,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3337);
				match(T_SUB);
				setState(3338);
				ident();
				setState(3339);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3341);
				match(T_SUB);
				setState(3342);
				ident();
				setState(3343);
				match(L_ID);
				setState(3344);
				match(T_EQUAL);
				setState(3345);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3347);
				match(T_SUB);
				setState(3348);
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
		enterRule(_localctx, 444, RULE_host);
		try {
			setState(3356);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(3351);
				match(T__4);
				setState(3352);
				host_cmd();
				setState(3353);
				match(T_SEMICOLON);
				}
				break;
			case T_HOST:
				enterOuterAlt(_localctx, 2);
				{
				setState(3355);
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
		enterRule(_localctx, 446, RULE_host_cmd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,423,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(3358);
					matchWildcard();
					}
					}
				}
				setState(3363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,423,_ctx);
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
		enterRule(_localctx, 448, RULE_host_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3364);
			match(T_HOST);
			setState(3365);
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
		enterRule(_localctx, 450, RULE_file_name);
		try {
			int _alt;
			setState(3381);
			switch (_input.LA(1)) {
			case L_FILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3367);
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
			case T_OBTAIN:
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
			case T_CHECK:
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
				setState(3371);
				switch (_input.LA(1)) {
				case T_DIV:
					{
					setState(3368);
					match(T_DIV);
					}
					break;
				case T__3:
					{
					setState(3369);
					match(T__3);
					setState(3370);
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
				case T_OBTAIN:
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
				case T_CHECK:
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
				setState(3373);
				ident();
				setState(3378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,425,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3374);
						match(T_DIV);
						setState(3375);
						ident();
						}
						}
					}
					setState(3380);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,425,_ctx);
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
		enterRule(_localctx, 452, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3383);
			match(T_DATE);
			setState(3384);
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
		enterRule(_localctx, 454, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3386);
			match(T_TIMESTAMP);
			setState(3387);
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
		enterRule(_localctx, 456, RULE_ident);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3391);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(3389);
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
			case T_OBTAIN:
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
			case T_CHECK:
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
				setState(3390);
				non_reserved_words();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(3400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,429,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3393);
					match(T__3);
					setState(3396);
					switch (_input.LA(1)) {
					case L_ID:
						{
						setState(3394);
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
					case T_OBTAIN:
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
					case T_CHECK:
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
						setState(3395);
						non_reserved_words();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(3402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,429,_ctx);
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
		enterRule(_localctx, 458, RULE_string);
		try {
			setState(3405);
			switch (_input.LA(1)) {
			case L_S_STRING:
				_localctx = new Single_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3403);
				match(L_S_STRING);
				}
				break;
			case L_D_STRING:
				_localctx = new Double_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3404);
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
		enterRule(_localctx, 460, RULE_int_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3408);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(3407);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(3410);
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
		enterRule(_localctx, 462, RULE_dec_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3413);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(3412);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(3415);
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
		enterRule(_localctx, 464, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3417);
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
		enterRule(_localctx, 466, RULE_null_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3419);
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
		public TerminalNode T_OBTAIN() { return getToken(PlsqlParser.T_OBTAIN, 0); }
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
		public TerminalNode T_CHECK() { return getToken(PlsqlParser.T_CHECK, 0); }
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
		enterRule(_localctx, 468, RULE_non_reserved_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3421);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_OBTAIN - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SELECT - 256)) | (1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_YES - 320)) | (1L << (T_CORRECT - 320)) | (1L << (T_CHECK - 320)) | (1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)))) != 0)) ) {
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
		case 161:
			return select_list_alias_sempred((Select_list_aliasContext)_localctx, predIndex);
		case 172:
			return from_alias_clause_sempred((From_alias_clauseContext)_localctx, predIndex);
		case 190:
			return delete_alias_sempred((Delete_aliasContext)_localctx, predIndex);
		case 192:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 200:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 217:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u017d\u0d62\4\2\t"+
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
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\3\2\3\2\3\2\3\3\3\3\5\3\u01de\n\3\3\3\5\3\u01e1\n\3\6\3\u01e3\n\3\r\3"+
		"\16\3\u01e4\3\4\5\4\u01e8\n\4\3\4\3\4\3\4\5\4\u01ed\n\4\3\4\3\4\3\5\3"+
		"\5\3\5\5\5\u01f4\n\5\3\5\3\5\3\5\3\5\5\5\u01fa\n\5\5\5\u01fc\n\5\3\6\3"+
		"\6\3\6\3\7\3\7\6\7\u0203\n\7\r\7\16\7\u0204\3\7\5\7\u0208\n\7\5\7\u020a"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u024c\n\b\3\t\3"+
		"\t\3\n\3\n\6\n\u0252\n\n\r\n\16\n\u0253\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u0264\n\16\3\16\3\16\3\16\7\16"+
		"\u0269\n\16\f\16\16\16\u026c\13\16\5\16\u026e\n\16\3\17\3\17\3\17\5\17"+
		"\u0273\n\17\3\20\3\20\5\20\u0277\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u0280\n\20\3\20\3\20\3\20\5\20\u0285\n\20\3\21\3\21\3\21\3\21"+
		"\7\21\u028b\n\21\f\21\16\21\u028e\13\21\3\21\3\21\5\21\u0292\n\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u0299\n\21\f\21\16\21\u029c\13\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u02a5\n\22\f\22\16\22\u02a8\13\22\3\22"+
		"\3\22\5\22\u02ac\n\22\3\22\5\22\u02af\n\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u02bd\n\23\3\23\3\23\3\24\3\24"+
		"\3\24\5\24\u02c4\n\24\3\24\3\24\3\24\3\24\3\24\7\24\u02cb\n\24\f\24\16"+
		"\24\u02ce\13\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\5\27\u02de\n\27\3\27\3\27\5\27\u02e2\n\27\3\30\3\30\3"+
		"\30\3\30\7\30\u02e8\n\30\f\30\16\30\u02eb\13\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\7\31\u02f3\n\31\f\31\16\31\u02f6\13\31\3\32\3\32\3\32\3\32\3"+
		"\32\7\32\u02fd\n\32\f\32\16\32\u0300\13\32\3\33\3\33\3\33\3\33\3\33\5"+
		"\33\u0307\n\33\3\34\3\34\3\34\7\34\u030c\n\34\f\34\16\34\u030f\13\34\3"+
		"\34\5\34\u0312\n\34\3\34\3\34\5\34\u0316\n\34\3\34\7\34\u0319\n\34\f\34"+
		"\16\34\u031c\13\34\3\34\5\34\u031f\n\34\3\34\3\34\3\34\5\34\u0324\n\34"+
		"\3\34\3\34\5\34\u0328\n\34\3\34\3\34\5\34\u032c\n\34\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u0336\n\36\3\36\3\36\5\36\u033a\n\36\3\36"+
		"\3\36\3\36\5\36\u033f\n\36\3\37\3\37\3\37\5\37\u0344\n\37\3\37\3\37\5"+
		"\37\u0348\n\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\5!\u0355\n!\3!\3!\3\""+
		"\5\"\u035a\n\"\3\"\3\"\3\"\3\"\5\"\u0360\n\"\3\"\3\"\3#\3#\3#\3#\3#\5"+
		"#\u0369\n#\3#\3#\5#\u036d\n#\3#\3#\3$\3$\3$\3$\5$\u0375\n$\3$\5$\u0378"+
		"\n$\3$\3$\3$\5$\u037d\n$\3$\3$\3%\5%\u0382\n%\3%\3%\3%\3%\3%\5%\u0389"+
		"\n%\3%\3%\3%\3%\3%\5%\u0390\n%\3%\5%\u0393\n%\3&\3&\3&\7&\u0398\n&\f&"+
		"\16&\u039b\13&\3\'\3\'\3\'\5\'\u03a0\n\'\3\'\7\'\u03a3\n\'\f\'\16\'\u03a6"+
		"\13\'\3\'\7\'\u03a9\n\'\f\'\16\'\u03ac\13\'\3\'\3\'\5\'\u03b0\n\'\3\'"+
		"\5\'\u03b3\n\'\3(\3(\3)\3)\5)\u03b9\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7"+
		")\u03c5\n)\f)\16)\u03c8\13)\3)\3)\3)\3)\3)\7)\u03cf\n)\f)\16)\u03d2\13"+
		")\3)\3)\3)\5)\u03d7\n)\3*\3*\3*\5*\u03dc\n*\3*\3*\3*\5*\u03e1\n*\3*\3"+
		"*\3*\5*\u03e6\n*\7*\u03e8\n*\f*\16*\u03eb\13*\3*\3*\5*\u03ef\n*\3*\5*"+
		"\u03f2\n*\3*\3*\3*\3*\3*\3*\7*\u03fa\n*\f*\16*\u03fd\13*\3*\3*\3*\3*\3"+
		"*\3*\3*\7*\u0406\n*\f*\16*\u0409\13*\3*\3*\7*\u040d\n*\f*\16*\u0410\13"+
		"*\5*\u0412\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u041e\n+\3,\6,\u0421\n"+
		",\r,\16,\u0422\3-\3-\3-\5-\u0428\n-\3.\5.\u042b\n.\3.\3.\3/\6/\u0430\n"+
		"/\r/\16/\u0431\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60"+
		"\u043e\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\6\61"+
		"\u044b\n\61\r\61\16\61\u044c\3\61\3\61\3\61\5\61\u0452\n\61\3\62\5\62"+
		"\u0455\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62"+
		"\u0462\n\62\f\62\16\62\u0465\13\62\3\62\3\62\3\62\5\62\u046a\n\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0475\n\62\3\63\5\63\u0478"+
		"\n\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u0480\n\63\f\63\16\63\u0483\13"+
		"\63\3\63\3\63\3\63\3\63\5\63\u0489\n\63\3\64\3\64\3\64\3\64\5\64\u048f"+
		"\n\64\3\65\3\65\3\65\3\65\7\65\u0495\n\65\f\65\16\65\u0498\13\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u04a1\n\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66"+
		"\u04b5\n\66\3\67\3\67\3\67\3\67\5\67\u04bb\n\67\38\38\58\u04bf\n8\38\3"+
		"8\38\58\u04c4\n8\38\38\58\u04c8\n8\38\38\38\58\u04cd\n8\38\58\u04d0\n"+
		"8\38\38\38\58\u04d5\n8\38\58\u04d8\n8\39\39\39\39\39\3:\3:\3;\3;\3;\5"+
		";\u04e4\n;\3;\3;\3<\3<\3<\5<\u04eb\n<\3<\3<\3<\5<\u04f0\n<\3<\3<\3<\5"+
		"<\u04f5\n<\7<\u04f7\n<\f<\16<\u04fa\13<\3<\3<\5<\u04fe\n<\3<\5<\u0501"+
		"\n<\3<\3<\3<\3<\3<\3<\7<\u0509\n<\f<\16<\u050c\13<\3<\3<\3<\3<\3<\3<\3"+
		"<\7<\u0515\n<\f<\16<\u0518\13<\3<\3<\7<\u051c\n<\f<\16<\u051f\13<\3<\3"+
		"<\3<\3<\3<\5<\u0526\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0534\n"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\5=\u0553\n=\5=\u0555\n=\3>\3>\3>\5>\u055a\n>\3>\3"+
		">\5>\u055e\n>\3>\3>\3?\5?\u0563\n?\3?\3?\3?\3?\3?\5?\u056a\n?\3?\5?\u056d"+
		"\n?\3@\5@\u0570\n@\3@\3@\3@\5@\u0575\n@\3@\3@\5@\u0579\n@\5@\u057b\n@"+
		"\3A\3A\3A\3A\3A\5A\u0582\nA\3A\3A\7A\u0586\nA\fA\16A\u0589\13A\3B\3B\3"+
		"B\3B\5B\u058f\nB\3C\3C\3C\3C\5C\u0595\nC\3C\5C\u0598\nC\3C\3C\3C\5C\u059d"+
		"\nC\3C\3C\5C\u05a1\nC\3C\5C\u05a4\nC\3C\3C\3D\3D\3D\5D\u05ab\nD\3E\3E"+
		"\3E\3E\5E\u05b1\nE\3E\5E\u05b4\nE\3E\3E\3E\3E\3E\3E\3E\3E\5E\u05be\nE"+
		"\3F\3F\3F\3F\3F\7F\u05c5\nF\fF\16F\u05c8\13F\3G\3G\3G\3G\5G\u05ce\nG\3"+
		"G\3G\3G\3G\3G\5G\u05d5\nG\5G\u05d7\nG\3H\3H\3H\3H\5H\u05dd\nH\3H\5H\u05e0"+
		"\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u05eb\nH\3I\3I\3I\3I\3I\7I\u05f2\nI"+
		"\fI\16I\u05f5\13I\3J\3J\3J\5J\u05fa\nJ\3K\3K\3K\3K\5K\u0600\nK\3K\5K\u0603"+
		"\nK\3K\3K\3K\5K\u0608\nK\3K\5K\u060b\nK\3K\5K\u060e\nK\3K\5K\u0611\nK"+
		"\3K\5K\u0614\nK\3K\3K\3K\3K\5K\u061a\nK\3L\3L\3L\3L\3L\3L\7L\u0622\nL"+
		"\fL\16L\u0625\13L\3L\3L\3L\3L\3L\3L\7L\u062d\nL\fL\16L\u0630\13L\5L\u0632"+
		"\nL\3M\3M\3M\3M\3M\5M\u0639\nM\3M\3M\3M\5M\u063e\nM\3M\7M\u0641\nM\fM"+
		"\16M\u0644\13M\3M\5M\u0647\nM\3M\3M\3M\3M\3M\3M\5M\u064f\nM\3M\3M\5M\u0653"+
		"\nM\3M\7M\u0656\nM\fM\16M\u0659\13M\3M\5M\u065c\nM\5M\u065e\nM\3N\6N\u0661"+
		"\nN\rN\16N\u0662\3O\3O\3O\3O\3O\3O\5O\u066b\nO\3O\3O\3O\5O\u0670\nO\3"+
		"P\3P\3P\3P\5P\u0676\nP\3P\3P\3P\3P\3P\5P\u067d\nP\3P\5P\u0680\nP\3Q\3"+
		"Q\3Q\3R\3R\5R\u0687\nR\3R\3R\3R\3R\3R\3R\5R\u068f\nR\3R\3R\3R\3R\7R\u0695"+
		"\nR\fR\16R\u0698\13R\5R\u069a\nR\3R\5R\u069d\nR\3S\3S\3S\5S\u06a2\nS\3"+
		"T\3T\3T\3T\3T\7T\u06a9\nT\fT\16T\u06ac\13T\3T\5T\u06af\nT\3T\3T\3T\3U"+
		"\3U\3U\3U\3U\5U\u06b9\nU\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3X\3X\3X\3Y"+
		"\3Y\3Y\5Y\u06cc\nY\3Z\3Z\3Z\3Z\3Z\5Z\u06d3\nZ\5Z\u06d5\nZ\3Z\3Z\5Z\u06d9"+
		"\nZ\3Z\3Z\5Z\u06dd\nZ\3[\3[\3[\3[\7[\u06e3\n[\f[\16[\u06e6\13[\3[\3[\3"+
		"\\\3\\\3\\\3\\\7\\\u06ee\n\\\f\\\16\\\u06f1\13\\\3]\3]\3]\3]\7]\u06f7"+
		"\n]\f]\16]\u06fa\13]\3]\3]\3^\3^\3^\5^\u0701\n^\3^\3^\3^\3^\3_\3_\3_\5"+
		"_\u070a\n_\3_\5_\u070d\n_\3_\5_\u0710\n_\3_\3_\3`\3`\3`\3`\3a\3a\3a\3"+
		"b\3b\3b\5b\u071e\nb\3b\5b\u0721\nb\3b\5b\u0724\nb\3b\5b\u0727\nb\3b\3"+
		"b\3c\3c\3c\3c\3d\3d\5d\u0731\nd\3d\3d\7d\u0735\nd\fd\16d\u0738\13d\3e"+
		"\3e\3e\3f\3f\3f\3g\3g\5g\u0742\ng\3g\3g\5g\u0746\ng\3h\3h\3h\3h\3i\3i"+
		"\5i\u074e\ni\3j\3j\3j\3j\3j\3j\3k\3k\3k\3k\3l\3l\3l\3l\7l\u075e\nl\fl"+
		"\16l\u0761\13l\3l\3l\3l\3l\3m\3m\3m\3m\3m\3n\3n\5n\u076e\nn\3o\3o\3o\3"+
		"o\3o\5o\u0775\no\3o\3o\5o\u0779\no\3p\3p\3p\3p\3p\5p\u0780\np\5p\u0782"+
		"\np\3q\3q\5q\u0786\nq\3q\3q\3q\3q\3q\7q\u078d\nq\fq\16q\u0790\13q\3r\3"+
		"r\3r\3r\3r\5r\u0797\nr\3s\3s\3s\3s\3s\7s\u079e\ns\fs\16s\u07a1\13s\3s"+
		"\3s\3t\3t\3t\3u\3u\3u\3u\3u\3u\3v\3v\5v\u07b0\nv\3v\3v\3v\3v\5v\u07b6"+
		"\nv\3v\3v\5v\u07ba\nv\3w\3w\3w\3w\3w\3w\7w\u07c2\nw\fw\16w\u07c5\13w\3"+
		"w\3w\3w\7w\u07ca\nw\fw\16w\u07cd\13w\3x\3x\3x\3x\3x\3x\5x\u07d5\nx\3x"+
		"\3x\5x\u07d9\nx\3x\3x\7x\u07dd\nx\fx\16x\u07e0\13x\3y\3y\5y\u07e4\ny\3"+
		"z\3z\5z\u07e8\nz\3{\3{\3{\3{\3{\3{\3{\3{\5{\u07f2\n{\3|\3|\3}\3}\5}\u07f8"+
		"\n}\3~\3~\5~\u07fc\n~\3~\3~\3~\3~\3~\3~\3~\3~\7~\u0806\n~\f~\16~\u0809"+
		"\13~\3~\3~\3\177\3\177\5\177\u080f\n\177\3\u0080\3\u0080\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\7\u0081"+
		"\u081d\n\u0081\f\u0081\16\u0081\u0820\13\u0081\3\u0081\3\u0081\7\u0081"+
		"\u0824\n\u0081\f\u0081\16\u0081\u0827\13\u0081\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u0830\n\u0082\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0839\n\u0083\3\u0084"+
		"\5\u0084\u083c\n\u0084\3\u0084\3\u0084\5\u0084\u0840\n\u0084\3\u0085\3"+
		"\u0085\3\u0086\3\u0086\3\u0086\5\u0086\u0847\n\u0086\3\u0086\3\u0086\3"+
		"\u0086\3\u0086\3\u0086\5\u0086\u084e\n\u0086\5\u0086\u0850\n\u0086\3\u0087"+
		"\3\u0087\5\u0087\u0854\n\u0087\3\u0088\3\u0088\5\u0088\u0858\n\u0088\3"+
		"\u0089\3\u0089\3\u0089\5\u0089\u085d\n\u0089\3\u008a\5\u008a\u0860\n\u008a"+
		"\3\u008a\3\u008a\5\u008a\u0864\n\u008a\3\u008a\5\u008a\u0867\n\u008a\3"+
		"\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\5\u008c\u0872\n\u008c\3\u008c\5\u008c\u0875\n\u008c\3\u008c\3\u008c\3"+
		"\u008c\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\5\u008e\u0880\n"+
		"\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u0886\n\u008e\3\u008e\3"+
		"\u008e\5\u008e\u088a\n\u008e\5\u008e\u088c\n\u008e\3\u008f\3\u008f\5\u008f"+
		"\u0890\n\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091"+
		"\5\u0091\u0899\n\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u089e\n\u0091\f"+
		"\u0091\16\u0091\u08a1\13\u0091\3\u0091\5\u0091\u08a4\n\u0091\3\u0091\3"+
		"\u0091\5\u0091\u08a8\n\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u08ad\n\u0091"+
		"\f\u0091\16\u0091\u08b0\13\u0091\3\u0091\5\u0091\u08b3\n\u0091\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u08bb\n\u0092\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\5\u0093\u08c1\n\u0093\3\u0093\3\u0093\5\u0093"+
		"\u08c5\n\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\5\u0094\u08d0\n\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\5\u0094\u08d7\n\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u08e4\n\u0095"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\7\u0096\u08ea\n\u0096\f\u0096\16\u0096"+
		"\u08ed\13\u0096\3\u0097\5\u0097\u08f0\n\u0097\3\u0097\3\u0097\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\7\u0098\u08f8\n\u0098\f\u0098\16\u0098\u08fb"+
		"\13\u0098\3\u0099\3\u0099\5\u0099\u08ff\n\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a\7\u009a\u090a\n\u009a"+
		"\f\u009a\16\u009a\u090d\13\u009a\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\7\u009b\u0915\n\u009b\f\u009b\16\u009b\u0918\13\u009b\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u091f\n\u009c\3\u009d\3\u009d"+
		"\5\u009d\u0923\n\u009d\3\u009d\3\u009d\5\u009d\u0927\n\u009d\3\u009d\3"+
		"\u009d\5\u009d\u092b\n\u009d\5\u009d\u092d\n\u009d\3\u009e\3\u009e\3\u009e"+
		"\5\u009e\u0932\n\u009e\3\u009e\5\u009e\u0935\n\u009e\3\u009e\5\u009e\u0938"+
		"\n\u009e\3\u009e\5\u009e\u093b\n\u009e\3\u009e\3\u009e\5\u009e\u093f\n"+
		"\u009e\3\u009e\5\u009e\u0942\n\u009e\3\u009e\5\u009e\u0945\n\u009e\3\u009f"+
		"\5\u009f\u0948\n\u009f\3\u009f\5\u009f\u094b\n\u009f\3\u009f\3\u009f\3"+
		"\u009f\7\u009f\u0950\n\u009f\f\u009f\16\u009f\u0953\13\u009f\3\u00a0\3"+
		"\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u095d\n"+
		"\u00a2\3\u00a2\3\u00a2\5\u00a2\u0961\n\u00a2\3\u00a2\5\u00a2\u0964\n\u00a2"+
		"\3\u00a3\3\u00a3\5\u00a3\u0968\n\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\5\u00a3\u096f\n\u00a3\3\u00a4\3\u00a4\5\u00a4\u0973\n\u00a4\3"+
		"\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\7\u00a5\u097b\n\u00a5\f"+
		"\u00a5\16\u00a5\u097e\13\u00a5\3\u00a6\3\u00a6\3\u00a6\7\u00a6\u0983\n"+
		"\u00a6\f\u00a6\16\u00a6\u0986\13\u00a6\3\u00a7\3\u00a7\3\u00a7\5\u00a7"+
		"\u098b\n\u00a7\3\u00a8\3\u00a8\5\u00a8\u098f\n\u00a8\3\u00a9\3\u00a9\3"+
		"\u00a9\3\u00a9\5\u00a9\u0995\n\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3"+
		"\u00aa\3\u00aa\3\u00aa\5\u00aa\u099e\n\u00aa\3\u00ab\5\u00ab\u09a1\n\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u09a6\n\u00ab\3\u00ab\5\u00ab\u09a9\n"+
		"\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\7\u00ac\u09b1\n"+
		"\u00ac\f\u00ac\16\u00ac\u09b4\13\u00ac\3\u00ac\3\u00ac\5\u00ac\u09b8\n"+
		"\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\7\u00ad\u09bf\n\u00ad\f"+
		"\u00ad\16\u00ad\u09c2\13\u00ad\3\u00ad\3\u00ad\5\u00ad\u09c6\n\u00ad\3"+
		"\u00ae\3\u00ae\5\u00ae\u09ca\n\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3"+
		"\u00ae\7\u00ae\u09d1\n\u00ae\f\u00ae\16\u00ae\u09d4\13\u00ae\3\u00ae\5"+
		"\u00ae\u09d7\n\u00ae\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b1\3"+
		"\u00b1\3\u00b1\3\u00b1\3\u00b1\7\u00b1\u09e3\n\u00b1\f\u00b1\16\u00b1"+
		"\u09e6\13\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u09f2\n\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\5\u00b4\u09f7\n\u00b4\7\u00b4\u09f9\n\u00b4\f\u00b4\16\u00b4\u09fc\13"+
		"\u00b4\3\u00b5\6\u00b5\u09ff\n\u00b5\r\u00b5\16\u00b5\u0a00\3\u00b6\3"+
		"\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6"+
		"\u0a0c\n\u00b6\5\u00b6\u0a0e\n\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3"+
		"\u00b7\5\u00b7\u0a15\n\u00b7\3\u00b7\5\u00b7\u0a18\n\u00b7\3\u00b8\3\u00b8"+
		"\3\u00b8\7\u00b8\u0a1d\n\u00b8\f\u00b8\16\u00b8\u0a20\13\u00b8\3\u00b9"+
		"\3\u00b9\5\u00b9\u0a24\n\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9"+
		"\u0a2a\n\u00b9\3\u00b9\5\u00b9\u0a2d\n\u00b9\3\u00b9\5\u00b9\u0a30\n\u00b9"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\6\u00bb\u0a3d\n\u00bb\r\u00bb\16\u00bb\u0a3e\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0a46\n\u00bc\3\u00bc\5\u00bc"+
		"\u0a49\n\u00bc\3\u00bc\5\u00bc\u0a4c\n\u00bc\3\u00bd\3\u00bd\5\u00bd\u0a50"+
		"\n\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0a55\n\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\5\u00bd\u0a5b\n\u00bd\3\u00be\3\u00be\5\u00be\u0a5f\n"+
		"\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\7\u00be"+
		"\u0a68\n\u00be\f\u00be\16\u00be\u0a6b\13\u00be\3\u00be\5\u00be\u0a6e\n"+
		"\u00be\3\u00be\5\u00be\u0a71\n\u00be\3\u00bf\3\u00bf\5\u00bf\u0a75\n\u00bf"+
		"\3\u00bf\3\u00bf\5\u00bf\u0a79\n\u00bf\3\u00bf\3\u00bf\5\u00bf\u0a7d\n"+
		"\u00bf\3\u00c0\3\u00c0\5\u00c0\u0a81\n\u00c0\3\u00c0\3\u00c0\3\u00c1\3"+
		"\u00c1\5\u00c1\u0a87\n\u00c1\3\u00c1\3\u00c1\3\u00c2\3\u00c2\5\u00c2\u0a8d"+
		"\n\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0a94\n\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\7\u00c2\u0a9a\n\u00c2\f\u00c2\16\u00c2"+
		"\u0a9d\13\u00c2\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u0aa2\n\u00c3\3\u00c4"+
		"\3\u00c4\3\u00c4\5\u00c4\u0aa7\n\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u0ab2\n\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u0abb\n\u00c4"+
		"\3\u00c5\3\u00c5\5\u00c5\u0abf\n\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\7\u00c5\u0ac6\n\u00c5\f\u00c5\16\u00c5\u0ac9\13\u00c5\3\u00c5"+
		"\5\u00c5\u0acc\n\u00c5\3\u00c5\3\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\7\u00c6\u0ad4\n\u00c6\f\u00c6\16\u00c6\u0ad7\13\u00c6\3\u00c6\3\u00c6"+
		"\5\u00c6\u0adb\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0af1\n\u00c9\3\u00c9"+
		"\5\u00c9\u0af4\n\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\5\u00ca\u0b07\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\7\u00ca\u0b17\n\u00ca\f\u00ca\16\u00ca\u0b1a\13\u00ca\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0b24"+
		"\n\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\7\u00ce\u0b31\n\u00ce\f\u00ce\16\u00ce\u0b34"+
		"\13\u00ce\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\5\u00cf\u0b3f\n\u00cf\3\u00d0\3\u00d0\5\u00d0\u0b43\n\u00d0\3"+
		"\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\6\u00d1\u0b4c\n"+
		"\u00d1\r\u00d1\16\u00d1\u0b4d\3\u00d1\3\u00d1\5\u00d1\u0b52\n\u00d1\3"+
		"\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\6\u00d2"+
		"\u0b5c\n\u00d2\r\u00d2\16\u00d2\u0b5d\3\u00d2\3\u00d2\5\u00d2\u0b62\n"+
		"\u00d2\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d4\3\u00d4"+
		"\3\u00d4\5\u00d4\u0b6d\n\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0b72\n"+
		"\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0b77\n\u00d4\3\u00d4\3\u00d4\5"+
		"\u00d4\u0b7b\n\u00d4\3\u00d4\3\u00d4\5\u00d4\u0b7f\n\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\5\u00d4\u0b84\n\u00d4\3\u00d4\3\u00d4\5\u00d4\u0b88\n\u00d4\3"+
		"\u00d4\3\u00d4\5\u00d4\u0b8c\n\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3"+
		"\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4"+
		"\u0ba3\n\u00d4\5\u00d4\u0ba5\n\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3"+
		"\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0bb7\n\u00d4\5\u00d4\u0bb9\n\u00d4\3"+
		"\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0bc1\n\u00d4\3"+
		"\u00d4\3\u00d4\3\u00d4\5\u00d4\u0bc6\n\u00d4\3\u00d4\3\u00d4\3\u00d4\5"+
		"\u00d4\u0bcb\n\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0bd0\n\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\5\u00d4\u0bdd\n\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0be2\n"+
		"\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0be7\n\u00d4\3\u00d4\3\u00d4\3"+
		"\u00d4\5\u00d4\u0bec\n\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0bf1\n\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0bf6\n\u00d4\3\u00d4\3\u00d4\3\u00d4"+
		"\5\u00d4\u0bfb\n\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0c00\n\u00d4\5"+
		"\u00d4\u0c02\n\u00d4\3\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u0c09"+
		"\n\u00d6\3\u00d6\5\u00d6\u0c0c\n\u00d6\3\u00d6\3\u00d6\3\u00d7\3\u00d7"+
		"\3\u00d7\3\u00d7\3\u00d7\7\u00d7\u0c15\n\u00d7\f\u00d7\16\u00d7\u0c18"+
		"\13\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\5\u00d8"+
		"\u0c21\n\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\5\u00d8"+
		"\u0c29\n\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\5\u00d8\u0c32\n\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u0c38\n"+
		"\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\7\u00d8\u0c47\n\u00d8\f\u00d8"+
		"\16\u00d8\u0c4a\13\u00d8\5\u00d8\u0c4c\n\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\7\u00d8\u0c5a\n\u00d8\f\u00d8\16\u00d8\u0c5d\13\u00d8\5\u00d8\u0c5f\n"+
		"\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\7\u00d8\u0c6d\n\u00d8\f\u00d8\16\u00d8"+
		"\u0c70\13\u00d8\5\u00d8\u0c72\n\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\7\u00d8"+
		"\u0c80\n\u00d8\f\u00d8\16\u00d8\u0c83\13\u00d8\5\u00d8\u0c85\n\u00d8\3"+
		"\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\7\u00d8\u0c93\n\u00d8\f\u00d8\16\u00d8\u0c96"+
		"\13\u00d8\5\u00d8\u0c98\n\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\7\u00d8\u0ca6"+
		"\n\u00d8\f\u00d8\16\u00d8\u0ca9\13\u00d8\5\u00d8\u0cab\n\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\7\u00d8\u0cb7\n\u00d8\f\u00d8\16\u00d8\u0cba\13\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\6\u00d8"+
		"\u0cc6\n\u00d8\r\u00d8\16\u00d8\u0cc7\3\u00d8\3\u00d8\5\u00d8\u0ccc\n"+
		"\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u0cdc\n\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u0ce2\n\u00d8\3\u00d9\3\u00d9"+
		"\3\u00d9\5\u00d9\u0ce7\n\u00d9\3\u00d9\3\u00d9\3\u00da\3\u00da\3\u00da"+
		"\7\u00da\u0cee\n\u00da\f\u00da\16\u00da\u0cf1\13\u00da\3\u00db\3\u00db"+
		"\3\u00db\3\u00db\5\u00db\u0cf7\n\u00db\5\u00db\u0cf9\n\u00db\3\u00db\3"+
		"\u00db\3\u00dc\3\u00dc\5\u00dc\u0cff\n\u00dc\3\u00dd\3\u00dd\5\u00dd\u0d03"+
		"\n\u00dd\3\u00de\3\u00de\7\u00de\u0d07\n\u00de\f\u00de\16\u00de\u0d0a"+
		"\13\u00de\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\5\u00df\u0d18\n\u00df\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\5\u00e0\u0d1f\n\u00e0\3\u00e1\7\u00e1\u0d22\n"+
		"\u00e1\f\u00e1\16\u00e1\u0d25\13\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\5\u00e3\u0d2e\n\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\7\u00e3\u0d33\n\u00e3\f\u00e3\16\u00e3\u0d36\13\u00e3\5\u00e3\u0d38\n"+
		"\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e6\3\u00e6"+
		"\5\u00e6\u0d42\n\u00e6\3\u00e6\3\u00e6\3\u00e6\5\u00e6\u0d47\n\u00e6\7"+
		"\u00e6\u0d49\n\u00e6\f\u00e6\16\u00e6\u0d4c\13\u00e6\3\u00e7\3\u00e7\5"+
		"\u00e7\u0d50\n\u00e7\3\u00e8\5\u00e8\u0d53\n\u00e8\3\u00e8\3\u00e8\3\u00e9"+
		"\5\u00e9\u0d58\n\u00e9\3\u00e9\3\u00e9\3\u00ea\3\u00ea\3\u00eb\3\u00eb"+
		"\3\u00ec\3\u00ec\3\u00ec\3\u0d23\4\u0182\u0192\u00ed\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a"+
		"\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122"+
		"\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a"+
		"\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152"+
		"\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a"+
		"\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182"+
		"\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a"+
		"\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2"+
		"\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca"+
		"\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\2\63\5\2\3\4\u0161\u0161\u0172\u0172"+
		"\4\2dd\u013a\u013a\3\2\u00aa\u00ab\5\2\20\20uu\u009b\u009b\4\2##++\4\2"+
		"99mm\4\2\u00ba\u00ba\u0103\u0103\4\2\21\21UU\4\2RR\u012f\u012f\4\2nn\u00ad"+
		"\u00ad\4\2RR\u00da\u00da\4\2NN\u008a\u008a\5\2\u008e\u008e\u00b4\u00b4"+
		"\u00d6\u00d7\4\2\u00af\u00af\u00c1\u00c1\4\2\u00be\u00be\u0142\u0142\4"+
		"\2\u00f6\u00f6\u012c\u012c\4\2\u00b3\u00b3\u0177\u0177\4\2!!((\4\2&&@"+
		"@\4\2DD\u00fc\u00fc\4\2\20\20\u009b\u009b\3\2\u00ed\u00ee\3\2\u00de\u00df"+
		"\6\2??PP\u009a\u009a\u00d3\u00d3\3\2hi\3\2ab\3\2\u0113\u0114\4\2\u00f7"+
		"\u00f7\u011b\u011b\5\2RR\u0089\u0089\u00d2\u00d2\6\2\16\17\u00bf\u00bf"+
		"\u00e3\u00e3\u0140\u0140\3\2\u00c9\u00ca\4\2\u0104\u0104\u0129\u0129\6"+
		"\2\27\27\\\\\u00b0\u00b0\u0123\u0123\4\2\u00b0\u00b0\u013c\u013c\4\2 "+
		" \u0115\u0115\3\2\u0101\u0102\4\2\n\nZZ\5\2zz\u00a4\u00a4\u00f0\u00f0"+
		"\5\2@@\u00f8\u00f9\u0130\u0130\5\2kk\u0107\u0107\u012f\u012f\3\2UV\4\2"+
		"\r\r\u00cd\u00cd\5\2\u00a5\u00a5\u00e7\u00e7\u00f1\u00f1\5\2HI\u00b7\u00b8"+
		"\u00fd\u00fe\4\2\66\66\u0160\u0160\5\2xx\u009c\u009c\u00c4\u00c4\4\2\u015d"+
		"\u015d\u0173\u0173\4\2oo\u012a\u012a\16\2\b\33\35_cce\u00c4\u00c6\u00d7"+
		"\u00d9\u00f5\u00f7\u010a\u010c\u0124\u0126\u012b\u012e\u0139\u013c\u014e"+
		"\u0155\u015c\u0f0e\2\u01d8\3\2\2\2\4\u01e2\3\2\2\2\6\u01e7\3\2\2\2\b\u01fb"+
		"\3\2\2\2\n\u01fd\3\2\2\2\f\u0209\3\2\2\2\16\u024b\3\2\2\2\20\u024d\3\2"+
		"\2\2\22\u024f\3\2\2\2\24\u0255\3\2\2\2\26\u025b\3\2\2\2\30\u025d\3\2\2"+
		"\2\32\u026d\3\2\2\2\34\u0272\3\2\2\2\36\u0284\3\2\2\2 \u0286\3\2\2\2\""+
		"\u02ab\3\2\2\2$\u02b5\3\2\2\2&\u02c0\3\2\2\2(\u02d4\3\2\2\2*\u02d7\3\2"+
		"\2\2,\u02d9\3\2\2\2.\u02e3\3\2\2\2\60\u02ec\3\2\2\2\62\u02f7\3\2\2\2\64"+
		"\u0306\3\2\2\2\66\u032b\3\2\2\28\u032d\3\2\2\2:\u0335\3\2\2\2<\u0340\3"+
		"\2\2\2>\u0349\3\2\2\2@\u034c\3\2\2\2B\u0359\3\2\2\2D\u0363\3\2\2\2F\u0370"+
		"\3\2\2\2H\u038f\3\2\2\2J\u0394\3\2\2\2L\u03b2\3\2\2\2N\u03b4\3\2\2\2P"+
		"\u03d6\3\2\2\2R\u0411\3\2\2\2T\u0413\3\2\2\2V\u0420\3\2\2\2X\u0427\3\2"+
		"\2\2Z\u042a\3\2\2\2\\\u042f\3\2\2\2^\u043d\3\2\2\2`\u0451\3\2\2\2b\u0474"+
		"\3\2\2\2d\u0488\3\2\2\2f\u048e\3\2\2\2h\u0490\3\2\2\2j\u04b4\3\2\2\2l"+
		"\u04ba\3\2\2\2n\u04d7\3\2\2\2p\u04d9\3\2\2\2r\u04de\3\2\2\2t\u04e0\3\2"+
		"\2\2v\u0525\3\2\2\2x\u0554\3\2\2\2z\u0556\3\2\2\2|\u056c\3\2\2\2~\u057a"+
		"\3\2\2\2\u0080\u057c\3\2\2\2\u0082\u058e\3\2\2\2\u0084\u0597\3\2\2\2\u0086"+
		"\u05a7\3\2\2\2\u0088\u05b3\3\2\2\2\u008a\u05bf\3\2\2\2\u008c\u05d6\3\2"+
		"\2\2\u008e\u05df\3\2\2\2\u0090\u05ec\3\2\2\2\u0092\u05f9\3\2\2\2\u0094"+
		"\u0602\3\2\2\2\u0096\u0631\3\2\2\2\u0098\u065d\3\2\2\2\u009a\u0660\3\2"+
		"\2\2\u009c\u066f\3\2\2\2\u009e\u067f\3\2\2\2\u00a0\u0681\3\2\2\2\u00a2"+
		"\u0684\3\2\2\2\u00a4\u06a1\3\2\2\2\u00a6\u06a3\3\2\2\2\u00a8\u06b3\3\2"+
		"\2\2\u00aa\u06ba\3\2\2\2\u00ac\u06c0\3\2\2\2\u00ae\u06c5\3\2\2\2\u00b0"+
		"\u06c8\3\2\2\2\u00b2\u06cd\3\2\2\2\u00b4\u06de\3\2\2\2\u00b6\u06e9\3\2"+
		"\2\2\u00b8\u06f2\3\2\2\2\u00ba\u06fd\3\2\2\2\u00bc\u0706\3\2\2\2\u00be"+
		"\u0713\3\2\2\2\u00c0\u0717\3\2\2\2\u00c2\u071a\3\2\2\2\u00c4\u072a\3\2"+
		"\2\2\u00c6\u072e\3\2\2\2\u00c8\u0739\3\2\2\2\u00ca\u073c\3\2\2\2\u00cc"+
		"\u073f\3\2\2\2\u00ce\u0747\3\2\2\2\u00d0\u074d\3\2\2\2\u00d2\u074f\3\2"+
		"\2\2\u00d4\u0755\3\2\2\2\u00d6\u0759\3\2\2\2\u00d8\u0766\3\2\2\2\u00da"+
		"\u076b\3\2\2\2\u00dc\u076f\3\2\2\2\u00de\u077a\3\2\2\2\u00e0\u0783\3\2"+
		"\2\2\u00e2\u0791\3\2\2\2\u00e4\u0798\3\2\2\2\u00e6\u07a4\3\2\2\2\u00e8"+
		"\u07a7\3\2\2\2\u00ea\u07b5\3\2\2\2\u00ec\u07bb\3\2\2\2\u00ee\u07ce\3\2"+
		"\2\2\u00f0\u07e3\3\2\2\2\u00f2\u07e7\3\2\2\2\u00f4\u07f1\3\2\2\2\u00f6"+
		"\u07f3\3\2\2\2\u00f8\u07f5\3\2\2\2\u00fa\u07f9\3\2\2\2\u00fc\u080c\3\2"+
		"\2\2\u00fe\u0810\3\2\2\2\u0100\u0812\3\2\2\2\u0102\u082f\3\2\2\2\u0104"+
		"\u0838\3\2\2\2\u0106\u083b\3\2\2\2\u0108\u0841\3\2\2\2\u010a\u0843\3\2"+
		"\2\2\u010c\u0851\3\2\2\2\u010e\u0855\3\2\2\2\u0110\u085c\3\2\2\2\u0112"+
		"\u0863\3\2\2\2\u0114\u086a\3\2\2\2\u0116\u086d\3\2\2\2\u0118\u0879\3\2"+
		"\2\2\u011a\u087c\3\2\2\2\u011c\u088d\3\2\2\2\u011e\u0893\3\2\2\2\u0120"+
		"\u0896\3\2\2\2\u0122\u08b4\3\2\2\2\u0124\u08bc\3\2\2\2\u0126\u08cb\3\2"+
		"\2\2\u0128\u08e3\3\2\2\2\u012a\u08e5\3\2\2\2\u012c\u08ef\3\2\2\2\u012e"+
		"\u08f3\3\2\2\2\u0130\u08fc\3\2\2\2\u0132\u0905\3\2\2\2\u0134\u0910\3\2"+
		"\2\2\u0136\u091e\3\2\2\2\u0138\u092c\3\2\2\2\u013a\u092e\3\2\2\2\u013c"+
		"\u0947\3\2\2\2\u013e\u0954\3\2\2\2\u0140\u0956\3\2\2\2\u0142\u0963\3\2"+
		"\2\2\u0144\u096e\3\2\2\2\u0146\u0972\3\2\2\2\u0148\u0976\3\2\2\2\u014a"+
		"\u097f\3\2\2\2\u014c\u098a\3\2\2\2\u014e\u098c\3\2\2\2\u0150\u0990\3\2"+
		"\2\2\u0152\u099d\3\2\2\2\u0154\u09a8\3\2\2\2\u0156\u09aa\3\2\2\2\u0158"+
		"\u09c5\3\2\2\2\u015a\u09c7\3\2\2\2\u015c\u09d8\3\2\2\2\u015e\u09da\3\2"+
		"\2\2\u0160\u09dd\3\2\2\2\u0162\u09e7\3\2\2\2\u0164\u09ea\3\2\2\2\u0166"+
		"\u09ed\3\2\2\2\u0168\u09fe\3\2\2\2\u016a\u0a0d\3\2\2\2\u016c\u0a0f\3\2"+
		"\2\2\u016e\u0a19\3\2\2\2\u0170\u0a29\3\2\2\2\u0172\u0a31\3\2\2\2\u0174"+
		"\u0a34\3\2\2\2\u0176\u0a45\3\2\2\2\u0178\u0a5a\3\2\2\2\u017a\u0a70\3\2"+
		"\2\2\u017c\u0a72\3\2\2\2\u017e\u0a7e\3\2\2\2\u0180\u0a84\3\2\2\2\u0182"+
		"\u0a93\3\2\2\2\u0184\u0aa1\3\2\2\2\u0186\u0aba\3\2\2\2\u0188\u0abc\3\2"+
		"\2\2\u018a\u0acf\3\2\2\2\u018c\u0ae1\3\2\2\2\u018e\u0ae5\3\2\2\2\u0190"+
		"\u0af3\3\2\2\2\u0192\u0b06\3\2\2\2\u0194\u0b23\3\2\2\2\u0196\u0b25\3\2"+
		"\2\2\u0198\u0b29\3\2\2\2\u019a\u0b2b\3\2\2\2\u019c\u0b3e\3\2\2\2\u019e"+
		"\u0b42\3\2\2\2\u01a0\u0b44\3\2\2\2\u01a2\u0b55\3\2\2\2\u01a4\u0b65\3\2"+
		"\2\2\u01a6\u0c01\3\2\2\2\u01a8\u0c03\3\2\2\2\u01aa\u0c05\3\2\2\2\u01ac"+
		"\u0c0f\3\2\2\2\u01ae\u0ce1\3\2\2\2\u01b0\u0ce3\3\2\2\2\u01b2\u0cea\3\2"+
		"\2\2\u01b4\u0cf2\3\2\2\2\u01b6\u0cfe\3\2\2\2\u01b8\u0d02\3\2\2\2\u01ba"+
		"\u0d04\3\2\2\2\u01bc\u0d17\3\2\2\2\u01be\u0d1e\3\2\2\2\u01c0\u0d23\3\2"+
		"\2\2\u01c2\u0d26\3\2\2\2\u01c4\u0d37\3\2\2\2\u01c6\u0d39\3\2\2\2\u01c8"+
		"\u0d3c\3\2\2\2\u01ca\u0d41\3\2\2\2\u01cc\u0d4f\3\2\2\2\u01ce\u0d52\3\2"+
		"\2\2\u01d0\u0d57\3\2\2\2\u01d2\u0d5b\3\2\2\2\u01d4\u0d5d\3\2\2\2\u01d6"+
		"\u0d5f\3\2\2\2\u01d8\u01d9\5\4\3\2\u01d9\u01da\7\2\2\3\u01da\3\3\2\2\2"+
		"\u01db\u01de\5\6\4\2\u01dc\u01de\5\16\b\2\u01dd\u01db\3\2\2\2\u01dd\u01dc"+
		"\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01e1\7~\2\2\u01e0\u01df\3\2\2\2\u01e0"+
		"\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01dd\3\2\2\2\u01e3\u01e4\3\2"+
		"\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\5\3\2\2\2\u01e6\u01e8"+
		"\5\60\31\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2"+
		"\u01e9\u01ea\7\27\2\2\u01ea\u01ec\5\4\3\2\u01eb\u01ed\5\22\n\2\u01ec\u01eb"+
		"\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\5\n\6\2\u01ef"+
		"\7\3\2\2\2\u01f0\u01f1\7\27\2\2\u01f1\u01f3\5\4\3\2\u01f2\u01f4\5\22\n"+
		"\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6"+
		"\5\n\6\2\u01f6\u01fc\3\2\2\2\u01f7\u01f9\5\16\b\2\u01f8\u01fa\7\u0172"+
		"\2\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb"+
		"\u01f0\3\2\2\2\u01fb\u01f7\3\2\2\2\u01fc\t\3\2\2\2\u01fd\u01fe\6\6\2\2"+
		"\u01fe\u01ff\7d\2\2\u01ff\13\3\2\2\2\u0200\u020a\5\6\4\2\u0201\u0203\5"+
		"\16\b\2\u0202\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0202\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206\u0208\7~\2\2\u0207\u0206\3\2"+
		"\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2\2\2\u0209\u0200\3\2\2\2\u0209"+
		"\u0202\3\2\2\2\u020a\r\3\2\2\2\u020b\u024c\5\32\16\2\u020c\u024c\5$\23"+
		"\2\u020d\u024c\5p9\2\u020e\u024c\5&\24\2\u020f\u024c\5(\25\2\u0210\u024c"+
		"\5*\26\2\u0211\u024c\5,\27\2\u0212\u024c\5\u00e2r\2\u0213\u024c\5\u00e6"+
		"t\2\u0214\u024c\5\u00e8u\2\u0215\u024c\5\u00ecw\2\u0216\u024c\5\u00ee"+
		"x\2\u0217\u024c\5\u00f8}\2\u0218\u024c\5\u0080A\2\u0219\u024c\5\u0084"+
		"C\2\u021a\u024c\5\u00fa~\2\u021b\u024c\5F$\2\u021c\u024c\5\u0088E\2\u021d"+
		"\u024c\5\u008eH\2\u021e\u024c\5\u0094K\2\u021f\u024c\5D#\2\u0220\u024c"+
		"\5.\30\2\u0221\u024c\5\u017c\u00bf\2\u0222\u024c\5\u0180\u00c1\2\u0223"+
		"\u024c\5\u009eP\2\u0224\u024c\5\u00a0Q\2\u0225\u024c\5\u00a2R\2\u0226"+
		"\u024c\5\u00ccg\2\u0227\u024c\5\u00e0q\2\u0228\u024c\5\u0124\u0093\2\u0229"+
		"\u024c\5\u0126\u0094\2\u022a\u024c\5\u00a4S\2\u022b\u024c\5\u00b0Y\2\u022c"+
		"\u024c\5\u00b2Z\2\u022d\u024c\5\u00ba^\2\u022e\u024c\5\u00ceh\2\u022f"+
		"\u024c\5\u00d6l\2\u0230\u024c\5\u00dan\2\u0231\u024c\5\u00dco\2\u0232"+
		"\u024c\5\u0174\u00bb\2\u0233\u024c\5\u00dep\2\u0234\u024c\5\u0102\u0082"+
		"\2\u0235\u024c\5\u0104\u0083\2\u0236\u024c\5\u0106\u0084\2\u0237\u024c"+
		"\5\u0108\u0085\2\u0238\u024c\5\u010a\u0086\2\u0239\u024c\5\u010c\u0087"+
		"\2\u023a\u024c\5\u010e\u0088\2\u023b\u024c\5\u012c\u0097\2\u023c\u024c"+
		"\5\u0118\u008d\2\u023d\u024c\5\u011a\u008e\2\u023e\u024c\5\u016c\u00b7"+
		"\2\u023f\u024c\5\u011e\u0090\2\u0240\u024c\5\u011c\u008f\2\u0241\u024c"+
		"\5\u0120\u0091\2\u0242\u024c\5\u0122\u0092\2\u0243\u024c\5\u0128\u0095"+
		"\2\u0244\u024c\5\u01ba\u00de\2\u0245\u024c\5\u01be\u00e0\2\u0246\u024c"+
		"\5\26\f\2\u0247\u024c\5\30\r\2\u0248\u024c\5\20\t\2\u0249\u024c\5\u00bc"+
		"_\2\u024a\u024c\5\u00c2b\2\u024b\u020b\3\2\2\2\u024b\u020c\3\2\2\2\u024b"+
		"\u020d\3\2\2\2\u024b\u020e\3\2\2\2\u024b\u020f\3\2\2\2\u024b\u0210\3\2"+
		"\2\2\u024b\u0211\3\2\2\2\u024b\u0212\3\2\2\2\u024b\u0213\3\2\2\2\u024b"+
		"\u0214\3\2\2\2\u024b\u0215\3\2\2\2\u024b\u0216\3\2\2\2\u024b\u0217\3\2"+
		"\2\2\u024b\u0218\3\2\2\2\u024b\u0219\3\2\2\2\u024b\u021a\3\2\2\2\u024b"+
		"\u021b\3\2\2\2\u024b\u021c\3\2\2\2\u024b\u021d\3\2\2\2\u024b\u021e\3\2"+
		"\2\2\u024b\u021f\3\2\2\2\u024b\u0220\3\2\2\2\u024b\u0221\3\2\2\2\u024b"+
		"\u0222\3\2\2\2\u024b\u0223\3\2\2\2\u024b\u0224\3\2\2\2\u024b\u0225\3\2"+
		"\2\2\u024b\u0226\3\2\2\2\u024b\u0227\3\2\2\2\u024b\u0228\3\2\2\2\u024b"+
		"\u0229\3\2\2\2\u024b\u022a\3\2\2\2\u024b\u022b\3\2\2\2\u024b\u022c\3\2"+
		"\2\2\u024b\u022d\3\2\2\2\u024b\u022e\3\2\2\2\u024b\u022f\3\2\2\2\u024b"+
		"\u0230\3\2\2\2\u024b\u0231\3\2\2\2\u024b\u0232\3\2\2\2\u024b\u0233\3\2"+
		"\2\2\u024b\u0234\3\2\2\2\u024b\u0235\3\2\2\2\u024b\u0236\3\2\2\2\u024b"+
		"\u0237\3\2\2\2\u024b\u0238\3\2\2\2\u024b\u0239\3\2\2\2\u024b\u023a\3\2"+
		"\2\2\u024b\u023b\3\2\2\2\u024b\u023c\3\2\2\2\u024b\u023d\3\2\2\2\u024b"+
		"\u023e\3\2\2\2\u024b\u023f\3\2\2\2\u024b\u0240\3\2\2\2\u024b\u0241\3\2"+
		"\2\2\u024b\u0242\3\2\2\2\u024b\u0243\3\2\2\2\u024b\u0244\3\2\2\2\u024b"+
		"\u0245\3\2\2\2\u024b\u0246\3\2\2\2\u024b\u0247\3\2\2\2\u024b\u0248\3\2"+
		"\2\2\u024b\u0249\3\2\2\2\u024b\u024a\3\2\2\2\u024c\17\3\2\2\2\u024d\u024e"+
		"\t\2\2\2\u024e\21\3\2\2\2\u024f\u0251\7j\2\2\u0250\u0252\5\24\13\2\u0251"+
		"\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2"+
		"\2\2\u0254\23\3\2\2\2\u0255\u0256\7\u013a\2\2\u0256\u0257\7\u0174\2\2"+
		"\u0257\u0258\7\u0123\2\2\u0258\u0259\5\4\3\2\u0259\u025a\n\3\2\2\u025a"+
		"\25\3\2\2\2\u025b\u025c\7\u00c5\2\2\u025c\27\3\2\2\2\u025d\u025e\6\r\3"+
		"\2\u025e\u025f\5\u0192\u00ca\2\u025f\31\3\2\2\2\u0260\u0261\7\u0103\2"+
		"\2\u0261\u026e\5\u0110\u0089\2\u0262\u0264\7\u0103\2\2\u0263\u0262\3\2"+
		"\2\2\u0263\u0264\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u026a\5\34\17\2\u0266"+
		"\u0267\7\u015f\2\2\u0267\u0269\5\34\17\2\u0268\u0266\3\2\2\2\u0269\u026c"+
		"\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026e\3\2\2\2\u026c"+
		"\u026a\3\2\2\2\u026d\u0260\3\2\2\2\u026d\u0263\3\2\2\2\u026e\33\3\2\2"+
		"\2\u026f\u0273\5\36\20\2\u0270\u0273\5 \21\2\u0271\u0273\5\"\22\2\u0272"+
		"\u026f\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0271\3\2\2\2\u0273\35\3\2\2"+
		"\2\u0274\u0276\5\u01ca\u00e6\2\u0275\u0277\7\u015e\2\2\u0276\u0275\3\2"+
		"\2\2\u0276\u0277\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\7\u0163\2\2\u0279"+
		"\u027a\5\u0192\u00ca\2\u027a\u0285\3\2\2\2\u027b\u027c\7\u016d\2\2\u027c"+
		"\u027d\5\u01ca\u00e6\2\u027d\u027f\7\u0170\2\2\u027e\u0280\7\u015e\2\2"+
		"\u027f\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282"+
		"\7\u0163\2\2\u0282\u0283\5\u0192\u00ca\2\u0283\u0285\3\2\2\2\u0284\u0274"+
		"\3\2\2\2\u0284\u027b\3\2\2\2\u0285\37\3\2\2\2\u0286\u0287\7\u016d\2\2"+
		"\u0287\u028c\5\u01ca\u00e6\2\u0288\u0289\7\u015f\2\2\u0289\u028b\5\u01ca"+
		"\u00e6\2\u028a\u0288\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028d\u028f\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0291\7\u0170"+
		"\2\2\u0290\u0292\7\u015e\2\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292"+
		"\u0293\3\2\2\2\u0293\u0294\7\u0163\2\2\u0294\u0295\7\u016d\2\2\u0295\u029a"+
		"\5\u0192\u00ca\2\u0296\u0297\7\u015f\2\2\u0297\u0299\5\u0192\u00ca\2\u0298"+
		"\u0296\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2"+
		"\2\2\u029b\u029d\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u029e\7\u0170\2\2\u029e"+
		"!\3\2\2\2\u029f\u02ac\5\u01ca\u00e6\2\u02a0\u02a1\7\u016d\2\2\u02a1\u02a6"+
		"\5\u01ca\u00e6\2\u02a2\u02a3\7\u015f\2\2\u02a3\u02a5\5\u01ca\u00e6\2\u02a4"+
		"\u02a2\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2"+
		"\2\2\u02a7\u02a9\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02aa\7\u0170\2\2\u02aa"+
		"\u02ac\3\2\2\2\u02ab\u029f\3\2\2\2\u02ab\u02a0\3\2\2\2\u02ac\u02ae\3\2"+
		"\2\2\u02ad\u02af\7\u015e\2\2\u02ae\u02ad\3\2\2\2\u02ae\u02af\3\2\2\2\u02af"+
		"\u02b0\3\2\2\2\u02b0\u02b1\7\u0163\2\2\u02b1\u02b2\7\u016d\2\2\u02b2\u02b3"+
		"\5\u012c\u0097\2\u02b3\u02b4\7\u0170\2\2\u02b4#\3\2\2\2\u02b5\u02b6\7"+
		"\13\2\2\u02b6\u02b7\5\u01ca\u00e6\2\u02b7\u02b8\7C\2\2\u02b8\u02bc\7u"+
		"\2\2\u02b9\u02ba\7\u00eb\2\2\u02ba\u02bd\7\u0103\2\2\u02bb\u02bd\7\u00df"+
		"\2\2\u02bc\u02b9\3\2\2\2\u02bc\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be"+
		"\u02bf\5\u01ca\u00e6\2\u02bf%\3\2\2\2\u02c0\u02c3\7\22\2\2\u02c1\u02c2"+
		"\7\u00eb\2\2\u02c2\u02c4\7\u0103\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3"+
		"\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\t\4\2\2\u02c6\u02c7\7\u016d\2\2"+
		"\u02c7\u02cc\5\u01ca\u00e6\2\u02c8\u02c9\7\u015f\2\2\u02c9\u02cb\5\u01ca"+
		"\u00e6\2\u02ca\u02c8\3\2\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc"+
		"\u02cd\3\2\2\2\u02cd\u02cf\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf\u02d0\7\u0170"+
		"\2\2\u02d0\u02d1\7\u013d\2\2\u02d1\u02d2\7\u00df\2\2\u02d2\u02d3\5\u01ca"+
		"\u00e6\2\u02d3\'\3\2\2\2\u02d4\u02d5\7\27\2\2\u02d5\u02d6\7\u0129\2\2"+
		"\u02d6)\3\2\2\2\u02d7\u02d8\7\37\2\2\u02d8+\3\2\2\2\u02d9\u02da\7\"\2"+
		"\2\u02da\u02e1\5\u01ca\u00e6\2\u02db\u02dd\7\u016d\2\2\u02dc\u02de\5\u01b2"+
		"\u00da\2\u02dd\u02dc\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df\3\2\2\2\u02df"+
		"\u02e2\7\u0170\2\2\u02e0\u02e2\5\u01b2\u00da\2\u02e1\u02db\3\2\2\2\u02e1"+
		"\u02e0\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2-\3\2\2\2\u02e3\u02e4\7L\2\2\u02e4"+
		"\u02e9\5\64\33\2\u02e5\u02e6\7\u015f\2\2\u02e6\u02e8\5\64\33\2\u02e7\u02e5"+
		"\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"/\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ec\u02ed\7L\2\2\u02ed\u02ee\5\64\33\2"+
		"\u02ee\u02f4\7\u0172\2\2\u02ef\u02f0\5\64\33\2\u02f0\u02f1\7\u0172\2\2"+
		"\u02f1\u02f3\3\2\2\2\u02f2\u02ef\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2"+
		"\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\61\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7"+
		"\u02f8\5\64\33\2\u02f8\u02fe\7\u0172\2\2\u02f9\u02fa\5\64\33\2\u02fa\u02fb"+
		"\7\u0172\2\2\u02fb\u02fd\3\2\2\2\u02fc\u02f9\3\2\2\2\u02fd\u0300\3\2\2"+
		"\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\63\3\2\2\2\u0300\u02fe"+
		"\3\2\2\2\u0301\u0307\5:\36\2\u0302\u0307\58\35\2\u0303\u0307\5@!\2\u0304"+
		"\u0307\5\66\34\2\u0305\u0307\5B\"\2\u0306\u0301\3\2\2\2\u0306\u0302\3"+
		"\2\2\2\u0306\u0303\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0305\3\2\2\2\u0307"+
		"\65\3\2\2\2\u0308\u030d\5\u01ca\u00e6\2\u0309\u030a\7\u015f\2\2\u030a"+
		"\u030c\5\u01ca\u00e6\2\u030b\u0309\3\2\2\2\u030c\u030f\3\2\2\2\u030d\u030b"+
		"\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0311\3\2\2\2\u030f\u030d\3\2\2\2\u0310"+
		"\u0312\7\20\2\2\u0311\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\3"+
		"\2\2\2\u0313\u0315\5x=\2\u0314\u0316\5z>\2\u0315\u0314\3\2\2\2\u0315\u0316"+
		"\3\2\2\2\u0316\u031a\3\2\2\2\u0317\u0319\5|?\2\u0318\u0317\3\2\2\2\u0319"+
		"\u031c\3\2\2\2\u031a\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031e\3\2"+
		"\2\2\u031c\u031a\3\2\2\2\u031d\u031f\5~@\2\u031e\u031d\3\2\2\2\u031e\u031f"+
		"\3\2\2\2\u031f\u032c\3\2\2\2\u0320\u0321\5\u01ca\u00e6\2\u0321\u0323\7"+
		"\63\2\2\u0322\u0324\7\20\2\2\u0323\u0322\3\2\2\2\u0323\u0324\3\2\2\2\u0324"+
		"\u0325\3\2\2\2\u0325\u0327\5x=\2\u0326\u0328\5z>\2\u0327\u0326\3\2\2\2"+
		"\u0327\u0328\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032a\5~@\2\u032a\u032c"+
		"\3\2\2\2\u032b\u0308\3\2\2\2\u032b\u0320\3\2\2\2\u032c\67\3\2\2\2\u032d"+
		"\u032e\5\u01ca\u00e6\2\u032e\u032f\7\67\2\2\u032f9\3\2\2\2\u0330\u0331"+
		"\7C\2\2\u0331\u0336\5\u01ca\u00e6\2\u0332\u0333\5\u01ca\u00e6\2\u0333"+
		"\u0334\7C\2\2\u0334\u0336\3\2\2\2\u0335\u0330\3\2\2\2\u0335\u0332\3\2"+
		"\2\2\u0336\u0339\3\2\2\2\u0337\u033a\5<\37\2\u0338\u033a\5> \2\u0339\u0337"+
		"\3\2\2\2\u0339\u0338\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033b\3\2\2\2\u033b"+
		"\u033e\t\5\2\2\u033c\u033f\5\u012c\u0097\2\u033d\u033f\5\u0192\u00ca\2"+
		"\u033e\u033c\3\2\2\2\u033e\u033d\3\2\2\2\u033f;\3\2\2\2\u0340\u0341\7"+
		"\u013d\2\2\u0341\u0343\7\u00ed\2\2\u0342\u0344\7\u00cb\2\2\u0343\u0342"+
		"\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0347\3\2\2\2\u0345\u0346\7\u0127\2"+
		"\2\u0346\u0348\t\6\2\2\u0347\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348="+
		"\3\2\2\2\u0349\u034a\7\u013e\2\2\u034a\u034b\7\u00ed\2\2\u034b?\3\2\2"+
		"\2\u034c\u034d\t\7\2\2\u034d\u034e\7\u0081\2\2\u034e\u0354\7u\2\2\u034f"+
		"\u0355\7\u010f\2\2\u0350\u0355\7\u0112\2\2\u0351\u0352\7\u00c3\2\2\u0352"+
		"\u0355\7x\2\2\u0353\u0355\5\u01ca\u00e6\2\u0354\u034f\3\2\2\2\u0354\u0350"+
		"\3\2\2\2\u0354\u0351\3\2\2\2\u0354\u0353\3\2\2\2\u0355\u0356\3\2\2\2\u0356"+
		"\u0357\5\b\5\2\u0357A\3\2\2\2\u0358\u035a\7}\2\2\u0359\u0358\3\2\2\2\u0359"+
		"\u035a\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035c\7\u0120\2\2\u035c\u035d"+
		"\7\u011e\2\2\u035d\u035f\5\u01ca\u00e6\2\u035e\u0360\5V,\2\u035f\u035e"+
		"\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0362\5H%\2\u0362"+
		"C\3\2\2\2\u0363\u0364\7=\2\2\u0364\u0368\7\u011e\2\2\u0365\u0366\7\u0088"+
		"\2\2\u0366\u0367\7\u00c3\2\2\u0367\u0369\7l\2\2\u0368\u0365\3\2\2\2\u0368"+
		"\u0369\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036c\5\u015c\u00af\2\u036b\u036d"+
		"\5V,\2\u036c\u036b\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036e\3\2\2\2\u036e"+
		"\u036f\5H%\2\u036fE\3\2\2\2\u0370\u0377\7=\2\2\u0371\u0372\7\u00a8\2\2"+
		"\u0372\u0378\7\u0120\2\2\u0373\u0375\t\b\2\2\u0374\u0373\3\2\2\2\u0374"+
		"\u0375\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0378\7\u0139\2\2\u0377\u0371"+
		"\3\2\2\2\u0377\u0374\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a\7\u011e\2"+
		"\2\u037a\u037c\5\u01ca\u00e6\2\u037b\u037d\5V,\2\u037c\u037b\3\2\2\2\u037c"+
		"\u037d\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u037f\5H%\2\u037fG\3\2\2\2\u0380"+
		"\u0382\7\20\2\2\u0381\u0380\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0383\3"+
		"\2\2\2\u0383\u0384\7\u016d\2\2\u0384\u0385\5\u012c\u0097\2\u0385\u0386"+
		"\7\u0170\2\2\u0386\u0390\3\2\2\2\u0387\u0389\7\20\2\2\u0388\u0387\3\2"+
		"\2\2\u0388\u0389\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u0390\5\u012c\u0097"+
		"\2\u038b\u038c\7\u016d\2\2\u038c\u038d\5J&\2\u038d\u038e\7\u0170\2\2\u038e"+
		"\u0390\3\2\2\2\u038f\u0381\3\2\2\2\u038f\u0388\3\2\2\2\u038f\u038b\3\2"+
		"\2\2\u0390\u0392\3\2\2\2\u0391\u0393\5\\/\2\u0392\u0391\3\2\2\2\u0392"+
		"\u0393\3\2\2\2\u0393I\3\2\2\2\u0394\u0399\5L\'\2\u0395\u0396\7\u015f\2"+
		"\2\u0396\u0398\5L\'\2\u0397\u0395\3\2\2\2\u0398\u039b\3\2\2\2\u0399\u0397"+
		"\3\2\2\2\u0399\u039a\3\2\2\2\u039aK\3\2\2\2\u039b\u0399\3\2\2\2\u039c"+
		"\u039d\5N(\2\u039d\u039f\5x=\2\u039e\u03a0\5z>\2\u039f\u039e\3\2\2\2\u039f"+
		"\u03a0\3\2\2\2\u03a0\u03a4\3\2\2\2\u03a1\u03a3\5|?\2\u03a2\u03a1\3\2\2"+
		"\2\u03a3\u03a6\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03aa"+
		"\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a7\u03a9\5P)\2\u03a8\u03a7\3\2\2\2\u03a9"+
		"\u03ac\3\2\2\2\u03aa\u03a8\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03b3\3\2"+
		"\2\2\u03ac\u03aa\3\2\2\2\u03ad\u03ae\78\2\2\u03ae\u03b0\5\u01ca\u00e6"+
		"\2\u03af\u03ad\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b3"+
		"\5R*\2\u03b2\u039c\3\2\2\2\u03b2\u03af\3\2\2\2\u03b3M\3\2\2\2\u03b4\u03b5"+
		"\5\u01ca\u00e6\2\u03b5O\3\2\2\2\u03b6\u03d7\5~@\2\u03b7\u03b9\7\u00c3"+
		"\2\2\u03b8\u03b7\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba"+
		"\u03d7\7\u00c5\2\2\u03bb\u03bc\7\u00db\2\2\u03bc\u03d7\7\u00a0\2\2\u03bd"+
		"\u03d7\7\u012e\2\2\u03be\u03bf\7\u00e6\2\2\u03bf\u03c0\5\u015c\u00af\2"+
		"\u03c0\u03c1\7\u016d\2\2\u03c1\u03c2\5\u01ca\u00e6\2\u03c2\u03c6\7\u0170"+
		"\2\2\u03c3\u03c5\5T+\2\u03c4\u03c3\3\2\2\2\u03c5\u03c8\3\2\2\2\u03c6\u03c4"+
		"\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03d7\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c9"+
		"\u03ca\7\u0087\2\2\u03ca\u03cb\7\u016d\2\2\u03cb\u03d0\7\u0177\2\2\u03cc"+
		"\u03cd\7\u015f\2\2\u03cd\u03cf\7\u0177\2\2\u03ce\u03cc\3\2\2\2\u03cf\u03d2"+
		"\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d3\3\2\2\2\u03d2"+
		"\u03d0\3\2\2\2\u03d3\u03d7\7\u0170\2\2\u03d4\u03d7\7\24\2\2\u03d5\u03d7"+
		"\7c\2\2\u03d6\u03b6\3\2\2\2\u03d6\u03b8\3\2\2\2\u03d6\u03bb\3\2\2\2\u03d6"+
		"\u03bd\3\2\2\2\u03d6\u03be\3\2\2\2\u03d6\u03c9\3\2\2\2\u03d6\u03d4\3\2"+
		"\2\2\u03d6\u03d5\3\2\2\2\u03d7Q\3\2\2\2\u03d8\u03d9\7\u00db\2\2\u03d9"+
		"\u03db\7\u00a0\2\2\u03da\u03dc\7-\2\2\u03db\u03da\3\2\2\2\u03db\u03dc"+
		"\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03de\7\u016d\2\2\u03de\u03e0\5\u01ca"+
		"\u00e6\2\u03df\u03e1\t\t\2\2\u03e0\u03df\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1"+
		"\u03e9\3\2\2\2\u03e2\u03e3\7\u015f\2\2\u03e3\u03e5\5\u01ca\u00e6\2\u03e4"+
		"\u03e6\t\t\2\2\u03e5\u03e4\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e8\3\2"+
		"\2\2\u03e7\u03e2\3\2\2\2\u03e8\u03eb\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9"+
		"\u03ea\3\2\2\2\u03ea\u03ec\3\2\2\2\u03eb\u03e9\3\2\2\2\u03ec\u03ee\7\u0170"+
		"\2\2\u03ed\u03ef\7c\2\2\u03ee\u03ed\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef"+
		"\u03f1\3\2\2\2\u03f0\u03f2\5\u00fe\u0080\2\u03f1\u03f0\3\2\2\2\u03f1\u03f2"+
		"\3\2\2\2\u03f2\u0412\3\2\2\2\u03f3\u03f4\7v\2\2\u03f4\u03f5\7\u00a0\2"+
		"\2\u03f5\u03f6\7\u016d\2\2\u03f6\u03fb\5\u01ca\u00e6\2\u03f7\u03f8\7\u015f"+
		"\2\2\u03f8\u03fa\5\u01ca\u00e6\2\u03f9\u03f7\3\2\2\2\u03fa\u03fd\3\2\2"+
		"\2\u03fb\u03f9\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fe\3\2\2\2\u03fd\u03fb"+
		"\3\2\2\2\u03fe\u03ff\7\u0170\2\2\u03ff\u0400\7\u00e6\2\2\u0400\u0401\5"+
		"\u015c\u00af\2\u0401\u0402\7\u016d\2\2\u0402\u0407\5\u01ca\u00e6\2\u0403"+
		"\u0404\7\u015f\2\2\u0404\u0406\5\u01ca\u00e6\2\u0405\u0403\3\2\2\2\u0406"+
		"\u0409\3\2\2\2\u0407\u0405\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u040a\3\2"+
		"\2\2\u0409\u0407\3\2\2\2\u040a\u040e\7\u0170\2\2\u040b\u040d\5T+\2\u040c"+
		"\u040b\3\2\2\2\u040d\u0410\3\2\2\2\u040e\u040c\3\2\2\2\u040e\u040f\3\2"+
		"\2\2\u040f\u0412\3\2\2\2\u0410\u040e\3\2\2\2\u0411\u03d8\3\2\2\2\u0411"+
		"\u03f3\3\2\2\2\u0412S\3\2\2\2\u0413\u0414\7\u00ca\2\2\u0414\u041d\t\n"+
		"\2\2\u0415\u0416\7\u00be\2\2\u0416\u041e\7\b\2\2\u0417\u041e\7\u00ea\2"+
		"\2\u0418\u0419\7\u0103\2\2\u0419\u041e\7\u00c5\2\2\u041a\u041b\7\u0103"+
		"\2\2\u041b\u041e\7M\2\2\u041c\u041e\7$\2\2\u041d\u0415\3\2\2\2\u041d\u0417"+
		"\3\2\2\2\u041d\u0418\3\2\2\2\u041d\u041a\3\2\2\2\u041d\u041c\3\2\2\2\u041e"+
		"U\3\2\2\2\u041f\u0421\5X-\2\u0420\u041f\3\2\2\2\u0421\u0422\3\2\2\2\u0422"+
		"\u0420\3\2\2\2\u0422\u0423\3\2\2\2\u0423W\3\2\2\2\u0424\u0425\7\u015f"+
		"\2\2\u0425\u0428\5Z.\2\u0426\u0428\5f\64\2\u0427\u0424\3\2\2\2\u0427\u0426"+
		"\3\2\2\2\u0428Y\3\2\2\2\u0429\u042b\7\u00be\2\2\u042a\u0429\3\2\2\2\u042a"+
		"\u042b\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042d\t\13\2\2\u042d[\3\2\2\2"+
		"\u042e\u0430\5^\60\2\u042f\u042e\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u042f"+
		"\3\2\2\2\u0431\u0432\3\2\2\2\u0432]\3\2\2\2\u0433\u0434\7\u00ca\2\2\u0434"+
		"\u0435\7\64\2\2\u0435\u0436\t\f\2\2\u0436\u043e\7\u00f5\2\2\u0437\u043e"+
		"\5`\61\2\u0438\u043e\5b\62\2\u0439\u043e\5d\63\2\u043a\u043e\5f\64\2\u043b"+
		"\u043e\5l\67\2\u043c\u043e\5n8\2\u043d\u0433\3\2\2\2\u043d\u0437\3\2\2"+
		"\2\u043d\u0438\3\2\2\2\u043d\u0439\3\2\2\2\u043d\u043a\3\2\2\2\u043d\u043b"+
		"\3\2\2\2\u043d\u043c\3\2\2\2\u043e_\3\2\2\2\u043f\u0440\7\u0100\2\2\u0440"+
		"\u0441\7>\2\2\u0441\u0452\t\r\2\2\u0442\u0443\t\16\2\2\u0443\u0452\7\u0177"+
		"\2\2\u0444\u0452\7\u00c0\2\2\u0445\u0452\t\17\2\2\u0446\u0447\7\u0116"+
		"\2\2\u0447\u044a\7\u016d\2\2\u0448\u044b\5\u01ca\u00e6\2\u0449\u044b\7"+
		"\u0177\2\2\u044a\u0448\3\2\2\2\u044a\u0449\3\2\2\2\u044b\u044c\3\2\2\2"+
		"\u044c\u044a\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u0452"+
		"\7\u0170\2\2\u044f\u0450\7\u011f\2\2\u0450\u0452\5\u01ca\u00e6\2\u0451"+
		"\u043f\3\2\2\2\u0451\u0442\3\2\2\2\u0451\u0444\3\2\2\2\u0451\u0445\3\2"+
		"\2\2\u0451\u0446\3\2\2\2\u0451\u044f\3\2\2\2\u0452a\3\2\2\2\u0453\u0455"+
		"\7\u008d\2\2\u0454\u0453\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0456\3\2\2"+
		"\2\u0456\u0457\7\u008b\2\2\u0457\u0475\5\u01ca\u00e6\2\u0458\u0459\7\u013d"+
		"\2\2\u0459\u0475\7\u00e8\2\2\u045a\u045b\7[\2\2\u045b\u045c\7 \2\2\u045c"+
		"\u045d\7\u0082\2\2\u045d\u045e\7\u016d\2\2\u045e\u0463\5\u01ca\u00e6\2"+
		"\u045f\u0460\7\u015f\2\2\u0460\u0462\5\u01ca\u00e6\2\u0461\u045f\3\2\2"+
		"\2\u0462\u0465\3\2\2\2\u0463\u0461\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u0466"+
		"\3\2\2\2\u0465\u0463\3\2\2\2\u0466\u0467\7\u0170\2\2\u0467\u0475\3\2\2"+
		"\2\u0468\u046a\7\u00c3\2\2\u0469\u0468\3\2\2\2\u0469\u046a\3\2\2\2\u046a"+
		"\u046b\3\2\2\2\u046b\u0475\7\u00ae\2\2\u046c\u046d\7\65\2\2\u046d\u0475"+
		"\t\20\2\2\u046e\u046f\7Q\2\2\u046f\u0475\7\u00cb\2\2\u0470\u0471\7\u013d"+
		"\2\2\u0471\u0472\7\u00ea\2\2\u0472\u0473\7\u00ca\2\2\u0473\u0475\7^\2"+
		"\2\u0474\u0454\3\2\2\2\u0474\u0458\3\2\2\2\u0474\u045a\3\2\2\2\u0474\u0469"+
		"\3\2\2\2\u0474\u046c\3\2\2\2\u0474\u046e\3\2\2\2\u0474\u0470\3\2\2\2\u0475"+
		"c\3\2\2\2\u0476\u0478\7\u012e\2\2\u0477\u0476\3\2\2\2\u0477\u0478\3\2"+
		"\2\2\u0478\u0479\3\2\2\2\u0479\u047a\7\u00db\2\2\u047a\u047b\7\u008d\2"+
		"\2\u047b\u047c\7\u016d\2\2\u047c\u0481\5\u01ca\u00e6\2\u047d\u047e\7\u015f"+
		"\2\2\u047e\u0480\5\u01ca\u00e6\2\u047f\u047d\3\2\2\2\u0480\u0483\3\2\2"+
		"\2\u0481\u047f\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0484\3\2\2\2\u0483\u0481"+
		"\3\2\2\2\u0484\u0485\7\u0170\2\2\u0485\u0489\3\2\2\2\u0486\u0487\7\u013d"+
		"\2\2\u0487\u0489\7E\2\2\u0488\u0477\3\2\2\2\u0488\u0486\3\2\2\2\u0489"+
		"e\3\2\2\2\u048a\u048f\5h\65\2\u048b\u048c\7\u0117\2\2\u048c\u048d\7\20"+
		"\2\2\u048d\u048f\5\u01ca\u00e6\2\u048e\u048a\3\2\2\2\u048e\u048b\3\2\2"+
		"\2\u048fg\3\2\2\2\u0490\u0491\7\u00f4\2\2\u0491\u0492\7w\2\2\u0492\u0496"+
		"\7S\2\2\u0493\u0495\5j\66\2\u0494\u0493\3\2\2\2\u0495\u0498\3\2\2\2\u0496"+
		"\u0494\3\2\2\2\u0496\u0497\3\2\2\2\u0497i\3\2\2\2\u0498\u0496\3\2\2\2"+
		"\u0499\u049a\7q\2\2\u049a\u049b\7\u0121\2\2\u049b\u049c\7 \2\2\u049c\u04a0"+
		"\5\u0192\u00ca\2\u049d\u049e\7f\2\2\u049e\u049f\7 \2\2\u049f\u04a1\5\u0192"+
		"\u00ca\2\u04a0\u049d\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04b5\3\2\2\2\u04a2"+
		"\u04a3\7\60\2\2\u04a3\u04a4\7\u009d\2\2\u04a4\u04a5\7\u0121\2\2\u04a5"+
		"\u04a6\7 \2\2\u04a6\u04b5\5\u0192\u00ca\2\u04a7\u04a8\7\u00b1\2\2\u04a8"+
		"\u04a9\7\u00a1\2\2\u04a9\u04aa\7\u0121\2\2\u04aa\u04ab\7 \2\2\u04ab\u04b5"+
		"\5\u0192\u00ca\2\u04ac\u04ad\7\u00a7\2\2\u04ad\u04ae\7\u0121\2\2\u04ae"+
		"\u04af\7 \2\2\u04af\u04b5\5\u0192\u00ca\2\u04b0\u04b1\7\u00c5\2\2\u04b1"+
		"\u04b2\7O\2\2\u04b2\u04b3\7\20\2\2\u04b3\u04b5\5\u0192\u00ca\2\u04b4\u0499"+
		"\3\2\2\2\u04b4\u04a2\3\2\2\2\u04b4\u04a7\3\2\2\2\u04b4\u04ac\3\2\2\2\u04b4"+
		"\u04b0\3\2\2\2\u04b5k\3\2\2\2\u04b6\u04b7\7\u00ca\2\2\u04b7\u04bb\5\u01ca"+
		"\u00e6\2\u04b8\u04b9\7\u0122\2\2\u04b9\u04bb\5\u01ca\u00e6\2\u04ba\u04b6"+
		"\3\2\2\2\u04ba\u04b8\3\2\2\2\u04bbm\3\2\2\2\u04bc\u04be\7\24\2\2\u04bd"+
		"\u04bf\7\u0163\2\2\u04be\u04bd\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c0"+
		"\3\2\2\2\u04c0\u04d8\5\u0192\u00ca\2\u04c1\u04c3\7\62\2\2\u04c2\u04c4"+
		"\7\u0163\2\2\u04c3\u04c2\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c5\3\2\2"+
		"\2\u04c5\u04d8\5\u0192\u00ca\2\u04c6\u04c8\7M\2\2\u04c7\u04c6\3\2\2\2"+
		"\u04c7\u04c8\3\2\2\2\u04c8\u04cc\3\2\2\2\u04c9\u04ca\7)\2\2\u04ca\u04cd"+
		"\7\u0103\2\2\u04cb\u04cd\7*\2\2\u04cc\u04c9\3\2\2\2\u04cc\u04cb\3\2\2"+
		"\2\u04cd\u04cf\3\2\2\2\u04ce\u04d0\7\u0163\2\2\u04cf\u04ce\3\2\2\2\u04cf"+
		"\u04d0\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d8\5\u0192\u00ca\2\u04d2\u04d4"+
		"\7e\2\2\u04d3\u04d5\7\u0163\2\2\u04d4\u04d3\3\2\2\2\u04d4\u04d5\3\2\2"+
		"\2\u04d5\u04d6\3\2\2\2\u04d6\u04d8\5\u0192\u00ca\2\u04d7\u04bc\3\2\2\2"+
		"\u04d7\u04c1\3\2\2\2\u04d7\u04c7\3\2\2\2\u04d7\u04d2\3\2\2\2\u04d8o\3"+
		"\2\2\2\u04d9\u04da\7\f\2\2\u04da\u04db\7\u011e\2\2\u04db\u04dc\5\u015c"+
		"\u00af\2\u04dc\u04dd\5r:\2\u04ddq\3\2\2\2\u04de\u04df\5t;\2\u04dfs\3\2"+
		"\2\2\u04e0\u04e3\7\t\2\2\u04e1\u04e2\78\2\2\u04e2\u04e4\5\u01ca\u00e6"+
		"\2\u04e3\u04e1\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6"+
		"\5v<\2\u04e6u\3\2\2\2\u04e7\u04e8\7\u00db\2\2\u04e8\u04ea\7\u00a0\2\2"+
		"\u04e9\u04eb\7-\2\2\u04ea\u04e9\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ec"+
		"\3\2\2\2\u04ec\u04ed\7\u016d\2\2\u04ed\u04ef\5\u01ca\u00e6\2\u04ee\u04f0"+
		"\t\t\2\2\u04ef\u04ee\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f8\3\2\2\2\u04f1"+
		"\u04f2\7\u015f\2\2\u04f2\u04f4\5\u01ca\u00e6\2\u04f3\u04f5\t\t\2\2\u04f4"+
		"\u04f3\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f7\3\2\2\2\u04f6\u04f1\3\2"+
		"\2\2\u04f7\u04fa\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9"+
		"\u04fb\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fb\u04fd\7\u0170\2\2\u04fc\u04fe"+
		"\7c\2\2\u04fd\u04fc\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u0500\3\2\2\2\u04ff"+
		"\u0501\5\u00fe\u0080\2\u0500\u04ff\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0526"+
		"\3\2\2\2\u0502\u0503\7v\2\2\u0503\u0504\7\u00a0\2\2\u0504\u0505\7\u016d"+
		"\2\2\u0505\u050a\5\u01ca\u00e6\2\u0506\u0507\7\u015f\2\2\u0507\u0509\5"+
		"\u01ca\u00e6\2\u0508\u0506\3\2\2\2\u0509\u050c\3\2\2\2\u050a\u0508\3\2"+
		"\2\2\u050a\u050b\3\2\2\2\u050b\u050d\3\2\2\2\u050c\u050a\3\2\2\2\u050d"+
		"\u050e\7\u0170\2\2\u050e\u050f\7\u00e6\2\2\u050f\u0510\5\u015c\u00af\2"+
		"\u0510\u0511\7\u016d\2\2\u0511\u0516\5\u01ca\u00e6\2\u0512\u0513\7\u015f"+
		"\2\2\u0513\u0515\5\u01ca\u00e6\2\u0514\u0512\3\2\2\2\u0515\u0518\3\2\2"+
		"\2\u0516\u0514\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0519\3\2\2\2\u0518\u0516"+
		"\3\2\2\2\u0519\u051d\7\u0170\2\2\u051a\u051c\5T+\2\u051b\u051a\3\2\2\2"+
		"\u051c\u051f\3\2\2\2\u051d\u051b\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u0526"+
		"\3\2\2\2\u051f\u051d\3\2\2\2\u0520\u0521\7M\2\2\u0521\u0522\5\u0192\u00ca"+
		"\2\u0522\u0523\7u\2\2\u0523\u0524\5\u01ca\u00e6\2\u0524\u0526\3\2\2\2"+
		"\u0525\u04e7\3\2\2\2\u0525\u0502\3\2\2\2\u0525\u0520\3\2\2\2\u0526w\3"+
		"\2\2\2\u0527\u0555\7(\2\2\u0528\u0555\7\31\2\2\u0529\u0555\7\32\2\2\u052a"+
		"\u0555\7\33\2\2\u052b\u0555\7\34\2\2\u052c\u0555\7\35\2\2\u052d\u0555"+
		"\7F\2\2\u052e\u0555\7G\2\2\u052f\u0555\7J\2\2\u0530\u0555\7K\2\2\u0531"+
		"\u0533\7]\2\2\u0532\u0534\7\u00d9\2\2\u0533\u0532\3\2\2\2\u0533\u0534"+
		"\3\2\2\2\u0534\u0555\3\2\2\2\u0535\u0555\7t\2\2\u0536\u0555\7\u0092\2"+
		"\2\u0537\u0555\7\u0093\2\2\u0538\u0555\7\u0094\2\2\u0539\u0555\7\u0095"+
		"\2\2\u053a\u0555\7\u0096\2\2\u053b\u0555\7\u00bb\2\2\u053c\u0555\7\u00bd"+
		"\2\2\u053d\u0555\7\u00c7\2\2\u053e\u0555\7\u00c6\2\2\u053f\u0555\7\u00d8"+
		"\2\2\u0540\u0555\7\u00e5\2\2\u0541\u0542\7\u00ec\2\2\u0542\u0555\7\u0138"+
		"\2\2\u0543\u0555\7\u010a\2\2\u0544\u0555\7\u0109\2\2\u0545\u0555\7\u010b"+
		"\2\2\u0546\u0555\7\u010d\2\2\u0547\u0555\7\u010c\2\2\u0548\u0555\7\u0118"+
		"\2\2\u0549\u0555\7\u011d\2\2\u054a\u0555\7\u0124\2\2\u054b\u0555\7\u0125"+
		"\2\2\u054c\u0555\7\u0136\2\2\u054d\u0555\7\u0137\2\2\u054e\u0555\7\u0141"+
		"\2\2\u054f\u0552\5\u01ca\u00e6\2\u0550\u0551\7\5\2\2\u0551\u0553\t\21"+
		"\2\2\u0552\u0550\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0555\3\2\2\2\u0554"+
		"\u0527\3\2\2\2\u0554\u0528\3\2\2\2\u0554\u0529\3\2\2\2\u0554\u052a\3\2"+
		"\2\2\u0554\u052b\3\2\2\2\u0554\u052c\3\2\2\2\u0554\u052d\3\2\2\2\u0554"+
		"\u052e\3\2\2\2\u0554\u052f\3\2\2\2\u0554\u0530\3\2\2\2\u0554\u0531\3\2"+
		"\2\2\u0554\u0535\3\2\2\2\u0554\u0536\3\2\2\2\u0554\u0537\3\2\2\2\u0554"+
		"\u0538\3\2\2\2\u0554\u0539\3\2\2\2\u0554\u053a\3\2\2\2\u0554\u053b\3\2"+
		"\2\2\u0554\u053c\3\2\2\2\u0554\u053d\3\2\2\2\u0554\u053e\3\2\2\2\u0554"+
		"\u053f\3\2\2\2\u0554\u0540\3\2\2\2\u0554\u0541\3\2\2\2\u0554\u0543\3\2"+
		"\2\2\u0554\u0544\3\2\2\2\u0554\u0545\3\2\2\2\u0554\u0546\3\2\2\2\u0554"+
		"\u0547\3\2\2\2\u0554\u0548\3\2\2\2\u0554\u0549\3\2\2\2\u0554\u054a\3\2"+
		"\2\2\u0554\u054b\3\2\2\2\u0554\u054c\3\2\2\2\u0554\u054d\3\2\2\2\u0554"+
		"\u054e\3\2\2\2\u0554\u054f\3\2\2\2\u0555y\3\2\2\2\u0556\u0557\7\u016d"+
		"\2\2\u0557\u0559\t\22\2\2\u0558\u055a\t\23\2\2\u0559\u0558\3\2\2\2\u0559"+
		"\u055a\3\2\2\2\u055a\u055d\3\2\2\2\u055b\u055c\7\u015f\2\2\u055c\u055e"+
		"\7\u0177\2\2\u055d\u055b\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u055f\3\2\2"+
		"\2\u055f\u0560\7\u0170\2\2\u0560{\3\2\2\2\u0561\u0563\7\u00c3\2\2\u0562"+
		"\u0561\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u056d\7\u00c5"+
		"\2\2\u0565\u0566\7)\2\2\u0566\u0567\7\u0103\2\2\u0567\u056d\5\u01ca\u00e6"+
		"\2\u0568\u056a\7\u00c3\2\2\u0569\u0568\3\2\2\2\u0569\u056a\3\2\2\2\u056a"+
		"\u056b\3\2\2\2\u056b\u056d\t\24\2\2\u056c\u0562\3\2\2\2\u056c\u0565\3"+
		"\2\2\2\u056c\u0569\3\2\2\2\u056d}\3\2\2\2\u056e\u0570\7\u015e\2\2\u056f"+
		"\u056e\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0572\7\u0163"+
		"\2\2\u0572\u057b\5\u0192\u00ca\2\u0573\u0575\7\u013d\2\2\u0574\u0573\3"+
		"\2\2\2\u0574\u0575\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0578\7M\2\2\u0577"+
		"\u0579\5\u0192\u00ca\2\u0578\u0577\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057b"+
		"\3\2\2\2\u057a\u056f\3\2\2\2\u057a\u0574\3\2\2\2\u057b\177\3\2\2\2\u057c"+
		"\u057d\7=\2\2\u057d\u0581\t\25\2\2\u057e\u057f\7\u0088\2\2\u057f\u0580"+
		"\7\u00c3\2\2\u0580\u0582\7l\2\2\u0581\u057e\3\2\2\2\u0581\u0582\3\2\2"+
		"\2\u0582\u0583\3\2\2\2\u0583\u0587\5\u0192\u00ca\2\u0584\u0586\5\u0082"+
		"B\2\u0585\u0584\3\2\2\2\u0586\u0589\3\2\2\2\u0587\u0585\3\2\2\2\u0587"+
		"\u0588\3\2\2\2\u0588\u0081\3\2\2\2\u0589\u0587\3\2\2\2\u058a\u058b\7\62"+
		"\2\2\u058b\u058f\5\u0192\u00ca\2\u058c\u058d\7\u00a9\2\2\u058d\u058f\5"+
		"\u0192\u00ca\2\u058e\u058a\3\2\2\2\u058e\u058c\3\2\2\2\u058f\u0083\3\2"+
		"\2\2\u0590\u0598\7\f\2\2\u0591\u0594\7=\2\2\u0592\u0593\7\u00cd\2\2\u0593"+
		"\u0595\7\u00e8\2\2\u0594\u0592\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0598"+
		"\3\2\2\2\u0596\u0598\7\u00e8\2\2\u0597\u0590\3\2\2\2\u0597\u0591\3\2\2"+
		"\2\u0597\u0596\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059a"+
		"\7{\2\2\u059a\u059c\5\u01ca\u00e6\2\u059b\u059d\5\u0096L\2\u059c\u059b"+
		"\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u05a0\5\u0086D"+
		"\2\u059f\u05a1\t\26\2\2\u05a0\u059f\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1"+
		"\u05a3\3\2\2\2\u05a2\u05a4\5\62\32\2\u05a3\u05a2\3\2\2\2\u05a3\u05a4\3"+
		"\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05a6\5\b\5\2\u05a6\u0085\3\2\2\2\u05a7"+
		"\u05a8\t\27\2\2\u05a8\u05aa\5x=\2\u05a9\u05ab\5z>\2\u05aa\u05a9\3\2\2"+
		"\2\u05aa\u05ab\3\2\2\2\u05ab\u0087\3\2\2\2\u05ac\u05b4\7\f\2\2\u05ad\u05b0"+
		"\7=\2\2\u05ae\u05af\7\u00cd\2\2\u05af\u05b1\7\u00e8\2\2\u05b0\u05ae\3"+
		"\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b4\3\2\2\2\u05b2\u05b4\7\u00e8\2\2"+
		"\u05b3\u05ac\3\2\2\2\u05b3\u05ad\3\2\2\2\u05b3\u05b2\3\2\2\2\u05b3\u05b4"+
		"\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b6\7\u00d4\2\2\u05b6\u05b7\5\u01ca"+
		"\u00e6\2\u05b7\u05b8\t\26\2\2\u05b8\u05b9\5\u008aF\2\u05b9\u05bd\7d\2"+
		"\2\u05ba\u05bb\5\u01ca\u00e6\2\u05bb\u05bc\7\u0172\2\2\u05bc\u05be\3\2"+
		"\2\2\u05bd\u05ba\3\2\2\2\u05bd\u05be\3\2\2\2\u05be\u0089\3\2\2\2\u05bf"+
		"\u05c0\5\u008cG\2\u05c0\u05c6\7\u0172\2\2\u05c1\u05c2\5\u008cG\2\u05c2"+
		"\u05c3\7\u0172\2\2\u05c3\u05c5\3\2\2\2\u05c4\u05c1\3\2\2\2\u05c5\u05c8"+
		"\3\2\2\2\u05c6\u05c4\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u008b\3\2\2\2\u05c8"+
		"\u05c6\3\2\2\2\u05c9\u05d7\5\64\33\2\u05ca\u05cb\7{\2\2\u05cb\u05cd\5"+
		"\u01ca\u00e6\2\u05cc\u05ce\5\u0096L\2\u05cd\u05cc\3\2\2\2\u05cd\u05ce"+
		"\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d0\5\u0086D\2\u05d0\u05d7\3\2\2"+
		"\2\u05d1\u05d2\t\30\2\2\u05d2\u05d4\5\u01ca\u00e6\2\u05d3\u05d5\5\u0096"+
		"L\2\u05d4\u05d3\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d7\3\2\2\2\u05d6"+
		"\u05c9\3\2\2\2\u05d6\u05ca\3\2\2\2\u05d6\u05d1\3\2\2\2\u05d7\u008d\3\2"+
		"\2\2\u05d8\u05e0\7\f\2\2\u05d9\u05dc\7=\2\2\u05da\u05db\7\u00cd\2\2\u05db"+
		"\u05dd\7\u00e8\2\2\u05dc\u05da\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05e0"+
		"\3\2\2\2\u05de\u05e0\7\u00e8\2\2\u05df\u05d8\3\2\2\2\u05df\u05d9\3\2\2"+
		"\2\u05df\u05de\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e2"+
		"\7\u00d4\2\2\u05e2\u05e3\7\36\2\2\u05e3\u05e4\5\u01ca\u00e6\2\u05e4\u05e5"+
		"\t\26\2\2\u05e5\u05e6\5\u0090I\2\u05e6\u05ea\7d\2\2\u05e7\u05e8\5\u01ca"+
		"\u00e6\2\u05e8\u05e9\7\u0172\2\2\u05e9\u05eb\3\2\2\2\u05ea\u05e7\3\2\2"+
		"\2\u05ea\u05eb\3\2\2\2\u05eb\u008f\3\2\2\2\u05ec\u05ed\5\u0092J\2\u05ed"+
		"\u05f3\7\u0172\2\2\u05ee\u05ef\5\u0092J\2\u05ef\u05f0\7\u0172\2\2\u05f0"+
		"\u05f2\3\2\2\2\u05f1\u05ee\3\2\2\2\u05f2\u05f5\3\2\2\2\u05f3\u05f1\3\2"+
		"\2\2\u05f3\u05f4\3\2\2\2\u05f4\u0091\3\2\2\2\u05f5\u05f3\3\2\2\2\u05f6"+
		"\u05fa\5\64\33\2\u05f7\u05fa\5\u0084C\2\u05f8\u05fa\5\u0094K\2\u05f9\u05f6"+
		"\3\2\2\2\u05f9\u05f7\3\2\2\2\u05f9\u05f8\3\2\2\2\u05fa\u0093\3\2\2\2\u05fb"+
		"\u0603\7\f\2\2\u05fc\u05ff\7=\2\2\u05fd\u05fe\7\u00cd\2\2\u05fe\u0600"+
		"\7\u00e8\2\2\u05ff\u05fd\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0603\3\2\2"+
		"\2\u0601\u0603\7\u00e8\2\2\u0602\u05fb\3\2\2\2\u0602\u05fc\3\2\2\2\u0602"+
		"\u0601\3\2\2\2\u0602\u0603\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u0605\t\30"+
		"\2\2\u0605\u0607\5\u01ca\u00e6\2\u0606\u0608\5\u0096L\2\u0607\u0606\3"+
		"\2\2\2\u0607\u0608\3\2\2\2\u0608\u060a\3\2\2\2\u0609\u060b\5\u009aN\2"+
		"\u060a\u0609\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060d\3\2\2\2\u060c\u060e"+
		"\t\26\2\2\u060d\u060c\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u0610\3\2\2\2"+
		"\u060f\u0611\5\62\32\2\u0610\u060f\3\2\2\2\u0610\u0611\3\2\2\2\u0611\u0613"+
		"\3\2\2\2\u0612\u0614\5\u0128\u0095\2\u0613\u0612\3\2\2\2\u0613\u0614\3"+
		"\2\2\2\u0614\u0615\3\2\2\2\u0615\u0619\5\f\7\2\u0616\u0617\5\u01ca\u00e6"+
		"\2\u0617\u0618\7\u0172\2\2\u0618\u061a\3\2\2\2\u0619\u0616\3\2\2\2\u0619"+
		"\u061a\3\2\2\2\u061a\u0095\3\2\2\2\u061b\u061c\7\u016d\2\2\u061c\u0632"+
		"\7\u0170\2\2\u061d\u061e\7\u016d\2\2\u061e\u0623\5\u0098M\2\u061f\u0620"+
		"\7\u015f\2\2\u0620\u0622\5\u0098M\2\u0621\u061f\3\2\2\2\u0622\u0625\3"+
		"\2\2\2\u0623\u0621\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0626\3\2\2\2\u0625"+
		"\u0623\3\2\2\2\u0626\u0627\7\u0170\2\2\u0627\u0632\3\2\2\2\u0628\u0629"+
		"\6L\4\2\u0629\u062e\5\u0098M\2\u062a\u062b\7\u015f\2\2\u062b\u062d\5\u0098"+
		"M\2\u062c\u062a\3\2\2\2\u062d\u0630\3\2\2\2\u062e\u062c\3\2\2\2\u062e"+
		"\u062f\3\2\2\2\u062f\u0632\3\2\2\2\u0630\u062e\3\2\2\2\u0631\u061b\3\2"+
		"\2\2\u0631\u061d\3\2\2\2\u0631\u0628\3\2\2\2\u0632\u0097\3\2\2\2\u0633"+
		"\u0639\7\u008b\2\2\u0634\u0639\7\u00cf\2\2\u0635\u0639\7\u0090\2\2\u0636"+
		"\u0637\7\u008b\2\2\u0637\u0639\7\u00cf\2\2\u0638\u0633\3\2\2\2\u0638\u0634"+
		"\3\2\2\2\u0638\u0635\3\2\2\2\u0638\u0636\3\2\2\2\u0638\u0639\3\2\2\2\u0639"+
		"\u063a\3\2\2\2\u063a\u063b\5\u01ca\u00e6\2\u063b\u063d\5x=\2\u063c\u063e"+
		"\5z>\2\u063d\u063c\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u0642\3\2\2\2\u063f"+
		"\u0641\5|?\2\u0640\u063f\3\2\2\2\u0641\u0644\3\2\2\2\u0642\u0640\3\2\2"+
		"\2\u0642\u0643\3\2\2\2\u0643\u0646\3\2\2\2\u0644\u0642\3\2\2\2\u0645\u0647"+
		"\5~@\2\u0646\u0645\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u065e\3\2\2\2\u0648"+
		"\u064e\5\u01ca\u00e6\2\u0649\u064f\7\u008b\2\2\u064a\u064f\7\u00cf\2\2"+
		"\u064b\u064f\7\u0090\2\2\u064c\u064d\7\u008b\2\2\u064d\u064f\7\u00cf\2"+
		"\2\u064e\u0649\3\2\2\2\u064e\u064a\3\2\2\2\u064e\u064b\3\2\2\2\u064e\u064c"+
		"\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u0652\5x=\2\u0651"+
		"\u0653\5z>\2\u0652\u0651\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0657\3\2\2"+
		"\2\u0654\u0656\5|?\2\u0655\u0654\3\2\2\2\u0656\u0659\3\2\2\2\u0657\u0655"+
		"\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u065b\3\2\2\2\u0659\u0657\3\2\2\2\u065a"+
		"\u065c\5~@\2\u065b\u065a\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u065e\3\2\2"+
		"\2\u065d\u0638\3\2\2\2\u065d\u0648\3\2\2\2\u065e\u0099\3\2\2\2\u065f\u0661"+
		"\5\u009cO\2\u0660\u065f\3\2\2\2\u0661\u0662\3\2\2\2\u0662\u0660\3\2\2"+
		"\2\u0662\u0663\3\2\2\2\u0663\u009b\3\2\2\2\u0664\u0665\7\u00a2\2\2\u0665"+
		"\u0670\7\u010e\2\2\u0666\u0667\7\u010e\2\2\u0667\u0668\7\u00ff\2\2\u0668"+
		"\u0670\t\31\2\2\u0669\u066b\7_\2\2\u066a\u0669\3\2\2\2\u066a\u066b\3\2"+
		"\2\2\u066b\u066c\3\2\2\2\u066c\u066d\7\u00eb\2\2\u066d\u066e\7\u0106\2"+
		"\2\u066e\u0670\7\u0177\2\2\u066f\u0664\3\2\2\2\u066f\u0666\3\2\2\2\u066f"+
		"\u066a\3\2\2\2\u0670\u009d\3\2\2\2\u0671\u0672\7^\2\2\u0672\u0675\7\u011e"+
		"\2\2\u0673\u0674\7\u0088\2\2\u0674\u0676\7l\2\2\u0675\u0673\3\2\2\2\u0675"+
		"\u0676\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u0680\5\u015c\u00af\2\u0678\u0679"+
		"\7^\2\2\u0679\u067c\t\25\2\2\u067a\u067b\7\u0088\2\2\u067b\u067d\7l\2"+
		"\2\u067c\u067a\3\2\2\2\u067c\u067d\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0680"+
		"\5\u0192\u00ca\2\u067f\u0671\3\2\2\2\u067f\u0678\3\2\2\2\u0680\u009f\3"+
		"\2\2\2\u0681\u0682\7d\2\2\u0682\u0683\7\u0129\2\2\u0683\u00a1\3\2\2\2"+
		"\u0684\u0686\t\32\2\2\u0685\u0687\7\u008a\2\2\u0686\u0685\3\2\2\2\u0686"+
		"\u0687\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u068e\5\u0192\u00ca\2\u0689\u068a"+
		"\7\u016d\2\2\u068a\u068b\5\u01b2\u00da\2\u068b\u068c\7\u0170\2\2\u068c"+
		"\u068f\3\2\2\2\u068d\u068f\5\u01b2\u00da\2\u068e\u0689\3\2\2\2\u068e\u068d"+
		"\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u0699\3\2\2\2\u0690\u0691\7\u0099\2"+
		"\2\u0691\u0696\7\u0174\2\2\u0692\u0693\7\u015f\2\2\u0693\u0695\7\u0174"+
		"\2\2\u0694\u0692\3\2\2\2\u0695\u0698\3\2\2\2\u0696\u0694\3\2\2\2\u0696"+
		"\u0697\3\2\2\2\u0697\u069a\3\2\2\2\u0698\u0696\3\2\2\2\u0699\u0690\3\2"+
		"\2\2\u0699\u069a\3\2\2\2\u069a\u069c\3\2\2\2\u069b\u069d\5\u012a\u0096"+
		"\2\u069c\u069b\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u00a3\3\2\2\2\u069e\u06a2"+
		"\5\u00a6T\2\u069f\u06a2\5\u00a8U\2\u06a0\u06a2\5\u00aaV\2\u06a1\u069e"+
		"\3\2\2\2\u06a1\u069f\3\2\2\2\u06a1\u06a0\3\2\2\2\u06a2\u00a5\3\2\2\2\u06a3"+
		"\u06a4\7\u0088\2\2\u06a4\u06a5\5\u0182\u00c2\2\u06a5\u06a6\7\u0123\2\2"+
		"\u06a6\u06aa\5\4\3\2\u06a7\u06a9\5\u00acW\2\u06a8\u06a7\3\2\2\2\u06a9"+
		"\u06ac\3\2\2\2\u06aa\u06a8\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u06ae\3\2"+
		"\2\2\u06ac\u06aa\3\2\2\2\u06ad\u06af\5\u00aeX\2\u06ae\u06ad\3\2\2\2\u06ae"+
		"\u06af\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0\u06b1\7d\2\2\u06b1\u06b2\7\u0088"+
		"\2\2\u06b2\u00a7\3\2\2\2\u06b3\u06b4\7\u0088\2\2\u06b4\u06b5\5\u0182\u00c2"+
		"\2\u06b5\u06b8\5\b\5\2\u06b6\u06b7\7`\2\2\u06b7\u06b9\5\b\5\2\u06b8\u06b6"+
		"\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u00a9\3\2\2\2\u06ba\u06bb\7\6\2\2\u06bb"+
		"\u06bc\7\u0088\2\2\u06bc\u06bd\5\u0182\u00c2\2\u06bd\u06be\7\u0123\2\2"+
		"\u06be\u06bf\5\b\5\2\u06bf\u00ab\3\2\2\2\u06c0\u06c1\t\33\2\2\u06c1\u06c2"+
		"\5\u0182\u00c2\2\u06c2\u06c3\7\u0123\2\2\u06c3\u06c4\5\4\3\2\u06c4\u00ad"+
		"\3\2\2\2\u06c5\u06c6\7`\2\2\u06c6\u06c7\5\4\3\2\u06c7\u00af\3\2\2\2\u06c8"+
		"\u06cb\7\u008c\2\2\u06c9\u06cc\5\u01c4\u00e3\2\u06ca\u06cc\5\u0192\u00ca"+
		"\2\u06cb\u06c9\3\2\2\2\u06cb\u06ca\3\2\2\2\u06cc\u00b1\3\2\2\2\u06cd\u06d4"+
		"\7\u0091\2\2\u06ce\u06cf\7\u00d2\2\2\u06cf\u06d5\7\u011e\2\2\u06d0\u06d2"+
		"\7\u0099\2\2\u06d1\u06d3\7\u011e\2\2\u06d2\u06d1\3\2\2\2\u06d2\u06d3\3"+
		"\2\2\2\u06d3\u06d5\3\2\2\2\u06d4\u06ce\3\2\2\2\u06d4\u06d0\3\2\2\2\u06d5"+
		"\u06d6\3\2\2\2\u06d6\u06d8\5\u015c\u00af\2\u06d7\u06d9\5\u00b4[\2\u06d8"+
		"\u06d7\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9\u06dc\3\2\2\2\u06da\u06dd\5\u012c"+
		"\u0097\2\u06db\u06dd\5\u00b6\\\2\u06dc\u06da\3\2\2\2\u06dc\u06db\3\2\2"+
		"\2\u06dd\u00b3\3\2\2\2\u06de\u06df\7\u016d\2\2\u06df\u06e4\5\u01ca\u00e6"+
		"\2\u06e0\u06e1\7\u015f\2\2\u06e1\u06e3\5\u01ca\u00e6\2\u06e2\u06e0\3\2"+
		"\2\2\u06e3\u06e6\3\2\2\2\u06e4\u06e2\3\2\2\2\u06e4\u06e5\3\2\2\2\u06e5"+
		"\u06e7\3\2\2\2\u06e6\u06e4\3\2\2\2\u06e7\u06e8\7\u0170\2\2\u06e8\u00b5"+
		"\3\2\2\2\u06e9\u06ea\7\u0134\2\2\u06ea\u06ef\5\u00b8]\2\u06eb\u06ec\7"+
		"\u015f\2\2\u06ec\u06ee\5\u00b8]\2\u06ed\u06eb\3\2\2\2\u06ee\u06f1\3\2"+
		"\2\2\u06ef\u06ed\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0\u00b7\3\2\2\2\u06f1"+
		"\u06ef\3\2\2\2\u06f2\u06f3\7\u016d\2\2\u06f3\u06f8\5\u0192\u00ca\2\u06f4"+
		"\u06f5\7\u015f\2\2\u06f5\u06f7\5\u0192\u00ca\2\u06f6\u06f4\3\2\2\2\u06f7"+
		"\u06fa\3\2\2\2\u06f8\u06f6\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9\u06fb\3\2"+
		"\2\2\u06fa\u06f8\3\2\2\2\u06fb\u06fc\7\u0170\2\2\u06fc\u00b9\3\2\2\2\u06fd"+
		"\u06fe\7\u0091\2\2\u06fe\u0700\7\u00d2\2\2\u06ff\u0701\7\u00a8\2\2\u0700"+
		"\u06ff\3\2\2\2\u0700\u0701\3\2\2\2\u0701\u0702\3\2\2\2\u0702\u0703\7Y"+
		"\2\2\u0703\u0704\5\u01b8\u00dd\2\u0704\u0705\5\u01b6\u00dc\2\u0705\u00bb"+
		"\3\2\2\2\u0706\u0707\7\u00ca\2\2\u0707\u0709\5\u015c\u00af\2\u0708\u070a"+
		"\5\u00be`\2\u0709\u0708\3\2\2\2\u0709\u070a\3\2\2\2\u070a\u070c\3\2\2"+
		"\2\u070b\u070d\5\u015a\u00ae\2\u070c\u070b\3\2\2\2\u070c\u070d\3\2\2\2"+
		"\u070d\u070f\3\2\2\2\u070e\u0710\5\u015e\u00b0\2\u070f\u070e\3\2\2\2\u070f"+
		"\u0710\3\2\2\2\u0710\u0711\3\2\2\2\u0711\u0712\5\u00c0a\2\u0712\u00bd"+
		"\3\2\2\2\u0713\u0714\7\u016d\2\2\u0714\u0715\5\u013c\u009f\2\u0715\u0716"+
		"\7\u0170\2\2\u0716\u00bf\3\2\2\2\u0717\u0718\7\u0143\2\2\u0718\u0719\5"+
		"\u016e\u00b8\2\u0719\u00c1\3\2\2\2\u071a\u071b\7\u00ca\2\2\u071b\u071d"+
		"\5\u015c\u00af\2\u071c\u071e\5\u00c4c\2\u071d\u071c\3\2\2\2\u071d\u071e"+
		"\3\2\2\2\u071e\u0720\3\2\2\2\u071f\u0721\5\u00c6d\2\u0720\u071f\3\2\2"+
		"\2\u0720\u0721\3\2\2\2\u0721\u0723\3\2\2\2\u0722\u0724\5\u00c8e\2\u0723"+
		"\u0722\3\2\2\2\u0723\u0724\3\2\2\2\u0724\u0726\3\2\2\2\u0725\u0727\5\u015e"+
		"\u00b0\2\u0726\u0725\3\2\2\2\u0726\u0727\3\2\2\2\u0727\u0728\3\2\2\2\u0728"+
		"\u0729\5\u00caf\2\u0729\u00c3\3\2\2\2\u072a\u072b\7\u016d\2\2\u072b\u072c"+
		"\5\u013c\u009f\2\u072c\u072d\7\u0170\2\2\u072d\u00c5\3\2\2\2\u072e\u0730"+
		"\7\u013d\2\2\u072f\u0731\5\u01ca\u00e6\2\u0730\u072f\3\2\2\2\u0730\u0731"+
		"\3\2\2\2\u0731\u0736\3\2\2\2\u0732\u0733\7\u015f\2\2\u0733\u0735\5\u01ca"+
		"\u00e6\2\u0734\u0732\3\2\2\2\u0735\u0738\3\2\2\2\u0736\u0734\3\2\2\2\u0736"+
		"\u0737\3\2\2\2\u0737\u00c7\3\2\2\2\u0738\u0736\3\2\2\2\u0739\u073a\7\20"+
		"\2\2\u073a\u073b\5\u01ca\u00e6\2\u073b\u00c9\3\2\2\2\u073c\u073d\7\u0144"+
		"\2\2\u073d\u073e\5\u0182\u00c2\2\u073e\u00cb\3\2\2\2\u073f\u0741\7m\2"+
		"\2\u0740\u0742\7\u0174\2\2\u0741\u0740\3\2\2\2\u0741\u0742\3\2\2\2\u0742"+
		"\u0745\3\2\2\2\u0743\u0744\7\u013a\2\2\u0744\u0746\5\u0182\u00c2\2\u0745"+
		"\u0743\3\2\2\2\u0745\u0746\3\2\2\2\u0746\u00cd\3\2\2\2\u0747\u0748\7|"+
		"\2\2\u0748\u0749\7W\2\2\u0749\u074a\5\u00d0i\2\u074a\u00cf\3\2\2\2\u074b"+
		"\u074e\5\u00d2j\2\u074c\u074e\5\u00d4k\2\u074d\u074b\3\2\2\2\u074d\u074c"+
		"\3\2\2\2\u074e\u00d1\3\2\2\2\u074f\u0750\7j\2\2\u0750\u0751\7\u0177\2"+
		"\2\u0751\u0752\5\u01ca\u00e6\2\u0752\u0753\7\u0163\2\2\u0753\u0754\7\u00b6"+
		"\2\2\u0754\u00d3\3\2\2\2\u0755\u0756\5\u01ca\u00e6\2\u0756\u0757\7\u0163"+
		"\2\2\u0757\u0758\7\u00f7\2\2\u0758\u00d5\3\2\2\2\u0759\u075a\7\177\2\2"+
		"\u075a\u075f\5\u00d8m\2\u075b\u075c\7\u015f\2\2\u075c\u075e\5\u00d8m\2"+
		"\u075d\u075b\3\2\2\2\u075e\u0761\3\2\2\2\u075f\u075d\3\2\2\2\u075f\u0760"+
		"\3\2\2\2\u0760\u0762\3\2\2\2\u0761\u075f\3\2\2\2\u0762\u0763\7\u0127\2"+
		"\2\u0763\u0764\7\u00f2\2\2\u0764\u0765\5\u01ca\u00e6\2\u0765\u00d7\3\2"+
		"\2\2\u0766\u0767\7i\2\2\u0767\u0768\7\u00ca\2\2\u0768\u0769\7\u00df\2"+
		"\2\u0769\u076a\5\u01ca\u00e6\2\u076a\u00d9\3\2\2\2\u076b\u076d\7\u00a3"+
		"\2\2\u076c\u076e\7\u0174\2\2\u076d\u076c\3\2\2\2\u076d\u076e\3\2\2\2\u076e"+
		"\u00db\3\2\2\2\u076f\u0770\7\u00b1\2\2\u0770\u0771\7\u00c8\2\2\u0771\u0774"+
		"\5\u0192\u00ca\2\u0772\u0773\7\u0127\2\2\u0773\u0775\5\u0192\u00ca\2\u0774"+
		"\u0772\3\2\2\2\u0774\u0775\3\2\2\2\u0775\u0778\3\2\2\2\u0776\u0777\7\23"+
		"\2\2\u0777\u0779\5\u0192\u00ca\2\u0778\u0776\3\2\2\2\u0778\u0779\3\2\2"+
		"\2\u0779\u00dd\3\2\2\2\u077a\u077b\7\u00cc\2\2\u077b\u0781\7\u0174\2\2"+
		"\u077c\u077f\7u\2\2\u077d\u0780\5\u012c\u0097\2\u077e\u0780\5\u0192\u00ca"+
		"\2\u077f\u077d\3\2\2\2\u077f\u077e\3\2\2\2\u0780\u0782\3\2\2\2\u0781\u077c"+
		"\3\2\2\2\u0781\u0782\3\2\2\2\u0782\u00df\3\2\2\2\u0783\u0785\7p\2\2\u0784"+
		"\u0786\7y\2\2\u0785\u0784\3\2\2\2\u0785\u0786\3\2\2\2\u0786\u0787\3\2"+
		"\2\2\u0787\u0788\7\u0174\2\2\u0788\u0789\7\u0099\2\2\u0789\u078e\7\u0174"+
		"\2\2\u078a\u078b\7\u015f\2\2\u078b\u078d\7\u0174\2\2\u078c\u078a\3\2\2"+
		"\2\u078d\u0790\3\2\2\2\u078e\u078c\3\2\2\2\u078e\u078f\3\2\2\2\u078f\u00e1"+
		"\3\2\2\2\u0790\u078e\3\2\2\2\u0791\u0792\7/\2\2\u0792\u0793\t\34\2\2\u0793"+
		"\u0794\7\u00ca\2\2\u0794\u0796\5\u015c\u00af\2\u0795\u0797\5\u00e4s\2"+
		"\u0796\u0795\3\2\2\2\u0796\u0797\3\2\2\2\u0797\u00e3\3\2\2\2\u0798\u0799"+
		"\7\61\2\2\u0799\u079a\7\u016d\2\2\u079a\u079f\5\u01ca\u00e6\2\u079b\u079c"+
		"\7\u015f\2\2\u079c\u079e\5\u01ca\u00e6\2\u079d\u079b\3\2\2\2\u079e\u07a1"+
		"\3\2\2\2\u079f\u079d\3\2\2\2\u079f\u07a0\3\2\2\2\u07a0\u07a2\3\2\2\2\u07a1"+
		"\u079f\3\2\2\2\u07a2\u07a3\7\u0170\2\2\u07a3\u00e5\3\2\2\2\u07a4\u07a5"+
		"\7,\2\2\u07a5\u07a6\7\u0174\2\2\u07a6\u00e7\3\2\2\2\u07a7\u07a8\7.\2\2"+
		"\u07a8\u07a9\t\35\2\2\u07a9\u07aa\5\u00eav\2\u07aa\u07ab\7\u015f\2\2\u07ab"+
		"\u07ac\5\u00eav\2\u07ac\u00e9\3\2\2\2\u07ad\u07af\5\u015c\u00af\2\u07ae"+
		"\u07b0\5\u015e\u00b0\2\u07af\u07ae\3\2\2\2\u07af\u07b0\3\2\2\2\u07b0\u07b6"+
		"\3\2\2\2\u07b1\u07b2\7\u016d\2\2\u07b2\u07b3\5\u012c\u0097\2\u07b3\u07b4"+
		"\7\u0170\2\2\u07b4\u07b6\3\2\2\2\u07b5\u07ad\3\2\2\2\u07b5\u07b1\3\2\2"+
		"\2\u07b6\u07b9\3\2\2\2\u07b7\u07b8\7\23\2\2\u07b8\u07ba\5\u01ca\u00e6"+
		"\2\u07b9\u07b7\3\2\2\2\u07b9\u07ba\3\2\2\2\u07ba\u00eb\3\2\2\2\u07bb\u07bc"+
		"\7:\2\2\u07bc\u07bd\7y\2\2\u07bd\u07be\7\u00a8\2\2\u07be\u07c3\5\u00f0"+
		"y\2\u07bf\u07c0\7\u015f\2\2\u07c0\u07c2\5\u00f0y\2\u07c1\u07bf\3\2\2\2"+
		"\u07c2\u07c5\3\2\2\2\u07c3\u07c1\3\2\2\2\u07c3\u07c4\3\2\2\2\u07c4\u07c6"+
		"\3\2\2\2\u07c5\u07c3\3\2\2\2\u07c6\u07c7\7\u0127\2\2\u07c7\u07cb\5\u00f2"+
		"z\2\u07c8\u07ca\5\u00f6|\2\u07c9\u07c8\3\2\2\2\u07ca\u07cd\3\2\2\2\u07cb"+
		"\u07c9\3\2\2\2\u07cb\u07cc\3\2\2\2\u07cc\u00ed\3\2\2\2\u07cd\u07cb\3\2"+
		"\2\2\u07ce\u07d4\7:\2\2\u07cf\u07d5\5\u015c\u00af\2\u07d0\u07d1\7\u016d"+
		"\2\2\u07d1\u07d2\5\u012c\u0097\2\u07d2\u07d3\7\u0170\2\2\u07d3\u07d5\3"+
		"\2\2\2\u07d4\u07cf\3\2\2\2\u07d4\u07d0\3\2\2\2\u07d5\u07d6\3\2\2\2\u07d6"+
		"\u07d8\7\u0127\2\2\u07d7\u07d9\7\u0084\2\2\u07d8\u07d7\3\2\2\2\u07d8\u07d9"+
		"\3\2\2\2\u07d9\u07da\3\2\2\2\u07da\u07de\5\u00f2z\2\u07db\u07dd\5\u00f4"+
		"{\2\u07dc\u07db\3\2\2\2\u07dd\u07e0\3\2\2\2\u07de\u07dc\3\2\2\2\u07de"+
		"\u07df\3\2\2\2\u07df\u00ef\3\2\2\2\u07e0\u07de\3\2\2\2\u07e1\u07e4\5\u01c4"+
		"\u00e3\2\u07e2\u07e4\5\u0192\u00ca\2\u07e3\u07e1\3\2\2\2\u07e3\u07e2\3"+
		"\2\2\2\u07e4\u00f1\3\2\2\2\u07e5\u07e8\5\u01c4\u00e3\2\u07e6\u07e8\5\u0192"+
		"\u00ca\2\u07e7\u07e5\3\2\2\2\u07e7\u07e6\3\2\2\2\u07e8\u00f3\3\2\2\2\u07e9"+
		"\u07ea\7\23\2\2\u07ea\u07f2\5\u01ca\u00e6\2\u07eb\u07ec\7\26\2\2\u07ec"+
		"\u07f2\5\u0192\u00ca\2\u07ed\u07ee\7T\2\2\u07ee\u07f2\5\u0192\u00ca\2"+
		"\u07ef\u07f0\7\u0110\2\2\u07f0\u07f2\5\u01ca\u00e6\2\u07f1\u07e9\3\2\2"+
		"\2\u07f1\u07eb\3\2\2\2\u07f1\u07ed\3\2\2\2\u07f1\u07ef\3\2\2\2\u07f2\u00f5"+
		"\3\2\2\2\u07f3\u07f4\t\36\2\2\u07f4\u00f7\3\2\2\2\u07f5\u07f7\7\64\2\2"+
		"\u07f6\u07f8\7\u013f\2\2\u07f7\u07f6\3\2\2\2\u07f7\u07f8\3\2\2\2\u07f8"+
		"\u00f9\3\2\2\2\u07f9\u07fb\7=\2\2\u07fa\u07fc\7\u012e\2\2\u07fb\u07fa"+
		"\3\2\2\2\u07fb\u07fc\3\2\2\2\u07fc\u07fd\3\2\2\2\u07fd\u07fe\7\u008d\2"+
		"\2\u07fe\u07ff\5\u01ca\u00e6\2\u07ff\u0800\7\u00ca\2\2\u0800\u0801\5\u015c"+
		"\u00af\2\u0801\u0802\7\u016d\2\2\u0802\u0807\5\u00fc\177\2\u0803\u0804"+
		"\7\u015f\2\2\u0804\u0806\5\u00fc\177\2\u0805\u0803\3\2\2\2\u0806\u0809"+
		"\3\2\2\2\u0807\u0805\3\2\2\2\u0807\u0808\3\2\2\2\u0808\u080a\3\2\2\2\u0809"+
		"\u0807\3\2\2\2\u080a\u080b\7\u0170\2\2\u080b\u00fb\3\2\2\2\u080c\u080e"+
		"\5\u01ca\u00e6\2\u080d\u080f\t\t\2\2\u080e\u080d\3\2\2\2\u080e\u080f\3"+
		"\2\2\2\u080f\u00fd\3\2\2\2\u0810\u0811\5\u0100\u0081\2\u0811\u00ff\3\2"+
		"\2\2\u0812\u0813\7\u013d\2\2\u0813\u0814\7\u016d\2\2\u0814\u0815\5\u01ca"+
		"\u00e6\2\u0815\u0816\7\u0163\2\2\u0816\u081e\5\u01ca\u00e6\2\u0817\u0818"+
		"\7\u015f\2\2\u0818\u0819\5\u01ca\u00e6\2\u0819\u081a\7\u0163\2\2\u081a"+
		"\u081b\5\u01ca\u00e6\2\u081b\u081d\3\2\2\2\u081c\u0817\3\2\2\2\u081d\u0820"+
		"\3\2\2\2\u081e\u081c\3\2\2\2\u081e\u081f\3\2\2\2\u081f\u0821\3\2\2\2\u0820"+
		"\u081e\3\2\2\2\u0821\u0825\7\u0170\2\2\u0822\u0824\5l\67\2\u0823\u0822"+
		"\3\2\2\2\u0824\u0827\3\2\2\2\u0825\u0823\3\2\2\2\u0825\u0826\3\2\2\2\u0826"+
		"\u0101\3\2\2\2\u0827\u0825\3\2\2\2\u0828\u0829\7\u00dc\2\2\u0829\u0830"+
		"\5\u0192\u00ca\2\u082a\u082b\7\u00dc\2\2\u082b\u082c\7\u016d\2\2\u082c"+
		"\u082d\5\u0192\u00ca\2\u082d\u082e\7\u0170\2\2\u082e\u0830\3\2\2\2\u082f"+
		"\u0828\3\2\2\2\u082f\u082a\3\2\2\2\u0830\u0103\3\2\2\2\u0831\u0832\7\u00dd"+
		"\2\2\u0832\u0839\5\u0192\u00ca\2\u0833\u0834\7\u00dd\2\2\u0834\u0835\7"+
		"\u016d\2\2\u0835\u0836\5\u0192\u00ca\2\u0836\u0837\7\u0170\2\2\u0837\u0839"+
		"\3\2\2\2\u0838\u0831\3\2\2\2\u0838\u0833\3\2\2\2\u0839\u0105\3\2\2\2\u083a"+
		"\u083c\7\6\2\2\u083b\u083a\3\2\2\2\u083b\u083c\3\2\2\2\u083c\u083d\3\2"+
		"\2\2\u083d\u083f\7\u00e2\2\2\u083e\u0840\5\u0192\u00ca\2\u083f\u083e\3"+
		"\2\2\2\u083f\u0840\3\2\2\2\u0840\u0107\3\2\2\2\u0841\u0842\7\u00e4\2\2"+
		"\u0842\u0109\3\2\2\2\u0843\u084f\7\u00e9\2\2\u0844\u0846\7\u0111\2\2\u0845"+
		"\u0847\7\u0133\2\2\u0846\u0845\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u0848"+
		"\3\2\2\2\u0848\u084d\5\u0192\u00ca\2\u0849\u084a\7\u0103\2\2\u084a\u084b"+
		"\7\u00b6\2\2\u084b\u084c\7\u0163\2\2\u084c\u084e\5\u0192\u00ca\2\u084d"+
		"\u0849\3\2\2\2\u084d\u084e\3\2\2\2\u084e\u0850\3\2\2\2\u084f\u0844\3\2"+
		"\2\2\u084f\u0850\3\2\2\2\u0850\u010b\3\2\2\2\u0851\u0853\7\u00ed\2\2\u0852"+
		"\u0854\5\u0192\u00ca\2\u0853\u0852\3\2\2\2\u0853\u0854\3\2\2\2\u0854\u010d"+
		"\3\2\2\2\u0855\u0857\7\u00f3\2\2\u0856\u0858\7\u013f\2\2\u0857\u0856\3"+
		"\2\2\2\u0857\u0858\3\2\2\2\u0858\u010f\3\2\2\2\u0859\u085d\5\u0112\u008a"+
		"\2\u085a\u085d\5\u0114\u008b\2\u085b\u085d\5\u0116\u008c\2\u085c\u0859"+
		"\3\2\2\2\u085c\u085a\3\2\2\2\u085c\u085b\3\2\2\2\u085d\u0111\3\2\2\2\u085e"+
		"\u0860\7A\2\2\u085f\u085e\3\2\2\2\u085f\u0860\3\2\2\2\u0860\u0861\3\2"+
		"\2\2\u0861\u0864\7\u00fc\2\2\u0862\u0864\7B";
	private static final String _serializedATNSegment1 =
		"\2\2\u0863\u085f\3\2\2\2\u0863\u0862\3\2\2\2\u0864\u0866\3\2\2\2\u0865"+
		"\u0867\7\u0163\2\2\u0866\u0865\3\2\2\2\u0866\u0867\3\2\2\2\u0867\u0868"+
		"\3\2\2\2\u0868\u0869\5\u0192\u00ca\2\u0869\u0113\3\2\2\2\u086a\u086b\t"+
		"\37\2\2\u086b\u086c\t \2\2\u086c\u0115\3\2\2\2\u086d\u086e\7\u00e1\2\2"+
		"\u086e\u0871\7\u0163\2\2\u086f\u0872\5\u0192\u00ca\2\u0870\u0872\7\u00c2"+
		"\2\2\u0871\u086f\3\2\2\2\u0871\u0870\3\2\2\2\u0872\u0874\3\2\2\2\u0873"+
		"\u0875\7\u012f\2\2\u0874\u0873\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u0876"+
		"\3\2\2\2\u0876\u0877\7u\2\2\u0877\u0878\t!\2\2\u0878\u0117\3\2\2\2\u0879"+
		"\u087a\7\u0108\2\2\u087a\u087b\5\u01ca\u00e6\2\u087b\u0119\3\2\2\2\u087c"+
		"\u087f\7\u011c\2\2\u087d\u087e\7\u0128\2\2\u087e\u0880\5\u0192\u00ca\2"+
		"\u087f\u087d\3\2\2\2\u087f\u0880\3\2\2\2\u0880\u0881\3\2\2\2\u0881\u088b"+
		"\7u\2\2\u0882\u088c\5\u012c\u0097\2\u0883\u0885\5\u015c\u00af\2\u0884"+
		"\u0886\5\u015e\u00b0\2\u0885\u0884\3\2\2\2\u0885\u0886\3\2\2\2\u0886\u0889"+
		"\3\2\2\2\u0887\u0888\7\u00a6\2\2\u0888\u088a\5\u0192\u00ca\2\u0889\u0887"+
		"\3\2\2\2\u0889\u088a\3\2\2\2\u088a\u088c\3\2\2\2\u088b\u0882\3\2\2\2\u088b"+
		"\u0883\3\2\2\2\u088c\u011b\3\2\2\2\u088d\u088f\7\u012b\2\2\u088e\u0890"+
		"\7\u011e\2\2\u088f\u088e\3\2\2\2\u088f\u0890\3\2\2\2\u0890\u0891\3\2\2"+
		"\2\u0891\u0892\5\u015c\u00af\2\u0892\u011d\3\2\2\2\u0893\u0894\7\u0131"+
		"\2\2\u0894\u0895\5\u0192\u00ca\2\u0895\u011f\3\2\2\2\u0896\u0898\7\u0134"+
		"\2\2\u0897\u0899\7\u016d\2\2\u0898\u0897\3\2\2\2\u0898\u0899\3\2\2\2\u0899"+
		"\u089a\3\2\2\2\u089a\u089f\5\u0192\u00ca\2\u089b\u089c\7\u015f\2\2\u089c"+
		"\u089e\5\u0192\u00ca\2\u089d\u089b\3\2\2\2\u089e\u08a1\3\2\2\2\u089f\u089d"+
		"\3\2\2\2\u089f\u08a0\3\2\2\2\u08a0\u08a3\3\2\2\2\u08a1\u089f\3\2\2\2\u08a2"+
		"\u08a4\7\u0170\2\2\u08a3\u08a2\3\2\2\2\u08a3\u08a4\3\2\2\2\u08a4\u08a5"+
		"\3\2\2\2\u08a5\u08a7\7\u0099\2\2\u08a6\u08a8\7\u016d\2\2\u08a7\u08a6\3"+
		"\2\2\2\u08a7\u08a8\3\2\2\2\u08a8\u08a9\3\2\2\2\u08a9\u08ae\5\u01ca\u00e6"+
		"\2\u08aa\u08ab\7\u015f\2\2\u08ab\u08ad\5\u01ca\u00e6\2\u08ac\u08aa\3\2"+
		"\2\2\u08ad\u08b0\3\2\2\2\u08ae\u08ac\3\2\2\2\u08ae\u08af\3\2\2\2\u08af"+
		"\u08b2\3\2\2\2\u08b0\u08ae\3\2\2\2\u08b1\u08b3\7\u0170\2\2\u08b2\u08b1"+
		"\3\2\2\2\u08b2\u08b3\3\2\2\2\u08b3\u0121\3\2\2\2\u08b4\u08b5\7\u013c\2"+
		"\2\u08b5\u08b6\5\u0182\u00c2\2\u08b6\u08b7\t\"\2\2\u08b7\u08b8\5\4\3\2"+
		"\u08b8\u08ba\7d\2\2\u08b9\u08bb\t#\2\2\u08ba\u08b9\3\2\2\2\u08ba\u08bb"+
		"\3\2\2\2\u08bb\u0123\3\2\2\2\u08bc\u08bd\7u\2\2\u08bd\u08be\7\u0174\2"+
		"\2\u08be\u08c0\7\u008b\2\2\u08bf\u08c1\7\u016d\2\2\u08c0\u08bf\3\2\2\2"+
		"\u08c0\u08c1\3\2\2\2\u08c1\u08c2\3\2\2\2\u08c2\u08c4\5\u012c\u0097\2\u08c3"+
		"\u08c5\7\u0170\2\2\u08c4\u08c3\3\2\2\2\u08c4\u08c5\3\2\2\2\u08c5\u08c6"+
		"\3\2\2\2\u08c6\u08c7\7\u00b0\2\2\u08c7\u08c8\5\4\3\2\u08c8\u08c9\7d\2"+
		"\2\u08c9\u08ca\7\u00b0\2\2\u08ca\u0125\3\2\2\2\u08cb\u08cc\7u\2\2\u08cc"+
		"\u08cd\7\u0174\2\2\u08cd\u08cf\7\u008b\2\2\u08ce\u08d0\7\u00ef\2\2\u08cf"+
		"\u08ce\3\2\2\2\u08cf\u08d0\3\2\2\2\u08d0\u08d1\3\2\2\2\u08d1\u08d2\5\u0192"+
		"\u00ca\2\u08d2\u08d3\7\u0162\2\2\u08d3\u08d6\5\u0192\u00ca\2\u08d4\u08d5"+
		"\t$\2\2\u08d5\u08d7\5\u0192\u00ca\2\u08d6\u08d4\3\2\2\2\u08d6\u08d7\3"+
		"\2\2\2\u08d7\u08d8\3\2\2\2\u08d8\u08d9\7\u00b0\2\2\u08d9\u08da\5\4\3\2"+
		"\u08da\u08db\7d\2\2\u08db\u08dc\7\u00b0\2\2\u08dc\u0127\3\2\2\2\u08dd"+
		"\u08e4\7\u017d\2\2\u08de\u08df\7\u0169\2\2\u08df\u08e0\7\u0169\2\2\u08e0"+
		"\u08e1\7\u0174\2\2\u08e1\u08e2\7\u0167\2\2\u08e2\u08e4\7\u0167\2\2\u08e3"+
		"\u08dd\3\2\2\2\u08e3\u08de\3\2\2\2\u08e4\u0129\3\2\2\2\u08e5\u08e6\7\u0132"+
		"\2\2\u08e6\u08eb\5\u0192\u00ca\2\u08e7\u08e8\7\u015f\2\2\u08e8\u08ea\5"+
		"\u0192\u00ca\2\u08e9\u08e7\3\2\2\2\u08ea\u08ed\3\2\2\2\u08eb\u08e9\3\2"+
		"\2\2\u08eb\u08ec\3\2\2\2\u08ec\u012b\3\2\2\2\u08ed\u08eb\3\2\2\2\u08ee"+
		"\u08f0\5\u012e\u0098\2\u08ef\u08ee\3\2\2\2\u08ef\u08f0\3\2\2\2\u08f0\u08f1"+
		"\3\2\2\2\u08f1\u08f2\5\u0134\u009b\2\u08f2\u012d\3\2\2\2\u08f3\u08f4\7"+
		"\u013d\2\2\u08f4\u08f9\5\u0130\u0099\2\u08f5\u08f6\7\u015f\2\2\u08f6\u08f8"+
		"\5\u0130\u0099\2\u08f7\u08f5\3\2\2\2\u08f8\u08fb\3\2\2\2\u08f9\u08f7\3"+
		"\2\2\2\u08f9\u08fa\3\2\2\2\u08fa\u012f\3\2\2\2\u08fb\u08f9\3\2\2\2\u08fc"+
		"\u08fe\5\u01ca\u00e6\2\u08fd\u08ff\5\u0132\u009a\2\u08fe\u08fd\3\2\2\2"+
		"\u08fe\u08ff\3\2\2\2\u08ff\u0900\3\2\2\2\u0900\u0901\7\20\2\2\u0901\u0902"+
		"\7\u016d\2\2\u0902\u0903\5\u0134\u009b\2\u0903\u0904\7\u0170\2\2\u0904"+
		"\u0131\3\2\2\2\u0905\u0906\7\u016d\2\2\u0906\u090b\5\u01ca\u00e6\2\u0907"+
		"\u0908\7\u015f\2\2\u0908\u090a\5\u01ca\u00e6\2\u0909\u0907\3\2\2\2\u090a"+
		"\u090d\3\2\2\2\u090b\u0909\3\2\2\2\u090b\u090c\3\2\2\2\u090c\u090e\3\2"+
		"\2\2\u090d\u090b\3\2\2\2\u090e\u090f\7\u0170\2\2\u090f\u0133\3\2\2\2\u0910"+
		"\u0916\5\u0136\u009c\2\u0911\u0912\5\u0138\u009d\2\u0912\u0913\5\u0136"+
		"\u009c\2\u0913\u0915\3\2\2\2\u0914\u0911\3\2\2\2\u0915\u0918\3\2\2\2\u0916"+
		"\u0914\3\2\2\2\u0916\u0917\3\2\2\2\u0917\u0135\3\2\2\2\u0918\u0916\3\2"+
		"\2\2\u0919\u091f\5\u013a\u009e\2\u091a\u091b\7\u016d\2\2\u091b\u091c\5"+
		"\u0134\u009b\2\u091c\u091d\7\u0170\2\2\u091d\u091f\3\2\2\2\u091e\u0919"+
		"\3\2\2\2\u091e\u091a\3\2\2\2\u091f\u0137\3\2\2\2\u0920\u0922\7\u012d\2"+
		"\2\u0921\u0923\7\n\2\2\u0922\u0921\3\2\2\2\u0922\u0923\3\2\2\2\u0923\u092d"+
		"\3\2\2\2\u0924\u0926\7g\2\2\u0925\u0927\7\n\2\2\u0926\u0925\3\2\2\2\u0926"+
		"\u0927\3\2\2\2\u0927\u092d\3\2\2\2\u0928\u092a\7\u0097\2\2\u0929\u092b"+
		"\7\n\2\2\u092a\u0929\3\2\2\2\u092a\u092b\3\2\2\2\u092b\u092d\3\2\2\2\u092c"+
		"\u0920\3\2\2\2\u092c\u0924\3\2\2\2\u092c\u0928\3\2\2\2\u092d\u0139\3\2"+
		"\2\2\u092e\u092f\t%\2\2\u092f\u0931\5\u013c\u009f\2\u0930\u0932\5\u0148"+
		"\u00a5\2\u0931\u0930\3\2\2\2\u0931\u0932\3\2\2\2\u0932\u0934\3\2\2\2\u0933"+
		"\u0935\5\u014a\u00a6\2\u0934\u0933\3\2\2\2\u0934\u0935\3\2\2\2\u0935\u0937"+
		"\3\2\2\2\u0936\u0938\5\u015e\u00b0\2\u0937\u0936\3\2\2\2\u0937\u0938\3"+
		"\2\2\2\u0938\u093a\3\2\2\2\u0939\u093b\5\u0160\u00b1\2\u093a\u0939\3\2"+
		"\2\2\u093a\u093b\3\2\2\2\u093b\u093e\3\2\2\2\u093c\u093f\5\u0162\u00b2"+
		"\2\u093d\u093f\5\u0164\u00b3\2\u093e\u093c\3\2\2\2\u093e\u093d\3\2\2\2"+
		"\u093e\u093f\3\2\2\2\u093f\u0941\3\2\2\2\u0940\u0942\5\u0166\u00b4\2\u0941"+
		"\u0940\3\2\2\2\u0941\u0942\3\2\2\2\u0942\u0944\3\2\2\2\u0943\u0945\5\u0168"+
		"\u00b5\2\u0944\u0943\3\2\2\2\u0944\u0945\3\2\2\2\u0945\u013b\3\2\2\2\u0946"+
		"\u0948\5\u013e\u00a0\2\u0947\u0946\3\2\2\2\u0947\u0948\3\2\2\2\u0948\u094a"+
		"\3\2\2\2\u0949\u094b\5\u0140\u00a1\2\u094a\u0949\3\2\2\2\u094a\u094b\3"+
		"\2\2\2\u094b\u094c\3\2\2\2\u094c\u0951\5\u0142\u00a2\2\u094d\u094e\7\u015f"+
		"\2\2\u094e\u0950\5\u0142\u00a2\2\u094f\u094d\3\2\2\2\u0950\u0953\3\2\2"+
		"\2\u0951\u094f\3\2\2\2\u0951\u0952\3\2\2\2\u0952\u013d\3\2\2\2\u0953\u0951"+
		"\3\2\2\2\u0954\u0955\t&\2\2\u0955\u013f\3\2\2\2\u0956\u0957\7\u0128\2"+
		"\2\u0957\u0958\5\u0192\u00ca\2\u0958\u0141\3\2\2\2\u0959\u095a\5\u01ca"+
		"\u00e6\2\u095a\u095b\7\u0163\2\2\u095b\u095d\3\2\2\2\u095c\u0959\3\2\2"+
		"\2\u095c\u095d\3\2\2\2\u095d\u095e\3\2\2\2\u095e\u0960\5\u0192\u00ca\2"+
		"\u095f\u0961\5\u0144\u00a3\2\u0960\u095f\3\2\2\2\u0960\u0961\3\2\2\2\u0961"+
		"\u0964\3\2\2\2\u0962\u0964\5\u0146\u00a4\2\u0963\u095c\3\2\2\2\u0963\u0962"+
		"\3\2\2\2\u0964\u0143\3\2\2\2\u0965\u0967\6\u00a3\5\2\u0966\u0968\7\20"+
		"\2\2\u0967\u0966\3\2\2\2\u0967\u0968\3\2\2\2\u0968\u0969\3\2\2\2\u0969"+
		"\u096f\5\u01ca\u00e6\2\u096a\u096b\7\u016d\2\2\u096b\u096c\7\u0126\2\2"+
		"\u096c\u096d\7\u0175\2\2\u096d\u096f\7\u0170\2\2\u096e\u0965\3\2\2\2\u096e"+
		"\u096a\3\2\2\2\u096f\u0145\3\2\2\2\u0970\u0971\7\u0174\2\2\u0971\u0973"+
		"\7\6\2\2\u0972\u0970\3\2\2\2\u0972\u0973\3\2\2\2\u0973\u0974\3\2\2\2\u0974"+
		"\u0975\7\u016b\2\2\u0975\u0147\3\2\2\2\u0976\u0977\7\u0099\2\2\u0977\u097c"+
		"\5\u01ca\u00e6\2\u0978\u0979\7\u015f\2\2\u0979\u097b\5\u01ca\u00e6\2\u097a"+
		"\u0978\3\2\2\2\u097b\u097e\3\2\2\2\u097c\u097a\3\2\2\2\u097c\u097d\3\2"+
		"\2\2\u097d\u0149\3\2\2\2\u097e\u097c\3\2\2\2\u097f\u0980\7y\2\2\u0980"+
		"\u0984\5\u014c\u00a7\2\u0981\u0983\5\u0152\u00aa\2\u0982\u0981\3\2\2\2"+
		"\u0983\u0986\3\2\2\2\u0984\u0982\3\2\2\2\u0984\u0985\3\2\2\2\u0985\u014b"+
		"\3\2\2\2\u0986\u0984\3\2\2\2\u0987\u098b\5\u014e\u00a8\2\u0988\u098b\5"+
		"\u0150\u00a9\2\u0989\u098b\5\u0156\u00ac\2\u098a\u0987\3\2\2\2\u098a\u0988"+
		"\3\2\2\2\u098a\u0989\3\2\2\2\u098b\u014d\3\2\2\2\u098c\u098e\5\u015c\u00af"+
		"\2\u098d\u098f\5\u015a\u00ae\2\u098e\u098d\3\2\2\2\u098e\u098f\3\2\2\2"+
		"\u098f\u014f\3\2\2\2\u0990\u0991\7\u016d\2\2\u0991\u0992\5\u012c\u0097"+
		"\2\u0992\u0994\7\u0170\2\2\u0993\u0995\5\u015a\u00ae\2\u0994\u0993\3\2"+
		"\2\2\u0994\u0995\3\2\2\2\u0995\u0151\3\2\2\2\u0996\u0997\7\u015f\2\2\u0997"+
		"\u099e\5\u014c\u00a7\2\u0998\u0999\5\u0154\u00ab\2\u0999\u099a\5\u014c"+
		"\u00a7\2\u099a\u099b\7\u00ca\2\2\u099b\u099c\5\u0182\u00c2\2\u099c\u099e"+
		"\3\2\2\2\u099d\u0996\3\2\2\2\u099d\u0998\3\2\2\2\u099e\u0153\3\2\2\2\u099f"+
		"\u09a1\7\u008f\2\2\u09a0\u099f\3\2\2\2\u09a0\u09a1\3\2\2\2\u09a1\u09a2"+
		"\3\2\2\2\u09a2\u09a9\7\u009e\2\2\u09a3\u09a5\t\'\2\2\u09a4\u09a6\7\u00d0"+
		"\2\2\u09a5\u09a4\3\2\2\2\u09a5\u09a6\3\2\2\2\u09a6\u09a7\3\2\2\2\u09a7"+
		"\u09a9\7\u009e\2\2\u09a8\u09a0\3\2\2\2\u09a8\u09a3\3\2\2\2\u09a9\u0155"+
		"\3\2\2\2\u09aa\u09ab\7\u011e\2\2\u09ab\u09ac\7\u016d\2\2\u09ac\u09ad\7"+
		"\u0134\2\2\u09ad\u09b2\5\u0158\u00ad\2\u09ae\u09af\7\u015f\2\2\u09af\u09b1"+
		"\5\u0158\u00ad\2\u09b0\u09ae\3\2\2\2\u09b1\u09b4\3\2\2\2\u09b2\u09b0\3"+
		"\2\2\2\u09b2\u09b3\3\2\2\2\u09b3\u09b5\3\2\2\2\u09b4\u09b2\3\2\2\2\u09b5"+
		"\u09b7\7\u0170\2\2\u09b6\u09b8\5\u015a\u00ae\2\u09b7\u09b6\3\2\2\2\u09b7"+
		"\u09b8\3\2\2\2\u09b8\u0157\3\2\2\2\u09b9\u09c6\5\u0192\u00ca\2\u09ba\u09bb"+
		"\7\u016d\2\2\u09bb\u09c0\5\u0192\u00ca\2\u09bc\u09bd\7\u015f\2\2\u09bd"+
		"\u09bf\5\u0192\u00ca\2\u09be\u09bc\3\2\2\2\u09bf\u09c2\3\2\2\2\u09c0\u09be"+
		"\3\2\2\2\u09c0\u09c1\3\2\2\2\u09c1\u09c3\3\2\2\2\u09c2\u09c0\3\2\2\2\u09c3"+
		"\u09c4\7\u0170\2\2\u09c4\u09c6\3\2\2\2\u09c5\u09b9\3\2\2\2\u09c5\u09ba"+
		"\3\2\2\2\u09c6\u0159\3\2\2\2\u09c7\u09c9\6\u00ae\6\2\u09c8\u09ca\7\20"+
		"\2\2\u09c9\u09c8\3\2\2\2\u09c9\u09ca\3\2\2\2\u09ca\u09cb\3\2\2\2\u09cb"+
		"\u09d6\5\u01ca\u00e6\2\u09cc\u09cd\7\u016d\2\2\u09cd\u09d2\7\u0174\2\2"+
		"\u09ce\u09cf\7\u015f\2\2\u09cf\u09d1\7\u0174\2\2\u09d0\u09ce\3\2\2\2\u09d1"+
		"\u09d4\3\2\2\2\u09d2\u09d0\3\2\2\2\u09d2\u09d3\3\2\2\2\u09d3\u09d5\3\2"+
		"\2\2\u09d4\u09d2\3\2\2\2\u09d5\u09d7\7\u0170\2\2\u09d6\u09cc\3\2\2\2\u09d6"+
		"\u09d7\3\2\2\2\u09d7\u015b\3\2\2\2\u09d8\u09d9\5\u01ca\u00e6\2\u09d9\u015d"+
		"\3\2\2\2\u09da\u09db\7\u013b\2\2\u09db\u09dc\5\u0182\u00c2\2\u09dc\u015f"+
		"\3\2\2\2\u09dd\u09de\7\u0080\2\2\u09de\u09df\7 \2\2\u09df\u09e4\5\u0192"+
		"\u00ca\2\u09e0\u09e1\7\u015f\2\2\u09e1\u09e3\5\u0192\u00ca\2\u09e2\u09e0"+
		"\3\2\2\2\u09e3\u09e6\3\2\2\2\u09e4\u09e2\3\2\2\2\u09e4\u09e5\3\2\2\2\u09e5"+
		"\u0161\3\2\2\2\u09e6\u09e4\3\2\2\2\u09e7\u09e8\7\u0083\2\2\u09e8\u09e9"+
		"\5\u0182\u00c2\2\u09e9\u0163\3\2\2\2\u09ea\u09eb\7\u00e0\2\2\u09eb\u09ec"+
		"\5\u0182\u00c2\2\u09ec\u0165\3\2\2\2\u09ed\u09ee\7\u00ce\2\2\u09ee\u09ef"+
		"\7 \2\2\u09ef\u09f1\5\u0192\u00ca\2\u09f0\u09f2\t\t\2\2\u09f1\u09f0\3"+
		"\2\2\2\u09f1\u09f2\3\2\2\2\u09f2\u09fa\3\2\2\2\u09f3\u09f4\7\u015f\2\2"+
		"\u09f4\u09f6\5\u0192\u00ca\2\u09f5\u09f7\t\t\2\2\u09f6\u09f5\3\2\2\2\u09f6"+
		"\u09f7\3\2\2\2\u09f7\u09f9\3\2\2\2\u09f8\u09f3\3\2\2\2\u09f9\u09fc\3\2"+
		"\2\2\u09fa\u09f8\3\2\2\2\u09fa\u09fb\3\2\2\2\u09fb\u0167\3\2\2\2\u09fc"+
		"\u09fa\3\2\2\2\u09fd\u09ff\5\u016a\u00b6\2\u09fe\u09fd\3\2\2\2\u09ff\u0a00"+
		"\3\2\2\2\u0a00\u09fe\3\2\2\2\u0a00\u0a01\3\2\2\2\u0a01\u0169\3\2\2\2\u0a02"+
		"\u0a03\7\u00a6\2\2\u0a03\u0a0e\5\u0192\u00ca\2\u0a04\u0a05\7\u013d\2\2"+
		"\u0a05\u0a0b\t(\2\2\u0a06\u0a07\7\u0131\2\2\u0a07\u0a08\7\r\2\2\u0a08"+
		"\u0a09\7\u009f\2\2\u0a09\u0a0a\t)\2\2\u0a0a\u0a0c\7\u00ac\2\2\u0a0b\u0a06"+
		"\3\2\2\2\u0a0b\u0a0c\3\2\2\2\u0a0c\u0a0e\3\2\2\2\u0a0d\u0a02\3\2\2\2\u0a0d"+
		"\u0a04\3\2\2\2\u0a0e\u016b\3\2\2\2\u0a0f\u0a10\7\u012f\2\2\u0a10\u0a11"+
		"\5\u0170\u00b9\2\u0a11\u0a12\7\u0103\2\2\u0a12\u0a14\5\u016e\u00b8\2\u0a13"+
		"\u0a15\5\u015e\u00b0\2\u0a14\u0a13\3\2\2\2\u0a14\u0a15\3\2\2\2\u0a15\u0a17"+
		"\3\2\2\2\u0a16\u0a18\5\u0172\u00ba\2\u0a17\u0a16\3\2\2\2\u0a17\u0a18\3"+
		"\2\2\2\u0a18\u016d\3\2\2\2\u0a19\u0a1e\5\34\17\2\u0a1a\u0a1b\7\u015f\2"+
		"\2\u0a1b\u0a1d\5\34\17\2\u0a1c\u0a1a\3\2\2\2\u0a1d\u0a20\3\2\2\2\u0a1e"+
		"\u0a1c\3\2\2\2\u0a1e\u0a1f\3\2\2\2\u0a1f\u016f\3\2\2\2\u0a20\u0a1e\3\2"+
		"\2\2\u0a21\u0a23\5\u015c\u00af\2\u0a22\u0a24\5\u014a\u00a6\2\u0a23\u0a22"+
		"\3\2\2\2\u0a23\u0a24\3\2\2\2\u0a24\u0a2a\3\2\2\2\u0a25\u0a26\7\u016d\2"+
		"\2\u0a26\u0a27\5\u012c\u0097\2\u0a27\u0a28\7\u0170\2\2\u0a28\u0a2a\3\2"+
		"\2\2\u0a29\u0a21\3\2\2\2\u0a29\u0a25\3\2\2\2\u0a2a\u0a2f\3\2\2\2\u0a2b"+
		"\u0a2d\7\20\2\2\u0a2c\u0a2b\3\2\2\2\u0a2c\u0a2d\3\2\2\2\u0a2d\u0a2e\3"+
		"\2\2\2\u0a2e\u0a30\5\u01ca\u00e6\2\u0a2f\u0a2c\3\2\2\2\u0a2f\u0a30\3\2"+
		"\2\2\u0a30\u0171\3\2\2\2\u0a31\u0a32\7`\2\2\u0a32\u0a33\5\u00b2Z\2\u0a33"+
		"\u0173\3\2\2\2\u0a34\u0a35\7\u00b5\2\2\u0a35\u0a36\7\u0099\2\2\u0a36\u0a37"+
		"\5\u0176\u00bc\2\u0a37\u0a38\7\u0132\2\2\u0a38\u0a39\5\u0176\u00bc\2\u0a39"+
		"\u0a3a\7\u00ca\2\2\u0a3a\u0a3c\5\u0182\u00c2\2\u0a3b\u0a3d\5\u0178\u00bd"+
		"\2\u0a3c\u0a3b\3\2\2\2\u0a3d\u0a3e\3\2\2\2\u0a3e\u0a3c\3\2\2\2\u0a3e\u0a3f"+
		"\3\2\2\2\u0a3f\u0175\3\2\2\2\u0a40\u0a46\5\u015c\u00af\2\u0a41\u0a42\7"+
		"\u016d\2\2\u0a42\u0a43\5\u012c\u0097\2\u0a43\u0a44\7\u0170\2\2\u0a44\u0a46"+
		"\3\2\2\2\u0a45\u0a40\3\2\2\2\u0a45\u0a41\3\2\2\2\u0a46\u0a4b\3\2\2\2\u0a47"+
		"\u0a49\7\20\2\2\u0a48\u0a47\3\2\2\2\u0a48\u0a49\3\2\2\2\u0a49\u0a4a\3"+
		"\2\2\2\u0a4a\u0a4c\5\u01ca\u00e6\2\u0a4b\u0a48\3\2\2\2\u0a4b\u0a4c\3\2"+
		"\2\2\u0a4c\u0177\3\2\2\2\u0a4d\u0a4f\7\u013a\2\2\u0a4e\u0a50\7\u00c3\2"+
		"\2\u0a4f\u0a4e\3\2\2\2\u0a4f\u0a50\3\2\2\2\u0a50\u0a51\3\2\2\2\u0a51\u0a54"+
		"\7\u00b2\2\2\u0a52\u0a53\7\r\2\2\u0a53\u0a55\5\u0182\u00c2\2\u0a54\u0a52"+
		"\3\2\2\2\u0a54\u0a55\3\2\2\2\u0a55\u0a56\3\2\2\2\u0a56\u0a57\7\u0123\2"+
		"\2\u0a57\u0a5b\5\u017a\u00be\2\u0a58\u0a59\7`\2\2\u0a59\u0a5b\7\u0089"+
		"\2\2\u0a5a\u0a4d\3\2\2\2\u0a5a\u0a58\3\2\2\2\u0a5b\u0179\3\2\2\2\u0a5c"+
		"\u0a5e\7\u0091\2\2\u0a5d\u0a5f\5\u00b4[\2\u0a5e\u0a5d\3\2\2\2\u0a5e\u0a5f"+
		"\3\2\2\2\u0a5f\u0a60\3\2\2\2\u0a60\u0a61\7\u0134\2\2\u0a61\u0a71\5\u00b8"+
		"]\2\u0a62\u0a63\7\u012f\2\2\u0a63\u0a64\7\u0103\2\2\u0a64\u0a69\5\34\17"+
		"\2\u0a65\u0a66\7\u015f\2\2\u0a66\u0a68\5\34\17\2\u0a67\u0a65\3\2\2\2\u0a68"+
		"\u0a6b\3\2\2\2\u0a69\u0a67\3\2\2\2\u0a69\u0a6a\3\2\2\2\u0a6a\u0a6d\3\2"+
		"\2\2\u0a6b\u0a69\3\2\2\2\u0a6c\u0a6e\5\u015e\u00b0\2\u0a6d\u0a6c\3\2\2"+
		"\2\u0a6d\u0a6e\3\2\2\2\u0a6e\u0a71\3\2\2\2\u0a6f\u0a71\7R\2\2\u0a70\u0a5c"+
		"\3\2\2\2\u0a70\u0a62\3\2\2\2\u0a70\u0a6f\3\2\2\2\u0a71\u017b\3\2\2\2\u0a72"+
		"\u0a74\7R\2\2\u0a73\u0a75\7y\2\2\u0a74\u0a73\3\2\2\2\u0a74\u0a75\3\2\2"+
		"\2\u0a75\u0a76\3\2\2\2\u0a76\u0a78\5\u015c\u00af\2\u0a77\u0a79\5\u017e"+
		"\u00c0\2\u0a78\u0a77\3\2\2\2\u0a78\u0a79\3\2\2\2\u0a79\u0a7c\3\2\2\2\u0a7a"+
		"\u0a7d\5\u015e\u00b0\2\u0a7b\u0a7d\7\n\2\2\u0a7c\u0a7a\3\2\2\2\u0a7c\u0a7b"+
		"\3\2\2\2\u0a7c\u0a7d\3\2\2\2\u0a7d\u017d\3\2\2\2\u0a7e\u0a80\6\u00c0\7"+
		"\2\u0a7f\u0a81\7\20\2\2\u0a80\u0a7f\3\2\2\2\u0a80\u0a81\3\2\2\2\u0a81"+
		"\u0a82\3\2\2\2\u0a82\u0a83\5\u01ca\u00e6\2\u0a83\u017f\3\2\2\2\u0a84\u0a86"+
		"\t*\2\2\u0a85\u0a87\7\u011e\2\2\u0a86\u0a85\3\2\2\2\u0a86\u0a87\3\2\2"+
		"\2\u0a87\u0a88\3\2\2\2\u0a88\u0a89\5\u015c\u00af\2\u0a89\u0181\3\2\2\2"+
		"\u0a8a\u0a8c\b\u00c2\1\2\u0a8b\u0a8d\7\u00c3\2\2\u0a8c\u0a8b\3\2\2\2\u0a8c"+
		"\u0a8d\3\2\2\2\u0a8d\u0a8e\3\2\2\2\u0a8e\u0a8f\7\u016d\2\2\u0a8f\u0a90"+
		"\5\u0182\u00c2\2\u0a90\u0a91\7\u0170\2\2\u0a91\u0a94\3\2\2\2\u0a92\u0a94"+
		"\5\u0184\u00c3\2\u0a93\u0a8a\3\2\2\2\u0a93\u0a92\3\2\2\2\u0a94\u0a9b\3"+
		"\2\2\2\u0a95\u0a96\f\4\2\2\u0a96\u0a97\5\u018e\u00c8\2\u0a97\u0a98\5\u0182"+
		"\u00c2\5\u0a98\u0a9a\3\2\2\2\u0a99\u0a95\3\2\2\2\u0a9a\u0a9d\3\2\2\2\u0a9b"+
		"\u0a99\3\2\2\2\u0a9b\u0a9c\3\2\2\2\u0a9c\u0183\3\2\2\2\u0a9d\u0a9b\3\2"+
		"\2\2\u0a9e\u0aa2\5\u0186\u00c4\2\u0a9f\u0aa2\5\u018c\u00c7\2\u0aa0\u0aa2"+
		"\5\u0192\u00ca\2\u0aa1\u0a9e\3\2\2\2\u0aa1\u0a9f\3\2\2\2\u0aa1\u0aa0\3"+
		"\2\2\2\u0aa2\u0185\3\2\2\2\u0aa3\u0aa4\5\u0192\u00ca\2\u0aa4\u0aa6\7\u009b"+
		"\2\2\u0aa5\u0aa7\7\u00c3\2\2\u0aa6\u0aa5\3\2\2\2\u0aa6\u0aa7\3\2\2\2\u0aa7"+
		"\u0aa8\3\2\2\2\u0aa8\u0aa9\7\u00c5\2\2\u0aa9\u0abb\3\2\2\2\u0aaa\u0aab"+
		"\5\u0192\u00ca\2\u0aab\u0aac\7\30\2\2\u0aac\u0aad\5\u0192\u00ca\2\u0aad"+
		"\u0aae\7\r\2\2\u0aae\u0aaf\5\u0192\u00ca\2\u0aaf\u0abb\3\2\2\2\u0ab0\u0ab2"+
		"\7\u00c3\2\2\u0ab1\u0ab0\3\2\2\2\u0ab1\u0ab2\3\2\2\2\u0ab2\u0ab3\3\2\2"+
		"\2\u0ab3\u0ab4\7l\2\2\u0ab4\u0ab5\7\u016d\2\2\u0ab5\u0ab6\5\u012c\u0097"+
		"\2\u0ab6\u0ab7\7\u0170\2\2\u0ab7\u0abb\3\2\2\2\u0ab8\u0abb\5\u0188\u00c5"+
		"\2\u0ab9\u0abb\5\u018a\u00c6\2\u0aba\u0aa3\3\2\2\2\u0aba\u0aaa\3\2\2\2"+
		"\u0aba\u0ab1\3\2\2\2\u0aba\u0ab8\3\2\2\2\u0aba\u0ab9\3\2\2\2\u0abb\u0187"+
		"\3\2\2\2\u0abc\u0abe\5\u0192\u00ca\2\u0abd\u0abf\7\u00c3\2\2\u0abe\u0abd"+
		"\3\2\2\2\u0abe\u0abf\3\2\2\2\u0abf\u0ac0\3\2\2\2\u0ac0\u0ac1\7\u008b\2"+
		"\2\u0ac1\u0acb\7\u016d\2\2\u0ac2\u0ac7\5\u0192\u00ca\2\u0ac3\u0ac4\7\u015f"+
		"\2\2\u0ac4\u0ac6\5\u0192\u00ca\2\u0ac5\u0ac3\3\2\2\2\u0ac6\u0ac9\3\2\2"+
		"\2\u0ac7\u0ac5\3\2\2\2\u0ac7\u0ac8\3\2\2\2\u0ac8\u0acc\3\2\2\2\u0ac9\u0ac7"+
		"\3\2\2\2\u0aca\u0acc\5\u012c\u0097\2\u0acb\u0ac2\3\2\2\2\u0acb\u0aca\3"+
		"\2\2\2\u0acc\u0acd\3\2\2\2\u0acd\u0ace\7\u0170\2\2\u0ace\u0189\3\2\2\2"+
		"\u0acf\u0ad0\7\u016d\2\2\u0ad0\u0ad5\5\u0192\u00ca\2\u0ad1\u0ad2\7\u015f"+
		"\2\2\u0ad2\u0ad4\5\u0192\u00ca\2\u0ad3\u0ad1\3\2\2\2\u0ad4\u0ad7\3\2\2"+
		"\2\u0ad5\u0ad3\3\2\2\2\u0ad5\u0ad6\3\2\2\2\u0ad6\u0ad8\3\2\2\2\u0ad7\u0ad5"+
		"\3\2\2\2\u0ad8\u0ada\7\u0170\2\2\u0ad9\u0adb\7\u00c3\2\2\u0ada\u0ad9\3"+
		"\2\2\2\u0ada\u0adb\3\2\2\2\u0adb\u0adc\3\2\2\2\u0adc\u0add\7\u008b\2\2"+
		"\u0add\u0ade\7\u016d\2\2\u0ade\u0adf\5\u012c\u0097\2\u0adf\u0ae0\7\u0170"+
		"\2\2\u0ae0\u018b\3\2\2\2\u0ae1\u0ae2\5\u0192\u00ca\2\u0ae2\u0ae3\5\u0190"+
		"\u00c9\2\u0ae3\u0ae4\5\u0192\u00ca\2\u0ae4\u018d\3\2\2\2\u0ae5\u0ae6\t"+
		"+\2\2\u0ae6\u018f\3\2\2\2\u0ae7\u0af4\7\u0163\2\2\u0ae8\u0af4\7\u0164"+
		"\2\2\u0ae9\u0af4\7\u0165\2\2\u0aea\u0af4\7\u0166\2\2\u0aeb\u0af4\7\u0169"+
		"\2\2\u0aec\u0af4\7\u016a\2\2\u0aed\u0af4\7\u0167\2\2\u0aee\u0af4\7\u0168"+
		"\2\2\u0aef\u0af1\7\u00c3\2\2\u0af0\u0aef\3\2\2\2\u0af0\u0af1\3\2\2\2\u0af1"+
		"\u0af2\3\2\2\2\u0af2\u0af4\t,\2\2\u0af3\u0ae7\3\2\2\2\u0af3\u0ae8\3\2"+
		"\2\2\u0af3\u0ae9\3\2\2\2\u0af3\u0aea\3\2\2\2\u0af3\u0aeb\3\2\2\2\u0af3"+
		"\u0aec\3\2\2\2\u0af3\u0aed\3\2\2\2\u0af3\u0aee\3\2\2\2\u0af3\u0af0\3\2"+
		"\2\2\u0af4\u0191\3\2\2\2\u0af5\u0af6\b\u00ca\1\2\u0af6\u0af7\7\u016d\2"+
		"\2\u0af7\u0af8\5\u012c\u0097\2\u0af8\u0af9\7\u0170\2\2\u0af9\u0b07\3\2"+
		"\2\2\u0afa\u0afb\7\u016d\2\2\u0afb\u0afc\5\u0192\u00ca\2\u0afc\u0afd\7"+
		"\u0170\2\2\u0afd\u0b07\3\2\2\2\u0afe\u0b07\5\u0196\u00cc\2\u0aff\u0b07"+
		"\5\u019a\u00ce\2\u0b00\u0b07\5\u019e\u00d0\2\u0b01\u0b07\5\u01a4\u00d3"+
		"\2\u0b02\u0b07\5\u01a6\u00d4\2\u0b03\u0b07\5\u01ae\u00d8\2\u0b04\u0b07"+
		"\5\u01b0\u00d9\2\u0b05\u0b07\5\u0194\u00cb\2\u0b06\u0af5\3\2\2\2\u0b06"+
		"\u0afa\3\2\2\2\u0b06\u0afe\3\2\2\2\u0b06\u0aff\3\2\2\2\u0b06\u0b00\3\2"+
		"\2\2\u0b06\u0b01\3\2\2\2\u0b06\u0b02\3\2\2\2\u0b06\u0b03\3\2\2\2\u0b06"+
		"\u0b04\3\2\2\2\u0b06\u0b05\3\2\2\2\u0b07\u0b18\3\2\2\2\u0b08\u0b09\f\20"+
		"\2\2\u0b09\u0b0a\7\u016b\2\2\u0b0a\u0b17\5\u0192\u00ca\21\u0b0b\u0b0c"+
		"\f\17\2\2\u0b0c\u0b0d\7\u0161\2\2\u0b0d\u0b17\5\u0192\u00ca\20\u0b0e\u0b0f"+
		"\f\16\2\2\u0b0f\u0b10\7\u015d\2\2\u0b10\u0b17\5\u0192\u00ca\17\u0b11\u0b12"+
		"\f\r\2\2\u0b12\u0b13\7\u0173\2\2\u0b13\u0b17\5\u0192\u00ca\16\u0b14\u0b15"+
		"\f\21\2\2\u0b15\u0b17\5\u0198\u00cd\2\u0b16\u0b08\3\2\2\2\u0b16\u0b0b"+
		"\3\2\2\2\u0b16\u0b0e\3\2\2\2\u0b16\u0b11\3\2\2\2\u0b16\u0b14\3\2\2\2\u0b17"+
		"\u0b1a\3\2\2\2\u0b18\u0b16\3\2\2\2\u0b18\u0b19\3\2\2\2\u0b19\u0193\3\2"+
		"\2\2\u0b1a\u0b18\3\2\2\2\u0b1b\u0b24\5\u01c6\u00e4\2\u0b1c\u0b24\5\u01c8"+
		"\u00e5\2\u0b1d\u0b24\5\u01d2\u00ea\2\u0b1e\u0b24\5\u01ca\u00e6\2\u0b1f"+
		"\u0b24\5\u01cc\u00e7\2\u0b20\u0b24\5\u01d0\u00e9\2\u0b21\u0b24\5\u01ce"+
		"\u00e8\2\u0b22\u0b24\5\u01d4\u00eb\2\u0b23\u0b1b\3\2\2\2\u0b23\u0b1c\3"+
		"\2\2\2\u0b23\u0b1d\3\2\2\2\u0b23\u0b1e\3\2\2\2\u0b23\u0b1f\3\2\2\2\u0b23"+
		"\u0b20\3\2\2\2\u0b23\u0b21\3\2\2\2\u0b23\u0b22\3\2\2\2\u0b24\u0195\3\2"+
		"\2\2\u0b25\u0b26\7\u0098\2\2\u0b26\u0b27\5\u0192\u00ca\2\u0b27\u0b28\5"+
		"\u0198\u00cd\2\u0b28\u0197\3\2\2\2\u0b29\u0b2a\t-\2\2\u0b2a\u0199\3\2"+
		"\2\2\u0b2b\u0b2c\5\u019c\u00cf\2\u0b2c\u0b2d\t.\2\2\u0b2d\u0b32\5\u019c"+
		"\u00cf\2\u0b2e\u0b2f\t.\2\2\u0b2f\u0b31\5\u019c\u00cf\2\u0b30\u0b2e\3"+
		"\2\2\2\u0b31\u0b34\3\2\2\2\u0b32\u0b30\3\2\2\2\u0b32\u0b33\3\2\2\2\u0b33"+
		"\u019b\3\2\2\2\u0b34\u0b32\3\2\2\2\u0b35\u0b36\7\u016d\2\2\u0b36\u0b37"+
		"\5\u0192\u00ca\2\u0b37\u0b38\7\u0170\2\2\u0b38\u0b3f\3\2\2\2\u0b39\u0b3f"+
		"\5\u019e\u00d0\2\u0b3a\u0b3f\5\u01a6\u00d4\2\u0b3b\u0b3f\5\u01ae\u00d8"+
		"\2\u0b3c\u0b3f\5\u01b0\u00d9\2\u0b3d\u0b3f\5\u0194\u00cb\2\u0b3e\u0b35"+
		"\3\2\2\2\u0b3e\u0b39\3\2\2\2\u0b3e\u0b3a\3\2\2\2\u0b3e\u0b3b\3\2\2\2\u0b3e"+
		"\u0b3c\3\2\2\2\u0b3e\u0b3d\3\2\2\2\u0b3f\u019d\3\2\2\2\u0b40\u0b43\5\u01a0"+
		"\u00d1\2\u0b41\u0b43\5\u01a2\u00d2\2\u0b42\u0b40\3\2\2\2\u0b42\u0b41\3"+
		"\2\2\2\u0b43\u019f\3\2\2\2\u0b44\u0b45\7%\2\2\u0b45\u0b4b\5\u0192\u00ca"+
		"\2\u0b46\u0b47\7\u013a\2\2\u0b47\u0b48\5\u0192\u00ca\2\u0b48\u0b49\7\u0123"+
		"\2\2\u0b49\u0b4a\5\u0192\u00ca\2\u0b4a\u0b4c\3\2\2\2\u0b4b\u0b46\3\2\2"+
		"\2\u0b4c\u0b4d\3\2\2\2\u0b4d\u0b4b\3\2\2\2\u0b4d\u0b4e\3\2\2\2\u0b4e\u0b51"+
		"\3\2\2\2\u0b4f\u0b50\7`\2\2\u0b50\u0b52\5\u0192\u00ca\2\u0b51\u0b4f\3"+
		"\2\2\2\u0b51\u0b52\3\2\2\2\u0b52\u0b53\3\2\2\2\u0b53\u0b54\7d\2\2\u0b54"+
		"\u01a1\3\2\2\2\u0b55\u0b5b\7%\2\2\u0b56\u0b57\7\u013a\2\2\u0b57\u0b58"+
		"\5\u0182\u00c2\2\u0b58\u0b59\7\u0123\2\2\u0b59\u0b5a\5\u0192\u00ca\2\u0b5a"+
		"\u0b5c\3\2\2\2\u0b5b\u0b56\3\2\2\2\u0b5c\u0b5d\3\2\2\2\u0b5d\u0b5b\3\2"+
		"\2\2\u0b5d\u0b5e\3\2\2\2\u0b5e\u0b61\3\2\2\2\u0b5f\u0b60\7`\2\2\u0b60"+
		"\u0b62\5\u0192\u00ca\2\u0b61\u0b5f\3\2\2\2\u0b61\u0b62\3\2\2\2\u0b62\u0b63"+
		"\3\2\2\2\u0b63\u0b64\7d\2\2\u0b64\u01a3\3\2\2\2\u0b65\u0b66\5\u01ca\u00e6"+
		"\2\u0b66\u0b67\7\5\2\2\u0b67\u0b68\t/\2\2\u0b68\u01a5\3\2\2\2\u0b69\u0b6a"+
		"\7\25\2\2\u0b6a\u0b6c\7\u016d\2\2\u0b6b\u0b6d\5\u01a8\u00d5\2\u0b6c\u0b6b"+
		"\3\2\2\2\u0b6c\u0b6d\3\2\2\2\u0b6d\u0b6e\3\2\2\2\u0b6e\u0b6f\5\u0192\u00ca"+
		"\2\u0b6f\u0b71\7\u0170\2\2\u0b70\u0b72\5\u01aa\u00d6\2\u0b71\u0b70\3\2"+
		"\2\2\u0b71\u0b72\3\2\2\2\u0b72\u0c02\3\2\2\2\u0b73\u0b74\7;\2\2\u0b74"+
		"\u0b7a\7\u016d\2\2\u0b75\u0b77\5\u01a8\u00d5\2\u0b76\u0b75\3\2\2\2\u0b76"+
		"\u0b77\3\2\2\2\u0b77\u0b78\3\2\2\2\u0b78\u0b7b\5\u0192\u00ca\2\u0b79\u0b7b"+
		"\7\u016b\2\2\u0b7a\u0b76\3\2\2\2\u0b7a\u0b79\3\2\2\2\u0b7b\u0b7c\3\2\2"+
		"\2\u0b7c\u0b7e\7\u0170\2\2\u0b7d\u0b7f\5\u01aa\u00d6\2\u0b7e\u0b7d\3\2"+
		"\2\2\u0b7e\u0b7f\3\2\2\2\u0b7f\u0c02\3\2\2\2\u0b80\u0b81\7<\2\2\u0b81"+
		"\u0b87\7\u016d\2\2\u0b82\u0b84\5\u01a8\u00d5\2\u0b83\u0b82\3\2\2\2\u0b83"+
		"\u0b84\3\2\2\2\u0b84\u0b85\3\2\2\2\u0b85\u0b88\5\u0192\u00ca\2\u0b86\u0b88"+
		"\7\u016b\2\2\u0b87\u0b83\3\2\2\2\u0b87\u0b86\3\2\2\2\u0b88\u0b89\3\2\2"+
		"\2\u0b89\u0b8b\7\u0170\2\2\u0b8a\u0b8c\5\u01aa\u00d6\2\u0b8b\u0b8a\3\2"+
		"\2\2\u0b8b\u0b8c\3\2\2\2\u0b8c\u0c02\3\2\2\2\u0b8d\u0b8e\7\u0146\2\2\u0b8e"+
		"\u0b8f\7\u016d\2\2\u0b8f\u0b90\7\u0170\2\2\u0b90\u0c02\5\u01aa\u00d6\2"+
		"\u0b91\u0b92\7\u014a\2\2\u0b92\u0b93\7\u016d\2\2\u0b93\u0b94\7\u0170\2"+
		"\2\u0b94\u0c02\5\u01aa\u00d6\2\u0b95\u0b96\7\u014b\2\2\u0b96\u0b97\7\u016d"+
		"\2\2\u0b97\u0b98\5\u0192\u00ca\2\u0b98\u0b99\7\u0170\2\2\u0b99\u0b9a\5"+
		"\u01aa\u00d6\2\u0b9a\u0c02\3\2\2\2\u0b9b\u0b9c\7\u014c\2\2\u0b9c\u0b9d"+
		"\7\u016d\2\2\u0b9d\u0ba4\5\u0192\u00ca\2\u0b9e\u0b9f\7\u015f\2\2\u0b9f"+
		"\u0ba2\5\u0192\u00ca\2\u0ba0\u0ba1\7\u015f\2\2\u0ba1\u0ba3\5\u0192\u00ca"+
		"\2\u0ba2\u0ba0\3\2\2\2\u0ba2\u0ba3\3\2\2\2\u0ba3\u0ba5\3\2\2\2\u0ba4\u0b9e"+
		"\3\2\2\2\u0ba4\u0ba5\3\2\2\2\u0ba5\u0ba6\3\2\2\2\u0ba6\u0ba7\7\u0170\2"+
		"\2\u0ba7\u0ba8\5\u01aa\u00d6\2\u0ba8\u0c02\3\2\2\2\u0ba9\u0baa\7\u014d"+
		"\2\2\u0baa\u0bab\7\u016d\2\2\u0bab\u0bac\5\u0192\u00ca\2\u0bac\u0bad\7"+
		"\u0170\2\2\u0bad\u0bae\5\u01aa\u00d6\2\u0bae\u0c02\3\2\2\2\u0baf\u0bb0"+
		"\7\u014e\2\2\u0bb0\u0bb1\7\u016d\2\2\u0bb1\u0bb8\5\u0192\u00ca\2\u0bb2"+
		"\u0bb3\7\u015f\2\2\u0bb3\u0bb6\5\u0192\u00ca\2\u0bb4\u0bb5\7\u015f\2\2"+
		"\u0bb5\u0bb7\5\u0192\u00ca\2\u0bb6\u0bb4\3\2\2\2\u0bb6\u0bb7\3\2\2\2\u0bb7"+
		"\u0bb9\3\2\2\2\u0bb8\u0bb2\3\2\2\2\u0bb8\u0bb9\3\2\2\2\u0bb9\u0bba\3\2"+
		"\2\2\u0bba\u0bbb\7\u0170\2\2\u0bbb\u0bbc\5\u01aa\u00d6\2\u0bbc\u0c02\3"+
		"\2\2\2\u0bbd\u0bbe\7\u00b3\2\2\u0bbe\u0bc0\7\u016d\2\2\u0bbf\u0bc1\5\u01a8"+
		"\u00d5\2\u0bc0\u0bbf\3\2\2\2\u0bc0\u0bc1\3\2\2\2\u0bc1\u0bc2\3\2\2\2\u0bc2"+
		"\u0bc3\5\u0192\u00ca\2\u0bc3\u0bc5\7\u0170\2\2\u0bc4\u0bc6\5\u01aa\u00d6"+
		"\2\u0bc5\u0bc4\3\2\2\2\u0bc5\u0bc6\3\2\2\2\u0bc6\u0c02\3\2\2\2\u0bc7\u0bc8"+
		"\7\u00b9\2\2\u0bc8\u0bca\7\u016d\2\2\u0bc9\u0bcb\5\u01a8\u00d5\2\u0bca"+
		"\u0bc9\3\2\2\2\u0bca\u0bcb\3\2\2\2\u0bcb\u0bcc\3\2\2\2\u0bcc\u0bcd\5\u0192"+
		"\u00ca\2\u0bcd\u0bcf\7\u0170\2\2\u0bce\u0bd0\5\u01aa\u00d6\2\u0bcf\u0bce"+
		"\3\2\2\2\u0bcf\u0bd0\3\2\2\2\u0bd0\u0c02\3\2\2\2\u0bd1\u0bd2\7\u0157\2"+
		"\2\u0bd2\u0bd3\7\u016d\2\2\u0bd3\u0bd4\7\u0170\2\2\u0bd4\u0c02\5\u01aa"+
		"\u00d6\2\u0bd5\u0bd6\7\u0158\2\2\u0bd6\u0bd7\7\u016d\2\2\u0bd7\u0bd8\7"+
		"\u0170\2\2\u0bd8\u0c02\5\u01aa\u00d6\2\u0bd9\u0bda\7\u0159\2\2\u0bda\u0bdc"+
		"\7\u016d\2\2\u0bdb\u0bdd\5\u01a8\u00d5\2\u0bdc\u0bdb\3\2\2\2\u0bdc\u0bdd"+
		"\3\2\2\2\u0bdd\u0bde\3\2\2\2\u0bde\u0bdf\5\u0192\u00ca\2\u0bdf\u0be1\7"+
		"\u0170\2\2\u0be0\u0be2\5\u01aa\u00d6\2\u0be1\u0be0\3\2\2\2\u0be1\u0be2"+
		"\3\2\2\2\u0be2\u0c02\3\2\2\2\u0be3\u0be4\7\u011b\2\2\u0be4\u0be6\7\u016d"+
		"\2\2\u0be5\u0be7\5\u01a8\u00d5\2\u0be6\u0be5\3\2\2\2\u0be6\u0be7\3\2\2"+
		"\2\u0be7\u0be8\3\2\2\2\u0be8\u0be9\5\u0192\u00ca\2\u0be9\u0beb\7\u0170"+
		"\2\2\u0bea\u0bec\5\u01aa\u00d6\2\u0beb\u0bea\3\2\2\2\u0beb\u0bec\3\2\2"+
		"\2\u0bec\u0c02\3\2\2\2\u0bed\u0bee\7\u0135\2\2\u0bee\u0bf0\7\u016d\2\2"+
		"\u0bef\u0bf1\5\u01a8\u00d5\2\u0bf0\u0bef\3\2\2\2\u0bf0\u0bf1\3\2\2\2\u0bf1"+
		"\u0bf2\3\2\2\2\u0bf2\u0bf3\5\u0192\u00ca\2\u0bf3\u0bf5\7\u0170\2\2\u0bf4"+
		"\u0bf6\5\u01aa\u00d6\2\u0bf5\u0bf4\3\2\2\2\u0bf5\u0bf6\3\2\2\2\u0bf6\u0c02"+
		"\3\2\2\2\u0bf7\u0bf8\7\u015b\2\2\u0bf8\u0bfa\7\u016d\2\2\u0bf9\u0bfb\5"+
		"\u01a8\u00d5\2\u0bfa\u0bf9\3\2\2\2\u0bfa\u0bfb\3\2\2\2\u0bfb\u0bfc\3\2"+
		"\2\2\u0bfc\u0bfd\5\u0192\u00ca\2\u0bfd\u0bff\7\u0170\2\2\u0bfe\u0c00\5"+
		"\u01aa\u00d6\2\u0bff\u0bfe\3\2\2\2\u0bff\u0c00\3\2\2\2\u0c00\u0c02\3\2"+
		"\2\2\u0c01\u0b69\3\2\2\2\u0c01\u0b73\3\2\2\2\u0c01\u0b80\3\2\2\2\u0c01"+
		"\u0b8d\3\2\2\2\u0c01\u0b91\3\2\2\2\u0c01\u0b95\3\2\2\2\u0c01\u0b9b\3\2"+
		"\2\2\u0c01\u0ba9\3\2\2\2\u0c01\u0baf\3\2\2\2\u0c01\u0bbd\3\2\2\2\u0c01"+
		"\u0bc7\3\2\2\2\u0c01\u0bd1\3\2\2\2\u0c01\u0bd5\3\2\2\2\u0c01\u0bd9\3\2"+
		"\2\2\u0c01\u0be3\3\2\2\2\u0c01\u0bed\3\2\2\2\u0c01\u0bf7\3\2\2\2\u0c02"+
		"\u01a7\3\2\2\2\u0c03\u0c04\t&\2\2\u0c04\u01a9\3\2\2\2\u0c05\u0c06\7\u00d1"+
		"\2\2\u0c06\u0c08\7\u016d\2\2\u0c07\u0c09\5\u01ac\u00d7\2\u0c08\u0c07\3"+
		"\2\2\2\u0c08\u0c09\3\2\2\2\u0c09\u0c0b\3\2\2\2\u0c0a\u0c0c\5\u0166\u00b4"+
		"\2\u0c0b\u0c0a\3\2\2\2\u0c0b\u0c0c\3\2\2\2\u0c0c\u0c0d\3\2\2\2\u0c0d\u0c0e"+
		"\7\u0170\2\2\u0c0e\u01ab\3\2\2\2\u0c0f\u0c10\7\u00d5\2\2\u0c10\u0c11\7"+
		" \2\2\u0c11\u0c16\5\u0192\u00ca\2\u0c12\u0c13\7\u015f\2\2\u0c13\u0c15"+
		"\5\u0192\u00ca\2\u0c14\u0c12\3\2\2\2\u0c15\u0c18\3\2\2\2\u0c16\u0c14\3"+
		"\2\2\2\u0c16\u0c17\3\2\2\2\u0c17\u01ad\3\2\2\2\u0c18\u0c16\3\2\2\2\u0c19"+
		"\u0ce2\7\u0145\2\2\u0c1a\u0c1b\7\'\2\2\u0c1b\u0c1c\7\u016d\2\2\u0c1c\u0c1d"+
		"\5\u0192\u00ca\2\u0c1d\u0c1e\7\20\2\2\u0c1e\u0c20\5x=\2\u0c1f\u0c21\5"+
		"z>\2\u0c20\u0c1f\3\2\2\2\u0c20\u0c21\3\2\2\2\u0c21\u0c22\3\2\2\2\u0c22"+
		"\u0c23\7\u0170\2\2\u0c23\u0ce2\3\2\2\2\u0c24\u0c25\7;\2\2\u0c25\u0c28"+
		"\7\u016d\2\2\u0c26\u0c29\5\u0192\u00ca\2\u0c27\u0c29\7\u016b\2\2\u0c28"+
		"\u0c26\3\2\2\2\u0c28\u0c27\3\2\2\2\u0c29\u0c2a\3\2\2\2\u0c2a\u0ce2\7\u0170"+
		"\2\2\u0c2b\u0ce2\7\u0147\2\2\u0c2c\u0c2d\7A\2\2\u0c2d\u0ce2\7F\2\2\u0c2e"+
		"\u0c32\7\u0148\2\2\u0c2f\u0c30\7A\2\2\u0c30\u0c32\7\u0124\2\2\u0c31\u0c2e"+
		"\3\2\2\2\u0c31\u0c2f\3\2\2\2\u0c32\u0c37\3\2\2\2\u0c33\u0c34\7\u016d\2"+
		"\2\u0c34\u0c35\5\u0192\u00ca\2\u0c35\u0c36\7\u0170\2\2\u0c36\u0c38\3\2"+
		"\2\2\u0c37\u0c33\3\2\2\2\u0c37\u0c38\3\2\2\2\u0c38\u0ce2\3\2\2\2\u0c39"+
		"\u0ce2\7\u0149\2\2\u0c3a\u0c3b\7A\2\2\u0c3b\u0ce2\7\u015c\2\2\u0c3c\u0c3d"+
		"\7\u014f\2\2\u0c3d\u0c3e\7\u016d\2\2\u0c3e\u0c4b\5\u0192\u00ca\2\u0c3f"+
		"\u0c40\7\u015f\2\2\u0c40\u0c48\5\u0192\u00ca\2\u0c41\u0c42\7\u015f\2\2"+
		"\u0c42\u0c43\5\u0192\u00ca\2\u0c43\u0c44\7\u0163\2\2\u0c44\u0c45\5\u0192"+
		"\u00ca\2\u0c45\u0c47\3\2\2\2\u0c46\u0c41\3\2\2\2\u0c47\u0c4a\3\2\2\2\u0c48"+
		"\u0c46\3\2\2\2\u0c48\u0c49\3\2\2\2\u0c49\u0c4c\3\2\2\2\u0c4a\u0c48\3\2"+
		"\2\2\u0c4b\u0c3f\3\2\2\2\u0c4b\u0c4c\3\2\2\2\u0c4c\u0c4d\3\2\2\2\u0c4d"+
		"\u0c4e\7\u0170\2\2\u0c4e\u0ce2\3\2\2\2\u0c4f\u0c50\7\u0150\2\2\u0c50\u0c51"+
		"\7\u016d\2\2\u0c51\u0c5e\5\u0192\u00ca\2\u0c52\u0c53\7\u015f\2\2\u0c53"+
		"\u0c5b\5\u0192\u00ca\2\u0c54\u0c55\7\u015f\2\2\u0c55\u0c56\5\u0192\u00ca"+
		"\2\u0c56\u0c57\7\u0163\2\2\u0c57\u0c58\5\u0192\u00ca\2\u0c58\u0c5a\3\2"+
		"\2\2\u0c59\u0c54\3\2\2\2\u0c5a\u0c5d\3\2\2\2\u0c5b\u0c59\3\2\2\2\u0c5b"+
		"\u0c5c\3\2\2\2\u0c5c\u0c5f\3\2\2\2\u0c5d\u0c5b\3\2\2\2\u0c5e\u0c52\3\2"+
		"\2\2\u0c5e\u0c5f\3\2\2\2\u0c5f\u0c60\3\2\2\2\u0c60\u0c61\7\u0170\2\2\u0c61"+
		"\u0ce2\3\2\2\2\u0c62\u0c63\7\u0151\2\2\u0c63\u0c64\7\u016d\2\2\u0c64\u0c71"+
		"\5\u0192\u00ca\2\u0c65\u0c66\7\u015f\2\2\u0c66\u0c6e\5\u0192\u00ca\2\u0c67"+
		"\u0c68\7\u015f\2\2\u0c68\u0c69\5\u0192\u00ca\2\u0c69\u0c6a\7\u0163\2\2"+
		"\u0c6a\u0c6b\5\u0192\u00ca\2\u0c6b\u0c6d\3\2\2\2\u0c6c\u0c67\3\2\2\2\u0c6d"+
		"\u0c70\3\2\2\2\u0c6e\u0c6c\3\2\2\2\u0c6e\u0c6f\3\2\2\2\u0c6f\u0c72\3\2"+
		"\2\2\u0c70\u0c6e\3\2\2\2\u0c71\u0c65\3\2\2\2\u0c71\u0c72\3\2\2\2\u0c72"+
		"\u0c73\3\2\2\2\u0c73\u0c74\7\u0170\2\2\u0c74\u0ce2\3\2\2\2\u0c75\u0c76"+
		"\7\u0152\2\2\u0c76\u0c77\7\u016d\2\2\u0c77\u0c84\5\u0192\u00ca\2\u0c78"+
		"\u0c79\7\u015f\2\2\u0c79\u0c81\5\u0192\u00ca\2\u0c7a\u0c7b\7\u015f\2\2"+
		"\u0c7b\u0c7c\5\u0192\u00ca\2\u0c7c\u0c7d\7\u0163\2\2\u0c7d\u0c7e\5\u0192"+
		"\u00ca\2\u0c7e\u0c80\3\2\2\2\u0c7f\u0c7a\3\2\2\2\u0c80\u0c83\3\2\2\2\u0c81"+
		"\u0c7f\3\2\2\2\u0c81\u0c82\3\2\2\2\u0c82\u0c85\3\2\2\2\u0c83\u0c81\3\2"+
		"\2\2\u0c84\u0c78\3\2\2\2\u0c84\u0c85\3\2\2\2\u0c85\u0c86\3\2\2\2\u0c86"+
		"\u0c87\7\u0170\2\2\u0c87\u0ce2\3\2\2\2\u0c88\u0c89\7\u0153\2\2\u0c89\u0c8a"+
		"\7\u016d\2\2\u0c8a\u0c97\5\u0192\u00ca\2\u0c8b\u0c8c\7\u015f\2\2\u0c8c"+
		"\u0c94\5\u0192\u00ca\2\u0c8d\u0c8e\7\u015f\2\2\u0c8e\u0c8f\5\u0192\u00ca"+
		"\2\u0c8f\u0c90\7\u0163\2\2\u0c90\u0c91\5\u0192\u00ca\2\u0c91\u0c93\3\2"+
		"\2\2\u0c92\u0c8d\3\2\2\2\u0c93\u0c96\3\2\2\2\u0c94\u0c92\3\2\2\2\u0c94"+
		"\u0c95\3\2\2\2\u0c95\u0c98\3\2\2\2\u0c96\u0c94\3\2\2\2\u0c97\u0c8b\3\2"+
		"\2\2\u0c97\u0c98\3\2\2\2\u0c98\u0c99\3\2\2\2\u0c99\u0c9a\7\u0170\2\2\u0c9a"+
		"\u0ce2\3\2\2\2\u0c9b\u0c9c\7\u0154\2\2\u0c9c\u0c9d\7\u016d\2\2\u0c9d\u0caa"+
		"\5\u0192\u00ca\2\u0c9e\u0c9f\7\u015f\2\2\u0c9f\u0ca7\5\u0192\u00ca\2\u0ca0"+
		"\u0ca1\7\u015f\2\2\u0ca1\u0ca2\5\u0192\u00ca\2\u0ca2\u0ca3\7\u0163\2\2"+
		"\u0ca3\u0ca4\5\u0192\u00ca\2\u0ca4\u0ca6\3\2\2\2\u0ca5\u0ca0\3\2\2\2\u0ca6"+
		"\u0ca9\3\2\2\2\u0ca7\u0ca5\3\2\2\2\u0ca7\u0ca8\3\2\2\2\u0ca8\u0cab\3\2"+
		"\2\2\u0ca9\u0ca7\3\2\2\2\u0caa\u0c9e\3\2\2\2\u0caa\u0cab\3\2\2\2\u0cab"+
		"\u0cac\3\2\2\2\u0cac\u0cad\7\u0170\2\2\u0cad\u0ce2\3\2\2\2\u0cae\u0caf"+
		"\7\u0155\2\2\u0caf\u0cb0\7\u016d\2\2\u0cb0\u0cb8\5\u0192\u00ca\2\u0cb1"+
		"\u0cb2\7\u015f\2\2\u0cb2\u0cb3\5\u0192\u00ca\2\u0cb3\u0cb4\7\u0163\2\2"+
		"\u0cb4\u0cb5\5\u0192\u00ca\2\u0cb5\u0cb7\3\2\2\2\u0cb6\u0cb1\3\2\2\2\u0cb7"+
		"\u0cba\3\2\2\2\u0cb8\u0cb6\3\2\2\2\u0cb8\u0cb9\3\2\2\2\u0cb9\u0cbb\3\2"+
		"\2\2\u0cba\u0cb8\3\2\2\2\u0cbb\u0cbc\7\u0170\2\2\u0cbc\u0ce2\3\2\2\2\u0cbd"+
		"\u0cbe\7\u0156\2\2\u0cbe\u0cbf\7\u016d\2\2\u0cbf\u0cc5\5\u0192\u00ca\2"+
		"\u0cc0\u0cc1\7\u015f\2\2\u0cc1\u0cc2\5\u0192\u00ca\2\u0cc2\u0cc3\7\u0163"+
		"\2\2\u0cc3\u0cc4\5\u0192\u00ca\2\u0cc4\u0cc6\3\2\2\2\u0cc5\u0cc0\3\2\2"+
		"\2\u0cc6\u0cc7\3\2\2\2\u0cc7\u0cc5\3\2\2\2\u0cc7\u0cc8\3\2\2\2\u0cc8\u0ccb"+
		"\3\2\2\2\u0cc9\u0cca\7\u015f\2\2\u0cca\u0ccc\5\u0192\u00ca\2\u0ccb\u0cc9"+
		"\3\2\2\2\u0ccb\u0ccc\3\2\2\2\u0ccc\u0ccd\3\2\2\2\u0ccd\u0cce\7\u0170\2"+
		"\2\u0cce\u0ce2\3\2\2\2\u0ccf\u0cd0\7\u00fb\2\2\u0cd0\u0cd1\7\u016d\2\2"+
		"\u0cd1\u0cd2\5\u0192\u00ca\2\u0cd2\u0cd3\7\u0170\2\2\u0cd3\u0ce2\3\2\2"+
		"\2\u0cd4\u0cd5\7\u011a\2\2\u0cd5\u0cd6\7\u016d\2\2\u0cd6\u0cd7\5\u0192"+
		"\u00ca\2\u0cd7\u0cd8\7y\2\2\u0cd8\u0cdb\5\u0192\u00ca\2\u0cd9\u0cda\7"+
		"u\2\2\u0cda\u0cdc\5\u0192\u00ca\2\u0cdb\u0cd9\3\2\2\2\u0cdb\u0cdc\3\2"+
		"\2\2\u0cdc\u0cdd\3\2\2\2\u0cdd\u0cde\7\u0170\2\2\u0cde\u0ce2\3\2\2\2\u0cdf"+
		"\u0ce2\7\u015a\2\2\u0ce0\u0ce2\7\u015c\2\2\u0ce1\u0c19\3\2\2\2\u0ce1\u0c1a"+
		"\3\2\2\2\u0ce1\u0c24\3\2\2\2\u0ce1\u0c2b\3\2\2\2\u0ce1\u0c2c\3\2\2\2\u0ce1"+
		"\u0c31\3\2\2\2\u0ce1\u0c39\3\2\2\2\u0ce1\u0c3a\3\2\2\2\u0ce1\u0c3c\3\2"+
		"\2\2\u0ce1\u0c4f\3\2\2\2\u0ce1\u0c62\3\2\2\2\u0ce1\u0c75\3\2\2\2\u0ce1"+
		"\u0c88\3\2\2\2\u0ce1\u0c9b\3\2\2\2\u0ce1\u0cae\3\2\2\2\u0ce1\u0cbd\3\2"+
		"\2\2\u0ce1\u0ccf\3\2\2\2\u0ce1\u0cd4\3\2\2\2\u0ce1\u0cdf\3\2\2\2\u0ce1"+
		"\u0ce0\3\2\2\2\u0ce2\u01af\3\2\2\2\u0ce3\u0ce4\5\u01ca\u00e6\2\u0ce4\u0ce6"+
		"\7\u016d\2\2\u0ce5\u0ce7\5\u01b2\u00da\2\u0ce6\u0ce5\3\2\2\2\u0ce6\u0ce7"+
		"\3\2\2\2\u0ce7\u0ce8\3\2\2\2\u0ce8\u0ce9\7\u0170\2\2\u0ce9\u01b1\3\2\2"+
		"\2\u0cea\u0cef\5\u01b4\u00db\2\u0ceb\u0cec\7\u015f\2\2\u0cec\u0cee\5\u01b4"+
		"\u00db\2\u0ced\u0ceb\3\2\2\2\u0cee\u0cf1\3\2\2\2\u0cef\u0ced\3\2\2\2\u0cef"+
		"\u0cf0\3\2\2\2\u0cf0\u01b3\3\2\2\2\u0cf1\u0cef\3\2\2\2\u0cf2\u0cf8\6\u00db"+
		"\16\2\u0cf3\u0cf4\5\u01ca\u00e6\2\u0cf4\u0cf6\7\u0163\2\2\u0cf5\u0cf7"+
		"\7\u0167\2\2\u0cf6\u0cf5\3\2\2\2\u0cf6\u0cf7\3\2\2\2\u0cf7\u0cf9\3\2\2"+
		"\2\u0cf8\u0cf3\3\2\2\2\u0cf8\u0cf9\3\2\2\2\u0cf9\u0cfa\3\2\2\2\u0cfa\u0cfb"+
		"\5\u0192\u00ca\2\u0cfb\u01b5\3\2\2\2\u0cfc\u0cff\5\u012c\u0097\2\u0cfd"+
		"\u0cff\5\u0192\u00ca\2\u0cfe\u0cfc\3\2\2\2\u0cfe\u0cfd\3\2\2\2\u0cff\u01b7"+
		"\3\2\2\2\u0d00\u0d03\5\u01c4\u00e3\2\u0d01\u0d03\5\u0192\u00ca\2\u0d02"+
		"\u0d00\3\2\2\2\u0d02\u0d01\3\2\2\2\u0d03\u01b9\3\2\2\2\u0d04\u0d08\7\u0085"+
		"\2\2\u0d05\u0d07\5\u01bc\u00df\2\u0d06\u0d05\3\2\2\2\u0d07\u0d0a\3\2\2"+
		"\2\u0d08\u0d06\3\2\2\2\u0d08\u0d09\3\2\2\2\u0d09\u01bb\3\2\2\2\u0d0a\u0d08"+
		"\3\2\2\2\u0d0b\u0d0c\7\u0173\2\2\u0d0c\u0d0d\5\u01ca\u00e6\2\u0d0d\u0d0e"+
		"\5\u0192\u00ca\2\u0d0e\u0d18\3\2\2\2\u0d0f\u0d10\7\u0173\2\2\u0d10\u0d11"+
		"\5\u01ca\u00e6\2\u0d11\u0d12\7\u0174\2\2\u0d12\u0d13\7\u0163\2\2\u0d13"+
		"\u0d14\5\u0192\u00ca\2\u0d14\u0d18\3\2\2\2\u0d15\u0d16\7\u0173\2\2\u0d16"+
		"\u0d18\5\u01ca\u00e6\2\u0d17\u0d0b\3\2\2\2\u0d17\u0d0f\3\2\2\2\u0d17\u0d15"+
		"\3\2\2\2\u0d18\u01bd\3\2\2\2\u0d19\u0d1a\7\7\2\2\u0d1a\u0d1b\5\u01c0\u00e1"+
		"\2\u0d1b\u0d1c\7\u0172\2\2\u0d1c\u0d1f\3\2\2\2\u0d1d\u0d1f\5\u01c2\u00e2"+
		"\2\u0d1e\u0d19\3\2\2\2\u0d1e\u0d1d\3\2\2\2\u0d1f\u01bf\3\2\2\2\u0d20\u0d22"+
		"\13\2\2\2\u0d21\u0d20\3\2\2\2\u0d22\u0d25\3\2\2\2\u0d23\u0d24\3\2\2\2"+
		"\u0d23\u0d21\3\2\2\2\u0d24\u01c1\3\2\2\2\u0d25\u0d23\3\2\2\2\u0d26\u0d27"+
		"\7\u0086\2\2\u0d27\u0d28\5\u0192\u00ca\2\u0d28\u01c3\3\2\2\2\u0d29\u0d38"+
		"\7\u017c\2\2\u0d2a\u0d2e\7\u0161\2\2\u0d2b\u0d2c\7\6\2\2\u0d2c\u0d2e\7"+
		"\u0161\2\2\u0d2d\u0d2a\3\2\2\2\u0d2d\u0d2b\3\2\2\2\u0d2d\u0d2e\3\2\2\2"+
		"\u0d2e\u0d2f\3\2\2\2\u0d2f\u0d34\5\u01ca\u00e6\2\u0d30\u0d31\7\u0161\2"+
		"\2\u0d31\u0d33\5\u01ca\u00e6\2\u0d32\u0d30\3\2\2\2\u0d33\u0d36\3\2\2\2"+
		"\u0d34\u0d32\3\2\2\2\u0d34\u0d35\3\2\2\2\u0d35\u0d38\3\2\2\2\u0d36\u0d34"+
		"\3\2\2\2\u0d37\u0d29\3\2\2\2\u0d37\u0d2d\3\2\2\2\u0d38\u01c5\3\2\2\2\u0d39"+
		"\u0d3a\7F\2\2\u0d3a\u0d3b\5\u01cc\u00e7\2\u0d3b\u01c7\3\2\2\2\u0d3c\u0d3d"+
		"\7\u0124\2\2\u0d3d\u0d3e\5\u01cc\u00e7\2\u0d3e\u01c9\3\2\2\2\u0d3f\u0d42"+
		"\7\u0174\2\2\u0d40\u0d42\5\u01d6\u00ec\2\u0d41\u0d3f\3\2\2\2\u0d41\u0d40"+
		"\3\2\2\2\u0d42\u0d4a\3\2\2\2\u0d43\u0d46\7\6\2\2\u0d44\u0d47\7\u0174\2"+
		"\2\u0d45\u0d47\5\u01d6\u00ec\2\u0d46\u0d44\3\2\2\2\u0d46\u0d45\3\2\2\2"+
		"\u0d47\u0d49\3\2\2\2\u0d48\u0d43\3\2\2\2\u0d49\u0d4c\3\2\2\2\u0d4a\u0d48"+
		"\3\2\2\2\u0d4a\u0d4b\3\2\2\2\u0d4b\u01cb\3\2\2\2\u0d4c\u0d4a\3\2\2\2\u0d4d"+
		"\u0d50\7\u0175\2\2\u0d4e\u0d50\7\u0176\2\2\u0d4f\u0d4d\3\2\2\2\u0d4f\u0d4e"+
		"\3\2\2\2\u0d50\u01cd\3\2\2\2\u0d51\u0d53\t\60\2\2\u0d52\u0d51\3\2\2\2"+
		"\u0d52\u0d53\3\2\2\2\u0d53\u0d54\3\2\2\2\u0d54\u0d55\7\u0177\2\2\u0d55"+
		"\u01cf\3\2\2\2\u0d56\u0d58\t\60\2\2\u0d57\u0d56\3\2\2\2\u0d57\u0d58\3"+
		"\2\2\2\u0d58\u0d59\3\2\2\2\u0d59\u0d5a\7\u0178\2\2\u0d5a\u01d1\3\2\2\2"+
		"\u0d5b\u0d5c\t\61\2\2\u0d5c\u01d3\3\2\2\2\u0d5d\u0d5e\7\u00c5\2\2\u0d5e"+
		"\u01d5\3\2\2\2\u0d5f\u0d60\t\62\2\2\u0d60\u01d7\3\2\2\2\u01b3\u01dd\u01e0"+
		"\u01e4\u01e7\u01ec\u01f3\u01f9\u01fb\u0204\u0207\u0209\u024b\u0253\u0263"+
		"\u026a\u026d\u0272\u0276\u027f\u0284\u028c\u0291\u029a\u02a6\u02ab\u02ae"+
		"\u02bc\u02c3\u02cc\u02dd\u02e1\u02e9\u02f4\u02fe\u0306\u030d\u0311\u0315"+
		"\u031a\u031e\u0323\u0327\u032b\u0335\u0339\u033e\u0343\u0347\u0354\u0359"+
		"\u035f\u0368\u036c\u0374\u0377\u037c\u0381\u0388\u038f\u0392\u0399\u039f"+
		"\u03a4\u03aa\u03af\u03b2\u03b8\u03c6\u03d0\u03d6\u03db\u03e0\u03e5\u03e9"+
		"\u03ee\u03f1\u03fb\u0407\u040e\u0411\u041d\u0422\u0427\u042a\u0431\u043d"+
		"\u044a\u044c\u0451\u0454\u0463\u0469\u0474\u0477\u0481\u0488\u048e\u0496"+
		"\u04a0\u04b4\u04ba\u04be\u04c3\u04c7\u04cc\u04cf\u04d4\u04d7\u04e3\u04ea"+
		"\u04ef\u04f4\u04f8\u04fd\u0500\u050a\u0516\u051d\u0525\u0533\u0552\u0554"+
		"\u0559\u055d\u0562\u0569\u056c\u056f\u0574\u0578\u057a\u0581\u0587\u058e"+
		"\u0594\u0597\u059c\u05a0\u05a3\u05aa\u05b0\u05b3\u05bd\u05c6\u05cd\u05d4"+
		"\u05d6\u05dc\u05df\u05ea\u05f3\u05f9\u05ff\u0602\u0607\u060a\u060d\u0610"+
		"\u0613\u0619\u0623\u062e\u0631\u0638\u063d\u0642\u0646\u064e\u0652\u0657"+
		"\u065b\u065d\u0662\u066a\u066f\u0675\u067c\u067f\u0686\u068e\u0696\u0699"+
		"\u069c\u06a1\u06aa\u06ae\u06b8\u06cb\u06d2\u06d4\u06d8\u06dc\u06e4\u06ef"+
		"\u06f8\u0700\u0709\u070c\u070f\u071d\u0720\u0723\u0726\u0730\u0736\u0741"+
		"\u0745\u074d\u075f\u076d\u0774\u0778\u077f\u0781\u0785\u078e\u0796\u079f"+
		"\u07af\u07b5\u07b9\u07c3\u07cb\u07d4\u07d8\u07de\u07e3\u07e7\u07f1\u07f7"+
		"\u07fb\u0807\u080e\u081e\u0825\u082f\u0838\u083b\u083f\u0846\u084d\u084f"+
		"\u0853\u0857\u085c\u085f\u0863\u0866\u0871\u0874\u087f\u0885\u0889\u088b"+
		"\u088f\u0898\u089f\u08a3\u08a7\u08ae\u08b2\u08ba\u08c0\u08c4\u08cf\u08d6"+
		"\u08e3\u08eb\u08ef\u08f9\u08fe\u090b\u0916\u091e\u0922\u0926\u092a\u092c"+
		"\u0931\u0934\u0937\u093a\u093e\u0941\u0944\u0947\u094a\u0951\u095c\u0960"+
		"\u0963\u0967\u096e\u0972\u097c\u0984\u098a\u098e\u0994\u099d\u09a0\u09a5"+
		"\u09a8\u09b2\u09b7\u09c0\u09c5\u09c9\u09d2\u09d6\u09e4\u09f1\u09f6\u09fa"+
		"\u0a00\u0a0b\u0a0d\u0a14\u0a17\u0a1e\u0a23\u0a29\u0a2c\u0a2f\u0a3e\u0a45"+
		"\u0a48\u0a4b\u0a4f\u0a54\u0a5a\u0a5e\u0a69\u0a6d\u0a70\u0a74\u0a78\u0a7c"+
		"\u0a80\u0a86\u0a8c\u0a93\u0a9b\u0aa1\u0aa6\u0ab1\u0aba\u0abe\u0ac7\u0acb"+
		"\u0ad5\u0ada\u0af0\u0af3\u0b06\u0b16\u0b18\u0b23\u0b32\u0b3e\u0b42\u0b4d"+
		"\u0b51\u0b5d\u0b61\u0b6c\u0b71\u0b76\u0b7a\u0b7e\u0b83\u0b87\u0b8b\u0ba2"+
		"\u0ba4\u0bb6\u0bb8\u0bc0\u0bc5\u0bca\u0bcf\u0bdc\u0be1\u0be6\u0beb\u0bf0"+
		"\u0bf5\u0bfa\u0bff\u0c01\u0c08\u0c0b\u0c16\u0c20\u0c28\u0c31\u0c37\u0c48"+
		"\u0c4b\u0c5b\u0c5e\u0c6e\u0c71\u0c81\u0c84\u0c94\u0c97\u0ca7\u0caa\u0cb8"+
		"\u0cc7\u0ccb\u0cdb\u0ce1\u0ce6\u0cef\u0cf6\u0cf8\u0cfe\u0d02\u0d08\u0d17"+
		"\u0d1e\u0d23\u0d2d\u0d34\u0d37\u0d41\u0d46\u0d4a\u0d4f\u0d52\u0d57";
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