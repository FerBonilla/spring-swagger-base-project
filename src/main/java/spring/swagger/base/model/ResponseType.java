package spring.swagger.base.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ApiModel(description = "Example POJO. Can be used as common response for succesful calls")
@Data
@ToString
@AllArgsConstructor
public class ResponseType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3696954245356014750L;

	@ApiModelProperty(value = "HTTP status", required = false)
	private int status;

	@ApiModelProperty(value = "Example object usage", required = false)
	private Object response;

}
