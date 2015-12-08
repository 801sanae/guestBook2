package com.hanains.guestbook2.http.action;

import com.hanains.http.action.Action;
import com.hanains.http.action.ActionFactory;

public class GuestBookActionFactory extends ActionFactory{

	@Override
	public Action getAction(String actionName) {
		Action action =null;
		if("insert".equals(actionName)){
			action = new InsertAction();
		}else if("form".equals(actionName)){
			action = new FormAction();
		}else if("delete".equals(actionName)){
			action = new DeleteAction();
		}else{
			action = new IndexAction();
		}
		
		return action;
	}

}
