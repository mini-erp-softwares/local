package com.ent.mini.erp.model;

public enum XPlantMatlStatus {
	
	N01 ,//Blocked procmnt/OK MPS
	N02 ,//Blocked mat.mvmt./Q.A.
	N03 ,//Blocked procmnt/No MPS
	DD ,//Don't Delete
	DP ,//Discrete ordering only
	KA ,//Blocked for Costing
	Z0 ,//Block Z0- QM/WHSE/MFG
	Z1 ,//Blocked QI/IM/WMS
	Z2 ,//BLOCKED FOR MPS
	Z3 ,//BLOCKED FOR procurement
	Z4 ,//Blocked Cst/Prcmnt/No MPS
	Z5 ,//Only MRP/MPS OK
	Z6 ,//Blocked Forecast
	Z7 ,//Blocked FORECAST/PRD/CST
	Z8 ,//BLOCKED procure/costing
	Z9 ,//Blocked QI/IM/WMS/PUR
	ZC ,//Blocked for Posting
	ZG ,//GTS Block
	ZK ,//Blocked QI/IM/WMS/PRD/CST
	ZL ,//Blocked Pur/Frcst/Prod
	ZM ,//All Transactions Blocked
	ZP ,//Block Production & MRP
	ZQ ,//Block for Production
	ZS ,//Blocked QI/IM/WMS/PRD
	ZW //BoMRcpPlngCost In Progres

}
