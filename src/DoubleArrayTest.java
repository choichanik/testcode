public class DoubleArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] UseIncreamentTable = {
				{"sjcodehistory","id"},
				{"closing_log","closing_log_id"},
				{"cashaccountledger","id"},
				{"accountledger","id"},
				{"bank_account_data","data_ID"},
				{"trashbox","id"},
				{"evat_xml_received","ID"},
				{"vatfixedassetinvestplan","id"},
				{"bad_debt_tax_dedu","id"},
				{"junpyodocument","id"},
				{"junpyodoc_groupdl_info","GroupDLID"},
				{"ifrs_issue","ifrs_issue_id"},
				{"sales_creditcard_data","Data_ID"},
				{"crefia_card","Data_ID"},
				{"ti_mail_received","mail_id"},
				{"ti_mailing","id"},
				{"ti_buy_received","ti_buy_id"},
				{"ti_buy_send","ti_buy_id"},
				{"t_withheldtax","id"},
				{"t_taxgl","id"},
				{"history_gl_change","history_id"},
				{"history_junpyo_change","history_id"}
		};
		
		for(int i=0 ; i<UseIncreamentTable.length ; i++) {
			/*if(IBF.equals(p_table, UseIncreamentTable[i][0])) {
				
			}
			*/
			
			System.out.println(UseIncreamentTable[i][0]);
		}
	}

}
