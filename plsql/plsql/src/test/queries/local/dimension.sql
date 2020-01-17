CREATE PROCEDURE P_PROCEDUER() 
	DECLARE  
		_sql VARCHAR;
		_rec VARCHAR;
		_telphone VARCHAR;
		_identify VARCHAR;
		_dimension_id VARCHAR :='ei123456789';
		_batch VARCHAR :='batch1';
		_fuhao VARCHAR := ' '' ';
		_ruleId VARCHAR :='rule_id_001';
		
	BEGIN
		FOR item IN
		(
			select telphone, identify from auto_ei_mid_people where telphone is not null
		) 
		LOOP
			IF 11 < LEN(item.telphone) THEN
				PRINT(LEN(item.telphone));
				
				_telphone := item.telphone;
				_identify := item.identify;
				PRINT(_fuhao);
				PRINT(_telphone);
				PRINT(_identify);
				
				_sql := ' UPDATE  auto_ei_mid_people SET  telphone = subString(trim(' + _fuhao + item.telphone + _fuhao + '),1,11) WHERE identify =  trim(' + _fuhao + item.identify + _fuhao +');' ;
				
				PRINT(_sql);
				EXEC _sql;
				
				_rec := ' UPDATE  auto_ei_mid_people SET  telphone = subString(#' + _telphone + '#,1,11) WHERE identify =  #' + _identify + '#;' ;
 				
				
				EXEC ' SELECT ei_record_sql('' '+_dimension_id+' '', '' '+_batch+' '', '' '+_ruleId+' '', '' '+_rec+' ''); ' ;
			END IF;
		END LOOP;
		
		COMMIT;
	END;
  	
	CALL P_PROCEDUER();