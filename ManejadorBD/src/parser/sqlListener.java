package parser;

// Generated from sql.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sqlParser}.
 */
public interface sqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sqlParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(sqlParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(sqlParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#database}.
	 * @param ctx the parse tree
	 */
	void enterDatabase(sqlParser.DatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#database}.
	 * @param ctx the parse tree
	 */
	void exitDatabase(sqlParser.DatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#database_plural}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_plural(sqlParser.Database_pluralContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#database_plural}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_plural(sqlParser.Database_pluralContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(sqlParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(sqlParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#drop}.
	 * @param ctx the parse tree
	 */
	void enterDrop(sqlParser.DropContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#drop}.
	 * @param ctx the parse tree
	 */
	void exitDrop(sqlParser.DropContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#alter}.
	 * @param ctx the parse tree
	 */
	void enterAlter(sqlParser.AlterContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#alter}.
	 * @param ctx the parse tree
	 */
	void exitAlter(sqlParser.AlterContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#rename}.
	 * @param ctx the parse tree
	 */
	void enterRename(sqlParser.RenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#rename}.
	 * @param ctx the parse tree
	 */
	void exitRename(sqlParser.RenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#to}.
	 * @param ctx the parse tree
	 */
	void enterTo(sqlParser.ToContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#to}.
	 * @param ctx the parse tree
	 */
	void exitTo(sqlParser.ToContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(sqlParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(sqlParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#use}.
	 * @param ctx the parse tree
	 */
	void enterUse(sqlParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#use}.
	 * @param ctx the parse tree
	 */
	void exitUse(sqlParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#int_terminal}.
	 * @param ctx the parse tree
	 */
	void enterInt_terminal(sqlParser.Int_terminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#int_terminal}.
	 * @param ctx the parse tree
	 */
	void exitInt_terminal(sqlParser.Int_terminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#float_terminal}.
	 * @param ctx the parse tree
	 */
	void enterFloat_terminal(sqlParser.Float_terminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#float_terminal}.
	 * @param ctx the parse tree
	 */
	void exitFloat_terminal(sqlParser.Float_terminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#char_name}.
	 * @param ctx the parse tree
	 */
	void enterChar_name(sqlParser.Char_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#char_name}.
	 * @param ctx the parse tree
	 */
	void exitChar_name(sqlParser.Char_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#char_terminal}.
	 * @param ctx the parse tree
	 */
	void enterChar_terminal(sqlParser.Char_terminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#char_terminal}.
	 * @param ctx the parse tree
	 */
	void exitChar_terminal(sqlParser.Char_terminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#date_terminal}.
	 * @param ctx the parse tree
	 */
	void enterDate_terminal(sqlParser.Date_terminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#date_terminal}.
	 * @param ctx the parse tree
	 */
	void exitDate_terminal(sqlParser.Date_terminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#constraint_terminal}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_terminal(sqlParser.Constraint_terminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#constraint_terminal}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_terminal(sqlParser.Constraint_terminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(sqlParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(sqlParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(sqlParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(sqlParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#foreign}.
	 * @param ctx the parse tree
	 */
	void enterForeign(sqlParser.ForeignContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#foreign}.
	 * @param ctx the parse tree
	 */
	void exitForeign(sqlParser.ForeignContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#references}.
	 * @param ctx the parse tree
	 */
	void enterReferences(sqlParser.ReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#references}.
	 * @param ctx the parse tree
	 */
	void exitReferences(sqlParser.ReferencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#check}.
	 * @param ctx the parse tree
	 */
	void enterCheck(sqlParser.CheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#check}.
	 * @param ctx the parse tree
	 */
	void exitCheck(sqlParser.CheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(sqlParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(sqlParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(sqlParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(sqlParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(sqlParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(sqlParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(sqlParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(sqlParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(sqlParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(sqlParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(sqlParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(sqlParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#order}.
	 * @param ctx the parse tree
	 */
	void enterOrder(sqlParser.OrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#order}.
	 * @param ctx the parse tree
	 */
	void exitOrder(sqlParser.OrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#by}.
	 * @param ctx the parse tree
	 */
	void enterBy(sqlParser.ByContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#by}.
	 * @param ctx the parse tree
	 */
	void exitBy(sqlParser.ByContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#asc}.
	 * @param ctx the parse tree
	 */
	void enterAsc(sqlParser.AscContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#asc}.
	 * @param ctx the parse tree
	 */
	void exitAsc(sqlParser.AscContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#desc}.
	 * @param ctx the parse tree
	 */
	void enterDesc(sqlParser.DescContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#desc}.
	 * @param ctx the parse tree
	 */
	void exitDesc(sqlParser.DescContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#into}.
	 * @param ctx the parse tree
	 */
	void enterInto(sqlParser.IntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#into}.
	 * @param ctx the parse tree
	 */
	void exitInto(sqlParser.IntoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code values}
	 * labeled alternative in {@link sqlParser#constraintTypeconstraintTypeconstraintType}.
	 * @param ctx the parse tree
	 */
	void enterValues(sqlParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code values}
	 * labeled alternative in {@link sqlParser#constraintTypeconstraintTypeconstraintType}.
	 * @param ctx the parse tree
	 */
	void exitValues(sqlParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#tables}.
	 * @param ctx the parse tree
	 */
	void enterTables(sqlParser.TablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#tables}.
	 * @param ctx the parse tree
	 */
	void exitTables(sqlParser.TablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(sqlParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(sqlParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(sqlParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(sqlParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#column_terminal}.
	 * @param ctx the parse tree
	 */
	void enterColumn_terminal(sqlParser.Column_terminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#column_terminal}.
	 * @param ctx the parse tree
	 */
	void exitColumn_terminal(sqlParser.Column_terminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#column_terminal_plural}.
	 * @param ctx the parse tree
	 */
	void enterColumn_terminal_plural(sqlParser.Column_terminal_pluralContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#column_terminal_plural}.
	 * @param ctx the parse tree
	 */
	void exitColumn_terminal_plural(sqlParser.Column_terminal_pluralContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(sqlParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(sqlParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(sqlParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(sqlParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(sqlParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(sqlParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#sql2003Parser}.
	 * @param ctx the parse tree
	 */
	void enterSql2003Parser(sqlParser.Sql2003ParserContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#sql2003Parser}.
	 * @param ctx the parse tree
	 */
	void exitSql2003Parser(sqlParser.Sql2003ParserContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#sql_executable_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_executable_statement(sqlParser.Sql_executable_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#sql_executable_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_executable_statement(sqlParser.Sql_executable_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#sql_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_schema_statement(sqlParser.Sql_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#sql_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_schema_statement(sqlParser.Sql_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#sql_schema_definition_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_schema_definition_statement(sqlParser.Sql_schema_definition_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#sql_schema_definition_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_schema_definition_statement(sqlParser.Sql_schema_definition_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#sql_schema_manipulation_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_schema_manipulation_statement(sqlParser.Sql_schema_manipulation_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#sql_schema_manipulation_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_schema_manipulation_statement(sqlParser.Sql_schema_manipulation_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#sql_data_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_data_statement(sqlParser.Sql_data_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#sql_data_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_data_statement(sqlParser.Sql_data_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#schema_definition}.
	 * @param ctx the parse tree
	 */
	void enterSchema_definition(sqlParser.Schema_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#schema_definition}.
	 * @param ctx the parse tree
	 */
	void exitSchema_definition(sqlParser.Schema_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#table_definition}.
	 * @param ctx the parse tree
	 */
	void enterTable_definition(sqlParser.Table_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#table_definition}.
	 * @param ctx the parse tree
	 */
	void exitTable_definition(sqlParser.Table_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#column_or_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_or_constraint(sqlParser.Column_or_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#column_or_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_or_constraint(sqlParser.Column_or_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#drop_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_schema_statement(sqlParser.Drop_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#drop_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_schema_statement(sqlParser.Drop_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#alter_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_statement(sqlParser.Alter_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#alter_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_statement(sqlParser.Alter_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#drop_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_statement(sqlParser.Drop_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#drop_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_statement(sqlParser.Drop_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#alter_database_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database_statement(sqlParser.Alter_database_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#alter_database_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database_statement(sqlParser.Alter_database_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#show_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterShow_schema_statement(sqlParser.Show_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#show_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitShow_schema_statement(sqlParser.Show_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#use_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterUse_schema_statement(sqlParser.Use_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#use_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitUse_schema_statement(sqlParser.Use_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(sqlParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(sqlParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#tipo_literal}.
	 * @param ctx the parse tree
	 */
	void enterTipo_literal(sqlParser.Tipo_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#tipo_literal}.
	 * @param ctx the parse tree
	 */
	void exitTipo_literal(sqlParser.Tipo_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(sqlParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(sqlParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constraintPrimaryKey}
	 * labeled alternative in {@link sqlParser#constraintType}.
	 * @param ctx the parse tree
	 */
	void enterConstraintPrimaryKey(sqlParser.ConstraintPrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constraintPrimaryKey}
	 * labeled alternative in {@link sqlParser#constraintType}.
	 * @param ctx the parse tree
	 */
	void exitConstraintPrimaryKey(sqlParser.ConstraintPrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constraintForeignKey}
	 * labeled alternative in {@link sqlParser#constraintType}.
	 * @param ctx the parse tree
	 */
	void enterConstraintForeignKey(sqlParser.ConstraintForeignKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constraintForeignKey}
	 * labeled alternative in {@link sqlParser#constraintType}.
	 * @param ctx the parse tree
	 */
	void exitConstraintForeignKey(sqlParser.ConstraintForeignKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constraintCheck}
	 * labeled alternative in {@link sqlParser#constraintType}.
	 * @param ctx the parse tree
	 */
	void enterConstraintCheck(sqlParser.ConstraintCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constraintCheck}
	 * labeled alternative in {@link sqlParser#constraintType}.
	 * @param ctx the parse tree
	 */
	void exitConstraintCheck(sqlParser.ConstraintCheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#num_or_id}.
	 * @param ctx the parse tree
	 */
	void enterNum_or_id(sqlParser.Num_or_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#num_or_id}.
	 * @param ctx the parse tree
	 */
	void exitNum_or_id(sqlParser.Num_or_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(sqlParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(sqlParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(sqlParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(sqlParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#rename_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterRename_table_statement(sqlParser.Rename_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#rename_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitRename_table_statement(sqlParser.Rename_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#accion}.
	 * @param ctx the parse tree
	 */
	void enterAccion(sqlParser.AccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#accion}.
	 * @param ctx the parse tree
	 */
	void exitAccion(sqlParser.AccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#show_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterShow_table_statement(sqlParser.Show_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#show_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitShow_table_statement(sqlParser.Show_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#show_column_statement}.
	 * @param ctx the parse tree
	 */
	void enterShow_column_statement(sqlParser.Show_column_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#show_column_statement}.
	 * @param ctx the parse tree
	 */
	void exitShow_column_statement(sqlParser.Show_column_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#insert_value}.
	 * @param ctx the parse tree
	 */
	void enterInsert_value(sqlParser.Insert_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#insert_value}.
	 * @param ctx the parse tree
	 */
	void exitInsert_value(sqlParser.Insert_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#insert_column_names}.
	 * @param ctx the parse tree
	 */
	void enterInsert_column_names(sqlParser.Insert_column_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#insert_column_names}.
	 * @param ctx the parse tree
	 */
	void exitInsert_column_names(sqlParser.Insert_column_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(sqlParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(sqlParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#relational}.
	 * @param ctx the parse tree
	 */
	void enterRelational(sqlParser.RelationalContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#relational}.
	 * @param ctx the parse tree
	 */
	void exitRelational(sqlParser.RelationalContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#update_value}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_value(sqlParser.Update_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#update_value}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_value(sqlParser.Update_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#delete_value}.
	 * @param ctx the parse tree
	 */
	void enterDelete_value(sqlParser.Delete_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#delete_value}.
	 * @param ctx the parse tree
	 */
	void exitDelete_value(sqlParser.Delete_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#select_value}.
	 * @param ctx the parse tree
	 */
	void enterSelect_value(sqlParser.Select_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#select_value}.
	 * @param ctx the parse tree
	 */
	void exitSelect_value(sqlParser.Select_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(sqlParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(sqlParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#list_values}.
	 * @param ctx the parse tree
	 */
	void enterList_values(sqlParser.List_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#list_values}.
	 * @param ctx the parse tree
	 */
	void exitList_values(sqlParser.List_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(sqlParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(sqlParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(sqlParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(sqlParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(sqlParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(sqlParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(sqlParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(sqlParser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#float_literal}.
	 * @param ctx the parse tree
	 */
	void enterFloat_literal(sqlParser.Float_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#float_literal}.
	 * @param ctx the parse tree
	 */
	void exitFloat_literal(sqlParser.Float_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void enterDate_literal(sqlParser.Date_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void exitDate_literal(sqlParser.Date_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void enterChar_literal(sqlParser.Char_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void exitChar_literal(sqlParser.Char_literalContext ctx);
}