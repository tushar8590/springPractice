package com.springaction.springidol;

public class Sonnet29 implements Poem {

	public Sonnet29() {
		// TODO Auto-generated constructor stub
	}
	private static String[]LINES={
			"When,indisgracewithfortuneandmen'seyes,",
			"Iallalonebeweepmyoutcaststate",
			"Andtroubledeafheavenwithmybootlesscries",
			"Andlookuponmyselfandcursemyfate,",
			"Wishingmeliketoonemorerichinhope,",
			"Featuredlikehim,likehimwithfriendspossess'd,",
			"Desiringthisman'sartandthatman'sscope,",
			"WithwhatImostenjoycontentedleast;",
			"Yetinthesethoughtsmyselfalmostdespising,",
			"HaplyIthinkonthee,andthenmystate,",
			"Liketothelarkatbreakofdayarising",
			"Fromsullenearth,singshymnsatheaven'sgate;",
			"Forthysweetloveremember'dsuchwealthbrings",
			"ThatthenIscorntochangemystatewithkings."};
	public void recite() {
		for(int i=0;i< LINES.length;i++){
			System.out.println(LINES[i]);
			}

	}

}
