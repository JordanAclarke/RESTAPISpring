package com.jordan.app.ws.userservice;

import com.jordan.app.ws.ui.model.request.UserDetailsRequestModel;
import com.jordan.app.ws.ui.model.response.UserRest;

public interface UserService {

	UserRest createUser(UserDetailsRequestModel userDetails);
}
