/**
 * 
 */
package com.github.yzh179954.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.github.yzh179954.bean.User;
import com.github.yzh179954.protobuff.Message.Person;
import com.sun.istack.logging.Logger;

/**
 * @author  zhihuayang E-mail:425273175@qq.com 
 * @date 创建时间：2016年5月25日 上午9:57:52
 * @version 1.0 
 * @parameter  
 * @return  
*/
/**
 * @author lenovo
 *
 */
@Path("/protobuff")
public class ProtobuffController {
	
	private static Logger log=Logger.getLogger(ProtobuffController.class);

 @GET
// @Produces(MediaType.APPLICATION_JSON)
 @Produces("application/x-protobuf")
 public Person get(){
	Person person=Person.newBuilder()
					.setEmail("425273175@qq.com")
					.setId(10)
					.setName("yangzhihua")
					.addPhone(Person.PhoneNumber.newBuilder()
								.setNumber("186")
						        .setType(Person.PhoneType.HOME).build()).build();
			
	return  person; 
 }
 
 @POST
 @Produces("application/x-protobuf")
 @Consumes("application/x-protobuf")
 public Person post(Person person){
	 return person;
 }
}
