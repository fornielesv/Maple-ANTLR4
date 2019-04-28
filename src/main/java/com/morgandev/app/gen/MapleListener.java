// Generated from C:/Users/Morgan/IdeaProjects/AntlrProj/src/main/antlr/com/morgandev/maple/Maple\Maple.g4 by ANTLR 4.7.2
package com.morgandev.app.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MapleParser}.
 */
public interface MapleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MapleParser#maple_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterMaple_stmt_list(MapleParser.Maple_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#maple_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitMaple_stmt_list(MapleParser.Maple_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#maple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMaple_stmt(MapleParser.Maple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#maple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMaple_stmt(MapleParser.Maple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(MapleParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(MapleParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(MapleParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(MapleParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(MapleParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(MapleParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(MapleParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(MapleParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#join_stmt}.
	 * @param ctx the parse tree
	 */
	void enterJoin_stmt(MapleParser.Join_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#join_stmt}.
	 * @param ctx the parse tree
	 */
	void exitJoin_stmt(MapleParser.Join_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(MapleParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(MapleParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MapleParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MapleParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MapleParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MapleParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(MapleParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(MapleParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#any_column_definition}.
	 * @param ctx the parse tree
	 */
	void enterAny_column_definition(MapleParser.Any_column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#any_column_definition}.
	 * @param ctx the parse tree
	 */
	void exitAny_column_definition(MapleParser.Any_column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#null_column_name}.
	 * @param ctx the parse tree
	 */
	void enterNull_column_name(MapleParser.Null_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#null_column_name}.
	 * @param ctx the parse tree
	 */
	void exitNull_column_name(MapleParser.Null_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(MapleParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(MapleParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(MapleParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(MapleParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(MapleParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(MapleParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(MapleParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(MapleParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(MapleParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(MapleParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(MapleParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(MapleParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(MapleParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(MapleParser.Any_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#embedded_sql}.
	 * @param ctx the parse tree
	 */
	void enterEmbedded_sql(MapleParser.Embedded_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#embedded_sql}.
	 * @param ctx the parse tree
	 */
	void exitEmbedded_sql(MapleParser.Embedded_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link MapleParser#any_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAny_stmt(MapleParser.Any_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MapleParser#any_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAny_stmt(MapleParser.Any_stmtContext ctx);
}