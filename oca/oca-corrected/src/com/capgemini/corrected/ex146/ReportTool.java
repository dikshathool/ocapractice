package com.capgemini.corrected.ex146;

public class ReportTool extends Tool {
	void export() {
		System.out.println("RTool::export");
	}
	public static void main(String[] args) {
		Tool aTool = new ReportTool();
		Tool bTool = new Tool();
		callExport(aTool);
		callExport(bTool);
	}
	
	public static void callExport(Exportable ex) {
		ex.export();
	}
}
